package defpackage;

import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
/* renamed from: gza  reason: default package */
/* loaded from: classes3.dex */
public class gza implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            X509Certificate x509Certificate = (X509Certificate) sSLSession.getPeerCertificates()[0];
            xhc.b("", "verify: certificate is : " + x509Certificate.getSubjectDN().getName());
            kec.a(str, x509Certificate, true);
            return true;
        } catch (SSLException e) {
            xhc.d("", "SSLException : " + e.getMessage());
            return false;
        }
    }
}
