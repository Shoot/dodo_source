package defpackage;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* compiled from: DirectedAcyclicGraph.java */
/* renamed from: s23  reason: default package */
/* loaded from: classes.dex */
public final class s23<T> {
    private final jf8<ArrayList<T>> a = new lf8(10);
    private final wka<T, ArrayList<T>> b = new wka<>();
    private final ArrayList<T> c = new ArrayList<>();
    private final HashSet<T> d = new HashSet<>();

    private void e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (!hashSet.contains(t)) {
            hashSet.add(t);
            ArrayList<T> arrayList2 = this.b.get(t);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    e(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    @NonNull
    private ArrayList<T> f() {
        ArrayList<T> b = this.a.b();
        if (b == null) {
            return new ArrayList<>();
        }
        return b;
    }

    private void k(@NonNull ArrayList<T> arrayList) {
        arrayList.clear();
        this.a.a(arrayList);
    }

    public void a(@NonNull T t, @NonNull T t2) {
        if (this.b.containsKey(t) && this.b.containsKey(t2)) {
            ArrayList<T> arrayList = this.b.get(t);
            if (arrayList == null) {
                arrayList = f();
                this.b.put(t, arrayList);
            }
            arrayList.add(t2);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    public void b(@NonNull T t) {
        if (!this.b.containsKey(t)) {
            this.b.put(t, null);
        }
    }

    public void c() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> o = this.b.o(i);
            if (o != null) {
                k(o);
            }
        }
        this.b.clear();
    }

    public boolean d(@NonNull T t) {
        return this.b.containsKey(t);
    }

    public List g(@NonNull T t) {
        return this.b.get(t);
    }

    public List<T> h(@NonNull T t) {
        int size = this.b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> o = this.b.o(i);
            if (o != null && o.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.b.k(i));
            }
        }
        return arrayList;
    }

    @NonNull
    public ArrayList<T> i() {
        this.c.clear();
        this.d.clear();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            e(this.b.k(i), this.c, this.d);
        }
        return this.c;
    }

    public boolean j(@NonNull T t) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> o = this.b.o(i);
            if (o != null && o.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
