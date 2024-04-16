package defpackage;

import com.google.i18n.phonenumbers.c;
/* compiled from: MetadataSourceImpl.java */
/* renamed from: vi6  reason: default package */
/* loaded from: classes.dex */
public final class vi6 implements ui6 {
    private final x28 a;
    private final oi6<yn1> b;

    public vi6(x28 x28Var, oi6<yn1> oi6Var) {
        this.a = x28Var;
        this.b = oi6Var;
    }

    @Override // defpackage.ic9
    public c a(String str) {
        if (ge4.b(str)) {
            return this.b.a(this.a.a(str)).c(str);
        }
        throw new IllegalArgumentException(str + " region code is a non-geo entity");
    }

    @Override // defpackage.zz6
    public c b(int i) {
        if (!ge4.a(i)) {
            return this.b.a(this.a.a(Integer.valueOf(i))).b(i);
        }
        throw new IllegalArgumentException(i + " calling code belongs to a geo entity");
    }

    public vi6(x28 x28Var, si6 si6Var, ti6 ti6Var) {
        this(x28Var, new vd0(si6Var, ti6Var, new yn1()));
    }
}
