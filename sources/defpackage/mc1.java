package defpackage;

import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.util.Enumeration;
import java.util.Iterator;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IteratorsJVM.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¨\u0006\u0004"}, d2 = {"T", "Ljava/util/Enumeration;", "", "z", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xs = "kotlin/collections/CollectionsKt")
/* renamed from: mc1  reason: default package */
/* loaded from: classes3.dex */
public class mc1 extends lc1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: IteratorsJVM.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"mc1$a", "", "", "hasNext", StatisticManager.NEXT, "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: mc1$a */
    /* loaded from: classes3.dex */
    public static final class a<T> implements Iterator<T>, be5 {
        final /* synthetic */ Enumeration<T> a;

        a(Enumeration<T> enumeration) {
            this.a = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.a.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.a.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static <T> Iterator<T> z(Enumeration<T> enumeration) {
        z65.h(enumeration, "<this>");
        return new a(enumeration);
    }
}
