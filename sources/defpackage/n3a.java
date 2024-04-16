package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
/* renamed from: n3a  reason: default package */
/* loaded from: classes3.dex */
public class n3a extends SSLSocketFactory {
    private static final String h = "n3a";
    protected SSLContext a;
    protected SSLSocket b = null;
    protected String[] c;
    protected X509TrustManager d;
    protected String[] e;
    protected String[] f;
    protected String[] g;

    public n3a(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.a = null;
        this.a = os9.f();
        b(x509TrustManager);
        this.a.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }

    private void a(Socket socket) {
        boolean z;
        boolean z2 = true;
        if (!gec.a(this.g)) {
            xhc.e(h, "set protocols");
            os9.e((SSLSocket) socket, this.g);
            z = true;
        } else {
            z = false;
        }
        if (gec.a(this.f) && gec.a(this.e)) {
            z2 = false;
        } else {
            xhc.e(h, "set white cipher or black cipher");
            SSLSocket sSLSocket = (SSLSocket) socket;
            os9.d(sSLSocket);
            if (!gec.a(this.f)) {
                os9.h(sSLSocket, this.f);
            } else {
                os9.b(sSLSocket, this.e);
            }
        }
        if (!z) {
            xhc.e(h, "set default protocols");
            os9.d((SSLSocket) socket);
        }
        if (!z2) {
            xhc.e(h, "set default cipher suites");
            os9.c((SSLSocket) socket);
        }
    }

    public void b(X509TrustManager x509TrustManager) {
        this.d = x509TrustManager;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        xhc.e(h, "createSocket: host , port");
        Socket createSocket = this.a.getSocketFactory().createSocket(str, i);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.b = sSLSocket;
            this.c = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.c;
        if (strArr != null) {
            return strArr;
        }
        return new String[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        xhc.e(h, "createSocket s host port autoClose");
        Socket createSocket = this.a.getSocketFactory().createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            SSLSocket sSLSocket = (SSLSocket) createSocket;
            this.b = sSLSocket;
            this.c = (String[]) sSLSocket.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }
}
