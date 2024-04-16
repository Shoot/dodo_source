package defpackage;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import org.slf4j.Marker;
/* compiled from: OkHostnameVerifier.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\f\u0010\n\u001a\u00020\u0002*\u00020\u0002H\u0002J\f\u0010\u000b\u001a\u00020\u0006*\u00020\u0002H\u0002J\u001c\u0010\r\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0002J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0016\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u001a"}, d2 = {"Lz67;", "Ljavax/net/ssl/HostnameVerifier;", "", "ipAddress", "Ljava/security/cert/X509Certificate;", "certificate", "", Image.TYPE_HIGH, "hostname", "g", "b", DateTokenConverter.CONVERTER_KEY, "pattern", "f", "", MessageAttributes.TYPE, "", c.a, "host", "Ljavax/net/ssl/SSLSession;", "session", "verify", e.a, "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: z67  reason: default package */
/* loaded from: classes3.dex */
public final class z67 implements HostnameVerifier {
    public static final z67 a = new z67();

    private z67() {
    }

    private final String b(String str) {
        if (d(str)) {
            Locale locale = Locale.US;
            z65.g(locale, "US");
            String lowerCase = str.toLowerCase(locale);
            z65.g(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
        return str;
    }

    private final List<String> c(X509Certificate x509Certificate, int i) {
        List<String> l;
        Object obj;
        List<String> l2;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                l2 = kc1.l();
                return l2;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && z65.c(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            l = kc1.l();
            return l;
        }
    }

    private final boolean d(String str) {
        if (str.length() != ((int) rub.b(str, 0, 0, 3, null))) {
            return false;
        }
        return true;
    }

    private final boolean f(String str, String str2) {
        boolean J;
        boolean u;
        boolean J2;
        boolean u2;
        boolean u3;
        boolean u4;
        boolean O;
        boolean J3;
        int Y;
        boolean u5;
        int d0;
        if (str != null && str.length() != 0) {
            J = l0b.J(str, ".", false, 2, null);
            if (!J) {
                u = l0b.u(str, CallerDataConverter.DEFAULT_RANGE_DELIMITER, false, 2, null);
                if (!u && str2 != null && str2.length() != 0) {
                    J2 = l0b.J(str2, ".", false, 2, null);
                    if (!J2) {
                        u2 = l0b.u(str2, CallerDataConverter.DEFAULT_RANGE_DELIMITER, false, 2, null);
                        if (!u2) {
                            u3 = l0b.u(str, ".", false, 2, null);
                            if (!u3) {
                                str = str + CoreConstants.DOT;
                            }
                            String str3 = str;
                            u4 = l0b.u(str2, ".", false, 2, null);
                            if (!u4) {
                                str2 = str2 + CoreConstants.DOT;
                            }
                            String b = b(str2);
                            O = m0b.O(b, Marker.ANY_MARKER, false, 2, null);
                            if (O) {
                                J3 = l0b.J(b, "*.", false, 2, null);
                                if (J3) {
                                    Y = m0b.Y(b, '*', 1, false, 4, null);
                                    if (Y != -1 || str3.length() < b.length() || z65.c("*.", b)) {
                                        return false;
                                    }
                                    String substring = b.substring(1);
                                    z65.g(substring, "substring(...)");
                                    u5 = l0b.u(str3, substring, false, 2, null);
                                    if (!u5) {
                                        return false;
                                    }
                                    int length = str3.length() - substring.length();
                                    if (length > 0) {
                                        d0 = m0b.d0(str3, CoreConstants.DOT, length - 1, false, 4, null);
                                        if (d0 != -1) {
                                            return false;
                                        }
                                    }
                                    return true;
                                }
                            } else {
                                return z65.c(str3, b);
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean g(String str, X509Certificate x509Certificate) {
        String b = b(str);
        List<String> c = c(x509Certificate, 2);
        if ((c instanceof Collection) && c.isEmpty()) {
            return false;
        }
        for (String str2 : c) {
            if (a.f(b, str2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean h(String str, X509Certificate x509Certificate) {
        String k = rdc.k(str);
        List<String> c = c(x509Certificate, 7);
        if ((c instanceof Collection) && c.isEmpty()) {
            return false;
        }
        for (String str2 : c) {
            if (z65.c(k, rdc.k(str2))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> a(X509Certificate x509Certificate) {
        List<String> q0;
        z65.h(x509Certificate, "certificate");
        q0 = sc1.q0(c(x509Certificate, 7), c(x509Certificate, 2));
        return q0;
    }

    public final boolean e(String str, X509Certificate x509Certificate) {
        z65.h(str, "host");
        z65.h(x509Certificate, "certificate");
        if (rdc.a(str)) {
            return h(str, x509Certificate);
        }
        return g(str, x509Certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        Certificate certificate;
        z65.h(str, "host");
        z65.h(sSLSession, "session");
        if (d(str)) {
            try {
                certificate = sSLSession.getPeerCertificates()[0];
                z65.f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            } catch (SSLException unused) {
                return false;
            }
        }
        return e(str, (X509Certificate) certificate);
    }
}
