package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: AndroidThreeTen.java */
/* renamed from: aj  reason: default package */
/* loaded from: classes3.dex */
public final class aj {
    private static final AtomicBoolean a = new AtomicBoolean();

    public static void a(Context context) {
        b(context, "org/threeten/bp/TZDB.dat");
    }

    public static void b(Context context, String str) {
        if (!a.getAndSet(true)) {
            bdc.c(new ms(context, str));
        }
    }
}
