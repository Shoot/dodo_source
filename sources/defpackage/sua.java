package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: SnapshotStateMap.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0014\b\"\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B5\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u000f¢\u0006\u0004\b(\u0010)J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\b\u001a\u00020\u0004H\u0004R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR)\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR0\u0010$\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R0\u0010'\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001f\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#¨\u0006*"}, d2 = {"Lsua;", "K", "V", "", "", CartQueueItemEntity.OPERATION_REMOVE, "", "hasNext", e.a, "Lupa;", "a", "Lupa;", Image.TYPE_HIGH, "()Lupa;", "map", "", "", "b", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", c.a, "I", "getModification", "()I", "setModification", "(I)V", "modification", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Map$Entry;", "g", "()Ljava/util/Map$Entry;", "setCurrent", "(Ljava/util/Map$Entry;)V", "current", "i", "setNext", StatisticManager.NEXT, "<init>", "(Lupa;Ljava/util/Iterator;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: sua  reason: default package */
/* loaded from: classes.dex */
abstract class sua<K, V> {
    private final upa<K, V> a;
    private final Iterator<Map.Entry<K, V>> b;
    private int c;
    private Map.Entry<? extends K, ? extends V> d;
    private Map.Entry<? extends K, ? extends V> e;

    /* JADX WARN: Multi-variable type inference failed */
    public sua(upa<K, V> upaVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        z65.h(upaVar, "map");
        z65.h(it, "iterator");
        this.a = upaVar;
        this.b = it;
        this.c = upaVar.d();
        e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e() {
        Map.Entry<K, V> entry;
        this.d = this.e;
        if (this.b.hasNext()) {
            entry = this.b.next();
        } else {
            entry = null;
        }
        this.e = entry;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Map.Entry<K, V> g() {
        return (Map.Entry<? extends K, ? extends V>) this.d;
    }

    public final upa<K, V> h() {
        return this.a;
    }

    public final boolean hasNext() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Map.Entry<K, V> i() {
        return (Map.Entry<? extends K, ? extends V>) this.e;
    }

    public final void remove() {
        if (h().d() == this.c) {
            Map.Entry<? extends K, ? extends V> entry = this.d;
            if (entry != null) {
                this.a.remove(entry.getKey());
                this.d = null;
                Unit unit = Unit.a;
                this.c = h().d();
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
