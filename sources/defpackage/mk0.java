package defpackage;

import java.util.Arrays;
/* compiled from: Bytes.java */
/* renamed from: mk0  reason: default package */
/* loaded from: classes2.dex */
public final class mk0 {
    private final byte[] a;

    private mk0(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.a = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, i2);
    }

    public static mk0 a(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static mk0 b(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            return new mk0(bArr, i, i2);
        }
        throw new NullPointerException("data must be non-null");
    }

    public int c() {
        return this.a.length;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mk0)) {
            return false;
        }
        return Arrays.equals(((mk0) obj).a, this.a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        return "Bytes(" + go4.b(this.a) + ")";
    }
}
