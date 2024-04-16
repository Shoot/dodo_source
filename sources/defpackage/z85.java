package defpackage;

import com.google.crypto.tink.shaded.protobuf.h;
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
/* renamed from: z85  reason: default package */
/* loaded from: classes2.dex */
public final class z85 {
    public static final z85 d;
    public static final z85 e;
    public static final z85 f;
    public static final z85 g;
    public static final z85 h;
    public static final z85 i;
    public static final z85 j;
    public static final z85 k;
    public static final z85 l;
    public static final z85 m;
    private static final /* synthetic */ z85[] n;
    private final Class<?> a;
    private final Class<?> b;
    private final Object c;

    static {
        z85 z85Var = new z85("VOID", 0, Void.class, Void.class, null);
        d = z85Var;
        Class cls = Integer.TYPE;
        z85 z85Var2 = new z85("INT", 1, cls, Integer.class, 0);
        e = z85Var2;
        z85 z85Var3 = new z85("LONG", 2, Long.TYPE, Long.class, 0L);
        f = z85Var3;
        z85 z85Var4 = new z85("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        g = z85Var4;
        z85 z85Var5 = new z85("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        h = z85Var5;
        z85 z85Var6 = new z85("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        i = z85Var6;
        z85 z85Var7 = new z85("STRING", 6, String.class, String.class, "");
        j = z85Var7;
        z85 z85Var8 = new z85("BYTE_STRING", 7, h.class, h.class, h.b);
        k = z85Var8;
        z85 z85Var9 = new z85("ENUM", 8, cls, Integer.class, null);
        l = z85Var9;
        z85 z85Var10 = new z85("MESSAGE", 9, Object.class, Object.class, null);
        m = z85Var10;
        n = new z85[]{z85Var, z85Var2, z85Var3, z85Var4, z85Var5, z85Var6, z85Var7, z85Var8, z85Var9, z85Var10};
    }

    private z85(String str, int i2, Class cls, Class cls2, Object obj) {
        this.a = cls;
        this.b = cls2;
        this.c = obj;
    }

    public static z85 valueOf(String str) {
        return (z85) Enum.valueOf(z85.class, str);
    }

    public static z85[] values() {
        return (z85[]) n.clone();
    }

    public Class<?> a() {
        return this.b;
    }
}
