package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
/* compiled from: ConscryptPlatform.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u0019\u001aB\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0004H\u0016R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lar1;", "Lxb8;", "Ljavax/net/ssl/SSLContext;", "n", "Ljavax/net/ssl/X509TrustManager;", "p", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lvr8;", "protocols", "", e.a, Image.TYPE_HIGH, "trustManager", "Ljavax/net/ssl/SSLSocketFactory;", "o", "Ljava/security/Provider;", DateTokenConverter.CONVERTER_KEY, "Ljava/security/Provider;", "provider", "<init>", "()V", "a", "b", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: ar1  reason: default package */
/* loaded from: classes3.dex */
public final class ar1 extends xb8 {
    public static final a e;
    private static final boolean f;
    private final Provider d;

    /* compiled from: ConscryptPlatform.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lar1$a;", "", "Lar1;", "b", "", "major", "minor", "patch", "", "a", "isSupported", "Z", c.a, "()Z", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ar1$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(int i, int i2, int i3) {
            Conscrypt.Version version = Conscrypt.version();
            if (version == null) {
                return false;
            }
            if (version.major() != i) {
                if (version.major() <= i) {
                    return false;
                }
                return true;
            } else if (version.minor() != i2) {
                if (version.minor() <= i2) {
                    return false;
                }
                return true;
            } else if (version.patch() < i3) {
                return false;
            } else {
                return true;
            }
        }

        public final ar1 b() {
            if (!c()) {
                return null;
            }
            return new ar1(null);
        }

        public final boolean c() {
            return ar1.f;
        }
    }

    /* compiled from: ConscryptPlatform.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lar1$b;", "Lorg/conscrypt/ConscryptHostnameVerifier;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ar1$b */
    /* loaded from: classes3.dex */
    public static final class b implements ConscryptHostnameVerifier {
        public static final b a = new b();

        private b() {
        }
    }

    static {
        a aVar = new a(null);
        e = aVar;
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (aVar.a(2, 1, 0)) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f = z;
    }

    public /* synthetic */ ar1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // defpackage.xb8
    public void e(SSLSocket sSLSocket, String str, List<vr8> list) {
        z65.h(sSLSocket, "sslSocket");
        z65.h(list, "protocols");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) xb8.a.b(list).toArray(new String[0]));
            return;
        }
        super.e(sSLSocket, str, list);
    }

    @Override // defpackage.xb8
    public String h(SSLSocket sSLSocket) {
        z65.h(sSLSocket, "sslSocket");
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.h(sSLSocket);
    }

    @Override // defpackage.xb8
    public SSLContext n() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.d);
        z65.g(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    @Override // defpackage.xb8
    public SSLSocketFactory o(X509TrustManager x509TrustManager) {
        z65.h(x509TrustManager, "trustManager");
        SSLContext n = n();
        n.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = n.getSocketFactory();
        z65.g(socketFactory, "getSocketFactory(...)");
        return socketFactory;
    }

    @Override // defpackage.xb8
    public X509TrustManager p() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        z65.e(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                z65.f(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                Conscrypt.setHostnameVerifier(x509TrustManager, b.a);
                return x509TrustManager;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        z65.g(arrays, "toString(...)");
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }

    private ar1() {
        Provider newProvider = Conscrypt.newProvider();
        z65.g(newProvider, "newProvider(...)");
        this.d = newProvider;
    }
}
