package defpackage;

import android.content.res.Resources;
import android.os.Looper;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.flipper.plugins.network.FlipperOkhttpInterceptor;
import com.google.gson.Gson;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.b77;
import defpackage.mm4;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.time.a;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/* compiled from: RetrofitFactory.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 E2\u00020\u0001:\u0002\u0014\u000eBÃ\u0001\b\u0007\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0012\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0012\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u0012\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u0012\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0012\u0012\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0012\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u0012\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u0012\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u0002000\u0012\u0012\f\u00105\u001a\b\u0012\u0004\u0012\u0002030\u0012\u0012\b\b\u0001\u00109\u001a\u000206¢\u0006\u0004\bC\u0010DJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0014\u0010\u000b\u001a\u00020\b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0015R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020#0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0015R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0015R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0015R\u001a\u00102\u001a\b\u0012\u0004\u0012\u0002000\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0015R\u001a\u00105\u001a\b\u0012\u0004\u0012\u0002030\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0015R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R#\u0010?\u001a\n ;*\u0004\u0018\u00010:0:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b!\u0010>R\u001b\u0010B\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010=\u001a\u0004\b$\u0010A¨\u0006F"}, d2 = {"Lel9;", "", "", Image.TYPE_HIGH, "Lel9$b;", "config", "Lb77;", com.huawei.hms.opendevice.c.a, "Lb77$a;", "Lmm4;", "certificates", "i", "", "baseUrlHost", "b", "Lretrofit2/Retrofit;", e.a, DateTokenConverter.CONVERTER_KEY, "Las8;", "Ls80;", "a", "Las8;", "baseUrlServiceProvider", "Lmh0;", "Lmh0;", "buildInfo", "Lcom/google/gson/Gson;", "gsonProvider", "Lhn4;", "headersFillerInterceptorProvider", "Lzz;", "authorizationCheckInterceptorProvider", "Ltv6;", "f", "networkCheckInterceptorProvider", "Ld32;", "g", "culturesInterceptorProvider", "Lska;", "signerInterceptorProvider", "Lno0;", "captchaInterceptorProvider", "Lwt4;", "j", "ignoreQueriesInterceptorProvider", "Lmi9;", "k", "requestCounterInterceptorProvider", "Ls13;", "l", "deviceIdProviderProvider", "Lcom/facebook/flipper/plugins/network/FlipperOkhttpInterceptor;", Image.TYPE_MEDIUM, "flipperOkhttpInterceptorProvider", "Landroid/content/res/Resources;", "n", "Landroid/content/res/Resources;", "resources", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "o", "Lrn5;", "()Lorg/slf4j/Logger;", "logger", "p", "()Lmm4;", "trustedCertificates", "<init>", "(Las8;Lmh0;Las8;Las8;Las8;Las8;Las8;Las8;Las8;Las8;Las8;Las8;Las8;Landroid/content/res/Resources;)V", "q", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: el9  reason: default package */
/* loaded from: classes.dex */
public final class el9 {
    public static final a q = new a(null);
    private static final long r;
    private static final long s;
    private static final long t;
    private final as8<s80> a;
    private final mh0 b;
    private final as8<Gson> c;
    private final as8<hn4> d;
    private final as8<zz> e;
    private final as8<tv6> f;
    private final as8<d32> g;
    private final as8<ska> h;
    private final as8<no0> i;
    private final as8<wt4> j;
    private final as8<mi9> k;
    private final as8<s13> l;
    private final as8<FlipperOkhttpInterceptor> m;
    private final Resources n;
    private final rn5 o;
    private final rn5 p;

    /* compiled from: RetrofitFactory.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Lel9$a;", "", "Lkotlin/time/a;", "CONNECT_TIMEOUT", "J", "PING_INTERVAL", "READ_TIMEOUT", "<init>", "()V", "core_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: el9$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RetrofitFactory.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, d2 = {"Lel9$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lsq4;", "a", "Lsq4;", "()Lsq4;", "baseUrl", "<init>", "(Lsq4;)V", "core_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: el9$b */
    /* loaded from: classes.dex */
    public static final class b {
        private final sq4 a;

        public b(sq4 sq4Var) {
            z65.h(sq4Var, "baseUrl");
            this.a = sq4Var;
        }

        public final sq4 a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && z65.c(this.a, ((b) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            sq4 sq4Var = this.a;
            return "Config(baseUrl=" + sq4Var + ")";
        }
    }

