package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Platform.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b,\u0010-J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J \u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J&\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00162\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u00012\u0006\u0010 \u001a\u00020\u0002H\u0016J\u001a\u0010#\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0006H\u0016J\u0010\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020\u0006H\u0016J\u0010\u0010*\u001a\u00020)2\u0006\u0010$\u001a\u00020\u0006H\u0016J\b\u0010+\u001a\u00020\u0002H\u0016¨\u0006/"}, d2 = {"Lxb8;", "", "", "g", "Ljavax/net/ssl/SSLContext;", "n", "Ljavax/net/ssl/X509TrustManager;", "p", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "hostname", "", "Lvr8;", "protocols", "", e.a, "b", Image.TYPE_HIGH, "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "f", "message", "level", "", "t", "k", "", "j", "closer", "i", "stackTrace", Image.TYPE_MEDIUM, "trustManager", "Leu0;", c.a, "Lenb;", DateTokenConverter.CONVERTER_KEY, "Ljavax/net/ssl/SSLSocketFactory;", "o", "toString", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: xb8  reason: default package */
/* loaded from: classes3.dex */
public class xb8 {
    public static final a a;
    private static volatile xb8 b;
    private static final Logger c;

    /* compiled from: Platform.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0014\u0010\r\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u0014\u0010\u0011\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u001c\u0010\u001e\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lxb8$a;", "", "Lxb8;", "f", DateTokenConverter.CONVERTER_KEY, e.a, "g", "", "Lvr8;", "protocols", "", "b", "", c.a, "", "j", "()Z", "isConscryptPreferred", "k", "isOpenJSSEPreferred", "i", "isBouncyCastlePreferred", Image.TYPE_HIGH, "isAndroid", "", "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "platform", "Lxb8;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xb8$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final xb8 d() {
            ph.a.b();
            xb8 a = yd.e.a();
            if (a == null) {
                xb8 a2 = li.e.a();
                z65.e(a2);
                return a2;
            }
            return a;
        }

        private final xb8 e() {
            ka7 a;
            ef0 a2;
            ar1 b;
            if (j() && (b = ar1.e.b()) != null) {
                return b;
            }
            if (i() && (a2 = ef0.e.a()) != null) {
                return a2;
            }
            if (k() && (a = ka7.e.a()) != null) {
                return a;
            }
            k95 a3 = k95.d.a();
            if (a3 != null) {
                return a3;
            }
            xb8 a4 = h95.i.a();
            if (a4 != null) {
                return a4;
            }
            return new xb8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final xb8 f() {
            if (h()) {
                return d();
            }
            return e();
        }

        private final boolean i() {
            return z65.c("BC", Security.getProviders()[0].getName());
        }

        private final boolean j() {
            return z65.c("Conscrypt", Security.getProviders()[0].getName());
        }

        private final boolean k() {
            return z65.c("OpenJSSE", Security.getProviders()[0].getName());
        }

        public final List<String> b(List<? extends vr8> list) {
            int w;
            z65.h(list, "protocols");
            ArrayList<vr8> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((vr8) obj) != vr8.c) {
                    arrayList.add(obj);
                }
            }
            w = lc1.w(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(w);
            for (vr8 vr8Var : arrayList) {
                arrayList2.add(vr8Var.toString());
            }
            return arrayList2;
        }

        public final byte[] c(List<? extends vr8> list) {
            z65.h(list, "protocols");
            yg0 yg0Var = new yg0();
            for (String str : b(list)) {
                yg0Var.V0(str.length());
                yg0Var.a0(str);
            }
            return yg0Var.T0();
        }

        public final xb8 g() {
            return xb8.b;
        }

        public final boolean h() {
            return z65.c("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    static {
        a aVar = new a(null);
        a = aVar;
        b = aVar.f();
        c = Logger.getLogger(b77.class.getName());
    }

    public static /* synthetic */ void l(xb8 xb8Var, String str, int i, Throwable th, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = 4;
            }
            if ((i2 & 4) != 0) {
                th = null;
            }
            xb8Var.k(str, i, th);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    public void b(SSLSocket sSLSocket) {
        z65.h(sSLSocket, "sslSocket");
    }

    public eu0 c(X509TrustManager x509TrustManager) {
        z65.h(x509TrustManager, "trustManager");
        return new z80(d(x509TrustManager));
    }

    public enb d(X509TrustManager x509TrustManager) {
        z65.h(x509TrustManager, "trustManager");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        z65.g(acceptedIssuers, "getAcceptedIssuers(...)");
        return new s90((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sSLSocket, String str, List<vr8> list) {
        z65.h(sSLSocket, "sslSocket");
        z65.h(list, "protocols");
    }

    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        z65.h(socket, "socket");
        z65.h(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    public final String g() {
        return "OkHttp";
    }

    public String h(SSLSocket sSLSocket) {
        z65.h(sSLSocket, "sslSocket");
        return null;
    }

    public Object i(String str) {
        z65.h(str, "closer");
        if (c.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean j(String str) {
        z65.h(str, "hostname");
        return true;
    }

    public void k(String str, int i, Throwable th) {
        Level level;
        z65.h(str, "message");
        if (i == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        c.log(level, str, th);
    }

    public void m(String str, Object obj) {
        z65.h(str, "message");
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        k(str, 5, (Throwable) obj);
    }

    public SSLContext n() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        z65.g(sSLContext, "getInstance(...)");
        return sSLContext;
    }

    public SSLSocketFactory o(X509TrustManager x509TrustManager) {
        z65.h(x509TrustManager, "trustManager");
        try {
            SSLContext n = n();
            n.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = n.getSocketFactory();
            z65.g(socketFactory, "getSocketFactory(...)");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public X509TrustManager p() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        z65.e(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                z65.f(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String arrays = Arrays.toString(trustManagers);
        z65.g(arrays, "toString(...)");
        sb.append(arrays);
        throw new IllegalStateException(sb.toString().toString());
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        z65.g(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
