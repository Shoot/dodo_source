package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MutableCollectionsJVM.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0004\u001a\u00020\u0003\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a2\u0010\b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\u0010\u0007\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\u0005j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\u0006¨\u0006\t"}, d2 = {"", "T", "", "", "A", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "B", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/collections/CollectionsKt")
/* renamed from: oc1  reason: default package */
/* loaded from: classes3.dex */
public class oc1 extends nc1 {
    public static <T extends Comparable<? super T>> void A(List<T> list) {
        z65.h(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }

    public static <T> void B(List<T> list, Comparator<? super T> comparator) {
        z65.h(list, "<this>");
        z65.h(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
