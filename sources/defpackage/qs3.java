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
/* renamed from: qs3  reason: default package */
/* loaded from: classes2.dex */
public final class qs3 {
    public static final qs3 A;
    public static final qs3 B;
    public static final qs3 I;
    public static final qs3 S4;
    public static final qs3 T4;
    public static final qs3 U4;
    public static final qs3 V4;
    public static final qs3 W4;
    public static final qs3 X;
    public static final qs3 X4;
    public static final qs3 Y;
    public static final qs3 Y4;
    public static final qs3 Z;
    public static final qs3 Z4;
    public static final qs3 a5;
    public static final qs3 b5;
    public static final qs3 c5;
    public static final qs3 d5;
    public static final qs3 e5;
    public static final qs3 f;
    public static final qs3 f5;
    public static final qs3 g;
    public static final qs3 g5;
    public static final qs3 h;
    public static final qs3 h5;
    public static final qs3 i;
    public static final qs3 i5;
    public static final qs3 j;
    public static final qs3 j5;
    public static final qs3 k;
    public static final qs3 k5;
    public static final qs3 l;
    public static final qs3 l5;
    public static final qs3 m;
    public static final qs3 m5;
    public static final qs3 n;
    public static final qs3 n5;
    public static final qs3 o;
    public static final qs3 o5;
    public static final qs3 p;
    public static final qs3 p5;
    public static final qs3 q;
    private static final qs3[] q5;
    public static final qs3 r;
    private static final Type[] r5;
    public static final qs3 s;
    private static final /* synthetic */ qs3[] s5;
    public static final qs3 t;
    public static final qs3 u;
    public static final qs3 v;
    public static final qs3 w;
    public static final qs3 x;
    public static final qs3 y;
    public static final qs3 z;
    private final z85 a;
    private final int b;
    private final b c;
    private final Class<?> d;
    private final boolean e;

