package defpackage;

import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.s0;
/* renamed from: kac  reason: default package */
/* loaded from: classes3.dex */
public class kac extends i0 {
    private final l a;
    private ea3 b;
    private jb3 c;

    public kac(ea3 ea3Var, l lVar) {
        this(ea3Var, lVar.F());
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        return this.a;
    }

    public synchronized jb3 t() {
        try {
            if (this.c == null) {
                this.c = this.b.j(this.a.F()).A();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public kac(ea3 ea3Var, byte[] bArr) {
        this.b = ea3Var;
        this.a = new s0(tr.h(bArr));
    }

    public kac(jb3 jb3Var, boolean z) {
        this.c = jb3Var.A();
        this.a = new s0(jb3Var.l(z));
    }
}
