package defpackage;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: CLSUUID.java */
/* renamed from: al0  reason: default package */
/* loaded from: classes2.dex */
class al0 {
    private static final AtomicLong a = new AtomicLong(0);
    private static String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public al0(gt4 gt4Var) {
        byte[] bArr = new byte[10];
        e(bArr);
        d(bArr);
        c(bArr);
        String z = ek1.z(gt4Var.a().c());
        String t = ek1.t(bArr);
        Locale locale = Locale.US;
        b = String.format(locale, "%s%s%s%s", t.substring(0, 12), t.substring(12, 16), t.subSequence(16, 20), z.substring(0, 12)).toUpperCase(locale);
    }

    private static byte[] a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    private static byte[] b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    private void c(byte[] bArr) {
        byte[] b2 = b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b2[0];
        bArr[9] = b2[1];
    }

    private void d(byte[] bArr) {
        byte[] b2 = b(a.incrementAndGet());
        bArr[6] = b2[0];
        bArr[7] = b2[1];
    }

    private void e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] a2 = a(time / 1000);
        bArr[0] = a2[0];
        bArr[1] = a2[1];
        bArr[2] = a2[2];
        bArr[3] = a2[3];
        byte[] b2 = b(time % 1000);
        bArr[4] = b2[0];
        bArr[5] = b2[1];
    }

    public String toString() {
        return b;
    }
}
