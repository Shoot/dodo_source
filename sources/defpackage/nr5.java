package defpackage;

import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
/* compiled from: lists.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010(\n\u0002\b\u0002\u001a9\u0010\u0005\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007¨\u0006\n"}, d2 = {"T", "V", "", "Lkotlin/Function1;", "transform", "b", "(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "", "a", "infrastructure-base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: nr5  reason: default package */
/* loaded from: classes4.dex */
public final class nr5 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: lists.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"nr5$a", "", "", "hasNext", StatisticManager.NEXT, "()Ljava/lang/Object;", "", "a", "I", "getI", "()I", "setI", "(I)V", "i", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: nr5$a */
    /* loaded from: classes4.dex */
    public static final class a<T> implements Iterator<T>, be5 {
        private int a;
        final /* synthetic */ List<T> b;

        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends T> list) {
            this.b = list;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b.size() > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                int i = this.a;
                this.a = i + 1;
                int size = i % this.b.size();
                if (size < this.b.size()) {
                    return this.b.get(size);
                }
                throw new NoSuchElementException();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> Iterator<T> a(List<? extends T> list) {
        z65.h(list, "<this>");
        return new a(list);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [V, java.lang.Object] */
    public static final <T, V> V b(Collection<? extends T> collection, Function1<? super T, ? extends V> function1) {
        Sequence P;
        Sequence q;
        z65.h(collection, "<this>");
        z65.h(function1, "transform");
        P = sc1.P(collection);
        q = dca.q(P, function1);
        for (T t : q) {
            if (t != 0) {
                return t;
            }
        }
        return null;
    }
}
