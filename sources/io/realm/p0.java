package io.realm;

import io.realm.internal.OsResults;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
/* compiled from: RealmResults.java */
/* loaded from: classes3.dex */
public class p0<E> extends a0<E> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public p0(a aVar, OsResults osResults, Class<E> cls) {
        this(aVar, osResults, (Class) cls, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.a0, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        super.add(i, obj);
    }

    @Override // io.realm.a0, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean addAll(int i, Collection collection) {
        return super.addAll(i, collection);
    }

    @Override // io.realm.a0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // io.realm.a0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public boolean d() {
        this.a.c();
        this.d.k();
        return true;
    }

    @Override // io.realm.a0, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ Object get(int i) {
        return super.get(i);
    }

    @Override // io.realm.RealmCollection
    public boolean isLoaded() {
        this.a.c();
        return this.d.i();
    }

    @Override // io.realm.a0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // io.realm.a0, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator() {
        return super.listIterator();
    }

    @Override // io.realm.a0, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ Object remove(int i) {
        return super.remove(i);
    }

    @Override // io.realm.a0, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // io.realm.a0, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.a0, java.util.AbstractList, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return super.set(i, obj);
    }

    @Override // io.realm.a0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    p0(a aVar, OsResults osResults, Class<E> cls, boolean z) {
        super(aVar, osResults, cls, a0.a(z, aVar, osResults, cls, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.realm.a0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // io.realm.a0, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return super.addAll(collection);
    }

    @Override // io.realm.a0, java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return super.listIterator(i);
    }

    @Override // io.realm.a0, java.util.AbstractCollection, java.util.Collection, java.util.List
    @Deprecated
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0(a aVar, OsResults osResults, String str) {
        this(aVar, osResults, str, false);
    }

    p0(a aVar, OsResults osResults, String str, boolean z) {
        super(aVar, osResults, str, a0.a(z, aVar, osResults, null, str));
    }
}
