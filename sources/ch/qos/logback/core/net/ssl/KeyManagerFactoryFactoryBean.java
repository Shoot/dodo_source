package ch.qos.logback.core.net.ssl;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.net.ssl.KeyManagerFactory;
/* loaded from: classes.dex */
public class KeyManagerFactoryFactoryBean {
    private String algorithm;
    private String provider;

    public KeyManagerFactory createKeyManagerFactory() throws NoSuchProviderException, NoSuchAlgorithmException {
        if (getProvider() != null) {
            return KeyManagerFactory.getInstance(getAlgorithm(), getProvider());
        }
        return KeyManagerFactory.getInstance(getAlgorithm());
    }

    public String getAlgorithm() {
        String str = this.algorithm;
        if (str == null) {
            return KeyManagerFactory.getDefaultAlgorithm();
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
