package defpackage;

import defpackage.sm6;
import kotlin.Metadata;
/* compiled from: DelegatingNode.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b'\u0010\u0015J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H\u0002J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0019\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0010¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0019\u0010\u0015R \u0010\u001f\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001c\u0010\u001dR$\u0010&\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006("}, d2 = {"Lfu2;", "Lsm6$c;", "", "delegateKindSet", "delegateNode", "", "j1", "newKindSet", "", "recalculateOwner", "i1", "Loz6;", "coordinator", "e1", "(Loz6;)V", "Lzt2;", "T", "delegatableNode", "f1", "(Lzt2;)Lzt2;", "N0", "()V", "T0", "U0", "O0", "S0", "n", "I", "h1", "()I", "getSelfKindSet$ui_release$annotations", "selfKindSet", "o", "Lsm6$c;", "g1", "()Lsm6$c;", "setDelegate$ui_release", "(Lsm6$c;)V", "delegate", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: fu2  reason: default package */
/* loaded from: classes.dex */
public abstract class fu2 extends sm6.c {
    private final int n = rz6.g(this);
    private sm6.c o;

    private final void i1(int i, boolean z) {
        int i2;
        sm6.c D0;
        int H0 = H0();
        Z0(i);
        if (H0 != i) {
            if (au2.f(this)) {
                V0(i);
            }
            if (M0()) {
                sm6.c I = I();
                sm6.c cVar = this;
                while (cVar != null) {
                    i |= cVar.H0();
                    cVar.Z0(i);
                    if (cVar == I) {
                        break;
                    }
                    cVar = cVar.J0();
                }
                if (z && cVar == I) {
                    i = rz6.h(I);
                    I.Z0(i);
                }
                if (cVar != null && (D0 = cVar.D0()) != null) {
                    i2 = D0.C0();
                } else {
                    i2 = 0;
                }
                int i3 = i | i2;
                while (cVar != null) {
                    i3 |= cVar.H0();
                    cVar.V0(i3);
                    cVar = cVar.J0();
                }
            }
        }
    }

    private final void j1(int i, sm6.c cVar) {
        int H0 = H0();
        if ((i & qz6.a(2)) != 0 && (qz6.a(2) & H0) != 0 && !(this instanceof zm5)) {
            throw new IllegalStateException(("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + cVar).toString());
        }
    }

    @Override // defpackage.sm6.c
    public void N0() {
        super.N0();
        for (sm6.c g1 = g1(); g1 != null; g1 = g1.D0()) {
            g1.e1(E0());
            if (!g1.M0()) {
                g1.N0();
            }
        }
    }

    @Override // defpackage.sm6.c
    public void O0() {
        for (sm6.c g1 = g1(); g1 != null; g1 = g1.D0()) {
            g1.O0();
        }
        super.O0();
    }

    @Override // defpackage.sm6.c
    public void S0() {
        super.S0();
        for (sm6.c g1 = g1(); g1 != null; g1 = g1.D0()) {
            g1.S0();
        }
    }

    @Override // defpackage.sm6.c
    public void T0() {
        for (sm6.c g1 = g1(); g1 != null; g1 = g1.D0()) {
            g1.T0();
        }
        super.T0();
    }

    @Override // defpackage.sm6.c
    public void U0() {
        super.U0();
        for (sm6.c g1 = g1(); g1 != null; g1 = g1.D0()) {
            g1.U0();
        }
    }

    @Override // defpackage.sm6.c
    public void e1(oz6 oz6Var) {
        super.e1(oz6Var);
        for (sm6.c g1 = g1(); g1 != null; g1 = g1.D0()) {
            g1.e1(oz6Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <T extends zt2> T f1(T t) {
        sm6.c cVar;
        z65.h(t, "delegatableNode");
        sm6.c I = t.I();
        sm6.c cVar2 = null;
        if (I != t) {
            if (t instanceof sm6.c) {
                cVar = (sm6.c) t;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                cVar2 = cVar.J0();
            }
            if (I == I() && z65.c(cVar2, this)) {
                return t;
            }
            throw new IllegalStateException("Cannot delegate to an already delegated node".toString());
        } else if (!I.M0()) {
            I.W0(I());
            int H0 = H0();
            int h = rz6.h(I);
            I.Z0(h);
            j1(h, I);
            I.X0(this.o);
            this.o = I;
            I.b1(this);
            i1(H0() | h, false);
            if (M0()) {
                if ((h & qz6.a(2)) != 0 && (H0 & qz6.a(2)) == 0) {
                    mz6 e0 = au2.i(this).e0();
                    I().e1(null);
                    e0.C();
                } else {
                    e1(E0());
                }
                I.N0();
                I.T0();
                rz6.a(I);
            }
            return t;
        } else {
            throw new IllegalStateException("Cannot delegate to an already attached node".toString());
        }
    }

    public final sm6.c g1() {
        return this.o;
    }

    public final int h1() {
        return this.n;
    }
}
