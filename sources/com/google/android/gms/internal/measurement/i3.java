package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* loaded from: classes2.dex */
final class i3<E> extends x0<E> implements RandomAccess {
    private static final i3<Object> d = new i3<>(new Object[0], 0, false);
    private E[] b;
    private int c;

    private i3(E[] eArr, int i, boolean z) {
        super(z);
        this.b = eArr;
        this.c = i;
    }

    private final String d(int i) {
        int i2 = this.c;
        return "Index:" + i + ", Size:" + i2;
    }

    private final void f(int i) {
        if (i >= 0 && i < this.c) {
            return;
        }
        throw new IndexOutOfBoundsException(d(i));
    }

    public static <E> i3<E> g() {
        return (i3<E>) d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        a();
        if (i >= 0 && i <= (i2 = this.c)) {
            E[] eArr = this.b;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(eArr, 0, eArr2, 0, i);
                System.arraycopy(this.b, i, eArr2, i + 1, this.c - i);
                this.b = eArr2;
            }
            this.b[i] = e;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(d(i));
    }

    @Override // defpackage.o2d
    public final /* synthetic */ o2d e(int i) {
        if (i >= this.c) {
            return new i3(Arrays.copyOf(this.b, i), this.c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        f(i);
        return this.b[i];
    }

    @Override // com.google.android.gms.internal.measurement.x0, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        a();
        f(i);
        E[] eArr = this.b;
        E e = eArr[i];
        if (i < this.c - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.c--;
        ((AbstractList) this).modCount++;
        return e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        a();
        f(i);
        E[] eArr = this.b;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.measurement.x0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        a();
        int i = this.c;
        E[] eArr = this.b;
        if (i == eArr.length) {
            this.b = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.b;
        int i2 = this.c;
        this.c = i2 + 1;
        eArr2[i2] = e;
        ((AbstractList) this).modCount++;
        return true;
    }
}
