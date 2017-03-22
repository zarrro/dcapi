package clinic.dermal.logic;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InvoiceCounterServiceImpl implements InvoiceCounterService {

	private final Logger LOG = LoggerFactory.getLogger(InvoiceCounterServiceImpl.class);

	private int lastId;
	private String lastIdFile;

	public InvoiceCounterServiceImpl(int lastId, String lastIdFile) {
		this.lastIdFile = lastIdFile;
		this.lastId = lastId;
		LOG.info("InvoiceCounterServiceImpl initialized with lastInvoiceId:" + lastId);
	}

	@Override
	public synchronized String getNextInvoiceId() {

		int nextId = this.lastId + 1;

		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new OutputStreamWriter(
				    new FileOutputStream(this.lastIdFile), "UTF-8"));
			bw.write(String.valueOf(nextId));
			this.lastId = nextId;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		LOG.info("getNextInvoiceId returns: " + this.lastId);
		return String.format("%06d", this.lastId);
	}

}
