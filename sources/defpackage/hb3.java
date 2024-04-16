package defpackage;

import java.math.BigInteger;
import org.bouncycastle.asn1.k;
/* renamed from: hb3  reason: default package */
/* loaded from: classes3.dex */
public class hb3 extends la3 {
    private k m;

    public hb3(k kVar, ea3 ea3Var, jb3 jb3Var, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        super(ea3Var, jb3Var, bigInteger, bigInteger2, bArr);
        this.m = kVar;
    }

    public k j() {
        return this.m;
    }

    public hb3(k kVar, la3 la3Var) {
        super(la3Var.a(), la3Var.b(), la3Var.e(), la3Var.c(), la3Var.f());
        this.m = kVar;
    }

    public hb3(k kVar, iac iacVar) {
        super(iacVar);
        this.m = kVar;
    }
}
