package defpackage;

import java.util.Iterator;
/* compiled from: LazyIterator.java */
/* renamed from: wn5  reason: default package */
/* loaded from: classes.dex */
public class wn5<T> implements Iterator<T> {
    private final Iterable<? extends T> a;
    private Iterator<? extends T> b;

    public wn5(Iterable<? extends T> iterable) {
        this.a = iterable;
    }

    private void a() {
        if (this.b != null) {
            return;
        }
        this.b = this.a.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        a();
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public T next() {
        a();
        return this.b.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        a();
        this.b.remove();
    }
}
