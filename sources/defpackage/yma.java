package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SingletonImmutableSet.java */
/* renamed from: yma  reason: default package */
/* loaded from: classes2.dex */
public final class yma<E> extends zw4<E> {
    final transient E c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public yma(E e) {
        this.c = (E) hh8.i(e);
    }

    @Override // defpackage.uw4
    int a(Object[] objArr, int i) {
        objArr[i] = this.c;
        return i + 1;
    }

    @Override // defpackage.uw4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.c.equals(obj);
    }

    @Override // defpackage.zw4, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.c.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.uw4
    public boolean u() {
        return false;
    }

    @Override // defpackage.zw4, defpackage.uw4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: w */
    public yqb<E> iterator() {
        return e85.d(this.c);
    }
}
