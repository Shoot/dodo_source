package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sq4;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;
/* compiled from: Address.kt */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010B\u001a\u00020\n\u0012\u0006\u0010C\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010%\u001a\u0004\u0018\u00010\"\u0012\u0006\u0010+\u001a\u00020&\u0012\b\u00100\u001a\u0004\u0018\u00010,\u0012\f\u0010?\u001a\b\u0012\u0004\u0012\u00020<0;\u0012\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0;\u0012\u0006\u00105\u001a\u000201¢\u0006\u0004\bD\u0010EJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0016R\u0017\u0010\u0011\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010!\u001a\u0004\u0018\u00010\u001d8\u0007¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010%\u001a\u0004\u0018\u00010\"8\u0007¢\u0006\f\n\u0004\b\u001f\u0010#\u001a\u0004\b\r\u0010$R\u0017\u0010+\u001a\u00020&8\u0007¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u00100\u001a\u0004\u0018\u00010,8\u0007¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u0017\u00105\u001a\u0002018\u0007¢\u0006\f\n\u0004\b)\u00102\u001a\u0004\b3\u00104R\u0017\u0010:\u001a\u0002068G¢\u0006\f\n\u0004\b3\u00107\u001a\u0004\b8\u00109R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020<0;8G¢\u0006\f\n\u0004\b\u0015\u0010=\u001a\u0004\b'\u0010>R\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020@0;8G¢\u0006\f\n\u0004\b\u001a\u0010=\u001a\u0004\b\u0013\u0010>¨\u0006F"}, d2 = {"Lx6;", "", "other", "", "equals", "", "hashCode", "that", DateTokenConverter.CONVERTER_KEY, "(Lx6;)Z", "", "toString", "Lf53;", "a", "Lf53;", c.a, "()Lf53;", "dns", "Ljavax/net/SocketFactory;", "b", "Ljavax/net/SocketFactory;", "j", "()Ljavax/net/SocketFactory;", "socketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "Ljavax/net/ssl/SSLSocketFactory;", "k", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/HostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", e.a, "()Ljavax/net/ssl/HostnameVerifier;", "hostnameVerifier", "Lgu0;", "Lgu0;", "()Lgu0;", "certificatePinner", "Lpz;", "f", "Lpz;", Image.TYPE_HIGH, "()Lpz;", "proxyAuthenticator", "Ljava/net/Proxy;", "g", "Ljava/net/Proxy;", "()Ljava/net/Proxy;", "proxy", "Ljava/net/ProxySelector;", "Ljava/net/ProxySelector;", "i", "()Ljava/net/ProxySelector;", "proxySelector", "Lsq4;", "Lsq4;", "l", "()Lsq4;", RemoteMessageConst.Notification.URL, "", "Lvr8;", "Ljava/util/List;", "()Ljava/util/List;", "protocols", "Lsq1;", "connectionSpecs", "uriHost", "uriPort", "<init>", "(Ljava/lang/String;ILf53;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lgu0;Lpz;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: x6  reason: default package */
/* loaded from: classes3.dex */
public final class x6 {
    private final f53 a;
    private final SocketFactory b;
    private final SSLSocketFactory c;
    private final HostnameVerifier d;
    private final gu0 e;
    private final pz f;
    private final Proxy g;
    private final ProxySelector h;
    private final sq4 i;
    private final List<vr8> j;
    private final List<sq1> k;

    public x6(String str, int i, f53 f53Var, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, gu0 gu0Var, pz pzVar, Proxy proxy, List<? extends vr8> list, List<sq1> list2, ProxySelector proxySelector) {
        String str2;
        z65.h(str, "uriHost");
        z65.h(f53Var, "dns");
        z65.h(socketFactory, "socketFactory");
        z65.h(pzVar, "proxyAuthenticator");
        z65.h(list, "protocols");
        z65.h(list2, "connectionSpecs");
        z65.h(proxySelector, "proxySelector");
        this.a = f53Var;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = gu0Var;
        this.f = pzVar;
        this.g = proxy;
        this.h = proxySelector;
        sq4.a aVar = new sq4.a();
        if (sSLSocketFactory != null) {
            str2 = "https";
        } else {
            str2 = "http";
        }
        this.i = aVar.t(str2).n(str).q(i).c();
        this.j = cec.y(list);
        this.k = cec.y(list2);
    }

    public final gu0 a() {
        return this.e;
    }

    public final List<sq1> b() {
        return this.k;
    }

    public final f53 c() {
        return this.a;
    }

    public final boolean d(x6 x6Var) {
        z65.h(x6Var, "that");
        if (z65.c(this.a, x6Var.a) && z65.c(this.f, x6Var.f) && z65.c(this.j, x6Var.j) && z65.c(this.k, x6Var.k) && z65.c(this.h, x6Var.h) && z65.c(this.g, x6Var.g) && z65.c(this.c, x6Var.c) && z65.c(this.d, x6Var.d) && z65.c(this.e, x6Var.e) && this.i.r() == x6Var.i.r()) {
            return true;
        }
        return false;
    }

    public final HostnameVerifier e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof x6) {
            x6 x6Var = (x6) obj;
            if (z65.c(this.i, x6Var.i) && d(x6Var)) {
                return true;
            }
        }
        return false;
    }

    public final List<vr8> f() {
        return this.j;
    }

    public final Proxy g() {
        return this.g;
    }

    public final pz h() {
        return this.f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.i.hashCode()) * 31) + this.a.hashCode()) * 31) + this.f.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.h.hashCode()) * 31) + Objects.hashCode(this.g)) * 31) + Objects.hashCode(this.c)) * 31) + Objects.hashCode(this.d)) * 31) + Objects.hashCode(this.e);
    }

    public final ProxySelector i() {
        return this.h;
    }

    public final SocketFactory j() {
        return this.b;
    }

    public final SSLSocketFactory k() {
        return this.c;
    }

    public final sq4 l() {
        return this.i;
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.i.k());
        sb2.append(CoreConstants.COLON_CHAR);
        sb2.append(this.i.r());
        sb2.append(", ");
        if (this.g != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.g;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.h;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }
}
