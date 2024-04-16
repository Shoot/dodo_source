package defpackage;

import androidx.datastore.preferences.protobuf.g;
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
/* compiled from: JavaType.java */
/* renamed from: b95  reason: default package */
/* loaded from: classes.dex */
public final class b95 {
    public static final b95 d;
    public static final b95 e;
    public static final b95 f;
    public static final b95 g;
    public static final b95 h;
    public static final b95 i;
    public static final b95 j;
    public static final b95 k;
    public static final b95 l;
    public static final b95 m;
    private static final /* synthetic */ b95[] n;
    private final Class<?> a;
    private final Class<?> b;
    private final Object c;

    static {
        b95 b95Var = new b95("VOID", 0, Void.class, Void.class, null);
        d = b95Var;
        Class cls = Integer.TYPE;
        b95 b95Var2 = new b95("INT", 1, cls, Integer.class, 0);
        e = b95Var2;
        b95 b95Var3 = new b95("LONG", 2, Long.TYPE, Long.class, 0L);
        f = b95Var3;
        b95 b95Var4 = new b95("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        g = b95Var4;
        b95 b95Var5 = new b95("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        h = b95Var5;
        b95 b95Var6 = new b95("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        i = b95Var6;
        b95 b95Var7 = new b95("STRING", 6, String.class, String.class, "");
        j = b95Var7;
        b95 b95Var8 = new b95("BYTE_STRING", 7, g.class, g.class, g.b);
        k = b95Var8;
        b95 b95Var9 = new b95("ENUM", 8, cls, Integer.class, null);
        l = b95Var9;
        b95 b95Var10 = new b95("MESSAGE", 9, Object.class, Object.class, null);
        m = b95Var10;
        n = new b95[]{b95Var, b95Var2, b95Var3, b95Var4, b95Var5, b95Var6, b95Var7, b95Var8, b95Var9, b95Var10};
    }

    private b95(String str, int i2, Class cls, Class cls2, Object obj) {
        this.a = cls;
        this.b = cls2;
        this.c = obj;
    }

    public static b95 valueOf(String str) {
        return (b95) Enum.valueOf(b95.class, str);
    }

    public static b95[] values() {
        return (b95[]) n.clone();
    }

    public Class<?> a() {
        return this.b;
    }
}
