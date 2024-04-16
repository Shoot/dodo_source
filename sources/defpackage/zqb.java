package defpackage;

import com.google.crypto.tink.shaded.protobuf.h;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: UnmodifiableLazyStringList.java */
/* renamed from: zqb  reason: default package */
/* loaded from: classes2.dex */
public class zqb extends AbstractList<String> implements co5, RandomAccess {
    private final co5 a;

    /* compiled from: UnmodifiableLazyStringList.java */
    /* renamed from: zqb$a */
    /* loaded from: classes2.dex */
    class a implements ListIterator<String> {
        ListIterator<String> a;
        final /* synthetic */ int b;

        a(int i) {
            this.b = i;
            this.a = zqb.this.a.listIterator(i);
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
    /* renamed from: zqb$b */
    /* loaded from: classes2.dex */
    class b implements Iterator<String> {
        Iterator<String> a;

        b() {
            this.a = zqb.this.a.iterator();
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

    public zqb(co5 co5Var) {
        this.a = co5Var;
    }

    @Override // defpackage.co5
    public void E1(h hVar) {
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

    @Override // defpackage.co5
    public List<?> n() {
        return this.a.n();
    }

    @Override // defpackage.co5
    public Object s(int i) {
        return this.a.s(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.a.size();
    }

    @Override // defpackage.co5
    public co5 q() {
        return this;
    }
}
