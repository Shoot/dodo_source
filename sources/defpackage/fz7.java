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
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: PersistentHashMapBuilder.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\bE\u0010FJ\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\u00020\u00122\u0014\u0010\u0011\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H\u0016J\u0019\u0010\u0014\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\fJ\u001d\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0012H\u0016R\"\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R*\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R.\u0010*\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00101\u001a\u0004\u0018\u00018\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R*\u0010<\u001a\u0002022\u0006\u0010\r\u001a\u0002028\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b:\u00104\u001a\u0004\b+\u00106\"\u0004\b;\u00108R&\u0010@\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010>0=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010?R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010?R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00010B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010C¨\u0006G"}, d2 = {"Lfz7;", "K", "V", "Ltz7$a;", "Lx1;", "Ldz7;", "g", Action.KEY_ATTRIBUTE, "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", RemoteMessageConst.FROM, "", "putAll", CartQueueItemEntity.OPERATION_REMOVE, "(Ljava/lang/Object;Ljava/lang/Object;)Z", "clear", "a", "Ldz7;", "map", "Lhq6;", "<set-?>", "b", "Lhq6;", "j", "()Lhq6;", Image.TYPE_MEDIUM, "(Lhq6;)V", "ownership", "Lumb;", c.a, "Lumb;", "i", "()Lumb;", "setNode$runtime_release", "(Lumb;)V", "node", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", "getOperationResult$runtime_release", "()Ljava/lang/Object;", "l", "(Ljava/lang/Object;)V", "operationResult", "", e.a, "I", Image.TYPE_HIGH, "()I", "k", "(I)V", "modCount", "f", "n", "size", "", "", "()Ljava/util/Set;", "entries", "keys", "", "()Ljava/util/Collection;", "values", "<init>", "(Ldz7;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: fz7  reason: default package */
/* loaded from: classes.dex */
public class fz7<K, V> extends x1<K, V> implements tz7.a<K, V> {
    private dz7<K, V> a;
    private hq6 b;
    private umb<K, V> c;
    private V d;
    private int e;
    private int f;

    public fz7(dz7<K, V> dz7Var) {
        z65.h(dz7Var, "map");
        this.a = dz7Var;
        this.b = new hq6();
        this.c = this.a.q();
        this.f = this.a.size();
    }

    @Override // defpackage.x1
    public Set<Map.Entry<K, V>> b() {
        return new hz7(this);
    }

    @Override // defpackage.x1
    public Set<K> c() {
        return new jz7(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        umb<K, V> a = umb.e.a();
        z65.f(a, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.c = a;
        n(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(K k) {
        int i;
        umb<K, V> umbVar = this.c;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        return umbVar.k(i, k, 0);
    }

    @Override // defpackage.x1
    public int d() {
        return this.f;
    }

    @Override // defpackage.x1
    public Collection<V> e() {
        return new lz7(this);
    }

    @Override // defpackage.tz7.a, defpackage.bz7.a
    /* renamed from: g */
    public dz7<K, V> a() {
        dz7<K, V> dz7Var;
        if (this.c == this.a.q()) {
            dz7Var = this.a;
        } else {
            this.b = new hq6();
            dz7Var = new dz7<>(this.c, size());
        }
        this.a = dz7Var;
        return dz7Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(K k) {
        int i;
        umb<K, V> umbVar = this.c;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        return umbVar.o(i, k, 0);
    }

    public final int h() {
        return this.e;
    }

    public final umb<K, V> i() {
        return this.c;
    }

    public final hq6 j() {
        return this.b;
    }

    public final void k(int i) {
        this.e = i;
    }

    public final void l(V v) {
        this.d = v;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m(hq6 hq6Var) {
        z65.h(hq6Var, "<set-?>");
        this.b = hq6Var;
    }

    public void n(int i) {
        this.f = i;
        this.e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        int i;
        this.d = null;
        umb<K, V> umbVar = this.c;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        this.c = umbVar.D(i, k, v, 0, this);
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        dz7<K, V> dz7Var;
        fz7 fz7Var;
        z65.h(map, RemoteMessageConst.FROM);
        if (map instanceof dz7) {
            dz7Var = (dz7) map;
        } else {
            dz7Var = null;
        }
        if (dz7Var == null) {
            if (map instanceof fz7) {
                fz7Var = (fz7) map;
            } else {
                fz7Var = null;
            }
            if (fz7Var != null) {
                dz7Var = fz7Var.a();
            } else {
                dz7Var = null;
            }
        }
        if (dz7Var != null) {
            yz2 yz2Var = new yz2(0, 1, null);
            int size = size();
            umb<K, V> umbVar = this.c;
            umb<K, V> q = dz7Var.q();
            z65.f(q, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            this.c = umbVar.E(q, 0, yz2Var, this);
            int size2 = (dz7Var.size() + size) - yz2Var.a();
            if (size != size2) {
                n(size2);
                return;
            }
            return;
        }
        super.putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(K k) {
        this.d = null;
        umb G = this.c.G(k != null ? k.hashCode() : 0, k, 0, this);
        if (G == null) {
            G = umb.e.a();
            z65.f(G, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.c = G;
        return this.d;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = size();
        umb H = this.c.H(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (H == null) {
            H = umb.e.a();
            z65.f(H, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.c = H;
        return size != size();
    }
}
