package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: Atomic.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000R\u001a\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lea7;", "", "affected", c.a, "", "toString", "that", "", "b", "Luy;", "a", "()Luy;", "atomicOp", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: ea7  reason: default package */
/* loaded from: classes3.dex */
public abstract class ea7 {
    public abstract uy<?> a();

    public final boolean b(ea7 ea7Var) {
        uy<?> a;
        uy<?> a2 = a();
        if (a2 == null || (a = ea7Var.a()) == null || a2.g() >= a.g()) {
            return false;
        }
        return true;
    }

    public abstract Object c(Object obj);

    public String toString() {
        return jo2.a(this) + '@' + jo2.b(this);
    }
}
