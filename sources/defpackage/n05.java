package defpackage;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IndexedValue;
/* compiled from: Iterators.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\u0002R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\u000f"}, d2 = {"Ln05;", "T", "", "Lkotlin/collections/IndexedValue;", "", "hasNext", "b", "a", "Ljava/util/Iterator;", "iterator", "", "I", "index", "<init>", "(Ljava/util/Iterator;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: n05  reason: default package */
/* loaded from: classes3.dex */
public final class n05<T> implements Iterator<IndexedValue<? extends T>>, be5 {
    private final Iterator<T> a;
    private int b;

    /* JADX WARN: Multi-variable type inference failed */
    public n05(Iterator<? extends T> it) {
        z65.h(it, "iterator");
        this.a = it;
    }

    @Override // java.util.Iterator
    /* renamed from: b */
    public final IndexedValue<T> next() {
        int i = this.b;
        this.b = i + 1;
        if (i < 0) {
            kc1.v();
        }
        return new IndexedValue<>(i, this.a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
