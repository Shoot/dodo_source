package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.security.KeyStoreException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: HandshakeCertificates.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005B\u0019\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0017\u0010\b\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000e\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lmm4;", "", "Ljavax/net/ssl/SSLSocketFactory;", "b", "Ljavax/net/ssl/SSLContext;", "a", "Ljavax/net/ssl/X509KeyManager;", "Ljavax/net/ssl/X509KeyManager;", "keyManager", "()Ljavax/net/ssl/X509KeyManager;", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", c.a, "()Ljavax/net/ssl/X509TrustManager;", "trustManager", "<init>", "(Ljavax/net/ssl/X509KeyManager;Ljavax/net/ssl/X509TrustManager;)V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
/* renamed from: mm4  reason: default package */
/* loaded from: classes3.dex */
public final class mm4 {
    private final X509KeyManager a;
    private final X509TrustManager b;

    /* compiled from: HandshakeCertificates.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\u000fR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u0019"}, d2 = {"Lmm4$a;", "", "Lbo4;", "heldCertificate", "", "Ljava/security/cert/X509Certificate;", "intermediates", e.a, "(Lbo4;[Ljava/security/cert/X509Certificate;)Lmm4$a;", "certificate", c.a, "b", "", "hostname", "a", "Lmm4;", DateTokenConverter.CONVERTER_KEY, "Lbo4;", "[Ljava/security/cert/X509Certificate;", "", "Ljava/util/List;", "trustedCertificates", "insecureHosts", "<init>", "()V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: mm4$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private bo4 a;
        private X509Certificate[] b;
        private final List<X509Certificate> c = new ArrayList();
        private final List<String> d = new ArrayList();

        public final a a(String str) {
            z65.h(str, "hostname");
            this.d.add(str);
            return this;
        }

        public final a b() {
            X509Certificate[] acceptedIssuers = xb8.a.g().p().getAcceptedIssuers();
            Collections.addAll(this.c, Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
            return this;
        }

        public final a c(X509Certificate x509Certificate) {
            z65.h(x509Certificate, "certificate");
            this.c.add(x509Certificate);
            return this;
        }

        public final mm4 d() {
            List y = cec.y(this.d);
            bo4 bo4Var = this.a;
            if (bo4Var != null && bo4Var.b().getPrivate().getFormat() == null) {
                throw new KeyStoreException("unable to support unencodable private key");
            }
            X509Certificate[] x509CertificateArr = this.b;
            if (x509CertificateArr == null) {
                x509CertificateArr = new X509Certificate[0];
            }
            return new mm4(lhb.b(null, bo4Var, (X509Certificate[]) Arrays.copyOf(x509CertificateArr, x509CertificateArr.length)), lhb.c(null, this.c, y), null);
        }

        public final a e(bo4 bo4Var, X509Certificate... x509CertificateArr) {
            z65.h(bo4Var, "heldCertificate");
            z65.h(x509CertificateArr, "intermediates");
            this.a = bo4Var;
            this.b = (X509Certificate[]) Arrays.copyOf(x509CertificateArr, x509CertificateArr.length);
            return this;
        }
    }

    public /* synthetic */ mm4(X509KeyManager x509KeyManager, X509TrustManager x509TrustManager, DefaultConstructorMarker defaultConstructorMarker) {
        this(x509KeyManager, x509TrustManager);
    }

    public final SSLContext a() {
        SSLContext n = xb8.a.g().n();
        n.init(new KeyManager[]{this.a}, new TrustManager[]{this.b}, new SecureRandom());
        return n;
    }

    public final SSLSocketFactory b() {
        SSLSocketFactory socketFactory = a().getSocketFactory();
        z65.g(socketFactory, "getSocketFactory(...)");
        return socketFactory;
    }

    public final X509TrustManager c() {
        return this.b;
    }

    private mm4(X509KeyManager x509KeyManager, X509TrustManager x509TrustManager) {
        this.a = x509KeyManager;
        this.b = x509TrustManager;
    }
}
