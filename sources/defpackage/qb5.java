package defpackage;

import java.math.BigInteger;
/* compiled from: JsonPrimitive.java */
/* renamed from: qb5  reason: default package */
/* loaded from: classes2.dex */
public final class qb5 extends pa5 {
    private final Object a;

    public qb5(Boolean bool) {
        this.a = a.b(bool);
    }

    private static boolean B(qb5 qb5Var) {
        Object obj = qb5Var.a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if (!(number instanceof BigInteger) && !(number instanceof Long) && !(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            return false;
        }
        return true;
    }

    public boolean A() {
        return this.a instanceof Boolean;
    }

    public boolean C() {
        return this.a instanceof Number;
    }

    public boolean D() {
        return this.a instanceof String;
    }

    @Override // defpackage.pa5
    public int a() {
        if (C()) {
            return z().intValue();
        }
        return Integer.parseInt(h());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qb5.class != obj.getClass()) {
            return false;
        }
        qb5 qb5Var = (qb5) obj;
        if (this.a == null) {
            if (qb5Var.a == null) {
                return true;
            }
            return false;
        } else if (B(this) && B(qb5Var)) {
            if (z().longValue() == qb5Var.z().longValue()) {
                return true;
            }
            return false;
        } else {
            Object obj2 = this.a;
            if ((obj2 instanceof Number) && (qb5Var.a instanceof Number)) {
                double doubleValue = z().doubleValue();
                double doubleValue2 = qb5Var.z().doubleValue();
                if (doubleValue == doubleValue2) {
                    return true;
                }
                if (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2)) {
                    return true;
                }
                return false;
            }
            return obj2.equals(qb5Var.a);
        }
    }

    @Override // defpackage.pa5
    public String h() {
        if (C()) {
            return z().toString();
        }
        if (A()) {
            return ((Boolean) this.a).toString();
        }
        return (String) this.a;
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.a == null) {
            return 31;
        }
        if (B(this)) {
            doubleToLongBits = z().longValue();
        } else {
            Object obj = this.a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(z().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public boolean v() {
        if (A()) {
            return ((Boolean) this.a).booleanValue();
        }
        return Boolean.parseBoolean(h());
    }

    public double w() {
        if (C()) {
            return z().doubleValue();
        }
        return Double.parseDouble(h());
    }

    public long x() {
        if (C()) {
            return z().longValue();
        }
        return Long.parseLong(h());
    }

    public Number z() {
        Object obj = this.a;
        if (obj instanceof String) {
            return new on5((String) obj);
        }
        return (Number) obj;
    }

    public qb5(Number number) {
        this.a = a.b(number);
    }

    public qb5(String str) {
        this.a = a.b(str);
    }
}
