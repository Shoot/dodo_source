package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public final class k1 {
    private final zzio a;
    private final byte[] b;

    public final d1 a() {
        this.a.I();
        return new l1(this.b);
    }

    public final zzio b() {
        return this.a;
    }

    private k1(int i) {
        byte[] bArr = new byte[i];
        this.b = bArr;
        this.a = zzio.H(bArr);
    }
}
