package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.x;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: BooleanArrayList.java */
/* loaded from: classes.dex */
final class f extends c<Boolean> implements x.a, RandomAccess, s0 {
    private static final f d;
    private boolean[] b;
    private int c;

    static {
        f fVar = new f(new boolean[0], 0);
        d = fVar;
        fVar.l();
    }

    f() {
        this(new boolean[10], 0);
    }

    private void g(int i, boolean z) {
        int i2;
        a();
        if (i >= 0 && i <= (i2 = this.c)) {
            boolean[] zArr = this.b;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.b, i, zArr2, i + 1, this.c - i);
                this.b = zArr2;
            }
            this.b[i] = z;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(u(i));
    }

    private void k(int i) {
        if (i >= 0 && i < this.c) {
            return;
        }
        throw new IndexOutOfBoundsException(u(i));
    }

    private String u(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        a();
        x.a(collection);
        if (!(collection instanceof f)) {
            return super.addAll(collection);
        }
        f fVar = (f) collection;
        int i = fVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.b;
            if (i3 > zArr.length) {
                this.b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(fVar.b, 0, this.b, this.c, fVar.c);
            this.c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d */
    public void add(int i, Boolean bool) {
        g(i, bool.booleanValue());
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return super.equals(obj);
        }
        f fVar = (f) obj;
        if (this.c != fVar.c) {
            return false;
        }
        boolean[] zArr = fVar.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f */
    public boolean add(Boolean bool) {
        h(bool.booleanValue());
        return true;
    }

    public void h(boolean z) {
        a();
        int i = this.c;
        boolean[] zArr = this.b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.b = zArr2;
        }
        boolean[] zArr3 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + x.c(this.b[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p */
    public Boolean get(int i) {
        return Boolean.valueOf(t(i));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        a();
        if (i2 >= i) {
            boolean[] zArr = this.b;
            System.arraycopy(zArr, i2, zArr, i, this.c - i2);
            this.c -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.c;
    }

    public boolean t(int i) {
        k(i);
        return this.b[i];
    }

    @Override // androidx.datastore.preferences.protobuf.x.i
    /* renamed from: v */
    public x.a i(int i) {
        if (i >= this.c) {
            return new f(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: w */
    public Boolean remove(int i) {
        int i2;
        a();
        k(i);
        boolean[] zArr = this.b;
        boolean z = zArr[i];
        if (i < this.c - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: x */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(z(i, bool.booleanValue()));
    }

    public boolean z(int i, boolean z) {
        a();
        k(i);
        boolean[] zArr = this.b;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    private f(boolean[] zArr, int i) {
        this.b = zArr;
        this.c = i;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Boolean.valueOf(this.b[i]))) {
                boolean[] zArr = this.b;
                System.arraycopy(zArr, i + 1, zArr, i, (this.c - i) - 1);
                this.c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
