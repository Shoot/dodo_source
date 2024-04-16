package defpackage;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.NoSuchElementException;
import kotlin.Metadata;
/* compiled from: Certificates.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"", "Ljava/security/cert/X509Certificate;", "a", "okhttp-tls"}, k = 2, mv = {1, 9, 0})
/* renamed from: iu0  reason: default package */
/* loaded from: classes3.dex */
public final class iu0 {
    public static final X509Certificate a(String str) {
        Object t0;
        z65.h(str, "<this>");
        try {
            Collection<? extends Certificate> generateCertificates = CertificateFactory.getInstance("X.509").generateCertificates(new yg0().a0(str).z());
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
}
