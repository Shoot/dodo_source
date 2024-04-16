package defpackage;

import defpackage.gb8;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: IntermediateLayoutModifierNode.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J)\u0010\u000b\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0010\u001a\u00020\n*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lm65;", "Lzm5;", "Lsm6$c;", "", "P0", "Lvb6;", "Lmb6;", "measurable", "Lnr1;", "constraints", "Ltb6;", "p", "(Lvb6;Lmb6;J)Ltb6;", "Lw55;", "lookaheadSize", "lookaheadConstraints", "f1", "(Lvb6;Lmb6;JJJ)Ltb6;", "Lxy5;", "n", "Lxy5;", "localLookaheadScope", "Lwy5;", "o", "Lwy5;", "closestLookaheadScope", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: m65  reason: default package */
/* loaded from: classes.dex */
public final class m65 extends sm6.c implements zm5 {
    private final xy5 n;
    private wy5 o;

    /* compiled from: IntermediateLayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgb8$a;", "", "a", "(Lgb8$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: m65$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<gb8.a, Unit> {
        final /* synthetic */ gb8 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(gb8 gb8Var) {
            super(1);
            this.a = gb8Var;
        }

        public final void a(gb8.a aVar) {
            z65.h(aVar, "$this$layout");
            gb8.a.n(aVar, this.a, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(gb8.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    /* compiled from: IntermediateLayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lom5;", "a", "()Lom5;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: m65$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<om5> {
        final /* synthetic */ en5 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(en5 en5Var) {
            super(0);
            this.a = en5Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final om5 invoke() {
            en5 h0 = this.a.h0();
            z65.e(h0);
            return h0.L().J0();
        }
    }

    @Override // defpackage.sm6.c
    public void P0() {
        uy5 uy5Var;
        xy5 xy5Var;
        xy5 xy5Var2;
        mz6 e0;
        oz6 E0 = E0();
        z65.e(E0);
        en5 L0 = E0.L0();
        oz6 E02 = E0();
        z65.e(E02);
        ty5 v1 = E02.v1();
        if (v1 != null) {
            uy5Var = v1.b1();
        } else {
            uy5Var = null;
        }
        if (uy5Var != null) {
            en5 U = L0.U();
            if (U != null && U.E0()) {
                xy5Var2 = new xy5(new b(U));
            } else {
                int a2 = qz6.a(512);
                if (I().M0()) {
                    sm6.c J0 = I().J0();
                    en5 i = au2.i(this);
                    m65 m65Var = null;
                    while (i != null) {
                        if ((i.e0().k().C0() & a2) != 0) {
                            while (J0 != null) {
                                if ((J0.H0() & a2) != 0) {
                                    gr6 gr6Var = null;
                                    sm6.c cVar = J0;
                                    while (cVar != null) {
                                        if (cVar instanceof m65) {
                                            m65Var = (m65) cVar;
                                        } else if ((cVar.H0() & a2) != 0 && (cVar instanceof fu2)) {
                                            int i2 = 0;
                                            for (sm6.c g1 = ((fu2) cVar).g1(); g1 != null; g1 = g1.D0()) {
                                                if ((g1.H0() & a2) != 0) {
                                                    i2++;
                                                    if (i2 == 1) {
                                                        cVar = g1;
                                                    } else {
                                                        if (gr6Var == null) {
                                                            gr6Var = new gr6(new sm6.c[16], 0);
                                                        }
                                                        if (cVar != null) {
                                                            gr6Var.b(cVar);
                                                            cVar = null;
                                                        }
                                                        gr6Var.b(g1);
                                                    }
                                                }
                                            }
                                            if (i2 == 1) {
                                            }
                                        }
                                        cVar = au2.g(gr6Var);
                                    }
                                }
                                J0 = J0.J0();
                            }
                        }
                        i = i.h0();
                        if (i != null && (e0 = i.e0()) != null) {
                            J0 = e0.o();
                        } else {
                            J0 = null;
                        }
                    }
                    if (m65Var == null || (xy5Var = m65Var.n) == null) {
                        xy5Var = this.n;
                    }
                    xy5Var2 = xy5Var;
                } else {
                    throw new IllegalStateException("visitAncestors called on an unattached node".toString());
                }
            }
            this.o = xy5Var2;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final tb6 f1(vb6 vb6Var, mb6 mb6Var, long j, long j2, long j3) {
        z65.h(vb6Var, "$this$intermediateMeasure");
        z65.h(mb6Var, "measurable");
        throw null;
    }

    @Override // defpackage.zm5
    public tb6 p(vb6 vb6Var, mb6 mb6Var, long j) {
        z65.h(vb6Var, "$this$measure");
        z65.h(mb6Var, "measurable");
        gb8 E = mb6Var.E(j);
        return ub6.b(vb6Var, E.y0(), E.e0(), null, new a(E), 4, null);
    }
}
