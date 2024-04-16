package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
abstract class g4 {
    abstract int a(int i, byte[] bArr, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int b(String str, byte[] bArr, int i, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String c(byte[] bArr, int i, int i2) throws zzjq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d(byte[] bArr, int i, int i2) {
        if (a(0, bArr, i, i2) != 0) {
            return false;
        }
        return true;
    }
}
