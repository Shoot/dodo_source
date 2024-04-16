package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: PersistentHashMapContentViews.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0005B\u001b\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\u001b\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\tH\u0096\u0002R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lnz7;", "K", "V", "Lax4;", "", "Lf2;", "element", "", "k", "", "iterator", "Ldz7;", "b", "Ldz7;", "map", "", DateTokenConverter.CONVERTER_KEY, "()I", "size", "<init>", "(Ldz7;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: nz7  reason: default package */
/* loaded from: classes.dex */
public final class nz7<K, V> extends f2<Map.Entry<? extends K, ? extends V>> implements ax4<Map.Entry<? extends K, ? extends V>> {
    private final dz7<K, V> b;

    public nz7(dz7<K, V> dz7Var) {
        z65.h(dz7Var, "map");
        this.b = dz7Var;
    }

    @Override // defpackage.c1, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return k((Map.Entry) obj);
    }

    @Override // defpackage.c1
    public int d() {
        return this.b.size();
    }

    @Override // defpackage.f2, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new oz7(this.b.q());
    }

    public boolean k(Map.Entry<? extends K, ? extends V> entry) {
        z65.h(entry, "element");
        V v = this.b.get(entry.getKey());
        if (v != null) {
            return z65.c(v, entry.getValue());
        }
        if (entry.getValue() == null && this.b.containsKey(entry.getKey())) {
            return true;
        }
        return false;
    }
}
