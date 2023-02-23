package rest.publicapi.logs;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class RestLogger {
	
	public static Logger getRestLogger() {
		
		Logger log = Logger.getLogger(RestLogger.class.getName());
		DOMConfigurator.configure("D:\\projects\\rest-api-publicapi-restassured\\src\\test\\resources\\log4j.xml");
		return log;
	}

}
