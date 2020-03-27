package log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;



public class Log4j {

	private static Logger logger=(Logger) LogManager.getLogger(Log4j.class); 
	public static void main(String[] args) {
           logger.info("Information");
           logger.error("Error");
           logger.fatal("fatal");

	}

}
