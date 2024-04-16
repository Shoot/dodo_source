package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.gn4;
import defpackage.ik9;
import defpackage.k65;
import defpackage.sl0;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CacheInterceptor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0006B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lpl0;", "Lk65;", "Lrl0;", "cacheRequest", "Lik9;", "response", "a", "Lk65$a;", "chain", "intercept", "Lil0;", "Lil0;", "getCache$okhttp", "()Lil0;", "cache", "<init>", "(Lil0;)V", "b", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: pl0  reason: default package */
/* loaded from: classes3.dex */
public final class pl0 implements k65 {
    public static final a b = new a(null);
    private final il0 a;

    /* compiled from: CacheInterceptor.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¨\u0006\r"}, d2 = {"Lpl0$a;", "", "Lgn4;", "cachedHeaders", "networkHeaders", "b", "", "fieldName", "", DateTokenConverter.CONVERTER_KEY, c.a, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pl0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final gn4 b(gn4 gn4Var, gn4 gn4Var2) {
            boolean v;
            boolean J;
            gn4.a aVar = new gn4.a();
            int size = gn4Var.size();
            for (int i = 0; i < size; i++) {
                String h = gn4Var.h(i);
                String u = gn4Var.u(i);
                v = l0b.v("Warning", h, true);
                if (v) {
                    J = l0b.J(u, "1", false, 2, null);
                    if (J) {
                    }
                }
                if (c(h) || !d(h) || gn4Var2.d(h) == null) {
                    aVar.d(h, u);
                }
            }
            int size2 = gn4Var2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String h2 = gn4Var2.h(i2);
                if (!c(h2) && d(h2)) {
                    aVar.d(h2, gn4Var2.u(i2));
                }
            }
            return aVar.f();
        }

        private final boolean c(String str) {
            boolean v;
            boolean v2;
            boolean v3;
            v = l0b.v("Content-Length", str, true);
            if (!v) {
                v2 = l0b.v("Content-Encoding", str, true);
                if (!v2) {
                    v3 = l0b.v("Content-Type", str, true);
                    if (v3) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
            return true;
        }

        private final boolean d(String str) {
            boolean v;
            boolean v2;
            boolean v3;
            boolean v4;
            boolean v5;
            boolean v6;
            boolean v7;
            boolean v8;
            v = l0b.v("Connection", str, true);
            if (!v) {
                v2 = l0b.v("Keep-Alive", str, true);
                if (!v2) {
                    v3 = l0b.v("Proxy-Authenticate", str, true);
                    if (!v3) {
                        v4 = l0b.v("Proxy-Authorization", str, true);
                        if (!v4) {
                            v5 = l0b.v("TE", str, true);
                            if (!v5) {
                                v6 = l0b.v("Trailers", str, true);
                                if (!v6) {
                                    v7 = l0b.v("Transfer-Encoding", str, true);
                                    if (!v7) {
                                        v8 = l0b.v("Upgrade", str, true);
                                        if (!v8) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
    }

    /* compiled from: CacheInterceptor.kt */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"pl0$b", "Lpqa;", "Lyg0;", "sink", "", "byteCount", "read", "Lxgb;", "timeout", "", "close", "", "a", "Z", "cacheRequestClosed", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pl0$b */
    /* loaded from: classes3.dex */
    public static final class b implements pqa {
        private boolean a;
        final /* synthetic */ fh0 b;
        final /* synthetic */ rl0 c;
        final /* synthetic */ eh0 d;

        b(fh0 fh0Var, rl0 rl0Var, eh0 eh0Var) {
            this.b = fh0Var;
            this.c = rl0Var;
            this.d = eh0Var;
        }

