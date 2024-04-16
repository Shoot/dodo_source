package defpackage;

import java.lang.reflect.Type;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum f uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: FieldType.java */
/* renamed from: ps3  reason: default package */
/* loaded from: classes.dex */
public final class ps3 {
    public static final ps3 A;
    public static final ps3 B;
    public static final ps3 I;
    public static final ps3 S4;
    public static final ps3 T4;
    public static final ps3 U4;
    public static final ps3 V4;
    public static final ps3 W4;
    public static final ps3 X;
    public static final ps3 X4;
    public static final ps3 Y;
    public static final ps3 Y4;
    public static final ps3 Z;
    public static final ps3 Z4;
    public static final ps3 a5;
    public static final ps3 b5;
    public static final ps3 c5;
    public static final ps3 d5;
    public static final ps3 e5;
    public static final ps3 f;
    public static final ps3 f5;
    public static final ps3 g;
    public static final ps3 g5;
    public static final ps3 h;
    public static final ps3 h5;
    public static final ps3 i;
    public static final ps3 i5;
    public static final ps3 j;
    public static final ps3 j5;
    public static final ps3 k;
    public static final ps3 k5;
    public static final ps3 l;
    public static final ps3 l5;
    public static final ps3 m;
    public static final ps3 m5;
    public static final ps3 n;
    public static final ps3 n5;
    public static final ps3 o;
    public static final ps3 o5;
    public static final ps3 p;
    public static final ps3 p5;
    public static final ps3 q;
    private static final ps3[] q5;
    public static final ps3 r;
    private static final Type[] r5;
    public static final ps3 s;
    private static final /* synthetic */ ps3[] s5;
    public static final ps3 t;
    public static final ps3 u;
    public static final ps3 v;
    public static final ps3 w;
    public static final ps3 x;
    public static final ps3 y;
    public static final ps3 z;
    private final b95 a;
    private final int b;
    private final b c;
    private final Class<?> d;
    private final boolean e;

