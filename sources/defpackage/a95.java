package defpackage;

import com.google.protobuf.f;
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
/* compiled from: JavaType.java */
/* renamed from: a95  reason: default package */
/* loaded from: classes.dex */
public final class a95 {
    public static final a95 d = new a95("VOID", 0, Void.class, Void.class, null);
    public static final a95 e;
    public static final a95 f;
    public static final a95 g;
    public static final a95 h;
    public static final a95 i;
    public static final a95 j;
    public static final a95 k;
    public static final a95 l;
    public static final a95 m;
    private static final /* synthetic */ a95[] n;
    private final Class<?> a;
    private final Class<?> b;
    private final Object c;

    static {
        Class cls = Integer.TYPE;
        e = new a95("INT", 1, cls, Integer.class, 0);
        f = new a95("LONG", 2, Long.TYPE, Long.class, 0L);
        g = new a95("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        h = new a95("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        i = new a95("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        j = new a95("STRING", 6, String.class, String.class, "");
        k = new a95("BYTE_STRING", 7, f.class, f.class, f.b);
        l = new a95("ENUM", 8, cls, Integer.class, null);
        m = new a95("MESSAGE", 9, Object.class, Object.class, null);
        n = a();
    }

    private a95(String str, int i2, Class cls, Class cls2, Object obj) {
        this.a = cls;
        this.b = cls2;
        this.c = obj;
    }

    private static /* synthetic */ a95[] a() {
        return new a95[]{d, e, f, g, h, i, j, k, l, m};
    }

    public static a95 valueOf(String str) {
        return (a95) Enum.valueOf(a95.class, str);
    }

    public static a95[] values() {
        return (a95[]) n.clone();
    }

    public Class<?> i() {
        return this.b;
    }
}
