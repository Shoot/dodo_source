package defpackage;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
/* compiled from: Iterables.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001b\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0004H\u0096\u0002R \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lm05;", "T", "", "Lkotlin/collections/IndexedValue;", "", "iterator", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "iteratorFactory", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: m05  reason: default package */
/* loaded from: classes3.dex */
public final class m05<T> implements Iterable<IndexedValue<? extends T>>, be5 {
    private final Function0<Iterator<T>> a;

    /* JADX WARN: Multi-variable type inference failed */
    public m05(Function0<? extends Iterator<? extends T>> function0) {
        z65.h(function0, "iteratorFactory");
        this.a = function0;
    }

    @Override // java.lang.Iterable
    public Iterator<IndexedValue<T>> iterator() {
        return new n05(this.a.invoke());
    }
}
