package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.j;
import org.bouncycastle.asn1.j0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.q;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.asn1.s0;
/* renamed from: gk8  reason: default package */
/* loaded from: classes3.dex */
public class gk8 {
    private static Set a;

    static {
        HashSet hashSet = new HashSet(5);
        a = hashSet;
        hashSet.add(y22.x);
        a.add(y22.y);
        a.add(y22.z);
        a.add(y22.A);
        a.add(y22.B);
    }

    public static dk8 a(ux uxVar) throws IOException {
        return b(uxVar, null);
    }

    public static dk8 b(ux uxVar, q qVar) throws IOException {
        int bitLength;
        gac gacVar;
        BigInteger e;
        boolean z;
        k kVar;
        k kVar2;
        if (uxVar instanceof n39) {
            o39 o39Var = (o39) uxVar;
            return new dk8(new eb(co7.R, q0.a), new p39(o39Var.c(), o39Var.h(), o39Var.b(), o39Var.g(), o39Var.i(), o39Var.e(), o39Var.f(), o39Var.j()), qVar);
        } else if (uxVar instanceof d82) {
            d82 d82Var = (d82) uxVar;
            b82 b = d82Var.b();
            return new dk8(new eb(oac.m4, new z72(b.b(), b.c(), b.a())), new i(d82Var.c()), qVar);
        } else if (uxVar instanceof nb3) {
            nb3 nb3Var = (nb3) uxVar;
            la3 b2 = nb3Var.b();
            if (b2 == null) {
                gacVar = new gac((j) q0.a);
                e = nb3Var.c();
            } else if (b2 instanceof qa3) {
                qa3 qa3Var = (qa3) b2;
                pb4 pb4Var = new pb4(qa3Var.m(), qa3Var.k(), qa3Var.l());
                int i = 32;
                if (a.contains(pb4Var.w())) {
                    kVar2 = y22.m;
                } else {
                    if (nb3Var.c().bitLength() > 256) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        kVar = do9.h;
                    } else {
                        kVar = do9.g;
                    }
                    if (z) {
                        i = 64;
                    }
                    kVar2 = kVar;
                }
                byte[] bArr = new byte[i];
                c(bArr, i, 0, nb3Var.c());
                return new dk8(new eb(kVar2, pb4Var), new s0(bArr));
            } else if (b2 instanceof hb3) {
                gacVar = new gac(((hb3) b2).j());
                e = b2.e();
            } else {
                gac gacVar2 = new gac(new iac(b2.a(), new kac(b2.b(), false), b2.e(), b2.c(), b2.f()));
                bitLength = b2.e().bitLength();
                gacVar = gacVar2;
                return new dk8(new eb(oac.C3, gacVar), new mb3(bitLength, nb3Var.c(), new j0(new ry3().a(b2.b(), nb3Var.c()).l(false)), gacVar), qVar);
            }
            bitLength = e.bitLength();
            return new dk8(new eb(oac.C3, gacVar), new mb3(bitLength, nb3Var.c(), new j0(new ry3().a(b2.b(), nb3Var.c()).l(false)), gacVar), qVar);
        } else if (uxVar instanceof r9c) {
            r9c r9cVar = (r9c) uxVar;
            return new dk8(new eb(wc3.c), new s0(r9cVar.getEncoded()), qVar, r9cVar.b().getEncoded());
        } else if (uxVar instanceof k9c) {
            k9c k9cVar = (k9c) uxVar;
            return new dk8(new eb(wc3.b), new s0(k9cVar.getEncoded()), qVar, k9cVar.b().getEncoded());
        } else if (uxVar instanceof rc3) {
            rc3 rc3Var = (rc3) uxVar;
            return new dk8(new eb(wc3.e), new s0(rc3Var.getEncoded()), qVar, rc3Var.b().getEncoded());
        } else if (uxVar instanceof lc3) {
            lc3 lc3Var = (lc3) uxVar;
            return new dk8(new eb(wc3.d), new s0(lc3Var.getEncoded()), qVar, lc3Var.b().getEncoded());
        } else {
            throw new IOException("key parameters not recognized");
        }
    }

    private static void c(byte[] bArr, int i, int i2, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i3 = 0; i3 != i; i3++) {
            bArr[i2 + i3] = byteArray[(byteArray.length - 1) - i3];
        }
    }
}
