package utils.logger;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Level;

public class LoggerLevel extends Level {



    /**
     *
     */
    private static final long serialVersionUID = 4926154909916134477L;

    private static final Map<Integer, LoggerLevel> LOGGER_LEVELS;

    static {
        LOGGER_LEVELS = Collections
                .synchronizedMap(new HashMap<Integer, LoggerLevel>());
    }

    public final static int SCREENSHOT_INT = FATAL_INT - 16;

    public final static int URL_INT = FATAL_INT - 16;

    public final static Level SCREENSHOT = new LoggerLevel(SCREENSHOT_INT,
            "SCREENSHOT", 0);

    public final static Level URL = new LoggerLevel(URL_INT,
            "URL", 0);

    /**
     * Adds logger level to existing levels list
     * @param level - level
     * @param levelStr - level name
     * @param syslogEquivalent - system log equivalent
     */
    protected LoggerLevel(int level, String levelStr, int syslogEquivalent) {
        super(level, levelStr, syslogEquivalent);
        LOGGER_LEVELS.put(level, this);
    }

}
