package cloud.mindbox.mobile_sdk.utils;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class RuntimeTypeAdapterFactory<T> implements onb {
    private final Class<?> a;
    private final String b;
    private final Map<String, Class<?>> c = new LinkedHashMap();
    private final Map<Class<?>, String> d = new LinkedHashMap();
    private final boolean e;
    private boolean f;

    private RuntimeTypeAdapterFactory(Class<?> cls, String str, boolean z) {
        if (str != null && cls != null) {
            this.a = cls;
            this.b = str;
            this.e = z;
            return;
        }
        throw null;
    }

    public static <T> RuntimeTypeAdapterFactory<T> f(Class<T> cls, String str, boolean z) {
        return new RuntimeTypeAdapterFactory<>(cls, str, z);
    }

    @Override // defpackage.onb
    public <R> TypeAdapter<R> b(Gson gson, TypeToken<R> typeToken) {
        boolean equals;
        if (typeToken == null) {
            return null;
        }
        Class<? super R> rawType = typeToken.getRawType();
        if (this.f) {
            equals = this.a.isAssignableFrom(rawType);
        } else {
            equals = this.a.equals(rawType);
        }
        if (!equals) {
            return null;
        }
        final TypeAdapter<T> n = gson.n(pa5.class);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.c.entrySet()) {
            TypeAdapter<T> o = gson.o(this, TypeToken.get((Class) entry.getValue()));
            linkedHashMap.put(entry.getKey(), o);
            linkedHashMap2.put(entry.getValue(), o);
        }
        return new TypeAdapter<R>() { // from class: cloud.mindbox.mobile_sdk.utils.RuntimeTypeAdapterFactory.1
            @Override // com.google.gson.TypeAdapter
            public R read(yb5 yb5Var) throws IOException {
                pa5 D;
                pa5 pa5Var = (pa5) n.read(yb5Var);
                if (RuntimeTypeAdapterFactory.this.e) {
                    D = pa5Var.f().B(RuntimeTypeAdapterFactory.this.b);
                } else {
                    D = pa5Var.f().D(RuntimeTypeAdapterFactory.this.b);
                }
                if (D != null) {
                    String h = D.h();
                    TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap.get(h);
                    if (typeAdapter != null) {
                        return (R) typeAdapter.fromJsonTree(pa5Var);
                    }
                    throw new JsonParseException("cannot deserialize " + RuntimeTypeAdapterFactory.this.a + " subtype named " + h + "; did you forget to register a subtype?");
                }
                throw new JsonParseException("cannot deserialize " + RuntimeTypeAdapterFactory.this.a + " because it does not define a field named " + RuntimeTypeAdapterFactory.this.b);
            }

            @Override // com.google.gson.TypeAdapter
            public void write(dd5 dd5Var, R r) throws IOException {
                Class<?> cls = r.getClass();
                String str = (String) RuntimeTypeAdapterFactory.this.d.get(cls);
                TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap2.get(cls);
                if (typeAdapter != null) {
                    mb5 f = typeAdapter.toJsonTree(r).f();
                    if (RuntimeTypeAdapterFactory.this.e) {
                        n.write(dd5Var, f);
                        return;
                    }
                    mb5 mb5Var = new mb5();
                    if (!f.C(RuntimeTypeAdapterFactory.this.b)) {
                        mb5Var.v(RuntimeTypeAdapterFactory.this.b, new qb5(str));
                        for (Map.Entry<String, pa5> entry2 : f.A()) {
                            mb5Var.v(entry2.getKey(), entry2.getValue());
                        }
                        n.write(dd5Var, mb5Var);
                        return;
                    }
                    throw new JsonParseException("cannot serialize " + cls.getName() + " because it already defines a field named " + RuntimeTypeAdapterFactory.this.b);
                }
                throw new JsonParseException("cannot serialize " + cls.getName() + "; did you forget to register a subtype?");
            }
        }.nullSafe();
    }

    public RuntimeTypeAdapterFactory<T> g(Class<? extends T> cls, String str) {
        if (cls != null && str != null) {
            if (!this.d.containsKey(cls) && !this.c.containsKey(str)) {
                this.c.put(str, cls);
                this.d.put(cls, str);
                return this;
            }
            throw new IllegalArgumentException("types and labels must be unique");
        }
        throw null;
    }
}
