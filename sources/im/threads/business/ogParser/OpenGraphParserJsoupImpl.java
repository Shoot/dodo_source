package im.threads.business.ogParser;

import com.huawei.hms.push.constant.RemoteMessageConst;
import im.threads.business.logger.LoggerEdna;
import java.security.KeyManagementException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OpenGraphParserJsoupImpl.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001c\u0010\f\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016J\u0014\u0010\f\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0014\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R(\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\t0\t0\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lim/threads/business/ogParser/OpenGraphParserJsoupImpl;", "Lim/threads/business/ogParser/OpenGraphParser;", "Ljavax/net/ssl/SSLSocketFactory;", "socketFactory", "", "urlToParse", "getHostAndPath", "Lh53;", "doc", "Lim/threads/business/ogParser/OGData;", "organizeFetchedData", "messageText", "getContents", "getCachedContents", "Lks8;", "kotlin.jvm.PlatformType", "openGraphParsingStream", "Lks8;", "getOpenGraphParsingStream", "()Lks8;", "<init>", "()V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class OpenGraphParserJsoupImpl implements OpenGraphParser {
    public static final Companion Companion = new Companion(null);
    private static final HashMap<String, OGData> existedOpenGraphs = new HashMap<>();
    private final ks8<OGData> openGraphParsingStream;

    /* compiled from: OpenGraphParserJsoupImpl.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R,\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00078BX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lim/threads/business/ogParser/OpenGraphParserJsoupImpl$Companion;", "", "()V", "existedOpenGraphs", "Ljava/util/HashMap;", "", "Lim/threads/business/ogParser/OGData;", "Lkotlin/collections/HashMap;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public OpenGraphParserJsoupImpl() {
        ks8<OGData> z = ks8.z();
        z65.g(z, "create<OGData>()");
        this.openGraphParsingStream = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r0 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String getHostAndPath(java.lang.String r10) {
        /*
            r9 = this;
            android.net.Uri r0 = android.net.Uri.parse(r10)
            java.lang.String r1 = ""
            if (r0 == 0) goto L64
            java.lang.String r2 = r0.getHost()
            if (r2 != 0) goto L10
            r3 = r1
            goto L11
        L10:
            r3 = r2
        L11:
            java.lang.String r2 = "it.host ?: \"\""
            defpackage.z65.g(r3, r2)
            r2 = 2
            r4 = 0
            java.lang.String r5 = "www."
            r6 = 0
            boolean r2 = defpackage.c0b.O(r3, r5, r6, r2, r4)
            if (r2 == 0) goto L2c
            java.lang.String r4 = "www."
            java.lang.String r5 = ""
            r6 = 0
            r7 = 4
            r8 = 0
            java.lang.String r3 = defpackage.c0b.F(r3, r4, r5, r6, r7, r8)
        L2c:
            java.lang.String r2 = r0.getPath()
            if (r2 != 0) goto L33
            r2 = r1
        L33:
            java.lang.String r0 = r0.getQuery()
            if (r0 == 0) goto L4c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "?"
            r4.append(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            if (r0 != 0) goto L4d
        L4c:
            r0 = r1
        L4d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            if (r0 != 0) goto L62
            goto L64
        L62:
            r10 = r0
            goto L67
        L64:
            if (r10 != 0) goto L67
            r10 = r1
        L67:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: im.threads.business.ogParser.OpenGraphParserJsoupImpl.getHostAndPath(java.lang.String):java.lang.String");
    }

    private final OGData organizeFetchedData(h53 h53Var) {
        OGData oGData = new OGData(null, null, null, null, null, null, null, null, 255, null);
        se3 N0 = h53Var.N0("meta[property^=og:]");
        if (N0.size() > 0) {
            z65.g(N0, "ogTags");
            int i = 0;
            for (re3 re3Var : N0) {
                int i2 = i + 1;
                if (i < 0) {
                    kc1.v();
                }
                re3 re3Var2 = N0.get(i);
                String e = re3Var2.e("property");
                String e2 = re3Var2.e(RemoteMessageConst.Notification.CONTENT);
                if (e != null) {
                    switch (e.hashCode()) {
                        case -1560364132:
                            if (!e.equals("og:type")) {
                                break;
                            } else {
                                z65.g(e2, RemoteMessageConst.Notification.CONTENT);
                                oGData.setType(e2);
                                continue;
                            }
                        case -1137178311:
                            if (!e.equals("og:image")) {
                                break;
                            } else {
                                z65.g(e2, RemoteMessageConst.Notification.CONTENT);
                                oGData.setImageUrl(e2);
                                continue;
                            }
                        case -1127120330:
                            if (!e.equals("og:title")) {
                                break;
                            } else {
                                z65.g(e2, RemoteMessageConst.Notification.CONTENT);
                                oGData.setTitle(e2);
                                continue;
                            }
                        case -1020164915:
                            if (!e.equals("og:url")) {
                                break;
                            } else {
                                z65.g(e2, RemoteMessageConst.Notification.CONTENT);
                                oGData.setUrl(e2);
                                continue;
                            }
                        case 1029113178:
                            if (!e.equals("og:description")) {
                                break;
                            } else {
                                z65.g(e2, RemoteMessageConst.Notification.CONTENT);
                                oGData.setDescription(e2);
                                continue;
                            }
                        case 1994525025:
                            if (!e.equals("og:site_name")) {
                                break;
                            } else {
                                z65.g(e2, RemoteMessageConst.Notification.CONTENT);
                                oGData.setSiteName(e2);
                                continue;
                            }
                    }
                }
                i = i2;
            }
        }
        return oGData;
    }

    private final SSLSocketFactory socketFactory() {
        TrustManager[] trustManagerArr = {new X509TrustManager() { // from class: im.threads.business.ogParser.OpenGraphParserJsoupImpl$socketFactory$trustAllCerts$1
            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
                z65.h(x509CertificateArr, "chain");
                z65.h(str, "authType");
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
                z65.h(x509CertificateArr, "chain");
                z65.h(str, "authType");
            }

            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }};
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
            z65.g(socketFactory, "sslContext.socketFactory");
            return socketFactory;
        } catch (Exception e) {
            if (!(e instanceof RuntimeException) && !(e instanceof KeyManagementException)) {
                throw e;
            }
            throw new RuntimeException("Failed to create a SSL socket factory", e);
        }
    }

    @Override // im.threads.business.ogParser.OpenGraphParser
    public OGData getCachedContents(String str) {
        if (str == null) {
            return null;
        }
        return existedOpenGraphs.get(getHostAndPath(str));
    }

    @Override // im.threads.business.ogParser.OpenGraphParser
    public OGData getContents(String str, String str2) {
        OGData contents = getContents(str);
        if (contents != null) {
            contents.setMessageText(str2);
            return contents;
        }
        OGData oGData = new OGData(null, null, null, null, null, null, null, null, 255, null);
        oGData.setMessageText(str2);
        return oGData;
    }

    @Override // im.threads.business.ogParser.OpenGraphParser
    public ks8<OGData> getOpenGraphParsingStream() {
        return this.openGraphParsingStream;
    }

    @Override // im.threads.business.ogParser.OpenGraphParser
    public OGData getContents(String str) {
        if (str == null) {
            return null;
        }
        LoggerEdna.info("OGParser Url: " + str);
        try {
            h53 e = ed5.a(str).c(socketFactory()).g(true).d("Mozilla").f("http://www.google.com").b(12000).a(true).execute().e();
            z65.g(e, "doc");
            OGData organizeFetchedData = organizeFetchedData(e);
            organizeFetchedData.setParsedUrl(str);
            existedOpenGraphs.put(getHostAndPath(str), organizeFetchedData);
            LoggerEdna.info("OGParser Result: : " + organizeFetchedData);
            return organizeFetchedData;
        } catch (Exception e2) {
            LoggerEdna.error("Error when parsing OG data!", e2);
            return null;
        }
    }
}
