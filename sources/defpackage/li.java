package defpackage;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.lta;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AndroidPlatform.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0002 !B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J(\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0016R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001c¨\u0006\""}, d2 = {"Lli;", "Lxb8;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "", "f", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lvr8;", "protocols", e.a, Image.TYPE_HIGH, "", "j", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Leu0;", c.a, "Lenb;", DateTokenConverter.CONVERTER_KEY, "Leqa;", "Ljava/util/List;", "socketAdapters", "<init>", "()V", "a", "b", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: li  reason: default package */
/* loaded from: classes3.dex */
public final class li extends xb8 {
    public static final a e = new a(null);
    private static final boolean f;
    private final List<eqa> d;

    /* compiled from: AndroidPlatform.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lli$a;", "", "Lxb8;", "a", "", "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: li$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final xb8 a() {
            if (b()) {
                return new li();
            }
            return null;
        }

        public final boolean b() {
            return li.f;
        }
    }

    /* compiled from: AndroidPlatform.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lli$b;", "Lenb;", "Ljava/security/cert/X509Certificate;", "cert", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljava/lang/reflect/Method;", "b", "Ljava/lang/reflect/Method;", "findByIssuerAndSignatureMethod", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: li$b */
    /* loaded from: classes3.dex */
    public static final class b implements enb {
        private final X509TrustManager a;
        private final Method b;

        public b(X509TrustManager x509TrustManager, Method method) {
            z65.h(x509TrustManager, "trustManager");
            z65.h(method, "findByIssuerAndSignatureMethod");
            this.a = x509TrustManager;
            this.b = method;
        }

        @Override // defpackage.enb
        public X509Certificate a(X509Certificate x509Certificate) {
            z65.h(x509Certificate, "cert");
            try {
                Object invoke = this.b.invoke(this.a, x509Certificate);
                z65.f(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) invoke).getTrustedCert();
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.a, bVar.a) && z65.c(this.b, bVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.a + ", findByIssuerAndSignatureMethod=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        boolean z = false;
        if (xb8.a.h() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f = z;
    }

    public li() {
        List q;
        q = kc1.q(lta.a.b(lta.j, null, 1, null), new ss2(ui.f.d()), new ss2(br1.a.a()), new ss2(hf0.a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : q) {
            if (((eqa) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
    }

    @Override // defpackage.xb8
    public eu0 c(X509TrustManager x509TrustManager) {
        z65.h(x509TrustManager, "trustManager");
        vf a2 = vf.d.a(x509TrustManager);
        if (a2 == null) {
            return super.c(x509TrustManager);
        }
        return a2;
    }

    @Override // defpackage.xb8
    public enb d(X509TrustManager x509TrustManager) {
        z65.h(x509TrustManager, "trustManager");
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            z65.e(declaredMethod);
            return new b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    @Override // defpackage.xb8
    public void e(SSLSocket sSLSocket, String str, List<vr8> list) {
        Object obj;
        z65.h(sSLSocket, "sslSocket");
        z65.h(list, "protocols");
        Iterator<T> it = this.d.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((eqa) obj).a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        eqa eqaVar = (eqa) obj;
        if (eqaVar != null) {
            eqaVar.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.xb8
    public void f(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        z65.h(socket, "socket");
        z65.h(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e2);
            }
            throw e2;
        }
    }

    @Override // defpackage.xb8
    public String h(SSLSocket sSLSocket) {
        Object obj;
        z65.h(sSLSocket, "sslSocket");
        Iterator<T> it = this.d.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((eqa) obj).a(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        eqa eqaVar = (eqa) obj;
        if (eqaVar == null) {
            return null;
        }
        return eqaVar.c(sSLSocket);
    }

    @Override // defpackage.xb8
    public boolean j(String str) {
        NetworkSecurityPolicy networkSecurityPolicy;
        boolean isCleartextTrafficPermitted;
        NetworkSecurityPolicy networkSecurityPolicy2;
        boolean isCleartextTrafficPermitted2;
        z65.h(str, "hostname");
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            networkSecurityPolicy2 = NetworkSecurityPolicy.getInstance();
            isCleartextTrafficPermitted2 = networkSecurityPolicy2.isCleartextTrafficPermitted(str);
            return isCleartextTrafficPermitted2;
        } else if (i >= 23) {
            networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
            isCleartextTrafficPermitted = networkSecurityPolicy.isCleartextTrafficPermitted();
            return isCleartextTrafficPermitted;
        } else {
            return true;
        }
    }
}
