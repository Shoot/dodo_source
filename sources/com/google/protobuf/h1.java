package com.google.protobuf;
/* compiled from: WireFormat.java */
/* loaded from: classes.dex */
public final class h1 {
    static final int a = c(1, 3);
    static final int b = c(1, 4);
    static final int c = c(2, 0);
    static final int d = c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum e uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: WireFormat.java */
    /* loaded from: classes.dex */
    public static class b {
        public static final b c = new b("DOUBLE", 0, c.DOUBLE, 1);
        public static final b d = new b("FLOAT", 1, c.FLOAT, 5);
        public static final b e;
        public static final b f;
        public static final b g;
        public static final b h;
        public static final b i;
        public static final b j;
        public static final b k;
        public static final b l;
        public static final b m;
        public static final b n;
        public static final b o;
        public static final b p;
        public static final b q;
        public static final b r;
        public static final b s;
        public static final b t;
        private static final /* synthetic */ b[] u;
        private final c a;
        private final int b;

        /* compiled from: WireFormat.java */
        /* loaded from: classes.dex */
        enum a extends b {
            a(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2);
            }
        }

        /* compiled from: WireFormat.java */
        /* renamed from: com.google.protobuf.h1$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        enum C0251b extends b {
            C0251b(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2);
            }
        }

        /* compiled from: WireFormat.java */
        /* loaded from: classes.dex */
        enum c extends b {
            c(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2);
            }
        }

        /* compiled from: WireFormat.java */
        /* loaded from: classes.dex */
        enum d extends b {
            d(String str, int i, c cVar, int i2) {
                super(str, i, cVar, i2);
            }
        }

        static {
            c cVar = c.LONG;
            e = new b("INT64", 2, cVar, 0);
            f = new b("UINT64", 3, cVar, 0);
            c cVar2 = c.INT;
            g = new b("INT32", 4, cVar2, 0);
            h = new b("FIXED64", 5, cVar, 1);
            i = new b("FIXED32", 6, cVar2, 5);
            j = new b("BOOL", 7, c.BOOLEAN, 0);
            k = new a("STRING", 8, c.STRING, 2);
            c cVar3 = c.MESSAGE;
            l = new C0251b("GROUP", 9, cVar3, 3);
            m = new c("MESSAGE", 10, cVar3, 2);
            n = new d("BYTES", 11, c.BYTE_STRING, 2);
            o = new b("UINT32", 12, cVar2, 0);
            p = new b("ENUM", 13, c.ENUM, 0);
            q = new b("SFIXED32", 14, cVar2, 5);
            r = new b("SFIXED64", 15, cVar, 1);
            s = new b("SINT32", 16, cVar2, 0);
            t = new b("SINT64", 17, cVar, 0);
            u = a();
        }

        private static /* synthetic */ b[] a() {
            return new b[]{c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) u.clone();
        }

        public c i() {
            return this.a;
        }

        public int k() {
            return this.b;
        }

        private b(String str, int i2, c cVar, int i3) {
            this.a = cVar;
            this.b = i3;
        }
    }

    /* compiled from: WireFormat.java */
    /* loaded from: classes.dex */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(f.b),
        ENUM(null),
        MESSAGE(null);
        
        private final Object a;

        c(Object obj) {
            this.a = obj;
        }
    }

    public static int a(int i) {
        return i >>> 3;
    }

    public static int b(int i) {
        return i & 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i, int i2) {
        return (i << 3) | i2;
    }
}
