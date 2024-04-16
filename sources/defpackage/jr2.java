package defpackage;

import defpackage.yi3;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: DefaultRepositoryConverter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005B/\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\rR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u0012"}, d2 = {"Ljr2;", "", "T", "Lyi3;", "E", "Lsg9;", "model", "a", "(Ljava/lang/Object;)Lyi3;", "entity", "b", "(Lyi3;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "modelTransform", "entityTransform", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "persistence_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jr2  reason: default package */
/* loaded from: classes2.dex */
public final class jr2<T, E extends yi3> implements sg9<T, E> {
    private final Function1<T, E> a;
    private final Function1<E, T> b;

    /* JADX WARN: Multi-variable type inference failed */
    public jr2(Function1<? super T, ? extends E> function1, Function1<? super E, ? extends T> function12) {
        z65.h(function1, "modelTransform");
        z65.h(function12, "entityTransform");
        this.a = function1;
        this.b = function12;
    }

    @Override // defpackage.sg9
    public E a(T t) {
        z65.h(t, "model");
        return this.a.invoke(t);
    }

    @Override // defpackage.sg9
    public T b(E e) {
        z65.h(e, "entity");
        return this.b.invoke(e);
    }
}
