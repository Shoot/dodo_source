package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import defpackage.lk0;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CertificatePinner.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\n\u0018\u0000 \u000f2\u00020\u0001:\u0003\b\f\u000fB#\b\u0000\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b!\u0010\"J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J+\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00198\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lgu0;", "", "", "hostname", "", "Ljava/security/cert/Certificate;", "peerCertificates", "", "a", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "b", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lgu0$c;", com.huawei.hms.opendevice.c.a, "Leu0;", "certificateChainCleaner", e.a, "(Leu0;)Lgu0;", "other", "", "equals", "", "hashCode", "", "Ljava/util/Set;", "getPins", "()Ljava/util/Set;", "pins", "Leu0;", DateTokenConverter.CONVERTER_KEY, "()Leu0;", "<init>", "(Ljava/util/Set;Leu0;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: gu0  reason: default package */
/* loaded from: classes3.dex */
public final class gu0 {
    public static final b c = new b(null);
    public static final gu0 d = new a().a();
    private final Set<c> a;
    private final eu0 b;

    /* compiled from: CertificatePinner.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lgu0$a;", "", "Lgu0;", "a", "", "Lgu0$c;", "Ljava/util/List;", "getPins", "()Ljava/util/List;", "pins", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gu0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final List<c> a = new ArrayList();

        public final gu0 a() {
            Set K0;
            K0 = sc1.K0(this.a);
            return new gu0(K0, null, 2, null);
        }
    }

    /* compiled from: CertificatePinner.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007J\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lgu0$b;", "", "Ljava/security/cert/X509Certificate;", "Llk0;", "b", com.huawei.hms.opendevice.c.a, "Ljava/security/cert/Certificate;", "certificate", "", "a", "Lgu0;", "DEFAULT", "Lgu0;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gu0$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Certificate certificate) {
            z65.h(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + c((X509Certificate) certificate).a();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public final lk0 b(X509Certificate x509Certificate) {
            z65.h(x509Certificate, "<this>");
            lk0.a aVar = lk0.d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            z65.g(encoded, "getEncoded(...)");
            return lk0.a.f(aVar, encoded, 0, 0, 3, null).l0();
        }

        public final lk0 c(X509Certificate x509Certificate) {
            z65.h(x509Certificate, "<this>");
            lk0.a aVar = lk0.d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            z65.g(encoded, "getEncoded(...)");
            return lk0.a.f(aVar, encoded, 0, 0, 3, null).m0();
        }
    }

    /* compiled from: CertificatePinner.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\u0013\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u000b\u0010\u0014¨\u0006\u0016"}, d2 = {"Lgu0$c;", "", "", "hostname", "", com.huawei.hms.opendevice.c.a, "toString", "other", "equals", "", "hashCode", "a", "Ljava/lang/String;", "getPattern", "()Ljava/lang/String;", "pattern", "b", "hashAlgorithm", "Llk0;", "Llk0;", "()Llk0;", "hash", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gu0$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private final String a;
        private final String b;
        private final lk0 c;

        public final lk0 a() {
            return this.c;
        }

        public final String b() {
            return this.b;
        }

        public final boolean c(String str) {
            boolean J;
            boolean J2;
            boolean A;
            int d0;
            boolean A2;
            z65.h(str, "hostname");
            J = l0b.J(this.a, "**.", false, 2, null);
            if (!J) {
                J2 = l0b.J(this.a, "*.", false, 2, null);
                if (J2) {
                    int length = this.a.length() - 1;
                    int length2 = str.length() - length;
                    A = l0b.A(str, str.length() - length, this.a, 1, length, false, 16, null);
                    if (A) {
                        d0 = m0b.d0(str, CoreConstants.DOT, length2 - 1, false, 4, null);
                        if (d0 != -1) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return z65.c(str, this.a);
                }
            } else {
                int length3 = this.a.length() - 3;
                int length4 = str.length() - length3;
                A2 = l0b.A(str, str.length() - length3, this.a, 3, length3, false, 16, null);
                if (!A2) {
                    return false;
                }
                if (length4 != 0 && str.charAt(length4 - 1) != '.') {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (z65.c(this.a, cVar.a) && z65.c(this.b, cVar.b) && z65.c(this.c, cVar.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        }

        public String toString() {
            return this.b + '/' + this.c.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CertificatePinner.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gu0$d */
    /* loaded from: classes3.dex */
    public static final class d extends ej5 implements Function0<List<? extends X509Certificate>> {
        final /* synthetic */ List<Certificate> b;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(List<? extends Certificate> list, String str) {
            super(0);
            this.b = list;
            this.c = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends X509Certificate> invoke() {
            List<Certificate> list;
            int w;
            eu0 d = gu0.this.d();
            if (d == null || (list = d.a(this.b, this.c)) == null) {
                list = this.b;
            }
            List<Certificate> list2 = list;
            w = lc1.w(list2, 10);
            ArrayList arrayList = new ArrayList(w);
            for (Certificate certificate : list2) {
                z65.f(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public gu0(Set<c> set, eu0 eu0Var) {
        z65.h(set, "pins");
        this.a = set;
        this.b = eu0Var;
    }

    public final void a(String str, List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        z65.h(str, "hostname");
        z65.h(list, "peerCertificates");
        b(str, new d(list, str));
    }

    public final void b(String str, Function0<? extends List<? extends X509Certificate>> function0) {
        z65.h(str, "hostname");
        z65.h(function0, "cleanedPeerCertificatesFn");
        List<c> c2 = c(str);
        if (c2.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> invoke = function0.invoke();
        for (X509Certificate x509Certificate : invoke) {
            lk0 lk0Var = null;
            lk0 lk0Var2 = null;
            for (c cVar : c2) {
                String b2 = cVar.b();
                if (z65.c(b2, "sha256")) {
                    if (lk0Var == null) {
                        lk0Var = c.c(x509Certificate);
                    }
                    if (z65.c(cVar.a(), lk0Var)) {
                        return;
                    }
                } else if (z65.c(b2, "sha1")) {
                    if (lk0Var2 == null) {
                        lk0Var2 = c.b(x509Certificate);
                    }
                    if (z65.c(cVar.a(), lk0Var2)) {
                        return;
                    }
                } else {
                    throw new AssertionError("unsupported hashAlgorithm: " + cVar.b());
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : invoke) {
            sb.append("\n    ");
            sb.append(c.a(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        for (c cVar2 : c2) {
            sb.append("\n    ");
            sb.append(cVar2);
        }
        String sb2 = sb.toString();
        z65.g(sb2, "toString(...)");
        throw new SSLPeerUnverifiedException(sb2);
    }

    public final List<c> c(String str) {
        List<c> l;
        z65.h(str, "hostname");
        l = kc1.l();
        for (Object obj : this.a) {
            if (((c) obj).c(str)) {
                if (l.isEmpty()) {
                    l = new ArrayList<>();
                }
                z65.f(l, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal._UtilCommonKt.filterList>");
                unb.c(l).add(obj);
            }
        }
        return l;
    }

    public final eu0 d() {
        return this.b;
    }

    public final gu0 e(eu0 eu0Var) {
        z65.h(eu0Var, "certificateChainCleaner");
        if (z65.c(this.b, eu0Var)) {
            return this;
        }
        return new gu0(this.a, eu0Var);
    }

    public boolean equals(Object obj) {
        if (obj instanceof gu0) {
            gu0 gu0Var = (gu0) obj;
            if (z65.c(gu0Var.a, this.a) && z65.c(gu0Var.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (1517 + this.a.hashCode()) * 41;
        eu0 eu0Var = this.b;
        if (eu0Var != null) {
            i = eu0Var.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public /* synthetic */ gu0(Set set, eu0 eu0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? null : eu0Var);
    }
}
