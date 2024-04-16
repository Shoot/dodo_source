package defpackage;

import androidx.datastore.preferences.protobuf.g;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: UnmodifiableLazyStringList.java */
/* renamed from: brb  reason: default package */
/* loaded from: classes.dex */
public class brb extends AbstractList<String> implements eo5, RandomAccess {
    private final eo5 a;

    /* compiled from: UnmodifiableLazyStringList.java */
    /* renamed from: brb$a */
    /* loaded from: classes.dex */
    class a implements ListIterator<String> {
        ListIterator<String> a;
        final /* synthetic */ int b;

        a(int i) {
            this.b = i;
            this.a = brb.this.a.listIterator(i);
        }

        @Override // java.util.ListIterator
        /* renamed from: a */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b */
        public String next() {
            return this.a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: c */
        public String previous() {
            return this.a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: UnmodifiableLazyStringList.java */
    /* renamed from: brb$b */
    /* loaded from: classes.dex */
    class b implements Iterator<String> {
        Iterator<String> a;

        b() {
            this.a = brb.this.a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public String next() {
            return this.a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public brb(eo5 eo5Var) {
        this.a = eo5Var;
    }

    @Override // defpackage.eo5
    public void Y0(g gVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d */
    public String get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i) {
        return new a(i);
    }

    @Override // defpackage.eo5
    public List<?> n() {
        return this.a.n();
    }

    @Override // defpackage.eo5
    public Object s(int i) {
        return this.a.s(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.a.size();
    }

    @Override // defpackage.eo5
    public eo5 q() {
        return this;
    }
}
