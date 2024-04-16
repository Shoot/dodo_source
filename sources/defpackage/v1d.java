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
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* renamed from: v1d  reason: default package */
/* loaded from: classes2.dex */
public final class v1d {
    private static final v1d A;
    private static final v1d B;
    private static final v1d I;
    private static final v1d S4;
    private static final v1d T4;
    private static final v1d U4;
    private static final v1d V4;
    private static final v1d W4;
    private static final v1d X;
    private static final v1d X4;
    private static final v1d Y;
    private static final v1d Y4;
    private static final v1d Z;
    private static final v1d Z4;
    public static final v1d a5;
    private static final v1d b5;
    private static final v1d c5;
    private static final v1d d5;
    private static final v1d e5;
    private static final v1d f;
    private static final v1d f5;
    private static final v1d g;
    private static final v1d g5;
    private static final v1d h;
    private static final v1d h5;
    private static final v1d i;
    private static final v1d i5;
    private static final v1d j;
    private static final v1d j5;
    private static final v1d k;
    private static final v1d k5;
    private static final v1d l;
    private static final v1d l5;
    private static final v1d m;
    private static final v1d m5;
    private static final v1d n;
    public static final v1d n5;
    private static final v1d o;
    private static final v1d o5;
    private static final v1d p;
    private static final v1d p5;
    private static final v1d q;
    private static final v1d[] q5;
    private static final v1d r;
    private static final Type[] r5;
    private static final v1d s;
    private static final /* synthetic */ v1d[] s5;
    private static final v1d t;
    private static final v1d u;
    private static final v1d v;
    private static final v1d w;
    private static final v1d x;
    private static final v1d y;
    private static final v1d z;
    private final r2d a;
    private final int b;
    private final i2d c;
    private final Class<?> d;
    private final boolean e;

