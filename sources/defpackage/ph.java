package defpackage;

import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
/* compiled from: AndroidLog.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J3\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0010\u001a\u00020\u0007R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016¨\u0006\u001a"}, d2 = {"Lph;", "", "", "loggerName", DateTokenConverter.CONVERTER_KEY, "logger", RemoteMessageConst.Notification.TAG, "", c.a, "", "logLevel", "message", "", "t", "a", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Throwable;)V", "b", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/logging/Logger;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "configuredLoggers", "", "Ljava/util/Map;", "knownLoggers", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: ph  reason: default package */
/* loaded from: classes3.dex */
public final class ph {
    public static final ph a = new ph();
    private static final CopyOnWriteArraySet<Logger> b = new CopyOnWriteArraySet<>();
    private static final Map<String, String> c;

    static {
        String str;
        Map<String, String> u;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = b77.class.getPackage();
        if (r2 != null) {
            str = r2.getName();
        } else {
            str = null;
        }
        if (str != null) {
            linkedHashMap.put(str, "OkHttp");
        }
        String name = b77.class.getName();
        z65.g(name, "getName(...)");
        linkedHashMap.put(name, "okhttp.OkHttpClient");
        String name2 = aq4.class.getName();
        z65.g(name2, "getName(...)");
        linkedHashMap.put(name2, "okhttp.Http2");
        String name3 = k7b.class.getName();
        z65.g(name3, "getName(...)");
        linkedHashMap.put(name3, "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        u = g86.u(linkedHashMap);
        c = u;
    }

    private ph() {
    }

    private final void c(String str, String str2) {
        Level level;
        Logger logger = Logger.getLogger(str);
        if (b.add(logger)) {
            logger.setUseParentHandlers(false);
            if (Log.isLoggable(str2, 3)) {
                level = Level.FINE;
            } else if (Log.isLoggable(str2, 4)) {
                level = Level.INFO;
            } else {
                level = Level.WARNING;
            }
            logger.setLevel(level);
            logger.addHandler(qh.a);
        }
    }

    private final String d(String str) {
        String Z0;
        String str2 = c.get(str);
        if (str2 == null) {
            Z0 = o0b.Z0(str, 23);
            return Z0;
        }
        return str2;
    }

    public final void a(String str, int i, String str2, Throwable th) {
        int Y;
        int min;
        z65.h(str, "loggerName");
        z65.h(str2, "message");
        String d = d(str);
        if (Log.isLoggable(d, i)) {
            if (th != null) {
                str2 = str2 + '\n' + Log.getStackTraceString(th);
            }
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                Y = m0b.Y(str2, '\n', i2, false, 4, null);
                if (Y == -1) {
                    Y = length;
                }
                while (true) {
                    min = Math.min(Y, i2 + 4000);
                    String substring = str2.substring(i2, min);
                    z65.g(substring, "substring(...)");
                    Log.println(i, d, substring);
                    if (min >= Y) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }

    public final void b() {
        for (Map.Entry<String, String> entry : c.entrySet()) {
            c(entry.getKey(), entry.getValue());
        }
    }
}
