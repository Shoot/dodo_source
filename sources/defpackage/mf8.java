package defpackage;
/* compiled from: Pools.java */
/* renamed from: mf8  reason: default package */
/* loaded from: classes.dex */
class mf8<T> implements kf8<T> {
    private final Object[] a;
    private int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public mf8(int i) {
        if (i > 0) {
            this.a = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // defpackage.kf8
    public boolean a(T t) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i < objArr.length) {
            objArr[i] = t;
            this.b = i + 1;
            return true;
        }
        return false;
    }

    @Override // defpackage.kf8
    public T b() {
        int i = this.b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.b = i - 1;
        return t;
    }

    @Override // defpackage.kf8
    public void c(T[] tArr, int i) {
        if (i > tArr.length) {
            i = tArr.length;
        }
        for (int i2 = 0; i2 < i; i2++) {
            T t = tArr[i2];
            int i3 = this.b;
            Object[] objArr = this.a;
            if (i3 < objArr.length) {
                objArr[i3] = t;
                this.b = i3 + 1;
            }
        }
    }
}
