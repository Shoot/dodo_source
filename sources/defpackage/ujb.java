package defpackage;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
/* compiled from: TraceCompat.java */
@Deprecated
/* renamed from: ujb  reason: default package */
/* loaded from: classes.dex */
public final class ujb {
    private static long a;
    private static Method b;
    private static Method c;
    private static Method d;
    private static Method e;

    /* compiled from: TraceCompat.java */
    /* renamed from: ujb$a */
    /* loaded from: classes.dex */
    static class a {
        static void a(String str) {
            Trace.beginSection(str);
        }

        static void b() {
            Trace.endSection();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e2) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e2);
            }
        }
    }

    public static void a(@NonNull String str) {
        a.a(str);
    }

    public static void b() {
        a.b();
    }
}
