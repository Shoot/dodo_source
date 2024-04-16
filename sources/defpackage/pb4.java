package defpackage;

import org.bouncycastle.asn1.d;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.w0;
/* renamed from: pb4  reason: default package */
/* loaded from: classes3.dex */
public class pb4 extends i0 {
    private k a;
    private k b;
    private k c;

    public pb4(k kVar, k kVar2) {
        this.a = kVar;
        this.b = kVar2;
        this.c = null;
    }

    public static pb4 v(Object obj) {
        if (obj instanceof pb4) {
            return (pb4) obj;
        }
        if (obj != null) {
            return new pb4(p.D(obj));
        }
        return null;
    }

    @Override // defpackage.i0, defpackage.h0
    public n f() {
        d dVar = new d(3);
        dVar.a(this.a);
        dVar.a(this.b);
        k kVar = this.c;
        if (kVar != null) {
            dVar.a(kVar);
        }
        return new w0(dVar);
    }

    public k t() {
        return this.b;
    }

    public k u() {
        return this.c;
    }

    public k w() {
        return this.a;
    }

    public pb4(k kVar, k kVar2, k kVar3) {
        this.a = kVar;
        this.b = kVar2;
        this.c = kVar3;
    }

    private pb4(p pVar) {
        this.a = (k) pVar.F(0);
        this.b = (k) pVar.F(1);
        if (pVar.size() > 2) {
            this.c = (k) pVar.F(2);
        }
    }
}
