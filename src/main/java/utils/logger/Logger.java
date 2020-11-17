package utils.logger;

import org.apache.log4j.Level;

public class Logger {

    private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getRootLogger();

    /**
     * Logs fatal level message
     * @param message - message
     */
    public static final void fatal(String message) {
        logger.fatal(message);
    }

    /**
     * Logs error level message
     * @param message - message
     */
    public static final void error(String message) {
        logger.error(message);
    }

    /**
     * Logs warning level message
     * @param message - message
     */
    public static final void warn(String message) {
        logger.warn(message);
    }

    /**
     * Logs info level message
     * @param message - message
     */
    public static final void info(String message) {
        logger.info(message);
    }

    /**
     * Logs debug level message
     * @param message - message
     */
    public static final void debug(String message) {
        logger.debug(message);
    }

    /**
     * Shutdown
     */
    public static void shutdown() {
        org.apache.log4j.LogManager.shutdown();
    }

    /**
     * Logs screenshot level message
     * @param message
     */
    public static final void screenshot(String message) {
        logger.log(LoggerLevel.SCREENSHOT, message);
    }

    /**
     * Logs URL level message
     * @param message
     */
    public static final void url(String message) {
        logger.log(LoggerLevel.URL, message);
    }

    /**
     * Set logger level
     * @param severity - the loggerLevel to set
     * 0 - all
     * 1 - debug
     * 2 - info
     * 3 - warn
     * 4 - error
     * 5 - fatal
     * 6 - off
     */
    public static void setLoggerLevel(int severity) {
        Level loggerLevel;
        switch (severity) {
            case 0:
                loggerLevel = LoggerLevel.ALL;
                break;
            case 1:
                loggerLevel = LoggerLevel.DEBUG;
                break;
            case 2:
            default:
                loggerLevel = LoggerLevel.INFO;
                break;
            case 3:
                loggerLevel = LoggerLevel.WARN;
                break;
            case 4:
                loggerLevel = LoggerLevel.ERROR;
                break;
            case 5:
                loggerLevel = LoggerLevel.FATAL;
                break;
            case 6:
                loggerLevel = LoggerLevel.OFF;
                break;
        }

        logger.setLevel(loggerLevel);
    }
}
