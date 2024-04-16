package defpackage;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.ss2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AndroidSocketAdapter.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0006B\u0017\u0012\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001c\u0010\u0011\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u001c\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013R\u001c\u0010\u0017\u001a\n \u0015*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u001c\u0010\u0019\u001a\n \u0015*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013¨\u0006\u001d"}, d2 = {"Lui;", "Leqa;", "", "b", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "a", "", "hostname", "", "Lvr8;", "protocols", "", DateTokenConverter.CONVERTER_KEY, c.a, "Ljava/lang/Class;", "Ljava/lang/Class;", "sslSocketClass", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "setUseSessionTickets", "kotlin.jvm.PlatformType", "setHostname", "getAlpnSelectedProtocol", e.a, "setAlpnProtocols", "<init>", "(Ljava/lang/Class;)V", "f", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: ui  reason: default package */
/* loaded from: classes3.dex */
public class ui implements eqa {
    public static final a f;
    private static final ss2.a g;
    private final Class<? super SSLSocket> a;
    private final Method b;
    private final Method c;
    private final Method d;
    private final Method e;

    /* compiled from: AndroidSocketAdapter.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lui$a;", "", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "actualSSLSocketClass", "Lui;", "b", "", "packageName", "Lss2$a;", c.a, "playProviderFactory", "Lss2$a;", DateTokenConverter.CONVERTER_KEY, "()Lss2$a;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ui$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: AndroidSocketAdapter.kt */
        @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"ui$a$a", "Lss2$a;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "Leqa;", "b", "okhttp"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ui$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0689a implements ss2.a {
            final /* synthetic */ String a;

            C0689a(String str) {
                this.a = str;
            }

            @Override // defpackage.ss2.a
            public boolean a(SSLSocket sSLSocket) {
                boolean J;
                z65.h(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                z65.g(name, "getName(...)");
                J = l0b.J(name, this.a + CoreConstants.DOT, false, 2, null);
                return J;
            }

            @Override // defpackage.ss2.a
            public eqa b(SSLSocket sSLSocket) {
                z65.h(sSLSocket, "sslSocket");
                return ui.f.b(sSLSocket.getClass());
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ui b(Class<? super SSLSocket> cls) {
            Class<? super SSLSocket> cls2 = cls;
            while (cls2 != null && !z65.c(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            z65.e(cls2);
            return new ui(cls2);
        }

        public final ss2.a c(String str) {
            z65.h(str, "packageName");
            return new C0689a(str);
        }

        public final ss2.a d() {
            return ui.g;
        }
    }

    static {
        a aVar = new a(null);
        f = aVar;
        g = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public ui(Class<? super SSLSocket> cls) {
        z65.h(cls, "sslSocketClass");
        this.a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        z65.g(declaredMethod, "getDeclaredMethod(...)");
        this.b = declaredMethod;
        this.c = cls.getMethod("setHostname", String.class);
        this.d = cls.getMethod("getAlpnSelectedProtocol", new Class[0]);
        this.e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.eqa
    public boolean a(SSLSocket sSLSocket) {
        z65.h(sSLSocket, "sslSocket");
        return this.a.isInstance(sSLSocket);
    }

    @Override // defpackage.eqa
    public boolean b() {
        return li.e.b();
    }

    @Override // defpackage.eqa
    public String c(SSLSocket sSLSocket) {
        z65.h(sSLSocket, "sslSocket");
        if (!a(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.d.invoke(sSLSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, rw0.b);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && z65.c(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.eqa
    public void d(SSLSocket sSLSocket, String str, List<? extends vr8> list) {
        z65.h(sSLSocket, "sslSocket");
        z65.h(list, "protocols");
        if (a(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null && Build.VERSION.SDK_INT <= 23) {
                    this.c.invoke(sSLSocket, str);
                }
                this.e.invoke(sSLSocket, xb8.a.c(list));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
