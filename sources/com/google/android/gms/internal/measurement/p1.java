package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
public abstract class p1 {
    private static volatile int d = 100;
    int a;
    private int b;
    private boolean c;

    public static long b(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p1 c(byte[] bArr, int i, int i2, boolean z) {
        o1 o1Var = new o1(bArr, i2);
        try {
            o1Var.a(i2);
            return o1Var;
        } catch (zzjq e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract int a(int i) throws zzjq;

    public abstract int d();

    private p1() {
        this.a = d;
        this.b = Integer.MAX_VALUE;
        this.c = false;
    }
}
