package defpackage;
/* renamed from: ja4  reason: default package */
/* loaded from: classes3.dex */
class ja4 implements te8 {
    protected final int[] a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ja4(int[] iArr) {
        this.a = tr.k(iArr);
    }

    @Override // defpackage.te8
    public int[] a() {
        return tr.k(this.a);
    }

    @Override // defpackage.te8
    public int b() {
        int[] iArr = this.a;
        return iArr[iArr.length - 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ja4)) {
            return false;
        }
        return tr.e(this.a, ((ja4) obj).a);
    }

    public int hashCode() {
        return tr.I(this.a);
    }
}
