package kotlin.coroutines;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.jvm.functions.Function1;
/* compiled from: CoroutineContextImpl.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u0004B+\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0018\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0014"}, d2 = {"Lkotlin/coroutines/b;", "Lkotlin/coroutines/CoroutineContext$Element;", "B", "E", "Lkotlin/coroutines/CoroutineContext$b;", "element", "b", "(Lkotlin/coroutines/CoroutineContext$Element;)Lkotlin/coroutines/CoroutineContext$Element;", Action.KEY_ATTRIBUTE, "", "a", "(Lkotlin/coroutines/CoroutineContext$b;)Z", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "safeCast", "Lkotlin/coroutines/CoroutineContext$b;", "topmostKey", "baseKey", "<init>", "(Lkotlin/coroutines/CoroutineContext$b;Lkotlin/jvm/functions/Function1;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public abstract class b<B extends CoroutineContext.Element, E extends B> implements CoroutineContext.b<E> {
    private final Function1<CoroutineContext.Element, E> a;
    private final CoroutineContext.b<?> b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1<? super kotlin.coroutines.CoroutineContext$Element, ? extends E extends B>, java.lang.Object, kotlin.jvm.functions.Function1<kotlin.coroutines.CoroutineContext$Element, E extends B>] */
    public b(CoroutineContext.b<B> bVar, Function1<? super CoroutineContext.Element, ? extends E> function1) {
        z65.h(bVar, "baseKey");
        z65.h(function1, "safeCast");
        this.a = function1;
        this.b = bVar instanceof b ? (CoroutineContext.b<B>) ((b) bVar).b : bVar;
    }

    public final boolean a(CoroutineContext.b<?> bVar) {
        z65.h(bVar, Action.KEY_ATTRIBUTE);
        if (bVar != this && this.b != bVar) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/CoroutineContext$Element;)TE; */
    public final CoroutineContext.Element b(CoroutineContext.Element element) {
        z65.h(element, "element");
        return (CoroutineContext.Element) this.a.invoke(element);
    }
}
