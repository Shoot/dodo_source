package defpackage;

import java.security.spec.AlgorithmParameterSpec;
/* renamed from: pr4  reason: default package */
/* loaded from: classes3.dex */
public class pr4 implements AlgorithmParameterSpec {
    private byte[] a;
    private byte[] b;
    private int c;
    private int d;
    private byte[] e;
    private boolean f;

    public pr4(byte[] bArr, byte[] bArr2, int i) {
        this(bArr, bArr2, i, -1, null, false);
    }

    public int a() {
        return this.d;
    }

    public byte[] b() {
        return tr.h(this.a);
    }

    public byte[] c() {
        return tr.h(this.b);
    }

    public int d() {
        return this.c;
    }

    public byte[] e() {
        return tr.h(this.e);
    }

    public boolean f() {
        return this.f;
    }

    public pr4(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3) {
        this(bArr, bArr2, i, i2, bArr3, false);
    }

    public pr4(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, boolean z) {
        if (bArr != null) {
            byte[] bArr4 = new byte[bArr.length];
            this.a = bArr4;
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        } else {
            this.a = null;
        }
        if (bArr2 != null) {
            byte[] bArr5 = new byte[bArr2.length];
            this.b = bArr5;
            System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        } else {
            this.b = null;
        }
        this.c = i;
        this.d = i2;
        this.e = tr.h(bArr3);
        this.f = z;
    }
}
