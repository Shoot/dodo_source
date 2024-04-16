package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;
import org.bouncycastle.asn1.e;
import org.bouncycastle.asn1.n;
/* renamed from: fl0  reason: default package */
/* loaded from: classes3.dex */
public class fl0 extends i0 {
    private static final String[] b = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
    private static final Hashtable c = new Hashtable();
    private e a;

    private fl0(int i) {
        if (i >= 0) {
            this.a = new e(i);
            return;
        }
        throw new IllegalArgumentException("Invalid CRL reason : not in (0..MAX)");
    }

    public static fl0 t(Object obj) {
        if (obj instanceof fl0) {
            return (fl0) obj;
        }
        if (obj != null) {
            return v(e.E(obj).G());
        }
        return null;
    }

    public static fl0 v(int i) {
        Integer d = g65.d(i);
        Hashtable hashtable = c;
        if (!hashtable.containsKey(d)) {
            hashtable.put(d, new fl0(i));
        }
        return (fl0) hashtable.get(d);
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        return this.a;
    }

    public String toString() {
        String str;
        int intValue = u().intValue();
        if (intValue >= 0 && intValue <= 10) {
            str = b[intValue];
        } else {
            str = "invalid";
        }
        return "CRLReason: " + str;
    }

    public BigInteger u() {
        return this.a.F();
    }
}
