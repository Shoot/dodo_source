package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: EventListener.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u0000 <2\u00020\u0001:\u00029:B\u0007¢\u0006\u0004\b=\u0010>J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J&\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016J&\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\tH\u0016J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016J*\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J2\u0010 \u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0018\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0016J\u0010\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010(\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010,\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016J\u0018\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00101\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0010\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00103\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0016J\u0018\u00104\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u00107\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00108\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0018\u00109\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020/H\u0016J\u0010\u0010:\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010<\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010;\u001a\u00020/H\u0016¨\u0006?"}, d2 = {"Lxk3;", "", "Lcm0;", "call", "", "f", "Lsq4;", RemoteMessageConst.Notification.URL, "p", "", "Ljava/net/Proxy;", "proxies", "o", "", "domainName", "n", "Ljava/net/InetAddress;", "inetAddressList", Image.TYPE_MEDIUM, "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "j", "C", "Lkm4;", "handshake", "B", "Lvr8;", "protocol", Image.TYPE_HIGH, "Ljava/io/IOException;", "ioe", "i", "Loq1;", "connection", "k", "l", "u", "Lhi9;", "request", "t", "r", "", "byteCount", "q", Image.TYPE_SMALL, "z", "Lik9;", "response", "y", "w", "v", "x", DateTokenConverter.CONVERTER_KEY, e.a, "g", "A", "b", com.huawei.hms.opendevice.c.a, "cachedResponse", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: xk3  reason: default package */
/* loaded from: classes3.dex */
public abstract class xk3 {
    public static final b a = new b(null);
    public static final xk3 b = new a();

    /* compiled from: EventListener.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xk3$a", "Lxk3;", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xk3$a */
    /* loaded from: classes3.dex */
    public static final class a extends xk3 {
        a() {
        }
    }

    /* compiled from: EventListener.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lxk3$b;", "", "Lxk3;", "NONE", "Lxk3;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xk3$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: EventListener.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lxk3$c;", "", "Lcm0;", "call", "Lxk3;", "a", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xk3$c */
    /* loaded from: classes3.dex */
    public interface c {
        xk3 a(cm0 cm0Var);
    }

    public void A(cm0 cm0Var, ik9 ik9Var) {
        z65.h(cm0Var, "call");
        z65.h(ik9Var, "response");
    }

    public void B(cm0 cm0Var, km4 km4Var) {
        z65.h(cm0Var, "call");
    }

    public void C(cm0 cm0Var) {
        z65.h(cm0Var, "call");
    }

    public void a(cm0 cm0Var, ik9 ik9Var) {
        z65.h(cm0Var, "call");
        z65.h(ik9Var, "cachedResponse");
    }

    public void b(cm0 cm0Var, ik9 ik9Var) {
        z65.h(cm0Var, "call");
        z65.h(ik9Var, "response");
    }

    public void c(cm0 cm0Var) {
        z65.h(cm0Var, "call");
    }

    public void d(cm0 cm0Var) {
        z65.h(cm0Var, "call");
    }

    public void e(cm0 cm0Var, IOException iOException) {
        z65.h(cm0Var, "call");
        z65.h(iOException, "ioe");
    }

    public void f(cm0 cm0Var) {
        z65.h(cm0Var, "call");
    }

    public void g(cm0 cm0Var) {
        z65.h(cm0Var, "call");
    }

    public void h(cm0 cm0Var, InetSocketAddress inetSocketAddress, Proxy proxy, vr8 vr8Var) {
        z65.h(cm0Var, "call");
        z65.h(inetSocketAddress, "inetSocketAddress");
        z65.h(proxy, "proxy");
    }

    public void i(cm0 cm0Var, InetSocketAddress inetSocketAddress, Proxy proxy, vr8 vr8Var, IOException iOException) {
        z65.h(cm0Var, "call");
        z65.h(inetSocketAddress, "inetSocketAddress");
        z65.h(proxy, "proxy");
        z65.h(iOException, "ioe");
    }

    public void j(cm0 cm0Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        z65.h(cm0Var, "call");
        z65.h(inetSocketAddress, "inetSocketAddress");
        z65.h(proxy, "proxy");
    }

    public void k(cm0 cm0Var, oq1 oq1Var) {
        z65.h(cm0Var, "call");
        z65.h(oq1Var, "connection");
    }

    public void l(cm0 cm0Var, oq1 oq1Var) {
        z65.h(cm0Var, "call");
        z65.h(oq1Var, "connection");
    }

    public void m(cm0 cm0Var, String str, List<InetAddress> list) {
        z65.h(cm0Var, "call");
        z65.h(str, "domainName");
        z65.h(list, "inetAddressList");
    }

    public void n(cm0 cm0Var, String str) {
        z65.h(cm0Var, "call");
        z65.h(str, "domainName");
    }

    public void o(cm0 cm0Var, sq4 sq4Var, List<Proxy> list) {
        z65.h(cm0Var, "call");
        z65.h(sq4Var, RemoteMessageConst.Notification.URL);
        z65.h(list, "proxies");
    }

    public void p(cm0 cm0Var, sq4 sq4Var) {
        z65.h(cm0Var, "call");
        z65.h(sq4Var, RemoteMessageConst.Notification.URL);
    }

    public void q(cm0 cm0Var, long j) {
        z65.h(cm0Var, "call");
    }

    public void r(cm0 cm0Var) {
        z65.h(cm0Var, "call");
    }

    public void s(cm0 cm0Var, IOException iOException) {
        z65.h(cm0Var, "call");
        z65.h(iOException, "ioe");
    }

    public void t(cm0 cm0Var, hi9 hi9Var) {
        z65.h(cm0Var, "call");
        z65.h(hi9Var, "request");
    }

    public void u(cm0 cm0Var) {
        z65.h(cm0Var, "call");
    }

    public void v(cm0 cm0Var, long j) {
        z65.h(cm0Var, "call");
    }

    public void w(cm0 cm0Var) {
        z65.h(cm0Var, "call");
    }

    public void x(cm0 cm0Var, IOException iOException) {
        z65.h(cm0Var, "call");
        z65.h(iOException, "ioe");
    }

    public void y(cm0 cm0Var, ik9 ik9Var) {
        z65.h(cm0Var, "call");
        z65.h(ik9Var, "response");
    }

    public void z(cm0 cm0Var) {
        z65.h(cm0Var, "call");
    }
}
