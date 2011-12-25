package us.feras.mdv.util;

import java.util.List;
import java.util.Set;
import java.util.Map.Entry;

/**
 * @author Feras Alnatsheh
 */
public class Response {

	private Set<Entry<String, List<String>>> httpResponseHeader;
	private int httpResponseCode;
	private String httpResponseMessage;
	private String serverResponseMessage;

	Response() {
	}

	Response(Set<Entry<String, List<String>>> httpResponseHeader, int httpResponseCode, String httpResponseMessage, String responseMessage) {
		setHttpResponseHeader(httpResponseHeader);
		setHttpResponseCode(httpResponseCode);
		setHttpResponseMessage(httpResponseMessage);
		setResponseMessage(responseMessage);
	}

	public String getHttpResponseMessage() {
		return httpResponseMessage;
	}

	public void setHttpResponseMessage(String httpResponseMessage) {
		this.httpResponseMessage = httpResponseMessage;
	}

	public Set<Entry<String, List<String>>> getHttpResponseHeader() {
		return httpResponseHeader;
	}

	public void setHttpResponseHeader(Set<Entry<String, List<String>>> httpResponseHeader) {
		this.httpResponseHeader = httpResponseHeader;
	}

	public int getHttpResponseCode() {
		return httpResponseCode;
	}

	public void setHttpResponseCode(int httpResponseCode) {
		this.httpResponseCode = httpResponseCode;
	}

	public String getResponseMessage() {
		return serverResponseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.serverResponseMessage = responseMessage;
	}

	public String toString() {
		return "httpResponseCode = " + httpResponseCode + " , " + "httpResponseMessage = " + httpResponseMessage + " , " + "serverResponseMessage = " + serverResponseMessage;
	}

}
