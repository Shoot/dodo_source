package ch.qos.logback.core.net.ssl;

import ch.qos.logback.core.spi.ContextAware;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
/* loaded from: classes.dex */
public class SSLContextFactoryBean {
    private static final String JSSE_KEY_STORE_PROPERTY = "javax.net.ssl.keyStore";
    private static final String JSSE_TRUST_STORE_PROPERTY = "javax.net.ssl.trustStore";
    private KeyManagerFactoryFactoryBean keyManagerFactory;
    private KeyStoreFactoryBean keyStore;
    private String protocol;
    private String provider;
    private SecureRandomFactoryBean secureRandom;
    private TrustManagerFactoryFactoryBean trustManagerFactory;
    private KeyStoreFactoryBean trustStore;

    private KeyManager[] createKeyManagers(ContextAware contextAware) throws NoSuchProviderException, NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException {
        if (getKeyStore() == null) {
            return null;
        }
        KeyStore createKeyStore = getKeyStore().createKeyStore();
        contextAware.addInfo("key store of type '" + createKeyStore.getType() + "' provider '" + createKeyStore.getProvider() + "': " + getKeyStore().getLocation());
        KeyManagerFactory createKeyManagerFactory = getKeyManagerFactory().createKeyManagerFactory();
        contextAware.addInfo("key manager algorithm '" + createKeyManagerFactory.getAlgorithm() + "' provider '" + createKeyManagerFactory.getProvider() + "'");
        createKeyManagerFactory.init(createKeyStore, getKeyStore().getPassword().toCharArray());
        return createKeyManagerFactory.getKeyManagers();
    }

    private SecureRandom createSecureRandom(ContextAware contextAware) throws NoSuchProviderException, NoSuchAlgorithmException {
        SecureRandom createSecureRandom = getSecureRandom().createSecureRandom();
        contextAware.addInfo("secure random algorithm '" + createSecureRandom.getAlgorithm() + "' provider '" + createSecureRandom.getProvider() + "'");
        return createSecureRandom;
    }

    private TrustManager[] createTrustManagers(ContextAware contextAware) throws NoSuchProviderException, NoSuchAlgorithmException, KeyStoreException {
        if (getTrustStore() == null) {
            return null;
        }
        KeyStore createKeyStore = getTrustStore().createKeyStore();
        contextAware.addInfo("trust store of type '" + createKeyStore.getType() + "' provider '" + createKeyStore.getProvider() + "': " + getTrustStore().getLocation());
        TrustManagerFactory createTrustManagerFactory = getTrustManagerFactory().createTrustManagerFactory();
        contextAware.addInfo("trust manager algorithm '" + createTrustManagerFactory.getAlgorithm() + "' provider '" + createTrustManagerFactory.getProvider() + "'");
        createTrustManagerFactory.init(createKeyStore);
        return createTrustManagerFactory.getTrustManagers();
    }

    private KeyStoreFactoryBean keyStoreFromSystemProperties(String str) {
        if (System.getProperty(str) == null) {
            return null;
        }
        KeyStoreFactoryBean keyStoreFactoryBean = new KeyStoreFactoryBean();
        keyStoreFactoryBean.setLocation(locationFromSystemProperty(str));
        keyStoreFactoryBean.setProvider(System.getProperty(str + "Provider"));
        keyStoreFactoryBean.setPassword(System.getProperty(str + "Password"));
        keyStoreFactoryBean.setType(System.getProperty(str + "Type"));
        return keyStoreFactoryBean;
    }

    private String locationFromSystemProperty(String str) {
        String property = System.getProperty(str);
        if (property != null && !property.startsWith("file:")) {
            return "file:" + property;
        }
        return property;
    }

    public SSLContext createContext(ContextAware contextAware) throws NoSuchProviderException, NoSuchAlgorithmException, KeyManagementException, UnrecoverableKeyException, KeyStoreException, CertificateException {
        SSLContext sSLContext;
        if (getProvider() != null) {
            sSLContext = SSLContext.getInstance(getProtocol(), getProvider());
        } else {
            sSLContext = SSLContext.getInstance(getProtocol());
        }
        contextAware.addInfo("SSL protocol '" + sSLContext.getProtocol() + "' provider '" + sSLContext.getProvider() + "'");
        sSLContext.init(createKeyManagers(contextAware), createTrustManagers(contextAware), createSecureRandom(contextAware));
        return sSLContext;
    }

    public KeyManagerFactoryFactoryBean getKeyManagerFactory() {
        KeyManagerFactoryFactoryBean keyManagerFactoryFactoryBean = this.keyManagerFactory;
        if (keyManagerFactoryFactoryBean == null) {
            return new KeyManagerFactoryFactoryBean();
        }
        return keyManagerFactoryFactoryBean;
    }

    public KeyStoreFactoryBean getKeyStore() {
        if (this.keyStore == null) {
            this.keyStore = keyStoreFromSystemProperties(JSSE_KEY_STORE_PROPERTY);
        }
        return this.keyStore;
    }

    public String getProtocol() {
        String str = this.protocol;
        if (str == null) {
            return SSL.DEFAULT_PROTOCOL;
        }
        return str;
    }

    public String getProvider() {
        return this.provider;
    }

    public SecureRandomFactoryBean getSecureRandom() {
        SecureRandomFactoryBean secureRandomFactoryBean = this.secureRandom;
        if (secureRandomFactoryBean == null) {
            return new SecureRandomFactoryBean();
        }
        return secureRandomFactoryBean;
    }

    public TrustManagerFactoryFactoryBean getTrustManagerFactory() {
        TrustManagerFactoryFactoryBean trustManagerFactoryFactoryBean = this.trustManagerFactory;
        if (trustManagerFactoryFactoryBean == null) {
            return new TrustManagerFactoryFactoryBean();
        }
        return trustManagerFactoryFactoryBean;
    }

    public KeyStoreFactoryBean getTrustStore() {
        if (this.trustStore == null) {
            this.trustStore = keyStoreFromSystemProperties(JSSE_TRUST_STORE_PROPERTY);
        }
        return this.trustStore;
    }

    public void setKeyManagerFactory(KeyManagerFactoryFactoryBean keyManagerFactoryFactoryBean) {
        this.keyManagerFactory = keyManagerFactoryFactoryBean;
    }

    public void setKeyStore(KeyStoreFactoryBean keyStoreFactoryBean) {
        this.keyStore = keyStoreFactoryBean;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public void setSecureRandom(SecureRandomFactoryBean secureRandomFactoryBean) {
        this.secureRandom = secureRandomFactoryBean;
    }

    public void setTrustManagerFactory(TrustManagerFactoryFactoryBean trustManagerFactoryFactoryBean) {
        this.trustManagerFactory = trustManagerFactoryFactoryBean;
    }

    public void setTrustStore(KeyStoreFactoryBean keyStoreFactoryBean) {
        this.trustStore = keyStoreFactoryBean;
    }
}
