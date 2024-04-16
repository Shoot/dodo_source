package androidx.compose.foundation.layout;

import defpackage.gb;
import kotlin.Metadata;
/* compiled from: RowColumnImpl.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/layout/HorizontalAlignElement;", "Lfn6;", "Lxo4;", "t", "node", "", "u", "", "hashCode", "", "other", "", "equals", "Lgb$b;", com.huawei.hms.opendevice.c.a, "Lgb$b;", "getHorizontal", "()Lgb$b;", "horizontal", "<init>", "(Lgb$b;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class HorizontalAlignElement extends fn6<xo4> {
    private final gb.b c;

    public HorizontalAlignElement(gb.b bVar) {
        z65.h(bVar, "horizontal");
        this.c = bVar;
    }

    public boolean equals(Object obj) {
        HorizontalAlignElement horizontalAlignElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof HorizontalAlignElement) {
            horizontalAlignElement = (HorizontalAlignElement) obj;
        } else {
            horizontalAlignElement = null;
        }
        if (horizontalAlignElement == null) {
            return false;
        }
        return z65.c(this.c, horizontalAlignElement.c);
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.fn6
    /* renamed from: t */
    public xo4 o() {
        return new xo4(this.c);
    }

    @Override // defpackage.fn6
    /* renamed from: u */
    public void s(xo4 xo4Var) {
        z65.h(xo4Var, "node");
        xo4Var.g1(this.c);
    }
}
