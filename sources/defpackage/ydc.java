package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ik9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: -ResponseCommon.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a \u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007\u001a\n\u0010\u0007\u001a\u00020\u0006*\u00020\u0000\u001a\n\u0010\t\u001a\u00020\b*\u00020\u0000\u001a\n\u0010\n\u001a\u00020\u0002*\u00020\u0000\u001a\u0012\u0010\r\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b\u001a\u0012\u0010\u0010\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e\u001a\u0012\u0010\u0013\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011\u001a\u0012\u0010\u0015\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0002\u001a\u001a\u0010\u0017\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002\u001a\u001a\u0010\u0018\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002\u001a\u0012\u0010\u0019\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0012\u0010\u001c\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a\u001a\u0018\u0010\u001f\u001a\u00020\u0006*\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d\u001a\u0012\u0010\"\u001a\u00020\u0006*\u00020\u00062\u0006\u0010!\u001a\u00020 \u001a\u0014\u0010$\u001a\u00020\u0006*\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0000\u001a\u0014\u0010&\u001a\u00020\u0006*\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0000\u001a\u001a\u0010(\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\u0000H\u0002\u001a\u0014\u0010*\u001a\u00020\u0006*\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\u0000\"\u0015\u0010.\u001a\u00020+*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u0015\u00100\u001a\u00020+*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b/\u0010-\"\u0015\u00104\u001a\u000201*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lik9;", "v", "", Action.NAME_ATTRIBUTE, "defaultValue", Image.TYPE_HIGH, "Lik9$a;", "l", "", e.a, "q", "Lhi9;", "request", "p", "Lvr8;", "protocol", "n", "", "code", "f", "message", "j", "value", "g", "b", "o", "Lgn4;", "headers", "i", "Lkotlin/Function0;", "trailersFn", "r", "Lkk9;", "body", c.a, "networkResponse", "k", "cacheResponse", DateTokenConverter.CONVERTER_KEY, "response", "a", "priorResponse", Image.TYPE_MEDIUM, "", "u", "(Lik9;)Z", "commonIsSuccessful", "t", "commonIsRedirect", "Lll0;", Image.TYPE_SMALL, "(Lik9;)Lll0;", "commonCacheControl", "okhttp"}, k = 2, mv = {1, 9, 0})
/* renamed from: ydc  reason: default package */
/* loaded from: classes3.dex */
public final class ydc {
    private static final void a(String str, ik9 ik9Var) {
        if (ik9Var != null) {
            if (ik9Var.s() == null) {
                if (ik9Var.e() == null) {
                    if (ik9Var.y() != null) {
                        throw new IllegalArgumentException((str + ".priorResponse != null").toString());
                    }
                    return;
                }
                throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
            }
            throw new IllegalArgumentException((str + ".networkResponse != null").toString());
        }
    }

    public static final ik9.a b(ik9.a aVar, String str, String str2) {
        z65.h(aVar, "<this>");
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "value");
        aVar.g().a(str, str2);
        return aVar;
    }

    public static final ik9.a c(ik9.a aVar, kk9 kk9Var) {
        z65.h(aVar, "<this>");
        z65.h(kk9Var, "body");
        aVar.t(kk9Var);
        return aVar;
    }

    public static final ik9.a d(ik9.a aVar, ik9 ik9Var) {
        z65.h(aVar, "<this>");
        a("cacheResponse", ik9Var);
        aVar.u(ik9Var);
        return aVar;
    }

    public static final void e(ik9 ik9Var) {
        z65.h(ik9Var, "<this>");
        ik9Var.b().close();
    }

    public static final ik9.a f(ik9.a aVar, int i) {
        z65.h(aVar, "<this>");
        aVar.v(i);
        return aVar;
    }

    public static final ik9.a g(ik9.a aVar, String str, String str2) {
        z65.h(aVar, "<this>");
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "value");
        aVar.g().j(str, str2);
        return aVar;
    }

    public static final String h(ik9 ik9Var, String str, String str2) {
        z65.h(ik9Var, "<this>");
        z65.h(str, Action.NAME_ATTRIBUTE);
        String d = ik9Var.q().d(str);
        if (d != null) {
            return d;
        }
        return str2;
    }

    public static final ik9.a i(ik9.a aVar, gn4 gn4Var) {
        z65.h(aVar, "<this>");
        z65.h(gn4Var, "headers");
        aVar.w(gn4Var.p());
        return aVar;
    }

    public static final ik9.a j(ik9.a aVar, String str) {
        z65.h(aVar, "<this>");
        z65.h(str, "message");
        aVar.x(str);
        return aVar;
    }

    public static final ik9.a k(ik9.a aVar, ik9 ik9Var) {
        z65.h(aVar, "<this>");
        a("networkResponse", ik9Var);
        aVar.y(ik9Var);
        return aVar;
    }

    public static final ik9.a l(ik9 ik9Var) {
        z65.h(ik9Var, "<this>");
        return new ik9.a(ik9Var);
    }

    public static final ik9.a m(ik9.a aVar, ik9 ik9Var) {
        z65.h(aVar, "<this>");
        aVar.z(ik9Var);
        return aVar;
    }

    public static final ik9.a n(ik9.a aVar, vr8 vr8Var) {
        z65.h(aVar, "<this>");
        z65.h(vr8Var, "protocol");
        aVar.A(vr8Var);
        return aVar;
    }

    public static final ik9.a o(ik9.a aVar, String str) {
        z65.h(aVar, "<this>");
        z65.h(str, Action.NAME_ATTRIBUTE);
        aVar.g().i(str);
        return aVar;
    }

    public static final ik9.a p(ik9.a aVar, hi9 hi9Var) {
        z65.h(aVar, "<this>");
        z65.h(hi9Var, "request");
        aVar.B(hi9Var);
        return aVar;
    }

    public static final String q(ik9 ik9Var) {
        z65.h(ik9Var, "<this>");
        return "Response{protocol=" + ik9Var.E() + ", code=" + ik9Var.j() + ", message=" + ik9Var.r() + ", url=" + ik9Var.K().l() + CoreConstants.CURLY_RIGHT;
    }

    public static final ik9.a r(ik9.a aVar, Function0<gn4> function0) {
        z65.h(aVar, "<this>");
        z65.h(function0, "trailersFn");
        aVar.C(function0);
        return aVar;
    }

    public static final ll0 s(ik9 ik9Var) {
        z65.h(ik9Var, "<this>");
        ll0 l = ik9Var.l();
        if (l == null) {
            ll0 a = ll0.n.a(ik9Var.q());
            ik9Var.M(a);
            return a;
        }
        return l;
    }

    public static final boolean t(ik9 ik9Var) {
        z65.h(ik9Var, "<this>");
        int j = ik9Var.j();
        if (j != 307 && j != 308) {
            switch (j) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public static final boolean u(ik9 ik9Var) {
        z65.h(ik9Var, "<this>");
        int j = ik9Var.j();
        if (200 > j || j >= 300) {
            return false;
        }
        return true;
    }

    public static final ik9 v(ik9 ik9Var) {
        z65.h(ik9Var, "<this>");
        return ik9Var.u().b(new frb(ik9Var.b().contentType(), ik9Var.b().contentLength())).c();
    }
}
