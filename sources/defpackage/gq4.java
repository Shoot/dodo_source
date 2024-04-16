package defpackage;

import ch.qos.logback.classic.spi.CallerData;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.huawei.hms.framework.common.ContainerUtils;
import defpackage.nq1;
import defpackage.tmb;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: HttpConnection.java */
/* renamed from: gq4  reason: default package */
/* loaded from: classes3.dex */
public class gq4 implements nq1 {
    private static final Charset c = Charset.forName("UTF-8");
    private static final Charset d = Charset.forName("ISO-8859-1");
    private c a;
    private nq1.e b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: HttpConnection.java */
    /* renamed from: gq4$b */
    /* loaded from: classes3.dex */
    public static abstract class b<T extends nq1.a<T>> implements nq1.a<T> {
        private static final URL e;
        URL a;
        nq1.c b;
        Map<String, List<String>> c;
        Map<String, String> d;

        static {
            try {
                e = new URL("http://undefined/");
            } catch (MalformedURLException e2) {
                throw new IllegalStateException(e2);
            }
        }

        private static String l(String str) {
            byte[] bytes = str.getBytes(gq4.d);
            if (!r(bytes)) {
                return str;
            }
            return new String(bytes, gq4.c);
        }

        private List<String> m(String str) {
            vvb.j(str);
            for (Map.Entry<String, List<String>> entry : this.c.entrySet()) {
                if (str.equalsIgnoreCase(entry.getKey())) {
                    return entry.getValue();
                }
            }
            return Collections.emptyList();
        }

        private static boolean r(byte[] bArr) {
            int i;
            int i2 = 3;
            i2 = (bArr.length >= 3 && (bArr[0] & 255) == 239 && (bArr[1] & 255) == 187 && (bArr[2] & 255) == 191) ? 0 : 0;
            int length = bArr.length;
            while (i2 < length) {
                byte b = bArr[i2];
                if ((b & 128) != 0) {
                    if ((b & 224) == 192) {
                        i = i2 + 1;
                    } else if ((b & 240) == 224) {
                        i = i2 + 2;
                    } else if ((b & 248) != 240) {
                        return false;
                    } else {
                        i = i2 + 3;
                    }
                    if (i >= bArr.length) {
                        return false;
                    }
                    while (i2 < i) {
                        i2++;
                        if ((bArr[i2] & 192) != 128) {
                            return false;
                        }
                    }
                    continue;
                }
                i2++;
            }
            return true;
        }

        private Map.Entry<String, List<String>> w(String str) {
            String a = h07.a(str);
            for (Map.Entry<String, List<String>> entry : this.c.entrySet()) {
                if (h07.a(entry.getKey()).equals(a)) {
                    return entry;
                }
            }
            return null;
        }

        @Override // defpackage.nq1.a
        public URL b() {
            URL url = this.a;
            if (url != e) {
                return url;
            }
            throw new IllegalArgumentException("URL not set. Make sure to call #url(...) before executing the request.");
        }

        @Override // defpackage.nq1.a
        public Map<String, String> d() {
            return this.d;
        }

        @Override // defpackage.nq1.a
        public String f(String str) {
            vvb.k(str, "Header name must not be null");
            List<String> m = m(str);
            if (m.size() > 0) {
                return wza.k(m, ", ");
            }
            return null;
        }

        @Override // defpackage.nq1.a
        public T g(URL url) {
            vvb.k(url, "URL must not be null");
            this.a = gq4.r(url);
            return this;
        }

        @Override // defpackage.nq1.a
        public T h(String str, String str2) {
            vvb.i(str, "Header name must not be empty");
            v(str);
            j(str, str2);
            return this;
        }

        public T j(String str, String str2) {
            vvb.h(str);
            if (str2 == null) {
                str2 = "";
            }
            List<String> q = q(str);
            if (q.isEmpty()) {
                q = new ArrayList<>();
                this.c.put(str, q);
            }
            q.add(l(str2));
            return this;
        }

        public T k(String str, String str2) {
            vvb.i(str, "Cookie name must not be empty");
            vvb.k(str2, "Cookie value must not be null");
            this.d.put(str, str2);
            return this;
        }

        public boolean n(String str) {
            vvb.i(str, "Cookie name must not be empty");
            return this.d.containsKey(str);
        }

        public boolean o(String str) {
            vvb.i(str, "Header name must not be empty");
            return !m(str).isEmpty();
        }

        public boolean p(String str, String str2) {
            vvb.h(str);
            vvb.h(str2);
            for (String str3 : q(str)) {
                if (str2.equalsIgnoreCase(str3)) {
                    return true;
                }
            }
            return false;
        }

