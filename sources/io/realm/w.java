package io.realm;

import io.realm.internal.Table;
import java.util.LinkedHashSet;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MutableRealmSchema.java */
/* loaded from: classes3.dex */
public class w extends q0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public w(a aVar) {
        super(aVar, null);
    }

    @Override // io.realm.q0
    public Set<o0> d() {
        String[] tablesNames = this.f.x().getTablesNames();
        LinkedHashSet linkedHashSet = new LinkedHashSet(tablesNames.length);
        for (String str : tablesNames) {
            o0 o = o(Table.h(str));
            if (o != null) {
                linkedHashSet.add(o);
            }
        }
        return linkedHashSet;
    }

    public o0 o(String str) {
        b(str, "Null or empty class names are not allowed");
        String q = Table.q(str);
        if (!this.f.x().hasTable(q)) {
            return null;
        }
        return new v(this.f, this, this.f.x().getTable(q));
    }
}
