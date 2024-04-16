package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.bo4;
import defpackage.mm4;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
/* compiled from: TlsUtil.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ.\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0007J7\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\f\"\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Llhb;", "", "", "keyStoreType", "", "Ljava/security/cert/X509Certificate;", "trustedCertificates", "insecureHosts", "Ljavax/net/ssl/X509TrustManager;", c.a, "Lbo4;", "heldCertificate", "", "intermediates", "Ljavax/net/ssl/X509KeyManager;", "b", "(Ljava/lang/String;Lbo4;[Ljava/security/cert/X509Certificate;)Ljavax/net/ssl/X509KeyManager;", "Ljava/security/KeyStore;", "a", "", "[C", "getPassword", "()[C", "password", "Lmm4;", "Lrn5;", "getLocalhost", "()Lmm4;", "localhost", "<init>", "()V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
/* renamed from: lhb  reason: default package */
/* loaded from: classes3.dex */
public final class lhb {
    public static final lhb a = new lhb();
    private static final char[] b;
    private static final rn5 c;

    /* compiled from: TlsUtil.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lmm4;", "a", "()Lmm4;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: lhb$a */
    /* loaded from: classes3.dex */
    static final class a extends ej5 implements Function0<mm4> {
        public static final a a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final mm4 invoke() {
            bo4 b = new bo4.a().c("localhost").a("localhost").a("localhost.localdomain").b();
            return new mm4.a().e(b, new X509Certificate[0]).c(b.a()).d();
        }
    }

    static {
        rn5 b2;
        char[] charArray = "password".toCharArray();
        z65.g(charArray, "toCharArray(...)");
        b = charArray;
        b2 = yn5.b(a.a);
        c = b2;
    }

    private lhb() {
    }

    private final KeyStore a(String str) {
        if (str == null) {
            str = KeyStore.getDefaultType();
        }
        KeyStore keyStore = KeyStore.getInstance(str);
        keyStore.load(null, b);
        z65.g(keyStore, "apply(...)");
        return keyStore;
    }

    public static final X509KeyManager b(String str, bo4 bo4Var, X509Certificate... x509CertificateArr) {
        z65.h(x509CertificateArr, "intermediates");
        KeyStore a2 = a.a(str);
        if (bo4Var != null) {
            Certificate[] certificateArr = new Certificate[x509CertificateArr.length + 1];
            certificateArr[0] = bo4Var.a();
            xr.l(x509CertificateArr, certificateArr, 1, 0, 0, 12, null);
            a2.setKeyEntry("private", bo4Var.b().getPrivate(), b, certificateArr);
        }
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        keyManagerFactory.init(a2, b);
        KeyManager[] keyManagers = keyManagerFactory.getKeyManagers();
        z65.e(keyManagers);
        if (keyManagers.length == 1) {
            KeyManager keyManager = keyManagers[0];
            if (keyManager instanceof X509KeyManager) {
                z65.f(keyManager, "null cannot be cast to non-null type javax.net.ssl.X509KeyManager");
                return (X509KeyManager) keyManager;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected key managers:");
        String arrays = Arrays.toString(keyManagers);
        z65.g(arrays, "toString(...)");
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }

    @IgnoreJRERequirement
    public static final X509TrustManager c(String str, List<? extends X509Certificate> list, List<String> list2) {
        X509TrustManager d45Var;
        z65.h(list, "trustedCertificates");
        z65.h(list2, "insecureHosts");
        KeyStore a2 = a.a(str);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a2.setCertificateEntry("cert_" + i, list.get(i));
        }
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(a2);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        z65.e(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                z65.f(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                if (!list2.isEmpty()) {
                    if (xb8.a.h()) {
                        d45Var = new a45(x509TrustManager, list2);
                    } else {
                        d45Var = new d45(khb.a(x509TrustManager), list2);
                    }
                    return d45Var;
                }
                return x509TrustManager;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        z65.g(arrays, "toString(...)");
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }
}
