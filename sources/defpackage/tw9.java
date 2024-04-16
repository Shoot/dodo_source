package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
/* compiled from: Scopes.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014J\u0012\u0010\t\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Ltw9;", "T", "Le1;", "Ltx1;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "state", "", "D", "c1", "Lcv1;", c.a, "Lcv1;", "uCont", "getCallerFrame", "()Ltx1;", "callerFrame", "", "y0", "()Z", "isScopedCoroutine", "Ll95;", "g1", "()Ll95;", "parent", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lkotlin/coroutines/CoroutineContext;Lcv1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: tw9  reason: default package */
/* loaded from: classes3.dex */
public class tw9<T> extends e1<T> implements tx1 {
    public final cv1<T> c;

    /* JADX WARN: Multi-variable type inference failed */
    public tw9(CoroutineContext coroutineContext, cv1<? super T> cv1Var) {
        super(coroutineContext, true, true);
        this.c = cv1Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.v95
    public void D(Object obj) {
        cv1 c;
        c = b75.c(this.c);
        o33.c(c, xl1.a(obj, this.c), null, 2, null);
    }

    @Override // defpackage.e1
    protected void c1(Object obj) {
        cv1<T> cv1Var = this.c;
        cv1Var.resumeWith(xl1.a(obj, cv1Var));
    }

    public final l95 g1() {
        y61 s0 = s0();
        if (s0 != null) {
            return s0.getParent();
        }
        return null;
    }

    @Override // defpackage.tx1
    public final tx1 getCallerFrame() {
        cv1<T> cv1Var = this.c;
        if (cv1Var instanceof tx1) {
            return (tx1) cv1Var;
        }
        return null;
    }

    @Override // defpackage.v95
    protected final boolean y0() {
        return true;
    }
}
