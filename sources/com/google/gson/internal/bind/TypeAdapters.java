package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.slf4j.Marker;
/* loaded from: classes2.dex */
public final class TypeAdapters {
    public static final TypeAdapter<BigInteger> A;
    public static final onb B;
    public static final TypeAdapter<StringBuilder> C;
    public static final onb D;
    public static final TypeAdapter<StringBuffer> E;
    public static final onb F;
    public static final TypeAdapter<URL> G;
    public static final onb H;
    public static final TypeAdapter<URI> I;
    public static final onb J;
    public static final TypeAdapter<InetAddress> K;
    public static final onb L;
    public static final TypeAdapter<UUID> M;
    public static final onb N;
    public static final TypeAdapter<Currency> O;
    public static final onb P;
    public static final TypeAdapter<Calendar> Q;
    public static final onb R;
    public static final TypeAdapter<Locale> S;
    public static final onb T;
    public static final TypeAdapter<pa5> U;
    public static final onb V;
    public static final onb W;
    public static final TypeAdapter<Class> a;
    public static final onb b;
    public static final TypeAdapter<BitSet> c;
    public static final onb d;
    public static final TypeAdapter<Boolean> e;
    public static final TypeAdapter<Boolean> f;
    public static final onb g;
    public static final TypeAdapter<Number> h;
    public static final onb i;
    public static final TypeAdapter<Number> j;
    public static final onb k;
    public static final TypeAdapter<Number> l;
    public static final onb m;
    public static final TypeAdapter<AtomicInteger> n;
    public static final onb o;
    public static final TypeAdapter<AtomicBoolean> p;
    public static final onb q;
    public static final TypeAdapter<AtomicIntegerArray> r;
    public static final onb s;
    public static final TypeAdapter<Number> t;
    public static final TypeAdapter<Number> u;
    public static final TypeAdapter<Number> v;
    public static final TypeAdapter<Character> w;
    public static final onb x;
    public static final TypeAdapter<String> y;
    public static final TypeAdapter<BigDecimal> z;

