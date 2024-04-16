package defpackage;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CertificateChainCleaner.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Leu0;", "", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: eu0  reason: default package */
/* loaded from: classes3.dex */
public abstract class eu0 {
    public static final a a = new a(null);

    /* compiled from: CertificateChainCleaner.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Leu0$a;", "", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Leu0;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: eu0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final eu0 a(X509TrustManager x509TrustManager) {
            z65.h(x509TrustManager, "trustManager");
            return xb8.a.g().c(x509TrustManager);
        }
    }

    public abstract List<Certificate> a(List<? extends Certificate> list, String str) throws SSLPeerUnverifiedException;
}
