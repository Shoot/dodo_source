package io.realm;

import io.realm.internal.Table;
import java.util.LinkedHashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImmutableRealmSchema.java */
/* loaded from: classes3.dex */
public class r extends q0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public r(a aVar, rf1 rf1Var) {
        super(aVar, rf1Var);
    }

    @Override // io.realm.q0
    public Set<o0> d() {
        t89 o = this.f.s().o();
        Set<Class<? extends o89>> k = o.k();
        LinkedHashSet linkedHashSet = new LinkedHashSet(k.size());
        for (Class<? extends o89> cls : k) {
            linkedHashSet.add(o(o.m(cls)));
        }
        return linkedHashSet;
    }

    public o0 o(String str) {
        b(str, "Null or empty class names are not allowed");
        String q = Table.q(str);
        if (!this.f.x().hasTable(q)) {
            return null;
        }
        return new q(this.f, this, this.f.x().getTable(q), f(str));
    }
}
