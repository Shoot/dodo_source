package defpackage;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.io.Serializable;
/* compiled from: JsonLocation.java */
/* renamed from: fb5  reason: default package */
/* loaded from: classes2.dex */
public class fb5 implements Serializable {
    public static final fb5 g = new fb5(zt1.r(), -1, -1, -1, -1);
    protected final long a;
    protected final long b;
    protected final int c;
    protected final int d;
    protected final zt1 e;
    protected transient String f;

    public fb5(zt1 zt1Var, long j, int i, int i2) {
        this(zt1Var, -1L, j, i, i2);
    }

    public StringBuilder a(StringBuilder sb) {
        if (this.e.o()) {
            sb.append("line: ");
            int i = this.c;
            if (i >= 0) {
                sb.append(i);
            } else {
                sb.append(GrsBaseInfo.CountryCodeSource.UNKNOWN);
            }
            sb.append(", column: ");
            int i2 = this.d;
            if (i2 >= 0) {
                sb.append(i2);
            } else {
                sb.append(GrsBaseInfo.CountryCodeSource.UNKNOWN);
            }
        } else if (this.c > 0) {
            sb.append("line: ");
            sb.append(this.c);
            if (this.d > 0) {
                sb.append(", column: ");
                sb.append(this.d);
            }
        } else {
            sb.append("byte offset: #");
            long j = this.a;
            if (j >= 0) {
                sb.append(j);
            } else {
                sb.append(GrsBaseInfo.CountryCodeSource.UNKNOWN);
            }
        }
        return sb;
    }

    public String b() {
        if (this.f == null) {
            this.f = this.e.j();
        }
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof fb5)) {
            return false;
        }
        fb5 fb5Var = (fb5) obj;
        zt1 zt1Var = this.e;
        if (zt1Var == null) {
            if (fb5Var.e != null) {
                return false;
            }
        } else if (!zt1Var.equals(fb5Var.e)) {
            return false;
        }
        if (this.c == fb5Var.c && this.d == fb5Var.d && this.b == fb5Var.b && this.a == fb5Var.a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        if (this.e == null) {
            i = 1;
        } else {
            i = 2;
        }
        return (((i ^ this.c) + this.d) ^ ((int) this.b)) + ((int) this.a);
    }

    public String toString() {
        String b = b();
        StringBuilder sb = new StringBuilder(b.length() + 40);
        sb.append("[Source: ");
        sb.append(b);
        sb.append("; ");
        StringBuilder a = a(sb);
        a.append(']');
        return a.toString();
    }

    public fb5(zt1 zt1Var, long j, long j2, int i, int i2) {
        this.e = zt1Var == null ? zt1.r() : zt1Var;
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
    }
}
