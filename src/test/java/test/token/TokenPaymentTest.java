package test.token;

import java.net.URL;

import org.apache.ws.security.handler.WSHandlerConstants;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cybersource.stub.CCAuthService;
import com.cybersource.stub.CCCaptureService;
import com.cybersource.stub.ITransactionProcessorStub;
import com.cybersource.stub.InvoiceHeader;
import com.cybersource.stub.PurchaseTotals;
import com.cybersource.stub.RecurringSubscriptionInfo;
import com.cybersource.stub.ReplyMessage;
import com.cybersource.stub.RequestMessage;
import com.cybersource.stub.TransactionProcessorLocator;

import test.CyberSourceBaseTest;

public class TokenPaymentTest extends CyberSourceBaseTest {

	private static final Logger log = LoggerFactory.getLogger(TokenPaymentTest.class);

	@Test
	@Ignore
	public void shouldPaymentTokenSuccess() throws Exception {

		String merchantDescriptor = "BAY Payment"; // invoice_header_merchantDescriptor
		String subscriptionID = "5283676744016978203012"; // Reference to created subscriptionID

		log.debug("*** ENVIRONMENT : {} => {}", ENV, SERVER_URL);
		log.debug("merchant Id     : {}", MERCHANT_ID);

		RequestMessage request = new RequestMessage();
		request.setMerchantID(MERCHANT_ID);

		// Before using this example, replace the generic value with
		// your reference number for the current transaction.
		request.setMerchantReferenceCode("T" + new java.util.Date().getTime());
		String reconciliationID = request.getMerchantReferenceCode(); // TODO: for reconcile report

		// To help us troubleshoot any problems that you may encounter,
		// please include the following information about your application.
		request.setClientLibrary("Java Axis WSS4J");
		request.setClientLibraryVersion(LIB_VERSION);
		request.setClientEnvironment(getEnvInformation());

		CCAuthService ccAuthService = new CCAuthService();
		ccAuthService.setRun("true");
		ccAuthService.setReconciliationID(reconciliationID);
		request.setCcAuthService(ccAuthService);

		request.setCcCaptureService(new CCCaptureService());
		request.getCcCaptureService().setRun("true");

		InvoiceHeader invoiceHeader = new InvoiceHeader();
		invoiceHeader.setMerchantDescriptor(merchantDescriptor);
		request.setInvoiceHeader(invoiceHeader);

		PurchaseTotals purchaseTotals = new PurchaseTotals();
		purchaseTotals.setCurrency("THB");
		purchaseTotals.setGrandTotalAmount("1234.50");
		request.setPurchaseTotals(purchaseTotals);

		RecurringSubscriptionInfo recurringSubscriptionInfo = new RecurringSubscriptionInfo();
		recurringSubscriptionInfo.setSubscriptionID(subscriptionID);
		request.setRecurringSubscriptionInfo(recurringSubscriptionInfo);

		try {

			URL endpoint = new URL(SERVER_URL);
			TransactionProcessorLocator service = new TransactionProcessorLocator();
			ITransactionProcessorStub stub = (ITransactionProcessorStub) service.getportXML(endpoint);
			stub._setProperty(WSHandlerConstants.USER, request.getMerchantID());

			ReplyMessage reply = stub.runTransaction(request);

			// To retrieve individual reply fields, follow these examples.
			log.debug("decision        : {}", reply.getDecision());
			log.debug("reasonCode      : {}", reply.getReasonCode());
			log.debug("requestID       : {}", reply.getRequestID());

			if ("100".equals(reply.getReasonCode().toString())) {
				log.debug("auth.reasonCode : {}", reply.getCcAuthReply().getReasonCode());
				log.debug("TOKEN PAYMENT SUCCESS");
			} else {
				log.debug("TOKEN PAYMENT FAIL");
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			log.error("ERROR: {}", ex.getMessage());
		}
	}
}
