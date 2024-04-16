package defpackage;

import java.io.ByteArrayOutputStream;
/* renamed from: rn1  reason: default package */
/* loaded from: classes3.dex */
public class rn1 {
    private final ByteArrayOutputStream a = new ByteArrayOutputStream();

    private rn1() {
    }

    public static rn1 f() {
        return new rn1();
    }

    public rn1 a(boolean z) {
        this.a.write(z ? 1 : 0);
        return this;
    }

    public byte[] b() {
        return this.a.toByteArray();
    }

    public rn1 c(wg3 wg3Var) {
        try {
            this.a.write(wg3Var.getEncoded());
            return this;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public rn1 d(byte[] bArr) {
        try {
            this.a.write(bArr);
            return this;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public rn1 e(byte[][] bArr) {
        try {
            for (byte[] bArr2 : bArr) {
                this.a.write(bArr2);
            }
            return this;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public rn1 g(int i, int i2) {
        while (this.a.size() < i2) {
            this.a.write(i);
        }
        return this;
    }

    public rn1 h(int i) {
        int i2 = i & 65535;
        this.a.write((byte) (i2 >>> 8));
        this.a.write((byte) i2);
        return this;
    }

    public rn1 i(int i) {
        this.a.write((byte) (i >>> 24));
        this.a.write((byte) (i >>> 16));
        this.a.write((byte) (i >>> 8));
        this.a.write((byte) i);
        return this;
    }

    public rn1 j(long j) {
        i((int) (j >>> 32));
        i((int) j);
        return this;
    }
}
