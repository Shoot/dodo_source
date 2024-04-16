package defpackage;
/* compiled from: Pair.java */
/* renamed from: vp7  reason: default package */
/* loaded from: classes3.dex */
public class vp7<F, S> {
    public F a;
    public S b;

    public vp7(F f, S s) {
        this.a = f;
        this.b = s;
    }

    private boolean a(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof vp7)) {
            return false;
        }
        vp7 vp7Var = (vp7) obj;
        if (!a(vp7Var.a, this.a) || !a(vp7Var.b, this.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        F f = this.a;
        int i = 0;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        S s = this.b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.a) + " " + String.valueOf(this.b) + "}";
    }
}
