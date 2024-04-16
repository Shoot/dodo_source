package io.realm;

import io.realm.internal.TableQuery;
import io.realm.internal.objectstore.OsKeyPathMapping;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.util.Map;
/* compiled from: RealmAnyNativeFunctionsImpl.java */
/* loaded from: classes3.dex */
public class g0 implements c89 {
    @Override // defpackage.c89
    public void a(long j, Map.Entry<String, e0> entry) {
        OsObjectBuilder.nativeAddRealmAnyDictionaryEntry(j, entry.getKey(), entry.getValue().b());
    }

    @Override // defpackage.c89
    public void b(long j, e0 e0Var) {
        OsObjectBuilder.nativeAddRealmAnyListItem(j, e0Var.b());
    }

    public void c(TableQuery tableQuery, OsKeyPathMapping osKeyPathMapping, String str, e0... e0VarArr) {
        long[] jArr = new long[e0VarArr.length];
        for (int i = 0; i < e0VarArr.length; i++) {
            try {
                jArr[i] = e0VarArr[i].b();
            } catch (IllegalStateException e) {
                throw new IllegalArgumentException("Unmanaged Realm objects are not valid query arguments", e);
            }
        }
        tableQuery.m(osKeyPathMapping, str, jArr);
    }
}
