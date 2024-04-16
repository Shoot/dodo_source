package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k65;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
/* compiled from: RealInterceptorChain.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0012\u001a\u00020\u0015\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+JM\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\u0012\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010&R\u001a\u0010\t\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b'\u0010&R\u001a\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b(\u0010&R\u0016\u0010)\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u001d¨\u0006,"}, d2 = {"Lw79;", "Lk65$a;", "", "index", "Lwl3;", "exchange", "Lhi9;", "request", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", e.a, "(ILwl3;Lhi9;III)Lw79;", "Loq1;", c.a, DateTokenConverter.CONVERTER_KEY, "a", "Lcm0;", "call", "Lik9;", "b", "Lt79;", "Lt79;", "g", "()Lt79;", "", "Lk65;", "Ljava/util/List;", "interceptors", "I", "Lwl3;", Image.TYPE_HIGH, "()Lwl3;", "Lhi9;", "j", "()Lhi9;", "f", "getConnectTimeoutMillis$okhttp", "()I", "i", "k", "calls", "<init>", "(Lt79;Ljava/util/List;ILwl3;Lhi9;III)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: w79  reason: default package */
/* loaded from: classes3.dex */
public final class w79 implements k65.a {
    private final t79 a;
    private final List<k65> b;
    private final int c;
    private final wl3 d;
    private final hi9 e;
    private final int f;
    private final int g;
    private final int h;
    private int i;

    /* JADX WARN: Multi-variable type inference failed */
    public w79(t79 t79Var, List<? extends k65> list, int i, wl3 wl3Var, hi9 hi9Var, int i2, int i3, int i4) {
        z65.h(t79Var, "call");
        z65.h(list, "interceptors");
        z65.h(hi9Var, "request");
        this.a = t79Var;
        this.b = list;
        this.c = i;
        this.d = wl3Var;
        this.e = hi9Var;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public static /* synthetic */ w79 f(w79 w79Var, int i, wl3 wl3Var, hi9 hi9Var, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = w79Var.c;
        }
        if ((i5 & 2) != 0) {
            wl3Var = w79Var.d;
        }
        wl3 wl3Var2 = wl3Var;
        if ((i5 & 4) != 0) {
            hi9Var = w79Var.e;
        }
        hi9 hi9Var2 = hi9Var;
        if ((i5 & 8) != 0) {
            i2 = w79Var.f;
        }
        int i6 = i2;
        if ((i5 & 16) != 0) {
            i3 = w79Var.g;
        }
        int i7 = i3;
        if ((i5 & 32) != 0) {
            i4 = w79Var.h;
        }
        return w79Var.e(i, wl3Var2, hi9Var2, i6, i7, i4);
    }

    @Override // defpackage.k65.a
    public int a() {
        return this.g;
    }

    @Override // defpackage.k65.a
    public ik9 b(hi9 hi9Var) throws IOException {
        z65.h(hi9Var, "request");
        if (this.c < this.b.size()) {
            this.i++;
            wl3 wl3Var = this.d;
            if (wl3Var != null) {
                if (wl3Var.j().b().e(hi9Var.l())) {
                    if (this.i != 1) {
                        throw new IllegalStateException(("network interceptor " + this.b.get(this.c - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + this.b.get(this.c - 1) + " must retain the same host and port").toString());
                }
            }
            w79 f = f(this, this.c + 1, null, hi9Var, 0, 0, 0, 58, null);
            k65 k65Var = this.b.get(this.c);
            ik9 intercept = k65Var.intercept(f);
            if (intercept != null) {
                if (this.d != null && this.c + 1 < this.b.size() && f.i != 1) {
                    throw new IllegalStateException(("network interceptor " + k65Var + " must call proceed() exactly once").toString());
                }
                return intercept;
            }
            throw new NullPointerException("interceptor " + k65Var + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // defpackage.k65.a
    public oq1 c() {
        wl3 wl3Var = this.d;
        if (wl3Var != null) {
            return wl3Var.h();
        }
        return null;
    }

    @Override // defpackage.k65.a
    public cm0 call() {
        return this.a;
    }

    @Override // defpackage.k65.a
    public int d() {
        return this.f;
    }

    public final w79 e(int i, wl3 wl3Var, hi9 hi9Var, int i2, int i3, int i4) {
        z65.h(hi9Var, "request");
        return new w79(this.a, this.b, i, wl3Var, hi9Var, i2, i3, i4);
    }

    public final t79 g() {
        return this.a;
    }

    public final wl3 h() {
        return this.d;
    }

    public final int i() {
        return this.g;
    }

    public final hi9 j() {
        return this.e;
    }

    public final int k() {
        return this.h;
    }

    @Override // defpackage.k65.a
    public hi9 request() {
        return this.e;
    }
}
