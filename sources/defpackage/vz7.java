package defpackage;

import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
/* compiled from: PersistentOrderedSetIterator.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\t\u0010\u0006\u001a\u00020\u0005H\u0096\u0002J\u0010\u0010\u0007\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR&\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\r8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lvz7;", "E", "", "", "b", "", "hasNext", StatisticManager.NEXT, "()Ljava/lang/Object;", "", "a", "Ljava/lang/Object;", "nextElement", "", "Luq5;", "Ljava/util/Map;", "getMap$runtime_release", "()Ljava/util/Map;", "map", "", c.a, "I", "getIndex$runtime_release", "()I", "setIndex$runtime_release", "(I)V", "index", "<init>", "(Ljava/lang/Object;Ljava/util/Map;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: vz7  reason: default package */
/* loaded from: classes.dex */
public class vz7<E> implements Iterator<E>, be5 {
    private Object a;
    private final Map<E, uq5> b;
    private int c;

    public vz7(Object obj, Map<E, uq5> map) {
        z65.h(map, "map");
        this.a = obj;
        this.b = map;
    }

    private final void b() {
        if (hasNext()) {
            return;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.c < this.b.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public E next() {
        b();
        E e = (E) this.a;
        this.c++;
        uq5 uq5Var = this.b.get(e);
        if (uq5Var != null) {
            this.a = uq5Var.c();
            return e;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e + ") has changed after it was added to the persistent set.");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
