package im.threads.business.utils;

import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.k65;
import im.threads.business.extensions.BusinessExtensionsKt;
import im.threads.business.logger.LoggerEdna;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SSLCertificateInterceptor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lim/threads/business/utils/SSLCertificateInterceptor;", "Lk65;", "Lk65$a;", "chain", "Lik9;", "intercept", "<init>", "()V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class SSLCertificateInterceptor implements k65 {
    public static final Companion Companion = new Companion(null);
    private static List<String> alreadyPrintedCertificates = new ArrayList();
    private static final String tag = "SSLCertificatesHandling";

    /* compiled from: SSLCertificateInterceptor.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\u0010\f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0006\u0010\u000f\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lim/threads/business/utils/SSLCertificateInterceptor$Companion;", "", "()V", "alreadyPrintedCertificates", "", "", RemoteMessageConst.Notification.TAG, "logCertificates", "", "certificates", "", "Ljava/security/cert/Certificate;", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "certificateName", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void logCertificates(List<? extends Certificate> list, Exception exc, String str) {
            z65.h(list, "certificates");
            z65.h(str, "certificateName");
            if (list.isEmpty()) {
                LoggerEdna.error(SSLCertificateInterceptor.tag, "No " + str + ", list is empty");
            } else if (exc != null) {
                LoggerEdna.error(SSLCertificateInterceptor.tag, BusinessExtensionsKt.fullLogString(exc));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Available " + str + ":\n");
                for (Certificate certificate : list) {
                    sb.append(certificate);
                }
                String sb2 = sb.toString();
                z65.g(sb2, "message.toString()");
                if (!SSLCertificateInterceptor.alreadyPrintedCertificates.contains(sb2)) {
                    LoggerEdna.info(SSLCertificateInterceptor.tag, sb2);
                    SSLCertificateInterceptor.alreadyPrintedCertificates.add(sb2);
                }
            }
        }
    }

    @Override // defpackage.k65
    public ik9 intercept(k65.a aVar) throws IOException {
        List<? extends Certificate> l;
        z65.h(aVar, "chain");
        hi9 request = aVar.request();
        l = kc1.l();
        try {
            ik9 b = aVar.b(request);
            km4 m = b.m();
            if (m == null) {
                LoggerEdna.info(tag, "no handshake");
                return b;
            }
            Companion.logCertificates(m.d(), null, "Peer (remote) certificates");
            return b;
        } catch (Exception e) {
            Companion.logCertificates(l, e, "Peer (remote) certificates");
            Thread.sleep(300L);
            throw e;
        }
    }
}
