package ru.dodopizza.app.data.deserializer;

import com.dodopizza.persistence.entity.RealmString;
import io.realm.k0;
import java.lang.reflect.Type;
import java.util.Iterator;
/* loaded from: classes3.dex */
public class RealmListSerializer implements hc5<k0<RealmString>> {
    @Override // defpackage.hc5
    /* renamed from: a */
    public pa5 serialize(k0<RealmString> k0Var, Type type, ec5 ec5Var) {
        ca5 ca5Var = new ca5();
        Iterator<RealmString> it = k0Var.iterator();
        while (it.hasNext()) {
            ca5Var.w(it.next().toString());
        }
        return ca5Var;
    }
}
