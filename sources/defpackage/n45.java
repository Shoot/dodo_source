package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
/* compiled from: Insets.java */
/* renamed from: n45  reason: default package */
/* loaded from: classes.dex */
public final class n45 {
    @NonNull
    public static final n45 e = new n45(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    /* compiled from: Insets.java */
    /* renamed from: n45$a */
    /* loaded from: classes.dex */
    static class a {
        static Insets a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    private n45(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @NonNull
    public static n45 a(@NonNull n45 n45Var, @NonNull n45 n45Var2) {
        return b(Math.max(n45Var.a, n45Var2.a), Math.max(n45Var.b, n45Var2.b), Math.max(n45Var.c, n45Var2.c), Math.max(n45Var.d, n45Var2.d));
    }

    @NonNull
    public static n45 b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return e;
        }
        return new n45(i, i2, i3, i4);
    }

    @NonNull
    public static n45 c(@NonNull Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    @NonNull
    public static n45 d(@NonNull Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return b(i, i2, i3, i4);
    }

    @NonNull
    public Insets e() {
        return a.a(this.a, this.b, this.c, this.d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n45.class != obj.getClass()) {
            return false;
        }
        n45 n45Var = (n45) obj;
        if (this.d == n45Var.d && this.a == n45Var.a && this.c == n45Var.c && this.b == n45Var.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    @NonNull
    public String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + CoreConstants.CURLY_RIGHT;
    }
}
