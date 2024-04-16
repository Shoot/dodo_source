package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.tz7;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: SnapshotStateMap.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0006\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00020\u0004:\u0001\u001aB\u0007¢\u0006\u0004\b8\u00106J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\fJ\u001a\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J!\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0016\u001a\u00020\u00072\u0014\u0010\u0015\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00018\u00012\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u0018\u0010\fR$\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR,\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R \u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b%\u0010#R \u0010,\u001a\b\u0012\u0004\u0012\u00028\u00010'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u00020-8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b(\u0010/R&\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001028@X\u0080\u0004¢\u0006\f\u0012\u0004\b5\u00106\u001a\u0004\b3\u00104¨\u00069"}, d2 = {"Lupa;", "K", "V", "", "Lzua;", "Lbva;", "value", "", "g", Action.KEY_ATTRIBUTE, "", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "clear", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", RemoteMessageConst.FROM, "putAll", CartQueueItemEntity.OPERATION_REMOVE, "l", "<set-?>", "a", "Lbva;", "i", "()Lbva;", "firstStateRecord", "", "", "b", "Ljava/util/Set;", "()Ljava/util/Set;", "entries", c.a, "keys", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Collection;", "k", "()Ljava/util/Collection;", "values", "", Image.TYPE_HIGH, "()I", "size", "modification", "Lupa$a;", e.a, "()Lupa$a;", "getReadable$runtime_release$annotations", "()V", "readable", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: upa  reason: default package */
/* loaded from: classes.dex */
public final class upa<K, V> implements Map<K, V>, zua, fe5 {
    private bva a = new a(xn3.a());
    private final Set<Map.Entry<K, V>> b = new gpa(this);
    private final Set<K> c = new hpa(this);
    private final Collection<V> d = new jpa(this);

    /* compiled from: SnapshotStateMap.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001d\b\u0000\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016R.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lupa$a;", "K", "V", "Lbva;", "value", "", c.a, DateTokenConverter.CONVERTER_KEY, "Ltz7;", "Ltz7;", "i", "()Ltz7;", "k", "(Ltz7;)V", "map", "", "I", "j", "()I", "l", "(I)V", "modification", "<init>", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: upa$a */
    /* loaded from: classes.dex */
    public static final class a<K, V> extends bva {
        private tz7<K, ? extends V> c;
        private int d;

        public a(tz7<K, ? extends V> tz7Var) {
            z65.h(tz7Var, "map");
            this.c = tz7Var;
        }

        @Override // defpackage.bva
        public void c(bva bvaVar) {
            Object obj;
            z65.h(bvaVar, "value");
            a aVar = (a) bvaVar;
            obj = vpa.a;
            synchronized (obj) {
                this.c = aVar.c;
                this.d = aVar.d;
                Unit unit = Unit.a;
            }
        }

        @Override // defpackage.bva
        public bva d() {
            return new a(this.c);
        }

        public final tz7<K, V> i() {
            return (tz7<K, ? extends V>) this.c;
        }

        public final int j() {
            return this.d;
        }

        public final void k(tz7<K, ? extends V> tz7Var) {
            z65.h(tz7Var, "<set-?>");
            this.c = tz7Var;
        }

        public final void l(int i) {
            this.d = i;
        }
    }

    public Set<Map.Entry<K, V>> b() {
        return this.b;
    }

    public Set<K> c() {
        return this.c;
    }

