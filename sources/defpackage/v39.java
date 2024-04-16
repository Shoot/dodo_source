package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
/* renamed from: v39  reason: default package */
/* loaded from: classes3.dex */
public class v39 extends i0 {
    private i a;
    private k b;
    private byte[][] c;
    private byte[] d;
    private byte[][] e;
    private byte[] f;
    private byte[] g;
    private fm5[] h;

    private v39(p pVar) {
        int i = 0;
        if (pVar.F(0) instanceof i) {
            this.a = i.D(pVar.F(0));
        } else {
            this.b = k.I(pVar.F(0));
        }
        p pVar2 = (p) pVar.F(1);
        this.c = new byte[pVar2.size()];
        for (int i2 = 0; i2 < pVar2.size(); i2++) {
            this.c[i2] = ((l) pVar2.F(i2)).F();
        }
        this.d = ((l) ((p) pVar.F(2)).F(0)).F();
        p pVar3 = (p) pVar.F(3);
        this.e = new byte[pVar3.size()];
        for (int i3 = 0; i3 < pVar3.size(); i3++) {
            this.e[i3] = ((l) pVar3.F(i3)).F();
        }
        this.f = ((l) ((p) pVar.F(4)).F(0)).F();
        this.g = ((l) ((p) pVar.F(5)).F(0)).F();
        p pVar4 = (p) pVar.F(6);
        byte[][][][] bArr = new byte[pVar4.size()][][];
        byte[][][][] bArr2 = new byte[pVar4.size()][][];
        byte[][][] bArr3 = new byte[pVar4.size()][];
        byte[][] bArr4 = new byte[pVar4.size()];
        int i4 = 0;
        while (i4 < pVar4.size()) {
            p pVar5 = (p) pVar4.F(i4);
            p pVar6 = (p) pVar5.F(i);
            bArr[i4] = new byte[pVar6.size()][];
            for (int i5 = 0; i5 < pVar6.size(); i5++) {
                p pVar7 = (p) pVar6.F(i5);
                bArr[i4][i5] = new byte[pVar7.size()];
                for (int i6 = 0; i6 < pVar7.size(); i6++) {
                    bArr[i4][i5][i6] = ((l) pVar7.F(i6)).F();
                }
            }
            p pVar8 = (p) pVar5.F(1);
            bArr2[i4] = new byte[pVar8.size()][];
            for (int i7 = 0; i7 < pVar8.size(); i7++) {
                p pVar9 = (p) pVar8.F(i7);
                bArr2[i4][i7] = new byte[pVar9.size()];
                for (int i8 = 0; i8 < pVar9.size(); i8++) {
                    bArr2[i4][i7][i8] = ((l) pVar9.F(i8)).F();
                }
            }
            p pVar10 = (p) pVar5.F(2);
            bArr3[i4] = new byte[pVar10.size()];
            for (int i9 = 0; i9 < pVar10.size(); i9++) {
                bArr3[i4][i9] = ((l) pVar10.F(i9)).F();
            }
            bArr4[i4] = ((l) pVar5.F(3)).F();
            i4++;
            i = 0;
        }
        int length = this.g.length - 1;
        this.h = new fm5[length];
        int i10 = 0;
        while (i10 < length) {
            byte[] bArr5 = this.g;
            int i11 = i10 + 1;
            this.h[i10] = new fm5(bArr5[i10], bArr5[i11], z39.f(bArr[i10]), z39.f(bArr2[i10]), z39.d(bArr3[i10]), z39.b(bArr4[i10]));
            i10 = i11;
        }
    }

    public static v39 v(Object obj) {
        if (obj instanceof v39) {
            return (v39) obj;
        }
        if (obj != null) {
            return new v39(p.D(obj));
        }
        return null;
    }

    public int[] A() {
        return z39.g(this.g);
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d();
        h0 h0Var = this.a;
        if (h0Var == null) {
            h0Var = this.b;
        }
        dVar.a(h0Var);
        d dVar2 = new d();
        int i = 0;
        while (true) {
            byte[][] bArr = this.c;
            if (i >= bArr.length) {
                break;
            }
            dVar2.a(new s0(bArr[i]));
            i++;
        }
        dVar.a(new w0(dVar2));
        d dVar3 = new d();
        dVar3.a(new s0(this.d));
        dVar.a(new w0(dVar3));
        d dVar4 = new d();
        int i2 = 0;
        while (true) {
            byte[][] bArr2 = this.e;
            if (i2 >= bArr2.length) {
                break;
            }
            dVar4.a(new s0(bArr2[i2]));
            i2++;
        }
        dVar.a(new w0(dVar4));
        d dVar5 = new d();
        dVar5.a(new s0(this.f));
        dVar.a(new w0(dVar5));
        d dVar6 = new d();
        dVar6.a(new s0(this.g));
        dVar.a(new w0(dVar6));
        d dVar7 = new d();
        for (int i3 = 0; i3 < this.h.length; i3++) {
            d dVar8 = new d();
            byte[][][] e = z39.e(this.h[i3].a());
            d dVar9 = new d();
            for (byte[][] bArr3 : e) {
                d dVar10 = new d();
                int i4 = 0;
                while (true) {
                    if (i4 < bArr3.length) {
                        dVar10.a(new s0(bArr3[i4]));
                        i4++;
                    }
                }
                dVar9.a(new w0(dVar10));
            }
            dVar8.a(new w0(dVar9));
            byte[][][] e2 = z39.e(this.h[i3].b());
            d dVar11 = new d();
            for (byte[][] bArr4 : e2) {
                d dVar12 = new d();
                int i5 = 0;
                while (true) {
                    if (i5 < bArr4.length) {
                        dVar12.a(new s0(bArr4[i5]));
                        i5++;
                    }
                }
                dVar11.a(new w0(dVar12));
            }
            dVar8.a(new w0(dVar11));
            byte[][] c = z39.c(this.h[i3].d());
            d dVar13 = new d();
            for (byte[] bArr5 : c) {
                dVar13.a(new s0(bArr5));
            }
            dVar8.a(new w0(dVar13));
            dVar8.a(new s0(z39.a(this.h[i3].c())));
            dVar7.a(new w0(dVar8));
        }
        dVar.a(new w0(dVar7));
        return new w0(dVar);
    }

    public short[] t() {
        return z39.b(this.d);
    }

    public short[] u() {
        return z39.b(this.f);
    }

    public short[][] w() {
        return z39.d(this.c);
    }

    public short[][] x() {
        return z39.d(this.e);
    }

    public fm5[] z() {
        return this.h;
    }

    public v39(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, fm5[] fm5VarArr) {
        this.a = new i(1L);
        this.c = z39.c(sArr);
        this.d = z39.a(sArr2);
        this.e = z39.c(sArr3);
        this.f = z39.a(sArr4);
        this.g = z39.h(iArr);
        this.h = fm5VarArr;
    }
}
