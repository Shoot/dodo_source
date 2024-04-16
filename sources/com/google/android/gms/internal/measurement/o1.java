package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public final class o1 extends p1 {
    private final byte[] e;
    private final boolean f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    private final void f() {
        int i = this.g + this.h;
        this.g = i;
        int i2 = i - this.j;
        int i3 = this.k;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.h = i4;
            this.g = i - i4;
            return;
        }
        this.h = 0;
    }

    @Override // com.google.android.gms.internal.measurement.p1
    public final int a(int i) throws zzjq {
        if (i >= 0) {
            int d = i + d();
            if (d >= 0) {
                int i2 = this.k;
                if (d <= i2) {
                    this.k = d;
                    f();
                    return i2;
                }
                throw zzjq.f();
            }
            throw zzjq.e();
        }
        throw zzjq.d();
    }

    @Override // com.google.android.gms.internal.measurement.p1
    public final int d() {
        return this.i - this.j;
    }

    private o1(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.k = Integer.MAX_VALUE;
        this.e = bArr;
        this.g = i2 + i;
        this.i = i;
        this.j = i;
        this.f = z;
    }
}
