package defpackage;

import java.util.NoSuchElementException;
/* compiled from: AbstractIndexedListIterator.java */
/* renamed from: l1  reason: default package */
/* loaded from: classes2.dex */
abstract class l1<E> extends crb<E> {
    private final int a;
    private int b;

    /* JADX INFO: Access modifiers changed from: protected */
    public l1(int i, int i2) {
        hh8.k(i2, i);
        this.a = i;
        this.b = i2;
    }

    protected abstract E a(int i);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        if (this.b < this.a) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (hasNext()) {
            int i = this.b;
            this.b = i + 1;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            int i = this.b - 1;
            this.b = i;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }
}
