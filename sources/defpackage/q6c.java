package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: WithSuggestedField.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002\u001a(\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0007\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0001\u001aB\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\t*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00010\n\u001a4\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u000e0\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0001H\u0002¨\u0006\u0010"}, d2 = {"T", "", "Lkotlin/Function1;", "", "isTop", "Lp6c;", DateTokenConverter.CONVERTER_KEY, "", "b", "R", "Lkotlin/Function2;", "action", "a", "collection", "Lkotlin/Pair;", c.a, "android_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: q6c  reason: default package */
/* loaded from: classes.dex */
public final class q6c {

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: q6c$a */
    /* loaded from: classes.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Boolean.valueOf(((p6c) t2).b()), Boolean.valueOf(((p6c) t).b()));
            return d;
        }
    }

    public static final <T, R> Collection<R> a(Collection<p6c<T>> collection, Function2<? super T, ? super Boolean, ? extends R> function2) {
        int w;
        z65.h(collection, "<this>");
        z65.h(function2, "action");
        Collection<Pair> c = c(collection);
        w = lc1.w(c, 10);
        ArrayList arrayList = new ArrayList(w);
        for (Pair pair : c) {
            arrayList.add(function2.invoke((Object) pair.c(), pair.d()));
        }
        return arrayList;
    }

    public static final <T> List<p6c<T>> b(Collection<p6c<T>> collection) {
        List<p6c<T>> y0;
        z65.h(collection, "<this>");
        y0 = sc1.y0(collection, new a());
        return y0;
    }

    private static final <T> Collection<Pair<T, Boolean>> c(Collection<p6c<T>> collection) {
        Object j0;
        List r0;
        List arrayList;
        boolean z;
        int w;
        if (collection.size() >= 2) {
            j0 = sc1.j0(collection);
            r0 = sc1.r0(collection, j0);
            Iterator<T> it = r0.iterator();
            if (!it.hasNext()) {
                arrayList = kc1.l();
            } else {
                arrayList = new ArrayList();
                T next = it.next();
                while (it.hasNext()) {
                    T next2 = it.next();
                    p6c p6cVar = (p6c) next2;
                    p6c p6cVar2 = (p6c) next;
                    if (p6cVar2.b() && !p6cVar.b()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(lnb.a(p6cVar2.a(), Boolean.valueOf(z)));
                    next = next2;
                }
            }
        } else {
            Collection<p6c<T>> collection2 = collection;
            w = lc1.w(collection2, 10);
            arrayList = new ArrayList(w);
            Iterator<T> it2 = collection2.iterator();
            while (it2.hasNext()) {
                arrayList.add(lnb.a(((p6c) it2.next()).a(), Boolean.FALSE));
            }
        }
        return arrayList;
    }

    public static final <T> Collection<p6c<T>> d(Collection<? extends T> collection, Function1<? super T, Boolean> function1) {
        int w;
        z65.h(collection, "<this>");
        z65.h(function1, "isTop");
        Collection<? extends T> collection2 = collection;
        w = lc1.w(collection2, 10);
        ArrayList arrayList = new ArrayList(w);
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            arrayList.add(new p6c(obj, function1.invoke(obj).booleanValue()));
        }
        return arrayList;
    }
}