        public List<String> q(String str) {
            vvb.h(str);
            return m(str);
        }

        public T s(nq1.c cVar) {
            vvb.k(cVar, "Method must not be null");
            this.b = cVar;
            return this;
        }

        public nq1.c t() {
            return this.b;
        }

        public Map<String, List<String>> u() {
            return this.c;
        }

        public T v(String str) {
            vvb.i(str, "Header name must not be empty");
            Map.Entry<String, List<String>> w = w(str);
            if (w != null) {
                this.c.remove(w.getKey());
            }
            return this;
        }

        private b() {
            this.a = e;
            this.b = nq1.c.GET;
            this.c = new LinkedHashMap();
            this.d = new LinkedHashMap();
        }
    }

    /* compiled from: HttpConnection.java */
    /* renamed from: gq4$c */
    /* loaded from: classes3.dex */
    public static class c extends b<nq1.d> implements nq1.d {
        private Proxy f;
        private int g;
        private int h;
        private boolean i;
        private final Collection<nq1.b> j;
        private String k;
        private boolean l;
        private boolean m;
        private fr7 n;
        private boolean o;
        private String p;
        private SSLSocketFactory q;
        private CookieManager r;
        private volatile boolean s;

        static {
            System.setProperty("sun.net.http.allowRestrictedHeaders", tmb.h.TRUE_JSON_NAME);
        }

