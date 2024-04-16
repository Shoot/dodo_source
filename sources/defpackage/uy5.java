package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.s67;
import kotlin.Metadata;
/* compiled from: LookaheadLayoutCoordinates.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b%\u0010&J\u001d\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0005J%\u0010\n\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0018\u001a\u00020\u00028BX\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\u001e\u001a\u00020\u001d8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0017R\u0016\u0010!\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006'"}, d2 = {"Luy5;", "", "Ls67;", "relativeToLocal", "B", "(J)J", "I", "Lom5;", "sourceCoordinates", "relativeToSource", "v", "(Lom5;J)J", "", "clipBounds", "Lk99;", "x", "Lty5;", "a", "Lty5;", "getLookaheadDelegate", "()Lty5;", "lookaheadDelegate", c.a, "()J", "lookaheadOffset", "Loz6;", "b", "()Loz6;", "coordinator", "Lw55;", "size", "F", "()Lom5;", "parentLayoutCoordinates", "p", "()Z", "isAttached", "<init>", "(Lty5;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: uy5  reason: default package */
/* loaded from: classes.dex */
public final class uy5 implements om5 {
    private final ty5 a;

    public uy5(ty5 ty5Var) {
        z65.h(ty5Var, "lookaheadDelegate");
        this.a = ty5Var;
    }

    private final long c() {
        ty5 a = vy5.a(this.a);
        om5 J0 = a.J0();
        s67.a aVar = s67.b;
        return s67.p(v(J0, aVar.c()), b().v(a.a1(), aVar.c()));
    }

    @Override // defpackage.om5
    public long B(long j) {
        return b().B(s67.q(j, c()));
    }

    @Override // defpackage.om5
    public om5 F() {
        ty5 v1;
        if (p()) {
            oz6 B1 = b().L0().f0().B1();
            if (B1 == null || (v1 = B1.v1()) == null) {
                return null;
            }
            return v1.J0();
        }
        throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
    }

    @Override // defpackage.om5
    public long I(long j) {
        return b().I(s67.q(j, c()));
    }

    @Override // defpackage.om5
    public long a() {
        ty5 ty5Var = this.a;
        return x55.a(ty5Var.y0(), ty5Var.e0());
    }

    public final oz6 b() {
        return this.a.a1();
    }

    @Override // defpackage.om5
    public boolean p() {
        return b().p();
    }

    @Override // defpackage.om5
    public long v(om5 om5Var, long j) {
        int c;
        int c2;
        int c3;
        int c4;
        z65.h(om5Var, "sourceCoordinates");
        if (om5Var instanceof uy5) {
            ty5 ty5Var = ((uy5) om5Var).a;
            ty5Var.a1().P1();
            ty5 v1 = b().o1(ty5Var.a1()).v1();
            if (v1 != null) {
                long d1 = ty5Var.d1(v1);
                c3 = la6.c(s67.l(j));
                c4 = la6.c(s67.m(j));
                long a = t55.a(c3, c4);
                long a2 = t55.a(s55.h(d1) + s55.h(a), s55.i(d1) + s55.i(a));
                long d12 = this.a.d1(v1);
                long a3 = t55.a(s55.h(a2) - s55.h(d12), s55.i(a2) - s55.i(d12));
                return x67.a(s55.h(a3), s55.i(a3));
            }
            ty5 a4 = vy5.a(ty5Var);
            long d13 = ty5Var.d1(a4);
            long O0 = a4.O0();
            long a5 = t55.a(s55.h(d13) + s55.h(O0), s55.i(d13) + s55.i(O0));
            c = la6.c(s67.l(j));
            c2 = la6.c(s67.m(j));
            long a6 = t55.a(c, c2);
            long a7 = t55.a(s55.h(a5) + s55.h(a6), s55.i(a5) + s55.i(a6));
            ty5 ty5Var2 = this.a;
            long d14 = ty5Var2.d1(vy5.a(ty5Var2));
            long O02 = vy5.a(ty5Var2).O0();
            long a8 = t55.a(s55.h(d14) + s55.h(O02), s55.i(d14) + s55.i(O02));
            long a9 = t55.a(s55.h(a7) - s55.h(a8), s55.i(a7) - s55.i(a8));
            oz6 B1 = vy5.a(this.a).a1().B1();
            z65.e(B1);
            oz6 B12 = a4.a1().B1();
            z65.e(B12);
            return B1.v(B12, x67.a(s55.h(a9), s55.i(a9)));
        }
        ty5 a10 = vy5.a(this.a);
        return s67.q(v(a10.b1(), j), a10.a1().J0().v(om5Var, s67.b.c()));
    }

    @Override // defpackage.om5
    public k99 x(om5 om5Var, boolean z) {
        z65.h(om5Var, "sourceCoordinates");
        return b().x(om5Var, z);
    }
}
