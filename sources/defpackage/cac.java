package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.n;
/* renamed from: cac  reason: default package */
/* loaded from: classes3.dex */
public class cac {
    private final x9c a;
    private final hu0 b;

    public cac(byte[] bArr) throws IOException {
        h hVar = new h(bArr);
        this.a = new x9c(hVar.l().getEncoded());
        n l = hVar.l();
        if (l != null) {
            this.b = new hu0(l.getEncoded());
        } else {
            this.b = null;
        }
    }
}
