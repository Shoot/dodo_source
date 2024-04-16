package defpackage;

import com.huawei.hms.opendevice.c;
import java.lang.reflect.Method;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
/* compiled from: InsecureAndroidTrustManager.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\n\u001a\u00020\t2\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\t2\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"La45;", "Ljavax/net/ssl/X509TrustManager;", "", "Ljava/security/cert/X509Certificate;", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "chain", "", "authType", "", "a", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)Ljava/lang/Void;", "b", "Ljavax/net/ssl/X509TrustManager;", "delegate", "", "Ljava/util/List;", "insecureHosts", "Ljava/lang/reflect/Method;", c.a, "Ljava/lang/reflect/Method;", "checkServerTrustedMethod", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/util/List;)V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
/* renamed from: a45  reason: default package */
/* loaded from: classes3.dex */
public final class a45 implements X509TrustManager {
    private final X509TrustManager a;
    private final List<String> b;
    private final Method c;

    public a45(X509TrustManager x509TrustManager, List<String> list) {
        Method method;
        z65.h(x509TrustManager, "delegate");
        z65.h(list, "insecureHosts");
        this.a = x509TrustManager;
        this.b = list;
        try {
            method = x509TrustManager.getClass().getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class);
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        this.c = method;
    }

    @Override // javax.net.ssl.X509TrustManager
    /* renamed from: a */
    public Void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        z65.h(x509CertificateArr, "chain");
        throw new CertificateException("Unsupported operation");
    }

    @Override // javax.net.ssl.X509TrustManager
    /* renamed from: b */
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
}
