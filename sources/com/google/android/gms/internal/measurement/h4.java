package com.google.android.gms.internal.measurement;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
final class h4 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!e(b2) && (((b << 28) + (b2 + 112)) >> 30) == 0 && !e(b3) && !e(b4)) {
            int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
            cArr[i] = (char) ((i2 >>> 10) + 55232);
            cArr[i + 1] = (char) ((i2 & 1023) + 56320);
            return;
        }
        throw zzjq.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void b(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!e(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !e(b3)))) {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
            return;
        }
        throw zzjq.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void c(byte b, byte b2, char[] cArr, int i) {
        if (b >= -62 && !e(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
            return;
        }
        throw zzjq.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void d(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    private static boolean e(byte b) {
        if (b > -65) {
            return true;
        }
        return false;
    }
}
