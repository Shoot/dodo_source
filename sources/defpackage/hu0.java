package defpackage;

import java.util.Enumeration;
import org.bouncycastle.asn1.a1;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
/* renamed from: hu0  reason: default package */
/* loaded from: classes3.dex */
public class hu0 {
    private p a;
    private p b;
    private String c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public hu0(byte[] bArr) {
        Enumeration G = p.D(bArr).G();
        while (G.hasMoreElements()) {
            h0 h0Var = (h0) G.nextElement();
            if (h0Var instanceof p) {
                this.a = p.D(h0Var);
            } else if (h0Var instanceof s) {
                this.b = p.E((s) h0Var, false);
            } else if (h0Var instanceof a1) {
                this.c = a1.D(h0Var).g();
            }
        }
    }
}
