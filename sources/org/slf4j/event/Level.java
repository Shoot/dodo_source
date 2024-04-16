package org.slf4j.event;
/* loaded from: classes3.dex */
public enum Level {
    ERROR(40, "ERROR"),
    WARN(30, "WARN"),
    INFO(20, "INFO"),
    DEBUG(10, "DEBUG"),
    TRACE(0, "TRACE");
    
    private final int levelInt;
    private final String levelStr;

    Level(int i, String str) {
        this.levelInt = i;
        this.levelStr = str;
    }

    public static Level intToLevel(int i) {
        if (i != 0) {
            if (i != 10) {
                if (i != 20) {
                    if (i != 30) {
                        if (i == 40) {
                            return ERROR;
                        }
                        throw new IllegalArgumentException("Level integer [" + i + "] not recognized.");
                    }
                    return WARN;
                }
                return INFO;
            }
            return DEBUG;
        }
        return TRACE;
    }

    public int toInt() {
        return this.levelInt;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.levelStr;
    }
}
