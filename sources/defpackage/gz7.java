package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
/* compiled from: PersistentHashMapBuilderContentIterators.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u00042\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B;\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0017\u0012\u001e\u0010'\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020&0%¢\u0006\u0004\b(\u0010)J7\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0002J\u0010\u0010\u0011\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\fH\u0016J\u001d\u0010\u0015\u001a\u00020\f2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006*"}, d2 = {"Lgz7;", "K", "V", "T", "", "Lez7;", "", "keyHash", "Lumb;", "node", Action.KEY_ATTRIBUTE, "pathIndex", "", "l", "(ILumb;Ljava/lang/Object;I)V", "k", "j", StatisticManager.NEXT, "()Ljava/lang/Object;", CartQueueItemEntity.OPERATION_REMOVE, "newValue", Image.TYPE_MEDIUM, "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lfz7;", DateTokenConverter.CONVERTER_KEY, "Lfz7;", "builder", e.a, "Ljava/lang/Object;", "lastIteratedKey", "", "f", "Z", "nextWasInvoked", "g", "I", "expectedModCount", "", "Lvmb;", "path", "<init>", "(Lfz7;[Lvmb;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: gz7  reason: default package */
/* loaded from: classes.dex */
public class gz7<K, V, T> extends ez7<K, V, T> implements Iterator<T>, be5 {
    private final fz7<K, V> d;
    private K e;
    private boolean f;
    private int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz7(fz7<K, V> fz7Var, vmb<K, V, T>[] vmbVarArr) {
        super(fz7Var.i(), vmbVarArr);
        z65.h(fz7Var, "builder");
        z65.h(vmbVarArr, "path");
        this.d = fz7Var;
        this.g = fz7Var.h();
    }

    private final void j() {
        if (this.d.h() == this.g) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    private final void k() {
        if (this.f) {
            return;
        }
        throw new IllegalStateException();
    }

    private final void l(int i, umb<?, ?> umbVar, K k, int i2) {
        int i3 = i2 * 5;
        if (i3 > 30) {
            g()[i2].m(umbVar.p(), umbVar.p().length, 0);
            while (!z65.c(g()[i2].b(), k)) {
                g()[i2].j();
            }
            i(i2);
            return;
        }
        int f = 1 << ymb.f(i, i3);
        if (umbVar.q(f)) {
            g()[i2].m(umbVar.p(), umbVar.m() * 2, umbVar.n(f));
            i(i2);
            return;
        }
        int O = umbVar.O(f);
        umb<?, ?> N = umbVar.N(O);
        g()[i2].m(umbVar.p(), umbVar.m() * 2, O);
        l(i, N, k, i2 + 1);
    }

    public final void m(K k, V v) {
        int i;
        if (!this.d.containsKey(k)) {
            return;
        }
        if (hasNext()) {
            K c = c();
            this.d.put(k, v);
            if (c != null) {
                i = c.hashCode();
            } else {
                i = 0;
            }
            l(i, this.d.i(), c, 0);
        } else {
            this.d.put(k, v);
        }
        this.g = this.d.h();
    }

    @Override // defpackage.ez7, java.util.Iterator
    public T next() {
        j();
        this.e = c();
        this.f = true;
        return (T) super.next();
    }

    @Override // defpackage.ez7, java.util.Iterator
    public void remove() {
        int i;
        k();
        if (hasNext()) {
            K c = c();
            fz7<K, V> fz7Var = this.d;
            unb.d(fz7Var).remove(this.e);
            if (c != null) {
                i = c.hashCode();
            } else {
                i = 0;
            }
            l(i, this.d.i(), c, 0);
        } else {
            fz7<K, V> fz7Var2 = this.d;
            unb.d(fz7Var2).remove(this.e);
        }
        this.e = null;
        this.f = false;
        this.g = this.d.h();
    }
}
