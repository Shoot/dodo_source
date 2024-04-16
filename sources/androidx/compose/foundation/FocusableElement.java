package androidx.compose.foundation;

import kotlin.Metadata;
/* compiled from: Focusable.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/FocusableElement;", "Lfn6;", "Landroidx/compose/foundation/k;", "t", "node", "", "u", "", "other", "", "equals", "", "hashCode", "Loq6;", com.huawei.hms.opendevice.c.a, "Loq6;", "interactionSource", "<init>", "(Loq6;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FocusableElement extends fn6<k> {
    private final oq6 c;

    public FocusableElement(oq6 oq6Var) {
        this.c = oq6Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof FocusableElement) && z65.c(this.c, ((FocusableElement) obj).c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        oq6 oq6Var = this.c;
        if (oq6Var != null) {
            return oq6Var.hashCode();
        }
        return 0;
    }

    @Override // defpackage.fn6
    /* renamed from: t */
    public k o() {
        return new k(this.c);
    }

    @Override // defpackage.fn6
    /* renamed from: u */
    public void s(k kVar) {
        z65.h(kVar, "node");
        kVar.l1(this.c);
    }
}