    /* compiled from: FieldType.java */
    /* renamed from: ps3$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b95.values().length];
            b = iArr;
            try {
                iArr[b95.k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b95.m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b95.j.ordinal()] = 3;
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
    /* renamed from: ps3$b */
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
        b95 b95Var = b95.h;
        ps3 ps3Var = new ps3("DOUBLE", 0, 0, bVar, b95Var);
        f = ps3Var;
        b95 b95Var2 = b95.g;
        ps3 ps3Var2 = new ps3("FLOAT", 1, 1, bVar, b95Var2);
        g = ps3Var2;
        b95 b95Var3 = b95.f;
        ps3 ps3Var3 = new ps3("INT64", 2, 2, bVar, b95Var3);
        h = ps3Var3;
        ps3 ps3Var4 = new ps3("UINT64", 3, 3, bVar, b95Var3);
        i = ps3Var4;
        b95 b95Var4 = b95.e;
        ps3 ps3Var5 = new ps3("INT32", 4, 4, bVar, b95Var4);
        j = ps3Var5;
        ps3 ps3Var6 = new ps3("FIXED64", 5, 5, bVar, b95Var3);
        k = ps3Var6;
        ps3 ps3Var7 = new ps3("FIXED32", 6, 6, bVar, b95Var4);
        l = ps3Var7;
        b95 b95Var5 = b95.i;
        ps3 ps3Var8 = new ps3("BOOL", 7, 7, bVar, b95Var5);
        m = ps3Var8;
        b95 b95Var6 = b95.j;
        ps3 ps3Var9 = new ps3("STRING", 8, 8, bVar, b95Var6);
        n = ps3Var9;
        b95 b95Var7 = b95.m;
        ps3 ps3Var10 = new ps3("MESSAGE", 9, 9, bVar, b95Var7);
        o = ps3Var10;
        b95 b95Var8 = b95.k;
        ps3 ps3Var11 = new ps3("BYTES", 10, 10, bVar, b95Var8);
        p = ps3Var11;
        ps3 ps3Var12 = new ps3("UINT32", 11, 11, bVar, b95Var4);
        q = ps3Var12;
        b95 b95Var9 = b95.l;
        ps3 ps3Var13 = new ps3("ENUM", 12, 12, bVar, b95Var9);
        r = ps3Var13;
        ps3 ps3Var14 = new ps3("SFIXED32", 13, 13, bVar, b95Var4);
        s = ps3Var14;
        ps3 ps3Var15 = new ps3("SFIXED64", 14, 14, bVar, b95Var3);
        t = ps3Var15;
        ps3 ps3Var16 = new ps3("SINT32", 15, 15, bVar, b95Var4);
        u = ps3Var16;
        ps3 ps3Var17 = new ps3("SINT64", 16, 16, bVar, b95Var3);
        v = ps3Var17;
        ps3 ps3Var18 = new ps3("GROUP", 17, 17, bVar, b95Var7);
        w = ps3Var18;
        b bVar2 = b.VECTOR;
        ps3 ps3Var19 = new ps3("DOUBLE_LIST", 18, 18, bVar2, b95Var);
        x = ps3Var19;
        ps3 ps3Var20 = new ps3("FLOAT_LIST", 19, 19, bVar2, b95Var2);
        y = ps3Var20;
        ps3 ps3Var21 = new ps3("INT64_LIST", 20, 20, bVar2, b95Var3);
        z = ps3Var21;
        ps3 ps3Var22 = new ps3("UINT64_LIST", 21, 21, bVar2, b95Var3);
        A = ps3Var22;
        ps3 ps3Var23 = new ps3("INT32_LIST", 22, 22, bVar2, b95Var4);
        B = ps3Var23;
        ps3 ps3Var24 = new ps3("FIXED64_LIST", 23, 23, bVar2, b95Var3);
        I = ps3Var24;
        ps3 ps3Var25 = new ps3("FIXED32_LIST", 24, 24, bVar2, b95Var4);
        X = ps3Var25;
        ps3 ps3Var26 = new ps3("BOOL_LIST", 25, 25, bVar2, b95Var5);
        Y = ps3Var26;
        ps3 ps3Var27 = new ps3("STRING_LIST", 26, 26, bVar2, b95Var6);
        Z = ps3Var27;
        ps3 ps3Var28 = new ps3("MESSAGE_LIST", 27, 27, bVar2, b95Var7);
        S4 = ps3Var28;
        ps3 ps3Var29 = new ps3("BYTES_LIST", 28, 28, bVar2, b95Var8);
        T4 = ps3Var29;
        ps3 ps3Var30 = new ps3("UINT32_LIST", 29, 29, bVar2, b95Var4);
        U4 = ps3Var30;
        ps3 ps3Var31 = new ps3("ENUM_LIST", 30, 30, bVar2, b95Var9);
        V4 = ps3Var31;
        ps3 ps3Var32 = new ps3("SFIXED32_LIST", 31, 31, bVar2, b95Var4);
        W4 = ps3Var32;
        ps3 ps3Var33 = new ps3("SFIXED64_LIST", 32, 32, bVar2, b95Var3);
        X4 = ps3Var33;
        ps3 ps3Var34 = new ps3("SINT32_LIST", 33, 33, bVar2, b95Var4);
        Y4 = ps3Var34;
        ps3 ps3Var35 = new ps3("SINT64_LIST", 34, 34, bVar2, b95Var3);
        Z4 = ps3Var35;
        b bVar3 = b.PACKED_VECTOR;
        ps3 ps3Var36 = new ps3("DOUBLE_LIST_PACKED", 35, 35, bVar3, b95Var);
        a5 = ps3Var36;
        ps3 ps3Var37 = new ps3("FLOAT_LIST_PACKED", 36, 36, bVar3, b95Var2);
        b5 = ps3Var37;
        ps3 ps3Var38 = new ps3("INT64_LIST_PACKED", 37, 37, bVar3, b95Var3);
        c5 = ps3Var38;
        ps3 ps3Var39 = new ps3("UINT64_LIST_PACKED", 38, 38, bVar3, b95Var3);
        d5 = ps3Var39;
        ps3 ps3Var40 = new ps3("INT32_LIST_PACKED", 39, 39, bVar3, b95Var4);
        e5 = ps3Var40;
        ps3 ps3Var41 = new ps3("FIXED64_LIST_PACKED", 40, 40, bVar3, b95Var3);
        f5 = ps3Var41;
        ps3 ps3Var42 = new ps3("FIXED32_LIST_PACKED", 41, 41, bVar3, b95Var4);
        g5 = ps3Var42;
        ps3 ps3Var43 = new ps3("BOOL_LIST_PACKED", 42, 42, bVar3, b95Var5);
        h5 = ps3Var43;
        ps3 ps3Var44 = new ps3("UINT32_LIST_PACKED", 43, 43, bVar3, b95Var4);
        i5 = ps3Var44;
        ps3 ps3Var45 = new ps3("ENUM_LIST_PACKED", 44, 44, bVar3, b95Var9);
        j5 = ps3Var45;
        ps3 ps3Var46 = new ps3("SFIXED32_LIST_PACKED", 45, 45, bVar3, b95Var4);
        k5 = ps3Var46;
        ps3 ps3Var47 = new ps3("SFIXED64_LIST_PACKED", 46, 46, bVar3, b95Var3);
        l5 = ps3Var47;
        ps3 ps3Var48 = new ps3("SINT32_LIST_PACKED", 47, 47, bVar3, b95Var4);
        m5 = ps3Var48;
        ps3 ps3Var49 = new ps3("SINT64_LIST_PACKED", 48, 48, bVar3, b95Var3);
        n5 = ps3Var49;
        ps3 ps3Var50 = new ps3("GROUP_LIST", 49, 49, bVar2, b95Var7);
        o5 = ps3Var50;
        ps3 ps3Var51 = new ps3("MAP", 50, 50, b.MAP, b95.d);
        p5 = ps3Var51;
        s5 = new ps3[]{ps3Var, ps3Var2, ps3Var3, ps3Var4, ps3Var5, ps3Var6, ps3Var7, ps3Var8, ps3Var9, ps3Var10, ps3Var11, ps3Var12, ps3Var13, ps3Var14, ps3Var15, ps3Var16, ps3Var17, ps3Var18, ps3Var19, ps3Var20, ps3Var21, ps3Var22, ps3Var23, ps3Var24, ps3Var25, ps3Var26, ps3Var27, ps3Var28, ps3Var29, ps3Var30, ps3Var31, ps3Var32, ps3Var33, ps3Var34, ps3Var35, ps3Var36, ps3Var37, ps3Var38, ps3Var39, ps3Var40, ps3Var41, ps3Var42, ps3Var43, ps3Var44, ps3Var45, ps3Var46, ps3Var47, ps3Var48, ps3Var49, ps3Var50, ps3Var51};
        r5 = new Type[0];
        ps3[] values = values();
        q5 = new ps3[values.length];
        for (ps3 ps3Var52 : values) {
            q5[ps3Var52.b] = ps3Var52;
        }
    }

    private ps3(String str, int i2, int i3, b bVar, b95 b95Var) {
        int i4;
        this.b = i3;
        this.c = bVar;
        this.a = b95Var;
        int i6 = a.a[bVar.ordinal()];
        boolean z2 = true;
        if (i6 != 1) {
            if (i6 != 2) {
                this.d = null;
            } else {
                this.d = b95Var.a();
            }
        } else {
            this.d = b95Var.a();
        }
        this.e = (bVar != b.SCALAR || (i4 = a.b[b95Var.ordinal()]) == 1 || i4 == 2 || i4 == 3) ? false : false;
    }

    public static ps3 valueOf(String str) {
        return (ps3) Enum.valueOf(ps3.class, str);
    }

    public static ps3[] values() {
        return (ps3[]) s5.clone();
    }

    public int a() {
        return this.b;
    }
}