        c() {
            super();
            this.k = null;
            this.l = false;
            this.m = false;
            this.o = false;
            this.p = xl2.c;
            this.s = false;
            this.g = 30000;
            this.h = 2097152;
            this.i = true;
            this.j = new ArrayList();
            this.b = nq1.c.GET;
            j("Accept-Encoding", "gzip");
            j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36");
            this.n = fr7.b();
            this.r = new CookieManager();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public CookieManager A() {
            return this.r;
        }

        public nq1.d B(boolean z) {
            this.i = z;
            return this;
        }

        public boolean C() {
            return this.i;
        }

        public nq1.d D(boolean z) {
            this.m = z;
            return this;
        }

        public boolean E() {
            return this.m;
        }

        public boolean F() {
            return this.l;
        }

        public int G() {
            return this.h;
        }

        public c H(fr7 fr7Var) {
            this.n = fr7Var;
            this.o = true;
            return this;
        }

        public fr7 I() {
            return this.n;
        }

        public Proxy J() {
            return this.f;
        }

        public nq1.d K(String str) {
            this.k = str;
            return this;
        }

        public SSLSocketFactory L() {
            return this.q;
        }

        public void M(SSLSocketFactory sSLSocketFactory) {
            this.q = sSLSocketFactory;
        }

        public int N() {
            return this.g;
        }

        public c O(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            vvb.e(z, "Timeout milliseconds must be 0 (infinite) or greater");
            this.g = i;
            return this;
        }

        @Override // defpackage.nq1.d
        public String a() {
            return this.p;
        }

        @Override // defpackage.gq4.b, defpackage.nq1.a
        public /* bridge */ /* synthetic */ URL b() {
            return super.b();
        }

        @Override // defpackage.nq1.d
        public Collection<nq1.b> c() {
            return this.j;
        }

        @Override // defpackage.gq4.b, defpackage.nq1.a
        public /* bridge */ /* synthetic */ Map d() {
            return super.d();
        }

        @Override // defpackage.gq4.b, defpackage.nq1.a
        public /* bridge */ /* synthetic */ String f(String str) {
            return super.f(str);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [nq1$a, nq1$d] */
        @Override // defpackage.gq4.b, defpackage.nq1.a
        public /* bridge */ /* synthetic */ nq1.d g(URL url) {
            return super.g(url);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [nq1$a, nq1$d] */
        @Override // defpackage.gq4.b, defpackage.nq1.a
        public /* bridge */ /* synthetic */ nq1.d h(String str, String str2) {
            return super.h(str, str2);
        }

        @Override // defpackage.nq1.d
        public String i() {
            return this.k;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [nq1$a, nq1$d] */
        @Override // defpackage.gq4.b
        public /* bridge */ /* synthetic */ nq1.d j(String str, String str2) {
            return super.j(str, str2);
        }

        @Override // defpackage.gq4.b
        public /* bridge */ /* synthetic */ List q(String str) {
            return super.q(str);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [nq1$a, nq1$d] */
        @Override // defpackage.gq4.b
        public /* bridge */ /* synthetic */ nq1.d s(nq1.c cVar) {
            return super.s(cVar);
        }

        @Override // defpackage.gq4.b
        public /* bridge */ /* synthetic */ nq1.c t() {
            return super.t();
        }

        @Override // defpackage.gq4.b
        public /* bridge */ /* synthetic */ Map u() {
            return super.u();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [nq1$a, nq1$d] */
        @Override // defpackage.gq4.b
        public /* bridge */ /* synthetic */ nq1.d v(String str) {
            return super.v(str);
        }
    }

    /* compiled from: HttpConnection.java */
    /* renamed from: gq4$d */
    /* loaded from: classes3.dex */
    public static class d extends b<nq1.e> implements nq1.e {
        private static final Pattern q = Pattern.compile("(application|text)/\\w*\\+?xml.*");
        private final int f;
        private final String g;
        private ByteBuffer h;
        private InputStream i;
        private HttpURLConnection j;
        private String k;
        private final String l;
        private boolean m;
        private boolean n;
        private int o;
        private final c p;

        private d(HttpURLConnection httpURLConnection, c cVar, d dVar) throws IOException {
            super();
            this.m = false;
            this.n = false;
            this.o = 0;
            this.j = httpURLConnection;
            this.p = cVar;
            this.b = nq1.c.valueOf(httpURLConnection.getRequestMethod());
            this.a = httpURLConnection.getURL();
            this.f = httpURLConnection.getResponseCode();
            this.g = httpURLConnection.getResponseMessage();
            this.l = httpURLConnection.getContentType();
            LinkedHashMap<String, List<String>> z = z(httpURLConnection);
            C(z);
            pw1.d(cVar, this.a, z);
            if (dVar != null) {
                for (Map.Entry entry : dVar.d().entrySet()) {
                    if (!n((String) entry.getKey())) {
                        k((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                dVar.D();
                int i = dVar.o + 1;
                this.o = i;
                if (i >= 20) {
                    throw new IOException(String.format("Too many redirects occurred trying to load URL %s", dVar.b()));
                }
            }
        }

        static d A(c cVar) throws IOException {
            return B(cVar, null);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(5:(9:(1:(9:108|23|24|25|(4:27|28|29|30)|38|39|40|(2:55|(2:96|97)(6:59|(2:68|69)|76|(1:93)(5:80|(1:82)(1:92)|83|(1:85)(2:89|(1:91))|86)|87|88))(7:44|(1:46)|47|(1:51)|52|53|54)))(1:21)|39|40|(1:42)|55|(1:57)|94|96|97)|24|25|(0)|38) */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
            r9 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0165, code lost:
            if (defpackage.gq4.d.q.matcher(r9).matches() == false) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x016b, code lost:
            if (r8.o != false) goto L76;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x016d, code lost:
            r8.H(defpackage.fr7.i());
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0092 A[Catch: all -> 0x009d, IOException -> 0x00a0, TRY_LEAVE, TryCatch #3 {IOException -> 0x00a0, blocks: (B:27:0x0089, B:29:0x0092, B:31:0x0099, B:42:0x00aa, B:43:0x00ad, B:44:0x00ae), top: B:117:0x0089 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        static defpackage.gq4.d B(defpackage.gq4.c r8, defpackage.gq4.d r9) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 524
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.gq4.d.B(gq4$c, gq4$d):gq4$d");
        }

        private void D() {
            InputStream inputStream = this.i;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.i = null;
                    throw th;
                }
                this.i = null;
            }
            HttpURLConnection httpURLConnection = this.j;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
                this.j = null;
            }
        }

        private static void E(nq1.d dVar) throws IOException {
            boolean z;
            URL b = dVar.b();
            StringBuilder b2 = wza.b();
            b2.append(b.getProtocol());
            b2.append("://");
            b2.append(b.getAuthority());
            b2.append(b.getPath());
            b2.append(CallerData.NA);
            if (b.getQuery() != null) {
                b2.append(b.getQuery());
                z = false;
            } else {
                z = true;
            }
            for (nq1.b bVar : dVar.c()) {
                vvb.c(bVar.g(), "InputStream data not supported in URL query string.");
                if (!z) {
                    b2.append('&');
                } else {
                    z = false;
                }
                String key = bVar.key();
                String str = xl2.c;
                b2.append(URLEncoder.encode(key, str));
                b2.append('=');
                b2.append(URLEncoder.encode(bVar.value(), str));
            }
            dVar.g(new URL(wza.o(b2)));
            dVar.c().clear();
        }

        private static String F(nq1.d dVar) {
            String f = dVar.f("Content-Type");
            if (f != null) {
                if (f.contains("multipart/form-data") && !f.contains("boundary")) {
                    String e = xl2.e();
                    dVar.h("Content-Type", "multipart/form-data; boundary=" + e);
                    return e;
                }
            } else if (gq4.q(dVar)) {
                String e2 = xl2.e();
                dVar.h("Content-Type", "multipart/form-data; boundary=" + e2);
                return e2;
            } else {
                dVar.h("Content-Type", "application/x-www-form-urlencoded; charset=" + dVar.a());
            }
            return null;
        }

        private static void G(nq1.d dVar, OutputStream outputStream, String str) throws IOException {
            Collection<nq1.b> c = dVar.c();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, Charset.forName(dVar.a())));
            if (str != null) {
                for (nq1.b bVar : c) {
                    bufferedWriter.write("--");
                    bufferedWriter.write(str);
                    bufferedWriter.write("\r\n");
                    bufferedWriter.write("Content-Disposition: form-data; name=\"");
                    bufferedWriter.write(gq4.n(bVar.key()));
                    bufferedWriter.write("\"");
                    InputStream z = bVar.z();
                    if (z != null) {
                        bufferedWriter.write("; filename=\"");
                        bufferedWriter.write(gq4.n(bVar.value()));
                        bufferedWriter.write("\"\r\nContent-Type: ");
                        String f = bVar.f();
                        if (f == null) {
                            f = "application/octet-stream";
                        }
                        bufferedWriter.write(f);
                        bufferedWriter.write("\r\n\r\n");
                        bufferedWriter.flush();
                        xl2.a(z, outputStream);
                        outputStream.flush();
                    } else {
                        bufferedWriter.write("\r\n\r\n");
                        bufferedWriter.write(bVar.value());
                    }
                    bufferedWriter.write("\r\n");
                }
                bufferedWriter.write("--");
                bufferedWriter.write(str);
                bufferedWriter.write("--");
            } else {
                String i = dVar.i();
                if (i != null) {
                    bufferedWriter.write(i);
                } else {
                    boolean z2 = true;
                    for (nq1.b bVar2 : c) {
                        if (!z2) {
                            bufferedWriter.append('&');
                        } else {
                            z2 = false;
                        }
                        bufferedWriter.write(URLEncoder.encode(bVar2.key(), dVar.a()));
                        bufferedWriter.write(61);
                        bufferedWriter.write(URLEncoder.encode(bVar2.value(), dVar.a()));
                    }
                }
            }
            bufferedWriter.close();
        }

        private static HttpURLConnection y(c cVar) throws IOException {
            URLConnection uRLConnection;
            Proxy J = cVar.J();
            if (J == null) {
                uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(cVar.b().openConnection());
            } else {
                uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(cVar.b().openConnection(J));
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestMethod(cVar.t().name());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setConnectTimeout(cVar.N());
            httpURLConnection.setReadTimeout(cVar.N() / 2);
            if (cVar.L() != null && (httpURLConnection instanceof HttpsURLConnection)) {
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(cVar.L());
            }
            if (cVar.t().i()) {
                httpURLConnection.setDoOutput(true);
            }
            pw1.a(cVar, httpURLConnection);
            for (Map.Entry entry : cVar.u().entrySet()) {
                for (String str : (List) entry.getValue()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), str);
                }
            }
            return httpURLConnection;
        }

        private static LinkedHashMap<String, List<String>> z(HttpURLConnection httpURLConnection) {
            LinkedHashMap<String, List<String>> linkedHashMap = new LinkedHashMap<>();
            int i = 0;
            while (true) {
                String headerFieldKey = httpURLConnection.getHeaderFieldKey(i);
                String headerField = httpURLConnection.getHeaderField(i);
                if (headerFieldKey == null && headerField == null) {
                    return linkedHashMap;
                }
                i++;
                if (headerFieldKey != null && headerField != null) {
                    if (linkedHashMap.containsKey(headerFieldKey)) {
                        linkedHashMap.get(headerFieldKey).add(headerField);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(headerField);
                        linkedHashMap.put(headerFieldKey, arrayList);
                    }
                }
            }
        }

        void C(Map<String, List<String>> map) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    List<String> value = entry.getValue();
                    if (key.equalsIgnoreCase("Set-Cookie")) {
                        for (String str : value) {
                            if (str != null) {
                                qib qibVar = new qib(str);
                                String trim = qibVar.b(ContainerUtils.KEY_VALUE_DELIMITER).trim();
                                String trim2 = qibVar.g(";").trim();
                                if (trim.length() > 0 && !this.d.containsKey(trim)) {
                                    k(trim, trim2);
                                }
                            }
                        }
                    }
                    for (String str2 : value) {
                        j(key, str2);
                    }
                }
            }
        }

        @Override // defpackage.gq4.b, defpackage.nq1.a
        public /* bridge */ /* synthetic */ URL b() {
            return super.b();
        }

        @Override // defpackage.gq4.b, defpackage.nq1.a
        public /* bridge */ /* synthetic */ Map d() {
            return super.d();
        }

        @Override // defpackage.nq1.e
        public h53 e() throws IOException {
            vvb.e(this.m, "Request must be executed (with .execute(), .get(), or .post() before parsing response");
            if (this.h != null) {
                this.i = new ByteArrayInputStream(this.h.array());
                this.n = false;
            }
            vvb.c(this.n, "Input stream already read and parsed, cannot re-read.");
            h53 f = xl2.f(this.i, this.k, this.a.toExternalForm(), this.p.I());
            f.b1(new gq4(this.p, this));
            this.k = f.f1().d().name();
            this.n = true;
            D();
            return f;
        }

        @Override // defpackage.gq4.b, defpackage.nq1.a
        public /* bridge */ /* synthetic */ String f(String str) {
            return super.f(str);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [nq1$a, nq1$e] */
        @Override // defpackage.gq4.b
        public /* bridge */ /* synthetic */ nq1.e j(String str, String str2) {
            return super.j(str, str2);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [nq1$a, nq1$e] */
        @Override // defpackage.gq4.b
        public /* bridge */ /* synthetic */ nq1.e k(String str, String str2) {
            return super.k(str, str2);
        }

        @Override // defpackage.gq4.b
        public /* bridge */ /* synthetic */ boolean n(String str) {
            return super.n(str);
        }

        @Override // defpackage.gq4.b
        public /* bridge */ /* synthetic */ boolean o(String str) {
            return super.o(str);
        }

        @Override // defpackage.gq4.b
        public /* bridge */ /* synthetic */ boolean p(String str, String str2) {
            return super.p(str, str2);
        }

        @Override // defpackage.gq4.b
        public /* bridge */ /* synthetic */ List q(String str) {
            return super.q(str);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [nq1$a, nq1$e] */
        @Override // defpackage.gq4.b
        public /* bridge */ /* synthetic */ nq1.e v(String str) {
            return super.v(str);
        }

        public String x() {
            return this.l;
        }
    }

    public static nq1 m(String str) {
        gq4 gq4Var = new gq4();
        gq4Var.e(str);
        return gq4Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String n(String str) {
        return str.replace("\"", "%22");
    }

    private static String o(String str) {
        try {
            return p(new URL(str)).toExternalForm();
        } catch (Exception unused) {
            return str;
        }
    }

    static URL p(URL url) {
        URL r = r(url);
        try {
            return new URL(new URI(r.toExternalForm().replace(" ", "%20")).toASCIIString());
        } catch (MalformedURLException | URISyntaxException unused) {
            return r;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean q(nq1.d dVar) {
        for (nq1.b bVar : dVar.c()) {
            if (bVar.g()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static URL r(URL url) {
        if (!wza.f(url.getHost())) {
            try {
                return new URL(url.getProtocol(), IDN.toASCII(url.getHost()), url.getPort(), url.getFile());
            } catch (MalformedURLException e) {
                throw new IllegalArgumentException(e);
            }
        }
        return url;
    }

    @Override // defpackage.nq1
    public nq1 a(boolean z) {
        this.a.B(z);
        return this;
    }

    @Override // defpackage.nq1
    public nq1 b(int i) {
        this.a.O(i);
        return this;
    }

    @Override // defpackage.nq1
    public nq1 c(SSLSocketFactory sSLSocketFactory) {
        this.a.M(sSLSocketFactory);
        return this;
    }

    @Override // defpackage.nq1
    public nq1 d(String str) {
        vvb.k(str, "User agent must not be null");
        this.a.h("User-Agent", str);
        return this;
    }

    @Override // defpackage.nq1
    public nq1 e(String str) {
        vvb.i(str, "Must supply a valid URL");
        try {
            this.a.g(new URL(o(str)));
            return this;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Malformed URL: " + str, e);
        }
    }

    @Override // defpackage.nq1
    public nq1.e execute() throws IOException {
        d A = d.A(this.a);
        this.b = A;
        return A;
    }

    @Override // defpackage.nq1
    public nq1 f(String str) {
        vvb.k(str, "Referrer must not be null");
        this.a.h("Referer", str);
        return this;
    }

    @Override // defpackage.nq1
    public nq1 g(boolean z) {
        this.a.D(z);
        return this;
    }

    public gq4() {
        this.a = new c();
    }

    private gq4(c cVar, d dVar) {
        this.a = cVar;
        this.b = dVar;
    }
}
