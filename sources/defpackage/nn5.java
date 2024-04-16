package defpackage;

import defpackage.sm6;
import kotlin.Metadata;
/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lnn5;", "Lwq7;", "Lsm6$c;", "La03;", "", "parentData", "Ljp9;", "f1", "", "n", "F", "getWeight", "()F", "h1", "(F)V", "weight", "", "o", "Z", "getFill", "()Z", "g1", "(Z)V", "fill", "<init>", "(FZ)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: nn5  reason: default package */
/* loaded from: classes.dex */
public final class nn5 extends sm6.c implements wq7 {
    private float n;
    private boolean o;

    public nn5(float f, boolean z) {
        this.n = f;
        this.o = z;
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
        jp9Var.f(this.n);
        jp9Var.e(this.o);
        return jp9Var;
    }

    public final void g1(boolean z) {
        this.o = z;
    }

    public final void h1(float f) {
        this.n = f;
    }
}
