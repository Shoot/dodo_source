package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.x;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: IntArrayList.java */
/* loaded from: classes.dex */
final class w extends c<Integer> implements x.g, RandomAccess, s0 {
    private static final w d;
    private int[] b;
    private int c;

    static {
        w wVar = new w(new int[0], 0);
        d = wVar;
        wVar.l();
    }

    w() {
        this(new int[10], 0);
    }

    private void g(int i, int i2) {
        int i3;
        a();
        if (i >= 0 && i <= (i3 = this.c)) {
            int[] iArr = this.b;
            if (i3 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
            } else {
                int[] iArr2 = new int[((i3 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.b, i, iArr2, i + 1, this.c - i);
                this.b = iArr2;
            }
            this.b[i] = i2;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(p(i));
    }

    private void h(int i) {
        if (i >= 0 && i < this.c) {
            return;
        }
        throw new IndexOutOfBoundsException(p(i));
    }

    private String p(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    public void S0(int i) {
        a();
        int i2 = this.c;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.b = iArr2;
        }
        int[] iArr3 = this.b;
        int i3 = this.c;
        this.c = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        a();
        x.a(collection);
        if (!(collection instanceof w)) {
            return super.addAll(collection);
        }
        w wVar = (w) collection;
        int i = wVar.c;
        if (i == 0) {
            return false;
        }
        int i2 = this.c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.b;
            if (i3 > iArr.length) {
                this.b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(wVar.b, 0, this.b, this.c, wVar.c);
            this.c = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d */
    public void add(int i, Integer num) {
        g(i, num.intValue());
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return super.equals(obj);
        }
        w wVar = (w) obj;
        if (this.c != wVar.c) {
            return false;
        }
        int[] iArr = wVar.b;
        for (int i = 0; i < this.c; i++) {
            if (this.b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: f */
    public boolean add(Integer num) {
        S0(num.intValue());
        return true;
    }

    public int getInt(int i) {
        h(i);
        return this.b[i];
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.c; i2++) {
            i = (i * 31) + this.b[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k */
    public Integer get(int i) {
        return Integer.valueOf(getInt(i));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        a();
        if (i2 >= i) {
            int[] iArr = this.b;
            System.arraycopy(iArr, i2, iArr, i, this.c - i2);
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

    @Override // androidx.datastore.preferences.protobuf.x.i
    /* renamed from: t */
    public x.g i(int i) {
        if (i >= this.c) {
            return new w(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: u */
    public Integer remove(int i) {
        int i2;
        a();
        h(i);
        int[] iArr = this.b;
        int i3 = iArr[i];
        if (i < this.c - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(w(i, num.intValue()));
    }

    public int w(int i, int i2) {
        a();
        h(i);
        int[] iArr = this.b;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    private w(int[] iArr, int i) {
        this.b = iArr;
        this.c = i;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.c; i++) {
            if (obj.equals(Integer.valueOf(this.b[i]))) {
                int[] iArr = this.b;
                System.arraycopy(iArr, i + 1, iArr, i, (this.c - i) - 1);
                this.c--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }
}
