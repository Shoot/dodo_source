package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements onb {
    private final rr1 a;
    private final ks3 b;
    private final Excluder c;
    private final JsonAdapterAnnotationTypeAdapterFactory d;
    private final cc9 e = cc9.a();

    /* loaded from: classes2.dex */
    public static final class Adapter<T> extends TypeAdapter<T> {
        private final r47<T> a;
        private final Map<String, b> b;

        Adapter(r47<T> r47Var, Map<String, b> map) {
            this.a = r47Var;
            this.b = map;
        }

        @Override // com.google.gson.TypeAdapter
        public T read(yb5 yb5Var) throws IOException {
            if (yb5Var.N() == mc5.NULL) {
                yb5Var.H();
                return null;
            }
            T a = this.a.a();
            try {
                yb5Var.b();
                while (yb5Var.m()) {
                    b bVar = this.b.get(yb5Var.y());
                    if (bVar != null && bVar.c) {
                        bVar.a(yb5Var, a);
                    }
                    yb5Var.l0();
                }
                yb5Var.k();
                return a;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(dd5 dd5Var, T t) throws IOException {
            if (t == null) {
                dd5Var.s();
                return;
            }
            dd5Var.e();
            try {
                for (b bVar : this.b.values()) {
                    if (bVar.c(t)) {
                        dd5Var.q(bVar.a);
                        bVar.b(dd5Var, t);
                    }
                }
                dd5Var.k();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends b {
        final /* synthetic */ Field d;
        final /* synthetic */ boolean e;
        final /* synthetic */ TypeAdapter f;
        final /* synthetic */ Gson g;
        final /* synthetic */ TypeToken h;
        final /* synthetic */ boolean i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, boolean z, boolean z2, Field field, boolean z3, TypeAdapter typeAdapter, Gson gson, TypeToken typeToken, boolean z4) {
            super(str, z, z2);
            this.d = field;
            this.e = z3;
            this.f = typeAdapter;
            this.g = gson;
            this.h = typeToken;
            this.i = z4;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        void a(yb5 yb5Var, Object obj) throws IOException, IllegalAccessException {
            Object read = this.f.read(yb5Var);
            if (read != null || !this.i) {
                this.d.set(obj, read);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        void b(dd5 dd5Var, Object obj) throws IOException, IllegalAccessException {
            TypeAdapter typeAdapterRuntimeTypeWrapper;
            Object obj2 = this.d.get(obj);
            if (this.e) {
                typeAdapterRuntimeTypeWrapper = this.f;
            } else {
                typeAdapterRuntimeTypeWrapper = new TypeAdapterRuntimeTypeWrapper(this.g, this.f, this.h.getType());
            }
            typeAdapterRuntimeTypeWrapper.write(dd5Var, obj2);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        public boolean c(Object obj) throws IOException, IllegalAccessException {
            if (!this.b || this.d.get(obj) == obj) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static abstract class b {
        final String a;
        final boolean b;
        final boolean c;

        protected b(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        abstract void a(yb5 yb5Var, Object obj) throws IOException, IllegalAccessException;

        abstract void b(dd5 dd5Var, Object obj) throws IOException, IllegalAccessException;

        abstract boolean c(Object obj) throws IOException, IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(rr1 rr1Var, ks3 ks3Var, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.a = rr1Var;
        this.b = ks3Var;
        this.c = excluder;
        this.d = jsonAdapterAnnotationTypeAdapterFactory;
    }

    private b a(Gson gson, Field field, String str, TypeToken<?> typeToken, boolean z, boolean z2) {
        TypeAdapter<?> typeAdapter;
        boolean z3;
        boolean a2 = vj8.a(typeToken.getRawType());
        y95 y95Var = (y95) field.getAnnotation(y95.class);
        if (y95Var != null) {
            typeAdapter = this.d.a(this.a, gson, typeToken, y95Var);
        } else {
            typeAdapter = null;
        }
        if (typeAdapter != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (typeAdapter == null) {
            typeAdapter = gson.m(typeToken);
        }
        return new a(str, z, z2, field, z3, typeAdapter, gson, typeToken, a2);
    }

    static boolean d(Field field, boolean z, Excluder excluder) {
        if (!excluder.d(field.getType(), z) && !excluder.g(field, z)) {
            return true;
        }
        return false;
    }

    private Map<String, b> e(Gson gson, TypeToken<?> typeToken, Class<?> cls) {
        b bVar;
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = typeToken.getType();
        TypeToken<?> typeToken2 = typeToken;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z2 = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean c = c(field, true);
                boolean c2 = c(field, z2);
                if (c || c2) {
                    this.e.b(field);
                    Type p = defpackage.b.p(typeToken2.getType(), cls2, field.getGenericType());
                    List<String> f = f(field);
                    int size = f.size();
                    b bVar2 = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = f.get(i2);
                        if (i2 != 0) {
                            z = false;
                        } else {
                            z = c;
                        }
                        int i3 = i2;
                        b bVar3 = bVar2;
                        int i4 = size;
                        List<String> list = f;
                        Field field2 = field;
                        b bVar4 = (b) linkedHashMap.put(str, a(gson, field, str, TypeToken.get(p), z, c2));
                        if (bVar3 == null) {
                            bVar2 = bVar4;
                        } else {
                            bVar2 = bVar3;
                        }
                        i2 = i3 + 1;
                        c = z;
                        f = list;
                        size = i4;
                        field = field2;
                    }
                    if (bVar2 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + bVar.a);
                    }
                }
                i++;
                z2 = false;
            }
            typeToken2 = TypeToken.get(defpackage.b.p(typeToken2.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = typeToken2.getRawType();
        }
        return linkedHashMap;
    }

    private List<String> f(Field field) {
        uca ucaVar = (uca) field.getAnnotation(uca.class);
        if (ucaVar == null) {
            return Collections.singletonList(this.b.a(field));
        }
        String value = ucaVar.value();
        String[] alternate = ucaVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // defpackage.onb
    public <T> TypeAdapter<T> b(Gson gson, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        return new Adapter(this.a.a(typeToken), e(gson, typeToken, rawType));
    }

    public boolean c(Field field, boolean z) {
        return d(field, z, this.c);
    }
}
