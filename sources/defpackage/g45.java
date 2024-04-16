package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* compiled from: InsecureNonceChaCha20Base.java */
/* renamed from: g45  reason: default package */
/* loaded from: classes2.dex */
abstract class g45 {
    int[] a;
    private final int b;

    public g45(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.a = qu0.e(bArr);
            this.b = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    private void f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length == e()) {
            int remaining = byteBuffer2.remaining();
            int i = remaining / 64;
            int i2 = i + 1;
            for (int i3 = 0; i3 < i2; i3++) {
                ByteBuffer a = a(bArr, this.b + i3);
                if (i3 == i) {
                    nk0.c(byteBuffer, byteBuffer2, a, remaining % 64);
                } else {
                    nk0.c(byteBuffer, byteBuffer2, a, 64);
                }
            }
            return;
        }
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteBuffer a(byte[] bArr, int i) {
        int[] b = b(qu0.e(bArr), i);
        int[] iArr = (int[]) b.clone();
        qu0.d(iArr);
        for (int i2 = 0; i2 < b.length; i2++) {
            b[i2] = b[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b, 0, 16);
        return order;
    }

    abstract int[] b(int[] iArr, int i);

    public byte[] c(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        f(bArr, allocate, byteBuffer);
        return allocate.array();
    }

    public void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length) {
            f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    abstract int e();
}