    /* compiled from: FieldType.java */
    /* renamed from: qs3$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[z85.values().length];
            b = iArr;
            try {
                iArr[z85.k.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[z85.m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[z85.j.ordinal()] = 3;
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
    /* renamed from: qs3$b */
    /* loaded from: classes2.dex */
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
        z85 z85Var = z85.h;
        qs3 qs3Var = new qs3("DOUBLE", 0, 0, bVar, z85Var);
        f = qs3Var;
        z85 z85Var2 = z85.g;
        qs3 qs3Var2 = new qs3("FLOAT", 1, 1, bVar, z85Var2);
        g = qs3Var2;
        z85 z85Var3 = z85.f;
        qs3 qs3Var3 = new qs3("INT64", 2, 2, bVar, z85Var3);
        h = qs3Var3;
        qs3 qs3Var4 = new qs3("UINT64", 3, 3, bVar, z85Var3);
        i = qs3Var4;
        z85 z85Var4 = z85.e;
        qs3 qs3Var5 = new qs3("INT32", 4, 4, bVar, z85Var4);
        j = qs3Var5;
        qs3 qs3Var6 = new qs3("FIXED64", 5, 5, bVar, z85Var3);
        k = qs3Var6;
        qs3 qs3Var7 = new qs3("FIXED32", 6, 6, bVar, z85Var4);
        l = qs3Var7;
        z85 z85Var5 = z85.i;
        qs3 qs3Var8 = new qs3("BOOL", 7, 7, bVar, z85Var5);
        m = qs3Var8;
        z85 z85Var6 = z85.j;
        qs3 qs3Var9 = new qs3("STRING", 8, 8, bVar, z85Var6);
        n = qs3Var9;
        z85 z85Var7 = z85.m;
        qs3 qs3Var10 = new qs3("MESSAGE", 9, 9, bVar, z85Var7);
        o = qs3Var10;
        z85 z85Var8 = z85.k;
        qs3 qs3Var11 = new qs3("BYTES", 10, 10, bVar, z85Var8);
        p = qs3Var11;
        qs3 qs3Var12 = new qs3("UINT32", 11, 11, bVar, z85Var4);
        q = qs3Var12;
        z85 z85Var9 = z85.l;
        qs3 qs3Var13 = new qs3("ENUM", 12, 12, bVar, z85Var9);
        r = qs3Var13;
        qs3 qs3Var14 = new qs3("SFIXED32", 13, 13, bVar, z85Var4);
        s = qs3Var14;
        qs3 qs3Var15 = new qs3("SFIXED64", 14, 14, bVar, z85Var3);
        t = qs3Var15;
        qs3 qs3Var16 = new qs3("SINT32", 15, 15, bVar, z85Var4);
        u = qs3Var16;
        qs3 qs3Var17 = new qs3("SINT64", 16, 16, bVar, z85Var3);
        v = qs3Var17;
        qs3 qs3Var18 = new qs3("GROUP", 17, 17, bVar, z85Var7);
        w = qs3Var18;
        b bVar2 = b.VECTOR;
        qs3 qs3Var19 = new qs3("DOUBLE_LIST", 18, 18, bVar2, z85Var);
        x = qs3Var19;
        qs3 qs3Var20 = new qs3("FLOAT_LIST", 19, 19, bVar2, z85Var2);
        y = qs3Var20;
        qs3 qs3Var21 = new qs3("INT64_LIST", 20, 20, bVar2, z85Var3);
        z = qs3Var21;
        qs3 qs3Var22 = new qs3("UINT64_LIST", 21, 21, bVar2, z85Var3);
        A = qs3Var22;
        qs3 qs3Var23 = new qs3("INT32_LIST", 22, 22, bVar2, z85Var4);
        B = qs3Var23;
        qs3 qs3Var24 = new qs3("FIXED64_LIST", 23, 23, bVar2, z85Var3);
        I = qs3Var24;
        qs3 qs3Var25 = new qs3("FIXED32_LIST", 24, 24, bVar2, z85Var4);
        X = qs3Var25;
        qs3 qs3Var26 = new qs3("BOOL_LIST", 25, 25, bVar2, z85Var5);
        Y = qs3Var26;
        qs3 qs3Var27 = new qs3("STRING_LIST", 26, 26, bVar2, z85Var6);
        Z = qs3Var27;
        qs3 qs3Var28 = new qs3("MESSAGE_LIST", 27, 27, bVar2, z85Var7);
        S4 = qs3Var28;
        qs3 qs3Var29 = new qs3("BYTES_LIST", 28, 28, bVar2, z85Var8);
        T4 = qs3Var29;
        qs3 qs3Var30 = new qs3("UINT32_LIST", 29, 29, bVar2, z85Var4);
        U4 = qs3Var30;
        qs3 qs3Var31 = new qs3("ENUM_LIST", 30, 30, bVar2, z85Var9);
        V4 = qs3Var31;
        qs3 qs3Var32 = new qs3("SFIXED32_LIST", 31, 31, bVar2, z85Var4);
        W4 = qs3Var32;
        qs3 qs3Var33 = new qs3("SFIXED64_LIST", 32, 32, bVar2, z85Var3);
        X4 = qs3Var33;
        qs3 qs3Var34 = new qs3("SINT32_LIST", 33, 33, bVar2, z85Var4);
        Y4 = qs3Var34;
        qs3 qs3Var35 = new qs3("SINT64_LIST", 34, 34, bVar2, z85Var3);
        Z4 = qs3Var35;
        b bVar3 = b.PACKED_VECTOR;
        qs3 qs3Var36 = new qs3("DOUBLE_LIST_PACKED", 35, 35, bVar3, z85Var);
        a5 = qs3Var36;
        qs3 qs3Var37 = new qs3("FLOAT_LIST_PACKED", 36, 36, bVar3, z85Var2);
        b5 = qs3Var37;
        qs3 qs3Var38 = new qs3("INT64_LIST_PACKED", 37, 37, bVar3, z85Var3);
        c5 = qs3Var38;
        qs3 qs3Var39 = new qs3("UINT64_LIST_PACKED", 38, 38, bVar3, z85Var3);
        d5 = qs3Var39;
        qs3 qs3Var40 = new qs3("INT32_LIST_PACKED", 39, 39, bVar3, z85Var4);
        e5 = qs3Var40;
        qs3 qs3Var41 = new qs3("FIXED64_LIST_PACKED", 40, 40, bVar3, z85Var3);
        f5 = qs3Var41;
        qs3 qs3Var42 = new qs3("FIXED32_LIST_PACKED", 41, 41, bVar3, z85Var4);
        g5 = qs3Var42;
        qs3 qs3Var43 = new qs3("BOOL_LIST_PACKED", 42, 42, bVar3, z85Var5);
        h5 = qs3Var43;
        qs3 qs3Var44 = new qs3("UINT32_LIST_PACKED", 43, 43, bVar3, z85Var4);
        i5 = qs3Var44;
        qs3 qs3Var45 = new qs3("ENUM_LIST_PACKED", 44, 44, bVar3, z85Var9);
        j5 = qs3Var45;
        qs3 qs3Var46 = new qs3("SFIXED32_LIST_PACKED", 45, 45, bVar3, z85Var4);
        k5 = qs3Var46;
        qs3 qs3Var47 = new qs3("SFIXED64_LIST_PACKED", 46, 46, bVar3, z85Var3);
        l5 = qs3Var47;
        qs3 qs3Var48 = new qs3("SINT32_LIST_PACKED", 47, 47, bVar3, z85Var4);
        m5 = qs3Var48;
        qs3 qs3Var49 = new qs3("SINT64_LIST_PACKED", 48, 48, bVar3, z85Var3);
        n5 = qs3Var49;
        qs3 qs3Var50 = new qs3("GROUP_LIST", 49, 49, bVar2, z85Var7);
        o5 = qs3Var50;
        qs3 qs3Var51 = new qs3("MAP", 50, 50, b.MAP, z85.d);
        p5 = qs3Var51;
        s5 = new qs3[]{qs3Var, qs3Var2, qs3Var3, qs3Var4, qs3Var5, qs3Var6, qs3Var7, qs3Var8, qs3Var9, qs3Var10, qs3Var11, qs3Var12, qs3Var13, qs3Var14, qs3Var15, qs3Var16, qs3Var17, qs3Var18, qs3Var19, qs3Var20, qs3Var21, qs3Var22, qs3Var23, qs3Var24, qs3Var25, qs3Var26, qs3Var27, qs3Var28, qs3Var29, qs3Var30, qs3Var31, qs3Var32, qs3Var33, qs3Var34, qs3Var35, qs3Var36, qs3Var37, qs3Var38, qs3Var39, qs3Var40, qs3Var41, qs3Var42, qs3Var43, qs3Var44, qs3Var45, qs3Var46, qs3Var47, qs3Var48, qs3Var49, qs3Var50, qs3Var51};
        r5 = new Type[0];
        qs3[] values = values();
        q5 = new qs3[values.length];
        for (qs3 qs3Var52 : values) {
            q5[qs3Var52.b] = qs3Var52;
        }
    }

    private qs3(String str, int i2, int i3, b bVar, z85 z85Var) {
        int i4;
        this.b = i3;
        this.c = bVar;
        this.a = z85Var;
        int i6 = a.a[bVar.ordinal()];
        boolean z2 = true;
        if (i6 != 1) {
            if (i6 != 2) {
                this.d = null;
            } else {
                this.d = z85Var.a();
            }
        } else {
            this.d = z85Var.a();
        }
        this.e = (bVar != b.SCALAR || (i4 = a.b[z85Var.ordinal()]) == 1 || i4 == 2 || i4 == 3) ? false : false;
    }

    public static qs3 valueOf(String str) {
        return (qs3) Enum.valueOf(qs3.class, str);
    }

    public static qs3[] values() {
        return (qs3[]) s5.clone();
    }

    public int a() {
        return this.b;
    }
}
