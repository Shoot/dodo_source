package im.threads.business.models;

import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
/* compiled from: SslSocketFactoryConfig.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lim/threads/business/models/SslSocketFactoryConfig;", "", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "trustManager", "Ljavax/net/ssl/X509TrustManager;", "(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)V", "getSslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "getTrustManager", "()Ljavax/net/ssl/X509TrustManager;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SslSocketFactoryConfig {
    private final SSLSocketFactory sslSocketFactory;
    private final X509TrustManager trustManager;

    public SslSocketFactoryConfig(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        z65.h(sSLSocketFactory, "sslSocketFactory");
        z65.h(x509TrustManager, "trustManager");
        this.sslSocketFactory = sSLSocketFactory;
        this.trustManager = x509TrustManager;
    }

    public static /* synthetic */ SslSocketFactoryConfig copy$default(SslSocketFactoryConfig sslSocketFactoryConfig, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, int i, Object obj) {
        if ((i & 1) != 0) {
            sSLSocketFactory = sslSocketFactoryConfig.sslSocketFactory;
        }
        if ((i & 2) != 0) {
            x509TrustManager = sslSocketFactoryConfig.trustManager;
        }
        return sslSocketFactoryConfig.copy(sSLSocketFactory, x509TrustManager);
    }

    public final SSLSocketFactory component1() {
        return this.sslSocketFactory;
    }

    public final X509TrustManager component2() {
        return this.trustManager;
    }

    public final SslSocketFactoryConfig copy(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        z65.h(sSLSocketFactory, "sslSocketFactory");
        z65.h(x509TrustManager, "trustManager");
        return new SslSocketFactoryConfig(sSLSocketFactory, x509TrustManager);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SslSocketFactoryConfig)) {
            return false;
        }
        SslSocketFactoryConfig sslSocketFactoryConfig = (SslSocketFactoryConfig) obj;
        if (z65.c(this.sslSocketFactory, sslSocketFactoryConfig.sslSocketFactory) && z65.c(this.trustManager, sslSocketFactoryConfig.trustManager)) {
            return true;
        }
        return false;
    }

    public final SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public final X509TrustManager getTrustManager() {
        return this.trustManager;
    }

    public int hashCode() {
        return (this.sslSocketFactory.hashCode() * 31) + this.trustManager.hashCode();
    }

    public String toString() {
        SSLSocketFactory sSLSocketFactory = this.sslSocketFactory;
        X509TrustManager x509TrustManager = this.trustManager;
        return "SslSocketFactoryConfig(sslSocketFactory=" + sSLSocketFactory + ", trustManager=" + x509TrustManager + ")";
    }
}
