package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: LazyStringArrayList.java */
/* loaded from: classes.dex */
public class z extends c<String> implements do5, RandomAccess {
    private static final z c;
    public static final do5 d;
    private final List<Object> b;

    static {
        z zVar = new z();
        c = zVar;
        zVar.l();
        d = zVar;
    }

    public z() {
        this(10);
    }

    private static String f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof f) {
            return ((f) obj).n0();
        }
        return w.j((byte[]) obj);
    }

    @Override // defpackage.do5
    public void L(f fVar) {
        a();
        this.b.add(fVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        a();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d */
    public void add(int i, String str) {
        a();
        this.b.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: g */
    public String get(int i) {
        Object obj = this.b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String n0 = fVar.n0();
            if (fVar.G()) {
                this.b.set(i, n0);
            }
            return n0;
        }
        byte[] bArr = (byte[]) obj;
        String j = w.j(bArr);
        if (w.g(bArr)) {
            this.b.set(i, j);
        }
        return j;
    }

    @Override // com.google.protobuf.w.i
    /* renamed from: h */
    public z i(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.b);
            return new z(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: k */
    public String remove(int i) {
        a();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        return f(remove);
    }

    @Override // defpackage.do5
    public List<?> n() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // com.google.protobuf.c, com.google.protobuf.w.i
    public /* bridge */ /* synthetic */ boolean o() {
        return super.o();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p */
    public String set(int i, String str) {
        a();
        return f(this.b.set(i, str));
    }

    @Override // defpackage.do5
    public do5 q() {
        if (o()) {
            return new arb(this);
        }
        return this;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // defpackage.do5
    public Object s(int i) {
        return this.b.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.b.size();
    }

    public z(int i) {
        this(new ArrayList(i));
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        a();
        if (collection instanceof do5) {
            collection = ((do5) collection).n();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private z(ArrayList<Object> arrayList) {
        this.b = arrayList;
    }
}
