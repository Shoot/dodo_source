package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: CompletableDeferred.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"T", "Ltk1;", "Lsk9;", "result", "", c.a, "(Ltk1;Ljava/lang/Object;)Z", "Ll95;", "parent", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: vk1  reason: default package */
/* loaded from: classes3.dex */
public final class vk1 {
    public static final <T> tk1<T> a(l95 l95Var) {
        return new uk1(l95Var);
    }

    public static /* synthetic */ tk1 b(l95 l95Var, int i, Object obj) {
        if ((i & 1) != 0) {
            l95Var = null;
        }
        return a(l95Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean c(tk1<T> tk1Var, Object obj) {
        Throwable d = sk9.d(obj);
        if (d == null) {
            return tk1Var.K(obj);
        }
        return tk1Var.H(d);
    }
}
