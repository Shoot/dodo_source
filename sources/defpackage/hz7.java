package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: PersistentHashMapBuilderContentViews.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u001b\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\nH\u0096\u0002J\u001c\u0010\r\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016J\u001c\u0010\u000e\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lhz7;", "K", "V", "Lp1;", "", "element", "", "G", "", "clear", "", "iterator", "", "E", "u", "Lfz7;", "a", "Lfz7;", "builder", "", DateTokenConverter.CONVERTER_KEY, "()I", "size", "<init>", "(Lfz7;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: hz7  reason: default package */
/* loaded from: classes.dex */
public final class hz7<K, V> extends p1<Map.Entry<K, V>, K, V> {
    private final fz7<K, V> a;

    public hz7(fz7<K, V> fz7Var) {
        z65.h(fz7Var, "builder");
        this.a = fz7Var;
    }

    @Override // defpackage.p1
    public boolean E(Map.Entry<? extends K, ? extends V> entry) {
        z65.h(entry, "element");
        return this.a.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: G */
    public boolean add(Map.Entry<K, V> entry) {
        z65.h(entry, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.a.clear();
    }

    @Override // defpackage.y1
    public int d() {
        return this.a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new iz7(this.a);
    }

    @Override // defpackage.p1
    public boolean u(Map.Entry<? extends K, ? extends V> entry) {
        z65.h(entry, "element");
        V v = this.a.get(entry.getKey());
        if (v != null) {
            return z65.c(v, entry.getValue());
        }
        if (entry.getValue() == null && this.a.containsKey(entry.getKey())) {
            return true;
        }
        return false;
    }
}
