package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
/* compiled from: LazyStringArrayList.java */
/* loaded from: classes.dex */
public class a0 extends c<String> implements eo5, RandomAccess {
    private static final a0 c;
    public static final eo5 d;
    private final List<Object> b;

    static {
        a0 a0Var = new a0();
        c = a0Var;
        a0Var.l();
        d = a0Var;
    }

    public a0() {
        this(10);
    }

    private static String f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof g) {
            return ((g) obj).o0();
        }
        return x.j((byte[]) obj);
    }

    @Override // defpackage.eo5
    public void Y0(g gVar) {
        a();
        this.b.add(gVar);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
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

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
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
        if (obj instanceof g) {
            g gVar = (g) obj;
            String o0 = gVar.o0();
            if (gVar.H()) {
                this.b.set(i, o0);
            }
            return o0;
        }
        byte[] bArr = (byte[]) obj;
        String j = x.j(bArr);
        if (x.g(bArr)) {
            this.b.set(i, j);
        }
        return j;
    }

    @Override // androidx.datastore.preferences.protobuf.x.i
    /* renamed from: h */
    public a0 i(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.b);
            return new a0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: k */
    public String remove(int i) {
        a();
        Object remove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        return f(remove);
    }

    @Override // defpackage.eo5
    public List<?> n() {
        return Collections.unmodifiableList(this.b);
    }

    @Override // androidx.datastore.preferences.protobuf.c, androidx.datastore.preferences.protobuf.x.i
    public /* bridge */ /* synthetic */ boolean o() {
        return super.o();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p */
    public String set(int i, String str) {
        a();
        return f(this.b.set(i, str));
    }

    @Override // defpackage.eo5
    public eo5 q() {
        if (o()) {
            return new brb(this);
        }
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // defpackage.eo5
    public Object s(int i) {
        return this.b.get(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.b.size();
    }

    public a0(int i) {
        this(new ArrayList(i));
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        a();
        if (collection instanceof eo5) {
            collection = ((eo5) collection).n();
        }
        boolean addAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // androidx.datastore.preferences.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private a0(ArrayList<Object> arrayList) {
        this.b = arrayList;
    }
}
