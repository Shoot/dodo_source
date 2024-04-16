package defpackage;

import androidx.annotation.NonNull;
/* compiled from: Pair.java */
/* renamed from: wp7  reason: default package */
/* loaded from: classes.dex */
public class wp7<F, S> {
    public final F a;
    public final S b;

    public wp7(F f, S s) {
        this.a = f;
        this.b = s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof wp7)) {
            return false;
        }
        wp7 wp7Var = (wp7) obj;
        if (!p57.a(wp7Var.a, this.a) || !p57.a(wp7Var.b, this.b)) {
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

    @NonNull
    public String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
