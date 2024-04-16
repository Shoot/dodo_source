package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import defpackage.tz7;
import defpackage.upa;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.ranges.i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotStateMap.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\n\u001a\u00020\u00062\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\bH\u0016J\u001b\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u000bH\u0096\u0002J\u001c\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u000f\u001a\u00020\r2\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\bH\u0016J\"\u0010\u0010\u001a\u00020\r2\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\bH\u0016J\u001d\u0010\u0011\u001a\u00020\r2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\"\u0010\u0012\u001a\u00020\r2\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\bH\u0016¨\u0006\u0017"}, d2 = {"Lgpa;", "K", "V", "Lipa;", "", "element", "", Image.TYPE_HIGH, "", "elements", "k", "", "iterator", "", "t", "removeAll", "retainAll", "p", "containsAll", "Lupa;", "map", "<init>", "(Lupa;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: gpa  reason: default package */
/* loaded from: classes.dex */
public final class gpa<K, V> extends ipa<K, V, Map.Entry<K, V>> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpa(upa<K, V> upaVar) {
        super(upaVar);
        z65.h(upaVar, "map");
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) h((Map.Entry) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) k(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!unb.l(obj)) {
            return false;
        }
        return p((Map.Entry) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        z65.h(collection, "elements");
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Void h(Map.Entry<K, V> entry) {
        z65.h(entry, "element");
        vpa.b();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new rua(d(), ((ax4) d().e().i().entrySet()).iterator());
    }

    public Void k(Collection<? extends Map.Entry<K, V>> collection) {
        z65.h(collection, "elements");
        vpa.b();
        throw new KotlinNothingValueException();
    }

    public boolean p(Map.Entry<K, V> entry) {
        z65.h(entry, "element");
        return z65.c(d().get(entry.getKey()), entry.getValue());
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (!unb.l(obj)) {
            return false;
        }
        return t((Map.Entry) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        z65.h(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (d().remove(((Map.Entry) it.next()).getKey()) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        int w;
        int e;
        int e2;
        Object obj;
        tz7<K, V> i;
        int j;
        boolean z;
        yoa b;
        Object obj2;
        z65.h(collection, "elements");
        Collection<? extends Object> collection2 = collection;
        w = lc1.w(collection2, 10);
        e = f86.e(w);
        e2 = i.e(e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair a = lnb.a(entry.getKey(), entry.getValue());
            linkedHashMap.put(a.c(), a.d());
        }
        upa<K, V> d = d();
        boolean z2 = false;
        do {
            obj = vpa.a;
            synchronized (obj) {
                bva i2 = d.i();
                z65.f(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                upa.a aVar = (upa.a) fpa.D((upa.a) i2);
                i = aVar.i();
                j = aVar.j();
                Unit unit = Unit.a;
            }
            z65.e(i);
            tz7.a<K, V> f = i.f();
            Iterator<Map.Entry<K, V>> it2 = d.entrySet().iterator();
            while (true) {
                z = true;
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry<K, V> next = it2.next();
                if (!linkedHashMap.containsKey(next.getKey()) || !z65.c(linkedHashMap.get(next.getKey()), next.getValue())) {
                    f.remove(next.getKey());
                    z2 = true;
                }
            }
            Unit unit2 = Unit.a;
            tz7<K, V> a2 = f.a();
            if (z65.c(a2, i)) {
                break;
            }
            bva i3 = d.i();
            z65.f(i3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            upa.a aVar2 = (upa.a) i3;
            fpa.H();
            synchronized (fpa.G()) {
                b = yoa.e.b();
                upa.a aVar3 = (upa.a) fpa.f0(aVar2, d, b);
                obj2 = vpa.a;
                synchronized (obj2) {
                    if (aVar3.j() == j) {
                        aVar3.k(a2);
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            fpa.O(b, d);
        } while (!z);
        return z2;
    }

    public boolean t(Map.Entry<K, V> entry) {
        z65.h(entry, "element");
        if (d().remove(entry.getKey()) != null) {
            return true;
        }
        return false;
    }
}
