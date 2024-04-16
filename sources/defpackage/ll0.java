package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CacheControl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001d\u0018\u0000 %2\u00020\u0001:\u0002\u0005\nBs\b\u0000\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\r\u0012\u0006\u0010\u001d\u001a\u00020\r\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b(\u0010)J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\u0012\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0018\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001c\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u001d\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\u001f\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010\"\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\n\u0010\bR$\u0010'\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010#\u001a\u0004\b\u0005\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lll0;", "", "", "toString", "", "a", "Z", "i", "()Z", "noCache", "b", "j", "noStore", "", c.a, "I", e.a, "()I", "maxAgeSeconds", DateTokenConverter.CONVERTER_KEY, Image.TYPE_MEDIUM, "sMaxAgeSeconds", "isPrivate", "f", "isPublic", "g", Image.TYPE_HIGH, "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "l", "onlyIfCached", "k", "noTransform", "immutable", "Ljava/lang/String;", "()Ljava/lang/String;", "n", "(Ljava/lang/String;)V", "headerValue", "<init>", "(ZZIIZZZIIZZZLjava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: ll0  reason: default package */
/* loaded from: classes3.dex */
public final class ll0 {
    public static final b n;
    public static final ll0 o;
    public static final ll0 p;
    private final boolean a;
    private final boolean b;
    private final int c;
    private final int d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final int h;
    private final int i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private String m;

    /* compiled from: CacheControl.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0003\u001a\u00020\u0000J\u0006\u0010\u0004\u001a\u00020\u0000J\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\nR\"\u0010\u0012\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\"\u0010\u001c\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u001f\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR\"\u0010\"\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010\u0018\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\"\u0010%\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\r\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011R\"\u0010(\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b&\u0010\u000f\"\u0004\b'\u0010\u0011R\"\u0010*\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b)\u0010\u0011¨\u0006-"}, d2 = {"Lll0$a;", "", "k", "l", Image.TYPE_MEDIUM, "", "maxStale", "Ll93;", "timeUnit", "j", "Lll0;", "a", "", "Z", "f", "()Z", "o", "(Z)V", "noCache", "b", "g", "p", "noStore", c.a, "I", "()I", "setMaxAgeSeconds$okhttp", "(I)V", "maxAgeSeconds", DateTokenConverter.CONVERTER_KEY, "n", "maxStaleSeconds", e.a, "setMinFreshSeconds$okhttp", "minFreshSeconds", "i", "q", "onlyIfCached", Image.TYPE_HIGH, "setNoTransform$okhttp", "noTransform", "setImmutable$okhttp", "immutable", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ll0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private boolean a;
        private boolean b;
        private int c = -1;
        private int d = -1;
        private int e = -1;
        private boolean f;
        private boolean g;
        private boolean h;

        public final ll0 a() {
            return odc.a(this);
        }

        public final boolean b() {
            return this.h;
        }

        public final int c() {
            return this.c;
        }

        public final int d() {
            return this.d;
        }

        public final int e() {
            return this.e;
        }

        public final boolean f() {
            return this.a;
        }

        public final boolean g() {
            return this.b;
        }

        public final boolean h() {
            return this.g;
        }

        public final boolean i() {
            return this.f;
        }

        public final a j(int i, l93 l93Var) {
            z65.h(l93Var, "timeUnit");
            return odc.e(this, i, l93Var);
        }

        public final a k() {
            return odc.f(this);
        }

        public final a l() {
            return odc.g(this);
        }

        public final a m() {
            return odc.h(this);
        }

        public final void n(int i) {
            this.d = i;
        }

        public final void o(boolean z) {
            this.a = z;
        }

        public final void p(boolean z) {
            this.b = z;
        }

        public final void q(boolean z) {
            this.f = z;
        }
    }

    /* compiled from: CacheControl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lll0$b;", "", "Lgn4;", "headers", "Lll0;", "a", "FORCE_CACHE", "Lll0;", "FORCE_NETWORK", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ll0$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ll0 a(gn4 gn4Var) {
            z65.h(gn4Var, "headers");
            return odc.i(this, gn4Var);
        }
    }

    static {
        b bVar = new b(null);
        n = bVar;
        o = odc.d(bVar);
        p = odc.c(bVar);
    }

    public ll0(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    public final String a() {
        return this.m;
    }

    public final boolean b() {
        return this.l;
    }

    public final boolean c() {
        return this.e;
    }

    public final boolean d() {
        return this.f;
    }

    public final int e() {
        return this.c;
    }

    public final int f() {
        return this.h;
    }

    public final int g() {
        return this.i;
    }

    public final boolean h() {
        return this.g;
    }

    public final boolean i() {
        return this.a;
    }

    public final boolean j() {
        return this.b;
    }

    public final boolean k() {
        return this.k;
    }

    public final boolean l() {
        return this.j;
    }

    public final int m() {
        return this.d;
    }

    public final void n(String str) {
        this.m = str;
    }

    public String toString() {
        return odc.j(this);
    }
}
