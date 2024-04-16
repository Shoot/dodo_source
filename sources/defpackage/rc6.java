package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
/* compiled from: MemberKey.java */
/* renamed from: rc6  reason: default package */
/* loaded from: classes2.dex */
public final class rc6 {
    static final Class<?>[] c = new Class[0];
    final String a;
    final Class<?>[] b;

    public rc6(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public int a() {
        return this.b.length;
    }

    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != rc6.class) {
            return false;
        }
        rc6 rc6Var = (rc6) obj;
        if (!this.a.equals(rc6Var.a)) {
            return false;
        }
        Class<?>[] clsArr = rc6Var.b;
        int length = this.b.length;
        if (clsArr.length != length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (clsArr[i] != this.b[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.a.hashCode() + this.b.length;
    }

    public String toString() {
        return this.a + "(" + this.b.length + "-args)";
    }

    public rc6(Constructor<?> constructor) {
        this("", constructor.getParameterTypes());
    }

    public rc6(String str, Class<?>[] clsArr) {
        this.a = str;
        this.b = clsArr == null ? c : clsArr;
    }
}
