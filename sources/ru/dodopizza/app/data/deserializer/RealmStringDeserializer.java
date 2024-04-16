package ru.dodopizza.app.data.deserializer;

import com.dodopizza.persistence.entity.RealmString;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
/* loaded from: classes3.dex */
public class RealmStringDeserializer implements oa5<RealmString>, hc5<RealmString> {
    @Override // defpackage.oa5
    /* renamed from: a */
    public RealmString deserialize(pa5 pa5Var, Type type, la5 la5Var) throws JsonParseException {
        return new RealmString(pa5Var.h());
    }

    @Override // defpackage.hc5
    /* renamed from: b */
    public pa5 serialize(RealmString realmString, Type type, ec5 ec5Var) {
        return null;
    }
}
