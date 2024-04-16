package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;
/* renamed from: obc  reason: default package */
/* loaded from: classes3.dex */
public class obc extends i0 {
    private final int a;
    private final int b;
    private final byte[] c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;
    private final int g;
    private final byte[] h;

    public obc(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = 0;
        this.b = i;
        this.c = tr.h(bArr);
        this.d = tr.h(bArr2);
        this.e = tr.h(bArr3);
        this.f = tr.h(bArr4);
        this.h = tr.h(bArr5);
        this.g = -1;
    }

    public static obc v(Object obj) {
        if (obj instanceof obc) {
            return (obc) obj;
        }
        if (obj != null) {
            return new obc(p.D(obj));
        }
        return null;
    }

    public byte[] A() {
        return tr.h(this.d);
    }

    public byte[] B() {
        return tr.h(this.c);
    }

    public int C() {
        return this.a;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        i iVar;
        d dVar = new d();
        if (this.g >= 0) {
            iVar = new i(1L);
        } else {
            iVar = new i(0L);
        }
        dVar.a(iVar);
        d dVar2 = new d();
        dVar2.a(new i(this.b));
        dVar2.a(new s0(this.c));
        dVar2.a(new s0(this.d));
        dVar2.a(new s0(this.e));
        dVar2.a(new s0(this.f));
        int i = this.g;
        if (i >= 0) {
            dVar2.a(new z0(false, 0, new i(i)));
        }
        dVar.a(new w0(dVar2));
        dVar.a(new z0(true, 0, new s0(this.h)));
        return new w0(dVar);
    }

    public byte[] t() {
        return tr.h(this.h);
    }

    public int u() {
        return this.b;
    }

    public int w() {
        return this.g;
    }

    public byte[] x() {
        return tr.h(this.e);
    }

    public byte[] z() {
        return tr.h(this.f);
    }

    public obc(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i2) {
        this.a = 1;
        this.b = i;
        this.c = tr.h(bArr);
        this.d = tr.h(bArr2);
        this.e = tr.h(bArr3);
        this.f = tr.h(bArr4);
        this.h = tr.h(bArr5);
        this.g = i2;
    }

    private obc(p pVar) {
        int i;
        i D = i.D(pVar.F(0));
        if (!D.H(0) && !D.H(1)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.a = D.P();
        if (pVar.size() != 2 && pVar.size() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        p D2 = p.D(pVar.F(1));
        this.b = i.D(D2.F(0)).P();
        this.c = tr.h(l.D(D2.F(1)).F());
        this.d = tr.h(l.D(D2.F(2)).F());
        this.e = tr.h(l.D(D2.F(3)).F());
        this.f = tr.h(l.D(D2.F(4)).F());
        if (D2.size() == 6) {
            s D3 = s.D(D2.F(5));
            if (D3.G() != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            i = i.E(D3, false).P();
        } else if (D2.size() != 5) {
            throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
        } else {
            i = -1;
        }
        this.g = i;
        if (pVar.size() == 3) {
            this.h = tr.h(l.E(s.D(pVar.F(2)), true).F());
        } else {
            this.h = null;
        }
    }
}
