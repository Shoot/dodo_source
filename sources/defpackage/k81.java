package defpackage;

import java.io.Serializable;
/* compiled from: ClassKey.java */
/* renamed from: k81  reason: default package */
/* loaded from: classes2.dex */
public final class k81 implements Comparable<k81>, Serializable {
    private String a;
    private Class<?> b;
    private int c;

    public k81() {
        this.b = null;
        this.a = null;
        this.c = 0;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(k81 k81Var) {
        return this.a.compareTo(k81Var.a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == k81.class && ((k81) obj).b == this.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.c;
    }

    public String toString() {
        return this.a;
    }

    public k81(Class<?> cls) {
        this.b = cls;
        String name = cls.getName();
        this.a = name;
        this.c = name.hashCode();
    }
}
