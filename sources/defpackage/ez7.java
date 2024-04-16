package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
/* compiled from: PersistentHashMapContentIterators.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B;\u0012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 \u0012\u001e\u0010\u0016\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00110\u0010¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u000f\u0010\u000b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u000e\u001a\u00020\rH\u0096\u0002J\u0010\u0010\u000f\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\fR2\u0010\u0016\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00110\u00108\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001c\u001a\u00020\u00058\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u0012\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lez7;", "K", "V", "T", "", "", "pathIndex", Image.TYPE_HIGH, "", e.a, "b", c.a, "()Ljava/lang/Object;", "", "hasNext", StatisticManager.NEXT, "", "Lvmb;", "a", "[Lvmb;", "g", "()[Lvmb;", "path", "I", "getPathLastIndex", "()I", "i", "(I)V", "pathLastIndex", "Z", "getHasNext$annotations", "()V", "Lumb;", "node", "<init>", "(Lumb;[Lvmb;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ez7  reason: default package */
/* loaded from: classes.dex */
public abstract class ez7<K, V, T> implements Iterator<T>, be5 {
    private final vmb<K, V, T>[] a;
    private int b;
    private boolean c;

    public ez7(umb<K, V> umbVar, vmb<K, V, T>[] vmbVarArr) {
        z65.h(umbVar, "node");
        z65.h(vmbVarArr, "path");
        this.a = vmbVarArr;
        this.c = true;
        vmbVarArr[0].l(umbVar.p(), umbVar.m() * 2);
        this.b = 0;
        e();
    }

    private final void b() {
        if (hasNext()) {
            return;
        }
        throw new NoSuchElementException();
    }

    private final void e() {
        if (this.a[this.b].h()) {
            return;
        }
        for (int i = this.b; -1 < i; i--) {
            int h = h(i);
            if (h == -1 && this.a[i].i()) {
                this.a[i].k();
                h = h(i);
            }
            if (h != -1) {
                this.b = h;
                return;
            }
            if (i > 0) {
                this.a[i - 1].k();
            }
            this.a[i].l(umb.e.a().p(), 0);
        }
        this.c = false;
    }

    private final int h(int i) {
        if (this.a[i].h()) {
            return i;
        }
        if (this.a[i].i()) {
            umb<? extends K, ? extends V> c = this.a[i].c();
            if (i == 6) {
                this.a[i + 1].l(c.p(), c.p().length);
            } else {
                this.a[i + 1].l(c.p(), c.m() * 2);
            }
            return h(i + 1);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final K c() {
        b();
        return this.a[this.b].b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final vmb<K, V, T>[] g() {
        return this.a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(int i) {
        this.b = i;
    }

    @Override // java.util.Iterator
    public T next() {
        b();
        T next = this.a[this.b].next();
        e();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
