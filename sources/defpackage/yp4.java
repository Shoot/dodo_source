package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.kustoworker.KustoStorage;
import com.facebook.flipper.plugins.databases.DatabaseDriver;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.h53;
import defpackage.kib;
import im.threads.business.transport.MessageAttributes;
import java.util.ArrayList;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HtmlTreeBuilderState.java */
/* renamed from: yp4  reason: default package */
/* loaded from: classes3.dex */
public abstract class yp4 {
    public static final yp4 a = new k("Initial", 0);
    public static final yp4 b = new yp4("BeforeHtml", 1) { // from class: yp4.r
        private boolean H(kib kibVar, xp4 xp4Var) {
            xp4Var.g0("html");
            xp4Var.U0(yp4.c);
            return xp4Var.i(kibVar);
        }

        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            if (kibVar.k()) {
                xp4Var.y(this);
                return false;
            } else if (kibVar.j()) {
                xp4Var.Z(kibVar.b());
                return true;
            } else if (yp4.x(kibVar)) {
                xp4Var.Y(kibVar.a());
                return true;
            } else if (kibVar.n() && kibVar.e().J().equals("html")) {
                xp4Var.V(kibVar.e());
                xp4Var.U0(yp4.c);
                return true;
            } else if (kibVar.m() && wza.d(kibVar.d().J(), z.e)) {
                return H(kibVar, xp4Var);
            } else {
                if (kibVar.m()) {
                    xp4Var.y(this);
                    return false;
                }
                return H(kibVar, xp4Var);
            }
        }
    };
    public static final yp4 c = new yp4("BeforeHead", 2) { // from class: yp4.s
        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            if (yp4.x(kibVar)) {
                xp4Var.Y(kibVar.a());
                return true;
            } else if (kibVar.j()) {
                xp4Var.Z(kibVar.b());
                return true;
            } else if (kibVar.k()) {
                xp4Var.y(this);
                return false;
            } else if (kibVar.n() && kibVar.e().J().equals("html")) {
                return yp4.g.G(kibVar, xp4Var);
            } else {
                if (kibVar.n() && kibVar.e().J().equals("head")) {
                    xp4Var.R0(xp4Var.V(kibVar.e()));
                    xp4Var.U0(yp4.d);
                    return true;
                } else if (kibVar.m() && wza.d(kibVar.d().J(), z.e)) {
                    xp4Var.k("head");
                    return xp4Var.i(kibVar);
                } else if (kibVar.m()) {
                    xp4Var.y(this);
                    return false;
                } else {
                    xp4Var.k("head");
                    return xp4Var.i(kibVar);
                }
            }
        }
    };
    public static final yp4 d = new yp4("InHead", 3) { // from class: yp4.t
        private boolean H(kib kibVar, pmb pmbVar) {
            pmbVar.j("head");
            return pmbVar.i(kibVar);
        }

        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            if (yp4.x(kibVar)) {
                xp4Var.Y(kibVar.a());
                return true;
            }
            int i2 = q.a[kibVar.a.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            return H(kibVar, xp4Var);
                        }
                        String J = kibVar.d().J();
                        if (J.equals("head")) {
                            xp4Var.v0();
                            xp4Var.U0(yp4.f);
                        } else if (wza.d(J, z.c)) {
                            return H(kibVar, xp4Var);
                        } else {
                            if (J.equals("template")) {
                                if (!xp4Var.s0(J)) {
                                    xp4Var.y(this);
                                } else {
                                    xp4Var.D(true);
                                    if (!J.equals(xp4Var.a().C0())) {
                                        xp4Var.y(this);
                                    }
                                    xp4Var.x0(J);
                                    xp4Var.r();
                                    xp4Var.z0();
                                    xp4Var.O0();
                                }
                            } else {
                                xp4Var.y(this);
                                return false;
                            }
                        }
                    } else {
                        kib.h e2 = kibVar.e();
                        String J2 = e2.J();
                        if (J2.equals("html")) {
                            return yp4.g.G(kibVar, xp4Var);
                        }
                        if (wza.d(J2, z.a)) {
                            re3 a0 = xp4Var.a0(e2);
                            if (J2.equals("base") && a0.r("href")) {
                                xp4Var.p0(a0);
                            }
                        } else if (J2.equals("meta")) {
                            xp4Var.a0(e2);
                        } else if (J2.equals("title")) {
                            yp4.w(e2, xp4Var);
                        } else if (wza.d(J2, z.b)) {
                            yp4.u(e2, xp4Var);
                        } else if (J2.equals("noscript")) {
                            xp4Var.V(e2);
                            xp4Var.U0(yp4.e);
                        } else if (J2.equals("script")) {
                            xp4Var.c.x(uib.f);
                            xp4Var.o0();
                            xp4Var.U0(yp4.h);
                            xp4Var.V(e2);
                        } else if (J2.equals("head")) {
                            xp4Var.y(this);
                            return false;
                        } else if (J2.equals("template")) {
                            xp4Var.V(e2);
                            xp4Var.d0();
                            xp4Var.z(false);
                            yp4 yp4Var = yp4.r;
                            xp4Var.U0(yp4Var);
                            xp4Var.E0(yp4Var);
                        } else {
                            return H(kibVar, xp4Var);
                        }
                    }
                } else {
                    xp4Var.y(this);
                    return false;
                }
            } else {
                xp4Var.Z(kibVar.b());
            }
            return true;
        }
    };
    public static final yp4 e = new yp4("InHeadNoscript", 4) { // from class: yp4.u
        private boolean H(kib kibVar, xp4 xp4Var) {
            xp4Var.y(this);
            xp4Var.Y(new kib.c().t(kibVar.toString()));
            return true;
        }

        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            if (kibVar.k()) {
                xp4Var.y(this);
                return true;
            } else if (kibVar.n() && kibVar.e().J().equals("html")) {
                return xp4Var.B0(kibVar, yp4.g);
            } else {
                if (kibVar.m() && kibVar.d().J().equals("noscript")) {
                    xp4Var.v0();
                    xp4Var.U0(yp4.d);
                    return true;
                } else if (!yp4.x(kibVar) && !kibVar.j() && (!kibVar.n() || !wza.d(kibVar.e().J(), z.f))) {
                    if (kibVar.m() && kibVar.d().J().equals("br")) {
                        return H(kibVar, xp4Var);
                    }
                    if ((kibVar.n() && wza.d(kibVar.e().J(), z.I)) || kibVar.m()) {
                        xp4Var.y(this);
                        return false;
                    }
                    return H(kibVar, xp4Var);
                } else {
                    return xp4Var.B0(kibVar, yp4.d);
                }
            }
        }
    };
    public static final yp4 f = new yp4("AfterHead", 5) { // from class: yp4.v
        private boolean H(kib kibVar, xp4 xp4Var) {
            xp4Var.k("body");
            xp4Var.z(true);
            return xp4Var.i(kibVar);
        }

        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            if (yp4.x(kibVar)) {
                xp4Var.Y(kibVar.a());
                return true;
            } else if (kibVar.j()) {
                xp4Var.Z(kibVar.b());
                return true;
            } else if (kibVar.k()) {
                xp4Var.y(this);
                return true;
            } else if (kibVar.n()) {
                kib.h e2 = kibVar.e();
                String J = e2.J();
                if (J.equals("html")) {
                    return xp4Var.B0(kibVar, yp4.g);
                }
                if (J.equals("body")) {
                    xp4Var.V(e2);
                    xp4Var.z(false);
                    xp4Var.U0(yp4.g);
                    return true;
                } else if (J.equals("frameset")) {
                    xp4Var.V(e2);
                    xp4Var.U0(yp4.t);
                    return true;
                } else if (wza.d(J, z.g)) {
                    xp4Var.y(this);
                    re3 J2 = xp4Var.J();
                    xp4Var.C0(J2);
                    xp4Var.B0(kibVar, yp4.d);
                    xp4Var.I0(J2);
                    return true;
                } else if (J.equals("head")) {
                    xp4Var.y(this);
                    return false;
                } else {
                    H(kibVar, xp4Var);
                    return true;
                }
            } else if (kibVar.m()) {
                String J3 = kibVar.d().J();
                if (wza.d(J3, z.d)) {
                    H(kibVar, xp4Var);
                    return true;
                } else if (J3.equals("template")) {
                    xp4Var.B0(kibVar, yp4.d);
                    return true;
                } else {
                    xp4Var.y(this);
                    return false;
                }
            } else {
                H(kibVar, xp4Var);
                return true;
            }
        }
    };
    public static final yp4 g = new yp4("InBody", 6) { // from class: yp4.w
        private boolean K(kib kibVar, xp4 xp4Var) {
            kib.g d2 = kibVar.d();
            String J = d2.J();
            J.hashCode();
            char c2 = 65535;
            switch (J.hashCode()) {
                case -1321546630:
                    if (J.equals("template")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 112:
                    if (J.equals("p")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3152:
                    if (J.equals("br")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 3200:
                    if (J.equals("dd")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 3216:
                    if (J.equals("dt")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 3273:
                    if (J.equals("h1")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 3274:
                    if (J.equals("h2")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 3275:
                    if (J.equals("h3")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 3276:
                    if (J.equals("h4")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case 3277:
                    if (J.equals("h5")) {
                        c2 = '\t';
                        break;
                    }
                    break;
                case 3278:
                    if (J.equals("h6")) {
                        c2 = '\n';
                        break;
                    }
                    break;
                case 3453:
                    if (J.equals("li")) {
                        c2 = 11;
                        break;
                    }
                    break;
                case 3029410:
                    if (J.equals("body")) {
                        c2 = '\f';
                        break;
                    }
                    break;
                case 3148996:
                    if (J.equals("form")) {
                        c2 = '\r';
                        break;
                    }
                    break;
                case 3213227:
                    if (J.equals("html")) {
                        c2 = 14;
                        break;
                    }
                    break;
                case 3536714:
                    if (J.equals("span")) {
                        c2 = 15;
                        break;
                    }
                    break;
                case 1869063452:
                    if (J.equals("sarcasm")) {
                        c2 = 16;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    xp4Var.B0(kibVar, yp4.d);
                    break;
                case 1:
                    if (!xp4Var.M(J)) {
                        xp4Var.y(this);
                        xp4Var.k(J);
                        return xp4Var.i(d2);
                    }
                    xp4Var.C(J);
                    if (!xp4Var.b(J)) {
                        xp4Var.y(this);
                    }
                    xp4Var.x0(J);
                    break;
                case 2:
                    xp4Var.y(this);
                    xp4Var.k("br");
                    return false;
                case 3:
                case 4:
                    if (!xp4Var.O(J)) {
                        xp4Var.y(this);
                        return false;
                    }
                    xp4Var.C(J);
                    if (!xp4Var.b(J)) {
                        xp4Var.y(this);
                    }
                    xp4Var.x0(J);
                    break;
                case 5:
                case 6:
                case 7:
                case '\b':
                case '\t':
                case '\n':
                    String[] strArr = z.i;
                    if (!xp4Var.Q(strArr)) {
                        xp4Var.y(this);
                        return false;
                    }
                    xp4Var.C(J);
                    if (!xp4Var.b(J)) {
                        xp4Var.y(this);
                    }
                    xp4Var.y0(strArr);
                    break;
                case 11:
                    if (!xp4Var.N(J)) {
                        xp4Var.y(this);
                        return false;
                    }
                    xp4Var.C(J);
                    if (!xp4Var.b(J)) {
                        xp4Var.y(this);
                    }
                    xp4Var.x0(J);
                    break;
                case '\f':
                    if (!xp4Var.O("body")) {
                        xp4Var.y(this);
                        return false;
                    }
                    H(kibVar, xp4Var);
                    xp4Var.U0(yp4.s);
                    break;
                case '\r':
                    if (!xp4Var.s0("template")) {
                        l54 H = xp4Var.H();
                        xp4Var.P0(null);
                        if (H != null && xp4Var.O(J)) {
                            xp4Var.B();
                            if (!xp4Var.b(J)) {
                                xp4Var.y(this);
                            }
                            xp4Var.I0(H);
                            break;
                        } else {
                            xp4Var.y(this);
                            return false;
                        }
                    } else if (!xp4Var.O(J)) {
                        xp4Var.y(this);
                        return false;
                    } else {
                        xp4Var.B();
                        if (!xp4Var.b(J)) {
                            xp4Var.y(this);
                        }
                        xp4Var.x0(J);
                        break;
                    }
                case 14:
                    if (xp4Var.j("body")) {
                        return xp4Var.i(d2);
                    }
                    break;
                case 15:
                case 16:
                    return H(kibVar, xp4Var);
                default:
                    if (wza.d(J, z.q)) {
                        return L(kibVar, xp4Var);
                    }
                    if (wza.d(J, z.p)) {
                        if (!xp4Var.O(J)) {
                            xp4Var.y(this);
                            return false;
                        }
                        xp4Var.B();
                        if (!xp4Var.b(J)) {
                            xp4Var.y(this);
                        }
                        xp4Var.x0(J);
                        break;
                    } else if (wza.d(J, z.l)) {
                        if (!xp4Var.O(Action.NAME_ATTRIBUTE)) {
                            if (!xp4Var.O(J)) {
                                xp4Var.y(this);
                                return false;
                            }
                            xp4Var.B();
                            if (!xp4Var.b(J)) {
                                xp4Var.y(this);
                            }
                            xp4Var.x0(J);
                            xp4Var.r();
                            break;
                        }
                    } else {
                        return H(kibVar, xp4Var);
                    }
                    break;
            }
            return true;
        }

        private boolean L(kib kibVar, xp4 xp4Var) {
            String J = kibVar.d().J();
            ArrayList<re3> L = xp4Var.L();
            boolean z2 = false;
            int i2 = 0;
            while (i2 < 8) {
                re3 E = xp4Var.E(J);
                if (E == null) {
                    return H(kibVar, xp4Var);
                }
                if (!xp4Var.r0(E)) {
                    xp4Var.y(this);
                    xp4Var.H0(E);
                    return true;
                } else if (!xp4Var.O(E.C0())) {
                    xp4Var.y(this);
                    return z2;
                } else {
                    if (xp4Var.a() != E) {
                        xp4Var.y(this);
                    }
                    int size = L.size();
                    re3 re3Var = null;
                    int i3 = -1;
                    re3 re3Var2 = null;
                    int i4 = 1;
                    boolean z3 = false;
                    while (true) {
                        if (i4 >= size || i4 >= 64) {
                            break;
                        }
                        re3 re3Var3 = L.get(i4);
                        if (re3Var3 == E) {
                            re3Var2 = L.get(i4 - 1);
                            i3 = xp4Var.A0(re3Var3);
                            z3 = true;
                        } else if (z3 && xp4Var.m0(re3Var3)) {
                            re3Var = re3Var3;
                            break;
                        }
                        i4++;
                    }
                    if (re3Var == null) {
                        xp4Var.x0(E.C0());
                        xp4Var.H0(E);
                        return true;
                    }
                    re3 re3Var4 = re3Var;
                    re3 re3Var5 = re3Var4;
                    for (int i5 = 0; i5 < 3; i5++) {
                        if (xp4Var.r0(re3Var4)) {
                            re3Var4 = xp4Var.p(re3Var4);
                        }
                        if (!xp4Var.k0(re3Var4)) {
                            xp4Var.I0(re3Var4);
                        } else if (re3Var4 == E) {
                            break;
                        } else {
                            re3 re3Var6 = new re3(xp4Var.n(re3Var4.y(), br7.d), xp4Var.F());
                            xp4Var.K0(re3Var4, re3Var6);
                            xp4Var.M0(re3Var4, re3Var6);
                            if (re3Var5 == re3Var) {
                                i3 = xp4Var.A0(re3Var6) + 1;
                            }
                            if (re3Var5.G() != null) {
                                re3Var5.K();
                            }
                            re3Var6.Z(re3Var5);
                            re3Var4 = re3Var6;
                            re3Var5 = re3Var4;
                        }
                    }
                    if (re3Var2 != null) {
                        if (wza.d(re3Var2.C0(), z.r)) {
                            if (re3Var5.G() != null) {
                                re3Var5.K();
                            }
                            xp4Var.c0(re3Var5);
                        } else {
                            if (re3Var5.G() != null) {
                                re3Var5.K();
                            }
                            re3Var2.Z(re3Var5);
                        }
                    }
                    re3 re3Var7 = new re3(E.R0(), xp4Var.F());
                    re3Var7.f().p(E.f());
                    re3Var7.a0(re3Var.l());
                    re3Var.Z(re3Var7);
                    xp4Var.H0(E);
                    xp4Var.F0(re3Var7, i3);
                    xp4Var.I0(E);
                    xp4Var.f0(re3Var, re3Var7);
                    i2++;
                    z2 = false;
                }
            }
            return true;
        }

        private boolean M(kib kibVar, xp4 xp4Var) {
            re3 I;
            l54 H;
            kib.h e2 = kibVar.e();
            String J = e2.J();
            J.hashCode();
            char c2 = 65535;
            switch (J.hashCode()) {
                case -1644953643:
                    if (J.equals("frameset")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1377687758:
                    if (J.equals("button")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1191214428:
                    if (J.equals("iframe")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1134665583:
                    if (J.equals("keygen")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1010136971:
                    if (J.equals("option")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1003243718:
                    if (J.equals("textarea")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -906021636:
                    if (J.equals(DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT)) {
                        c2 = 6;
                        break;
                    }
                    break;
                case -891985998:
                    if (J.equals("strike")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case -891980137:
                    if (J.equals("strong")) {
                        c2 = '\b';
                        break;
                    }
                    break;
                case -80773204:
                    if (J.equals("optgroup")) {
                        c2 = '\t';
                        break;
                    }
                    break;
                case 97:
                    if (J.equals("a")) {
                        c2 = '\n';
                        break;
                    }
                    break;
                case 98:
                    if (J.equals("b")) {
                        c2 = 11;
                        break;
                    }
                    break;
                case 105:
                    if (J.equals("i")) {
                        c2 = '\f';
                        break;
                    }
                    break;
                case 115:
                    if (J.equals(Image.TYPE_SMALL)) {
                        c2 = '\r';
                        break;
                    }
                    break;
                case 117:
                    if (J.equals("u")) {
                        c2 = 14;
                        break;
                    }
                    break;
                case 3152:
                    if (J.equals("br")) {
                        c2 = 15;
                        break;
                    }
                    break;
                case 3200:
                    if (J.equals("dd")) {
                        c2 = 16;
                        break;
                    }
                    break;
                case 3216:
                    if (J.equals("dt")) {
                        c2 = 17;
                        break;
                    }
                    break;
                case 3240:
                    if (J.equals("em")) {
                        c2 = 18;
                        break;
                    }
                    break;
                case 3273:
                    if (J.equals("h1")) {
                        c2 = 19;
                        break;
                    }
                    break;
                case 3274:
                    if (J.equals("h2")) {
                        c2 = 20;
                        break;
                    }
                    break;
                case 3275:
                    if (J.equals("h3")) {
                        c2 = 21;
                        break;
                    }
                    break;
                case 3276:
                    if (J.equals("h4")) {
                        c2 = 22;
                        break;
                    }
                    break;
                case 3277:
                    if (J.equals("h5")) {
                        c2 = 23;
                        break;
                    }
                    break;
                case 3278:
                    if (J.equals("h6")) {
                        c2 = 24;
                        break;
                    }
                    break;
                case 3338:
                    if (J.equals("hr")) {
                        c2 = 25;
                        break;
                    }
                    break;
                case 3453:
                    if (J.equals("li")) {
                        c2 = 26;
                        break;
                    }
                    break;
                case 3646:
                    if (J.equals("rp")) {
                        c2 = 27;
                        break;
                    }
                    break;
                case 3650:
                    if (J.equals("rt")) {
                        c2 = 28;
                        break;
                    }
                    break;
                case 3712:
                    if (J.equals("tt")) {
                        c2 = 29;
                        break;
                    }
                    break;
                case 97536:
                    if (J.equals("big")) {
                        c2 = 30;
                        break;
                    }
                    break;
                case 104387:
                    if (J.equals("img")) {
                        c2 = 31;
                        break;
                    }
                    break;
                case 111267:
                    if (J.equals("pre")) {
                        c2 = ' ';
                        break;
                    }
                    break;
                case 114276:
                    if (J.equals("svg")) {
                        c2 = '!';
                        break;
                    }
                    break;
                case 117511:
                    if (J.equals("wbr")) {
                        c2 = CoreConstants.DOUBLE_QUOTE_CHAR;
                        break;
                    }
                    break;
                case 118811:
                    if (J.equals("xmp")) {
                        c2 = '#';
                        break;
                    }
                    break;
                case 3002509:
                    if (J.equals("area")) {
                        c2 = CoreConstants.DOLLAR;
                        break;
                    }
                    break;
                case 3029410:
                    if (J.equals("body")) {
                        c2 = CoreConstants.PERCENT_CHAR;
                        break;
                    }
                    break;
                case 3059181:
                    if (J.equals("code")) {
                        c2 = '&';
                        break;
                    }
                    break;
                case 3148879:
                    if (J.equals("font")) {
                        c2 = CoreConstants.SINGLE_QUOTE_CHAR;
                        break;
                    }
                    break;
                case 3148996:
                    if (J.equals("form")) {
                        c2 = CoreConstants.LEFT_PARENTHESIS_CHAR;
                        break;
                    }
                    break;
                case 3213227:
                    if (J.equals("html")) {
                        c2 = CoreConstants.RIGHT_PARENTHESIS_CHAR;
                        break;
                    }
                    break;
                case 3344136:
                    if (J.equals("math")) {
                        c2 = '*';
                        break;
                    }
                    break;
                case 3386833:
                    if (J.equals("nobr")) {
                        c2 = '+';
                        break;
                    }
                    break;
                case 3536714:
                    if (J.equals("span")) {
                        c2 = CoreConstants.COMMA_CHAR;
                        break;
                    }
                    break;
                case 96620249:
                    if (J.equals("embed")) {
                        c2 = CoreConstants.DASH_CHAR;
                        break;
                    }
                    break;
                case 100313435:
                    if (J.equals(ElementGenerator.TYPE_IMAGE)) {
                        c2 = CoreConstants.DOT;
                        break;
                    }
                    break;
                case 100358090:
                    if (J.equals("input")) {
                        c2 = '/';
                        break;
                    }
                    break;
                case 109548807:
                    if (J.equals("small")) {
                        c2 = '0';
                        break;
                    }
                    break;
                case 110115790:
                    if (J.equals("table")) {
                        c2 = '1';
                        break;
                    }
                    break;
                case 181975684:
                    if (J.equals("listing")) {
                        c2 = '2';
                        break;
                    }
                    break;
                case 1973234167:
                    if (J.equals("plaintext")) {
                        c2 = '3';
                        break;
                    }
                    break;
                case 2091304424:
                    if (J.equals("isindex")) {
                        c2 = '4';
                        break;
                    }
                    break;
                case 2115613112:
                    if (J.equals("noembed")) {
                        c2 = '5';
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    xp4Var.y(this);
                    ArrayList<re3> L = xp4Var.L();
                    if (L.size() != 1) {
                        if ((L.size() <= 2 || L.get(1).C0().equals("body")) && xp4Var.A()) {
                            re3 re3Var = L.get(1);
                            if (re3Var.G() != null) {
                                re3Var.K();
                            }
                            while (L.size() > 1) {
                                L.remove(L.size() - 1);
                            }
                            xp4Var.V(e2);
                            xp4Var.U0(yp4.t);
                            return true;
                        }
                        return false;
                    }
                    return false;
                case 1:
                    if (xp4Var.M("button")) {
                        xp4Var.y(this);
                        xp4Var.j("button");
                        xp4Var.i(e2);
                        return true;
                    }
                    xp4Var.G0();
                    xp4Var.V(e2);
                    xp4Var.z(false);
                    return true;
                case 2:
                    xp4Var.z(false);
                    yp4.u(e2, xp4Var);
                    break;
                case 3:
                case 15:
                case 31:
                case '\"':
                case '$':
                case '-':
                    xp4Var.G0();
                    xp4Var.a0(e2);
                    xp4Var.z(false);
                    break;
                case 4:
                case '\t':
                    if (xp4Var.b("option")) {
                        xp4Var.j("option");
                    }
                    xp4Var.G0();
                    xp4Var.V(e2);
                    break;
                case 5:
                    xp4Var.V(e2);
                    if (!e2.F()) {
                        xp4Var.c.x(uib.c);
                        xp4Var.o0();
                        xp4Var.z(false);
                        xp4Var.U0(yp4.h);
                        break;
                    }
                    break;
                case 6:
                    xp4Var.G0();
                    xp4Var.V(e2);
                    xp4Var.z(false);
                    if (!e2.m) {
                        yp4 S0 = xp4Var.S0();
                        if (!S0.equals(yp4.i) && !S0.equals(yp4.k) && !S0.equals(yp4.m) && !S0.equals(yp4.n) && !S0.equals(yp4.o)) {
                            xp4Var.U0(yp4.p);
                            break;
                        } else {
                            xp4Var.U0(yp4.q);
                            break;
                        }
                    }
                    break;
                case 7:
                case '\b':
                case 11:
                case '\f':
                case '\r':
                case 14:
                case 18:
                case 29:
                case 30:
                case '&':
                case '\'':
                case '0':
                    xp4Var.G0();
                    xp4Var.D0(xp4Var.V(e2));
                    break;
                case '\n':
                    if (xp4Var.E("a") != null) {
                        xp4Var.y(this);
                        xp4Var.j("a");
                        re3 I2 = xp4Var.I("a");
                        if (I2 != null) {
                            xp4Var.H0(I2);
                            xp4Var.I0(I2);
                        }
                    }
                    xp4Var.G0();
                    xp4Var.D0(xp4Var.V(e2));
                    break;
                case 16:
                case 17:
                    xp4Var.z(false);
                    ArrayList<re3> L2 = xp4Var.L();
                    int size = L2.size();
                    int i2 = size - 1;
                    int i3 = i2 >= 24 ? size - 25 : 0;
                    while (true) {
                        if (i2 >= i3) {
                            re3 re3Var2 = L2.get(i2);
                            if (wza.d(re3Var2.C0(), z.k)) {
                                xp4Var.j(re3Var2.C0());
                            } else if (!xp4Var.m0(re3Var2) || wza.d(re3Var2.C0(), z.j)) {
                                i2--;
                            }
                        }
                    }
                    if (xp4Var.M("p")) {
                        xp4Var.j("p");
                    }
                    xp4Var.V(e2);
                    break;
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    if (xp4Var.M("p")) {
                        xp4Var.j("p");
                    }
                    if (wza.d(xp4Var.a().C0(), z.i)) {
                        xp4Var.y(this);
                        xp4Var.v0();
                    }
                    xp4Var.V(e2);
                    break;
                case 25:
                    if (xp4Var.M("p")) {
                        xp4Var.j("p");
                    }
                    xp4Var.a0(e2);
                    xp4Var.z(false);
                    break;
                case 26:
                    xp4Var.z(false);
                    ArrayList<re3> L3 = xp4Var.L();
                    int size2 = L3.size() - 1;
                    while (true) {
                        if (size2 > 0) {
                            re3 re3Var3 = L3.get(size2);
                            if (re3Var3.C0().equals("li")) {
                                xp4Var.j("li");
                            } else if (!xp4Var.m0(re3Var3) || wza.d(re3Var3.C0(), z.j)) {
                                size2--;
                            }
                        }
                    }
                    if (xp4Var.M("p")) {
                        xp4Var.j("p");
                    }
                    xp4Var.V(e2);
                    break;
                case 27:
                case 28:
                    if (xp4Var.O("ruby")) {
                        xp4Var.B();
                        if (!xp4Var.b("ruby")) {
                            xp4Var.y(this);
                            xp4Var.w0("ruby");
                        }
                        xp4Var.V(e2);
                        break;
                    }
                    break;
                case ' ':
                case '2':
                    if (xp4Var.M("p")) {
                        xp4Var.j("p");
                    }
                    xp4Var.V(e2);
                    xp4Var.b.E("\n");
                    xp4Var.z(false);
                    break;
                case '!':
                    xp4Var.G0();
                    xp4Var.V(e2);
                    break;
                case '#':
                    if (xp4Var.M("p")) {
                        xp4Var.j("p");
                    }
                    xp4Var.G0();
                    xp4Var.z(false);
                    yp4.u(e2, xp4Var);
                    break;
                case '%':
                    xp4Var.y(this);
                    ArrayList<re3> L4 = xp4Var.L();
                    if (L4.size() == 1) {
                        return false;
                    }
                    if ((L4.size() > 2 && !L4.get(1).C0().equals("body")) || xp4Var.s0("template")) {
                        return false;
                    }
                    xp4Var.z(false);
                    if (e2.E() && (I = xp4Var.I("body")) != null) {
                        Iterator<az> it = e2.n.iterator();
                        while (it.hasNext()) {
                            az next = it.next();
                            if (!I.r(next.getKey())) {
                                I.f().T(next);
                            }
                        }
                        break;
                    }
                    break;
                case '(':
                    if (xp4Var.H() != null && !xp4Var.s0("template")) {
                        xp4Var.y(this);
                        return false;
                    }
                    if (xp4Var.M("p")) {
                        xp4Var.w("p");
                    }
                    xp4Var.b0(e2, true, true);
                    break;
                    break;
                case ')':
                    xp4Var.y(this);
                    if (!xp4Var.s0("template")) {
                        if (xp4Var.L().size() > 0) {
                            re3 re3Var4 = xp4Var.L().get(0);
                            if (e2.E()) {
                                Iterator<az> it2 = e2.n.iterator();
                                while (it2.hasNext()) {
                                    az next2 = it2.next();
                                    if (!re3Var4.r(next2.getKey())) {
                                        re3Var4.f().T(next2);
                                    }
                                }
                                break;
                            }
                        }
                    } else {
                        return false;
                    }
                    break;
                case '*':
                    xp4Var.G0();
                    xp4Var.V(e2);
                    break;
                case '+':
                    xp4Var.G0();
                    if (xp4Var.O("nobr")) {
                        xp4Var.y(this);
                        xp4Var.j("nobr");
                        xp4Var.G0();
                    }
                    xp4Var.D0(xp4Var.V(e2));
                    break;
                case ',':
                    xp4Var.G0();
                    xp4Var.V(e2);
                    break;
                case '.':
                    if (xp4Var.I("svg") == null) {
                        return xp4Var.i(e2.G("img"));
                    }
                    xp4Var.V(e2);
                    break;
                case '/':
                    xp4Var.G0();
                    if (!xp4Var.a0(e2).e(MessageAttributes.TYPE).equalsIgnoreCase("hidden")) {
                        xp4Var.z(false);
                        break;
                    }
                    break;
                case '1':
                    if (xp4Var.G().i1() != h53.b.quirks && xp4Var.M("p")) {
                        xp4Var.j("p");
                    }
                    xp4Var.V(e2);
                    xp4Var.z(false);
                    xp4Var.U0(yp4.i);
                    break;
                case '3':
                    if (xp4Var.M("p")) {
                        xp4Var.j("p");
                    }
                    xp4Var.V(e2);
                    xp4Var.c.x(uib.g);
                    break;
                case '4':
                    xp4Var.y(this);
                    if (xp4Var.H() == null) {
                        xp4Var.k("form");
                        if (e2.D("action") && (H = xp4Var.H()) != null && e2.D("action")) {
                            H.f().U("action", e2.n.C("action"));
                        }
                        xp4Var.k("hr");
                        xp4Var.k("label");
                        xp4Var.i(new kib.c().t(e2.D("prompt") ? e2.n.C("prompt") : "This is a searchable index. Enter search keywords: "));
                        hz hzVar = new hz();
                        if (e2.E()) {
                            Iterator<az> it3 = e2.n.iterator();
                            while (it3.hasNext()) {
                                az next3 = it3.next();
                                if (!wza.d(next3.getKey(), z.n)) {
                                    hzVar.T(next3);
                                }
                            }
                        }
                        hzVar.U(Action.NAME_ATTRIBUTE, "isindex");
                        xp4Var.l("input", hzVar);
                        xp4Var.j("label");
                        xp4Var.k("hr");
                        xp4Var.j("form");
                        break;
                    } else {
                        return false;
                    }
                case '5':
                    yp4.u(e2, xp4Var);
                    break;
                default:
                    if (!g6b.j(J)) {
                        xp4Var.V(e2);
                    } else if (wza.d(J, z.h)) {
                        if (xp4Var.M("p")) {
                            xp4Var.j("p");
                        }
                        xp4Var.V(e2);
                    } else if (wza.d(J, z.g)) {
                        return xp4Var.B0(kibVar, yp4.d);
                    } else {
                        if (wza.d(J, z.l)) {
                            xp4Var.G0();
                            xp4Var.V(e2);
                            xp4Var.d0();
                            xp4Var.z(false);
                        } else if (wza.d(J, z.m)) {
                            xp4Var.a0(e2);
                        } else if (wza.d(J, z.o)) {
                            xp4Var.y(this);
                            return false;
                        } else {
                            xp4Var.G0();
                            xp4Var.V(e2);
                            break;
                        }
                    }
                    break;
            }
            return true;
        }

        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            switch (q.a[kibVar.a.ordinal()]) {
                case 1:
                    xp4Var.Z(kibVar.b());
                    return true;
                case 2:
                    xp4Var.y(this);
                    return false;
                case 3:
                    return M(kibVar, xp4Var);
                case 4:
                    return K(kibVar, xp4Var);
                case 5:
                    kib.c a2 = kibVar.a();
                    if (a2.u().equals(yp4.y)) {
                        xp4Var.y(this);
                        return false;
                    } else if (xp4Var.A() && yp4.x(a2)) {
                        xp4Var.G0();
                        xp4Var.Y(a2);
                        return true;
                    } else {
                        xp4Var.G0();
                        xp4Var.Y(a2);
                        xp4Var.z(false);
                        return true;
                    }
                case 6:
                    if (xp4Var.T0() > 0) {
                        return xp4Var.B0(kibVar, yp4.r);
                    }
                    return true;
                default:
                    return true;
            }
        }

        boolean H(kib kibVar, xp4 xp4Var) {
            String str = kibVar.d().e;
            ArrayList<re3> L = xp4Var.L();
            if (xp4Var.I(str) == null) {
                xp4Var.y(this);
                return false;
            }
            int size = L.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                re3 re3Var = L.get(size);
                if (re3Var.C0().equals(str)) {
                    xp4Var.C(str);
                    if (!xp4Var.b(str)) {
                        xp4Var.y(this);
                    }
                    xp4Var.x0(str);
                } else if (xp4Var.m0(re3Var)) {
                    xp4Var.y(this);
                    return false;
                } else {
                    size--;
                }
            }
            return true;
        }
    };
    public static final yp4 h = new yp4("Text", 7) { // from class: yp4.x
        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            if (kibVar.i()) {
                xp4Var.Y(kibVar.a());
                return true;
            } else if (kibVar.l()) {
                xp4Var.y(this);
                xp4Var.v0();
                xp4Var.U0(xp4Var.u0());
                return xp4Var.i(kibVar);
            } else if (kibVar.m()) {
                xp4Var.v0();
                xp4Var.U0(xp4Var.u0());
                return true;
            } else {
                return true;
            }
        }
    };
    public static final yp4 i = new yp4("InTable", 8) { // from class: yp4.y
        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            if (kibVar.i() && wza.d(xp4Var.a().C0(), z.A)) {
                xp4Var.q0();
                xp4Var.o0();
                xp4Var.U0(yp4.j);
                return xp4Var.i(kibVar);
            } else if (kibVar.j()) {
                xp4Var.Z(kibVar.b());
                return true;
            } else if (kibVar.k()) {
                xp4Var.y(this);
                return false;
            } else if (kibVar.n()) {
                kib.h e2 = kibVar.e();
                String J = e2.J();
                if (J.equals("caption")) {
                    xp4Var.u();
                    xp4Var.d0();
                    xp4Var.V(e2);
                    xp4Var.U0(yp4.k);
                } else if (J.equals("colgroup")) {
                    xp4Var.u();
                    xp4Var.V(e2);
                    xp4Var.U0(yp4.l);
                } else if (J.equals("col")) {
                    xp4Var.u();
                    xp4Var.k("colgroup");
                    return xp4Var.i(kibVar);
                } else if (wza.d(J, z.s)) {
                    xp4Var.u();
                    xp4Var.V(e2);
                    xp4Var.U0(yp4.m);
                } else if (wza.d(J, z.t)) {
                    xp4Var.u();
                    xp4Var.k("tbody");
                    return xp4Var.i(kibVar);
                } else if (J.equals("table")) {
                    xp4Var.y(this);
                    if (!xp4Var.U(J)) {
                        return false;
                    }
                    xp4Var.x0(J);
                    if (!xp4Var.O0()) {
                        xp4Var.V(e2);
                        return true;
                    }
                    return xp4Var.i(kibVar);
                } else if (wza.d(J, z.u)) {
                    return xp4Var.B0(kibVar, yp4.d);
                } else {
                    if (J.equals("input")) {
                        if (e2.E() && e2.n.C(MessageAttributes.TYPE).equalsIgnoreCase("hidden")) {
                            xp4Var.a0(e2);
                        } else {
                            return H(kibVar, xp4Var);
                        }
                    } else if (J.equals("form")) {
                        xp4Var.y(this);
                        if (xp4Var.H() != null || xp4Var.s0("template")) {
                            return false;
                        }
                        xp4Var.b0(e2, false, false);
                    } else {
                        return H(kibVar, xp4Var);
                    }
                }
                return true;
            } else if (kibVar.m()) {
                String J2 = kibVar.d().J();
                if (J2.equals("table")) {
                    if (!xp4Var.U(J2)) {
                        xp4Var.y(this);
                        return false;
                    }
                    xp4Var.x0("table");
                    xp4Var.O0();
                } else if (wza.d(J2, z.z)) {
                    xp4Var.y(this);
                    return false;
                } else if (J2.equals("template")) {
                    xp4Var.B0(kibVar, yp4.d);
                } else {
                    return H(kibVar, xp4Var);
                }
                return true;
            } else if (kibVar.l()) {
                if (xp4Var.b("html")) {
                    xp4Var.y(this);
                }
                return true;
            } else {
                return H(kibVar, xp4Var);
            }
        }

        boolean H(kib kibVar, xp4 xp4Var) {
            xp4Var.y(this);
            xp4Var.Q0(true);
            xp4Var.B0(kibVar, yp4.g);
            xp4Var.Q0(false);
            return true;
        }
    };
    public static final yp4 j = new yp4("InTableText", 9) { // from class: yp4.a
        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            if (kibVar.a == kib.j.Character) {
                kib.c a2 = kibVar.a();
                if (a2.u().equals(yp4.y)) {
                    xp4Var.y(this);
                    return false;
                }
                xp4Var.K().add(a2.u());
                return true;
            }
            if (xp4Var.K().size() > 0) {
                for (String str : xp4Var.K()) {
                    if (!yp4.E(str)) {
                        xp4Var.y(this);
                        if (wza.d(xp4Var.a().C0(), z.A)) {
                            xp4Var.Q0(true);
                            xp4Var.B0(new kib.c().t(str), yp4.g);
                            xp4Var.Q0(false);
                        } else {
                            xp4Var.B0(new kib.c().t(str), yp4.g);
                        }
                    } else {
                        xp4Var.Y(new kib.c().t(str));
                    }
                }
                xp4Var.q0();
            }
            xp4Var.U0(xp4Var.u0());
            return xp4Var.i(kibVar);
        }
    };
    public static final yp4 k = new yp4("InCaption", 10) { // from class: yp4.b
        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            if (kibVar.m() && kibVar.d().J().equals("caption")) {
                if (!xp4Var.U(kibVar.d().J())) {
                    xp4Var.y(this);
                    return false;
                }
                xp4Var.B();
                if (!xp4Var.b("caption")) {
                    xp4Var.y(this);
                }
                xp4Var.x0("caption");
                xp4Var.r();
                xp4Var.U0(yp4.i);
                return true;
            } else if ((kibVar.n() && wza.d(kibVar.e().J(), z.y)) || (kibVar.m() && kibVar.d().J().equals("table"))) {
                xp4Var.y(this);
                if (xp4Var.j("caption")) {
                    return xp4Var.i(kibVar);
                }
                return true;
            } else if (kibVar.m() && wza.d(kibVar.d().J(), z.J)) {
                xp4Var.y(this);
                return false;
            } else {
                return xp4Var.B0(kibVar, yp4.g);
            }
        }
    };
    public static final yp4 l = new yp4("InColumnGroup", 11) { // from class: yp4.c
        private boolean H(kib kibVar, xp4 xp4Var) {
            if (!xp4Var.b("colgroup")) {
                xp4Var.y(this);
                return false;
            }
            xp4Var.v0();
            xp4Var.U0(yp4.i);
            xp4Var.i(kibVar);
            return true;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
            if (r3.equals("html") == false) goto L38;
         */
        @Override // defpackage.yp4
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        boolean G(defpackage.kib r10, defpackage.xp4 r11) {
            /*
                r9 = this;
                boolean r0 = defpackage.yp4.i(r10)
                r1 = 1
                if (r0 == 0) goto Lf
                kib$c r10 = r10.a()
                r11.Y(r10)
                return r1
            Lf:
                int[] r0 = defpackage.yp4.q.a
                kib$j r2 = r10.a
                int r2 = r2.ordinal()
                r0 = r0[r2]
                if (r0 == r1) goto Lc0
                r2 = 2
                if (r0 == r2) goto Lbc
                r3 = 3
                r4 = 0
                java.lang.String r5 = "template"
                java.lang.String r6 = "html"
                if (r0 == r3) goto L74
                r2 = 4
                if (r0 == r2) goto L3d
                r2 = 6
                if (r0 == r2) goto L31
                boolean r10 = r9.H(r10, r11)
                return r10
            L31:
                boolean r0 = r11.b(r6)
                if (r0 == 0) goto L38
                return r1
            L38:
                boolean r10 = r9.H(r10, r11)
                return r10
            L3d:
                kib$g r0 = r10.d()
                java.lang.String r0 = r0.J()
                r0.hashCode()
                boolean r2 = r0.equals(r5)
                if (r2 != 0) goto L6e
                java.lang.String r2 = "colgroup"
                boolean r2 = r0.equals(r2)
                if (r2 != 0) goto L5b
                boolean r10 = r9.H(r10, r11)
                return r10
            L5b:
                boolean r10 = r11.b(r0)
                if (r10 != 0) goto L65
                r11.y(r9)
                return r4
            L65:
                r11.v0()
                yp4 r10 = defpackage.yp4.i
                r11.U0(r10)
                goto Lc7
            L6e:
                yp4 r0 = defpackage.yp4.d
                r11.B0(r10, r0)
                goto Lc7
            L74:
                kib$h r0 = r10.e()
                java.lang.String r3 = r0.J()
                r3.hashCode()
                int r7 = r3.hashCode()
                r8 = -1
                switch(r7) {
                    case -1321546630: goto L9b;
                    case 98688: goto L90;
                    case 3213227: goto L89;
                    default: goto L87;
                }
            L87:
                r2 = -1
                goto La3
            L89:
                boolean r3 = r3.equals(r6)
                if (r3 != 0) goto La3
                goto L87
            L90:
                java.lang.String r2 = "col"
                boolean r2 = r3.equals(r2)
                if (r2 != 0) goto L99
                goto L87
            L99:
                r2 = 1
                goto La3
            L9b:
                boolean r2 = r3.equals(r5)
                if (r2 != 0) goto La2
                goto L87
            La2:
                r2 = 0
            La3:
                switch(r2) {
                    case 0: goto Lb6;
                    case 1: goto Lb2;
                    case 2: goto Lab;
                    default: goto La6;
                }
            La6:
                boolean r10 = r9.H(r10, r11)
                return r10
            Lab:
                yp4 r0 = defpackage.yp4.g
                boolean r10 = r11.B0(r10, r0)
                return r10
            Lb2:
                r11.a0(r0)
                goto Lc7
            Lb6:
                yp4 r0 = defpackage.yp4.d
                r11.B0(r10, r0)
                goto Lc7
            Lbc:
                r11.y(r9)
                goto Lc7
            Lc0:
                kib$d r10 = r10.b()
                r11.Z(r10)
            Lc7:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.yp4.c.G(kib, xp4):boolean");
        }
    };
    public static final yp4 m = new yp4("InTableBody", 12) { // from class: yp4.d
        private boolean H(kib kibVar, xp4 xp4Var) {
            return xp4Var.B0(kibVar, yp4.i);
        }

        private boolean K(kib kibVar, xp4 xp4Var) {
            if (!xp4Var.U("tbody") && !xp4Var.U("thead") && !xp4Var.O("tfoot")) {
                xp4Var.y(this);
                return false;
            }
            xp4Var.t();
            xp4Var.j(xp4Var.a().C0());
            return xp4Var.i(kibVar);
        }

        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            int i2 = q.a[kibVar.a.ordinal()];
            if (i2 != 3) {
                if (i2 != 4) {
                    return H(kibVar, xp4Var);
                }
                String J = kibVar.d().J();
                if (wza.d(J, z.H)) {
                    if (!xp4Var.U(J)) {
                        xp4Var.y(this);
                        return false;
                    }
                    xp4Var.t();
                    xp4Var.v0();
                    xp4Var.U0(yp4.i);
                    return true;
                } else if (J.equals("table")) {
                    return K(kibVar, xp4Var);
                } else {
                    if (wza.d(J, z.C)) {
                        xp4Var.y(this);
                        return false;
                    }
                    return H(kibVar, xp4Var);
                }
            }
            kib.h e2 = kibVar.e();
            String J2 = e2.J();
            if (J2.equals("tr")) {
                xp4Var.t();
                xp4Var.V(e2);
                xp4Var.U0(yp4.n);
                return true;
            } else if (wza.d(J2, z.v)) {
                xp4Var.y(this);
                xp4Var.k("tr");
                return xp4Var.i(e2);
            } else if (wza.d(J2, z.B)) {
                return K(kibVar, xp4Var);
            } else {
                return H(kibVar, xp4Var);
            }
        }
    };
    public static final yp4 n = new yp4("InRow", 13) { // from class: yp4.e
        private boolean H(kib kibVar, xp4 xp4Var) {
            return xp4Var.B0(kibVar, yp4.i);
        }

        private boolean K(kib kibVar, pmb pmbVar) {
            if (pmbVar.j("tr")) {
                return pmbVar.i(kibVar);
            }
            return false;
        }

        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            if (kibVar.n()) {
                kib.h e2 = kibVar.e();
                String J = e2.J();
                if (wza.d(J, z.v)) {
                    xp4Var.v();
                    xp4Var.V(e2);
                    xp4Var.U0(yp4.o);
                    xp4Var.d0();
                    return true;
                } else if (wza.d(J, z.D)) {
                    return K(kibVar, xp4Var);
                } else {
                    return H(kibVar, xp4Var);
                }
            } else if (kibVar.m()) {
                String J2 = kibVar.d().J();
                if (J2.equals("tr")) {
                    if (!xp4Var.U(J2)) {
                        xp4Var.y(this);
                        return false;
                    }
                    xp4Var.v();
                    xp4Var.v0();
                    xp4Var.U0(yp4.m);
                    return true;
                } else if (J2.equals("table")) {
                    return K(kibVar, xp4Var);
                } else {
                    if (wza.d(J2, z.s)) {
                        if (xp4Var.U(J2) && xp4Var.U("tr")) {
                            xp4Var.v();
                            xp4Var.v0();
                            xp4Var.U0(yp4.m);
                            return true;
                        }
                        xp4Var.y(this);
                        return false;
                    } else if (wza.d(J2, z.E)) {
                        xp4Var.y(this);
                        return false;
                    } else {
                        return H(kibVar, xp4Var);
                    }
                }
            } else {
                return H(kibVar, xp4Var);
            }
        }
    };
    public static final yp4 o = new yp4("InCell", 14) { // from class: yp4.f
        private boolean H(kib kibVar, xp4 xp4Var) {
            return xp4Var.B0(kibVar, yp4.g);
        }

        private void K(xp4 xp4Var) {
            if (xp4Var.U("td")) {
                xp4Var.j("td");
            } else {
                xp4Var.j("th");
            }
        }

        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            if (kibVar.m()) {
                String J = kibVar.d().J();
                if (wza.d(J, z.v)) {
                    if (!xp4Var.U(J)) {
                        xp4Var.y(this);
                        xp4Var.U0(yp4.n);
                        return false;
                    }
                    xp4Var.B();
                    if (!xp4Var.b(J)) {
                        xp4Var.y(this);
                    }
                    xp4Var.x0(J);
                    xp4Var.r();
                    xp4Var.U0(yp4.n);
                    return true;
                } else if (wza.d(J, z.w)) {
                    xp4Var.y(this);
                    return false;
                } else if (wza.d(J, z.x)) {
                    if (!xp4Var.U(J)) {
                        xp4Var.y(this);
                        return false;
                    }
                    K(xp4Var);
                    return xp4Var.i(kibVar);
                } else {
                    return H(kibVar, xp4Var);
                }
            } else if (kibVar.n() && wza.d(kibVar.e().J(), z.y)) {
                if (!xp4Var.U("td") && !xp4Var.U("th")) {
                    xp4Var.y(this);
                    return false;
                }
                K(xp4Var);
                return xp4Var.i(kibVar);
            } else {
                return H(kibVar, xp4Var);
            }
        }
    };
    public static final yp4 p = new yp4("InSelect", 15) { // from class: yp4.g
        private boolean H(kib kibVar, xp4 xp4Var) {
            xp4Var.y(this);
            return false;
        }

        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            switch (q.a[kibVar.a.ordinal()]) {
                case 1:
                    xp4Var.Z(kibVar.b());
                    break;
                case 2:
                    xp4Var.y(this);
                    return false;
                case 3:
                    kib.h e2 = kibVar.e();
                    String J = e2.J();
                    if (J.equals("html")) {
                        return xp4Var.B0(e2, yp4.g);
                    }
                    if (J.equals("option")) {
                        if (xp4Var.b("option")) {
                            xp4Var.j("option");
                        }
                        xp4Var.V(e2);
                        break;
                    } else if (J.equals("optgroup")) {
                        if (xp4Var.b("option")) {
                            xp4Var.j("option");
                        }
                        if (xp4Var.b("optgroup")) {
                            xp4Var.j("optgroup");
                        }
                        xp4Var.V(e2);
                        break;
                    } else if (J.equals(DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT)) {
                        xp4Var.y(this);
                        return xp4Var.j(DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT);
                    } else if (wza.d(J, z.F)) {
                        xp4Var.y(this);
                        if (!xp4Var.R(DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT)) {
                            return false;
                        }
                        xp4Var.j(DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT);
                        return xp4Var.i(e2);
                    } else if (!J.equals("script") && !J.equals("template")) {
                        return H(kibVar, xp4Var);
                    } else {
                        return xp4Var.B0(kibVar, yp4.d);
                    }
                    break;
                case 4:
                    String J2 = kibVar.d().J();
                    J2.hashCode();
                    char c2 = 65535;
                    switch (J2.hashCode()) {
                        case -1321546630:
                            if (J2.equals("template")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case -1010136971:
                            if (J2.equals("option")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case -906021636:
                            if (J2.equals(DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT)) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case -80773204:
                            if (J2.equals("optgroup")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    switch (c2) {
                        case 0:
                            return xp4Var.B0(kibVar, yp4.d);
                        case 1:
                            if (xp4Var.b("option")) {
                                xp4Var.v0();
                                break;
                            } else {
                                xp4Var.y(this);
                                break;
                            }
                        case 2:
                            if (!xp4Var.R(J2)) {
                                xp4Var.y(this);
                                return false;
                            }
                            xp4Var.x0(J2);
                            xp4Var.O0();
                            break;
                        case 3:
                            if (xp4Var.b("option") && xp4Var.p(xp4Var.a()) != null && xp4Var.p(xp4Var.a()).C0().equals("optgroup")) {
                                xp4Var.j("option");
                            }
                            if (xp4Var.b("optgroup")) {
                                xp4Var.v0();
                                break;
                            } else {
                                xp4Var.y(this);
                                break;
                            }
                            break;
                        default:
                            return H(kibVar, xp4Var);
                    }
                case 5:
                    kib.c a2 = kibVar.a();
                    if (a2.u().equals(yp4.y)) {
                        xp4Var.y(this);
                        return false;
                    }
                    xp4Var.Y(a2);
                    break;
                case 6:
                    if (!xp4Var.b("html")) {
                        xp4Var.y(this);
                        break;
                    }
                    break;
                default:
                    return H(kibVar, xp4Var);
            }
            return true;
        }
    };
    public static final yp4 q = new yp4("InSelectInTable", 16) { // from class: yp4.h
        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            if (kibVar.n() && wza.d(kibVar.e().J(), z.G)) {
                xp4Var.y(this);
                xp4Var.x0(DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT);
                xp4Var.O0();
                return xp4Var.i(kibVar);
            } else if (kibVar.m() && wza.d(kibVar.d().J(), z.G)) {
                xp4Var.y(this);
                if (xp4Var.U(kibVar.d().J())) {
                    xp4Var.x0(DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT);
                    xp4Var.O0();
                    return xp4Var.i(kibVar);
                }
                return false;
            } else {
                return xp4Var.B0(kibVar, yp4.p);
            }
        }
    };
    public static final yp4 r = new yp4("InTemplate", 17) { // from class: yp4.i
        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            switch (q.a[kibVar.a.ordinal()]) {
                case 1:
                case 2:
                case 5:
                    xp4Var.B0(kibVar, yp4.g);
                    break;
                case 3:
                    String J = kibVar.e().J();
                    if (wza.d(J, z.K)) {
                        xp4Var.B0(kibVar, yp4.d);
                        break;
                    } else if (wza.d(J, z.L)) {
                        xp4Var.z0();
                        yp4 yp4Var = yp4.i;
                        xp4Var.E0(yp4Var);
                        xp4Var.U0(yp4Var);
                        return xp4Var.i(kibVar);
                    } else if (J.equals("col")) {
                        xp4Var.z0();
                        yp4 yp4Var2 = yp4.l;
                        xp4Var.E0(yp4Var2);
                        xp4Var.U0(yp4Var2);
                        return xp4Var.i(kibVar);
                    } else if (J.equals("tr")) {
                        xp4Var.z0();
                        yp4 yp4Var3 = yp4.m;
                        xp4Var.E0(yp4Var3);
                        xp4Var.U0(yp4Var3);
                        return xp4Var.i(kibVar);
                    } else if (!J.equals("td") && !J.equals("th")) {
                        xp4Var.z0();
                        yp4 yp4Var4 = yp4.g;
                        xp4Var.E0(yp4Var4);
                        xp4Var.U0(yp4Var4);
                        return xp4Var.i(kibVar);
                    } else {
                        xp4Var.z0();
                        yp4 yp4Var5 = yp4.n;
                        xp4Var.E0(yp4Var5);
                        xp4Var.U0(yp4Var5);
                        return xp4Var.i(kibVar);
                    }
                case 4:
                    if (kibVar.d().J().equals("template")) {
                        xp4Var.B0(kibVar, yp4.d);
                        break;
                    } else {
                        xp4Var.y(this);
                        return false;
                    }
                case 6:
                    if (!xp4Var.s0("template")) {
                        return true;
                    }
                    xp4Var.y(this);
                    xp4Var.x0("template");
                    xp4Var.r();
                    xp4Var.z0();
                    xp4Var.O0();
                    if (xp4Var.S0() == yp4.r || xp4Var.T0() >= 12) {
                        return true;
                    }
                    return xp4Var.i(kibVar);
            }
            return true;
        }
    };
    public static final yp4 s = new yp4("AfterBody", 18) { // from class: yp4.j
        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            if (yp4.x(kibVar)) {
                xp4Var.Y(kibVar.a());
                return true;
            } else if (kibVar.j()) {
                xp4Var.Z(kibVar.b());
                return true;
            } else if (kibVar.k()) {
                xp4Var.y(this);
                return false;
            } else if (kibVar.n() && kibVar.e().J().equals("html")) {
                return xp4Var.B0(kibVar, yp4.g);
            } else {
                if (kibVar.m() && kibVar.d().J().equals("html")) {
                    if (xp4Var.j0()) {
                        xp4Var.y(this);
                        return false;
                    }
                    if (xp4Var.s0("html")) {
                        xp4Var.x0("html");
                    }
                    xp4Var.U0(yp4.v);
                    return true;
                } else if (kibVar.l()) {
                    return true;
                } else {
                    xp4Var.y(this);
                    xp4Var.N0();
                    return xp4Var.i(kibVar);
                }
            }
        }
    };
    public static final yp4 t = new yp4("InFrameset", 19) { // from class: yp4.l
        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            if (yp4.x(kibVar)) {
                xp4Var.Y(kibVar.a());
            } else if (kibVar.j()) {
                xp4Var.Z(kibVar.b());
            } else if (kibVar.k()) {
                xp4Var.y(this);
                return false;
            } else if (kibVar.n()) {
                kib.h e2 = kibVar.e();
                String J = e2.J();
                J.hashCode();
                char c2 = 65535;
                switch (J.hashCode()) {
                    case -1644953643:
                        if (J.equals("frameset")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 3213227:
                        if (J.equals("html")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 97692013:
                        if (J.equals("frame")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 1192721831:
                        if (J.equals("noframes")) {
                            c2 = 3;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        xp4Var.V(e2);
                        break;
                    case 1:
                        return xp4Var.B0(e2, yp4.g);
                    case 2:
                        xp4Var.a0(e2);
                        break;
                    case 3:
                        return xp4Var.B0(e2, yp4.d);
                    default:
                        xp4Var.y(this);
                        return false;
                }
            } else if (kibVar.m() && kibVar.d().J().equals("frameset")) {
                if (xp4Var.b("html")) {
                    xp4Var.y(this);
                    return false;
                }
                xp4Var.v0();
                if (!xp4Var.j0() && !xp4Var.b("frameset")) {
                    xp4Var.U0(yp4.u);
                }
            } else if (kibVar.l()) {
                if (!xp4Var.b("html")) {
                    xp4Var.y(this);
                }
            } else {
                xp4Var.y(this);
                return false;
            }
            return true;
        }
    };
    public static final yp4 u = new yp4("AfterFrameset", 20) { // from class: yp4.m
        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            if (yp4.x(kibVar)) {
                xp4Var.Y(kibVar.a());
                return true;
            } else if (kibVar.j()) {
                xp4Var.Z(kibVar.b());
                return true;
            } else if (kibVar.k()) {
                xp4Var.y(this);
                return false;
            } else if (kibVar.n() && kibVar.e().J().equals("html")) {
                return xp4Var.B0(kibVar, yp4.g);
            } else {
                if (kibVar.m() && kibVar.d().J().equals("html")) {
                    xp4Var.U0(yp4.w);
                    return true;
                } else if (kibVar.n() && kibVar.e().J().equals("noframes")) {
                    return xp4Var.B0(kibVar, yp4.d);
                } else {
                    if (kibVar.l()) {
                        return true;
                    }
                    xp4Var.y(this);
                    return false;
                }
            }
        }
    };
    public static final yp4 v = new yp4("AfterAfterBody", 21) { // from class: yp4.n
        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            if (kibVar.j()) {
                xp4Var.Z(kibVar.b());
                return true;
            } else if (!kibVar.k() && (!kibVar.n() || !kibVar.e().J().equals("html"))) {
                if (yp4.x(kibVar)) {
                    xp4Var.Y(kibVar.a());
                    return true;
                } else if (kibVar.l()) {
                    return true;
                } else {
                    xp4Var.y(this);
                    xp4Var.N0();
                    return xp4Var.i(kibVar);
                }
            } else {
                return xp4Var.B0(kibVar, yp4.g);
            }
        }
    };
    public static final yp4 w = new yp4("AfterAfterFrameset", 22) { // from class: yp4.o
        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            if (kibVar.j()) {
                xp4Var.Z(kibVar.b());
                return true;
            } else if (!kibVar.k() && !yp4.x(kibVar) && (!kibVar.n() || !kibVar.e().J().equals("html"))) {
                if (kibVar.l()) {
                    return true;
                }
                if (kibVar.n() && kibVar.e().J().equals("noframes")) {
                    return xp4Var.B0(kibVar, yp4.d);
                }
                xp4Var.y(this);
                return false;
            } else {
                return xp4Var.B0(kibVar, yp4.g);
            }
        }
    };
    public static final yp4 x = new yp4("ForeignContent", 23) { // from class: yp4.p
        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            return true;
        }
    };
    private static final /* synthetic */ yp4[] z = a();
    private static final String y = String.valueOf((char) 0);

    /* compiled from: HtmlTreeBuilderState.java */
    /* renamed from: yp4$k */
    /* loaded from: classes3.dex */
    enum k extends yp4 {
        k(String str, int i) {
            super(str, i, null);
        }

        @Override // defpackage.yp4
        boolean G(kib kibVar, xp4 xp4Var) {
            if (yp4.x(kibVar)) {
                return true;
            }
            if (kibVar.j()) {
                xp4Var.Z(kibVar.b());
            } else if (kibVar.k()) {
                kib.e c = kibVar.c();
                o53 o53Var = new o53(xp4Var.h.d(c.t()), c.v(), c.w());
                o53Var.a0(c.u());
                xp4Var.G().Z(o53Var);
                xp4Var.g(o53Var, kibVar);
                if (c.x()) {
                    xp4Var.G().j1(h53.b.quirks);
                }
                xp4Var.U0(yp4.b);
            } else {
                xp4Var.U0(yp4.b);
                return xp4Var.i(kibVar);
            }
            return true;
        }
    }

    /* compiled from: HtmlTreeBuilderState.java */
    /* renamed from: yp4$q */
    /* loaded from: classes3.dex */
    static /* synthetic */ class q {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[kib.j.values().length];
            a = iArr;
            try {
                iArr[kib.j.Comment.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[kib.j.Doctype.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[kib.j.StartTag.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[kib.j.EndTag.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[kib.j.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[kib.j.EOF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HtmlTreeBuilderState.java */
    /* renamed from: yp4$z */
    /* loaded from: classes3.dex */
    public static final class z {
        static final String[] a = {"base", "basefont", "bgsound", "command", ElementGenerator.TYPE_LINK};
        static final String[] b = {"noframes", "style"};
        static final String[] c = {"body", "br", "html"};
        static final String[] d = {"body", "br", "html"};
        static final String[] e = {"body", "br", "head", "html"};
        static final String[] f = {"basefont", "bgsound", ElementGenerator.TYPE_LINK, "meta", "noframes", "style"};
        static final String[] g = {"base", "basefont", "bgsound", "command", ElementGenerator.TYPE_LINK, "meta", "noframes", "script", "style", "template", "title"};
        static final String[] h = {"address", "article", "aside", "blockquote", ElementGenerator.TEXT_ALIGN_CENTER, "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
        static final String[] i = {"h1", "h2", "h3", "h4", "h5", "h6"};
        static final String[] j = {"address", "div", "p"};
        static final String[] k = {"dd", "dt"};
        static final String[] l = {"applet", "marquee", "object"};
        static final String[] m = {RemoteMessageConst.MessageBody.PARAM, KustoStorage.KustoTable.COLUMN_SOURCE, "track"};
        static final String[] n = {"action", Action.NAME_ATTRIBUTE, "prompt"};
        static final String[] o = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] p = {"address", "article", "aside", "blockquote", "button", ElementGenerator.TEXT_ALIGN_CENTER, "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
        static final String[] q = {"a", "b", "big", "code", "em", "font", "i", "nobr", Image.TYPE_SMALL, "small", "strike", "strong", "tt", "u"};
        static final String[] r = {"table", "tbody", "tfoot", "thead", "tr"};
        static final String[] s = {"tbody", "tfoot", "thead"};
        static final String[] t = {"td", "th", "tr"};
        static final String[] u = {"script", "style", "template"};
        static final String[] v = {"td", "th"};
        static final String[] w = {"body", "caption", "col", "colgroup", "html"};
        static final String[] x = {"table", "tbody", "tfoot", "thead", "tr"};
        static final String[] y = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] z = {"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] A = {"table", "tbody", "tfoot", "thead", "tr"};
        static final String[] B = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
        static final String[] C = {"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
        static final String[] D = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
        static final String[] E = {"body", "caption", "col", "colgroup", "html", "td", "th"};
        static final String[] F = {"input", "keygen", "textarea"};
        static final String[] G = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] H = {"tbody", "tfoot", "thead"};
        static final String[] I = {"head", "noscript"};
        static final String[] J = {"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
        static final String[] K = {"base", "basefont", "bgsound", ElementGenerator.TYPE_LINK, "meta", "noframes", "script", "style", "template", "title"};
        static final String[] L = {"caption", "colgroup", "tbody", "tfoot", "thead"};
    }

    private yp4(String str, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean E(String str) {
        return wza.g(str);
    }

    private static /* synthetic */ yp4[] a() {
        return new yp4[]{a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void u(kib.h hVar, xp4 xp4Var) {
        xp4Var.c.x(uib.e);
        xp4Var.o0();
        xp4Var.U0(h);
        xp4Var.V(hVar);
    }

    public static yp4 valueOf(String str) {
        return (yp4) Enum.valueOf(yp4.class, str);
    }

    public static yp4[] values() {
        return (yp4[]) z.clone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void w(kib.h hVar, xp4 xp4Var) {
        xp4Var.c.x(uib.c);
        xp4Var.o0();
        xp4Var.U0(h);
        xp4Var.V(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean x(kib kibVar) {
        if (kibVar.i()) {
            return wza.g(kibVar.a().u());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean G(kib kibVar, xp4 xp4Var);

    /* synthetic */ yp4(String str, int i2, k kVar) {
        this(str, i2);
    }
}
