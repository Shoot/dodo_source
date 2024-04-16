package defpackage;
/* compiled from: AutoValue_ProductData.java */
/* renamed from: a30  reason: default package */
/* loaded from: classes2.dex */
final class a30 extends ol8 {
    private final Integer a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a30(Integer num) {
        this.a = num;
    }

    @Override // defpackage.ol8
    public Integer a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ol8)) {
            return false;
        }
        Integer num = this.a;
        Integer a = ((ol8) obj).a();
        if (num == null) {
            if (a == null) {
                return true;
            }
            return false;
        }
        return num.equals(a);
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.a + "}";
    }
}