    /* loaded from: classes2.dex */
    private static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {
        private final Map<String, T> a = new HashMap();
        private final Map<T, String> b = new HashMap();

        /* loaded from: classes2.dex */
        class a implements PrivilegedAction<Void> {
            final /* synthetic */ Field a;

            a(Field field) {
                this.a = field;
            }

            @Override // java.security.PrivilegedAction
            /* renamed from: a */
            public Void run() {
                this.a.setAccessible(true);
                return null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public EnumTypeAdapter(Class<T> cls) {
            Field[] declaredFields;
            try {
                for (Field field : cls.getDeclaredFields()) {
                    if (field.isEnumConstant()) {
                        AccessController.doPrivileged(new a(field));
                        Enum r4 = (Enum) field.get(null);
                        String name = r4.name();
                        uca ucaVar = (uca) field.getAnnotation(uca.class);
                        if (ucaVar != null) {
                            name = ucaVar.value();
                            for (String str : ucaVar.alternate()) {
                                this.a.put(str, r4);
                            }
                        }
                        this.a.put(name, r4);
                        this.b.put(r4, name);
                    }
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public T read(yb5 yb5Var) throws IOException {
            if (yb5Var.N() == mc5.NULL) {
                yb5Var.H();
                return null;
            }
            return this.a.get(yb5Var.L());
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(dd5 dd5Var, T t) throws IOException {
            String str;
            if (t == null) {
                str = null;
            } else {
                str = this.b.get(t);
            }
            dd5Var.T(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[mc5.values().length];
            a = iArr;
            try {
                iArr[mc5.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[mc5.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[mc5.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[mc5.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[mc5.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[mc5.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[mc5.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[mc5.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[mc5.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[mc5.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static {
        TypeAdapter<Class> nullSafe = new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Class read(yb5 yb5Var) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, Class cls) throws IOException {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }
        }.nullSafe();
        a = nullSafe;
        b = b(Class.class, nullSafe);
        TypeAdapter<BitSet> nullSafe2 = new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public BitSet read(yb5 yb5Var) throws IOException {
                BitSet bitSet = new BitSet();
                yb5Var.a();
                mc5 N2 = yb5Var.N();
                int i2 = 0;
                while (N2 != mc5.END_ARRAY) {
                    int i3 = a.a[N2.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 == 3) {
                                String L2 = yb5Var.L();
                                try {
                                    if (Integer.parseInt(L2) == 0) {
                                        i2++;
                                        N2 = yb5Var.N();
                                    }
                                    bitSet.set(i2);
                                    i2++;
                                    N2 = yb5Var.N();
                                } catch (NumberFormatException unused) {
                                    throw new JsonSyntaxException("Error: Expecting: bitset number value (1, 0), Found: " + L2);
                                }
                            } else {
                                throw new JsonSyntaxException("Invalid bitset value type: " + N2);
                            }
                        } else {
                            if (!yb5Var.r()) {
                                i2++;
                                N2 = yb5Var.N();
                            }
                            bitSet.set(i2);
                            i2++;
                            N2 = yb5Var.N();
                        }
                    } else {
                        if (yb5Var.u() == 0) {
                            i2++;
                            N2 = yb5Var.N();
                        }
                        bitSet.set(i2);
                        i2++;
                        N2 = yb5Var.N();
                    }
                }
                yb5Var.j();
                return bitSet;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, BitSet bitSet) throws IOException {
                dd5Var.c();
                int length = bitSet.length();
                for (int i2 = 0; i2 < length; i2++) {
                    dd5Var.P(bitSet.get(i2) ? 1L : 0L);
                }
                dd5Var.j();
            }
        }.nullSafe();
        c = nullSafe2;
        d = b(BitSet.class, nullSafe2);
        TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Boolean read(yb5 yb5Var) throws IOException {
                mc5 N2 = yb5Var.N();
                if (N2 == mc5.NULL) {
                    yb5Var.H();
                    return null;
                } else if (N2 == mc5.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(yb5Var.L()));
                } else {
                    return Boolean.valueOf(yb5Var.r());
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, Boolean bool) throws IOException {
                dd5Var.Q(bool);
            }
        };
        e = typeAdapter;
        f = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Boolean read(yb5 yb5Var) throws IOException {
                if (yb5Var.N() == mc5.NULL) {
                    yb5Var.H();
                    return null;
                }
                return Boolean.valueOf(yb5Var.L());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, Boolean bool) throws IOException {
                String bool2;
                if (bool == null) {
                    bool2 = "null";
                } else {
                    bool2 = bool.toString();
                }
                dd5Var.T(bool2);
            }
        };
        g = c(Boolean.TYPE, Boolean.class, typeAdapter);
        TypeAdapter<Number> typeAdapter2 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(yb5 yb5Var) throws IOException {
                if (yb5Var.N() == mc5.NULL) {
                    yb5Var.H();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) yb5Var.u());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, Number number) throws IOException {
                dd5Var.S(number);
            }
        };
        h = typeAdapter2;
        i = c(Byte.TYPE, Byte.class, typeAdapter2);
        TypeAdapter<Number> typeAdapter3 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(yb5 yb5Var) throws IOException {
                if (yb5Var.N() == mc5.NULL) {
                    yb5Var.H();
                    return null;
                }
                try {
                    return Short.valueOf((short) yb5Var.u());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, Number number) throws IOException {
                dd5Var.S(number);
            }
        };
        j = typeAdapter3;
        k = c(Short.TYPE, Short.class, typeAdapter3);
        TypeAdapter<Number> typeAdapter4 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(yb5 yb5Var) throws IOException {
                if (yb5Var.N() == mc5.NULL) {
                    yb5Var.H();
                    return null;
                }
                try {
                    return Integer.valueOf(yb5Var.u());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, Number number) throws IOException {
                dd5Var.S(number);
            }
        };
        l = typeAdapter4;
        m = c(Integer.TYPE, Integer.class, typeAdapter4);
        TypeAdapter<AtomicInteger> nullSafe3 = new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public AtomicInteger read(yb5 yb5Var) throws IOException {
                try {
                    return new AtomicInteger(yb5Var.u());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, AtomicInteger atomicInteger) throws IOException {
                dd5Var.P(atomicInteger.get());
            }
        }.nullSafe();
        n = nullSafe3;
        o = b(AtomicInteger.class, nullSafe3);
        TypeAdapter<AtomicBoolean> nullSafe4 = new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public AtomicBoolean read(yb5 yb5Var) throws IOException {
                return new AtomicBoolean(yb5Var.r());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, AtomicBoolean atomicBoolean) throws IOException {
                dd5Var.W(atomicBoolean.get());
            }
        }.nullSafe();
        p = nullSafe4;
        q = b(AtomicBoolean.class, nullSafe4);
        TypeAdapter<AtomicIntegerArray> nullSafe5 = new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public AtomicIntegerArray read(yb5 yb5Var) throws IOException {
                ArrayList arrayList = new ArrayList();
                yb5Var.a();
                while (yb5Var.m()) {
                    try {
                        arrayList.add(Integer.valueOf(yb5Var.u()));
                    } catch (NumberFormatException e2) {
                        throw new JsonSyntaxException(e2);
                    }
                }
                yb5Var.j();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, AtomicIntegerArray atomicIntegerArray) throws IOException {
                dd5Var.c();
                int length = atomicIntegerArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    dd5Var.P(atomicIntegerArray.get(i2));
                }
                dd5Var.j();
            }
        }.nullSafe();
        r = nullSafe5;
        s = b(AtomicIntegerArray.class, nullSafe5);
        t = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(yb5 yb5Var) throws IOException {
                if (yb5Var.N() == mc5.NULL) {
                    yb5Var.H();
                    return null;
                }
                try {
                    return Long.valueOf(yb5Var.x());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, Number number) throws IOException {
                dd5Var.S(number);
            }
        };
        u = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(yb5 yb5Var) throws IOException {
                if (yb5Var.N() == mc5.NULL) {
                    yb5Var.H();
                    return null;
                }
                return Float.valueOf((float) yb5Var.s());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, Number number) throws IOException {
                dd5Var.S(number);
            }
        };
        v = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(yb5 yb5Var) throws IOException {
                if (yb5Var.N() == mc5.NULL) {
                    yb5Var.H();
                    return null;
                }
                return Double.valueOf(yb5Var.s());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, Number number) throws IOException {
                dd5Var.S(number);
            }
        };
        TypeAdapter<Character> typeAdapter5 = new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Character read(yb5 yb5Var) throws IOException {
                if (yb5Var.N() == mc5.NULL) {
                    yb5Var.H();
                    return null;
                }
                String L2 = yb5Var.L();
                if (L2.length() == 1) {
                    return Character.valueOf(L2.charAt(0));
                }
                throw new JsonSyntaxException("Expecting character, got: " + L2);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, Character ch2) throws IOException {
                String valueOf;
                if (ch2 == null) {
                    valueOf = null;
                } else {
                    valueOf = String.valueOf(ch2);
                }
                dd5Var.T(valueOf);
            }
        };
        w = typeAdapter5;
        x = c(Character.TYPE, Character.class, typeAdapter5);
        TypeAdapter<String> typeAdapter6 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public String read(yb5 yb5Var) throws IOException {
                mc5 N2 = yb5Var.N();
                if (N2 == mc5.NULL) {
                    yb5Var.H();
                    return null;
                } else if (N2 == mc5.BOOLEAN) {
                    return Boolean.toString(yb5Var.r());
                } else {
                    return yb5Var.L();
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, String str) throws IOException {
                dd5Var.T(str);
            }
        };
        y = typeAdapter6;
        z = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public BigDecimal read(yb5 yb5Var) throws IOException {
                if (yb5Var.N() == mc5.NULL) {
                    yb5Var.H();
                    return null;
                }
                try {
                    return new BigDecimal(yb5Var.L());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, BigDecimal bigDecimal) throws IOException {
                dd5Var.S(bigDecimal);
            }
        };
        A = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public BigInteger read(yb5 yb5Var) throws IOException {
                if (yb5Var.N() == mc5.NULL) {
                    yb5Var.H();
                    return null;
                }
                try {
                    return new BigInteger(yb5Var.L());
                } catch (NumberFormatException e2) {
                    throw new JsonSyntaxException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, BigInteger bigInteger) throws IOException {
                dd5Var.S(bigInteger);
            }
        };
        B = b(String.class, typeAdapter6);
        TypeAdapter<StringBuilder> typeAdapter7 = new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public StringBuilder read(yb5 yb5Var) throws IOException {
                if (yb5Var.N() == mc5.NULL) {
                    yb5Var.H();
                    return null;
                }
                return new StringBuilder(yb5Var.L());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, StringBuilder sb) throws IOException {
                String sb2;
                if (sb == null) {
                    sb2 = null;
                } else {
                    sb2 = sb.toString();
                }
                dd5Var.T(sb2);
            }
        };
        C = typeAdapter7;
        D = b(StringBuilder.class, typeAdapter7);
        TypeAdapter<StringBuffer> typeAdapter8 = new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public StringBuffer read(yb5 yb5Var) throws IOException {
                if (yb5Var.N() == mc5.NULL) {
                    yb5Var.H();
                    return null;
                }
                return new StringBuffer(yb5Var.L());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, StringBuffer stringBuffer) throws IOException {
                String stringBuffer2;
                if (stringBuffer == null) {
                    stringBuffer2 = null;
                } else {
                    stringBuffer2 = stringBuffer.toString();
                }
                dd5Var.T(stringBuffer2);
            }
        };
        E = typeAdapter8;
        F = b(StringBuffer.class, typeAdapter8);
        TypeAdapter<URL> typeAdapter9 = new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public URL read(yb5 yb5Var) throws IOException {
                if (yb5Var.N() == mc5.NULL) {
                    yb5Var.H();
                    return null;
                }
                String L2 = yb5Var.L();
                if ("null".equals(L2)) {
                    return null;
                }
                return new URL(L2);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, URL url) throws IOException {
                String externalForm;
                if (url == null) {
                    externalForm = null;
                } else {
                    externalForm = url.toExternalForm();
                }
                dd5Var.T(externalForm);
            }
        };
        G = typeAdapter9;
        H = b(URL.class, typeAdapter9);
        TypeAdapter<URI> typeAdapter10 = new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public URI read(yb5 yb5Var) throws IOException {
                if (yb5Var.N() == mc5.NULL) {
                    yb5Var.H();
                    return null;
                }
                try {
                    String L2 = yb5Var.L();
                    if ("null".equals(L2)) {
                        return null;
                    }
                    return new URI(L2);
                } catch (URISyntaxException e2) {
                    throw new JsonIOException(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, URI uri) throws IOException {
                String aSCIIString;
                if (uri == null) {
                    aSCIIString = null;
                } else {
                    aSCIIString = uri.toASCIIString();
                }
                dd5Var.T(aSCIIString);
            }
        };
        I = typeAdapter10;
        J = b(URI.class, typeAdapter10);
        TypeAdapter<InetAddress> typeAdapter11 = new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public InetAddress read(yb5 yb5Var) throws IOException {
                if (yb5Var.N() == mc5.NULL) {
                    yb5Var.H();
                    return null;
                }
                return InetAddress.getByName(yb5Var.L());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, InetAddress inetAddress) throws IOException {
                String hostAddress;
                if (inetAddress == null) {
                    hostAddress = null;
                } else {
                    hostAddress = inetAddress.getHostAddress();
                }
                dd5Var.T(hostAddress);
            }
        };
        K = typeAdapter11;
        L = e(InetAddress.class, typeAdapter11);
        TypeAdapter<UUID> typeAdapter12 = new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public UUID read(yb5 yb5Var) throws IOException {
                if (yb5Var.N() == mc5.NULL) {
                    yb5Var.H();
                    return null;
                }
                return UUID.fromString(yb5Var.L());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, UUID uuid) throws IOException {
                String uuid2;
                if (uuid == null) {
                    uuid2 = null;
                } else {
                    uuid2 = uuid.toString();
                }
                dd5Var.T(uuid2);
            }
        };
        M = typeAdapter12;
        N = b(UUID.class, typeAdapter12);
        TypeAdapter<Currency> nullSafe6 = new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Currency read(yb5 yb5Var) throws IOException {
                return Currency.getInstance(yb5Var.L());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, Currency currency) throws IOException {
                dd5Var.T(currency.getCurrencyCode());
            }
        }.nullSafe();
        O = nullSafe6;
        P = b(Currency.class, nullSafe6);
        TypeAdapter<Calendar> typeAdapter13 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Calendar read(yb5 yb5Var) throws IOException {
                if (yb5Var.N() == mc5.NULL) {
                    yb5Var.H();
                    return null;
                }
                yb5Var.b();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (yb5Var.N() != mc5.END_OBJECT) {
                    String y2 = yb5Var.y();
                    int u2 = yb5Var.u();
                    if ("year".equals(y2)) {
                        i2 = u2;
                    } else if ("month".equals(y2)) {
                        i3 = u2;
                    } else if ("dayOfMonth".equals(y2)) {
                        i4 = u2;
                    } else if ("hourOfDay".equals(y2)) {
                        i5 = u2;
                    } else if ("minute".equals(y2)) {
                        i6 = u2;
                    } else if ("second".equals(y2)) {
                        i7 = u2;
                    }
                }
                yb5Var.k();
                return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, Calendar calendar) throws IOException {
                if (calendar == null) {
                    dd5Var.s();
                    return;
                }
                dd5Var.e();
                dd5Var.q("year");
                dd5Var.P(calendar.get(1));
                dd5Var.q("month");
                dd5Var.P(calendar.get(2));
                dd5Var.q("dayOfMonth");
                dd5Var.P(calendar.get(5));
                dd5Var.q("hourOfDay");
                dd5Var.P(calendar.get(11));
                dd5Var.q("minute");
                dd5Var.P(calendar.get(12));
                dd5Var.q("second");
                dd5Var.P(calendar.get(13));
                dd5Var.k();
            }
        };
        Q = typeAdapter13;
        R = d(Calendar.class, GregorianCalendar.class, typeAdapter13);
        TypeAdapter<Locale> typeAdapter14 = new TypeAdapter<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Locale read(yb5 yb5Var) throws IOException {
                String str;
                String str2;
                String str3 = null;
                if (yb5Var.N() == mc5.NULL) {
                    yb5Var.H();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(yb5Var.L(), "_");
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                } else {
                    str = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str2 = stringTokenizer.nextToken();
                } else {
                    str2 = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str3 = stringTokenizer.nextToken();
                }
                if (str2 == null && str3 == null) {
                    return new Locale(str);
                }
                if (str3 == null) {
                    return new Locale(str, str2);
                }
                return new Locale(str, str2, str3);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, Locale locale) throws IOException {
                String locale2;
                if (locale == null) {
                    locale2 = null;
                } else {
                    locale2 = locale.toString();
                }
                dd5Var.T(locale2);
            }
        };
        S = typeAdapter14;
        T = b(Locale.class, typeAdapter14);
        TypeAdapter<pa5> typeAdapter15 = new TypeAdapter<pa5>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public pa5 read(yb5 yb5Var) throws IOException {
                if (yb5Var instanceof com.google.gson.internal.bind.a) {
                    return ((com.google.gson.internal.bind.a) yb5Var).o0();
                }
                switch (a.a[yb5Var.N().ordinal()]) {
                    case 1:
                        return new qb5(new on5(yb5Var.L()));
                    case 2:
                        return new qb5(Boolean.valueOf(yb5Var.r()));
                    case 3:
                        return new qb5(yb5Var.L());
                    case 4:
                        yb5Var.H();
                        return lb5.a;
                    case 5:
                        ca5 ca5Var = new ca5();
                        yb5Var.a();
                        while (yb5Var.m()) {
                            ca5Var.v(read(yb5Var));
                        }
                        yb5Var.j();
                        return ca5Var;
                    case 6:
                        mb5 mb5Var = new mb5();
                        yb5Var.b();
                        while (yb5Var.m()) {
                            mb5Var.v(yb5Var.y(), read(yb5Var));
                        }
                        yb5Var.k();
                        return mb5Var;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(dd5 dd5Var, pa5 pa5Var) throws IOException {
                if (pa5Var != null && !pa5Var.p()) {
                    if (pa5Var.u()) {
                        qb5 g2 = pa5Var.g();
                        if (g2.C()) {
                            dd5Var.S(g2.z());
                            return;
                        } else if (g2.A()) {
                            dd5Var.W(g2.v());
                            return;
                        } else {
                            dd5Var.T(g2.h());
                            return;
                        }
                    } else if (pa5Var.k()) {
                        dd5Var.c();
                        Iterator<pa5> it = pa5Var.d().iterator();
                        while (it.hasNext()) {
                            write(dd5Var, it.next());
                        }
                        dd5Var.j();
                        return;
                    } else if (pa5Var.t()) {
                        dd5Var.e();
                        for (Map.Entry<String, pa5> entry : pa5Var.f().A()) {
                            dd5Var.q(entry.getKey());
                            write(dd5Var, entry.getValue());
                        }
                        dd5Var.k();
                        return;
                    } else {
                        throw new IllegalArgumentException("Couldn't write " + pa5Var.getClass());
                    }
                }
                dd5Var.s();
            }
        };
        U = typeAdapter15;
        V = e(pa5.class, typeAdapter15);
        W = new onb() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            @Override // defpackage.onb
            public <T> TypeAdapter<T> b(Gson gson, TypeToken<T> typeToken) {
                Class rawType = typeToken.getRawType();
                if (Enum.class.isAssignableFrom(rawType) && rawType != Enum.class) {
                    if (!rawType.isEnum()) {
                        rawType = (Class<? super Object>) rawType.getSuperclass();
                    }
                    return new EnumTypeAdapter(rawType);
                }
                return null;
            }
        };
    }

    public static <TT> onb a(final TypeToken<TT> typeToken, final TypeAdapter<TT> typeAdapter) {
        return new onb() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // defpackage.onb
            public <T> TypeAdapter<T> b(Gson gson, TypeToken<T> typeToken2) {
                if (typeToken2.equals(TypeToken.this)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static <TT> onb b(final Class<TT> cls, final TypeAdapter<TT> typeAdapter) {
        return new onb() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // defpackage.onb
            public <T> TypeAdapter<T> b(Gson gson, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == cls) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <TT> onb c(final Class<TT> cls, final Class<TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new onb() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // defpackage.onb
            public <T> TypeAdapter<T> b(Gson gson, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (rawType != cls && rawType != cls2) {
                    return null;
                }
                return typeAdapter;
            }

            public String toString() {
                return "Factory[type=" + cls2.getName() + Marker.ANY_NON_NULL_MARKER + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <TT> onb d(final Class<TT> cls, final Class<? extends TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new onb() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // defpackage.onb
            public <T> TypeAdapter<T> b(Gson gson, TypeToken<T> typeToken) {
                Class<? super T> rawType = typeToken.getRawType();
                if (rawType != cls && rawType != cls2) {
                    return null;
                }
                return typeAdapter;
            }

            public String toString() {
                return "Factory[type=" + cls.getName() + Marker.ANY_NON_NULL_MARKER + cls2.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }

    public static <T1> onb e(final Class<T1> cls, final TypeAdapter<T1> typeAdapter) {
        return new onb() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // defpackage.onb
            public <T2> TypeAdapter<T2> b(Gson gson, TypeToken<T2> typeToken) {
                final Class<? super T2> rawType = typeToken.getRawType();
                if (!cls.isAssignableFrom(rawType)) {
                    return null;
                }
                return (TypeAdapter<T2>) new TypeAdapter<T1>() { // from class: com.google.gson.internal.bind.TypeAdapters.33.1
                    @Override // com.google.gson.TypeAdapter
                    public T1 read(yb5 yb5Var) throws IOException {
                        T1 t1 = (T1) typeAdapter.read(yb5Var);
                        if (t1 != null && !rawType.isInstance(t1)) {
                            throw new JsonSyntaxException("Expected a " + rawType.getName() + " but was " + t1.getClass().getName());
                        }
                        return t1;
                    }

                    @Override // com.google.gson.TypeAdapter
                    public void write(dd5 dd5Var, T1 t1) throws IOException {
                        typeAdapter.write(dd5Var, t1);
                    }
                };
            }

            public String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + typeAdapter + "]";
            }
        };
    }
}
