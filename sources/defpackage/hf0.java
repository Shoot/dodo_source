package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.ss2;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
/* compiled from: BouncyCastleSocketAdapter.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¨\u0006\u0011"}, d2 = {"Lhf0;", "Leqa;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "b", "", c.a, "hostname", "", "Lvr8;", "protocols", "", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: hf0  reason: default package */
/* loaded from: classes3.dex */
public final class hf0 implements eqa {
    public static final b a = new b(null);
    private static final ss2.a b = new a();

    /* compiled from: BouncyCastleSocketAdapter.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"hf0$a", "Lss2$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "Leqa;", "b", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: hf0$a */
    /* loaded from: classes3.dex */
    public static final class a implements ss2.a {
        a() {
        }

        @Override // defpackage.ss2.a
        public boolean a(SSLSocket sSLSocket) {
            z65.h(sSLSocket, "sslSocket");
            if (ef0.e.b() && (sSLSocket instanceof BCSSLSocket)) {
                return true;
            }
            return false;
        }

        @Override // defpackage.ss2.a
        public eqa b(SSLSocket sSLSocket) {
            z65.h(sSLSocket, "sslSocket");
            return new hf0();
        }
    }

    /* compiled from: BouncyCastleSocketAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lhf0$b;", "", "Lss2$a;", "factory", "Lss2$a;", "a", "()Lss2$a;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: hf0$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ss2.a a() {
            return hf0.b;
        }
    }

    @Override // defpackage.eqa
    public boolean a(SSLSocket sSLSocket) {
        z65.h(sSLSocket, "sslSocket");
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // defpackage.eqa
    public boolean b() {
        return ef0.e.b();
    }

    @Override // defpackage.eqa
    public String c(SSLSocket sSLSocket) {
        z65.h(sSLSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || z65.c(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.eqa
    public void d(SSLSocket sSLSocket, String str, List<? extends vr8> list) {
        z65.h(sSLSocket, "sslSocket");
        z65.h(list, "protocols");
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) xb8.a.b(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
