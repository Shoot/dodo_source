package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: BeanSerializerBuilder.java */
/* renamed from: na0  reason: default package */
/* loaded from: classes2.dex */
public class na0 {
    private static final ka0[] i = new ka0[0];
    protected final fa0 a;
    protected pca b;
    protected List<ka0> c = Collections.emptyList();
    protected ka0[] d;
    protected vl e;
    protected Object f;
    protected hl g;
    protected d57 h;

    public na0(fa0 fa0Var) {
        this.a = fa0Var;
    }

    public gc5<?> a() {
        ka0[] ka0VarArr;
        if (this.g != null && this.b.S(y76.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
            this.g.i(this.b.S(y76.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        vl vlVar = this.e;
        if (vlVar != null) {
            vlVar.a(this.b);
        }
        List<ka0> list = this.c;
        if (list != null && !list.isEmpty()) {
            List<ka0> list2 = this.c;
            ka0VarArr = (ka0[]) list2.toArray(new ka0[list2.size()]);
            if (this.b.S(y76.CAN_OVERRIDE_ACCESS_MODIFIERS)) {
                for (ka0 ka0Var : ka0VarArr) {
                    ka0Var.l(this.b);
                }
            }
        } else if (this.e == null && this.h == null) {
            return null;
        } else {
            ka0VarArr = i;
        }
        ka0[] ka0VarArr2 = this.d;
        if (ka0VarArr2 != null && ka0VarArr2.length != this.c.size()) {
            throw new IllegalStateException(String.format("Mismatch between `properties` size (%d), `filteredProperties` (%s): should have as many (or `null` for latter)", Integer.valueOf(this.c.size()), Integer.valueOf(this.d.length)));
        }
        return new la0(this.a.m(), this, ka0VarArr, this.d);
    }

    public la0 b() {
        return la0.e0(this.a.m(), this);
    }

    public vl c() {
        return this.e;
    }

    public fa0 d() {
        return this.a;
    }

    public Object e() {
        return this.f;
    }

    public d57 f() {
        return this.h;
    }

    public List<ka0> g() {
        return this.c;
    }

    public hl h() {
        return this.g;
    }

    public void i(vl vlVar) {
        this.e = vlVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(pca pcaVar) {
        this.b = pcaVar;
    }

    public void k(Object obj) {
        this.f = obj;
    }

    public void l(ka0[] ka0VarArr) {
        if (ka0VarArr != null && ka0VarArr.length != this.c.size()) {
            throw new IllegalArgumentException(String.format("Trying to set %d filtered properties; must match length of non-filtered `properties` (%d)", Integer.valueOf(ka0VarArr.length), Integer.valueOf(this.c.size())));
        }
        this.d = ka0VarArr;
    }

    public void m(d57 d57Var) {
        this.h = d57Var;
    }

    public void n(List<ka0> list) {
        this.c = list;
    }

    public void o(hl hlVar) {
        if (this.g == null) {
            this.g = hlVar;
            return;
        }
        throw new IllegalArgumentException("Multiple type ids specified with " + this.g + " and " + hlVar);
    }
}
