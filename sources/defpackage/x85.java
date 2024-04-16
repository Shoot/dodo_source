package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: JavaNetAuthenticator.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lx85;", "Lpz;", "Ljava/net/Proxy;", "Lsq4;", RemoteMessageConst.Notification.URL, "Lf53;", "dns", "Ljava/net/InetAddress;", "b", "Lqo9;", "route", "Lik9;", "response", "Lhi9;", "a", DateTokenConverter.CONVERTER_KEY, "Lf53;", "defaultDns", "<init>", "(Lf53;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: x85  reason: default package */
/* loaded from: classes3.dex */
public final class x85 implements pz {
    private final f53 d;

    /* compiled from: JavaNetAuthenticator.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x85$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public x85(f53 f53Var) {
        z65.h(f53Var, "defaultDns");
        this.d = f53Var;
    }

    private final InetAddress b(Proxy proxy, sq4 sq4Var, f53 f53Var) throws IOException {
        Object Z;
        Proxy.Type type = proxy.type();
        if (type != null && a.$EnumSwitchMapping$0[type.ordinal()] == 1) {
            Z = sc1.Z(f53Var.a(sq4Var.k()));
            return (InetAddress) Z;
        }
        SocketAddress address = proxy.address();
        z65.f(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        z65.g(address2, "getAddress(...)");
        return address2;
    }

    @Override // defpackage.pz
    public hi9 a(qo9 qo9Var, ik9 ik9Var) throws IOException {
        boolean z;
        Proxy proxy;
        boolean v;
        f53 f53Var;
        PasswordAuthentication requestPasswordAuthentication;
        String str;
        x6 a2;
        z65.h(ik9Var, "response");
        List<xu0> i = ik9Var.i();
        hi9 K = ik9Var.K();
        sq4 l = K.l();
        if (ik9Var.j() == 407) {
            z = true;
        } else {
            z = false;
        }
        if (qo9Var == null || (proxy = qo9Var.b()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (xu0 xu0Var : i) {
            v = l0b.v("Basic", xu0Var.d(), true);
            if (v) {
                if (qo9Var == null || (a2 = qo9Var.a()) == null || (f53Var = a2.c()) == null) {
                    f53Var = this.d;
                }
                if (z) {
                    SocketAddress address = proxy.address();
                    z65.f(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    z65.e(proxy);
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, l, f53Var), inetSocketAddress.getPort(), l.w(), xu0Var.c(), xu0Var.d(), l.y(), Authenticator.RequestorType.PROXY);
                } else {
                    String k = l.k();
                    z65.e(proxy);
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(k, b(proxy, l, f53Var), l.r(), l.w(), xu0Var.c(), xu0Var.d(), l.y(), Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    if (z) {
                        str = "Proxy-Authorization";
                    } else {
                        str = "Authorization";
                    }
                    String userName = requestPasswordAuthentication.getUserName();
                    z65.g(userName, "getUserName(...)");
                    char[] password = requestPasswordAuthentication.getPassword();
                    z65.g(password, "getPassword(...)");
                    return K.i().j(str, o22.a(userName, new String(password), xu0Var.b())).b();
                }
            }
        }
        return null;
    }

    public /* synthetic */ x85(f53 f53Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? f53.b : f53Var);
    }
}
