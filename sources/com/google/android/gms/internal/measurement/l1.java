package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.charset.Charset;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public class l1 extends m1 {
    protected final byte[] e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l1(byte[] bArr) {
        bArr.getClass();
        this.e = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.d1
    protected final String E(Charset charset) {
        return new String(this.e, h0(), P(), charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.d1
    public final void G(o0d o0dVar) throws IOException {
        o0dVar.a(this.e, h0(), P());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.d1
    public byte H(int i) {
        return this.e[i];
    }

    @Override // com.google.android.gms.internal.measurement.d1
    public int P() {
        return this.e.length;
    }

    @Override // com.google.android.gms.internal.measurement.d1
    protected final int Q(int i, int i2, int i3) {
        return d2.a(i, this.e, h0(), i3);
    }

    @Override // com.google.android.gms.internal.measurement.d1
    public final boolean Z() {
        int h0 = h0();
        return f4.f(this.e, h0, P() + h0);
    }

    @Override // com.google.android.gms.internal.measurement.d1
    public byte a(int i) {
        return this.e[i];
    }

    @Override // com.google.android.gms.internal.measurement.m1
    final boolean e0(d1 d1Var, int i, int i2) {
        if (i2 <= d1Var.P()) {
            if (i2 <= d1Var.P()) {
                if (d1Var instanceof l1) {
                    l1 l1Var = (l1) d1Var;
                    byte[] bArr = this.e;
                    byte[] bArr2 = l1Var.e;
                    int h0 = h0() + i2;
                    int h02 = h0();
                    int h03 = l1Var.h0();
                    while (h02 < h0) {
                        if (bArr[h02] != bArr2[h03]) {
                            return false;
                        }
                        h02++;
                        h03++;
                    }
                    return true;
                }
                return d1Var.u(0, i2).equals(u(0, i2));
            }
            int P = d1Var.P();
            throw new IllegalArgumentException("Ran off end of other: 0, " + i2 + ", " + P);
        }
        int P2 = P();
        throw new IllegalArgumentException("Length too large: " + i2 + P2);
    }

    @Override // com.google.android.gms.internal.measurement.d1
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d1) || P() != ((d1) obj).P()) {
            return false;
        }
        if (P() == 0) {
            return true;
        }
        if (obj instanceof l1) {
            l1 l1Var = (l1) obj;
            int d = d();
            int d2 = l1Var.d();
            if (d != 0 && d2 != 0 && d != d2) {
                return false;
            }
            return e0(l1Var, 0, P());
        }
        return obj.equals(this);
    }

    protected int h0() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.d1
    public final d1 u(int i, int i2) {
        int k = d1.k(0, i2, P());
        if (k == 0) {
            return d1.b;
        }
        return new g1(this.e, h0(), k);
    }
}
