package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gn4;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: Response.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0013B\u0089\u0001\b\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001d\u001a\u00020\u0018\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020#\u0012\b\u0010.\u001a\u0004\u0018\u00010)\u0012\u0006\u00104\u001a\u00020/\u0012\u0006\u00108\u001a\u00020\b\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010E\u001a\u00020\u0006\u0012\u0006\u0010H\u001a\u00020\u0006\u0012\b\u0010L\u001a\u0004\u0018\u00010I\u0012\f\u0010O\u001a\b\u0012\u0004\u0012\u00020/0M¢\u0006\u0004\b^\u0010_J\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0007J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\nJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0017\u0010\u0017\u001a\u00020\u00128\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\"\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010(\u001a\u00020#8\u0007¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010.\u001a\u0004\u0018\u00010)8\u0007¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u00104\u001a\u00020/8\u0007¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u00108\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b\u0019\u00107R\u0019\u0010=\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010>\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b*\u0010<R\u0019\u0010@\u001a\u0004\u0018\u00010\u00008\u0007¢\u0006\f\n\u0004\b&\u0010:\u001a\u0004\b?\u0010<R\u0017\u0010E\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010H\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bG\u0010DR\u001c\u0010L\u001a\u0004\u0018\u00010I8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010J\u001a\u0004\bA\u0010KR\u001c\u0010O\u001a\b\u0012\u0004\u0012\u00020/0M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010NR$\u0010V\u001a\u0004\u0018\u00010P8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bF\u0010S\"\u0004\bT\u0010UR\u0017\u0010Z\u001a\u00020W8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0017\u0010\\\u001a\u00020W8\u0006¢\u0006\f\n\u0004\b2\u0010Y\u001a\u0004\b\\\u0010[R\u0011\u0010]\u001a\u00020P8G¢\u0006\u0006\u001a\u0004\b\u001e\u0010S¨\u0006`"}, d2 = {"Lik9;", "Ljava/io/Closeable;", "", Action.NAME_ATTRIBUTE, "defaultValue", "n", "", "byteCount", "Lkk9;", "x", "Lik9$a;", "u", "", "Lxu0;", "i", "", "close", "toString", "Lhi9;", "a", "Lhi9;", "K", "()Lhi9;", "request", "Lvr8;", "b", "Lvr8;", "E", "()Lvr8;", "protocol", c.a, "Ljava/lang/String;", "r", "()Ljava/lang/String;", "message", "", DateTokenConverter.CONVERTER_KEY, "I", "j", "()I", "code", "Lkm4;", e.a, "Lkm4;", Image.TYPE_MEDIUM, "()Lkm4;", "handshake", "Lgn4;", "f", "Lgn4;", "q", "()Lgn4;", "headers", "g", "Lkk9;", "()Lkk9;", "body", Image.TYPE_HIGH, "Lik9;", Image.TYPE_SMALL, "()Lik9;", "networkResponse", "cacheResponse", "y", "priorResponse", "k", "J", "L", "()J", "sentRequestAtMillis", "l", "H", "receivedResponseAtMillis", "Lwl3;", "Lwl3;", "()Lwl3;", "exchange", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "trailersFn", "Lll0;", "o", "Lll0;", "()Lll0;", "M", "(Lll0;)V", "lazyCacheControl", "", "p", "Z", "isSuccessful", "()Z", "isRedirect", "cacheControl", "<init>", "(Lhi9;Lvr8;Ljava/lang/String;ILkm4;Lgn4;Lkk9;Lik9;Lik9;Lik9;JJLwl3;Lkotlin/jvm/functions/Function0;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: ik9  reason: default package */
/* loaded from: classes3.dex */
public final class ik9 implements Closeable {
    private final hi9 a;
    private final vr8 b;
    private final String c;
    private final int d;
    private final km4 e;
    private final gn4 f;
    private final kk9 g;
    private final ik9 h;
    private final ik9 i;
    private final ik9 j;
    private final long k;
    private final long l;
    private final wl3 m;
    private Function0<gn4> n;
    private ll0 o;
    private final boolean p;
    private final boolean q;

