package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: ibc  reason: default package */
/* loaded from: classes3.dex */
public class ibc extends i0 {
    private final byte[] a;
    private final byte[] b;

    public ibc(byte[] bArr, byte[] bArr2) {
        this.a = tr.h(bArr);
        this.b = tr.h(bArr2);
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d();
        dVar.a(new i(0L));
        dVar.a(new s0(this.a));
        dVar.a(new s0(this.b));
        return new w0(dVar);
    }
}
