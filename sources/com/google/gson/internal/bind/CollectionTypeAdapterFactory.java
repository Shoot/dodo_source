package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;
/* loaded from: classes2.dex */
public final class CollectionTypeAdapterFactory implements onb {
    private final rr1 a;

    /* loaded from: classes2.dex */
    private static final class Adapter<E> extends TypeAdapter<Collection<E>> {
        private final TypeAdapter<E> a;
        private final r47<? extends Collection<E>> b;

        public Adapter(Gson gson, Type type, TypeAdapter<E> typeAdapter, r47<? extends Collection<E>> r47Var) {
            this.a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.b = r47Var;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Collection<E> read(yb5 yb5Var) throws IOException {
            if (yb5Var.N() == mc5.NULL) {
                yb5Var.H();
                return null;
            }
            Collection<E> a = this.b.a();
            yb5Var.a();
            while (yb5Var.m()) {
                a.add(this.a.read(yb5Var));
            }
            yb5Var.j();
            return a;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(dd5 dd5Var, Collection<E> collection) throws IOException {
            if (collection == null) {
                dd5Var.s();
                return;
            }
            dd5Var.c();
            for (E e : collection) {
                this.a.write(dd5Var, e);
            }
            dd5Var.j();
        }
    }

    public CollectionTypeAdapterFactory(rr1 rr1Var) {
        this.a = rr1Var;
    }

    @Override // defpackage.onb
    public <T> TypeAdapter<T> b(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type h = b.h(type, rawType);
        return new Adapter(gson, h, gson.m(TypeToken.get(h)), this.a.a(typeToken));
    }
}
