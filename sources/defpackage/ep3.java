package defpackage;

import defpackage.sk9;
import kotlin.Metadata;
/* compiled from: FastServiceLoader.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"", "a", "Z", "()Z", "ANDROID_DETECTED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: ep3  reason: default package */
/* loaded from: classes3.dex */
public final class ep3 {
    private static final boolean a = false;

    static {
        Object b;
        try {
            sk9.a aVar = sk9.b;
            b = sk9.b(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            sk9.a aVar2 = sk9.b;
            b = sk9.b(vk9.a(th));
        }
        sk9.i(b);
    }

    public static final boolean a() {
        return a;
    }
}
