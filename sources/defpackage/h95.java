package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import com.facebook.flipper.plugins.databases.DatabaseDriver;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Jdk8WithJettyBootPlatform.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u000bB7\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0014\u0012\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016¨\u0006\u001d"}, d2 = {"Lh95;", "Lxb8;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lvr8;", "protocols", "", e.a, "b", Image.TYPE_HIGH, "Ljava/lang/reflect/Method;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/reflect/Method;", "putMethod", "getMethod", "f", "removeMethod", "Ljava/lang/Class;", "g", "Ljava/lang/Class;", "clientProviderClass", "serverProviderClass", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "i", "a", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: h95  reason: default package */
/* loaded from: classes3.dex */
public final class h95 extends xb8 {
    public static final b i = new b(null);
    private final Method d;
    private final Method e;
    private final Method f;
    private final Class<?> g;
    private final Class<?> h;

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001b\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\f\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lh95$a;", "Ljava/lang/reflect/InvocationHandler;", "", "proxy", "Ljava/lang/reflect/Method;", "method", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "", "", "a", "Ljava/util/List;", "protocols", "", "b", "Z", "()Z", "setUnsupported", "(Z)V", "unsupported", c.a, "Ljava/lang/String;", "()Ljava/lang/String;", "setSelected", "(Ljava/lang/String;)V", "selected", "<init>", "(Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: h95$a */
    /* loaded from: classes3.dex */
    private static final class a implements InvocationHandler {
        private final List<String> a;
        private boolean b;
        private String c;

        public a(List<String> list) {
            z65.h(list, "protocols");
            this.a = list;
        }

        public final String a() {
            return this.c;
        }

        public final boolean b() {
            return this.b;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            z65.h(obj, "proxy");
            z65.h(method, "method");
            if (objArr == null) {
                objArr = new Object[0];
            }
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (z65.c(name, "supports") && z65.c(Boolean.TYPE, returnType)) {
                return Boolean.TRUE;
            }
            if (z65.c(name, "unsupported") && z65.c(Void.TYPE, returnType)) {
                this.b = true;
                return null;
            } else if (z65.c(name, "protocols") && objArr.length == 0) {
                return this.a;
            } else {
                if ((z65.c(name, "selectProtocol") || z65.c(name, DatabaseDriver.DatabaseExecuteSqlResponse.TYPE_SELECT)) && z65.c(String.class, returnType) && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        z65.f(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
                        List list = (List) obj2;
                        int size = list.size();
                        if (size >= 0) {
                            int i = 0;
                            while (true) {
                                Object obj3 = list.get(i);
                                z65.f(obj3, "null cannot be cast to non-null type kotlin.String");
                                String str = (String) obj3;
                                if (this.a.contains(str)) {
                                    this.c = str;
                                    return str;
                                } else if (i == size) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                        String str2 = this.a.get(0);
                        this.c = str2;
                        return str2;
                    }
                }
                if ((z65.c(name, "protocolSelected") || z65.c(name, "selected")) && objArr.length == 1) {
                    Object obj4 = objArr[0];
                    z65.f(obj4, "null cannot be cast to non-null type kotlin.String");
                    this.c = (String) obj4;
                    return null;
                }
                return method.invoke(this, Arrays.copyOf(objArr, objArr.length));
            }
        }
    }

    /* compiled from: Jdk8WithJettyBootPlatform.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0006"}, d2 = {"Lh95$b;", "", "Lxb8;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: h95$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final xb8 a() {
            String property = System.getProperty("java.specification.version", "unknown");
            try {
                z65.e(property);
                if (Integer.parseInt(property) >= 9) {
                    return null;
                }
            } catch (NumberFormatException unused) {
            }
            try {
                Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null);
                Class<?> cls4 = Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null);
                Method method = cls.getMethod("put", SSLSocket.class, cls2);
                Method method2 = cls.getMethod("get", SSLSocket.class);
                Method method3 = cls.getMethod(CartQueueItemEntity.OPERATION_REMOVE, SSLSocket.class);
                z65.e(method);
                z65.e(method2);
                z65.e(method3);
                z65.e(cls3);
                z65.e(cls4);
                return new h95(method, method2, method3, cls3, cls4);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                return null;
            }
        }
    }

    public h95(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        z65.h(method, "putMethod");
        z65.h(method2, "getMethod");
        z65.h(method3, "removeMethod");
        z65.h(cls, "clientProviderClass");
        z65.h(cls2, "serverProviderClass");
        this.d = method;
        this.e = method2;
        this.f = method3;
        this.g = cls;
        this.h = cls2;
    }

    @Override // defpackage.xb8
    public void b(SSLSocket sSLSocket) {
        z65.h(sSLSocket, "sslSocket");
        try {
            this.f.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // defpackage.xb8
    public void e(SSLSocket sSLSocket, String str, List<? extends vr8> list) {
        z65.h(sSLSocket, "sslSocket");
        z65.h(list, "protocols");
        try {
            this.d.invoke(null, sSLSocket, Proxy.newProxyInstance(xb8.class.getClassLoader(), new Class[]{this.g, this.h}, new a(xb8.a.b(list))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // defpackage.xb8
    public String h(SSLSocket sSLSocket) {
        z65.h(sSLSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.e.invoke(null, sSLSocket));
            z65.f(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            a aVar = (a) invocationHandler;
            if (!aVar.b() && aVar.a() == null) {
                xb8.l(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            } else if (aVar.b()) {
                return null;
            } else {
                return aVar.a();
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
