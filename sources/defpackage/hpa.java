package defpackage;

import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.tz7;
import defpackage.upa;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotStateMap.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000bH\u0096\u0002J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0016\u0010\u0011\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u0016\u0010\u0013\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¨\u0006\u0018"}, d2 = {"Lhpa;", "K", "V", "Lipa;", "element", "", Image.TYPE_HIGH, "(Ljava/lang/Object;)Ljava/lang/Void;", "", "elements", "k", "Ltua;", "p", "", CartQueueItemEntity.OPERATION_REMOVE, "(Ljava/lang/Object;)Z", "removeAll", "retainAll", "contains", "containsAll", "Lupa;", "map", "<init>", "(Lupa;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: hpa  reason: default package */
/* loaded from: classes.dex */
public final class hpa<K, V> extends ipa<K, V, K> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpa(upa<K, V> upaVar) {
        super(upaVar);
        z65.h(upaVar, "map");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) h(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) k(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return d().containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        z65.h(collection, "elements");
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        for (Object obj : collection2) {
            if (!d().containsKey(obj)) {
                return false;
            }
        }
        return true;
    }

    public Void h(K k) {
        vpa.b();
        throw new KotlinNothingValueException();
    }

    public Void k(Collection<? extends K> collection) {
        z65.h(collection, "elements");
        vpa.b();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    /* renamed from: p */
    public tua<K, V> iterator() {
        return new tua<>(d(), ((ax4) d().e().i().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        if (d().remove(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        z65.h(collection, "elements");
        while (true) {
            boolean z = false;
            for (Object obj : collection) {
                if (d().remove(obj) != null || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        Set K0;
        Object obj;
        tz7<K, V> i;
        int j;
        boolean z;
        yoa b;
        Object obj2;
        z65.h(collection, "elements");
        K0 = sc1.K0(collection);
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
            Iterator<Map.Entry<K, V>> it = d.entrySet().iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<K, V> next = it.next();
                if (!K0.contains(next.getKey())) {
                    f.remove(next.getKey());
                    z2 = true;
                }
            }
            Unit unit2 = Unit.a;
            tz7<K, V> a = f.a();
            if (z65.c(a, i)) {
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
                        aVar3.k(a);
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
}
