package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public final class ArrayTypeAdapter<E> extends TypeAdapter<Object> {
    public static final onb c = new onb() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // defpackage.onb
        public <T> TypeAdapter<T> b(Gson gson, TypeToken<T> typeToken) {
            Type type = typeToken.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type g = b.g(type);
            return new ArrayTypeAdapter(gson, gson.m(TypeToken.get(g)), b.k(g));
        }
    };
    private final Class<E> a;
    private final TypeAdapter<E> b;

    public ArrayTypeAdapter(Gson gson, TypeAdapter<E> typeAdapter, Class<E> cls) {
        this.b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, cls);
        this.a = cls;
    }

    @Override // com.google.gson.TypeAdapter
    public Object read(yb5 yb5Var) throws IOException {
        if (yb5Var.N() == mc5.NULL) {
            yb5Var.H();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        yb5Var.a();
        while (yb5Var.m()) {
            arrayList.add(this.b.read(yb5Var));
        }
        yb5Var.j();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.TypeAdapter
    public void write(dd5 dd5Var, Object obj) throws IOException {
        if (obj == null) {
            dd5Var.s();
            return;
        }
        dd5Var.c();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.write(dd5Var, Array.get(obj, i));
        }
        dd5Var.j();
    }
}
