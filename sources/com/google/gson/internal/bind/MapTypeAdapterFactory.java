package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes2.dex */
public final class MapTypeAdapterFactory implements onb {
    private final rr1 a;
    final boolean b;

    /* loaded from: classes2.dex */
    private final class Adapter<K, V> extends TypeAdapter<Map<K, V>> {
        private final TypeAdapter<K> a;
        private final TypeAdapter<V> b;
        private final r47<? extends Map<K, V>> c;

        public Adapter(Gson gson, Type type, TypeAdapter<K> typeAdapter, Type type2, TypeAdapter<V> typeAdapter2, r47<? extends Map<K, V>> r47Var) {
            this.a = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter, type);
            this.b = new TypeAdapterRuntimeTypeWrapper(gson, typeAdapter2, type2);
            this.c = r47Var;
        }

        private String a(pa5 pa5Var) {
            if (pa5Var.u()) {
                qb5 g = pa5Var.g();
                if (g.C()) {
                    return String.valueOf(g.z());
                }
                if (g.A()) {
                    return Boolean.toString(g.v());
                }
                if (g.D()) {
                    return g.h();
                }
                throw new AssertionError();
            } else if (pa5Var.p()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public Map<K, V> read(yb5 yb5Var) throws IOException {
            mc5 N = yb5Var.N();
            if (N == mc5.NULL) {
                yb5Var.H();
                return null;
            }
            Map<K, V> a = this.c.a();
            if (N == mc5.BEGIN_ARRAY) {
                yb5Var.a();
                while (yb5Var.m()) {
                    yb5Var.a();
                    K read = this.a.read(yb5Var);
                    if (a.put(read, this.b.read(yb5Var)) == null) {
                        yb5Var.j();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + read);
                    }
                }
                yb5Var.j();
            } else {
                yb5Var.b();
                while (yb5Var.m()) {
                    zb5.a.a(yb5Var);
                    K read2 = this.a.read(yb5Var);
                    if (a.put(read2, this.b.read(yb5Var)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + read2);
                    }
                }
                yb5Var.k();
            }
            return a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: c */
        public void write(dd5 dd5Var, Map<K, V> map) throws IOException {
            boolean z;
            if (map == null) {
                dd5Var.s();
            } else if (!MapTypeAdapterFactory.this.b) {
                dd5Var.e();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    dd5Var.q(String.valueOf(entry.getKey()));
                    this.b.write(dd5Var, entry.getValue());
                }
                dd5Var.k();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z2 = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    pa5 jsonTree = this.a.toJsonTree(entry2.getKey());
                    arrayList.add(jsonTree);
                    arrayList2.add(entry2.getValue());
                    if (!jsonTree.k() && !jsonTree.t()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    z2 |= z;
                }
                if (z2) {
                    dd5Var.c();
                    int size = arrayList.size();
                    while (i < size) {
                        dd5Var.c();
                        zya.b((pa5) arrayList.get(i), dd5Var);
                        this.b.write(dd5Var, arrayList2.get(i));
                        dd5Var.j();
                        i++;
                    }
                    dd5Var.j();
                    return;
                }
                dd5Var.e();
                int size2 = arrayList.size();
                while (i < size2) {
                    dd5Var.q(a((pa5) arrayList.get(i)));
                    this.b.write(dd5Var, arrayList2.get(i));
                    i++;
                }
                dd5Var.k();
            }
        }
    }

    public MapTypeAdapterFactory(rr1 rr1Var, boolean z) {
        this.a = rr1Var;
        this.b = z;
    }

    private TypeAdapter<?> a(Gson gson, Type type) {
        if (type != Boolean.TYPE && type != Boolean.class) {
            return gson.m(TypeToken.get(type));
        }
        return TypeAdapters.f;
    }

    @Override // defpackage.onb
    public <T> TypeAdapter<T> b(Gson gson, TypeToken<T> typeToken) {
        Type type = typeToken.getType();
        if (!Map.class.isAssignableFrom(typeToken.getRawType())) {
            return null;
        }
        Type[] j = b.j(type, b.k(type));
        return new Adapter(gson, j[0], a(gson, j[0]), j[1], gson.m(TypeToken.get(j[1])), this.a.a(typeToken));
    }
}
