package defpackage;

import java.lang.reflect.AccessibleObject;
/* compiled from: ReflectionAccessor.java */
/* renamed from: cc9  reason: default package */
/* loaded from: classes2.dex */
public abstract class cc9 {
    private static final cc9 a;

    static {
        cc9 jrbVar;
        if (c95.c() < 9) {
            jrbVar = new lg8();
        } else {
            jrbVar = new jrb();
        }
        a = jrbVar;
    }

    public static cc9 a() {
        return a;
    }

    public abstract void b(AccessibleObject accessibleObject);
}
