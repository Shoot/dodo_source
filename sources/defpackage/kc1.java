package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.IntRange;
/* compiled from: Collections.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u000b\u0010\t\u001a7\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00028\u00000\fj\b\u0012\u0004\u0012\u00028\u0000`\r\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\u00102\u0016\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001\"\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0014\u0010\t\u001a\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000\u001aG\u0010\u001a\u001a\u00020\u0017\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00052\b\u0010\u0011\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001b\u001a'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\b\u0010 \u001a\u00020\u001dH\u0001\u001a\b\u0010!\u001a\u00020\u001dH\u0001\"\u0019\u0010%\u001a\u00020\"*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b#\u0010$\"!\u0010(\u001a\u00020\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"T", "", "", "i", "([Ljava/lang/Object;)Ljava/util/Collection;", "", "l", "elements", "o", "([Ljava/lang/Object;)Ljava/util/List;", "", "r", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", Image.TYPE_HIGH, "([Ljava/lang/Object;)Ljava/util/ArrayList;", "", "element", "p", "(Ljava/lang/Object;)Ljava/util/List;", "q", Image.TYPE_SMALL, "", "", "fromIndex", "toIndex", "j", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "size", "", "t", "(III)V", "v", "u", "Lkotlin/ranges/IntRange;", Image.TYPE_MEDIUM, "(Ljava/util/Collection;)Lkotlin/ranges/IntRange;", "indices", "n", "(Ljava/util/List;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/collections/CollectionsKt")
/* renamed from: kc1 */
/* loaded from: classes3.dex */
public class kc1 extends jc1 {
    public static <T> ArrayList<T> h(T... tArr) {
        z65.h(tArr, "elements");
        if (tArr.length == 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(new dr(tArr, true));
    }

    public static final <T> Collection<T> i(T[] tArr) {
        z65.h(tArr, "<this>");
        return new dr(tArr, false);
    }

    public static final <T extends Comparable<? super T>> int j(List<? extends T> list, T t, int i, int i2) {
        int d;
        z65.h(list, "<this>");
        t(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            d = mk1.d(list.get(i4), t);
            if (d < 0) {
                i = i4 + 1;
            } else if (d > 0) {
                i3 = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int k(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return j(list, comparable, i, i2);
    }

    public static <T> List<T> l() {
        return mg3.a;
    }

    public static IntRange m(Collection<?> collection) {
        z65.h(collection, "<this>");
        return new IntRange(0, collection.size() - 1);
    }

    public static <T> int n(List<? extends T> list) {
        z65.h(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> o(T... tArr) {
        List<T> l;
        List<T> c;
        z65.h(tArr, "elements");
        if (tArr.length > 0) {
            c = xr.c(tArr);
            return c;
        }
        l = l();
        return l;
    }

    public static <T> List<T> p(T t) {
        List<T> l;
        List<T> e;
        if (t != null) {
            e = jc1.e(t);
            return e;
        }
        l = l();
        return l;
    }

    public static <T> List<T> q(T... tArr) {
        List<T> B;
        z65.h(tArr, "elements");
        B = yr.B(tArr);
        return B;
    }

    public static <T> List<T> r(T... tArr) {
        z65.h(tArr, "elements");
        if (tArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new dr(tArr, true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> s(List<? extends T> list) {
        List<T> l;
        List<T> e;
        z65.h(list, "<this>");
        int size = list.size();
        if (size == 0) {
            l = l();
            return l;
        } else if (size == 1) {
            e = jc1.e(list.get(0));
            return e;
        } else {
            return list;
        }
    }

    private static final void t(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 >= 0) {
                if (i3 <= i) {
                    return;
                }
                throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
            }
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        }
        throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
    }

    public static void u() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void v() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
