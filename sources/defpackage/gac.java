package defpackage;

import org.bouncycastle.asn1.j;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
/* renamed from: gac  reason: default package */
/* loaded from: classes3.dex */
public class gac extends i0 implements f0 {
    private n a;

    public gac(iac iacVar) {
        this.a = null;
        this.a = iacVar.f();
    }

    public static gac t(Object obj) {
        if (obj != null && !(obj instanceof gac)) {
            if (obj instanceof n) {
                return new gac((n) obj);
            }
            if (obj instanceof byte[]) {
                try {
                    return new gac(n.z((byte[]) obj));
                } catch (Exception e) {
                    throw new IllegalArgumentException("unable to parse encoded data: " + e.getMessage());
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
        return (gac) obj;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        return this.a;
    }

    public n u() {
        return this.a;
    }

    public boolean v() {
        return this.a instanceof j;
    }

    public boolean w() {
        return this.a instanceof k;
    }

    public gac(j jVar) {
        this.a = jVar;
    }

    public gac(k kVar) {
        this.a = kVar;
    }

    private gac(n nVar) {
        this.a = nVar;
    }
}
