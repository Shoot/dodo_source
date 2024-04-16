package defpackage;

import com.inappstory.sdk.stories.statistic.StatisticManager;
import kotlin.Metadata;
/* compiled from: PersistentHashMapContentIterators.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lxmb;", "K", "V", "Lvmb;", StatisticManager.NEXT, "()Ljava/lang/Object;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: xmb  reason: default package */
/* loaded from: classes.dex */
public final class xmb<K, V> extends vmb<K, V, K> {
    @Override // java.util.Iterator
    public K next() {
        uj1.a(h());
        n(g() + 2);
        return (K) e()[g() - 2];
    }
}
