package defpackage;

import ch.qos.logback.core.joran.action.Action;
import defpackage.fe5;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: SnapshotStateMap.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B5\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0096\u0002¨\u0006\u000e"}, d2 = {"Lrua;", "K", "V", "Lsua;", "", "", "j", "Lupa;", "map", "", "", "iterator", "<init>", "(Lupa;Ljava/util/Iterator;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: rua  reason: default package */
/* loaded from: classes.dex */
final class rua<K, V> extends sua<K, V> implements Iterator<Map.Entry<K, V>>, be5 {

    /* compiled from: SnapshotStateMap.kt */
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0010'\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0017\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00028\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b\"\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"rua$a", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", Action.KEY_ATTRIBUTE, "b", "getValue", "(Ljava/lang/Object;)V", "value", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: rua$a */
    /* loaded from: classes.dex */
    public static final class a implements Map.Entry<K, V>, fe5.a {
        private final K a;
        private V b;
        final /* synthetic */ rua<K, V> c;

        a(rua<K, V> ruaVar) {
            this.c = ruaVar;
            Map.Entry<K, V> g = ruaVar.g();
            z65.e(g);
            this.a = g.getKey();
            Map.Entry<K, V> g2 = ruaVar.g();
            z65.e(g2);
            this.b = g2.getValue();
        }

        public void b(V v) {
            this.b = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            rua<K, V> ruaVar = this.c;
            if (ruaVar.h().d() == ((sua) ruaVar).c) {
                V v2 = (V) getValue();
                ruaVar.h().put((K) getKey(), v);
                b(v);
                return v2;
            }
            throw new ConcurrentModificationException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rua(upa<K, V> upaVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(upaVar, it);
        z65.h(upaVar, "map");
        z65.h(it, "iterator");
    }

    @Override // java.util.Iterator
    /* renamed from: j */
    public Map.Entry<K, V> next() {
        e();
        if (g() != null) {
            return new a(this);
        }
        throw new IllegalStateException();
    }
}
