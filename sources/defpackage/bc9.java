package defpackage;
/* compiled from: Reflection.java */
/* renamed from: bc9  reason: default package */
/* loaded from: classes3.dex */
public class bc9 {
    private static final dc9 a;
    private static final od5[] b;

    static {
        dc9 dc9Var = null;
        try {
            dc9Var = (dc9) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (dc9Var == null) {
            dc9Var = new dc9();
        }
        a = dc9Var;
        b = new od5[0];
    }

    public static td5 a(l94 l94Var) {
        return a.a(l94Var);
    }

    public static od5 b(Class cls) {
        return a.b(cls);
    }

    public static sd5 c(Class cls) {
        return a.c(cls, "");
    }

    public static he5 d(vq6 vq6Var) {
        return a.d(vq6Var);
    }

    public static ke5 e(xq8 xq8Var) {
        return a.e(xq8Var);
    }

    public static le5 f(zq8 zq8Var) {
        return a.f(zq8Var);
    }

    public static me5 g(br8 br8Var) {
        return a.g(br8Var);
    }

    public static String h(j94 j94Var) {
        return a.h(j94Var);
    }

    public static String i(ej5 ej5Var) {
        return a.i(ej5Var);
    }
}
