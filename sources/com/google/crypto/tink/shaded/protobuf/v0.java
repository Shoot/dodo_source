package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProtobufArrayList.java */
/* loaded from: classes2.dex */
public final class v0<E> extends c<E> implements RandomAccess {
    private static final v0<Object> d;
    private E[] b;
    private int c;

    static {
        v0<Object> v0Var = new v0<>(new Object[0], 0);
        d = v0Var;
        v0Var.l();
    }

    private v0(E[] eArr, int i) {
        this.b = eArr;
        this.c = i;
    }

    private static <E> E[] d(int i) {
        return (E[]) new Object[i];
    }

    public static <E> v0<E> f() {
        return (v0<E>) d;
    }

    private void g(int i) {
        if (i >= 0 && i < this.c) {
            return;
        }
        throw new IndexOutOfBoundsException(h(i));
    }

    private String h(int i) {
        return "Index:" + i + ", Size:" + this.c;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e) {
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

    @Override // java.util.AbstractList, java.util.List
    public E get(int i) {
        g(i);
        return this.b[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y.i
    /* renamed from: k */
    public v0<E> i(int i) {
        if (i >= this.c) {
            return new v0<>(Arrays.copyOf(this.b, i), this.c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public E remove(int i) {
        int i2;
        a();
        g(i);
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
    public E set(int i, E e) {
        a();
        g(i);
        E[] eArr = this.b;
        E e2 = eArr[i];
        eArr[i] = e;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, E e) {
        int i2;
        a();
        if (i >= 0 && i <= (i2 = this.c)) {
            E[] eArr = this.b;
            if (i2 < eArr.length) {
                System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
            } else {
                E[] eArr2 = (E[]) d(((i2 * 3) / 2) + 1);
                System.arraycopy(this.b, 0, eArr2, 0, i);
                System.arraycopy(this.b, i, eArr2, i + 1, this.c - i);
                this.b = eArr2;
            }
            this.b[i] = e;
            this.c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(h(i));
    }
}
