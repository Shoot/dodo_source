package androidx.compose.ui.semantics;

import kotlin.Metadata;
/* compiled from: SemanticsModifier.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/semantics/EmptySemanticsElement;", "Lfn6;", "Lrg3;", "t", "node", "", "u", "", "hashCode", "", "other", "", "equals", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class EmptySemanticsElement extends fn6<rg3> {
    public static final EmptySemanticsElement c = new EmptySemanticsElement();

    private EmptySemanticsElement() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // defpackage.fn6
    /* renamed from: t */
    public rg3 o() {
        return new rg3();
    }

    @Override // defpackage.fn6
    /* renamed from: u */
    public void s(rg3 rg3Var) {
        z65.h(rg3Var, "node");
    }
}
