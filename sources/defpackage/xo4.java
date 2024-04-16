package defpackage;

import defpackage.gb;
import defpackage.sm6;
import kotlin.Metadata;
/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lxo4;", "Lwq7;", "Lsm6$c;", "La03;", "", "parentData", "Ljp9;", "f1", "Lgb$b;", "n", "Lgb$b;", "getHorizontal", "()Lgb$b;", "g1", "(Lgb$b;)V", "horizontal", "<init>", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: xo4  reason: default package */
/* loaded from: classes.dex */
public final class xo4 extends sm6.c implements wq7 {
    private gb.b n;

    public xo4(gb.b bVar) {
        z65.h(bVar, "horizontal");
        this.n = bVar;
    }

    @Override // defpackage.wq7
    /* renamed from: f1 */
    public jp9 d(a03 a03Var, Object obj) {
        jp9 jp9Var;
        z65.h(a03Var, "<this>");
        if (obj instanceof jp9) {
            jp9Var = (jp9) obj;
        } else {
            jp9Var = null;
        }
        if (jp9Var == null) {
            jp9Var = new jp9(0.0f, false, null, 7, null);
        }
        jp9Var.d(v22.a.a(this.n));
        return jp9Var;
    }

    public final void g1(gb.b bVar) {
        z65.h(bVar, "<set-?>");
        this.n = bVar;
    }
}
