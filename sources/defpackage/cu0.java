package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.Metadata;
/* compiled from: certificates.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcu0;", "", "Ljava/security/cert/X509Certificate;", DateTokenConverter.CONVERTER_KEY, "", "toString", "", "hashCode", "other", "", "equals", "Lg8b;", "a", "Lg8b;", c.a, "()Lg8b;", "tbsCertificate", "Lfb;", "b", "Lfb;", "()Lfb;", "signatureAlgorithm", "Lpb0;", "Lpb0;", "()Lpb0;", "signatureValue", "<init>", "(Lg8b;Lfb;Lpb0;)V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
/* renamed from: cu0  reason: default package */
/* loaded from: classes3.dex */
public final class cu0 {
    private final g8b a;
    private final fb b;
    private final pb0 c;

    public cu0(g8b g8bVar, fb fbVar, pb0 pb0Var) {
        z65.h(g8bVar, "tbsCertificate");
        z65.h(fbVar, "signatureAlgorithm");
        z65.h(pb0Var, "signatureValue");
        this.a = g8bVar;
        this.b = fbVar;
        this.c = pb0Var;
    }

    public final fb a() {
        return this.b;
    }

    public final pb0 b() {
        return this.c;
    }

    public final g8b c() {
        return this.a;
    }

    public final X509Certificate d() {
        Object t0;
        try {
            Collection<? extends Certificate> generateCertificates = CertificateFactory.getInstance("X.509").generateCertificates(new yg0().d0(du0.a.c().p(this)).z());
            z65.e(generateCertificates);
            t0 = sc1.t0(generateCertificates);
            z65.f(t0, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return (X509Certificate) t0;
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("failed to decode certificate", e);
        } catch (GeneralSecurityException e2) {
            throw new IllegalArgumentException("failed to decode certificate", e2);
        } catch (NoSuchElementException e3) {
            throw new IllegalArgumentException("failed to decode certificate", e3);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu0)) {
            return false;
        }
        cu0 cu0Var = (cu0) obj;
        if (z65.c(this.a, cu0Var.a) && z65.c(this.b, cu0Var.b) && z65.c(this.c, cu0Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "Certificate(tbsCertificate=" + this.a + ", signatureAlgorithm=" + this.b + ", signatureValue=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