    @Override // java.util.Map
    public void clear() {
        yoa b;
        Object obj;
        bva i = i();
        z65.f(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) fpa.D((a) i);
        aVar.i();
        tz7<K, V> a2 = xn3.a();
        if (a2 != aVar.i()) {
            bva i2 = i();
            z65.f(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) i2;
            fpa.H();
            synchronized (fpa.G()) {
                b = yoa.e.b();
                a aVar3 = (a) fpa.f0(aVar2, this, b);
                obj = vpa.a;
                synchronized (obj) {
                    aVar3.k(a2);
                    aVar3.l(aVar3.j() + 1);
                }
            }
            fpa.O(b, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return e().i().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return e().i().containsValue(obj);
    }

    public final int d() {
        return e().j();
    }

    public final a<K, V> e() {
        bva i = i();
        z65.f(i, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a) fpa.V((a) i, this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return b();
    }

    @Override // defpackage.zua
    public void g(bva bvaVar) {
        z65.h(bvaVar, "value");
        this.a = (a) bvaVar;
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return e().i().get(obj);
    }

    public int h() {
        return e().i().size();
    }

    @Override // defpackage.zua
    public bva i() {
        return this.a;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return e().i().isEmpty();
    }

    @Override // defpackage.zua
    public /* synthetic */ bva j(bva bvaVar, bva bvaVar2, bva bvaVar3) {
        return yua.a(this, bvaVar, bvaVar2, bvaVar3);
    }

    public Collection<V> k() {
        return this.d;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return c();
    }

    public final boolean l(V v) {
        Object obj;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (z65.c(((Map.Entry) obj).getValue(), v)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            remove(entry.getKey());
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        Object obj;
        tz7<K, V> i;
        int j;
        V put;
        yoa b;
        Object obj2;
        boolean z;
        do {
            obj = vpa.a;
            synchronized (obj) {
                bva i2 = i();
                z65.f(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) fpa.D((a) i2);
                i = aVar.i();
                j = aVar.j();
                Unit unit = Unit.a;
            }
            z65.e(i);
            tz7.a<K, V> f = i.f();
            put = f.put(k, v);
            tz7<K, V> a2 = f.a();
            if (z65.c(a2, i)) {
                break;
            }
            bva i3 = i();
            z65.f(i3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) i3;
            fpa.H();
            synchronized (fpa.G()) {
                b = yoa.e.b();
                a aVar3 = (a) fpa.f0(aVar2, this, b);
                obj2 = vpa.a;
                synchronized (obj2) {
                    if (aVar3.j() == j) {
                        aVar3.k(a2);
                        z = true;
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            fpa.O(b, this);
        } while (!z);
        return put;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        Object obj;
        tz7<K, V> i;
        int j;
        yoa b;
        Object obj2;
        boolean z;
        z65.h(map, RemoteMessageConst.FROM);
        do {
            obj = vpa.a;
            synchronized (obj) {
                bva i2 = i();
                z65.f(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) fpa.D((a) i2);
                i = aVar.i();
                j = aVar.j();
                Unit unit = Unit.a;
            }
            z65.e(i);
            tz7.a<K, V> f = i.f();
            f.putAll(map);
            tz7<K, V> a2 = f.a();
            if (!z65.c(a2, i)) {
                bva i3 = i();
                z65.f(i3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar2 = (a) i3;
                fpa.H();
                synchronized (fpa.G()) {
                    b = yoa.e.b();
                    a aVar3 = (a) fpa.f0(aVar2, this, b);
                    obj2 = vpa.a;
                    synchronized (obj2) {
                        if (aVar3.j() == j) {
                            aVar3.k(a2);
                            z = true;
                            aVar3.l(aVar3.j() + 1);
                        } else {
                            z = false;
                        }
                    }
                }
                fpa.O(b, this);
            } else {
                return;
            }
        } while (!z);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        Object obj2;
        tz7<K, V> i;
        int j;
        V remove;
        yoa b;
        Object obj3;
        boolean z;
        do {
            obj2 = vpa.a;
            synchronized (obj2) {
                bva i2 = i();
                z65.f(i2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) fpa.D((a) i2);
                i = aVar.i();
                j = aVar.j();
                Unit unit = Unit.a;
            }
            z65.e(i);
            tz7.a<K, V> f = i.f();
            remove = f.remove(obj);
            tz7<K, V> a2 = f.a();
            if (z65.c(a2, i)) {
                break;
            }
            bva i3 = i();
            z65.f(i3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) i3;
            fpa.H();
            synchronized (fpa.G()) {
                b = yoa.e.b();
                a aVar3 = (a) fpa.f0(aVar2, this, b);
                obj3 = vpa.a;
                synchronized (obj3) {
                    if (aVar3.j() == j) {
                        aVar3.k(a2);
                        z = true;
                        aVar3.l(aVar3.j() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            fpa.O(b, this);
        } while (!z);
        return remove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return h();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return k();
    }
}
