package defpackage;
/* compiled from: Present.java */
/* renamed from: wi8  reason: default package */
/* loaded from: classes2.dex */
final class wi8<T> extends pb7<T> {
    private final T a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public wi8(T t) {
        this.a = t;
    }

    @Override // defpackage.pb7
    public T b() {
        return this.a;
    }

    @Override // defpackage.pb7
    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof wi8) {
            return this.a.equals(((wi8) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