    public ik9(hi9 hi9Var, vr8 vr8Var, String str, int i, km4 km4Var, gn4 gn4Var, kk9 kk9Var, ik9 ik9Var, ik9 ik9Var2, ik9 ik9Var3, long j, long j2, wl3 wl3Var, Function0<gn4> function0) {
        z65.h(hi9Var, "request");
        z65.h(vr8Var, "protocol");
        z65.h(str, "message");
        z65.h(gn4Var, "headers");
        z65.h(kk9Var, "body");
        z65.h(function0, "trailersFn");
        this.a = hi9Var;
        this.b = vr8Var;
        this.c = str;
        this.d = i;
        this.e = km4Var;
        this.f = gn4Var;
        this.g = kk9Var;
        this.h = ik9Var;
        this.i = ik9Var2;
        this.j = ik9Var3;
        this.k = j;
        this.l = j2;
        this.m = wl3Var;
        this.n = function0;
        this.p = ydc.u(this);
        this.q = ydc.t(this);
    }

    public static /* synthetic */ String o(ik9 ik9Var, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return ik9Var.n(str, str2);
    }

    public final vr8 E() {
        return this.b;
    }

    public final long H() {
        return this.l;
    }

    public final hi9 K() {
        return this.a;
    }

    public final long L() {
        return this.k;
    }

    public final void M(ll0 ll0Var) {
        this.o = ll0Var;
    }

    public final kk9 b() {
        return this.g;
    }

    public final ll0 c() {
        return ydc.s(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ydc.e(this);
    }

    public final ik9 e() {
        return this.i;
    }

    public final List<xu0> i() {
        String str;
        List<xu0> l;
        gn4 gn4Var = this.f;
        int i = this.d;
        if (i != 401) {
            if (i != 407) {
                l = kc1.l();
                return l;
            }
            str = "Proxy-Authenticate";
        } else {
            str = "WWW-Authenticate";
        }
        return lq4.a(gn4Var, str);
    }

    public final boolean isSuccessful() {
        return this.p;
    }

    public final int j() {
        return this.d;
    }

    public final wl3 k() {
        return this.m;
    }

    public final ll0 l() {
        return this.o;
    }

    public final km4 m() {
        return this.e;
    }

    public final String n(String str, String str2) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        return ydc.h(this, str, str2);
    }

    public final gn4 q() {
        return this.f;
    }

    public final String r() {
        return this.c;
    }

    public final ik9 s() {
        return this.h;
    }

    public String toString() {
        return ydc.q(this);
    }

    public final a u() {
        return ydc.l(this);
    }

    public final kk9 x(long j) throws IOException {
        fh0 peek = this.g.source().peek();
        yg0 yg0Var = new yg0();
        peek.w(j);
        yg0Var.e0(peek, Math.min(j, peek.d().P()));
        return kk9.Companion.a(yg0Var, this.g.contentType(), yg0Var.P());
    }

    public final ik9 y() {
        return this.j;
    }

