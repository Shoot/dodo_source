package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
/* loaded from: classes2.dex */
public final class Gson {
    private static final TypeToken<?> x = TypeToken.get(Object.class);
    private final ThreadLocal<Map<TypeToken<?>, FutureTypeAdapter<?>>> a;
    private final Map<TypeToken<?>, TypeAdapter<?>> b;
    private final rr1 c;
    private final JsonAdapterAnnotationTypeAdapterFactory d;
    final List<onb> e;
    final Excluder f;
    final ks3 g;
    final Map<Type, y45<?>> h;
    final boolean i;
    final boolean j;
    final boolean k;
    final boolean l;
    final boolean m;
    final boolean n;
    final boolean o;
    final String p;
    final int q;
    final int r;
    final oy5 s;
    final List<onb> t;
    final List<onb> u;
    final shb v;
    final shb w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class FutureTypeAdapter<T> extends TypeAdapter<T> {
        private TypeAdapter<T> a;

        FutureTypeAdapter() {
        }

        public void a(TypeAdapter<T> typeAdapter) {
            if (this.a == null) {
                this.a = typeAdapter;
                return;
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.TypeAdapter
        public T read(yb5 yb5Var) throws IOException {
            TypeAdapter<T> typeAdapter = this.a;
            if (typeAdapter != null) {
                return typeAdapter.read(yb5Var);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.TypeAdapter
        public void write(dd5 dd5Var, T t) throws IOException {
            TypeAdapter<T> typeAdapter = this.a;
            if (typeAdapter != null) {
                typeAdapter.write(dd5Var, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public Gson() {
        this(Excluder.g, js3.a, Collections.emptyMap(), false, false, false, true, false, false, false, oy5.a, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), rhb.a, rhb.b);
    }

    private static void a(Object obj, yb5 yb5Var) {
        if (obj != null) {
            try {
                if (yb5Var.N() != mc5.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException(e);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        }
    }

    private static TypeAdapter<AtomicLong> b(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLong>() { // from class: com.google.gson.Gson.4
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public AtomicLong read(yb5 yb5Var) throws IOException {
                return new AtomicLong(((Number) TypeAdapter.this.read(yb5Var)).longValue());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, AtomicLong atomicLong) throws IOException {
                TypeAdapter.this.write(dd5Var, Long.valueOf(atomicLong.get()));
            }
        }.nullSafe();
    }

    private static TypeAdapter<AtomicLongArray> c(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLongArray>() { // from class: com.google.gson.Gson.5
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public AtomicLongArray read(yb5 yb5Var) throws IOException {
                ArrayList arrayList = new ArrayList();
                yb5Var.a();
                while (yb5Var.m()) {
                    arrayList.add(Long.valueOf(((Number) TypeAdapter.this.read(yb5Var)).longValue()));
                }
                yb5Var.j();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, AtomicLongArray atomicLongArray) throws IOException {
                dd5Var.c();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    TypeAdapter.this.write(dd5Var, Long.valueOf(atomicLongArray.get(i)));
                }
                dd5Var.j();
            }
        }.nullSafe();
    }

    static void d(double d) {
        if (!Double.isNaN(d) && !Double.isInfinite(d)) {
            return;
        }
        throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    private TypeAdapter<Number> e(boolean z) {
        if (z) {
            return TypeAdapters.v;
        }
        return new TypeAdapter<Number>() { // from class: com.google.gson.Gson.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Double read(yb5 yb5Var) throws IOException {
                if (yb5Var.N() == mc5.NULL) {
                    yb5Var.H();
                    return null;
                }
                return Double.valueOf(yb5Var.s());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, Number number) throws IOException {
                if (number == null) {
                    dd5Var.s();
                    return;
                }
                Gson.d(number.doubleValue());
                dd5Var.S(number);
            }
        };
    }

    private TypeAdapter<Number> f(boolean z) {
        if (z) {
            return TypeAdapters.u;
        }
        return new TypeAdapter<Number>() { // from class: com.google.gson.Gson.2
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Float read(yb5 yb5Var) throws IOException {
                if (yb5Var.N() == mc5.NULL) {
                    yb5Var.H();
                    return null;
                }
                return Float.valueOf((float) yb5Var.s());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, Number number) throws IOException {
                if (number == null) {
                    dd5Var.s();
                    return;
                }
                Gson.d(number.floatValue());
                dd5Var.S(number);
            }
        };
    }

    private static TypeAdapter<Number> p(oy5 oy5Var) {
        if (oy5Var == oy5.a) {
            return TypeAdapters.t;
        }
        return new TypeAdapter<Number>() { // from class: com.google.gson.Gson.3
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(yb5 yb5Var) throws IOException {
                if (yb5Var.N() == mc5.NULL) {
                    yb5Var.H();
                    return null;
                }
                return Long.valueOf(yb5Var.x());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, Number number) throws IOException {
                if (number == null) {
                    dd5Var.s();
                } else {
                    dd5Var.T(number.toString());
                }
            }
        };
    }

    public <T> T g(pa5 pa5Var, Class<T> cls) throws JsonSyntaxException {
        return (T) vj8.b(cls).cast(h(pa5Var, cls));
    }

    public <T> T h(pa5 pa5Var, Type type) throws JsonSyntaxException {
        if (pa5Var == null) {
            return null;
        }
        return (T) i(new com.google.gson.internal.bind.a(pa5Var), type);
    }

    public <T> T i(yb5 yb5Var, Type type) throws JsonIOException, JsonSyntaxException {
        boolean n = yb5Var.n();
        boolean z = true;
        yb5Var.W(true);
        try {
            try {
                try {
                    yb5Var.N();
                    z = false;
                    return m(TypeToken.get(type)).read(yb5Var);
                } catch (EOFException e) {
                    if (z) {
                        yb5Var.W(n);
                        return null;
                    }
                    throw new JsonSyntaxException(e);
                } catch (IllegalStateException e2) {
                    throw new JsonSyntaxException(e2);
                }
            } catch (IOException e3) {
                throw new JsonSyntaxException(e3);
            } catch (AssertionError e4) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e4.getMessage());
                assertionError.initCause(e4);
                throw assertionError;
            }
        } finally {
            yb5Var.W(n);
        }
    }

    public <T> T j(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        yb5 q = q(reader);
        T t = (T) i(q, type);
        a(t, q);
        return t;
    }

    public <T> T k(String str, Class<T> cls) throws JsonSyntaxException {
        return (T) vj8.b(cls).cast(l(str, cls));
    }

    public <T> T l(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return (T) j(new StringReader(str), type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> TypeAdapter<T> m(TypeToken<T> typeToken) {
        Object obj;
        boolean z;
        Map<TypeToken<?>, TypeAdapter<?>> map = this.b;
        if (typeToken == null) {
            obj = x;
        } else {
            obj = typeToken;
        }
        TypeAdapter<T> typeAdapter = (TypeAdapter<T>) map.get(obj);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map<TypeToken<?>, FutureTypeAdapter<?>> map2 = this.a.get();
        if (map2 == null) {
            map2 = new HashMap<>();
            this.a.set(map2);
            z = true;
        } else {
            z = false;
        }
        FutureTypeAdapter<?> futureTypeAdapter = map2.get(typeToken);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter<?> futureTypeAdapter2 = new FutureTypeAdapter<>();
            map2.put(typeToken, futureTypeAdapter2);
            for (onb onbVar : this.e) {
                TypeAdapter typeAdapter2 = (TypeAdapter<T>) onbVar.b(this, typeToken);
                if (typeAdapter2 != null) {
                    futureTypeAdapter2.a(typeAdapter2);
                    this.b.put(typeToken, typeAdapter2);
                    return typeAdapter2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.9) cannot handle " + typeToken);
        } finally {
            map2.remove(typeToken);
            if (z) {
                this.a.remove();
            }
        }
    }

    public <T> TypeAdapter<T> n(Class<T> cls) {
        return m(TypeToken.get((Class) cls));
    }

    public <T> TypeAdapter<T> o(onb onbVar, TypeToken<T> typeToken) {
        if (!this.e.contains(onbVar)) {
            onbVar = this.d;
        }
        boolean z = false;
        for (onb onbVar2 : this.e) {
            if (!z) {
                if (onbVar2 == onbVar) {
                    z = true;
                }
            } else {
                TypeAdapter<T> b = onbVar2.b(this, typeToken);
                if (b != null) {
                    return b;
                }
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    public yb5 q(Reader reader) {
        yb5 yb5Var = new yb5(reader);
        yb5Var.W(this.n);
        return yb5Var;
    }

    public dd5 r(Writer writer) throws IOException {
        if (this.k) {
            writer.write(")]}'\n");
        }
        dd5 dd5Var = new dd5(writer);
        if (this.m) {
            dd5Var.K("  ");
        }
        dd5Var.M(this.i);
        return dd5Var;
    }

    public String s(pa5 pa5Var) {
        StringWriter stringWriter = new StringWriter();
        w(pa5Var, stringWriter);
        return stringWriter.toString();
    }

    public String t(Object obj) {
        if (obj == null) {
            return s(lb5.a);
        }
        return u(obj, obj.getClass());
    }

    public String toString() {
        return "{serializeNulls:" + this.i + ",factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }

    public String u(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        y(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void v(pa5 pa5Var, dd5 dd5Var) throws JsonIOException {
        boolean n = dd5Var.n();
        dd5Var.L(true);
        boolean m = dd5Var.m();
        dd5Var.H(this.l);
        boolean l = dd5Var.l();
        dd5Var.M(this.i);
        try {
            try {
                zya.b(pa5Var, dd5Var);
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } finally {
            dd5Var.L(n);
            dd5Var.H(m);
            dd5Var.M(l);
        }
    }

    public void w(pa5 pa5Var, Appendable appendable) throws JsonIOException {
        try {
            v(pa5Var, r(zya.c(appendable)));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public void x(Object obj, Type type, dd5 dd5Var) throws JsonIOException {
        TypeAdapter m = m(TypeToken.get(type));
        boolean n = dd5Var.n();
        dd5Var.L(true);
        boolean m2 = dd5Var.m();
        dd5Var.H(this.l);
        boolean l = dd5Var.l();
        dd5Var.M(this.i);
        try {
            try {
                m.write(dd5Var, obj);
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.9): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } finally {
            dd5Var.L(n);
            dd5Var.H(m2);
            dd5Var.M(l);
        }
    }

    public void y(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            x(obj, type, r(zya.c(appendable)));
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Gson(Excluder excluder, ks3 ks3Var, Map<Type, y45<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, oy5 oy5Var, String str, int i, int i2, List<onb> list, List<onb> list2, List<onb> list3, shb shbVar, shb shbVar2) {
        this.a = new ThreadLocal<>();
        this.b = new ConcurrentHashMap();
        this.f = excluder;
        this.g = ks3Var;
        this.h = map;
        rr1 rr1Var = new rr1(map);
        this.c = rr1Var;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        this.o = z7;
        this.s = oy5Var;
        this.p = str;
        this.q = i;
        this.r = i2;
        this.t = list;
        this.u = list2;
        this.v = shbVar;
        this.w = shbVar2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.V);
        arrayList.add(ObjectTypeAdapter.a(shbVar));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.B);
        arrayList.add(TypeAdapters.m);
        arrayList.add(TypeAdapters.g);
        arrayList.add(TypeAdapters.i);
        arrayList.add(TypeAdapters.k);
        TypeAdapter<Number> p = p(oy5Var);
        arrayList.add(TypeAdapters.c(Long.TYPE, Long.class, p));
        arrayList.add(TypeAdapters.c(Double.TYPE, Double.class, e(z7)));
        arrayList.add(TypeAdapters.c(Float.TYPE, Float.class, f(z7)));
        arrayList.add(NumberTypeAdapter.a(shbVar2));
        arrayList.add(TypeAdapters.o);
        arrayList.add(TypeAdapters.q);
        arrayList.add(TypeAdapters.b(AtomicLong.class, b(p)));
        arrayList.add(TypeAdapters.b(AtomicLongArray.class, c(p)));
        arrayList.add(TypeAdapters.s);
        arrayList.add(TypeAdapters.x);
        arrayList.add(TypeAdapters.D);
        arrayList.add(TypeAdapters.F);
        arrayList.add(TypeAdapters.b(BigDecimal.class, TypeAdapters.z));
        arrayList.add(TypeAdapters.b(BigInteger.class, TypeAdapters.A));
        arrayList.add(TypeAdapters.H);
        arrayList.add(TypeAdapters.J);
        arrayList.add(TypeAdapters.N);
        arrayList.add(TypeAdapters.P);
        arrayList.add(TypeAdapters.T);
        arrayList.add(TypeAdapters.L);
        arrayList.add(TypeAdapters.d);
        arrayList.add(DateTypeAdapter.b);
        arrayList.add(TypeAdapters.R);
        if (com.google.gson.internal.sql.a.a) {
            arrayList.add(com.google.gson.internal.sql.a.e);
            arrayList.add(com.google.gson.internal.sql.a.d);
            arrayList.add(com.google.gson.internal.sql.a.f);
        }
        arrayList.add(ArrayTypeAdapter.c);
        arrayList.add(TypeAdapters.b);
        arrayList.add(new CollectionTypeAdapterFactory(rr1Var));
        arrayList.add(new MapTypeAdapterFactory(rr1Var, z2));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(rr1Var);
        this.d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.W);
        arrayList.add(new ReflectiveTypeAdapterFactory(rr1Var, ks3Var, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.e = Collections.unmodifiableList(arrayList);
    }
}
