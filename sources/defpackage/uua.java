package defpackage;

import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnapshotStateMap.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B5\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Luua;", "K", "V", "Lsua;", "", StatisticManager.NEXT, "()Ljava/lang/Object;", "Lupa;", "map", "", "", "iterator", "<init>", "(Lupa;Ljava/util/Iterator;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: uua  reason: default package */
/* loaded from: classes.dex */
public final class uua<K, V> extends sua<K, V> implements Iterator<V>, be5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uua(upa<K, V> upaVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(upaVar, it);
        z65.h(upaVar, "map");
        z65.h(it, "iterator");
    }

    @Override // java.util.Iterator
    public V next() {
        Map.Entry<K, V> i = i();
        if (i != null) {
            e();
            return i.getValue();
        }
        throw new IllegalStateException();
    }
}
