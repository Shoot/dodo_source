package ru.dodopizza.app.data.deserializer;

import com.dodopizza.persistence.entity.RealmInteger;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
/* loaded from: classes3.dex */
public class RealmIntegerDeserializer implements oa5<RealmInteger> {
    @Override // defpackage.oa5
    /* renamed from: a */
    public RealmInteger deserialize(pa5 pa5Var, Type type, la5 la5Var) throws JsonParseException {
        return new RealmInteger(Integer.parseInt(pa5Var.h()));
    }
}
