package defpackage;

import org.bouncycastle.asn1.j0;
/* renamed from: qv6  reason: default package */
/* loaded from: classes3.dex */
public class qv6 extends j0 {
    public qv6(j0 j0Var) {
        super(j0Var.E(), j0Var.G());
    }

    @Override // org.bouncycastle.asn1.b
    public String toString() {
        return "NetscapeCertType: 0x" + Integer.toHexString(this.a[0] & 255);
    }
}
