package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.network.NetworkHandler;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.hi9;
import im.threads.business.transport.MessageAttributes;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
/* compiled from: -RequestCommon.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0000\u001a\u001a\u0010\n\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001\u001a\u001a\u0010\u000b\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001\u001a\u0012\u0010\f\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0012\u0010\u000f\u001a\u00020\b*\u00020\b2\u0006\u0010\u000e\u001a\u00020\r\u001a\u0012\u0010\u0012\u001a\u00020\b*\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010\u001a\u0012\u0010\u0015\u001a\u00020\b*\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013\u001a\u0014\u0010\u0016\u001a\u00020\b*\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u001a\u001c\u0010\u0018\u001a\u00020\b*\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u001a3\u0010\u001e\u001a\u00020\b\"\b\b\u0000\u0010\u001a*\u00020\u0019*\u00020\b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\n\u0010 \u001a\u00020\u0001*\u00020\u0000¨\u0006!"}, d2 = {"Lhi9;", "", Action.NAME_ATTRIBUTE, "f", "", Image.TYPE_HIGH, RemoteMessageConst.Notification.URL, "a", "Lhi9$a;", "value", e.a, "b", "k", "Lgn4;", "headers", "g", "Lll0;", "cacheControl", c.a, "Lji9;", "body", "j", DateTokenConverter.CONVERTER_KEY, "method", "i", "", "T", "Lod5;", MessageAttributes.TYPE, RemoteMessageConst.Notification.TAG, "l", "(Lhi9$a;Lod5;Ljava/lang/Object;)Lhi9$a;", Image.TYPE_MEDIUM, "okhttp"}, k = 2, mv = {1, 9, 0})
/* renamed from: wdc  reason: default package */
/* loaded from: classes3.dex */
public final class wdc {
    public static final String a(String str) {
        boolean H;
        boolean H2;
        z65.h(str, RemoteMessageConst.Notification.URL);
        H = l0b.H(str, "ws:", true);
        if (!H) {
            H2 = l0b.H(str, "wss:", true);
            if (H2) {
                StringBuilder sb = new StringBuilder();
                sb.append("https:");
                String substring = str.substring(4);
                z65.g(substring, "substring(...)");
                sb.append(substring);
                return sb.toString();
            }
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("http:");
        String substring2 = str.substring(3);
        z65.g(substring2, "substring(...)");
        sb2.append(substring2);
        return sb2.toString();
    }

    public static final hi9.a b(hi9.a aVar, String str, String str2) {
        z65.h(aVar, "<this>");
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "value");
        aVar.f().a(str, str2);
        return aVar;
    }

    public static final hi9.a c(hi9.a aVar, ll0 ll0Var) {
        z65.h(aVar, "<this>");
        z65.h(ll0Var, "cacheControl");
        String ll0Var2 = ll0Var.toString();
        if (ll0Var2.length() == 0) {
            return aVar.n("Cache-Control");
        }
        return aVar.j("Cache-Control", ll0Var2);
    }

    public static final hi9.a d(hi9.a aVar, ji9 ji9Var) {
        z65.h(aVar, "<this>");
        return aVar.l(NetworkHandler.DELETE, ji9Var);
    }

    public static final hi9.a e(hi9.a aVar, String str, String str2) {
        z65.h(aVar, "<this>");
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(str2, "value");
        aVar.f().j(str, str2);
        return aVar;
    }

    public static final String f(hi9 hi9Var, String str) {
        z65.h(hi9Var, "<this>");
        z65.h(str, Action.NAME_ATTRIBUTE);
        return hi9Var.e().d(str);
    }

    public static final hi9.a g(hi9.a aVar, gn4 gn4Var) {
        z65.h(aVar, "<this>");
        z65.h(gn4Var, "headers");
        aVar.p(gn4Var.p());
        return aVar;
    }

    public static final List<String> h(hi9 hi9Var, String str) {
        z65.h(hi9Var, "<this>");
        z65.h(str, Action.NAME_ATTRIBUTE);
        return hi9Var.e().v(str);
    }

    public static final hi9.a i(hi9.a aVar, String str, ji9 ji9Var) {
        z65.h(aVar, "<this>");
        z65.h(str, "method");
        if (str.length() > 0) {
            if (ji9Var == null) {
                if (!(!nq4.e(str))) {
                    throw new IllegalArgumentException(("method " + str + " must have a request body.").toString());
                }
            } else if (!nq4.b(str)) {
                throw new IllegalArgumentException(("method " + str + " must not have a request body.").toString());
            }
            aVar.q(str);
            aVar.o(ji9Var);
            return aVar;
        }
        throw new IllegalArgumentException("method.isEmpty() == true".toString());
    }

    public static final hi9.a j(hi9.a aVar, ji9 ji9Var) {
        z65.h(aVar, "<this>");
        z65.h(ji9Var, "body");
        return aVar.l(NetworkHandler.POST, ji9Var);
    }

    public static final hi9.a k(hi9.a aVar, String str) {
        z65.h(aVar, "<this>");
        z65.h(str, Action.NAME_ATTRIBUTE);
        aVar.f().i(str);
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> hi9.a l(hi9.a aVar, od5<T> od5Var, T t) {
        Map<od5<?>, ? extends Object> d;
        z65.h(aVar, "<this>");
        z65.h(od5Var, MessageAttributes.TYPE);
        if (t == 0) {
            if (!aVar.h().isEmpty()) {
                Map<od5<?>, Object> h = aVar.h();
                z65.f(h, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
                unb.d(h).remove(od5Var);
            }
        } else {
            if (aVar.h().isEmpty()) {
                d = new LinkedHashMap<>();
                aVar.r(d);
            } else {
                Map<od5<?>, Object> h2 = aVar.h();
                z65.f(h2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.reflect.KClass<*>, kotlin.Any>");
                d = unb.d(h2);
            }
            d.put(od5Var, t);
        }
        return aVar;
    }

    public static final String m(hi9 hi9Var) {
        z65.h(hi9Var, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(hi9Var.h());
        sb.append(", url=");
        sb.append(hi9Var.l());
        if (hi9Var.e().size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Pair<? extends String, ? extends String> pair : hi9Var.e()) {
                int i2 = i + 1;
                if (i < 0) {
                    kc1.v();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String a = pair2.a();
                String b = pair2.b();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(a);
                sb.append(CoreConstants.COLON_CHAR);
                if (zdc.B(a)) {
                    b = "██";
                }
                sb.append(b);
                i = i2;
            }
            sb.append(']');
        }
        if (!hi9Var.c().isEmpty()) {
            sb.append(", tags=");
            sb.append(hi9Var.c());
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        String sb2 = sb.toString();
        z65.g(sb2, "toString(...)");
        return sb2;
    }
}
