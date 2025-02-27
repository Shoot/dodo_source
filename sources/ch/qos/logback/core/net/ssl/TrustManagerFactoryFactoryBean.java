package ch.qos.logback.core.net.ssl;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.net.ssl.TrustManagerFactory;
/* loaded from: classes.dex */
public class TrustManagerFactoryFactoryBean {
    private String algorithm;
    private String provider;

    public TrustManagerFactory createTrustManagerFactory() throws NoSuchProviderException, NoSuchAlgorithmException {
        if (getProvider() != null) {
            return TrustManagerFactory.getInstance(getAlgorithm(), getProvider());
        }
        return TrustManagerFactory.getInstance(getAlgorithm());
    }

    public String getAlgorithm() {
        String str = this.algorithm;
        if (str == null) {
            return TrustManagerFactory.getDefaultAlgorithm();
        }
        return str;
    }

    public String getProvider() {
        return this.provider;
    }

    public void setAlgorithm(String str) {
        this.algorithm = str;
    }

    public void setProvider(String str) {
        this.provider = str;
    }
}
