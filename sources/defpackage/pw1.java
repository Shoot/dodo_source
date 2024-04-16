package defpackage;

import com.huawei.hms.framework.common.ContainerUtils;
import defpackage.gq4;
import defpackage.nq1;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
/* compiled from: CookieUtil.java */
/* renamed from: pw1  reason: default package */
/* loaded from: classes3.dex */
class pw1 {
    private static final Map<String, List<String>> a = Collections.unmodifiableMap(new HashMap());

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(gq4.c cVar, HttpURLConnection httpURLConnection) throws IOException {
        HashSet hashSet;
        HashSet hashSet2;
        LinkedHashSet<String> c = c(cVar);
        HashSet hashSet3 = null;
        for (Map.Entry<String, List<String>> entry : cVar.A().get(b(cVar.a), a).entrySet()) {
            List<String> value = entry.getValue();
            if (value != null && value.size() != 0) {
                String key = entry.getKey();
                if ("Cookie".equals(key)) {
                    hashSet = hashSet3;
                    hashSet2 = c;
                } else if ("Cookie2".equals(key)) {
                    hashSet2 = new HashSet();
                    hashSet = hashSet2;
                }
                hashSet2.addAll(value);
                hashSet3 = hashSet;
            }
        }
        if (c.size() > 0) {
            httpURLConnection.addRequestProperty("Cookie", wza.k(c, "; "));
        }
        if (hashSet3 != null && hashSet3.size() > 0) {
            httpURLConnection.addRequestProperty("Cookie2", wza.k(hashSet3, "; "));
        }
    }

    static URI b(URL url) throws IOException {
        try {
            return url.toURI();
        } catch (URISyntaxException e) {
            MalformedURLException malformedURLException = new MalformedURLException(e.getMessage());
            malformedURLException.initCause(e);
            throw malformedURLException;
        }
    }

    private static LinkedHashSet<String> c(nq1.d dVar) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for (Map.Entry<String, String> entry : dVar.d().entrySet()) {
            linkedHashSet.add(entry.getKey() + ContainerUtils.KEY_VALUE_DELIMITER + entry.getValue());
        }
        return linkedHashSet;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(gq4.c cVar, URL url, Map<String, List<String>> map) throws IOException {
        cVar.A().put(b(url), map);
    }
}
