package defpackage;

import defpackage.sk9;
import kotlin.Metadata;
/* compiled from: Result.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u001a\u0017\u0010\u0006\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "exception", "", "a", "Lsk9;", "", "b", "(Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
/* renamed from: vk9  reason: default package */
/* loaded from: classes3.dex */
public final class vk9 {
    public static final Object a(Throwable th) {
        z65.h(th, "exception");
        return new sk9.b(th);
    }

    public static final void b(Object obj) {
        if (!(obj instanceof sk9.b)) {
            return;
        }
        throw ((sk9.b) obj).a;
    }
}
