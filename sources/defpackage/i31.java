package defpackage;

import android.os.Looper;
import kotlin.Metadata;
/* compiled from: CheckMainThread.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0007¨\u0006\u0002"}, d2 = {"", "a", "flowbinding-common_release"}, k = 2, mv = {1, 5, 1})
/* renamed from: i31  reason: default package */
/* loaded from: classes3.dex */
public final class i31 {
    public static final void a() {
        if (z65.c(Looper.myLooper(), Looper.getMainLooper())) {
            return;
        }
        String name = Thread.currentThread().getName();
        throw new IllegalStateException(("Expected to be called on the main thread but was " + name).toString());
    }
}
