package defpackage;

import android.content.Context;
import ch.qos.logback.classic.pattern.CallerDataConverter;
import java.io.File;
/* compiled from: RealmCore.java */
/* renamed from: e89  reason: default package */
/* loaded from: classes3.dex */
public class e89 {
    private static final String a;
    private static final String b;
    private static final String c;
    private static boolean d;

    static {
        String str = File.separator;
        a = str;
        String str2 = File.pathSeparator;
        b = str2;
        c = "lib" + str2 + CallerDataConverter.DEFAULT_RANGE_DELIMITER + str + "lib";
        d = false;
    }

    public static synchronized void a(Context context) {
        synchronized (e89.class) {
            if (d) {
                return;
            }
            g79.a(context, "realm-jni", "10.17.0");
            d = true;
        }
    }
}
