package androidx.compose.ui.draw;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gb8;
import defpackage.sm6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: PainterModifier.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BA\u0012\u0006\u0010!\u001a\u00020\u001a\u0012\u0006\u0010(\u001a\u00020\u000b\u0012\b\b\u0002\u0010/\u001a\u00020)\u0012\b\b\u0002\u00106\u001a\u000200\u0012\b\b\u0002\u0010>\u001a\u000207\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010?¢\u0006\u0004\bK\u0010LJ\u001d\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0019\u0010\f\u001a\u00020\u000b*\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u000b*\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u0013\u001a\u00020\u0012*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\f\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010/\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00106\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R$\u0010F\u001a\u0004\u0018\u00010?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010%R\u0014\u0010J\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010%\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006M"}, d2 = {"Landroidx/compose/ui/draw/b;", "Lzm5;", "Lsm6$c;", "Lv73;", "Lcna;", "dstSize", "f1", "(J)J", "Lnr1;", "constraints", "l1", "", "k1", "(J)Z", "j1", "Lvb6;", "Lmb6;", "measurable", "Ltb6;", "p", "(Lvb6;Lmb6;J)Ltb6;", "Lit1;", "", "q", "", "toString", "Lsp7;", "n", "Lsp7;", "g1", "()Lsp7;", "p1", "(Lsp7;)V", "painter", "o", "Z", "h1", "()Z", "q1", "(Z)V", "sizeToIntrinsics", "Lgb;", "Lgb;", "getAlignment", "()Lgb;", "m1", "(Lgb;)V", "alignment", "Lau1;", "Lau1;", "getContentScale", "()Lau1;", "o1", "(Lau1;)V", "contentScale", "", "r", "F", "getAlpha", "()F", c.a, "(F)V", "alpha", "Lwc1;", Image.TYPE_SMALL, "Lwc1;", "getColorFilter", "()Lwc1;", "n1", "(Lwc1;)V", "colorFilter", "i1", "useIntrinsicSize", "K0", "shouldAutoInvalidate", "<init>", "(Lsp7;ZLgb;Lau1;FLwc1;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class b extends sm6.c implements zm5, v73 {
    private sp7 n;
    private boolean o;
    private gb p;
    private au1 q;
    private float r;
    private wc1 s;

    /* compiled from: PainterModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgb8$a;", "", "a", "(Lgb8$a;)V"}, k = 3, mv = {1, 8, 0})
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
            gb8.a.r(aVar, this.a, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(gb8.a aVar) {
            a(aVar);
            return Unit.a;
        }
    }

    public b(sp7 sp7Var, boolean z, gb gbVar, au1 au1Var, float f, wc1 wc1Var) {
        z65.h(sp7Var, "painter");
        z65.h(gbVar, "alignment");
        z65.h(au1Var, "contentScale");
        this.n = sp7Var;
        this.o = z;
        this.p = gbVar;
        this.q = au1Var;
        this.r = f;
        this.s = wc1Var;
    }

    private final long f1(long j) {
        float i;
        float g;
        if (i1()) {
            if (!k1(this.n.h())) {
                i = cna.i(j);
            } else {
                i = cna.i(this.n.h());
            }
            if (!j1(this.n.h())) {
                g = cna.g(j);
            } else {
                g = cna.g(this.n.h());
            }
            long a2 = ina.a(i, g);
            if (cna.i(j) == 0.0f || cna.g(j) == 0.0f) {
                return cna.b.b();
            }
            return gv9.b(a2, this.q.a(a2, j));
        }
        return j;
    }

    private final boolean i1() {
        if (this.o && this.n.h() != cna.b.a()) {
            return true;
        }
        return false;
    }

    private final boolean j1(long j) {
        if (!cna.f(j, cna.b.a())) {
            float g = cna.g(j);
            if (!Float.isInfinite(g) && !Float.isNaN(g)) {
                return true;
            }
        }
        return false;
    }

    private final boolean k1(long j) {
        if (!cna.f(j, cna.b.a())) {
            float i = cna.i(j);
            if (!Float.isInfinite(i) && !Float.isNaN(i)) {
                return true;
            }
        }
        return false;
    }

    private final long l1(long j) {
        boolean z;
        int p;
        int o;
        int c;
        int c2;
        boolean z2 = false;
        if (nr1.j(j) && nr1.i(j)) {
            z = true;
        } else {
            z = false;
        }
        if (nr1.l(j) && nr1.k(j)) {
            z2 = true;
        }
        if ((!i1() && z) || z2) {
            return nr1.e(j, nr1.n(j), 0, nr1.m(j), 0, 10, null);
        }
        long h = this.n.h();
        if (k1(h)) {
            p = la6.c(cna.i(h));
        } else {
            p = nr1.p(j);
        }
        if (j1(h)) {
            o = la6.c(cna.g(h));
        } else {
            o = nr1.o(j);
        }
        long f1 = f1(ina.a(qr1.g(j, p), qr1.f(j, o)));
        c = la6.c(cna.i(f1));
        int g = qr1.g(j, c);
        c2 = la6.c(cna.g(f1));
        return nr1.e(j, g, 0, qr1.f(j, c2), 0, 10, null);
    }

    @Override // defpackage.sm6.c
    public boolean K0() {
        return false;
    }

    public final void c(float f) {
        this.r = f;
    }

    public final sp7 g1() {
        return this.n;
    }

    public final boolean h1() {
        return this.o;
    }

    @Override // defpackage.v73
    public /* synthetic */ void i0() {
        u73.a(this);
    }

    public final void m1(gb gbVar) {
        z65.h(gbVar, "<set-?>");
        this.p = gbVar;
    }

    public final void n1(wc1 wc1Var) {
        this.s = wc1Var;
    }

    public final void o1(au1 au1Var) {
        z65.h(au1Var, "<set-?>");
        this.q = au1Var;
    }

    @Override // defpackage.zm5
    public tb6 p(vb6 vb6Var, mb6 mb6Var, long j) {
        z65.h(vb6Var, "$this$measure");
        z65.h(mb6Var, "measurable");
        gb8 E = mb6Var.E(l1(j));
        return ub6.b(vb6Var, E.y0(), E.e0(), null, new a(E), 4, null);
    }

    public final void p1(sp7 sp7Var) {
        z65.h(sp7Var, "<set-?>");
        this.n = sp7Var;
    }

    @Override // defpackage.v73
    public void q(it1 it1Var) {
        float i;
        float g;
        long b;
        int c;
        int c2;
        int c3;
        int c4;
        z65.h(it1Var, "<this>");
        long h = this.n.h();
        if (k1(h)) {
            i = cna.i(h);
        } else {
            i = cna.i(it1Var.s());
        }
        if (j1(h)) {
            g = cna.g(h);
        } else {
            g = cna.g(it1Var.s());
        }
        long a2 = ina.a(i, g);
        if (cna.i(it1Var.s()) == 0.0f || cna.g(it1Var.s()) == 0.0f) {
            b = cna.b.b();
        } else {
            b = gv9.b(a2, this.q.a(a2, it1Var.s()));
        }
        long j = b;
        gb gbVar = this.p;
        c = la6.c(cna.i(j));
        c2 = la6.c(cna.g(j));
        long a3 = x55.a(c, c2);
        c3 = la6.c(cna.i(it1Var.s()));
        c4 = la6.c(cna.g(it1Var.s()));
        long a4 = gbVar.a(a3, x55.a(c3, c4), it1Var.getLayoutDirection());
        float h2 = s55.h(a4);
        float i2 = s55.i(a4);
        it1Var.o0().t().a(h2, i2);
        this.n.g(it1Var, j, this.r, this.s);
        it1Var.o0().t().a(-h2, -i2);
        it1Var.B0();
    }

    public final void q1(boolean z) {
        this.o = z;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.n + ", sizeToIntrinsics=" + this.o + ", alignment=" + this.p + ", alpha=" + this.r + ", colorFilter=" + this.s + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
