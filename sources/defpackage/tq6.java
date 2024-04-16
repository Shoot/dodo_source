package defpackage;
/* compiled from: MutablePair.java */
/* renamed from: tq6  reason: default package */
/* loaded from: classes.dex */
public class tq6<T> {
    T a;
    T b;

    private static boolean a(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public void b(T t, T t2) {
        this.a = t;
        this.b = t2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wp7)) {
            return false;
        }
        wp7 wp7Var = (wp7) obj;
        if (!a(wp7Var.a, this.a) || !a(wp7Var.b, this.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        T t = this.a;
        int i = 0;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        T t2 = this.b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
