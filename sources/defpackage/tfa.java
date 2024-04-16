package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Sets.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0003\u001a.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a.\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086\u0002¨\u0006\t"}, d2 = {"T", "", "element", Image.TYPE_HIGH, "(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;", "j", "", "elements", "i", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/collections/SetsKt")
/* renamed from: tfa  reason: default package */
/* loaded from: classes3.dex */
public class tfa extends sfa {
    public static <T> Set<T> h(Set<? extends T> set, T t) {
        int e;
        z65.h(set, "<this>");
        e = f86.e(set.size());
        LinkedHashSet linkedHashSet = new LinkedHashSet(e);
        boolean z = false;
        for (T t2 : set) {
            boolean z2 = true;
            if (!z && z65.c(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(t2);
            }
        }
        return linkedHashSet;
    }

    public static <T> Set<T> i(Set<? extends T> set, Iterable<? extends T> iterable) {
        int size;
        int e;
        z65.h(set, "<this>");
        z65.h(iterable, "elements");
        Integer x = lc1.x(iterable);
        if (x != null) {
            size = set.size() + x.intValue();
        } else {
            size = set.size() * 2;
        }
        e = f86.e(size);
        LinkedHashSet linkedHashSet = new LinkedHashSet(e);
        linkedHashSet.addAll(set);
        pc1.C(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static <T> Set<T> j(Set<? extends T> set, T t) {
        int e;
        z65.h(set, "<this>");
        e = f86.e(set.size() + 1);
        LinkedHashSet linkedHashSet = new LinkedHashSet(e);
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }
}
