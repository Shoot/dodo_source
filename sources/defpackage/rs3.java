package defpackage;

import java.lang.reflect.Type;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum f uses external variables
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
/* compiled from: FieldType.java */
/* renamed from: rs3  reason: default package */
/* loaded from: classes.dex */
public final class rs3 {
    public static final rs3 A;
    public static final rs3 B;
    public static final rs3 I;
    public static final rs3 S4;
    public static final rs3 T4;
    public static final rs3 U4;
    public static final rs3 V4;
    public static final rs3 W4;
    public static final rs3 X;
    public static final rs3 X4;
    public static final rs3 Y;
    public static final rs3 Y4;
    public static final rs3 Z;
    public static final rs3 Z4;
    public static final rs3 a5;
    public static final rs3 b5;
    public static final rs3 c5;
    public static final rs3 d5;
    public static final rs3 e5;
    public static final rs3 f;
    public static final rs3 f5;
    public static final rs3 g;
    public static final rs3 g5;
    public static final rs3 h;
    public static final rs3 h5;
    public static final rs3 i;
    public static final rs3 i5;
    public static final rs3 j;
    public static final rs3 j5;
    public static final rs3 k;
    public static final rs3 k5;
    public static final rs3 l;
    public static final rs3 l5;
    public static final rs3 m;
    public static final rs3 m5;
    public static final rs3 n;
    public static final rs3 n5;
    public static final rs3 o;
    public static final rs3 o5;
    public static final rs3 p;
    public static final rs3 p5;
    public static final rs3 q;
    private static final rs3[] q5;
    public static final rs3 r;
    private static final Type[] r5;
    public static final rs3 s;
    private static final /* synthetic */ rs3[] s5;
    public static final rs3 t;
    public static final rs3 u;
    public static final rs3 v;
    public static final rs3 w;
    public static final rs3 x;
    public static final rs3 y;
    public static final rs3 z;
    private final a95 a;
    private final int b;
    private final b c;
    private final Class<?> d;
    private final boolean e;

    /* compiled from: FieldType.java */
    /* renamed from: rs3$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[a95.values().length];
            b = iArr;
            try {
                iArr[a95.k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[a95.m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[a95.j.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: FieldType.java */
    /* renamed from: rs3$b */
    /* loaded from: classes.dex */
    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        
        private final boolean a;

