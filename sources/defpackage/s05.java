package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: Indication.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0016R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Ls05;", "Lt73;", "Lit1;", "", "q", "Lq05;", c.a, "Lq05;", "getIndicationInstance", "()Lq05;", "indicationInstance", "<init>", "(Lq05;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: s05  reason: default package */
/* loaded from: classes.dex */
final class s05 implements t73 {
    private final q05 c;

    public s05(q05 q05Var) {
        z65.h(q05Var, "indicationInstance");
        this.c = q05Var;
    }

    @Override // defpackage.sm6
    public /* synthetic */ sm6 f(sm6 sm6Var) {
        return rm6.a(this, sm6Var);
    }

    @Override // defpackage.sm6
    public /* synthetic */ Object h(Object obj, Function2 function2) {
        return tm6.b(this, obj, function2);
    }

    @Override // defpackage.sm6
    public /* synthetic */ boolean i(Function1 function1) {
        return tm6.a(this, function1);
    }

    @Override // defpackage.t73
    public void q(it1 it1Var) {
        z65.h(it1Var, "<this>");
        this.c.a(it1Var);
    }
}
