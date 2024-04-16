package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.Sequence;
/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0096\u0002R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Ld93;", "T", "Lkotlin/sequences/Sequence;", "Lh93;", "", "n", "a", "", "iterator", "Lkotlin/sequences/Sequence;", "sequence", "b", "I", "count", "<init>", "(Lkotlin/sequences/Sequence;I)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: d93  reason: default package */
/* loaded from: classes3.dex */
public final class d93<T> implements Sequence<T>, h93<T> {
    private final Sequence<T> a;
    private final int b;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0002R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"d93$a", "", "", "b", StatisticManager.NEXT, "()Ljava/lang/Object;", "", "hasNext", "a", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "I", "getLeft", "()I", "setLeft", "(I)V", ElementGenerator.TEXT_ALIGN_LEFT, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: d93$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<T>, be5 {
        private final Iterator<T> a;
        private int b;

        a(d93<T> d93Var) {
            this.a = ((d93) d93Var).a.iterator();
            this.b = ((d93) d93Var).b;
        }

        private final void b() {
            while (this.b > 0 && this.a.hasNext()) {
                this.a.next();
                this.b--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            b();
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            b();
            return this.a.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d93(Sequence<? extends T> sequence, int i) {
        z65.h(sequence, "sequence");
        this.a = sequence;
        this.b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + CoreConstants.DOT).toString());
    }

    @Override // defpackage.h93
    public Sequence<T> a(int i) {
        int i2 = this.b + i;
        if (i2 < 0) {
            return new d93(this, i);
        }
        return new d93(this.a, i2);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        return new a(this);
    }
}
