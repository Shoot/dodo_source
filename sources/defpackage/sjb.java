package defpackage;

import android.os.Trace;
import androidx.annotation.NonNull;
/* compiled from: TraceApi18Impl.java */
/* renamed from: sjb  reason: default package */
/* loaded from: classes.dex */
final class sjb {
    public static void a(@NonNull String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
