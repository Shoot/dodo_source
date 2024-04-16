package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CollectionsJVM.kt */
@Metadata(d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005H\u0001\u001a\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00052\u0006\u0010\t\u001a\u00020\bH\u0001\u001a\"\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0001\u001a\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\rH\u0007\u001a1\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000f\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a3\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00160\u0010\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"T", "element", "", e.a, "(Ljava/lang/Object;)Ljava/util/List;", "E", "", c.a, "", "capacity", DateTokenConverter.CONVERTER_KEY, "builder", "a", "", "f", "collectionSize", "", "array", "g", "(I[Ljava/lang/Object;)[Ljava/lang/Object;", "", "isVarargs", "", "b", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/collections/CollectionsKt")
/* renamed from: jc1  reason: default package */
/* loaded from: classes3.dex */
public class jc1 {
    public static <E> List<E> a(List<E> list) {
        z65.h(list, "builder");
        return ((xq5) list).Q();
    }

    public static final <T> Object[] b(T[] tArr, boolean z) {
        z65.h(tArr, "<this>");
        if (!z || !z65.c(tArr.getClass(), Object[].class)) {
            Object[] copyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
            z65.g(copyOf, "copyOf(...)");
            return copyOf;
        }
        return tArr;
    }

    public static <E> List<E> c() {
        return new xq5();
    }

    public static <E> List<E> d(int i) {
        return new xq5(i);
    }

    public static <T> List<T> e(T t) {
        List<T> singletonList = Collections.singletonList(t);
        z65.g(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static <T> List<T> f(Iterable<? extends T> iterable) {
        z65.h(iterable, "<this>");
        List<T> H0 = sc1.H0(iterable);
        Collections.shuffle(H0);
        return H0;
    }

    public static <T> T[] g(int i, T[] tArr) {
        z65.h(tArr, "array");
        if (i < tArr.length) {
            tArr[i] = null;
        }
        return tArr;
    }
}
