package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.Metadata;
/* compiled from: Route.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000e\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lqo9;", "", "", c.a, "other", "equals", "", "hashCode", "", "toString", "Lx6;", "a", "Lx6;", "()Lx6;", "address", "Ljava/net/Proxy;", "b", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "proxy", "Ljava/net/InetSocketAddress;", "Ljava/net/InetSocketAddress;", DateTokenConverter.CONVERTER_KEY, "()Ljava/net/InetSocketAddress;", "socketAddress", "<init>", "(Lx6;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: qo9  reason: default package */
/* loaded from: classes3.dex */
public final class qo9 {
    private final x6 a;
    private final Proxy b;
    private final InetSocketAddress c;

    public qo9(x6 x6Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        z65.h(x6Var, "address");
        z65.h(proxy, "proxy");
        z65.h(inetSocketAddress, "socketAddress");
        this.a = x6Var;
        this.b = proxy;
        this.c = inetSocketAddress;
    }

    public final x6 a() {
        return this.a;
    }

    public final Proxy b() {
        return this.b;
    }

    public final boolean c() {
        if (this.b.type() != Proxy.Type.HTTP) {
            return false;
        }
        if (this.a.k() == null && !this.a.f().contains(vr8.g)) {
            return false;
        }
        return true;
    }

    public final InetSocketAddress d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof qo9) {
            qo9 qo9Var = (qo9) obj;
            if (z65.c(qo9Var.a, this.a) && z65.c(qo9Var.b, this.b) && z65.c(qo9Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str;
        boolean N;
        boolean N2;
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        String k = this.a.l().k();
        InetAddress address = this.c.getAddress();
        if (address != null && (hostAddress = address.getHostAddress()) != null) {
            z65.e(hostAddress);
            str = rdc.k(hostAddress);
        } else {
            str = null;
        }
        N = m0b.N(k, CoreConstants.COLON_CHAR, false, 2, null);
        if (N) {
            sb.append("[");
            sb.append(k);
            sb.append("]");
        } else {
            sb.append(k);
        }
        if (this.a.l().r() != this.c.getPort() || z65.c(k, str)) {
            sb.append(":");
            sb.append(this.a.l().r());
        }
        if (!z65.c(k, str)) {
            if (z65.c(this.b, Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (str != null) {
                N2 = m0b.N(str, CoreConstants.COLON_CHAR, false, 2, null);
                if (N2) {
                    sb.append("[");
                    sb.append(str);
                    sb.append("]");
                } else {
                    sb.append(str);
                }
            } else {
                sb.append("<unresolved>");
            }
            sb.append(":");
            sb.append(this.c.getPort());
        }
        String sb2 = sb.toString();
        z65.g(sb2, "toString(...)");
        return sb2;
    }
}
