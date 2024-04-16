package defpackage;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: DateTimeTextProvider.java */
/* renamed from: fn2  reason: default package */
/* loaded from: classes3.dex */
public abstract class fn2 {
    private static final AtomicReference<fn2> a = new AtomicReference<>();

    /* compiled from: DateTimeTextProvider.java */
    /* renamed from: fn2$a */
    /* loaded from: classes3.dex */
    static class a {
        static final fn2 a = a();

        static fn2 a() {
            ho1.a(fn2.a, null, new bla());
            return (fn2) fn2.a.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static fn2 b() {
        return a.a;
    }

    public abstract String c(u8b u8bVar, long j, scb scbVar, Locale locale);

    public abstract Iterator<Map.Entry<String, Long>> d(u8b u8bVar, scb scbVar, Locale locale);
}