    static {
        i2d i2dVar = i2d.SCALAR;
        r2d r2dVar = r2d.h;
        v1d v1dVar = new v1d("DOUBLE", 0, 0, i2dVar, r2dVar);
        f = v1dVar;
        r2d r2dVar2 = r2d.g;
        v1d v1dVar2 = new v1d("FLOAT", 1, 1, i2dVar, r2dVar2);
        g = v1dVar2;
        r2d r2dVar3 = r2d.f;
        v1d v1dVar3 = new v1d("INT64", 2, 2, i2dVar, r2dVar3);
        h = v1dVar3;
        v1d v1dVar4 = new v1d("UINT64", 3, 3, i2dVar, r2dVar3);
        i = v1dVar4;
        r2d r2dVar4 = r2d.e;
        v1d v1dVar5 = new v1d("INT32", 4, 4, i2dVar, r2dVar4);
        j = v1dVar5;
        v1d v1dVar6 = new v1d("FIXED64", 5, 5, i2dVar, r2dVar3);
        k = v1dVar6;
        v1d v1dVar7 = new v1d("FIXED32", 6, 6, i2dVar, r2dVar4);
        l = v1dVar7;
        r2d r2dVar5 = r2d.i;
        v1d v1dVar8 = new v1d("BOOL", 7, 7, i2dVar, r2dVar5);
        m = v1dVar8;
        r2d r2dVar6 = r2d.j;
        v1d v1dVar9 = new v1d("STRING", 8, 8, i2dVar, r2dVar6);
        n = v1dVar9;
        r2d r2dVar7 = r2d.m;
        v1d v1dVar10 = new v1d("MESSAGE", 9, 9, i2dVar, r2dVar7);
        o = v1dVar10;
        r2d r2dVar8 = r2d.k;
        v1d v1dVar11 = new v1d("BYTES", 10, 10, i2dVar, r2dVar8);
        p = v1dVar11;
        v1d v1dVar12 = new v1d("UINT32", 11, 11, i2dVar, r2dVar4);
        q = v1dVar12;
        r2d r2dVar9 = r2d.l;
        v1d v1dVar13 = new v1d("ENUM", 12, 12, i2dVar, r2dVar9);
        r = v1dVar13;
        v1d v1dVar14 = new v1d("SFIXED32", 13, 13, i2dVar, r2dVar4);
        s = v1dVar14;
        v1d v1dVar15 = new v1d("SFIXED64", 14, 14, i2dVar, r2dVar3);
        t = v1dVar15;
        v1d v1dVar16 = new v1d("SINT32", 15, 15, i2dVar, r2dVar4);
        u = v1dVar16;
        v1d v1dVar17 = new v1d("SINT64", 16, 16, i2dVar, r2dVar3);
        v = v1dVar17;
        v1d v1dVar18 = new v1d("GROUP", 17, 17, i2dVar, r2dVar7);
        w = v1dVar18;
        i2d i2dVar2 = i2d.VECTOR;
        v1d v1dVar19 = new v1d("DOUBLE_LIST", 18, 18, i2dVar2, r2dVar);
        x = v1dVar19;
        v1d v1dVar20 = new v1d("FLOAT_LIST", 19, 19, i2dVar2, r2dVar2);
        y = v1dVar20;
        v1d v1dVar21 = new v1d("INT64_LIST", 20, 20, i2dVar2, r2dVar3);
        z = v1dVar21;
        v1d v1dVar22 = new v1d("UINT64_LIST", 21, 21, i2dVar2, r2dVar3);
        A = v1dVar22;
        v1d v1dVar23 = new v1d("INT32_LIST", 22, 22, i2dVar2, r2dVar4);
        B = v1dVar23;
        v1d v1dVar24 = new v1d("FIXED64_LIST", 23, 23, i2dVar2, r2dVar3);
        I = v1dVar24;
        v1d v1dVar25 = new v1d("FIXED32_LIST", 24, 24, i2dVar2, r2dVar4);
        X = v1dVar25;
        v1d v1dVar26 = new v1d("BOOL_LIST", 25, 25, i2dVar2, r2dVar5);
        Y = v1dVar26;
        v1d v1dVar27 = new v1d("STRING_LIST", 26, 26, i2dVar2, r2dVar6);
        Z = v1dVar27;
        v1d v1dVar28 = new v1d("MESSAGE_LIST", 27, 27, i2dVar2, r2dVar7);
        S4 = v1dVar28;
        v1d v1dVar29 = new v1d("BYTES_LIST", 28, 28, i2dVar2, r2dVar8);
        T4 = v1dVar29;
        v1d v1dVar30 = new v1d("UINT32_LIST", 29, 29, i2dVar2, r2dVar4);
        U4 = v1dVar30;
        v1d v1dVar31 = new v1d("ENUM_LIST", 30, 30, i2dVar2, r2dVar9);
        V4 = v1dVar31;
        v1d v1dVar32 = new v1d("SFIXED32_LIST", 31, 31, i2dVar2, r2dVar4);
        W4 = v1dVar32;
        v1d v1dVar33 = new v1d("SFIXED64_LIST", 32, 32, i2dVar2, r2dVar3);
        X4 = v1dVar33;
        v1d v1dVar34 = new v1d("SINT32_LIST", 33, 33, i2dVar2, r2dVar4);
        Y4 = v1dVar34;
        v1d v1dVar35 = new v1d("SINT64_LIST", 34, 34, i2dVar2, r2dVar3);
        Z4 = v1dVar35;
        i2d i2dVar3 = i2d.PACKED_VECTOR;
        v1d v1dVar36 = new v1d("DOUBLE_LIST_PACKED", 35, 35, i2dVar3, r2dVar);
        a5 = v1dVar36;
        v1d v1dVar37 = new v1d("FLOAT_LIST_PACKED", 36, 36, i2dVar3, r2dVar2);
        b5 = v1dVar37;
        v1d v1dVar38 = new v1d("INT64_LIST_PACKED", 37, 37, i2dVar3, r2dVar3);
        c5 = v1dVar38;
        v1d v1dVar39 = new v1d("UINT64_LIST_PACKED", 38, 38, i2dVar3, r2dVar3);
        d5 = v1dVar39;
        v1d v1dVar40 = new v1d("INT32_LIST_PACKED", 39, 39, i2dVar3, r2dVar4);
        e5 = v1dVar40;
        v1d v1dVar41 = new v1d("FIXED64_LIST_PACKED", 40, 40, i2dVar3, r2dVar3);
        f5 = v1dVar41;
        v1d v1dVar42 = new v1d("FIXED32_LIST_PACKED", 41, 41, i2dVar3, r2dVar4);
        g5 = v1dVar42;
        v1d v1dVar43 = new v1d("BOOL_LIST_PACKED", 42, 42, i2dVar3, r2dVar5);
        h5 = v1dVar43;
        v1d v1dVar44 = new v1d("UINT32_LIST_PACKED", 43, 43, i2dVar3, r2dVar4);
        i5 = v1dVar44;
        v1d v1dVar45 = new v1d("ENUM_LIST_PACKED", 44, 44, i2dVar3, r2dVar9);
        j5 = v1dVar45;
        v1d v1dVar46 = new v1d("SFIXED32_LIST_PACKED", 45, 45, i2dVar3, r2dVar4);
        k5 = v1dVar46;
        v1d v1dVar47 = new v1d("SFIXED64_LIST_PACKED", 46, 46, i2dVar3, r2dVar3);
        l5 = v1dVar47;
        v1d v1dVar48 = new v1d("SINT32_LIST_PACKED", 47, 47, i2dVar3, r2dVar4);
        m5 = v1dVar48;
        v1d v1dVar49 = new v1d("SINT64_LIST_PACKED", 48, 48, i2dVar3, r2dVar3);
        n5 = v1dVar49;
        v1d v1dVar50 = new v1d("GROUP_LIST", 49, 49, i2dVar2, r2dVar7);
        o5 = v1dVar50;
        v1d v1dVar51 = new v1d("MAP", 50, 50, i2d.MAP, r2d.d);
        p5 = v1dVar51;
        s5 = new v1d[]{v1dVar, v1dVar2, v1dVar3, v1dVar4, v1dVar5, v1dVar6, v1dVar7, v1dVar8, v1dVar9, v1dVar10, v1dVar11, v1dVar12, v1dVar13, v1dVar14, v1dVar15, v1dVar16, v1dVar17, v1dVar18, v1dVar19, v1dVar20, v1dVar21, v1dVar22, v1dVar23, v1dVar24, v1dVar25, v1dVar26, v1dVar27, v1dVar28, v1dVar29, v1dVar30, v1dVar31, v1dVar32, v1dVar33, v1dVar34, v1dVar35, v1dVar36, v1dVar37, v1dVar38, v1dVar39, v1dVar40, v1dVar41, v1dVar42, v1dVar43, v1dVar44, v1dVar45, v1dVar46, v1dVar47, v1dVar48, v1dVar49, v1dVar50, v1dVar51};
        r5 = new Type[0];
        v1d[] values = values();
        q5 = new v1d[values.length];
        for (v1d v1dVar52 : values) {
            q5[v1dVar52.b] = v1dVar52;
        }
    }

    private v1d(String str, int i2, int i3, i2d i2dVar, r2d r2dVar) {
        int i4;
        this.b = i3;
        this.c = i2dVar;
        this.a = r2dVar;
        int ordinal = i2dVar.ordinal();
        boolean z2 = true;
        if (ordinal != 1) {
            if (ordinal != 3) {
                this.d = null;
            } else {
                this.d = r2dVar.a();
            }
        } else {
            this.d = r2dVar.a();
        }
        this.e = (i2dVar != i2d.SCALAR || (i4 = j2d.a[r2dVar.ordinal()]) == 1 || i4 == 2 || i4 == 3) ? false : false;
    }

    public static v1d[] values() {
        return (v1d[]) s5.clone();
    }

    public final int zza() {
        return this.b;
    }
}
