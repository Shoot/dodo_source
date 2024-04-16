package defpackage;

import java.util.Arrays;
/* compiled from: LottieResult.java */
/* renamed from: yz5  reason: default package */
/* loaded from: classes.dex */
public final class yz5<V> {
    private final V a;
    private final Throwable b;

    public yz5(V v) {
        this.a = v;
        this.b = null;
    }

    public Throwable a() {
        return this.b;
    }

    public V b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz5)) {
            return false;
        }
        yz5 yz5Var = (yz5) obj;
        if (b() != null && b().equals(yz5Var.b())) {
            return true;
        }
        if (a() == null || yz5Var.a() == null) {
            return false;
        }
        return a().toString().equals(a().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{b(), a()});
    }

    public yz5(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
