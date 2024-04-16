package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import com.huawei.hms.opendevice.c;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: PersistentHashMapBuilderContentIterators.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\rR2\u0010\u0011\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Liz7;", "K", "V", "", "", "", "hasNext", "b", "", CartQueueItemEntity.OPERATION_REMOVE, Action.KEY_ATTRIBUTE, "newValue", c.a, "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lgz7;", "a", "Lgz7;", "base", "Lfz7;", "builder", "<init>", "(Lfz7;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: iz7  reason: default package */
/* loaded from: classes.dex */
public final class iz7<K, V> implements Iterator<Map.Entry<K, V>>, be5 {
    private final gz7<K, V, Map.Entry<K, V>> a;

    public iz7(fz7<K, V> fz7Var) {
        z65.h(fz7Var, "builder");
        vmb[] vmbVarArr = new vmb[8];
        for (int i = 0; i < 8; i++) {
            vmbVarArr[i] = new zmb(this);
        }
        this.a = new gz7<>(fz7Var, vmbVarArr);
    }

    @Override // java.util.Iterator
    /* renamed from: b */
    public Map.Entry<K, V> next() {
        return this.a.next();
    }

    public final void c(K k, V v) {
        this.a.m(k, v);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.a.remove();
    }
}