        b(boolean z) {
            this.a = z;
        }
    }

    static {
        b bVar = b.SCALAR;
        a95 a95Var = a95.h;
        f = new rs3("DOUBLE", 0, 0, bVar, a95Var);
        a95 a95Var2 = a95.g;
        g = new rs3("FLOAT", 1, 1, bVar, a95Var2);
        a95 a95Var3 = a95.f;
        h = new rs3("INT64", 2, 2, bVar, a95Var3);
        i = new rs3("UINT64", 3, 3, bVar, a95Var3);
        a95 a95Var4 = a95.e;
        j = new rs3("INT32", 4, 4, bVar, a95Var4);
        k = new rs3("FIXED64", 5, 5, bVar, a95Var3);
        l = new rs3("FIXED32", 6, 6, bVar, a95Var4);
        a95 a95Var5 = a95.i;
        m = new rs3("BOOL", 7, 7, bVar, a95Var5);
        a95 a95Var6 = a95.j;
        n = new rs3("STRING", 8, 8, bVar, a95Var6);
        a95 a95Var7 = a95.m;
        o = new rs3("MESSAGE", 9, 9, bVar, a95Var7);
        a95 a95Var8 = a95.k;
        p = new rs3("BYTES", 10, 10, bVar, a95Var8);
        q = new rs3("UINT32", 11, 11, bVar, a95Var4);
        a95 a95Var9 = a95.l;
        r = new rs3("ENUM", 12, 12, bVar, a95Var9);
        s = new rs3("SFIXED32", 13, 13, bVar, a95Var4);
        t = new rs3("SFIXED64", 14, 14, bVar, a95Var3);
        u = new rs3("SINT32", 15, 15, bVar, a95Var4);
        v = new rs3("SINT64", 16, 16, bVar, a95Var3);
        w = new rs3("GROUP", 17, 17, bVar, a95Var7);
        b bVar2 = b.VECTOR;
        x = new rs3("DOUBLE_LIST", 18, 18, bVar2, a95Var);
        y = new rs3("FLOAT_LIST", 19, 19, bVar2, a95Var2);
        z = new rs3("INT64_LIST", 20, 20, bVar2, a95Var3);
        A = new rs3("UINT64_LIST", 21, 21, bVar2, a95Var3);
        B = new rs3("INT32_LIST", 22, 22, bVar2, a95Var4);
        I = new rs3("FIXED64_LIST", 23, 23, bVar2, a95Var3);
        X = new rs3("FIXED32_LIST", 24, 24, bVar2, a95Var4);
        Y = new rs3("BOOL_LIST", 25, 25, bVar2, a95Var5);
        Z = new rs3("STRING_LIST", 26, 26, bVar2, a95Var6);
        S4 = new rs3("MESSAGE_LIST", 27, 27, bVar2, a95Var7);
        T4 = new rs3("BYTES_LIST", 28, 28, bVar2, a95Var8);
        U4 = new rs3("UINT32_LIST", 29, 29, bVar2, a95Var4);
        V4 = new rs3("ENUM_LIST", 30, 30, bVar2, a95Var9);
        W4 = new rs3("SFIXED32_LIST", 31, 31, bVar2, a95Var4);
        X4 = new rs3("SFIXED64_LIST", 32, 32, bVar2, a95Var3);
        Y4 = new rs3("SINT32_LIST", 33, 33, bVar2, a95Var4);
        Z4 = new rs3("SINT64_LIST", 34, 34, bVar2, a95Var3);
        b bVar3 = b.PACKED_VECTOR;
        a5 = new rs3("DOUBLE_LIST_PACKED", 35, 35, bVar3, a95Var);
        b5 = new rs3("FLOAT_LIST_PACKED", 36, 36, bVar3, a95Var2);
        c5 = new rs3("INT64_LIST_PACKED", 37, 37, bVar3, a95Var3);
        d5 = new rs3("UINT64_LIST_PACKED", 38, 38, bVar3, a95Var3);
        e5 = new rs3("INT32_LIST_PACKED", 39, 39, bVar3, a95Var4);
        f5 = new rs3("FIXED64_LIST_PACKED", 40, 40, bVar3, a95Var3);
        g5 = new rs3("FIXED32_LIST_PACKED", 41, 41, bVar3, a95Var4);
        h5 = new rs3("BOOL_LIST_PACKED", 42, 42, bVar3, a95Var5);
        i5 = new rs3("UINT32_LIST_PACKED", 43, 43, bVar3, a95Var4);
        j5 = new rs3("ENUM_LIST_PACKED", 44, 44, bVar3, a95Var9);
        k5 = new rs3("SFIXED32_LIST_PACKED", 45, 45, bVar3, a95Var4);
        l5 = new rs3("SFIXED64_LIST_PACKED", 46, 46, bVar3, a95Var3);
        m5 = new rs3("SINT32_LIST_PACKED", 47, 47, bVar3, a95Var4);
        n5 = new rs3("SINT64_LIST_PACKED", 48, 48, bVar3, a95Var3);
        o5 = new rs3("GROUP_LIST", 49, 49, bVar2, a95Var7);
        p5 = new rs3("MAP", 50, 50, b.MAP, a95.d);
        s5 = a();
        r5 = new Type[0];
        rs3[] values = values();
        q5 = new rs3[values.length];
        for (rs3 rs3Var : values) {
            q5[rs3Var.b] = rs3Var;
        }
    }

    private rs3(String str, int i2, int i3, b bVar, a95 a95Var) {
        int i4;
        this.b = i3;
        this.c = bVar;
        this.a = a95Var;
        int i6 = a.a[bVar.ordinal()];
        boolean z2 = true;
        if (i6 != 1) {
            if (i6 != 2) {
                this.d = null;
            } else {
                this.d = a95Var.i();
            }
        } else {
            this.d = a95Var.i();
        }
        this.e = (bVar != b.SCALAR || (i4 = a.b[a95Var.ordinal()]) == 1 || i4 == 2 || i4 == 3) ? false : false;
    }

    private static /* synthetic */ rs3[] a() {
        return new rs3[]{f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, I, X, Y, Z, S4, T4, U4, V4, W4, X4, Y4, Z4, a5, b5, c5, d5, e5, f5, g5, h5, i5, j5, k5, l5, m5, n5, o5, p5};
    }

    public static rs3 valueOf(String str) {
        return (rs3) Enum.valueOf(rs3.class, str);
    }

    public static rs3[] values() {
        return (rs3[]) s5.clone();
    }

    public int i() {
        return this.b;
    }
}
