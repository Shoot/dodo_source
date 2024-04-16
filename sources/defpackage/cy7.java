package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;
/* compiled from: Period.java */
/* renamed from: cy7  reason: default package */
/* loaded from: classes3.dex */
public final class cy7 extends l71 implements Serializable {
    public static final cy7 d = new cy7(0, 0, 0);
    private static final Pattern e = Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
    private final int a;
    private final int b;
    private final int c;

    private cy7(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    private static cy7 b(int i, int i2, int i3) {
        if ((i | i2 | i3) == 0) {
            return d;
        }
        return new cy7(i, i2, i3);
    }

    public static cy7 d(int i) {
        return b(0, 0, i);
    }

    private Object readResolve() {
        if ((this.a | this.b | this.c) == 0) {
            return d;
        }
        return this;
    }

    @Override // defpackage.t8b
    public p8b a(p8b p8bVar) {
        g95.i(p8bVar, "temporal");
        int i = this.a;
        if (i != 0) {
            if (this.b != 0) {
                p8bVar = p8bVar.L(e(), m71.MONTHS);
            } else {
                p8bVar = p8bVar.L(i, m71.YEARS);
            }
        } else {
            int i2 = this.b;
            if (i2 != 0) {
                p8bVar = p8bVar.L(i2, m71.MONTHS);
            }
        }
        int i3 = this.c;
        if (i3 != 0) {
            return p8bVar.L(i3, m71.DAYS);
        }
        return p8bVar;
    }

    public boolean c() {
        if (this == d) {
            return true;
        }
        return false;
    }

    public long e() {
        return (this.a * 12) + this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy7)) {
            return false;
        }
        cy7 cy7Var = (cy7) obj;
        if (this.a == cy7Var.a && this.b == cy7Var.b && this.c == cy7Var.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a + Integer.rotateLeft(this.b, 8) + Integer.rotateLeft(this.c, 16);
    }

    public String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('P');
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }
}
