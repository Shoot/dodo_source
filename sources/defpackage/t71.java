package defpackage;

import java.security.SecureRandom;
/* renamed from: t71  reason: default package */
/* loaded from: classes3.dex */
public class t71 {
    protected SecureRandom a;
    protected int b;

    public byte[] a() {
        byte[] bArr = new byte[this.b];
        this.a.nextBytes(bArr);
        return bArr;
    }

    public void b(ff5 ff5Var) {
        this.a = ff5Var.a();
        this.b = (ff5Var.b() + 7) / 8;
    }
}
