package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Handshake.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\nB;\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u001f¢\u0006\u0004\b!\u0010\"J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\n\u0010\u0012R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0018R\u0018\u0010\u001e\u001a\u00020\u0007*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u001d¨\u0006#"}, d2 = {"Lkm4;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lmhb;", "a", "Lmhb;", e.a, "()Lmhb;", "tlsVersion", "Lw71;", "b", "Lw71;", "()Lw71;", "cipherSuite", "", "Ljava/security/cert/Certificate;", c.a, "Ljava/util/List;", "()Ljava/util/List;", "localCertificates", DateTokenConverter.CONVERTER_KEY, "Lrn5;", "peerCertificates", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", Action.NAME_ATTRIBUTE, "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lmhb;Lw71;Ljava/util/List;Lkotlin/jvm/functions/Function0;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: km4  reason: default package */
/* loaded from: classes3.dex */
public final class km4 {
    public static final a e = new a(null);
    private final mhb a;
    private final w71 b;
    private final List<Certificate> c;
    private final rn5 d;

    /* compiled from: Handshake.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004*\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ4\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004H\u0007¨\u0006\u0014"}, d2 = {"Lkm4$a;", "", "", "Ljava/security/cert/Certificate;", "", c.a, "([Ljava/security/cert/Certificate;)Ljava/util/List;", "Ljavax/net/ssl/SSLSession;", "Lkm4;", "b", "(Ljavax/net/ssl/SSLSession;)Lkm4;", "Lmhb;", "tlsVersion", "Lw71;", "cipherSuite", "peerCertificates", "localCertificates", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: km4$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: Handshake.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: km4$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0409a extends ej5 implements Function0<List<? extends Certificate>> {
            final /* synthetic */ List<Certificate> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0409a(List<? extends Certificate> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Certificate> invoke() {
                return this.a;
            }
        }

        /* compiled from: Handshake.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: km4$a$b */
        /* loaded from: classes3.dex */
        static final class b extends ej5 implements Function0<List<? extends Certificate>> {
            final /* synthetic */ List<Certificate> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(List<? extends Certificate> list) {
                super(0);
                this.a = list;
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends Certificate> invoke() {
                return this.a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<Certificate> c(Certificate[] certificateArr) {
            List<Certificate> l;
            if (certificateArr == null) {
                l = kc1.l();
                return l;
            }
            return cec.l(Arrays.copyOf(certificateArr, certificateArr.length));
        }

        public final km4 a(mhb mhbVar, w71 w71Var, List<? extends Certificate> list, List<? extends Certificate> list2) {
            z65.h(mhbVar, "tlsVersion");
            z65.h(w71Var, "cipherSuite");
            z65.h(list, "peerCertificates");
            z65.h(list2, "localCertificates");
            return new km4(mhbVar, w71Var, cec.y(list2), new C0409a(cec.y(list)));
        }

        public final km4 b(SSLSession sSLSession) throws IOException {
            List<Certificate> l;
            z65.h(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                if (!z65.c(cipherSuite, "TLS_NULL_WITH_NULL_NULL") && !z65.c(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                    w71 b2 = w71.b.b(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol != null) {
                        if (!z65.c("NONE", protocol)) {
                            mhb a = mhb.b.a(protocol);
                            try {
                                l = c(sSLSession.getPeerCertificates());
                            } catch (SSLPeerUnverifiedException unused) {
                                l = kc1.l();
                            }
                            return new km4(a, b2, c(sSLSession.getLocalCertificates()), new b(l));
                        }
                        throw new IOException("tlsVersion == NONE");
                    }
                    throw new IllegalStateException("tlsVersion == null".toString());
                }
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            throw new IllegalStateException("cipherSuite == null".toString());
        }
    }

    /* compiled from: Handshake.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: km4$b */
    /* loaded from: classes3.dex */
    static final class b extends ej5 implements Function0<List<? extends Certificate>> {
        final /* synthetic */ Function0<List<Certificate>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function0<? extends List<? extends Certificate>> function0) {
            super(0);
            this.a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Certificate> invoke() {
            List<? extends Certificate> l;
            try {
                return this.a.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                l = kc1.l();
                return l;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public km4(mhb mhbVar, w71 w71Var, List<? extends Certificate> list, Function0<? extends List<? extends Certificate>> function0) {
        rn5 b2;
        z65.h(mhbVar, "tlsVersion");
        z65.h(w71Var, "cipherSuite");
        z65.h(list, "localCertificates");
        z65.h(function0, "peerCertificatesFn");
        this.a = mhbVar;
        this.b = w71Var;
        this.c = list;
        b2 = yn5.b(new b(function0));
        this.d = b2;
    }

    private final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        z65.g(type, "getType(...)");
        return type;
    }

    public final w71 a() {
        return this.b;
    }

    public final List<Certificate> c() {
        return this.c;
    }

    public final List<Certificate> d() {
        return (List) this.d.getValue();
    }

    public final mhb e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof km4) {
            km4 km4Var = (km4) obj;
            if (km4Var.a == this.a && z65.c(km4Var.b, this.b) && z65.c(km4Var.d(), d()) && z65.c(km4Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + d().hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        int w;
        int w2;
        List<Certificate> d = d();
        w = lc1.w(d, 10);
        ArrayList arrayList = new ArrayList(w);
        for (Certificate certificate : d) {
            arrayList.add(b(certificate));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.a);
        sb.append(" cipherSuite=");
        sb.append(this.b);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.c;
        w2 = lc1.w(list, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (Certificate certificate2 : list) {
            arrayList2.add(b(certificate2));
        }
        sb.append(arrayList2);
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }
}
