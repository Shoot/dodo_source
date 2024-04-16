package defpackage;

import com.dodopizza.kustoworker.KustoStorage;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096\u0002R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lz43;", "T", "K", "Lkotlin/sequences/Sequence;", "", "iterator", "a", "Lkotlin/sequences/Sequence;", KustoStorage.KustoTable.COLUMN_SOURCE, "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "keySelector", "<init>", "(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: z43  reason: default package */
/* loaded from: classes3.dex */
public final class z43<T, K> implements Sequence<T> {
    private final Sequence<T> a;
    private final Function1<T, K> b;

    /* JADX WARN: Multi-variable type inference failed */
    public z43(Sequence<? extends T> sequence, Function1<? super T, ? extends K> function1) {
        z65.h(sequence, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(function1, "keySelector");
        this.a = sequence;
        this.b = function1;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        return new y43(this.a.iterator(), this.b);
    }
}
