package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
final class g1 extends l1 {
    private final int f;
    private final int g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g1(byte[] bArr, int i, int i2) {
        super(bArr);
        d1.k(i, i + i2, bArr.length);
        this.f = i;
        this.g = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.l1, com.google.android.gms.internal.measurement.d1
    public final byte H(int i) {
        return this.e[this.f + i];
    }

    @Override // com.google.android.gms.internal.measurement.l1, com.google.android.gms.internal.measurement.d1
    public final int P() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.measurement.l1, com.google.android.gms.internal.measurement.d1
    public final byte a(int i) {
        int P = P();
        if (((P - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + P);
        }
        return this.e[this.f + i];
    }

    @Override // com.google.android.gms.internal.measurement.l1
    protected final int h0() {
        return this.f;
    }
}
