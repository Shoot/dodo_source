package defpackage;
/* compiled from: MutableRealmInteger.java */
/* renamed from: yq6  reason: default package */
/* loaded from: classes3.dex */
public abstract class yq6 implements Comparable<yq6> {
    yq6() {
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(yq6 yq6Var) {
        Long g = g();
        Long g2 = yq6Var.g();
        if (g == null) {
            if (g2 == null) {
                return 0;
            }
            return -1;
        } else if (g2 == null) {
            return 1;
        } else {
            return g.compareTo(g2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yq6)) {
            return false;
        }
        Long g = g();
        Long g2 = ((yq6) obj).g();
        if (g == null) {
            if (g2 == null) {
                return true;
            }
            return false;
        }
        return g.equals(g2);
    }

    public abstract Long g();

    public final int hashCode() {
        Long g = g();
        if (g == null) {
            return 0;
        }
        return g.hashCode();
    }
}
