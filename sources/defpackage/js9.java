package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
/* renamed from: js9  reason: default package */
/* loaded from: classes3.dex */
class js9 {
    private final ByteArrayOutputStream a = new ByteArrayOutputStream();

    public byte[] a() {
        return this.a.toByteArray();
    }

    public byte[] b() {
        return c(8);
    }

    public byte[] c(int i) {
        int size = this.a.size() % i;
        if (size != 0) {
            int i2 = i - size;
            for (int i3 = 1; i3 <= i2; i3++) {
                this.a.write(i3);
            }
        }
        return this.a.toByteArray();
    }

    public void d(int i) {
        this.a.write((i >>> 24) & 255);
        this.a.write((i >>> 16) & 255);
        this.a.write((i >>> 8) & 255);
        this.a.write(i & 255);
    }

    public void e(BigInteger bigInteger) {
        f(bigInteger.toByteArray());
    }

    public void f(byte[] bArr) {
        d(bArr.length);
        try {
            this.a.write(bArr);
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    public void g(byte[] bArr) {
        try {
            this.a.write(bArr);
        } catch (IOException e) {
            throw new IllegalStateException(e.getMessage(), e);
        }
    }

    public void h(String str) {
        f(a0b.e(str));
    }
}
