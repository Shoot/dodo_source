package defpackage;

import java.io.Serializable;
/* renamed from: kbc  reason: default package */
/* loaded from: classes3.dex */
public final class kbc implements Serializable {
    private final int a;
    private final byte[] b;

    /* JADX INFO: Access modifiers changed from: protected */
    public kbc(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    public int a() {
        return this.a;
    }

    public byte[] b() {
        return sbc.c(this.b);
    }
}
