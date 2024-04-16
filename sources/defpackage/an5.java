package defpackage;

import androidx.compose.ui.graphics.c;
import defpackage.gb8;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LayoutModifierNodeCoordinator.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 92\u00020\u0001:\u0002:;B\u0017\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00106\u001a\u00020\u0019¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016R*\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R!\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\"\u0010#R.\u0010,\u001a\u0004\u0018\u00010%2\b\u0010\u001a\u001a\u0004\u0018\u00010%8\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00103\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b1\u00102\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006<"}, d2 = {"Lan5;", "Loz6;", "", "n1", "Lnr1;", "constraints", "Lgb8;", "E", "(J)Lgb8;", "Ls55;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", "D0", "(JFLkotlin/jvm/functions/Function1;)V", "Lhb;", "alignmentLine", "", "G0", "Lqn0;", "canvas", "W1", "Lzm5;", "<set-?>", "T4", "Lzm5;", "r2", "()Lzm5;", "t2", "(Lzm5;)V", "layoutModifierNode", "U4", "Lnr1;", "lookaheadConstraints", "Lty5;", "V4", "Lty5;", "v1", "()Lty5;", "u2", "(Lty5;)V", "lookaheadDelegate", "Lsm6$c;", "z1", "()Lsm6$c;", "tail", "s2", "()Loz6;", "wrappedNonNull", "Len5;", "layoutNode", "measureNode", "<init>", "(Len5;Lzm5;)V", "W4", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: an5  reason: default package */
/* loaded from: classes.dex */
public final class an5 extends oz6 {
    public static final a W4 = new a(null);
    private static final pp7 X4;
    private zm5 T4;
    private nr1 U4;
    private ty5 V4;

    /* compiled from: LayoutModifierNodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lan5$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: an5$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: LayoutModifierNodeCoordinator.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lan5$b;", "Lty5;", "Lnr1;", "constraints", "Lgb8;", "E", "(J)Lgb8;", "Lhb;", "alignmentLine", "", "G0", "<init>", "(Lan5;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: an5$b */
    /* loaded from: classes.dex */
    private final class b extends ty5 {
        public b() {
            super(an5.this);
        }

        @Override // defpackage.mb6
        public gb8 E(long j) {
            an5 an5Var = an5.this;
            ty5.V0(this, j);
            an5Var.U4 = nr1.b(j);
            zm5 r2 = an5Var.r2();
            ty5 v1 = an5Var.s2().v1();
            z65.e(v1);
            ty5.W0(this, r2.p(this, v1, j));
            return this;
        }

        @Override // defpackage.sy5
        public int G0(hb hbVar) {
            int b;
            z65.h(hbVar, "alignmentLine");
            b = bn5.b(this, hbVar);
            Z0().put(hbVar, Integer.valueOf(b));
            return b;
        }
    }

    static {
        pp7 a2 = xh.a();
        a2.k(uc1.b.b());
        a2.w(1.0f);
        a2.v(up7.a.b());
        X4 = a2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an5(en5 en5Var, zm5 zm5Var) {
        super(en5Var);
        b bVar;
        z65.h(en5Var, "layoutNode");
        z65.h(zm5Var, "measureNode");
        this.T4 = zm5Var;
        if (en5Var.U() != null) {
            bVar = new b();
        } else {
            bVar = null;
        }
        this.V4 = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oz6, defpackage.gb8
    public void D0(long j, float f, Function1<? super c, Unit> function1) {
        om5 om5Var;
        int l;
        qm5 k;
        jn5 jn5Var;
        boolean A;
        super.D0(j, f, function1);
        if (R0()) {
            return;
        }
        U1();
        gb8.a.C0324a c0324a = gb8.a.a;
        int g = w55.g(j0());
        qm5 layoutDirection = getLayoutDirection();
        om5Var = gb8.a.d;
        l = c0324a.l();
        k = c0324a.k();
        jn5Var = gb8.a.e;
        gb8.a.c = g;
        gb8.a.b = layoutDirection;
        A = c0324a.A(this);
        M0().a();
        T0(A);
        gb8.a.c = l;
        gb8.a.b = k;
        gb8.a.d = om5Var;
        gb8.a.e = jn5Var;
    }

    @Override // defpackage.mb6
    public gb8 E(long j) {
        tb6 p;
        F0(j);
        zm5 r2 = r2();
        if (r2 instanceof m65) {
            m65 m65Var = (m65) r2;
            oz6 s2 = s2();
            ty5 v1 = v1();
            z65.e(v1);
            tb6 M0 = v1.M0();
            long a2 = x55.a(M0.getWidth(), M0.getHeight());
            nr1 nr1Var = this.U4;
            z65.e(nr1Var);
            p = m65Var.f1(this, s2, j, a2, nr1Var.s());
        } else {
            p = r2.p(this, s2(), j);
        }
        b2(p);
        T1();
        return this;
    }

    @Override // defpackage.sy5
    public int G0(hb hbVar) {
        int b2;
        z65.h(hbVar, "alignmentLine");
        ty5 v1 = v1();
        if (v1 == null) {
            b2 = bn5.b(this, hbVar);
            return b2;
        }
        return v1.Y0(hbVar);
    }

    @Override // defpackage.oz6
    public void W1(qn0 qn0Var) {
        z65.h(qn0Var, "canvas");
        s2().k1(qn0Var);
        if (in5.b(L0()).getShowLayoutBounds()) {
            l1(qn0Var, X4);
        }
    }

    @Override // defpackage.oz6
    public void n1() {
        if (v1() == null) {
            u2(new b());
        }
    }

    public final zm5 r2() {
        return this.T4;
    }

    public final oz6 s2() {
        oz6 A1 = A1();
        z65.e(A1);
        return A1;
    }

    public final void t2(zm5 zm5Var) {
        z65.h(zm5Var, "<set-?>");
        this.T4 = zm5Var;
    }

    protected void u2(ty5 ty5Var) {
        this.V4 = ty5Var;
    }

    @Override // defpackage.oz6
    public ty5 v1() {
        return this.V4;
    }

    @Override // defpackage.oz6
    public sm6.c z1() {
        return this.T4.I();
    }
}
