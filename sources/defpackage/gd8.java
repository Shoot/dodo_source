package defpackage;
/* compiled from: PointL.java */
/* renamed from: gd8  reason: default package */
/* loaded from: classes3.dex */
public class gd8 {
    public long a;
    public long b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd8)) {
            return false;
        }
        gd8 gd8Var = (gd8) obj;
        if (this.a == gd8Var.a && this.b == gd8Var.b) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "PointL(" + this.a + ", " + this.b + ")";
    }
}
