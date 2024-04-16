package defpackage;

import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Sequences.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B-\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096\u0002R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lid4;", "", "T", "Lkotlin/sequences/Sequence;", "", "iterator", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "getInitialValue", "Lkotlin/Function1;", "b", "Lkotlin/jvm/functions/Function1;", "getNextValue", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: id4  reason: default package */
/* loaded from: classes3.dex */
public final class id4<T> implements Sequence<T> {
    private final Function0<T> a;
    private final Function1<T, T> b;

    /* compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0006H\u0096\u0002R$\u0010\r\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0005\"\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"id4$a", "", "", "b", StatisticManager.NEXT, "()Ljava/lang/Object;", "", "hasNext", "a", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: id4$a */
    /* loaded from: classes3.dex */
    public static final class a implements Iterator<T>, be5 {
        private T a;
        private int b = -2;
        final /* synthetic */ id4<T> c;

        a(id4<T> id4Var) {
            this.c = id4Var;
        }

        private final void b() {
            T t;
            int i;
            if (this.b != -2) {
                Function1 function1 = ((id4) this.c).b;
                T t2 = this.a;
                z65.e(t2);
                t = (T) function1.invoke(t2);
            } else {
                t = (T) ((id4) this.c).a.invoke();
            }
            this.a = t;
            if (t == null) {
                i = 0;
            } else {
                i = 1;
            }
            this.b = i;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.b < 0) {
                b();
            }
            if (this.b == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.b < 0) {
                b();
            }
            if (this.b != 0) {
                T t = this.a;
                z65.f(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.b = -1;
                return t;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public id4(Function0<? extends T> function0, Function1<? super T, ? extends T> function1) {
        z65.h(function0, "getInitialValue");
        z65.h(function1, "getNextValue");
        this.a = function0;
        this.b = function1;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        return new a(this);
    }
}
