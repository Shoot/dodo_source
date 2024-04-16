package defpackage;

import im.threads.business.transport.MessageAttributes;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: LookaheadDelegate.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b0\u0010\nJ\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&J\u000f\u0010\t\u001a\u00020\bH ¢\u0006\u0004\b\t\u0010\nJ\f\u0010\f\u001a\u00020\b*\u00020\u000bH\u0004R\"\u0010\u0014\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001d\u0010\u001c\u001a\u00020\u00198&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0014\u0010#\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011R\u0014\u0010'\u001a\u00020$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8 X \u0004¢\u0006\u0006\u001a\u0004\b-\u0010.\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00061"}, d2 = {"Lsy5;", "Lgb8;", "", "Lhb;", "alignmentLine", "", "H0", "G0", "", "S0", "()V", "Loz6;", "P0", "", "f", "Z", "R0", "()Z", "U0", "(Z)V", "isShallowPlacing", "g", "Q0", "T0", "isPlacingForAlignment", "Ls55;", "O0", "()J", "position", "I0", "()Lsy5;", "child", "N0", "parent", "K0", "hasMeasureResult", "Len5;", "L0", "()Len5;", "layoutNode", "Lom5;", "J0", "()Lom5;", MessageAttributes.COORDINATES, "Ltb6;", "M0", "()Ltb6;", "measureResult", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: sy5  reason: default package */
/* loaded from: classes.dex */
public abstract class sy5 extends gb8 implements vb6 {
    private boolean f;
    private boolean g;

    public abstract int G0(hb hbVar);

    public final int H0(hb hbVar) {
        int G0;
        z65.h(hbVar, "alignmentLine");
        if (!K0() || (G0 = G0(hbVar)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return G0 + s55.i(W());
    }

    public abstract sy5 I0();

    public abstract om5 J0();

    public abstract boolean K0();

    public abstract en5 L0();

    public abstract tb6 M0();

    public abstract sy5 N0();

    @Override // defpackage.a03
    public /* synthetic */ int O(float f) {
        return zz2.a(this, f);
    }

    public abstract long O0();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void P0(oz6 oz6Var) {
        en5 en5Var;
        jb d;
        z65.h(oz6Var, "<this>");
        oz6 A1 = oz6Var.A1();
        if (A1 != null) {
            en5Var = A1.L0();
        } else {
            en5Var = null;
        }
        if (!z65.c(en5Var, oz6Var.L0())) {
            oz6Var.r1().d().m();
            return;
        }
        kb m = oz6Var.r1().m();
        if (m != null && (d = m.d()) != null) {
            d.m();
        }
    }

    public final boolean Q0() {
        return this.g;
    }

    public final boolean R0() {
        return this.f;
    }

    @Override // defpackage.a03
    public /* synthetic */ float S(long j) {
        return zz2.b(this, j);
    }

    public abstract void S0();

    public final void T0(boolean z) {
        this.g = z;
    }

    public final void U0(boolean z) {
        this.f = z;
    }

    @Override // defpackage.vb6
    public /* synthetic */ tb6 d0(int i, int i2, Map map, Function1 function1) {
        return ub6.a(this, i, i2, map, function1);
    }

    @Override // defpackage.a03
    public /* synthetic */ float n0(float f) {
        return zz2.c(this, f);
    }

    @Override // defpackage.a03
    public /* synthetic */ long w0(long j) {
        return zz2.d(this, j);
    }

    @Override // defpackage.a03
    public /* synthetic */ long z(float f) {
        return zz2.e(this, f);
    }
}
