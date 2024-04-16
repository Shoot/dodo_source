package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.yg0;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
/* compiled from: MessageDeflater.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002J\b\u0010\n\u001a\u00020\bH\u0016R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lvh6;", "Ljava/io/Closeable;", "Lyg0;", "Llk0;", "suffix", "", "b", "buffer", "", "a", "close", "Z", "noContextTakeover", "Lyg0;", "deflatedBytes", "Ljava/util/zip/Deflater;", c.a, "Ljava/util/zip/Deflater;", "deflater", "Lut2;", DateTokenConverter.CONVERTER_KEY, "Lut2;", "deflaterSink", "<init>", "(Z)V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: vh6  reason: default package */
/* loaded from: classes3.dex */
public final class vh6 implements Closeable {
    private final boolean a;
    private final yg0 b;
    private final Deflater c;
    private final ut2 d;

    public vh6(boolean z) {
        this.a = z;
        yg0 yg0Var = new yg0();
        this.b = yg0Var;
        Deflater deflater = new Deflater(-1, true);
        this.c = deflater;
        this.d = new ut2((zma) yg0Var, deflater);
    }

    private final boolean b(yg0 yg0Var, lk0 lk0Var) {
        return yg0Var.L1(yg0Var.P() - lk0Var.n0(), lk0Var);
    }

    public final void a(yg0 yg0Var) throws IOException {
        lk0 lk0Var;
        z65.h(yg0Var, "buffer");
        if (this.b.P() == 0) {
            if (this.a) {
                this.c.reset();
            }
            this.d.r1(yg0Var, yg0Var.P());
            this.d.flush();
            yg0 yg0Var2 = this.b;
            lk0Var = wh6.a;
            if (b(yg0Var2, lk0Var)) {
                long P = this.b.P() - 4;
                yg0.a H = yg0.H(this.b, null, 1, null);
                try {
                    H.c(P);
                    aa1.a(H, null);
                } finally {
                }
            } else {
                this.b.V0(0);
            }
            yg0 yg0Var3 = this.b;
            yg0Var.r1(yg0Var3, yg0Var3.P());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.d.close();
    }
}
