package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
/* loaded from: classes2.dex */
public final class TreeTypeAdapter<T> extends TypeAdapter<T> {
    private final hc5<T> a;
    private final oa5<T> b;
    final Gson c;
    private final TypeToken<T> d;
    private final onb e;
    private final TreeTypeAdapter<T>.b f = new b();
    private TypeAdapter<T> g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class SingleTypeFactory implements onb {
        private final TypeToken<?> a;
        private final boolean b;
        private final Class<?> c;
        private final hc5<?> d;
        private final oa5<?> e;

        SingleTypeFactory(Object obj, TypeToken<?> typeToken, boolean z, Class<?> cls) {
            hc5<?> hc5Var;
            boolean z2;
            if (obj instanceof hc5) {
                hc5Var = (hc5) obj;
            } else {
                hc5Var = null;
            }
            this.d = hc5Var;
            oa5<?> oa5Var = obj instanceof oa5 ? (oa5) obj : null;
            this.e = oa5Var;
            if (hc5Var == null && oa5Var == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            defpackage.a.a(z2);
            this.a = typeToken;
            this.b = z;
            this.c = cls;
        }

        @Override // defpackage.onb
        public <T> TypeAdapter<T> b(Gson gson, TypeToken<T> typeToken) {
            TypeToken<?> typeToken2 = this.a;
            if (typeToken2 == null ? this.c.isAssignableFrom(typeToken.getRawType()) : !(!typeToken2.equals(typeToken) && (!this.b || this.a.getType() != typeToken.getRawType()))) {
                return new TreeTypeAdapter(this.d, this.e, gson, typeToken, this);
            }
            return null;
        }
    }

    /* loaded from: classes2.dex */
    private final class b implements ec5, la5 {
        private b() {
        }

        @Override // defpackage.la5
        public <R> R a(pa5 pa5Var, Type type) throws JsonParseException {
            return (R) TreeTypeAdapter.this.c.h(pa5Var, type);
        }
    }

    public TreeTypeAdapter(hc5<T> hc5Var, oa5<T> oa5Var, Gson gson, TypeToken<T> typeToken, onb onbVar) {
        this.a = hc5Var;
        this.b = oa5Var;
        this.c = gson;
        this.d = typeToken;
        this.e = onbVar;
    }

    private TypeAdapter<T> a() {
        TypeAdapter<T> typeAdapter = this.g;
        if (typeAdapter == null) {
            TypeAdapter<T> o = this.c.o(this.e, this.d);
            this.g = o;
            return o;
        }
        return typeAdapter;
    }

    public static onb b(TypeToken<?> typeToken, Object obj) {
        boolean z;
        if (typeToken.getType() == typeToken.getRawType()) {
            z = true;
        } else {
            z = false;
        }
        return new SingleTypeFactory(obj, typeToken, z, null);
    }

    @Override // com.google.gson.TypeAdapter
    public T read(yb5 yb5Var) throws IOException {
        if (this.b == null) {
            return a().read(yb5Var);
        }
        pa5 a2 = zya.a(yb5Var);
        if (a2.p()) {
            return null;
        }
        return this.b.deserialize(a2, this.d.getType(), this.f);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(dd5 dd5Var, T t) throws IOException {
        hc5<T> hc5Var = this.a;
        if (hc5Var == null) {
            a().write(dd5Var, t);
        } else if (t == null) {
            dd5Var.s();
        } else {
            zya.b(hc5Var.serialize(t, this.d.getType(), this.f), dd5Var);
        }
    }
}
