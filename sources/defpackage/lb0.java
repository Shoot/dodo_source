package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
/* compiled from: Bindings.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001f\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0010\u0004\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001R.\u0010\f\u001a\u001c\u0012\u0004\u0012\u00020\u0001\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00030\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\u000f"}, d2 = {"Llb0;", "", "target", "Lpn5;", "lazy", "", "b", "reference", "a", "Ljava/util/WeakHashMap;", "", "Ljava/util/WeakHashMap;", "bindingsRegistry", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lb0  reason: default package */
/* loaded from: classes.dex */
final class lb0 {
    public static final lb0 a = new lb0();
    private static final WeakHashMap<Object, Collection<pn5<?, ?>>> b = new WeakHashMap<>();

    private lb0() {
    }

    public final void a(Object obj) {
        z65.h(obj, "reference");
        Collection<pn5<?, ?>> collection = b.get(obj);
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                ((pn5) it.next()).c();
            }
        }
    }

    public final void b(Object obj, pn5<?, ?> pn5Var) {
        z65.h(obj, "target");
        z65.h(pn5Var, "lazy");
        WeakHashMap<Object, Collection<pn5<?, ?>>> weakHashMap = b;
        Set set = weakHashMap.get(obj);
        if (set == null) {
            set = Collections.newSetFromMap(new WeakHashMap());
            weakHashMap.put(obj, set);
        }
        set.add(pn5Var);
    }
}
