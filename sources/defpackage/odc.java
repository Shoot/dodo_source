package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ll0;
import kotlin.Metadata;
import kotlin.time.a;
import kotlin.time.b;
/* compiled from: -CacheControlCommon.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000\u001a\f\u0010\n\u001a\u00020\u0004*\u00020\tH\u0000\u001a\f\u0010\f\u001a\u00020\u0000*\u00020\u000bH\u0000\u001a\f\u0010\r\u001a\u00020\u0000*\u00020\u000bH\u0000\u001a\f\u0010\u000e\u001a\u00020\u0000*\u00020\u0003H\u0000\u001a\f\u0010\u000f\u001a\u00020\u0003*\u00020\u0003H\u0000\u001a\f\u0010\u0010\u001a\u00020\u0003*\u00020\u0003H\u0000\u001a\f\u0010\u0011\u001a\u00020\u0003*\u00020\u0003H\u0000\u001a\u0014\u0010\u0014\u001a\u00020\u0000*\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u001a\u001e\u0010\u0017\u001a\u00020\u0004*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u0004H\u0002¨\u0006\u0018"}, d2 = {"Lll0;", "", "j", "Lll0$a;", "", "maxStale", "Ll93;", "timeUnit", e.a, "", "b", "Lll0$b;", DateTokenConverter.CONVERTER_KEY, c.a, "a", "f", "g", Image.TYPE_HIGH, "Lgn4;", "headers", "i", "characters", "startIndex", "k", "okhttp"}, k = 2, mv = {1, 9, 0})
/* renamed from: odc  reason: default package */
/* loaded from: classes3.dex */
public final class odc {
    public static final ll0 a(ll0.a aVar) {
        z65.h(aVar, "<this>");
        return new ll0(aVar.f(), aVar.g(), aVar.c(), -1, false, false, false, aVar.d(), aVar.e(), aVar.i(), aVar.h(), aVar.b(), null);
    }

    public static final int b(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    public static final ll0 c(ll0.b bVar) {
        z65.h(bVar, "<this>");
        return new ll0.a().m().j(Integer.MAX_VALUE, l93.e).a();
    }

    public static final ll0 d(ll0.b bVar) {
        z65.h(bVar, "<this>");
        return new ll0.a().k().a();
    }

    public static final ll0.a e(ll0.a aVar, int i, l93 l93Var) {
        z65.h(aVar, "<this>");
        z65.h(l93Var, "timeUnit");
        if (i >= 0) {
            aVar.n(b(a.w(b.h(i, l93Var))));
            return aVar;
        }
        throw new IllegalArgumentException(("maxStale < 0: " + i).toString());
    }

    public static final ll0.a f(ll0.a aVar) {
        z65.h(aVar, "<this>");
        aVar.o(true);
        return aVar;
    }

    public static final ll0.a g(ll0.a aVar) {
        z65.h(aVar, "<this>");
        aVar.p(true);
        return aVar;
    }

    public static final ll0.a h(ll0.a aVar) {
        z65.h(aVar, "<this>");
        aVar.q(true);
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ll0 i(defpackage.ll0.b r28, defpackage.gn4 r29) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.odc.i(ll0$b, gn4):ll0");
    }

    public static final String j(ll0 ll0Var) {
        z65.h(ll0Var, "<this>");
        String a = ll0Var.a();
        if (a == null) {
            StringBuilder sb = new StringBuilder();
            if (ll0Var.i()) {
                sb.append("no-cache, ");
            }
            if (ll0Var.j()) {
                sb.append("no-store, ");
            }
            if (ll0Var.e() != -1) {
                sb.append("max-age=");
                sb.append(ll0Var.e());
                sb.append(", ");
            }
            if (ll0Var.m() != -1) {
                sb.append("s-maxage=");
                sb.append(ll0Var.m());
                sb.append(", ");
            }
            if (ll0Var.c()) {
                sb.append("private, ");
            }
            if (ll0Var.d()) {
                sb.append("public, ");
            }
            if (ll0Var.h()) {
                sb.append("must-revalidate, ");
            }
            if (ll0Var.f() != -1) {
                sb.append("max-stale=");
                sb.append(ll0Var.f());
                sb.append(", ");
            }
            if (ll0Var.g() != -1) {
                sb.append("min-fresh=");
                sb.append(ll0Var.g());
                sb.append(", ");
            }
            if (ll0Var.l()) {
                sb.append("only-if-cached, ");
            }
            if (ll0Var.k()) {
                sb.append("no-transform, ");
            }
            if (ll0Var.b()) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                return "";
            }
            z65.g(sb.delete(sb.length() - 2, sb.length()), "delete(...)");
            String sb2 = sb.toString();
            z65.g(sb2, "toString(...)");
            ll0Var.n(sb2);
            return sb2;
        }
        return a;
    }

    private static final int k(String str, String str2, int i) {
        boolean N;
        int length = str.length();
        while (i < length) {
            N = m0b.N(str2, str.charAt(i), false, 2, null);
            if (N) {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
