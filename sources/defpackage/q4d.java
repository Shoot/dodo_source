package defpackage;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum e uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* renamed from: q4d  reason: default package */
/* loaded from: classes2.dex */
public class q4d {
    public static final q4d c;
    public static final q4d d;
    public static final q4d e;
    public static final q4d f;
    public static final q4d g;
    public static final q4d h;
    public static final q4d i;
    public static final q4d j;
    public static final q4d k;
    public static final q4d l;
    public static final q4d m;
    public static final q4d n;
    public static final q4d o;
    public static final q4d p;
    public static final q4d q;
    public static final q4d r;
    public static final q4d s;
    public static final q4d t;
    private static final /* synthetic */ q4d[] u;
    private final l5d a;
    private final int b;

    static {
        q4d q4dVar = new q4d("DOUBLE", 0, l5d.DOUBLE, 1);
        c = q4dVar;
        q4d q4dVar2 = new q4d("FLOAT", 1, l5d.FLOAT, 5);
        d = q4dVar2;
        l5d l5dVar = l5d.LONG;
        q4d q4dVar3 = new q4d("INT64", 2, l5dVar, 0);
        e = q4dVar3;
        q4d q4dVar4 = new q4d("UINT64", 3, l5dVar, 0);
        f = q4dVar4;
        l5d l5dVar2 = l5d.INT;
        q4d q4dVar5 = new q4d("INT32", 4, l5dVar2, 0);
        g = q4dVar5;
        q4d q4dVar6 = new q4d("FIXED64", 5, l5dVar, 1);
        h = q4dVar6;
        q4d q4dVar7 = new q4d("FIXED32", 6, l5dVar2, 5);
        i = q4dVar7;
        q4d q4dVar8 = new q4d("BOOL", 7, l5d.BOOLEAN, 0);
        j = q4dVar8;
        p4d p4dVar = new p4d("STRING", l5d.STRING);
        k = p4dVar;
        l5d l5dVar3 = l5d.MESSAGE;
        r4d r4dVar = new r4d("GROUP", l5dVar3);
        l = r4dVar;
        v4d v4dVar = new v4d("MESSAGE", l5dVar3);
        m = v4dVar;
        g5d g5dVar = new g5d("BYTES", l5d.BYTE_STRING);
        n = g5dVar;
        q4d q4dVar9 = new q4d("UINT32", 12, l5dVar2, 0);
        o = q4dVar9;
        q4d q4dVar10 = new q4d("ENUM", 13, l5d.ENUM, 0);
        p = q4dVar10;
        q4d q4dVar11 = new q4d("SFIXED32", 14, l5dVar2, 5);
        q = q4dVar11;
        q4d q4dVar12 = new q4d("SFIXED64", 15, l5dVar, 1);
        r = q4dVar12;
        q4d q4dVar13 = new q4d("SINT32", 16, l5dVar2, 0);
        s = q4dVar13;
        q4d q4dVar14 = new q4d("SINT64", 17, l5dVar, 0);
        t = q4dVar14;
        u = new q4d[]{q4dVar, q4dVar2, q4dVar3, q4dVar4, q4dVar5, q4dVar6, q4dVar7, q4dVar8, p4dVar, r4dVar, v4dVar, g5dVar, q4dVar9, q4dVar10, q4dVar11, q4dVar12, q4dVar13, q4dVar14};
    }

    public static q4d[] values() {
        return (q4d[]) u.clone();
    }

    public final l5d a() {
        return this.a;
    }

    private q4d(String str, int i2, l5d l5dVar, int i3) {
        this.a = l5dVar;
        this.b = i3;
    }
}