    /* compiled from: Response.kt */
    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b'\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\bn\u0010oB\u0011\b\u0010\u0012\u0006\u0010p\u001a\u00020\u001c¢\u0006\u0004\bn\u0010YJ\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0012\u0010\u001e\u001a\u00020\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010 \u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0016J\u0012\u0010\"\u001a\u00020\u00002\b\u0010!\u001a\u0004\u0018\u00010\u001cH\u0016J\u0016\u0010%\u001a\u00020\u00002\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160#H\u0016J\u0010\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&H\u0016J\u0010\u0010*\u001a\u00020\u00002\u0006\u0010)\u001a\u00020&H\u0016J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b.\u0010/J\b\u00100\u001a\u00020\u001cH\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010\u0017\u001a\u00020J8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010\u001a\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bL\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010U\u001a\u0004\bZ\u0010W\"\u0004\b[\u0010YR$\u0010!\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010U\u001a\u0004\b\\\u0010W\"\u0004\b]\u0010YR\"\u0010'\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\"\u0010)\u001a\u00020&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010^\u001a\u0004\bc\u0010`\"\u0004\bd\u0010bR$\u0010,\u001a\u0004\u0018\u00010+8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010/R(\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010m¨\u0006q"}, d2 = {"Lik9$a;", "", "Lhi9;", "request", "r", "Lvr8;", "protocol", "o", "", "code", e.a, "", "message", "l", "Lkm4;", "handshake", Image.TYPE_HIGH, Action.NAME_ATTRIBUTE, "value", "i", "a", "q", "Lgn4;", "headers", "j", "Lkk9;", "body", "b", "Lik9;", "networkResponse", Image.TYPE_MEDIUM, "cacheResponse", DateTokenConverter.CONVERTER_KEY, "priorResponse", "n", "Lkotlin/Function0;", "trailersFn", "D", "", "sentRequestAtMillis", Image.TYPE_SMALL, "receivedResponseAtMillis", "p", "Lwl3;", "exchange", "", "k", "(Lwl3;)V", c.a, "Lhi9;", "getRequest$okhttp", "()Lhi9;", "B", "(Lhi9;)V", "Lvr8;", "getProtocol$okhttp", "()Lvr8;", "A", "(Lvr8;)V", "I", "f", "()I", "v", "(I)V", "Ljava/lang/String;", "getMessage$okhttp", "()Ljava/lang/String;", "x", "(Ljava/lang/String;)V", "Lkm4;", "getHandshake$okhttp", "()Lkm4;", "setHandshake$okhttp", "(Lkm4;)V", "Lgn4$a;", "Lgn4$a;", "g", "()Lgn4$a;", "w", "(Lgn4$a;)V", "Lkk9;", "getBody$okhttp", "()Lkk9;", "t", "(Lkk9;)V", "Lik9;", "getNetworkResponse$okhttp", "()Lik9;", "y", "(Lik9;)V", "getCacheResponse$okhttp", "u", "getPriorResponse$okhttp", "z", "J", "getSentRequestAtMillis$okhttp", "()J", "setSentRequestAtMillis$okhttp", "(J)V", "getReceivedResponseAtMillis$okhttp", "setReceivedResponseAtMillis$okhttp", "Lwl3;", "getExchange$okhttp", "()Lwl3;", "setExchange$okhttp", "Lkotlin/jvm/functions/Function0;", "getTrailersFn$okhttp", "()Lkotlin/jvm/functions/Function0;", "C", "(Lkotlin/jvm/functions/Function0;)V", "<init>", "()V", "response", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ik9$a */
    /* loaded from: classes3.dex */
    public static class a {
        private hi9 a;
        private vr8 b;
        private int c;
        private String d;
        private km4 e;
        private gn4.a f;
        private kk9 g;
        private ik9 h;
        private ik9 i;
        private ik9 j;
        private long k;
        private long l;
        private wl3 m;
        private Function0<gn4> n;

        /* compiled from: Response.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lgn4;", "a", "()Lgn4;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: ik9$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0358a extends ej5 implements Function0<gn4> {
            final /* synthetic */ wl3 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0358a(wl3 wl3Var) {
                super(0);
                this.a = wl3Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final gn4 invoke() {
                return this.a.v();
            }
        }

        /* compiled from: Response.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lgn4;", "a", "()Lgn4;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: ik9$a$b */
        /* loaded from: classes3.dex */
        static final class b extends ej5 implements Function0<gn4> {
            public static final b a = new b();

            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final gn4 invoke() {
                return gn4.b.a(new String[0]);
            }
        }

        public a() {
            this.c = -1;
            this.g = zdc.o();
            this.n = b.a;
            this.f = new gn4.a();
        }

        public final void A(vr8 vr8Var) {
            this.b = vr8Var;
        }

        public final void B(hi9 hi9Var) {
            this.a = hi9Var;
        }

        public final void C(Function0<gn4> function0) {
            z65.h(function0, "<set-?>");
            this.n = function0;
        }

        public a D(Function0<gn4> function0) {
            z65.h(function0, "trailersFn");
            return ydc.r(this, function0);
        }

        public a a(String str, String str2) {
            z65.h(str, Action.NAME_ATTRIBUTE);
            z65.h(str2, "value");
            return ydc.b(this, str, str2);
        }

        public a b(kk9 kk9Var) {
            z65.h(kk9Var, "body");
            return ydc.c(this, kk9Var);
        }

        public ik9 c() {
            int i = this.c;
            if (i >= 0) {
                hi9 hi9Var = this.a;
                if (hi9Var != null) {
                    vr8 vr8Var = this.b;
                    if (vr8Var != null) {
                        String str = this.d;
                        if (str != null) {
                            return new ik9(hi9Var, vr8Var, str, i, this.e, this.f.f(), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(("code < 0: " + this.c).toString());
        }

        public a d(ik9 ik9Var) {
            return ydc.d(this, ik9Var);
        }

        public a e(int i) {
            return ydc.f(this, i);
        }

        public final int f() {
            return this.c;
        }

        public final gn4.a g() {
            return this.f;
        }

        public a h(km4 km4Var) {
            this.e = km4Var;
            return this;
        }

        public a i(String str, String str2) {
            z65.h(str, Action.NAME_ATTRIBUTE);
            z65.h(str2, "value");
            return ydc.g(this, str, str2);
        }

        public a j(gn4 gn4Var) {
            z65.h(gn4Var, "headers");
            return ydc.i(this, gn4Var);
        }

        public final void k(wl3 wl3Var) {
            z65.h(wl3Var, "exchange");
            this.m = wl3Var;
            this.n = new C0358a(wl3Var);
        }

        public a l(String str) {
            z65.h(str, "message");
            return ydc.j(this, str);
        }

        public a m(ik9 ik9Var) {
            return ydc.k(this, ik9Var);
        }

        public a n(ik9 ik9Var) {
            return ydc.m(this, ik9Var);
        }

        public a o(vr8 vr8Var) {
            z65.h(vr8Var, "protocol");
            return ydc.n(this, vr8Var);
        }

        public a p(long j) {
            this.l = j;
            return this;
        }

        public a q(String str) {
            z65.h(str, Action.NAME_ATTRIBUTE);
            return ydc.o(this, str);
        }

        public a r(hi9 hi9Var) {
            z65.h(hi9Var, "request");
            return ydc.p(this, hi9Var);
        }

        public a s(long j) {
            this.k = j;
            return this;
        }

        public final void t(kk9 kk9Var) {
            z65.h(kk9Var, "<set-?>");
            this.g = kk9Var;
        }

        public final void u(ik9 ik9Var) {
            this.i = ik9Var;
        }

        public final void v(int i) {
            this.c = i;
        }

        public final void w(gn4.a aVar) {
            z65.h(aVar, "<set-?>");
            this.f = aVar;
        }

        public final void x(String str) {
            this.d = str;
        }

        public final void y(ik9 ik9Var) {
            this.h = ik9Var;
        }

        public final void z(ik9 ik9Var) {
            this.j = ik9Var;
        }

        public a(ik9 ik9Var) {
            z65.h(ik9Var, "response");
            this.c = -1;
            this.g = zdc.o();
            this.n = b.a;
            this.a = ik9Var.K();
            this.b = ik9Var.E();
            this.c = ik9Var.j();
            this.d = ik9Var.r();
            this.e = ik9Var.m();
            this.f = ik9Var.q().p();
            this.g = ik9Var.b();
            this.h = ik9Var.s();
            this.i = ik9Var.e();
            this.j = ik9Var.y();
            this.k = ik9Var.L();
            this.l = ik9Var.H();
            this.m = ik9Var.k();
            this.n = ik9Var.n;
        }
    }
}
