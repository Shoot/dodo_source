package defpackage;
/* compiled from: Absent.java */
/* renamed from: t0  reason: default package */
/* loaded from: classes2.dex */
final class t0<T> extends pb7<T> {
    static final t0<Object> a = new t0<>();

    private t0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> pb7<T> e() {
        return a;
    }

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.pb7
    public T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // defpackage.pb7
    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
