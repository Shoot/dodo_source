package defpackage;

import com.huawei.hms.push.e;
import defpackage.sm6;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: FocusedBounds.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0015\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lp24;", "Lsm6$c;", "Lan6;", "Ljg4;", "", "g1", "", "focused", "h1", "Lom5;", MessageAttributes.COORDINATES, e.a, "n", "Z", "isFocused", "o", "Lom5;", "layoutCoordinates", "Lkotlin/Function1;", "f1", "()Lkotlin/jvm/functions/Function1;", "observer", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: p24  reason: default package */
/* loaded from: classes.dex */
public final class p24 extends sm6.c implements an6, jg4 {
    private boolean n;
    private om5 o;

    private final Function1<om5, Unit> f1() {
        if (M0()) {
            return (Function1) E(o24.a());
        }
        return null;
    }

    private final void g1() {
        Function1<om5, Unit> f1;
        om5 om5Var = this.o;
        if (om5Var != null) {
            z65.e(om5Var);
            if (om5Var.p() && (f1 = f1()) != null) {
                f1.invoke(this.o);
            }
        }
    }

    @Override // defpackage.an6
    public /* synthetic */ ym6 D() {
        return zm6.b(this);
    }

    @Override // defpackage.dn6
    public /* synthetic */ Object E(um6 um6Var) {
        return zm6.a(this, um6Var);
    }

    @Override // defpackage.jg4
    public void e(om5 om5Var) {
        z65.h(om5Var, MessageAttributes.COORDINATES);
        this.o = om5Var;
        if (!this.n) {
            return;
        }
        if (om5Var.p()) {
            g1();
            return;
        }
        Function1<om5, Unit> f1 = f1();
        if (f1 != null) {
            f1.invoke(null);
        }
    }

    public final void h1(boolean z) {
        if (z == this.n) {
            return;
        }
        if (!z) {
            Function1<om5, Unit> f1 = f1();
            if (f1 != null) {
                f1.invoke(null);
            }
        } else {
            g1();
        }
        this.n = z;
    }
}
