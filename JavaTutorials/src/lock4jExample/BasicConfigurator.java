package lock4jExample;

import org.apache.log4j.Logger;

public class BasicConfigurator {
	
	static Logger logger=Logger.getLogger(org.apache.log4j.BasicConfigurator.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicConfigurator.configure();
		
logger.debug("this is debug");
logger.info("this is info message");
logger.warn("This is a warning message");
logger.error("This is a error message");
logger.fatal("this is a fatal");
		
		
		
		
		
		
		
		
		
		
		
		
	}

	private static void configure() {
		// TODO Auto-generated method stub
		
	}

}
