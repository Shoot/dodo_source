package defpackage;

import java.util.Map;
import kotlin.Metadata;
/* compiled from: PersistentHashMapContentIterators.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¨\u0006\b"}, d2 = {"Lwmb;", "K", "V", "Lvmb;", "", "o", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: wmb  reason: default package */
/* loaded from: classes.dex */
public final class wmb<K, V> extends vmb<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    /* renamed from: o */
    public Map.Entry<K, V> next() {
        uj1.a(h());
        n(g() + 2);
        return new o66(e()[g() - 2], e()[g() - 1]);
    }
}
