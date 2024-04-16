package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.yg0;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
/* compiled from: WebSocketWriter.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u0011\u0012\u0006\u0010 \u001a\u00020\u0011\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b8\u00109J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0016\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012R\u0014\u0010 \u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0016\u0010+\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0004\u0018\u0001048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u0006:"}, d2 = {"Lx3c;", "Ljava/io/Closeable;", "", "opcode", "Llk0;", "payload", "", "b", e.a, "i", "code", "reason", "a", "formatOpcode", "data", c.a, "close", "", "Z", "isClient", "Leh0;", "Leh0;", "getSink", "()Leh0;", "sink", "Ljava/util/Random;", "Ljava/util/Random;", "getRandom", "()Ljava/util/Random;", "random", DateTokenConverter.CONVERTER_KEY, "perMessageDeflate", "noContextTakeover", "", "f", "J", "minimumDeflateSize", "Lyg0;", "g", "Lyg0;", "messageBuffer", Image.TYPE_HIGH, "sinkBuffer", "writerClosed", "Lvh6;", "j", "Lvh6;", "messageDeflater", "", "k", "[B", "maskKey", "Lyg0$a;", "l", "Lyg0$a;", "maskCursor", "<init>", "(ZLeh0;Ljava/util/Random;ZZJ)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: x3c  reason: default package */
/* loaded from: classes3.dex */
public final class x3c implements Closeable {
    private final boolean a;
    private final eh0 b;
    private final Random c;
    private final boolean d;
    private final boolean e;
    private final long f;
    private final yg0 g;
    private final yg0 h;
    private boolean i;
    private vh6 j;
    private final byte[] k;
    private final yg0.a l;

    public x3c(boolean z, eh0 eh0Var, Random random, boolean z2, boolean z3, long j) {
        byte[] bArr;
        z65.h(eh0Var, "sink");
        z65.h(random, "random");
        this.a = z;
        this.b = eh0Var;
        this.c = random;
        this.d = z2;
        this.e = z3;
        this.f = j;
        this.g = new yg0();
        this.h = eh0Var.d();
        if (z) {
            bArr = new byte[4];
        } else {
            bArr = null;
        }
        this.k = bArr;
        this.l = z ? new yg0.a() : null;
    }

    private final void b(int i, lk0 lk0Var) throws IOException {
        if (!this.i) {
            int n0 = lk0Var.n0();
            if (n0 <= 125) {
                this.h.V0(i | 128);
                if (this.a) {
                    this.h.V0(n0 | 128);
                    Random random = this.c;
                    byte[] bArr = this.k;
                    z65.e(bArr);
                    random.nextBytes(bArr);
                    this.h.v0(this.k);
                    if (n0 > 0) {
                        long P = this.h.P();
                        this.h.d0(lk0Var);
                        yg0 yg0Var = this.h;
                        yg0.a aVar = this.l;
                        z65.e(aVar);
                        yg0Var.y(aVar);
                        this.l.e(P);
                        v3c.a.b(this.l, this.k);
                        this.l.close();
                    }
                } else {
                    this.h.V0(n0);
                    this.h.d0(lk0Var);
                }
                this.b.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        throw new IOException("closed");
    }

    public final void a(int i, lk0 lk0Var) throws IOException {
        lk0 lk0Var2 = lk0.e;
        if (i != 0 || lk0Var != null) {
            if (i != 0) {
                v3c.a.c(i);
            }
            yg0 yg0Var = new yg0();
            yg0Var.P0(i);
            if (lk0Var != null) {
                yg0Var.d0(lk0Var);
            }
            lk0Var2 = yg0Var.v1();
        }
        try {
            b(8, lk0Var2);
        } finally {
            this.i = true;
        }
    }

    public final void c(int i, lk0 lk0Var) throws IOException {
        int i2;
        z65.h(lk0Var, "data");
        if (!this.i) {
            this.g.d0(lk0Var);
            int i3 = i | 128;
            if (this.d && lk0Var.n0() >= this.f) {
                vh6 vh6Var = this.j;
                if (vh6Var == null) {
                    vh6Var = new vh6(this.e);
                    this.j = vh6Var;
                }
                vh6Var.a(this.g);
                i3 = i | 192;
            }
            long P = this.g.P();
            this.h.V0(i3);
            if (this.a) {
                i2 = 128;
            } else {
                i2 = 0;
            }
            if (P <= 125) {
                this.h.V0(i2 | ((int) P));
            } else if (P <= 65535) {
                this.h.V0(i2 | 126);
                this.h.P0((int) P);
            } else {
                this.h.V0(i2 | 127);
                this.h.x0(P);
            }
            if (this.a) {
                Random random = this.c;
                byte[] bArr = this.k;
                z65.e(bArr);
                random.nextBytes(bArr);
                this.h.v0(this.k);
                if (P > 0) {
                    yg0 yg0Var = this.g;
                    yg0.a aVar = this.l;
                    z65.e(aVar);
                    yg0Var.y(aVar);
                    this.l.e(0L);
                    v3c.a.b(this.l, this.k);
                    this.l.close();
                }
            }
            this.h.r1(this.g, P);
            this.b.F();
            return;
        }
        throw new IOException("closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        vh6 vh6Var = this.j;
        if (vh6Var != null) {
            vh6Var.close();
        }
    }

    public final void e(lk0 lk0Var) throws IOException {
        z65.h(lk0Var, "payload");
        b(9, lk0Var);
    }

    public final void i(lk0 lk0Var) throws IOException {
        z65.h(lk0Var, "payload");
        b(10, lk0Var);
    }
}
