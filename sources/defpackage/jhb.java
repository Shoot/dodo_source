package defpackage;

import com.huawei.hms.push.e;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
/* compiled from: tlsHandshake.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001¨\u0006\u0005"}, d2 = {"Ljava/io/IOException;", "Lokio/IOException;", e.a, "", "a", "okhttp"}, k = 2, mv = {1, 9, 0})
/* renamed from: jhb  reason: default package */
/* loaded from: classes3.dex */
public final class jhb {
    public static final boolean a(IOException iOException) {
        z65.h(iOException, e.a);
        if ((iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException)) {
            return false;
        }
        return true;
    }
}
