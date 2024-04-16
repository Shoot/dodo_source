package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: ArrayIterator.java */
/* renamed from: ir  reason: default package */
/* loaded from: classes2.dex */
public class ir<T> implements Iterator<T>, Iterable<T> {
    private final T[] a;
    private int b = 0;

    public ir(T[] tArr) {
        this.a = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.b < this.a.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.b;
        T[] tArr = this.a;
        if (i < tArr.length) {
            this.b = i + 1;
            return tArr[i];
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this;
    }
}