        @Override // defpackage.pqa, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!this.a && !cec.i(this, 100, TimeUnit.MILLISECONDS)) {
                this.a = true;
                this.c.a();
            }
            this.b.close();
        }

        @Override // defpackage.pqa
        public long read(yg0 yg0Var, long j) throws IOException {
            z65.h(yg0Var, "sink");
            try {
                long read = this.b.read(yg0Var, j);
                if (read == -1) {
                    if (!this.a) {
                        this.a = true;
                        this.d.close();
                    }
                    return -1L;
                }
                yg0Var.j(this.d.d(), yg0Var.P() - read, read);
                this.d.U();
                return read;
            } catch (IOException e) {
                if (!this.a) {
                    this.a = true;
                    this.c.a();
                }
                throw e;
            }
        }

        @Override // defpackage.pqa
        public xgb timeout() {
            return this.b.timeout();
        }
    }

    public pl0(il0 il0Var) {
        this.a = il0Var;
    }

    private final ik9 a(rl0 rl0Var, ik9 ik9Var) throws IOException {
        if (rl0Var == null) {
            return ik9Var;
        }
        b bVar = new b(ik9Var.b().source(), rl0Var, c77.b(rl0Var.b()));
        return ik9Var.u().b(new x79(ik9.o(ik9Var, "Content-Type", null, 2, null), ik9Var.b().contentLength(), c77.c(bVar))).c();
    }

    @Override // defpackage.k65
    public ik9 intercept(k65.a aVar) throws IOException {
        ik9 ik9Var;
        t79 t79Var;
        xk3 xk3Var;
        z65.h(aVar, "chain");
        cm0 call = aVar.call();
        il0 il0Var = this.a;
        ik9 ik9Var2 = null;
        if (il0Var != null) {
            ik9Var = il0Var.b(aVar.request());
        } else {
            ik9Var = null;
        }
        sl0 b2 = new sl0.b(System.currentTimeMillis(), aVar.request(), ik9Var).b();
        hi9 b3 = b2.b();
        ik9 a2 = b2.a();
        il0 il0Var2 = this.a;
        if (il0Var2 != null) {
            il0Var2.n(b2);
        }
        if (call instanceof t79) {
            t79Var = (t79) call;
        } else {
            t79Var = null;
        }
        if (t79Var == null || (xk3Var = t79Var.n()) == null) {
            xk3Var = xk3.b;
        }
        if (ik9Var != null && a2 == null) {
            zdc.f(ik9Var.b());
        }
        if (b3 == null && a2 == null) {
            ik9 c = new ik9.a().r(aVar.request()).o(vr8.d).e(504).l("Unsatisfiable Request (only-if-cached)").s(-1L).p(System.currentTimeMillis()).c();
            xk3Var.A(call, c);
            return c;
        } else if (b3 == null) {
            z65.e(a2);
            ik9 c2 = a2.u().d(ydc.v(a2)).c();
            xk3Var.b(call, c2);
            return c2;
        } else {
            if (a2 != null) {
                xk3Var.a(call, a2);
            } else if (this.a != null) {
                xk3Var.c(call);
            }
            try {
                ik9 b4 = aVar.b(b3);
                if (b4 == null && ik9Var != null) {
                }
                if (a2 != null) {
                    if (b4 != null && b4.j() == 304) {
                        ik9 c3 = a2.u().j(b.b(a2.q(), b4.q())).s(b4.L()).p(b4.H()).d(ydc.v(a2)).m(ydc.v(b4)).c();
                        b4.b().close();
                        il0 il0Var3 = this.a;
                        z65.e(il0Var3);
                        il0Var3.m();
                        this.a.o(a2, c3);
                        xk3Var.b(call, c3);
                        return c3;
                    }
                    zdc.f(a2.b());
                }
                z65.e(b4);
                ik9.a u = b4.u();
                if (a2 != null) {
                    ik9Var2 = ydc.v(a2);
                }
                ik9 c4 = u.d(ik9Var2).m(ydc.v(b4)).c();
                if (this.a != null) {
                    if (lq4.b(c4) && sl0.c.a(c4, b3)) {
                        ik9 a3 = a(this.a.i(c4), c4);
                        if (a2 != null) {
                            xk3Var.c(call);
                        }
                        return a3;
                    } else if (nq4.a(b3.h())) {
                        try {
                            this.a.j(b3);
                        } catch (IOException unused) {
                        }
                    }
                }
                return c4;
            } finally {
                if (ik9Var != null) {
                    zdc.f(ik9Var.b());
                }
            }
        }
    }
}
