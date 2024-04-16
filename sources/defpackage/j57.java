package defpackage;

import java.io.IOException;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.z0;
/* renamed from: j57  reason: default package */
/* loaded from: classes3.dex */
public class j57 extends i0 implements f0 {
    private final int a;
    private final i0 b;

    private j57(h0 h0Var) {
        i0 t;
        if ((h0Var instanceof p) || (h0Var instanceof ix7)) {
            this.a = 0;
            t = ix7.t(h0Var);
        } else if (!(h0Var instanceof s)) {
            throw new IllegalArgumentException("Unknown check object in integrity check.");
        } else {
            this.a = 1;
            t = kka.u(((s) h0Var).F());
        }
        this.b = t;
    }

    public static j57 t(Object obj) {
        if (obj instanceof j57) {
            return (j57) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return new j57(n.z((byte[]) obj));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Unable to parse integrity check details.");
            }
        } else if (obj != null) {
            return new j57((h0) obj);
        } else {
            return null;
        }
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        i0 i0Var = this.b;
        if (i0Var instanceof kka) {
            return new z0(0, i0Var);
        }
        return i0Var.f();
    }

    public i0 u() {
        return this.b;
    }

    public int v() {
        return this.a;
    }

    public j57(ix7 ix7Var) {
        this((h0) ix7Var);
    }

    public j57(kka kkaVar) {
        this(new z0(0, kkaVar));
    }
}
