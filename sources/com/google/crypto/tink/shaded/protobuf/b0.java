package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: LazyStringArrayList.java */
/* loaded from: classes2.dex */
public class b0 extends c<String> implements co5, RandomAccess {
    private static final b0 c;
    public static final co5 d;
    private final List<Object> b;

    static {
        b0 b0Var = new b0();
        c = b0Var;
        b0Var.l();
        d = b0Var;
    }

    public b0() {
        this(10);
    }

    private static String f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof h) {
            return ((h) obj).o0();
        }
        return y.j((byte[]) obj);
    }

    @Override // defpackage.co5
    public void E1(h hVar) {
        a();
        this.b.add(hVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
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

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
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
        if (obj instanceof h) {
            h hVar = (h) obj;
            String o0 = hVar.o0();
            if (hVar.H()) {
                this.b.set(i, o0);
            }
            return o0;
        }
        byte[] bArr = (byte[]) obj;
        String j = y.j(bArr);
        if (y.g(bArr)) {
            this.b.set(i, j);
        }
        return j;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.y.i
    /* renamed from: h */
    public b0 i(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.b);
            return new b0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: k */
    public String remove(int i) {
        a();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        return f(remove);
    }

    @Override // defpackage.co5
    public List<?> n() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, com.google.crypto.tink.shaded.protobuf.y.i
    public /* bridge */ /* synthetic */ boolean o() {
        return super.o();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p */
    public String set(int i, String str) {
        a();
        return f(this.b.set(i, str));
    }

    @Override // defpackage.co5
    public co5 q() {
        if (o()) {
            return new zqb(this);
        }
        return this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // defpackage.co5
    public Object s(int i) {
        return this.b.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.b.size();
    }

    public b0(int i) {
        this(new ArrayList(i));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        a();
        if (collection instanceof co5) {
            collection = ((co5) collection).n();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private b0(ArrayList<Object> arrayList) {
        this.b = arrayList;
    }
}
