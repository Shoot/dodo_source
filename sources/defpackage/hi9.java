package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.network.NetworkHandler;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gn4;
import defpackage.sq4;
import im.threads.business.transport.MessageAttributes;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Request.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u00107\u001a\u00020\u000f¢\u0006\u0004\b8\u00109B1\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\b\b\u0002\u0010\"\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010#¢\u0006\u0004\b8\u0010:J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J'\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0010\u001a\u00020\u000fJ\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0017\u0010\u0017\u001a\u00020\u00128G¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\"\u001a\u00020\u001d8G¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010&\u001a\u0004\u0018\u00010#8G¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b\u0013\u0010%R*\u0010*\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u00010'8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b\u001e\u0010)R$\u00101\u001a\u0004\u0018\u00010+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0011\u00105\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0011\u00106\u001a\u00020+8G¢\u0006\u0006\u001a\u0004\b\u0018\u0010.¨\u0006;"}, d2 = {"Lhi9;", "", "", Action.NAME_ATTRIBUTE, DateTokenConverter.CONVERTER_KEY, "", "f", "T", "Lod5;", MessageAttributes.TYPE, "j", "(Lod5;)Ljava/lang/Object;", "Ljava/lang/Class;", "k", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lhi9$a;", "i", "toString", "Lsq4;", "a", "Lsq4;", "l", "()Lsq4;", RemoteMessageConst.Notification.URL, "b", "Ljava/lang/String;", Image.TYPE_HIGH, "()Ljava/lang/String;", "method", "Lgn4;", c.a, "Lgn4;", e.a, "()Lgn4;", "headers", "Lji9;", "Lji9;", "()Lji9;", "body", "", "Ljava/util/Map;", "()Ljava/util/Map;", "tags", "Lll0;", "Lll0;", "getLazyCacheControl$okhttp", "()Lll0;", "setLazyCacheControl$okhttp", "(Lll0;)V", "lazyCacheControl", "", "g", "()Z", "isHttps", "cacheControl", "builder", "<init>", "(Lhi9$a;)V", "(Lsq4;Lgn4;Ljava/lang/String;Lji9;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: hi9  reason: default package */
/* loaded from: classes3.dex */
public final class hi9 {
    private final sq4 a;
    private final String b;
    private final gn4 c;
    private final ji9 d;
    private final Map<od5<?>, Object> e;
    private ll0 f;

    public /* synthetic */ hi9(sq4 sq4Var, gn4 gn4Var, String str, ji9 ji9Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sq4Var, (i & 2) != 0 ? gn4.b.a(new String[0]) : gn4Var, (i & 4) != 0 ? "\u0000" : str, (i & 8) != 0 ? null : ji9Var);
    }

    public final ji9 a() {
        return this.d;
    }

    public final ll0 b() {
        ll0 ll0Var = this.f;
        if (ll0Var == null) {
            ll0 a2 = ll0.n.a(this.c);
            this.f = a2;
            return a2;
        }
        return ll0Var;
    }

    public final Map<od5<?>, Object> c() {
        return this.e;
    }

    public final String d(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        return wdc.f(this, str);
    }

    public final gn4 e() {
        return this.c;
    }

    public final List<String> f(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        return wdc.h(this, str);
    }

    public final boolean g() {
        return this.a.l();
    }

    public final String h() {
        return this.b;
    }

    public final a i() {
        return new a(this);
    }

    public final <T> T j(od5<T> od5Var) {
        z65.h(od5Var, MessageAttributes.TYPE);
        return (T) gd5.a(od5Var).cast(this.e.get(od5Var));
    }

    public final <T> T k(Class<? extends T> cls) {
        z65.h(cls, MessageAttributes.TYPE);
        return (T) j(gd5.c(cls));
    }

    public final sq4 l() {
        return this.a;
    }

    public String toString() {
        return wdc.m(this);
    }

    /* compiled from: Request.kt */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b?\u0010@B\u0011\b\u0010\u0012\u0006\u0010A\u001a\u00020 ¢\u0006\u0004\b?\u0010BJ\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0016J\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0014\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0017J\u001a\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J/\u0010\u001e\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u001a2\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010!\u001a\u00020 H\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0018\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u000f\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R2\u0010>\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u000308\u0012\u0004\u0012\u00020\u0001078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=¨\u0006C"}, d2 = {"Lhi9$a;", "", "Lsq4;", RemoteMessageConst.Notification.URL, "t", "", "u", "Ljava/net/URL;", "v", Action.NAME_ATTRIBUTE, "value", "j", "a", "n", "Lgn4;", "headers", "k", "Lll0;", "cacheControl", c.a, "Lji9;", "body", Image.TYPE_MEDIUM, DateTokenConverter.CONVERTER_KEY, "method", "l", "T", "Ljava/lang/Class;", MessageAttributes.TYPE, RemoteMessageConst.Notification.TAG, Image.TYPE_SMALL, "(Ljava/lang/Class;Ljava/lang/Object;)Lhi9$a;", "Lhi9;", "b", "Lsq4;", "i", "()Lsq4;", "setUrl$okhttp", "(Lsq4;)V", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "q", "(Ljava/lang/String;)V", "Lgn4$a;", "Lgn4$a;", "f", "()Lgn4$a;", "p", "(Lgn4$a;)V", "Lji9;", e.a, "()Lji9;", "o", "(Lji9;)V", "", "Lod5;", "Ljava/util/Map;", Image.TYPE_HIGH, "()Ljava/util/Map;", "r", "(Ljava/util/Map;)V", "tags", "<init>", "()V", "request", "(Lhi9;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: hi9$a */
    /* loaded from: classes3.dex */
    public static class a {
        private sq4 a;
        private String b;
        private gn4.a c;
        private ji9 d;
        private Map<od5<?>, ? extends Object> e;

        public a() {
            Map<od5<?>, ? extends Object> h;
            h = g86.h();
            this.e = h;
            this.b = NetworkHandler.GET;
            this.c = new gn4.a();
        }

        public a a(String str, String str2) {
            z65.h(str, Action.NAME_ATTRIBUTE);
            z65.h(str2, "value");
            return wdc.b(this, str, str2);
        }

        public hi9 b() {
            return new hi9(this);
        }

        public a c(ll0 ll0Var) {
            z65.h(ll0Var, "cacheControl");
            return wdc.c(this, ll0Var);
        }

        public a d(ji9 ji9Var) {
            return wdc.d(this, ji9Var);
        }

        public final ji9 e() {
            return this.d;
        }

        public final gn4.a f() {
            return this.c;
        }

        public final String g() {
            return this.b;
        }

        public final Map<od5<?>, Object> h() {
            return this.e;
        }

        public final sq4 i() {
            return this.a;
        }

        public a j(String str, String str2) {
            z65.h(str, Action.NAME_ATTRIBUTE);
            z65.h(str2, "value");
            return wdc.e(this, str, str2);
        }

        public a k(gn4 gn4Var) {
            z65.h(gn4Var, "headers");
            return wdc.g(this, gn4Var);
        }

        public a l(String str, ji9 ji9Var) {
            z65.h(str, "method");
            return wdc.i(this, str, ji9Var);
        }

        public a m(ji9 ji9Var) {
            z65.h(ji9Var, "body");
            return wdc.j(this, ji9Var);
        }

        public a n(String str) {
            z65.h(str, Action.NAME_ATTRIBUTE);
            return wdc.k(this, str);
        }

        public final void o(ji9 ji9Var) {
            this.d = ji9Var;
        }

        public final void p(gn4.a aVar) {
            z65.h(aVar, "<set-?>");
            this.c = aVar;
        }

        public final void q(String str) {
            z65.h(str, "<set-?>");
            this.b = str;
        }

        public final void r(Map<od5<?>, ? extends Object> map) {
            z65.h(map, "<set-?>");
            this.e = map;
        }

        public <T> a s(Class<? super T> cls, T t) {
            z65.h(cls, MessageAttributes.TYPE);
            return wdc.l(this, gd5.c(cls), t);
        }

        public a t(sq4 sq4Var) {
            z65.h(sq4Var, RemoteMessageConst.Notification.URL);
            this.a = sq4Var;
            return this;
        }

        public a u(String str) {
            z65.h(str, RemoteMessageConst.Notification.URL);
            return t(sq4.j.b(wdc.a(str)));
        }

        public a v(URL url) {
            z65.h(url, RemoteMessageConst.Notification.URL);
            sq4.b bVar = sq4.j;
            String url2 = url.toString();
            z65.g(url2, "toString(...)");
            return t(bVar.b(url2));
        }

        public a(hi9 hi9Var) {
            Map<od5<?>, ? extends Object> h;
            z65.h(hi9Var, "request");
            h = g86.h();
            this.e = h;
            this.a = hi9Var.l();
            this.b = hi9Var.h();
            this.d = hi9Var.a();
            this.e = hi9Var.c().isEmpty() ? g86.h() : g86.x(hi9Var.c());
            this.c = hi9Var.e().p();
        }
    }

    public hi9(a aVar) {
        Map<od5<?>, Object> u;
        z65.h(aVar, "builder");
        sq4 i = aVar.i();
        if (i != null) {
            this.a = i;
            this.b = aVar.g();
            this.c = aVar.f().f();
            this.d = aVar.e();
            u = g86.u(aVar.h());
            this.e = u;
            return;
        }
        throw new IllegalStateException("url == null".toString());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public hi9(sq4 sq4Var, gn4 gn4Var, String str, ji9 ji9Var) {
        this(new a().t(sq4Var).k(gn4Var).l(z65.c(str, "\u0000") ? ji9Var != null ? NetworkHandler.POST : NetworkHandler.GET : str, ji9Var));
        z65.h(sq4Var, RemoteMessageConst.Notification.URL);
        z65.h(gn4Var, "headers");
        z65.h(str, "method");
    }
}
