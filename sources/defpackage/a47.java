package defpackage;

import com.fasterxml.jackson.databind.JsonMappingException;
import defpackage.ob5;
import defpackage.ta5;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
/* compiled from: NumberSerializers.java */
/* renamed from: a47  reason: default package */
/* loaded from: classes2.dex */
public class a47 {

    /* compiled from: NumberSerializers.java */
    /* renamed from: a47$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ta5.c.values().length];
            a = iArr;
            try {
                iArr[ta5.c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: NumberSerializers.java */
    /* renamed from: a47$b */
    /* loaded from: classes2.dex */
    public static abstract class b<T> extends bxa<T> implements bv1 {
        protected final ob5.b c;
        protected final String d;
        protected final boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        protected b(Class<?> cls, ob5.b bVar, String str) {
            super(cls, false);
            boolean z = false;
            this.c = bVar;
            this.d = str;
            this.e = (bVar == ob5.b.INT || bVar == ob5.b.LONG || bVar == ob5.b.BIG_INTEGER) ? true : true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.bv1
        public gc5<?> a(bda bdaVar, ia0 ia0Var) throws JsonMappingException {
            ta5.d s = s(bdaVar, ia0Var, c());
            if (s != null && a.a[s.j().ordinal()] == 1) {
                if (c() == BigDecimal.class) {
                    return z37.G();
                }
                return uhb.c;
            }
            return this;
        }
    }

    /* compiled from: NumberSerializers.java */
    @o85
    /* renamed from: a47$c */
    /* loaded from: classes2.dex */
    public static class c extends b<Object> {
        public c(Class<?> cls) {
            super(cls, ob5.b.DOUBLE, "number");
        }

        @Override // defpackage.cxa, defpackage.gc5
        public void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
            ua5Var.m0(((Double) obj).doubleValue());
        }

        @Override // defpackage.bxa, defpackage.gc5
        public void i(Object obj, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
            Double d = (Double) obj;
            if (y37.h(d.doubleValue())) {
                c9c g = bobVar.g(ua5Var, bobVar.d(obj, nc5.VALUE_NUMBER_FLOAT));
                ua5Var.m0(d.doubleValue());
                bobVar.h(ua5Var, g);
                return;
            }
            ua5Var.m0(d.doubleValue());
        }
    }

    /* compiled from: NumberSerializers.java */
    @o85
    /* renamed from: a47$d */
    /* loaded from: classes2.dex */
    public static class d extends b<Object> {
        static final d f = new d();

        public d() {
            super(Float.class, ob5.b.FLOAT, "number");
        }

        @Override // defpackage.cxa, defpackage.gc5
        public void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
            ua5Var.n0(((Float) obj).floatValue());
        }
    }

    /* compiled from: NumberSerializers.java */
    @o85
    /* renamed from: a47$e */
    /* loaded from: classes2.dex */
    public static class e extends b<Object> {
        static final e f = new e();

        public e() {
            super(Number.class, ob5.b.INT, "integer");
        }

        @Override // defpackage.cxa, defpackage.gc5
        public void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
            ua5Var.o0(((Number) obj).intValue());
        }
    }

    /* compiled from: NumberSerializers.java */
    @o85
    /* renamed from: a47$f */
    /* loaded from: classes2.dex */
    public static class f extends b<Object> {
        public f(Class<?> cls) {
            super(cls, ob5.b.INT, "integer");
        }

        @Override // defpackage.cxa, defpackage.gc5
        public void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
            ua5Var.o0(((Integer) obj).intValue());
        }

        @Override // defpackage.bxa, defpackage.gc5
        public void i(Object obj, ua5 ua5Var, bda bdaVar, bob bobVar) throws IOException {
            f(obj, ua5Var, bdaVar);
        }
    }

    /* compiled from: NumberSerializers.java */
    @o85
    /* renamed from: a47$g */
    /* loaded from: classes2.dex */
    public static class g extends b<Object> {
        public g(Class<?> cls) {
            super(cls, ob5.b.LONG, "number");
        }

        @Override // defpackage.cxa, defpackage.gc5
        public void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
            ua5Var.p0(((Long) obj).longValue());
        }
    }

    /* compiled from: NumberSerializers.java */
    @o85
    /* renamed from: a47$h */
    /* loaded from: classes2.dex */
    public static class h extends b<Object> {
        static final h f = new h();

        public h() {
            super(Short.class, ob5.b.INT, "number");
        }

        @Override // defpackage.cxa, defpackage.gc5
        public void f(Object obj, ua5 ua5Var, bda bdaVar) throws IOException {
            ua5Var.z0(((Short) obj).shortValue());
        }
    }

    public static void a(Map<String, gc5<?>> map) {
        map.put(Integer.class.getName(), new f(Integer.class));
        Class cls = Integer.TYPE;
        map.put(cls.getName(), new f(cls));
        map.put(Long.class.getName(), new g(Long.class));
        Class cls2 = Long.TYPE;
        map.put(cls2.getName(), new g(cls2));
        String name = Byte.class.getName();
        e eVar = e.f;
        map.put(name, eVar);
        map.put(Byte.TYPE.getName(), eVar);
        String name2 = Short.class.getName();
        h hVar = h.f;
        map.put(name2, hVar);
        map.put(Short.TYPE.getName(), hVar);
        map.put(Double.class.getName(), new c(Double.class));
        Class cls3 = Double.TYPE;
        map.put(cls3.getName(), new c(cls3));
        String name3 = Float.class.getName();
        d dVar = d.f;
        map.put(name3, dVar);
        map.put(Float.TYPE.getName(), dVar);
    }
}
