package defpackage;

import android.content.Context;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;
@Deprecated
/* renamed from: m3a  reason: default package */
/* loaded from: classes3.dex */
public class m3a extends SSLSocketFactory {
    @Deprecated
    public static final X509HostnameVerifier i = new BrowserCompatHostnameVerifier();
    @Deprecated
    public static final X509HostnameVerifier j = new StrictHostnameVerifier();
    private static final String k = m3a.class.getSimpleName();
    private static volatile m3a l = null;
    private SSLContext a = null;
    private SSLSocket b = null;
    private Context c;
    private String[] d;
    private X509TrustManager e;
    private String[] f;
    private String[] g;
    private String[] h;

    private m3a(Context context) throws NoSuchAlgorithmException, CertificateException, KeyStoreException, IOException, KeyManagementException {
        if (context == null) {
            xhc.d(k, "SecureSSLSocketFactory: context is null");
            return;
        }
        c(context);
        d(os9.f());
        p3a a = o3a.a(context);
        this.e = a;
        this.a.init(null, new X509TrustManager[]{a}, null);
    }

    private void a(Socket socket) {
        boolean z;
        boolean z2 = true;
        if (!gec.a(this.h)) {
            xhc.e(k, "set protocols");
            os9.e((SSLSocket) socket, this.h);
            z = true;
        } else {
            z = false;
        }
        if (gec.a(this.g) && gec.a(this.f)) {
            z2 = false;
        } else {
            xhc.e(k, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            os9.d(sSLSocket);
            if (!gec.a(this.g)) {
                os9.h(sSLSocket, this.g);
            } else {
                os9.b(sSLSocket, this.f);
            }
        }
        if (!z) {
            xhc.e(k, "set default protocols");
            os9.d((SSLSocket) socket);
        }
        if (!z2) {
            xhc.e(k, "set default cipher suites");
            os9.c((SSLSocket) socket);
        }
    }

    public static m3a b(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalAccessException, KeyManagementException, IllegalArgumentException {
        long currentTimeMillis = System.currentTimeMillis();
        nec.b(context);
        if (l == null) {
            synchronized (m3a.class) {
                try {
                    if (l == null) {
                        l = new m3a(context);
                    }
                } finally {
                }
            }
        }
        if (l.c == null && context != null) {
            l.c(context);
        }
        String str = k;
        xhc.b(str, "getInstance: cost : " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
        return l;
    }

    public void c(Context context) {
        this.c = context.getApplicationContext();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i2) throws IOException {
        xhc.e(k, "createSocket: host , port");
        Socket createSocket = this.a.getSocketFactory().createSocket(str, i2);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.b = sSLSocket;
            this.d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    public void d(SSLContext sSLContext) {
        this.a = sSLContext;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.d;
        if (strArr != null) {
            return strArr;
        }
        return new String[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i2) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i2);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i2, InetAddress inetAddress, int i3) throws IOException, UnknownHostException {
        return createSocket(str, i2);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i2, InetAddress inetAddress2, int i3) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i2);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i2, boolean z) throws IOException {
        xhc.e(k, "createSocket s host port autoClose");
        Socket createSocket = this.a.getSocketFactory().createSocket(socket, str, i2, z);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.b = sSLSocket;
            this.d = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }
}
