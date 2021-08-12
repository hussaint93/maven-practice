package app1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//Low->>>>high priority
//Log levels : T- trace,D-debugger,I-info,W-warn,E-error,F-fatal
public class LoggingDemo {
	private static Logger logger = LogManager.getLogger(LoggingDemo.class);
	public static void main(String[] args) {
		logger.debug("this is a debug message");
		logger.info("nfo message");
		logger.error("exception message");
		logger.warn("warning message");
		logger.fatal("fatal message");
		logger.trace("trace message");
	}
}
