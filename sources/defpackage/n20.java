package defpackage;
/* compiled from: AutoValue_Event.java */
/* renamed from: n20  reason: default package */
/* loaded from: classes2.dex */
final class n20<T> extends pk3<T> {
    private final Integer a;
    private final T b;
    private final xj8 c;
    private final ol8 d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n20(Integer num, T t, xj8 xj8Var, ol8 ol8Var) {
        this.a = num;
        if (t != null) {
            this.b = t;
            if (xj8Var != null) {
                this.c = xj8Var;
                this.d = ol8Var;
                return;
            }
            throw new NullPointerException("Null priority");
        }
        throw new NullPointerException("Null payload");
    }

    @Override // defpackage.pk3
    public Integer a() {
        return this.a;
    }

    @Override // defpackage.pk3
    public T b() {
        return this.b;
    }

    @Override // defpackage.pk3
    public xj8 c() {
        return this.c;
    }

    @Override // defpackage.pk3
    public ol8 d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pk3)) {
            return false;
        }
        pk3 pk3Var = (pk3) obj;
        Integer num = this.a;
        if (num != null ? num.equals(pk3Var.a()) : pk3Var.a() == null) {
            if (this.b.equals(pk3Var.b()) && this.c.equals(pk3Var.c())) {
                ol8 ol8Var = this.d;
                if (ol8Var == null) {
                    if (pk3Var.d() == null) {
                        return true;
                    }
                } else if (ol8Var.equals(pk3Var.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.a;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode2 = (((((hashCode ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        ol8 ol8Var = this.d;
        if (ol8Var != null) {
            i = ol8Var.hashCode();
        }
        return hashCode2 ^ i;
    }

    public String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + ", productData=" + this.d + "}";
    }
}
