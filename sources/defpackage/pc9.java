package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RegularImmutableSet.java */
/* renamed from: pc9  reason: default package */
/* loaded from: classes2.dex */
public final class pc9<E> extends zw4<E> {
    private static final Object[] h;
    static final pc9<Object> i;
    final transient Object[] c;
    private final transient int d;
    final transient Object[] e;
    private final transient int f;
    private final transient int g;

    static {
        Object[] objArr = new Object[0];
        h = objArr;
        i = new pc9<>(objArr, 0, objArr, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public pc9(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.c = objArr;
        this.d = i2;
        this.e = objArr2;
        this.f = i3;
        this.g = i4;
    }

    @Override // defpackage.zw4
    ww4<E> W() {
        return ww4.E(this.c, this.g);
    }

    @Override // defpackage.zw4
    boolean Z() {
        return true;
    }

    @Override // defpackage.uw4
    int a(Object[] objArr, int i2) {
        System.arraycopy(this.c, 0, objArr, i2, this.g);
        return i2 + this.g;
    }

    @Override // defpackage.uw4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int c = cn4.c(obj);
        while (true) {
            int i2 = c & this.f;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            c = i2 + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.uw4
    public Object[] d() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.uw4
    public int f() {
        return this.g;
    }

    @Override // defpackage.zw4, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.uw4
    public int k() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.uw4
    public boolean u() {
        return false;
    }

    @Override // defpackage.zw4, defpackage.uw4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: w */
    public yqb<E> iterator() {
        return G().iterator();
    }
}
