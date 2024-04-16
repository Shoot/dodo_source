package defpackage;

import java.math.BigInteger;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kd4  reason: default package */
/* loaded from: classes3.dex */
public class kd4 implements ve8 {
    protected final iv3 a;
    protected final te8 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public kd4(iv3 iv3Var, te8 te8Var) {
        this.a = iv3Var;
        this.b = te8Var;
    }

    @Override // defpackage.iv3
    public int a() {
        return this.a.a() * this.b.b();
    }

    @Override // defpackage.iv3
    public BigInteger b() {
        return this.a.b();
    }

    @Override // defpackage.ve8
    public te8 c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd4)) {
            return false;
        }
        kd4 kd4Var = (kd4) obj;
        if (this.a.equals(kd4Var.a) && this.b.equals(kd4Var.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ g65.c(this.b.hashCode(), 16);
    }
}
