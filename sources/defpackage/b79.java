package defpackage;

import android.net.Uri;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.a79;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ranges.i;
/* compiled from: RawDeepLinkDataBuilder.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\u0002`\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J6\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\u0002`\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0002J\"\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\u0002`\u00112\u0006\u0010\t\u001a\u00020\bH\u0002J*\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¨\u0006\u0016"}, d2 = {"Lb79;", "", "Landroid/os/Bundle;", "extras", "", "", "Lru/dodopizza/app/application/subnavigation/routing/RawDeepLinkArguments;", c.a, "Landroid/net/Uri;", "deepLinkUri", "additionalArgs", "La79$a;", "attributionData", "La79;", e.a, "", "f", "Lru/dodopizza/app/application/subnavigation/routing/RawDeepLinkQuery;", DateTokenConverter.CONVERTER_KEY, "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: b79  reason: default package */
/* loaded from: classes3.dex */
public final class b79 {
    public static /* synthetic */ a79 b(b79 b79Var, Uri uri, Bundle bundle, a79.a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        if ((i & 4) != 0) {
            aVar = null;
        }
        return b79Var.a(uri, bundle, aVar);
    }

    private final Map<String, String> c(Bundle bundle) {
        int w;
        int e;
        int e2;
        Map<String, String> h;
        if (bundle == null) {
            h = g86.h();
            return h;
        }
        Set<String> keySet = bundle.keySet();
        z65.g(keySet, "keySet(...)");
        Set<String> set = keySet;
        w = lc1.w(set, 10);
        e = f86.e(w);
        e2 = i.e(e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (Object obj : set) {
            linkedHashMap.put(obj, bundle.getString((String) obj));
        }
        return linkedHashMap;
    }

    private final Map<String, String> d(Uri uri) {
        int w;
        int e;
        int e2;
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        z65.g(queryParameterNames, "getQueryParameterNames(...)");
        Set<String> set = queryParameterNames;
        w = lc1.w(set, 10);
        e = f86.e(w);
        e2 = i.e(e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (Object obj : set) {
            linkedHashMap.put(obj, uri.getQueryParameter((String) obj));
        }
        return linkedHashMap;
    }

    private final a79 e(Uri uri, Map<String, String> map, a79.a aVar) {
        String str;
        String str2;
        String str3;
        if (f(uri)) {
            return null;
        }
        String uri2 = uri.toString();
        z65.g(uri2, "toString(...)");
        String scheme = uri.getScheme();
        if (scheme == null) {
            str = "";
        } else {
            str = scheme;
        }
        String host = uri.getHost();
        if (host == null) {
            str2 = "";
        } else {
            str2 = host;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            str3 = "";
        } else {
            str3 = lastPathSegment;
        }
        return new a79(uri2, str, str2, str3, d(uri), aVar, map);
    }

    private final boolean f(Uri uri) {
        if (z65.c(uri, Uri.parse(uri.toString())) && uri.getUserInfo() == null) {
            return false;
        }
        return true;
    }

    public final a79 a(Uri uri, Bundle bundle, a79.a aVar) {
        if (uri == null) {
            return null;
        }
        return e(uri, c(bundle), aVar);
    }
}
