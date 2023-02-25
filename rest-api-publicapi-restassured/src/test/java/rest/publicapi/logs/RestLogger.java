package rest.publicapi.logs;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class RestLogger {
	
	public static Logger getRestLogger(Class<?> pClass) {
		
		Logger log = Logger.getLogger(pClass);
		DOMConfigurator.configure("D:\\restapirep\\rest-api-publicapi-restassured\\src\\test\\resources\\log4j.xml");
		return log;
	}

}
