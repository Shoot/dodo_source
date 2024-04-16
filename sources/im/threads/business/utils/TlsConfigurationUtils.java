package im.threads.business.utils;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import im.threads.business.logger.LoggerEdna;
import im.threads.business.models.SslSocketFactoryConfig;
import im.threads.business.utils.SSLCertificateInterceptor;
import im.threads.business.utils.TlsConfigurationUtils;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.util.List;
import java.util.NoSuchElementException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
/* compiled from: TlsConfigurationUtils.kt */
@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\b\u001a\u001c\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u001a\u0019\u0010\u0010\u001a\u00020\u00112\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\u0012\u001a\u0019\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0002\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u00172\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\u0018\u001a*\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u001d\u001a\u00020\u000fH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"CERTIFICATE_FORMAT", "", "PROTOCOL_TLS", "createSslSocketFactoryConfig", "Lim/threads/business/models/SslSocketFactoryConfig;", "trustManagers", "", "Ljavax/net/ssl/TrustManager;", "([Ljavax/net/ssl/TrustManager;)Lim/threads/business/models/SslSocketFactoryConfig;", "createTlsPinningKeyStore", "Ljava/security/KeyStore;", "resources", "Landroid/content/res/Resources;", "trustedSSLCertificates", "", "", "createTlsPinningSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "([Ljavax/net/ssl/TrustManager;)Ljavax/net/ssl/SSLSocketFactory;", "getTrustManagers", "keyStore", "(Ljava/security/KeyStore;)[Ljavax/net/ssl/TrustManager;", "getX509TrustManager", "Ljavax/net/ssl/X509TrustManager;", "([Ljavax/net/ssl/TrustManager;)Ljavax/net/ssl/X509TrustManager;", "loadCertificateIntoKeyStore", "", "certificateFactory", "Ljava/security/cert/CertificateFactory;", "rawResId", "threads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TlsConfigurationUtils {
    private static final String CERTIFICATE_FORMAT = "X.509";
    private static final String PROTOCOL_TLS = "TLS";

    public static final SslSocketFactoryConfig createSslSocketFactoryConfig(TrustManager[] trustManagerArr) {
        z65.h(trustManagerArr, "trustManagers");
        return new SslSocketFactoryConfig(createTlsPinningSocketFactory(trustManagerArr), getX509TrustManager(trustManagerArr));
    }

    public static final KeyStore createTlsPinningKeyStore(Resources resources, List<Integer> list) {
        z65.h(resources, "resources");
        z65.h(list, "trustedSSLCertificates");
        CertificateFactory certificateFactory = CertificateFactory.getInstance(CERTIFICATE_FORMAT);
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        for (Integer num : list) {
            int intValue = num.intValue();
            z65.g(certificateFactory, "certificateFactory");
            z65.g(keyStore, "keyStore");
            loadCertificateIntoKeyStore(certificateFactory, keyStore, resources, intValue);
        }
        z65.g(keyStore, "keyStore");
        return keyStore;
    }

    public static final SSLSocketFactory createTlsPinningSocketFactory(TrustManager[] trustManagerArr) {
        z65.h(trustManagerArr, "trustManagers");
        SSLContext sSLContext = SSLContext.getInstance(PROTOCOL_TLS);
        sSLContext.init(null, trustManagerArr, new SecureRandom());
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        z65.g(socketFactory, "sslContext.socketFactory");
        return socketFactory;
    }

    public static final TrustManager[] getTrustManagers(KeyStore keyStore) {
        z65.h(keyStore, "keyStore");
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        z65.g(trustManagers, "trustManagerFactory.trustManagers");
        return trustManagers;
    }

    public static final X509TrustManager getX509TrustManager(TrustManager[] trustManagerArr) {
        z65.h(trustManagerArr, "trustManagers");
        for (TrustManager trustManager : trustManagerArr) {
            if (trustManager instanceof X509TrustManager) {
                z65.f(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    private static final void loadCertificateIntoKeyStore(CertificateFactory certificateFactory, KeyStore keyStore, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                final Certificate generateCertificate = certificateFactory.generateCertificate(inputStream);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: ihb
                    @Override // java.lang.Runnable
                    public final void run() {
                        TlsConfigurationUtils.loadCertificateIntoKeyStore$lambda$1(generateCertificate);
                    }
                }, 1000L);
                keyStore.setCertificateEntry(resources.getResourceName(i), generateCertificate);
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (Throwable th) {
                th = th;
                if (inputStream != null) {
                    inputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadCertificateIntoKeyStore$lambda$1(Certificate certificate) {
        List<? extends Certificate> e;
        try {
            SSLCertificateInterceptor.Companion companion = SSLCertificateInterceptor.Companion;
            e = jc1.e(certificate);
            companion.logCertificates(e, null, "Local SSL certificate");
        } catch (Exception e2) {
            LoggerEdna.error("SSLCertificatesHandling", "Impossible to get certificate", e2);
        }
    }
}
