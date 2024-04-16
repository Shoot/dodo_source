package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Jdk9Platform.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0017J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0012"}, d2 = {"Lk95;", "Lxb8;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lvr8;", "protocols", "", e.a, Image.TYPE_HIGH, "Ljavax/net/ssl/SSLContext;", "n", "<init>", "()V", DateTokenConverter.CONVERTER_KEY, "a", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: k95  reason: default package */
/* loaded from: classes3.dex */
public class k95 extends xb8 {
    public static final a d = new a(null);
    private static final boolean e;
    private static final Integer f;

    /* compiled from: Jdk9Platform.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lk95$a;", "", "Lk95;", "a", "", "isAvailable", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: k95$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k95 a() {
            if (b()) {
                return new k95();
            }
            return null;
        }

        public final boolean b() {
            return k95.e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r1.intValue() >= 9) goto L9;
     */
    static {
        /*
            k95$a r0 = new k95$a
            r1 = 0
            r0.<init>(r1)
            defpackage.k95.d = r0
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 == 0) goto L14
            java.lang.Integer r1 = defpackage.c0b.k(r0)
        L14:
            defpackage.k95.f = r1
            r0 = 1
            r2 = 0
            if (r1 == 0) goto L25
            int r1 = r1.intValue()
            r3 = 9
            if (r1 < r3) goto L23
            goto L2e
        L23:
            r0 = 0
            goto L2e
        L25:
            java.lang.Class<javax.net.ssl.SSLSocket> r1 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "getApplicationProtocol"
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L23
            r1.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L23
        L2e:
            defpackage.k95.e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k95.<clinit>():void");
    }

    @Override // defpackage.xb8
    public void e(SSLSocket sSLSocket, String str, List<vr8> list) {
        z65.h(sSLSocket, "sslSocket");
        z65.h(list, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) xb8.a.b(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // defpackage.xb8
    public String h(SSLSocket sSLSocket) {
        String applicationProtocol;
        z65.h(sSLSocket, "sslSocket");
        try {
            applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (z65.c(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // defpackage.xb8
    public SSLContext n() {
        SSLContext sSLContext;
        Integer num = f;
        if (num != null && num.intValue() >= 9) {
            SSLContext sSLContext2 = SSLContext.getInstance("TLS");
            z65.g(sSLContext2, "getInstance(...)");
            return sSLContext2;
        }
        try {
            sSLContext = SSLContext.getInstance("TLSv1.3");
        } catch (NoSuchAlgorithmException unused) {
            sSLContext = SSLContext.getInstance("TLS");
        }
        z65.e(sSLContext);
        return sSLContext;
    }
}
