package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
/* loaded from: classes2.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements onb {
    private final rr1 a;

    public JsonAdapterAnnotationTypeAdapterFactory(rr1 rr1Var) {
        this.a = rr1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TypeAdapter<?> a(rr1 rr1Var, Gson gson, TypeToken<?> typeToken, y95 y95Var) {
        hc5 hc5Var;
        TypeAdapter<?> treeTypeAdapter;
        Object a = rr1Var.a(TypeToken.get((Class) y95Var.value())).a();
        if (a instanceof TypeAdapter) {
            treeTypeAdapter = (TypeAdapter) a;
        } else if (a instanceof onb) {
            treeTypeAdapter = ((onb) a).b(gson, typeToken);
        } else {
            boolean z = a instanceof hc5;
            if (!z && !(a instanceof oa5)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + a.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            oa5 oa5Var = null;
            if (z) {
                hc5Var = (hc5) a;
            } else {
                hc5Var = null;
            }
            if (a instanceof oa5) {
                oa5Var = (oa5) a;
            }
            treeTypeAdapter = new TreeTypeAdapter<>(hc5Var, oa5Var, gson, typeToken, null);
        }
        if (treeTypeAdapter != null && y95Var.nullSafe()) {
            return treeTypeAdapter.nullSafe();
        }
        return treeTypeAdapter;
    }

    @Override // defpackage.onb
    public <T> TypeAdapter<T> b(Gson gson, TypeToken<T> typeToken) {
        y95 y95Var = (y95) typeToken.getRawType().getAnnotation(y95.class);
        if (y95Var == null) {
            return null;
        }
        return (TypeAdapter<T>) a(this.a, gson, typeToken, y95Var);
    }
}
