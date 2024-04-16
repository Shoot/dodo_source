package defpackage;

import android.graphics.Rect;
/* compiled from: RectL.java */
/* renamed from: p99  reason: default package */
/* loaded from: classes3.dex */
public class p99 {
    public long a;
    public long b;
    public long c;
    public long d;

    public p99() {
    }

    public static Rect a(Rect rect, int i, int i2, double d, Rect rect2) {
        Rect rect3;
        if (rect2 != null) {
            rect3 = rect2;
        } else {
            rect3 = new Rect();
        }
        if (d == 0.0d) {
            rect3.top = rect.top;
            rect3.left = rect.left;
            rect3.bottom = rect.bottom;
            rect3.right = rect.right;
            return rect3;
        }
        double d2 = (3.141592653589793d * d) / 180.0d;
        double cos = Math.cos(d2);
        double sin = Math.sin(d2);
        long j = rect.left;
        long j2 = rect.top;
        long j3 = i;
        long j4 = i2;
        int b = (int) b(j, j2, j3, j4, cos, sin);
        int c = (int) c(j, j2, j3, j4, cos, sin);
        rect3.bottom = c;
        rect3.top = c;
        rect3.right = b;
        rect3.left = b;
        long j5 = rect.right;
        long j6 = rect.top;
        int b2 = (int) b(j5, j6, j3, j4, cos, sin);
        int c2 = (int) c(j5, j6, j3, j4, cos, sin);
        if (rect3.top > c2) {
            rect3.top = c2;
        }
        if (rect3.bottom < c2) {
            rect3.bottom = c2;
        }
        if (rect3.left > b2) {
            rect3.left = b2;
        }
        if (rect3.right < b2) {
            rect3.right = b2;
        }
        long j7 = rect.right;
        long j8 = rect.bottom;
        int b3 = (int) b(j7, j8, j3, j4, cos, sin);
        int c3 = (int) c(j7, j8, j3, j4, cos, sin);
        if (rect3.top > c3) {
            rect3.top = c3;
        }
        if (rect3.bottom < c3) {
            rect3.bottom = c3;
        }
        if (rect3.left > b3) {
            rect3.left = b3;
        }
        if (rect3.right < b3) {
            rect3.right = b3;
        }
        long j9 = rect.left;
        long j10 = rect.bottom;
        int b4 = (int) b(j9, j10, j3, j4, cos, sin);
        int c4 = (int) c(j9, j10, j3, j4, cos, sin);
        if (rect3.top > c4) {
            rect3.top = c4;
        }
        if (rect3.bottom < c4) {
            rect3.bottom = c4;
        }
        if (rect3.left > b4) {
            rect3.left = b4;
        }
        if (rect3.right < b4) {
            rect3.right = b4;
        }
        return rect3;
    }

    public static long b(long j, long j2, long j3, long j4, double d, double d2) {
        return j3 + Math.round(((j - j3) * d) - ((j2 - j4) * d2));
    }

    public static long c(long j, long j2, long j3, long j4, double d, double d2) {
        return j4 + Math.round(((j - j3) * d2) + ((j2 - j4) * d));
    }

    public void d(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p99 p99Var = (p99) obj;
        if (this.a == p99Var.a && this.b == p99Var.b && this.c == p99Var.c && this.d == p99Var.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (int) (((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) % 2147483647L);
    }

    public String toString() {
        return "RectL(" + this.a + ", " + this.b + " - " + this.c + ", " + this.d + ")";
    }

    public p99(long j, long j2, long j3, long j4) {
        d(j, j2, j3, j4);
    }
}
