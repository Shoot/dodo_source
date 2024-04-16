package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RouteSelector.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 -2\u00020\u0001:\u0002\f\tB/\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b+\u0010,J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\t\u0010\f\u001a\u00020\bH\u0086\u0002J\t\u0010\u000e\u001a\u00020\rH\u0086\u0002R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010\u001eR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001e¨\u0006."}, d2 = {"Lwo9;", "", "Lsq4;", RemoteMessageConst.Notification.URL, "Ljava/net/Proxy;", "proxy", "", "f", "", "b", DateTokenConverter.CONVERTER_KEY, e.a, "a", "Lwo9$b;", c.a, "Lx6;", "Lx6;", "address", "Lro9;", "Lro9;", "routeDatabase", "Lcm0;", "Lcm0;", "call", "Z", "fastFallback", "Lxk3;", "Lxk3;", "eventListener", "", "Ljava/util/List;", "proxies", "", "g", "I", "nextProxyIndex", "Ljava/net/InetSocketAddress;", Image.TYPE_HIGH, "inetSocketAddresses", "", "Lqo9;", "i", "postponedRoutes", "<init>", "(Lx6;Lro9;Lcm0;ZLxk3;)V", "j", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: wo9  reason: default package */
/* loaded from: classes3.dex */
public final class wo9 {
    public static final a j = new a(null);
    private final x6 a;
    private final ro9 b;
    private final cm0 c;
    private final boolean d;
    private final xk3 e;
    private List<? extends Proxy> f;
    private int g;
    private List<? extends InetSocketAddress> h;
    private final List<qo9> i;

    /* compiled from: RouteSelector.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lwo9$a;", "", "Ljava/net/InetSocketAddress;", "", "a", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "socketHost", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wo9$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            z65.h(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                z65.g(hostName, "getHostName(...)");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            z65.g(hostAddress, "getHostAddress(...)");
            return hostAddress;
        }
    }

    /* compiled from: RouteSelector.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\u0010"}, d2 = {"Lwo9$b;", "", "", "b", "Lqo9;", c.a, "", "a", "Ljava/util/List;", "()Ljava/util/List;", "routes", "", "I", "nextRouteIndex", "<init>", "(Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wo9$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final List<qo9> a;
        private int b;

        public b(List<qo9> list) {
            z65.h(list, "routes");
            this.a = list;
        }

        public final List<qo9> a() {
            return this.a;
        }

        public final boolean b() {
            if (this.b < this.a.size()) {
                return true;
            }
            return false;
        }

        public final qo9 c() {
            if (b()) {
                List<qo9> list = this.a;
                int i = this.b;
                this.b = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public wo9(x6 x6Var, ro9 ro9Var, cm0 cm0Var, boolean z, xk3 xk3Var) {
        List<? extends Proxy> l;
        List<? extends InetSocketAddress> l2;
        z65.h(x6Var, "address");
        z65.h(ro9Var, "routeDatabase");
        z65.h(cm0Var, "call");
        z65.h(xk3Var, "eventListener");
        this.a = x6Var;
        this.b = ro9Var;
        this.c = cm0Var;
        this.d = z;
        this.e = xk3Var;
        l = kc1.l();
        this.f = l;
        l2 = kc1.l();
        this.h = l2;
        this.i = new ArrayList();
        f(x6Var.l(), x6Var.g());
    }

    private final boolean b() {
        if (this.g < this.f.size()) {
            return true;
        }
        return false;
    }

    private final Proxy d() throws IOException {
        if (b()) {
            List<? extends Proxy> list = this.f;
            int i = this.g;
            this.g = i + 1;
            Proxy proxy = list.get(i);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.a.l().k() + "; exhausted proxy configurations: " + this.f);
    }

    private final void e(Proxy proxy) throws IOException {
        String k;
        int r;
        List<InetAddress> a2;
        ArrayList arrayList = new ArrayList();
        this.h = arrayList;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                a aVar = j;
                z65.e(address);
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                k = aVar.a(inetSocketAddress);
                r = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
            }
        } else {
            k = this.a.l().k();
            r = this.a.l().r();
        }
        if (1 <= r && r < 65536) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList.add(InetSocketAddress.createUnresolved(k, r));
                return;
            }
            if (rdc.a(k)) {
                a2 = jc1.e(InetAddress.getByName(k));
            } else {
                this.e.n(this.c, k);
                a2 = this.a.c().a(k);
                if (!a2.isEmpty()) {
                    this.e.m(this.c, k, a2);
                } else {
                    throw new UnknownHostException(this.a.c() + " returned no addresses for " + k);
                }
            }
            if (this.d) {
                a2 = u05.a(a2);
            }
            for (InetAddress inetAddress : a2) {
                arrayList.add(new InetSocketAddress(inetAddress, r));
            }
            return;
        }
        throw new SocketException("No route to " + k + CoreConstants.COLON_CHAR + r + "; port is out of range");
    }

    private final void f(sq4 sq4Var, Proxy proxy) {
        this.e.p(this.c, sq4Var);
        List<Proxy> g = g(proxy, sq4Var, this);
        this.f = g;
        this.g = 0;
        this.e.o(this.c, sq4Var, g);
    }

    private static final List<Proxy> g(Proxy proxy, sq4 sq4Var, wo9 wo9Var) {
        List<Proxy> e;
        if (proxy != null) {
            e = jc1.e(proxy);
            return e;
        }
        URI x = sq4Var.x();
        if (x.getHost() == null) {
            return cec.l(Proxy.NO_PROXY);
        }
        List<Proxy> select = wo9Var.a.i().select(x);
        List<Proxy> list = select;
        if (list != null && !list.isEmpty()) {
            z65.e(select);
            return cec.y(select);
        }
        return cec.l(Proxy.NO_PROXY);
    }

    public final boolean a() {
        if (b() || (!this.i.isEmpty())) {
            return true;
        }
        return false;
    }

    public final b c() throws IOException {
        if (a()) {
            ArrayList arrayList = new ArrayList();
            while (b()) {
                Proxy d = d();
                for (InetSocketAddress inetSocketAddress : this.h) {
                    qo9 qo9Var = new qo9(this.a, d, inetSocketAddress);
                    if (this.b.c(qo9Var)) {
                        this.i.add(qo9Var);
                    } else {
                        arrayList.add(qo9Var);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                pc1.C(arrayList, this.i);
                this.i.clear();
            }
            return new b(arrayList);
        }
        throw new NoSuchElementException();
    }
}