    /* compiled from: RetrofitFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "a", "()Lorg/slf4j/Logger;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: el9$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<Logger> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Logger invoke() {
            return LoggerFactory.getLogger("RetrofitFactory");
        }
    }

    /* compiled from: RetrofitFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lmm4;", "a", "()Lmm4;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: el9$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function0<mm4> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final mm4 invoke() {
            BufferedReader bufferedReader;
            InputStream openRawResource = el9.this.n.openRawResource(l09.sber_cert);
            z65.g(openRawResource, "openRawResource(...)");
            InputStreamReader inputStreamReader = new InputStreamReader(openRawResource, rw0.b);
            if (inputStreamReader instanceof BufferedReader) {
                bufferedReader = (BufferedReader) inputStreamReader;
            } else {
                bufferedReader = new BufferedReader(inputStreamReader, 8192);
            }
            try {
                String f = pcb.f(bufferedReader);
                aa1.a(bufferedReader, null);
                return new mm4.a().b().c(iu0.a(f)).d();
            } finally {
            }
        }
    }

    static {
        a.C0415a c0415a = kotlin.time.a.b;
        l93 l93Var = l93.f;
        r = kotlin.time.b.h(1, l93Var);
        s = kotlin.time.b.h(5, l93Var);
        t = kotlin.time.b.h(5, l93.e);
    }

    public el9(as8<s80> as8Var, mh0 mh0Var, as8<Gson> as8Var2, as8<hn4> as8Var3, as8<zz> as8Var4, as8<tv6> as8Var5, as8<d32> as8Var6, as8<ska> as8Var7, as8<no0> as8Var8, as8<wt4> as8Var9, as8<mi9> as8Var10, as8<s13> as8Var11, as8<FlipperOkhttpInterceptor> as8Var12, Resources resources) {
        rn5 b2;
        rn5 b3;
        z65.h(as8Var, "baseUrlServiceProvider");
        z65.h(mh0Var, "buildInfo");
        z65.h(as8Var2, "gsonProvider");
        z65.h(as8Var3, "headersFillerInterceptorProvider");
        z65.h(as8Var4, "authorizationCheckInterceptorProvider");
        z65.h(as8Var5, "networkCheckInterceptorProvider");
        z65.h(as8Var6, "culturesInterceptorProvider");
        z65.h(as8Var7, "signerInterceptorProvider");
        z65.h(as8Var8, "captchaInterceptorProvider");
        z65.h(as8Var9, "ignoreQueriesInterceptorProvider");
        z65.h(as8Var10, "requestCounterInterceptorProvider");
        z65.h(as8Var11, "deviceIdProviderProvider");
        z65.h(as8Var12, "flipperOkhttpInterceptorProvider");
        z65.h(resources, "resources");
        this.a = as8Var;
        this.b = mh0Var;
        this.c = as8Var2;
        this.d = as8Var3;
        this.e = as8Var4;
        this.f = as8Var5;
        this.g = as8Var6;
        this.h = as8Var7;
        this.i = as8Var8;
        this.j = as8Var9;
        this.k = as8Var10;
        this.l = as8Var11;
        this.m = as8Var12;
        this.n = resources;
        b2 = yn5.b(c.a);
        this.o = b2;
        b3 = yn5.b(new d());
        this.p = b3;
    }

    private final mm4 b(String str) {
        return new mm4.a().a(str).d();
    }

    private final b77 c(b bVar) {
        b77.a aVar = new b77.a();
        aVar.f(r);
        aVar.T(s);
        aVar.P(t);
        aVar.a(ig0.a);
        tv6 tv6Var = this.f.get();
        z65.g(tv6Var, "get(...)");
        aVar.a(tv6Var);
        hn4 hn4Var = this.d.get();
        z65.g(hn4Var, "get(...)");
        aVar.a(hn4Var);
        zz zzVar = this.e.get();
        z65.g(zzVar, "get(...)");
        aVar.a(zzVar);
        if (!nh0.a(this.b)) {
            i(aVar, g());
            no0 no0Var = this.i.get();
            z65.g(no0Var, "get(...)");
            aVar.a(no0Var);
            d32 d32Var = this.g.get();
            z65.g(d32Var, "get(...)");
            aVar.a(d32Var);
            ska skaVar = this.h.get();
            z65.g(skaVar, "get(...)");
            aVar.a(skaVar);
        } else {
            i(aVar, b(bVar.a().k()));
            mi9 mi9Var = this.k.get();
            z65.g(mi9Var, "get(...)");
            aVar.a(mi9Var);
            wt4 wt4Var = this.j.get();
            z65.g(wt4Var, "get(...)");
            aVar.a(wt4Var);
            if (nh0.b(this.b)) {
                s13 s13Var = this.l.get();
                z65.g(s13Var, "get(...)");
                aVar.a(new q71("http://10.0.2.2:8123/", s13Var));
            } else {
                aVar.R(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.2.2", 8123)));
            }
        }
        if (this.b.i()) {
            aVar.a(new ay5("http_dodo_all", by5.d));
            aVar.a(new ay5("http_dodo_basic", by5.b));
            FlipperOkhttpInterceptor flipperOkhttpInterceptor = this.m.get();
            z65.g(flipperOkhttpInterceptor, "get(...)");
            aVar.a(flipperOkhttpInterceptor);
        }
        return aVar.c();
    }

    private final Logger f() {
        return (Logger) this.o.getValue();
    }

    private final mm4 g() {
        return (mm4) this.p.getValue();
    }

    private final boolean h() {
        return z65.c(Looper.getMainLooper().getThread(), Thread.currentThread());
    }

    private final b77.a i(b77.a aVar, mm4 mm4Var) {
        return aVar.U(mm4Var.b(), mm4Var.c());
    }

    public final Retrofit d(b bVar) {
        List e;
        z65.h(bVar, "config");
        if (h()) {
            f().warn("Building OkHttpClient from the main thread", new Throwable("Stack Trace"));
        }
        Retrofit.Builder addConverterFactory = new Retrofit.Builder().baseUrl(bVar.a()).client(c(bVar)).addConverterFactory(GsonConverterFactory.create(this.c.get()));
        e = jc1.e(Call.class);
        Retrofit build = addConverterFactory.addCallAdapterFactory(new dl9(e)).build();
        z65.g(build, "build(...)");
        return build;
    }

    public final Retrofit e() {
        return d(new b(sq4.j.b(this.a.get().a())));
    }
}
