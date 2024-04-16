package defpackage;

import defpackage.ea3;
import defpackage.jb3;
import java.math.BigInteger;
/* renamed from: s2c  reason: default package */
/* loaded from: classes3.dex */
public class s2c extends h1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s2c$a */
    /* loaded from: classes3.dex */
    public static class a implements hg8 {
        final /* synthetic */ jb3.b a;
        final /* synthetic */ byte b;

        a(jb3.b bVar, byte b) {
            this.a = bVar;
            this.b = b;
        }

        @Override // defpackage.hg8
        public ig8 a(ig8 ig8Var) {
            if (ig8Var instanceof t2c) {
                return ig8Var;
            }
            t2c t2cVar = new t2c();
            t2cVar.b(nhb.d(this.a, this.b));
            return t2cVar;
        }
    }

    private static jb3.b d(jb3.b bVar, byte[] bArr) {
        jb3.b bVar2;
        ea3.b bVar3 = (ea3.b) bVar.i();
        jb3.b[] a2 = ((t2c) bVar3.B(bVar, "bc_wtnaf", new a(bVar, bVar3.n().t().byteValue()))).a();
        jb3.b[] bVarArr = new jb3.b[a2.length];
        for (int i = 0; i < a2.length; i++) {
            bVarArr[i] = (jb3.b) a2[i].z();
        }
        jb3.b bVar4 = (jb3.b) bVar.i().u();
        int i2 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i2++;
            byte b = bArr[length];
            if (b != 0) {
                jb3.b L = bVar4.L(i2);
                if (b > 0) {
                    bVar2 = a2[b >>> 1];
                } else {
                    bVar2 = bVarArr[(-b) >>> 1];
                }
                bVar4 = (jb3.b) L.a(bVar2);
                i2 = 0;
            }
        }
        if (i2 > 0) {
            return bVar4.L(i2);
        }
        return bVar4;
    }

    private jb3.b e(jb3.b bVar, pcc pccVar, byte b, byte b2) {
        pcc[] pccVarArr;
        if (b == 0) {
            pccVarArr = nhb.d;
        } else {
            pccVarArr = nhb.f;
        }
        pcc[] pccVarArr2 = pccVarArr;
        return d(bVar, nhb.l(b2, pccVar, (byte) 4, BigInteger.valueOf(16L), nhb.g(b2, 4), pccVarArr2));
    }

    @Override // defpackage.h1
    protected jb3 c(jb3 jb3Var, BigInteger bigInteger) {
        if (jb3Var instanceof jb3.b) {
            jb3.b bVar = (jb3.b) jb3Var;
            ea3.b bVar2 = (ea3.b) bVar.i();
            int t = bVar2.t();
            byte byteValue = bVar2.n().t().byteValue();
            byte c = nhb.c(byteValue);
            return e(bVar, nhb.j(bigInteger, t, byteValue, bVar2.G(), c, (byte) 10), byteValue, c);
        }
        throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
    }
}
