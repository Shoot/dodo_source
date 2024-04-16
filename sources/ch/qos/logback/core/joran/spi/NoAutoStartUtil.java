package ch.qos.logback.core.joran.spi;
/* loaded from: classes.dex */
public class NoAutoStartUtil {
    public static boolean notMarkedWithNoAutoStart(Object obj) {
        if (obj == null || ((NoAutoStart) obj.getClass().getAnnotation(NoAutoStart.class)) != null) {
            return false;
        }
        return true;
    }
}
