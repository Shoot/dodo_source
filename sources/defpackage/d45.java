package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
/* compiled from: InsecureExtendedTrustManager.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u001a\u001a\u00020\u0001\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0010J'\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u00020\u00112\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J1\u0010\u0015\u001a\u00020\u00112\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0017\u001a\u00020\u00112\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001c¨\u0006 "}, d2 = {"Ld45;", "Ljavax/net/ssl/X509ExtendedTrustManager;", "", "Ljava/security/cert/X509Certificate;", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "chain", "", "authType", "Ljava/net/Socket;", "socket", "", "checkServerTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/net/Socket;)V", "Ljavax/net/ssl/SSLEngine;", "engine", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLEngine;)V", "", DateTokenConverter.CONVERTER_KEY, "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)Ljava/lang/Void;", "a", c.a, "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLEngine;)Ljava/lang/Void;", "b", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/net/Socket;)Ljava/lang/Void;", "Ljavax/net/ssl/X509ExtendedTrustManager;", "delegate", "", "Ljava/util/List;", "insecureHosts", "<init>", "(Ljavax/net/ssl/X509ExtendedTrustManager;Ljava/util/List;)V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
@IgnoreJRERequirement
/* renamed from: d45  reason: default package */
/* loaded from: classes3.dex */
public final class d45 extends X509ExtendedTrustManager {
    private final X509ExtendedTrustManager a;
    private final List<String> b;

    public d45(X509ExtendedTrustManager x509ExtendedTrustManager, List<String> list) {
        z65.h(x509ExtendedTrustManager, "delegate");
        z65.h(list, "insecureHosts");
        this.a = x509ExtendedTrustManager;
        this.b = list;
    }

    @Override // javax.net.ssl.X509TrustManager
    /* renamed from: a */
    public Void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        z65.h(x509CertificateArr, "chain");
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    /* renamed from: b */
    public Void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        z65.h(x509CertificateArr, "chain");
        z65.h(str, "authType");
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    /* renamed from: c */
    public Void checkClientTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        z65.h(x509CertificateArr, "chain");
        z65.h(str, "authType");
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509TrustManager
    /* renamed from: d */
    public Void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        z65.h(x509CertificateArr, "chain");
        z65.h(str, "authType");
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] acceptedIssuers = this.a.getAcceptedIssuers();
        z65.g(acceptedIssuers, "getAcceptedIssuers(...)");
        return acceptedIssuers;
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, Socket socket) {
        z65.h(x509CertificateArr, "chain");
        z65.h(str, "authType");
        z65.h(socket, "socket");
        if (this.b.contains(cec.n(socket))) {
            return;
        }
        this.a.checkServerTrusted(x509CertificateArr, str, socket);
    }

    @Override // javax.net.ssl.X509ExtendedTrustManager
    public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str, SSLEngine sSLEngine) {
        z65.h(x509CertificateArr, "chain");
        z65.h(str, "authType");
        z65.h(sSLEngine, "engine");
        if (this.b.contains(sSLEngine.getPeerHost())) {
            return;
        }
        this.a.checkServerTrusted(x509CertificateArr, str, sSLEngine);
    }
}
