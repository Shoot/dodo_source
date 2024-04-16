package defpackage;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.Metadata;
/* compiled from: PersistentHashMapBuilderContentViews.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b \u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H&J\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u001c\u0010\u0002\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H&¨\u0006\u000e"}, d2 = {"Lp1;", "", "E", "K", "V", "Ly1;", "element", "", "k", "(Ljava/util/Map$Entry;)Z", "u", "x", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: p1  reason: default package */
/* loaded from: classes.dex */
public abstract class p1<E extends Map.Entry<? extends K, ? extends V>, K, V> extends y1<E> {
    public abstract boolean E(Map.Entry<? extends K, ? extends V> entry);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return k((Map.Entry) obj);
    }

    public final boolean k(E e) {
        E e2;
        z65.h(e, "element");
        if (e instanceof Object) {
            e2 = e;
        } else {
            e2 = null;
        }
        if (!(e2 instanceof Map.Entry)) {
            return false;
        }
        return u(e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return x((Map.Entry) obj);
    }

    public abstract boolean u(Map.Entry<? extends K, ? extends V> entry);

    public final boolean x(E e) {
        E e2;
        z65.h(e, "element");
        if (e instanceof Object) {
            e2 = e;
        } else {
            e2 = null;
        }
        if (!(e2 instanceof Map.Entry)) {
            return false;
        }
        return E(e);
    }
}
