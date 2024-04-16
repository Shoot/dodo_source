package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.sm6;
import defpackage.sn0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LayoutNodeDrawScope.kt */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010N\u001a\u00020K¢\u0006\u0004\ba\u0010bJz\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017JP\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJP\u0010 \u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\\\u0010&\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\\\u0010(\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b(\u0010)Jf\u0010,\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-Jf\u0010.\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020$2\b\b\u0002\u0010+\u001a\u00020*2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0096\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u000201*\u000200H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00103J\u001a\u00104\u001a\u00020\u000b*\u000200H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J\u001a\u00107\u001a\u00020\u000b*\u000206H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b7\u00108J\u001a\u0010:\u001a\u00020$*\u000209H\u0097\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b:\u0010;J\u001d\u0010<\u001a\u000206*\u00020\u000bH\u0097\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010=J\b\u0010>\u001a\u00020\u0015H\u0016J\u0012\u0010B\u001a\u00020\u0015*\u00020?2\u0006\u0010A\u001a\u00020@J5\u0010G\u001a\u00020\u00152\u0006\u0010A\u001a\u00020@2\u0006\u0010%\u001a\u00020$2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020EH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bG\u0010HJ5\u0010I\u001a\u00020\u00152\u0006\u0010A\u001a\u00020@2\u0006\u0010%\u001a\u00020$2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020?H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0018\u0010F\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010OR\u001d\u0010R\u001a\u00020\"8VX\u0096\u0005ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020\u000b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020\u000b8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bZ\u0010TR\u0014\u0010_\u001a\u00020\\8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b]\u0010^R\u001d\u0010%\u001a\u00020$8VX\u0096\u0005ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b`\u0010Q\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006c"}, d2 = {"Lgn5;", "Ly73;", "Lit1;", "Leu4;", ElementGenerator.TYPE_IMAGE, "Ls55;", "srcOffset", "Lw55;", "srcSize", "dstOffset", "dstSize", "", "alpha", "Lz73;", "style", "Lwc1;", "colorFilter", "Lpc0;", "blendMode", "Lyu3;", "filterQuality", "", "c0", "(Leu4;JJJJFLz73;Lwc1;II)V", "Lor7;", "path", "Lmg0;", "brush", "s0", "(Lor7;Lmg0;FLz73;Lwc1;I)V", "Luc1;", RemoteMessageConst.Notification.COLOR, "g0", "(Lor7;JFLz73;Lwc1;I)V", "Ls67;", "topLeft", "Lcna;", "size", "A0", "(Lmg0;JJFLz73;Lwc1;I)V", "t0", "(JJJFLz73;Lwc1;I)V", "Lbx1;", "cornerRadius", "R", "(Lmg0;JJJFLz73;Lwc1;I)V", "q0", "(JJJJLz73;FLwc1;I)V", "Li73;", "", "O", "(F)I", "n0", "(F)F", "Lwcb;", "S", "(J)F", "Ll73;", "w0", "(J)J", "z", "(F)J", "B0", "Lv73;", "Lqn0;", "canvas", e.a, "Loz6;", "coordinator", "Lsm6$c;", "drawNode", "b", "(Lqn0;JLoz6;Lsm6$c;)V", DateTokenConverter.CONVERTER_KEY, "(Lqn0;JLoz6;Lv73;)V", "Lsn0;", "a", "Lsn0;", "canvasDrawScope", "Lv73;", "u0", "()J", ElementGenerator.TEXT_ALIGN_CENTER, "getDensity", "()F", "density", "Ls73;", "o0", "()Ls73;", "drawContext", "k0", "fontScale", "Lqm5;", "getLayoutDirection", "()Lqm5;", "layoutDirection", Image.TYPE_SMALL, "<init>", "(Lsn0;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: gn5  reason: default package */
/* loaded from: classes.dex */
public final class gn5 implements y73, it1 {
    private final sn0 a;
    private v73 b;

    public gn5(sn0 sn0Var) {
        z65.h(sn0Var, "canvasDrawScope");
        this.a = sn0Var;
    }

    @Override // defpackage.y73
    public void A0(mg0 mg0Var, long j, long j2, float f, z73 z73Var, wc1 wc1Var, int i) {
        z65.h(mg0Var, "brush");
        z65.h(z73Var, "style");
        this.a.A0(mg0Var, j, j2, f, z73Var, wc1Var, i);
    }

    @Override // defpackage.it1
    public void B0() {
        sm6.c b;
        qn0 u = o0().u();
        v73 v73Var = this.b;
        z65.e(v73Var);
        b = hn5.b(v73Var);
        if (b != null) {
            int a = qz6.a(4);
            gr6 gr6Var = null;
            while (b != null) {
                if (b instanceof v73) {
                    e((v73) b, u);
                } else if ((b.H0() & a) != 0 && (b instanceof fu2)) {
                    int i = 0;
                    for (sm6.c g1 = ((fu2) b).g1(); g1 != null; g1 = g1.D0()) {
                        if ((g1.H0() & a) != 0) {
                            i++;
                            if (i == 1) {
                                b = g1;
                            } else {
                                if (gr6Var == null) {
                                    gr6Var = new gr6(new sm6.c[16], 0);
                                }
                                if (b != null) {
                                    gr6Var.b(b);
                                    b = null;
                                }
                                gr6Var.b(g1);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                b = au2.g(gr6Var);
            }
            return;
        }
        oz6 h = au2.h(v73Var, qz6.a(4));
        if (h.z1() == v73Var.I()) {
            h = h.A1();
            z65.e(h);
        }
        h.W1(u);
    }

    @Override // defpackage.a03
    public int O(float f) {
        return this.a.O(f);
    }

    @Override // defpackage.y73
    public void R(mg0 mg0Var, long j, long j2, long j3, float f, z73 z73Var, wc1 wc1Var, int i) {
        z65.h(mg0Var, "brush");
        z65.h(z73Var, "style");
        this.a.R(mg0Var, j, j2, j3, f, z73Var, wc1Var, i);
    }

    @Override // defpackage.a03
    public float S(long j) {
        return this.a.S(j);
    }

    public final void b(qn0 qn0Var, long j, oz6 oz6Var, sm6.c cVar) {
        z65.h(qn0Var, "canvas");
        z65.h(oz6Var, "coordinator");
        z65.h(cVar, "drawNode");
        int a = qz6.a(4);
        gr6 gr6Var = null;
        while (cVar != null) {
            if (cVar instanceof v73) {
                d(qn0Var, j, oz6Var, (v73) cVar);
            } else if ((cVar.H0() & a) != 0 && (cVar instanceof fu2)) {
                int i = 0;
                for (sm6.c g1 = ((fu2) cVar).g1(); g1 != null; g1 = g1.D0()) {
                    if ((g1.H0() & a) != 0) {
                        i++;
                        if (i == 1) {
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
                if (i == 1) {
                }
            }
            cVar = au2.g(gr6Var);
        }
    }

    @Override // defpackage.y73
    public void c0(eu4 eu4Var, long j, long j2, long j3, long j4, float f, z73 z73Var, wc1 wc1Var, int i, int i2) {
        z65.h(eu4Var, ElementGenerator.TYPE_IMAGE);
        z65.h(z73Var, "style");
        this.a.c0(eu4Var, j, j2, j3, j4, f, z73Var, wc1Var, i, i2);
    }

    public final void d(qn0 qn0Var, long j, oz6 oz6Var, v73 v73Var) {
        z65.h(qn0Var, "canvas");
        z65.h(oz6Var, "coordinator");
        z65.h(v73Var, "drawNode");
        v73 v73Var2 = this.b;
        this.b = v73Var;
        sn0 sn0Var = this.a;
        qm5 layoutDirection = oz6Var.getLayoutDirection();
        sn0.a p = sn0Var.p();
        a03 a = p.a();
        qm5 b = p.b();
        qn0 c = p.c();
        long d = p.d();
        sn0.a p2 = sn0Var.p();
        p2.j(oz6Var);
        p2.k(layoutDirection);
        p2.i(qn0Var);
        p2.l(j);
        qn0Var.l();
        v73Var.q(this);
        qn0Var.g();
        sn0.a p3 = sn0Var.p();
        p3.j(a);
        p3.k(b);
        p3.i(c);
        p3.l(d);
        this.b = v73Var2;
    }

    public final void e(v73 v73Var, qn0 qn0Var) {
        z65.h(v73Var, "<this>");
        z65.h(qn0Var, "canvas");
        oz6 h = au2.h(v73Var, qz6.a(4));
        h.L0().V().d(qn0Var, x55.c(h.a()), h, v73Var);
    }

    @Override // defpackage.y73
    public void g0(or7 or7Var, long j, float f, z73 z73Var, wc1 wc1Var, int i) {
        z65.h(or7Var, "path");
        z65.h(z73Var, "style");
        this.a.g0(or7Var, j, f, z73Var, wc1Var, i);
    }

    @Override // defpackage.a03
    public float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.y73
    public qm5 getLayoutDirection() {
        return this.a.getLayoutDirection();
    }

    @Override // defpackage.a03
    public float k0() {
        return this.a.k0();
    }

    @Override // defpackage.a03
    public float n0(float f) {
        return this.a.n0(f);
    }

    @Override // defpackage.y73
    public s73 o0() {
        return this.a.o0();
    }

    @Override // defpackage.y73
    public void q0(long j, long j2, long j3, long j4, z73 z73Var, float f, wc1 wc1Var, int i) {
        z65.h(z73Var, "style");
        this.a.q0(j, j2, j3, j4, z73Var, f, wc1Var, i);
    }

    @Override // defpackage.y73
    public long s() {
        return this.a.s();
    }

    @Override // defpackage.y73
    public void s0(or7 or7Var, mg0 mg0Var, float f, z73 z73Var, wc1 wc1Var, int i) {
        z65.h(or7Var, "path");
        z65.h(mg0Var, "brush");
        z65.h(z73Var, "style");
        this.a.s0(or7Var, mg0Var, f, z73Var, wc1Var, i);
    }

    @Override // defpackage.y73
    public void t0(long j, long j2, long j3, float f, z73 z73Var, wc1 wc1Var, int i) {
        z65.h(z73Var, "style");
        this.a.t0(j, j2, j3, f, z73Var, wc1Var, i);
    }

    @Override // defpackage.y73
    public long u0() {
        return this.a.u0();
    }

    @Override // defpackage.a03
    public long w0(long j) {
        return this.a.w0(j);
    }

    @Override // defpackage.a03
    public long z(float f) {
        return this.a.z(f);
    }

    public /* synthetic */ gn5(sn0 sn0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new sn0() : sn0Var);
    }
}
