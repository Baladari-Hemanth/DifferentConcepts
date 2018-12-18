package Topics;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

public class log4j {
	
	@Test
	public void log4jConfiguration() {
		
		//Create a log4j.properties file.
		//To initiate logger below 2 lines are needed
		Logger logger=Logger.getLogger("My_Own_Project");
		PropertyConfigurator.configure("log4j.properties");
		
		//Below are the some log4j methods
		logger.info("loging in");
		logger.error("error");
		logger.debug("test1");
	}

}
