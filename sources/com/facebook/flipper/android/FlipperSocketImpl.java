package com.facebook.flipper.android;

import android.net.TrafficStats;
import android.util.Log;
import com.facebook.flipper.core.FlipperObject;
import com.facebook.flipper.core.FlipperSocket;
import com.facebook.flipper.core.FlipperSocketEventHandler;
import com.facebook.proguard.annotations.DoNotStrip;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertPath;
import java.security.cert.CertPathValidator;
import java.security.cert.CertPathValidatorException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
@DoNotStrip
/* loaded from: classes2.dex */
class FlipperSocketImpl extends q3c implements FlipperSocket {
    private static final int CERTIFICATE_TTL_DAYS = 30;
    FlipperSocketEventHandler mEventHandler;

    /* loaded from: classes2.dex */
    public class FlipperTrustManager implements X509TrustManager {
        Certificate mCA;

        public FlipperTrustManager(String str) throws Exception {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
            try {
                this.mCA = certificateFactory.generateCertificate(bufferedInputStream);
                bufferedInputStream.close();
                if (this.mCA != null) {
                    return;
                }
                throw new Exception("Unable to find a valid trust manager.");
            } catch (Throwable th) {
                bufferedInputStream.close();
                throw th;
            }
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            throw new CertificateException("No client certificate verification provided");
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            try {
                checkServerTrustedImpl(x509CertificateArr);
            } catch (Exception e) {
                e = e;
                if (!(e instanceof CertificateException)) {
                    e = new CertificateException(e);
                }
                throw ((CertificateException) e);
            }
        }

        public void checkServerTrustedImpl(X509Certificate[] x509CertificateArr) throws CertificateException {
            if (x509CertificateArr.length == 2) {
                Date date = new Date();
                for (X509Certificate x509Certificate : x509CertificateArr) {
                    x509Certificate.checkValidity(date);
                    Date notBefore = x509Certificate.getNotBefore();
                    if (!notBefore.after(date)) {
                        long convert = TimeUnit.DAYS.convert(date.getTime() - notBefore.getTime(), TimeUnit.MILLISECONDS);
                        if (convert < 0 || convert > 30) {
                            throw new CertificateException("Unable to accept certificate in the chain");
                        }
                    } else {
                        throw new CertificateException("Unable to accept certificate in the chain");
                    }
                }
                try {
                    CertPathValidator certPathValidator = CertPathValidator.getInstance(CertPathValidator.getDefaultType());
                    CertPath generateCertPath = CertificateFactory.getInstance("X.509").generateCertPath(Arrays.asList(x509CertificateArr));
                    try {
                        PKIXParameters pKIXParameters = new PKIXParameters(Collections.singleton(new TrustAnchor((X509Certificate) this.mCA, null)));
                        pKIXParameters.setDate(date);
                        pKIXParameters.setRevocationEnabled(false);
                        try {
                            certPathValidator.validate(generateCertPath, pKIXParameters);
                            return;
                        } catch (InvalidAlgorithmParameterException | CertPathValidatorException e) {
                            throw new CertificateException(e);
                        }
                    } catch (InvalidAlgorithmParameterException e2) {
                        throw new CertificateException(e2);
                    }
                } catch (NoSuchAlgorithmException e3) {
                    throw new CertificateException(e3);
                }
            }
            throw new CertificateException("Certificate chain is invalid. Invalid length");
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[]{(X509Certificate) this.mCA};
        }
    }

    static {
        zpa.d("flipper");
    }

    FlipperSocketImpl(String str) throws URISyntaxException {
        super(new URI(str));
    }

    @Override // com.facebook.flipper.core.FlipperSocket
    public void flipperConnect() {
        if (isOpen()) {
            return;
        }
        try {
            FlipperObject onAuthenticationChallengeReceived = this.mEventHandler.onAuthenticationChallengeReceived();
            if (onAuthenticationChallengeReceived.contains("certificates_client_path") && onAuthenticationChallengeReceived.contains("certificates_client_pass")) {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                KeyStore keyStore = KeyStore.getInstance("PKCS12");
                String string = onAuthenticationChallengeReceived.getString("certificates_client_path");
                String string2 = onAuthenticationChallengeReceived.getString("certificates_client_pass");
                String string3 = onAuthenticationChallengeReceived.getString("certificates_ca_path");
                FileInputStream fileInputStream = new FileInputStream(string);
                keyStore.load(fileInputStream, string2.toCharArray());
                fileInputStream.close();
                KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
                keyManagerFactory.init(keyStore, string2.toCharArray());
                sSLContext.init(keyManagerFactory.getKeyManagers(), new TrustManager[]{new FlipperTrustManager(string3)}, null);
                setSocketFactory(new DelegatingSocketFactory(sSLContext.getSocketFactory()) { // from class: com.facebook.flipper.android.FlipperSocketImpl.1
                    @Override // com.facebook.flipper.android.DelegatingSocketFactory
                    protected Socket configureSocket(Socket socket) {
                        TrafficStats.setThreadStatsTag(FlipperSocket.SOCKET_TAG);
                        return socket;
                    }
                });
            }
            connect();
        } catch (Exception e) {
            Log.e("Flipper", "Failed to initialize the socket before connect. " + e.getMessage());
            this.mEventHandler.onConnectionEvent(FlipperSocketEventHandler.SocketEvent.ERROR);
        }
    }

    @Override // com.facebook.flipper.core.FlipperSocket
    public void flipperDisconnect() {
        this.mEventHandler.onConnectionEvent(FlipperSocketEventHandler.SocketEvent.CLOSE);
        this.mEventHandler = new FlipperSocketEventHandler() { // from class: com.facebook.flipper.android.FlipperSocketImpl.2
            @Override // com.facebook.flipper.core.FlipperSocketEventHandler
            public FlipperObject onAuthenticationChallengeReceived() {
                return null;
            }

            @Override // com.facebook.flipper.core.FlipperSocketEventHandler
            public void onConnectionEvent(FlipperSocketEventHandler.SocketEvent socketEvent) {
            }

            @Override // com.facebook.flipper.core.FlipperSocketEventHandler
            public void onMessageReceived(String str) {
            }
        };
        super.close();
    }

    @Override // com.facebook.flipper.core.FlipperSocket
    public void flipperSend(String str) {
        send(str);
    }

    @Override // com.facebook.flipper.core.FlipperSocket
    public void flipperSetEventHandler(FlipperSocketEventHandler flipperSocketEventHandler) {
        this.mEventHandler = flipperSocketEventHandler;
    }

    @Override // defpackage.q3c
    public void onClose(int i, String str, boolean z) {
        this.mEventHandler.onConnectionEvent(FlipperSocketEventHandler.SocketEvent.CLOSE);
    }

    @Override // defpackage.q3c
    public void onError(Exception exc) {
        if (exc instanceof SSLHandshakeException) {
            this.mEventHandler.onConnectionEvent(FlipperSocketEventHandler.SocketEvent.SSL_ERROR);
        } else {
            this.mEventHandler.onConnectionEvent(FlipperSocketEventHandler.SocketEvent.ERROR);
        }
    }

    @Override // defpackage.q3c
    public void onMessage(String str) {
        this.mEventHandler.onMessageReceived(str);
    }

    @Override // defpackage.q3c
    public void onOpen(kda kdaVar) {
        this.mEventHandler.onConnectionEvent(FlipperSocketEventHandler.SocketEvent.OPEN);
    }

    @Override // defpackage.q3c
    protected void onSetSSLParameters(SSLParameters sSLParameters) {
        sSLParameters.setNeedClientAuth(true);
    }
}
