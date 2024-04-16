package defpackage;

import javax.crypto.spec.IvParameterSpec;
/* renamed from: o  reason: default package */
/* loaded from: classes3.dex */
public class o extends IvParameterSpec {
    private final byte[] a;
    private final int b;

    public o(byte[] bArr, int i) {
        this(bArr, i, null);
    }

    public byte[] a() {
        return tr.h(this.a);
    }

    public int b() {
        return this.b;
    }

    public byte[] c() {
        return getIV();
    }

    public o(byte[] bArr, int i, byte[] bArr2) {
        super(bArr);
        this.b = i;
        this.a = tr.h(bArr2);
    }
}
