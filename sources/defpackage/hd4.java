package defpackage;

import defpackage.ua5;
import java.io.IOException;
import java.math.BigDecimal;
/* compiled from: GeneratorBase.java */
/* renamed from: hd4  reason: default package */
/* loaded from: classes2.dex */
public abstract class hd4 extends ua5 {
    protected static final int j = (ua5.b.WRITE_NUMBERS_AS_STRINGS.o() | ua5.b.ESCAPE_NON_ASCII.o()) | ua5.b.STRICT_DUPLICATE_DETECTION.o();
    protected q47 e;
    protected int f;
    protected boolean g;
    protected cd5 h;
    protected boolean i;

    /* JADX INFO: Access modifiers changed from: protected */
    public hd4(int i, q47 q47Var) {
        i93 i93Var;
        this.f = i;
        this.e = q47Var;
        if (ua5.b.STRICT_DUPLICATE_DETECTION.k(i)) {
            i93Var = i93.e(this);
        } else {
            i93Var = null;
        }
        this.h = cd5.p(i93Var);
        this.g = ua5.b.WRITE_NUMBERS_AS_STRINGS.k(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String A1(BigDecimal bigDecimal) throws IOException {
        if (ua5.b.WRITE_BIGDECIMAL_AS_PLAIN.k(this.f)) {
            int scale = bigDecimal.scale();
            if (scale < -9999 || scale > 9999) {
                a(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(scale), 9999, 9999));
            }
            return bigDecimal.toPlainString();
        }
        return bigDecimal.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void D1(int i, int i2) {
        if ((j & i2) == 0) {
            return;
        }
        this.g = ua5.b.WRITE_NUMBERS_AS_STRINGS.k(i);
        ua5.b bVar = ua5.b.ESCAPE_NON_ASCII;
        if (bVar.k(i2)) {
            if (bVar.k(i)) {
                y(127);
            } else {
                y(0);
            }
        }
        ua5.b bVar2 = ua5.b.STRICT_DUPLICATE_DETECTION;
        if (bVar2.k(i2)) {
            if (bVar2.k(i)) {
                if (this.h.q() == null) {
                    this.h = this.h.u(i93.e(this));
                    return;
                }
                return;
            }
            this.h = this.h.u(null);
        }
    }

    protected abstract void E1(String str) throws IOException;

    @Override // defpackage.ua5
    public void Q0(mca mcaVar) throws IOException {
        E1("write raw value");
        M0(mcaVar);
    }

    @Override // defpackage.ua5
    public void S0(String str) throws IOException {
        E1("write raw value");
        N0(str);
    }

    @Override // defpackage.ua5, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.i = true;
    }

    @Override // defpackage.ua5
    public ua5 l(ua5.b bVar) {
        int o = bVar.o();
        this.f &= ~o;
        if ((o & j) != 0) {
            if (bVar == ua5.b.WRITE_NUMBERS_AS_STRINGS) {
                this.g = false;
            } else if (bVar == ua5.b.ESCAPE_NON_ASCII) {
                y(0);
            } else if (bVar == ua5.b.STRICT_DUPLICATE_DETECTION) {
                this.h = this.h.u(null);
            }
        }
        return this;
    }

    @Override // defpackage.ua5
    public int m() {
        return this.f;
    }

    @Override // defpackage.ua5
    public jc5 n() {
        return this.h;
    }

    @Override // defpackage.ua5
    public final boolean q(ua5.b bVar) {
        if ((bVar.o() & this.f) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ua5
    public ua5 s(int i, int i2) {
        int i3 = this.f;
        int i4 = (i & i2) | ((~i2) & i3);
        int i5 = i3 ^ i4;
        if (i5 != 0) {
            this.f = i4;
            D1(i4, i5);
        }
        return this;
    }

    @Override // defpackage.ua5
    public void u(Object obj) {
        cd5 cd5Var = this.h;
        if (cd5Var != null) {
            cd5Var.h(obj);
        }
    }

    @Override // defpackage.ua5
    @Deprecated
    public ua5 x(int i) {
        int i2 = this.f ^ i;
        this.f = i;
        if (i2 != 0) {
            D1(i, i2);
        }
        return this;
    }
}
