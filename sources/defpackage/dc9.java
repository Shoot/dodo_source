package defpackage;
/* compiled from: ReflectionFactory.java */
/* renamed from: dc9  reason: default package */
/* loaded from: classes3.dex */
public class dc9 {
    public od5 b(Class cls) {
        return new n81(cls);
    }

    public sd5 c(Class cls, String str) {
        return new vo7(cls, str);
    }

    public String h(j94 j94Var) {
        String obj = j94Var.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    public String i(ej5 ej5Var) {
        return h(ej5Var);
    }

    public td5 a(l94 l94Var) {
        return l94Var;
    }

    public he5 d(vq6 vq6Var) {
        return vq6Var;
    }

    public ke5 e(xq8 xq8Var) {
        return xq8Var;
    }

    public le5 f(zq8 zq8Var) {
        return zq8Var;
    }

    public me5 g(br8 br8Var) {
        return br8Var;
    }
}
