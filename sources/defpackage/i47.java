package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: ObjFilter.java */
/* renamed from: i47  reason: default package */
/* loaded from: classes.dex */
public class i47<T> implements Iterator<T> {
    private final Iterator<? extends T> a;
    private final ph8<? super T> b;
    private boolean c;
    private boolean d;
    private T e;

    public i47(Iterator<? extends T> it, ph8<? super T> ph8Var) {
        this.a = it;
        this.b = ph8Var;
    }

    private void a() {
        while (this.a.hasNext()) {
            T next = this.a.next();
            this.e = next;
            if (this.b.b(next)) {
                this.c = true;
                return;
            }
        }
        this.c = false;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.d) {
            a();
            this.d = true;
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!this.d) {
            this.c = hasNext();
        }
        if (this.c) {
            this.d = false;
            return this.e;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove not supported");
    }
}
