package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: PersistentHashMapBuilderContentIterators.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lzmb;", "K", "V", "Lvmb;", "", "o", "Liz7;", DateTokenConverter.CONVERTER_KEY, "Liz7;", "parentIterator", "<init>", "(Liz7;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zmb  reason: default package */
/* loaded from: classes.dex */
public final class zmb<K, V> extends vmb<K, V, Map.Entry<K, V>> {
    private final iz7<K, V> d;

    public zmb(iz7<K, V> iz7Var) {
        z65.h(iz7Var, "parentIterator");
        this.d = iz7Var;
    }

    @Override // java.util.Iterator
    /* renamed from: o */
    public Map.Entry<K, V> next() {
        uj1.a(h());
        n(g() + 2);
        return new rq6(this.d, e()[g() - 2], e()[g() - 1]);
    }
}
