package defpackage;

import com.google.android.gms.internal.measurement.d1;
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
/* renamed from: r2d  reason: default package */
/* loaded from: classes2.dex */
public final class r2d {
    public static final r2d d;
    public static final r2d e;
    public static final r2d f;
    public static final r2d g;
    public static final r2d h;
    public static final r2d i;
    public static final r2d j;
    public static final r2d k;
    public static final r2d l;
    public static final r2d m;
    private static final /* synthetic */ r2d[] n;
    private final Class<?> a;
    private final Class<?> b;
    private final Object c;

    static {
        r2d r2dVar = new r2d("VOID", 0, Void.class, Void.class, null);
        d = r2dVar;
        Class cls = Integer.TYPE;
        r2d r2dVar2 = new r2d("INT", 1, cls, Integer.class, 0);
        e = r2dVar2;
        r2d r2dVar3 = new r2d("LONG", 2, Long.TYPE, Long.class, 0L);
        f = r2dVar3;
        r2d r2dVar4 = new r2d("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        g = r2dVar4;
        r2d r2dVar5 = new r2d("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        h = r2dVar5;
        r2d r2dVar6 = new r2d("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        i = r2dVar6;
        r2d r2dVar7 = new r2d("STRING", 6, String.class, String.class, "");
        j = r2dVar7;
        r2d r2dVar8 = new r2d("BYTE_STRING", 7, d1.class, d1.class, d1.b);
        k = r2dVar8;
        r2d r2dVar9 = new r2d("ENUM", 8, cls, Integer.class, null);
        l = r2dVar9;
        r2d r2dVar10 = new r2d("MESSAGE", 9, Object.class, Object.class, null);
        m = r2dVar10;
        n = new r2d[]{r2dVar, r2dVar2, r2dVar3, r2dVar4, r2dVar5, r2dVar6, r2dVar7, r2dVar8, r2dVar9, r2dVar10};
    }

    private r2d(String str, int i2, Class cls, Class cls2, Object obj) {
        this.a = cls;
        this.b = cls2;
        this.c = obj;
    }

    public static r2d[] values() {
        return (r2d[]) n.clone();
    }

    public final Class<?> a() {
        return this.b;
    }
}
