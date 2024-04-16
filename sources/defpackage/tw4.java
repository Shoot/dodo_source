package defpackage;

import android.os.Bundle;
/* compiled from: ImmutableBundle.java */
/* renamed from: tw4  reason: default package */
/* loaded from: classes2.dex */
public final class tw4 {
    private static final sh b = sh.e();
    private final Bundle a;

    public tw4() {
        this(new Bundle());
    }

    private qb7<Integer> d(String str) {
        if (!a(str)) {
            return qb7.a();
        }
        try {
            return qb7.b((Integer) this.a.get(str));
        } catch (ClassCastException e) {
            b.b("Metadata key %s contains type other than int: %s", str, e.getMessage());
            return qb7.a();
        }
    }

    public boolean a(String str) {
        if (str != null && this.a.containsKey(str)) {
            return true;
        }
        return false;
    }

    public qb7<Boolean> b(String str) {
        if (!a(str)) {
            return qb7.a();
        }
        try {
            return qb7.b((Boolean) this.a.get(str));
        } catch (ClassCastException e) {
            b.b("Metadata key %s contains type other than boolean: %s", str, e.getMessage());
            return qb7.a();
        }
    }

    public qb7<Double> c(String str) {
        if (!a(str)) {
            return qb7.a();
        }
        Object obj = this.a.get(str);
        if (obj == null) {
            return qb7.a();
        }
        if (obj instanceof Float) {
            return qb7.e(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return qb7.e((Double) obj);
        }
        b.b("Metadata key %s contains type other than double: %s", str);
        return qb7.a();
    }

    public qb7<Long> e(String str) {
        qb7<Integer> d = d(str);
        if (d.d()) {
            return qb7.e(Long.valueOf(d.c().intValue()));
        }
        return qb7.a();
    }

    public tw4(Bundle bundle) {
        this.a = (Bundle) bundle.clone();
    }
}
