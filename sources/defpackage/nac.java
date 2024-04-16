package defpackage;

import java.math.BigInteger;
/* renamed from: nac  reason: default package */
/* loaded from: classes3.dex */
public class nac {
    public int a(ea3 ea3Var) {
        return (ea3Var.t() + 7) / 8;
    }

    public int b(na3 na3Var) {
        return (na3Var.f() + 7) / 8;
    }

    public byte[] c(BigInteger bigInteger, int i) {
        byte[] byteArray = bigInteger.toByteArray();
        if (i < byteArray.length) {
            byte[] bArr = new byte[i];
            System.arraycopy(byteArray, byteArray.length - i, bArr, 0, i);
            return bArr;
        } else if (i > byteArray.length) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(byteArray, 0, bArr2, i - byteArray.length, byteArray.length);
            return bArr2;
        } else {
            return byteArray;
        }
    }
}
