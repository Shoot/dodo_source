package defpackage;

import androidx.compose.ui.graphics.c;
import defpackage.en5;
import defpackage.jn5;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: InnerNodeCoordinator.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 92\u00020\u0001:\u0002:;B\u000f\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J=\u0010\"\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#R \u0010+\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R.\u00104\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010,8\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006<"}, d2 = {"Lj35;", "Loz6;", "", "n1", "Lnr1;", "constraints", "Lgb8;", "E", "(J)Lgb8;", "Ls55;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "layerBlock", "D0", "(JFLkotlin/jvm/functions/Function1;)V", "Lhb;", "alignmentLine", "", "G0", "Lqn0;", "canvas", "W1", "Loz6$f;", "hitTestSource", "Ls67;", "pointerPosition", "Lqo4;", "hitTestResult", "", "isTouchEvent", "isInLayer", "J1", "(Loz6$f;JLqo4;ZZ)V", "Lh6b;", "T4", "Lh6b;", "p2", "()Lh6b;", "getTail$annotations", "()V", "tail", "Lty5;", "<set-?>", "U4", "Lty5;", "v1", "()Lty5;", "q2", "(Lty5;)V", "lookaheadDelegate", "Len5;", "layoutNode", "<init>", "(Len5;)V", "V4", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: j35  reason: default package */
/* loaded from: classes.dex */
public final class j35 extends oz6 {
    public static final a V4 = new a(null);
    private static final pp7 W4;
    private final h6b T4;
    private ty5 U4;

    /* compiled from: InnerNodeCoordinator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj35$a;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: j35$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: InnerNodeCoordinator.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lj35$b;", "Lty5;", "Lnr1;", "constraints", "Lgb8;", "E", "(J)Lgb8;", "Lhb;", "alignmentLine", "", "G0", "", "c1", "<init>", "(Lj35;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: j35$b */
    /* loaded from: classes.dex */
    private final class b extends ty5 {
        public b() {
            super(j35.this);
        }

        @Override // defpackage.mb6
        public gb8 E(long j) {
            ty5.V0(this, j);
            gr6<en5> o0 = L0().o0();
            int s = o0.s();
            if (s > 0) {
                en5[] r = o0.r();
                int i = 0;
                do {
                    jn5.a T = r[i].T();
                    z65.e(T);
                    T.a1(en5.g.NotUsed);
                    i++;
                } while (i < s);
                ty5.W0(this, L0().Y().a(this, L0().C(), j));
                return this;
            }
            ty5.W0(this, L0().Y().a(this, L0().C(), j));
            return this;
        }

        @Override // defpackage.sy5
        public int G0(hb hbVar) {
            int i;
            z65.h(hbVar, "alignmentLine");
            Integer num = X0().e().get(hbVar);
            if (num != null) {
                i = num.intValue();
            } else {
                i = Integer.MIN_VALUE;
            }
            Z0().put(hbVar, Integer.valueOf(i));
            return i;
        }

        @Override // defpackage.ty5
        protected void c1() {
            jn5.a T = L0().T();
            z65.e(T);
            T.W0();
        }
    }

    static {
        pp7 a2 = xh.a();
        a2.k(uc1.b.c());
        a2.w(1.0f);
        a2.v(up7.a.b());
        W4 = a2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j35(en5 en5Var) {
        super(en5Var);
        b bVar;
        z65.h(en5Var, "layoutNode");
        this.T4 = new h6b();
        z1().e1(this);
        if (en5Var.U() != null) {
            bVar = new b();
        } else {
            bVar = null;
        }
        this.U4 = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oz6, defpackage.gb8
    public void D0(long j, float f, Function1<? super c, Unit> function1) {
        super.D0(j, f, function1);
        if (R0()) {
            return;
        }
        U1();
        L0().W().X0();
    }

    @Override // defpackage.mb6
    public gb8 E(long j) {
        F0(j);
        gr6<en5> o0 = L0().o0();
        int s = o0.s();
        if (s > 0) {
            en5[] r = o0.r();
            int i = 0;
            do {
                r[i].W().c1(en5.g.NotUsed);
                i++;
            } while (i < s);
            b2(L0().Y().a(this, L0().D(), j));
            T1();
            return this;
        }
        b2(L0().Y().a(this, L0().D(), j));
        T1();
        return this;
    }

    @Override // defpackage.sy5
    public int G0(hb hbVar) {
        z65.h(hbVar, "alignmentLine");
        ty5 v1 = v1();
        if (v1 != null) {
            return v1.G0(hbVar);
        }
        Integer num = r1().e().get(hbVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.oz6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J1(defpackage.oz6.f r18, long r19, defpackage.qo4 r21, boolean r22, boolean r23) {
        /*
            r17 = this;
            r0 = r17
            r8 = r18
            r9 = r19
            r11 = r21
            java.lang.String r1 = "hitTestSource"
            defpackage.z65.h(r8, r1)
            java.lang.String r1 = "hitTestResult"
            defpackage.z65.h(r11, r1)
            en5 r1 = r17.L0()
            boolean r1 = r8.d(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L41
            boolean r1 = r0.o2(r9)
            if (r1 == 0) goto L28
            r12 = r23
            r3 = 1
            goto L43
        L28:
            if (r22 == 0) goto L41
            long r4 = r17.w1()
            float r1 = r0.j1(r9, r4)
            boolean r4 = java.lang.Float.isInfinite(r1)
            if (r4 != 0) goto L41
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L41
            r3 = 1
            r12 = 0
            goto L43
        L41:
            r12 = r23
        L43:
            if (r3 == 0) goto L92
            int r13 = defpackage.qo4.g(r21)
            en5 r1 = r17.L0()
            gr6 r1 = r1.n0()
            int r3 = r1.s()
            if (r3 <= 0) goto L8f
            int r3 = r3 - r2
            java.lang.Object[] r14 = r1.r()
            r15 = r3
        L5d:
            r1 = r14[r15]
            r16 = r1
            en5 r16 = (defpackage.en5) r16
            boolean r1 = r16.b()
            if (r1 == 0) goto L8b
            r1 = r18
            r2 = r16
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r12
            r1.c(r2, r3, r5, r6, r7)
            boolean r1 = r21.z()
            if (r1 != 0) goto L7e
            goto L8b
        L7e:
            oz6 r1 = r16.f0()
            boolean r1 = r1.f2()
            if (r1 == 0) goto L8f
            r21.d()
        L8b:
            int r15 = r15 + (-1)
            if (r15 >= 0) goto L5d
        L8f:
            defpackage.qo4.k(r11, r13)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j35.J1(oz6$f, long, qo4, boolean, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.oz6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void W1(defpackage.qn0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "canvas"
            defpackage.z65.h(r7, r0)
            en5 r0 = r6.L0()
            um7 r0 = defpackage.in5.b(r0)
            en5 r1 = r6.L0()
            gr6 r1 = r1.n0()
            int r2 = r1.s()
            if (r2 <= 0) goto L31
            java.lang.Object[] r1 = r1.r()
            r3 = 0
        L20:
            r4 = r1[r3]
            en5 r4 = (defpackage.en5) r4
            boolean r5 = r4.b()
            if (r5 == 0) goto L2d
            r4.z(r7)
        L2d:
            int r3 = r3 + 1
            if (r3 < r2) goto L20
        L31:
            boolean r0 = r0.getShowLayoutBounds()
            if (r0 == 0) goto L3c
            pp7 r0 = defpackage.j35.W4
            r6.l1(r7, r0)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j35.W1(qn0):void");
    }

    @Override // defpackage.oz6
    public void n1() {
        if (v1() == null) {
            q2(new b());
        }
    }

    @Override // defpackage.oz6
    /* renamed from: p2 */
    public h6b z1() {
        return this.T4;
    }

    protected void q2(ty5 ty5Var) {
        this.U4 = ty5Var;
    }

    @Override // defpackage.oz6
    public ty5 v1() {
        return this.U4;
    }
}
