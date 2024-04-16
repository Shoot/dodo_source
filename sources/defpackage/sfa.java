package defpackage;

import com.huawei.hms.push.e;
import java.util.Set;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sets.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\u001a\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¨\u0006\b"}, d2 = {"T", "", e.a, "", "elements", "g", "([Ljava/lang/Object;)Ljava/util/Set;", "f", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/collections/SetsKt")
/* renamed from: sfa  reason: default package */
/* loaded from: classes3.dex */
public class sfa extends rfa {
    public static <T> Set<T> e() {
        return tg3.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> f(Set<? extends T> set) {
        Set<T> e;
        Set<T> d;
        z65.h(set, "<this>");
        int size = set.size();
        if (size == 0) {
            e = e();
            return e;
        } else if (size == 1) {
            d = rfa.d(set.iterator().next());
            return d;
        } else {
            return set;
        }
    }

    public static <T> Set<T> g(T... tArr) {
        Set<T> e;
        z65.h(tArr, "elements");
        if (tArr.length <= 0) {
            e = e();
            return e;
        }
        return yr.X(tArr);
    }
}
