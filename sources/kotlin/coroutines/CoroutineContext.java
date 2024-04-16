package kotlin.coroutines;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
/* compiled from: CoroutineContext.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u00002\u00020\u0001:\u0002\u0011\u0012J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002J\u0014\u0010\u0010\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¨\u0006\u0013"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "Lkotlin/coroutines/CoroutineContext$Element;", "E", "Lkotlin/coroutines/CoroutineContext$b;", Action.KEY_ATTRIBUTE, com.huawei.hms.opendevice.c.a, "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$Element;", "R", "initial", "Lkotlin/Function2;", "operation", "m0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", CoreConstants.CONTEXT_SCOPE_VALUE, "P", "T", "Element", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface CoroutineContext {

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "E", "Lkotlin/coroutines/CoroutineContext$b;", Action.KEY_ATTRIBUTE, com.huawei.hms.opendevice.c.a, "(Lkotlin/coroutines/CoroutineContext$b;)Lkotlin/coroutines/CoroutineContext$Element;", "getKey", "()Lkotlin/coroutines/CoroutineContext$b;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public interface Element extends CoroutineContext {

        /* compiled from: CoroutineContext.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a {
            public static <R> R a(Element element, R r, Function2<? super R, ? super Element, ? extends R> function2) {
                z65.h(function2, "operation");
                return function2.invoke(r, element);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends Element> E b(Element element, b<E> bVar) {
                z65.h(bVar, Action.KEY_ATTRIBUTE);
                if (z65.c(element.getKey(), bVar)) {
                    z65.f(element, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return element;
                }
                return null;
            }

            public static CoroutineContext c(Element element, b<?> bVar) {
                z65.h(bVar, Action.KEY_ATTRIBUTE);
                if (z65.c(element.getKey(), bVar)) {
                    return e.a;
                }
                return element;
            }

            public static CoroutineContext d(Element element, CoroutineContext coroutineContext) {
                z65.h(coroutineContext, CoreConstants.CONTEXT_SCOPE_VALUE);
                return a.a(element, coroutineContext);
            }
        }

        @Override // kotlin.coroutines.CoroutineContext
        <E extends Element> E c(b<E> bVar);

        b<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoroutineContext.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "acc", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)Lkotlin/coroutines/CoroutineContext;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: kotlin.coroutines.CoroutineContext$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0411a extends ej5 implements Function2<CoroutineContext, Element, CoroutineContext> {
            public static final C0411a a = new C0411a();

            C0411a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final CoroutineContext invoke(CoroutineContext coroutineContext, Element element) {
                c cVar;
                z65.h(coroutineContext, "acc");
                z65.h(element, "element");
                CoroutineContext T = coroutineContext.T(element.getKey());
                e eVar = e.a;
                if (T != eVar) {
                    d.b bVar = d.J4;
                    d dVar = (d) T.c(bVar);
                    if (dVar == null) {
                        cVar = new c(T, element);
                    } else {
                        CoroutineContext T2 = T.T(bVar);
                        if (T2 == eVar) {
                            return new c(element, dVar);
                        }
                        cVar = new c(new c(T2, element), dVar);
                    }
                    return cVar;
                }
                return element;
            }
        }

        public static CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
            z65.h(coroutineContext2, CoreConstants.CONTEXT_SCOPE_VALUE);
            if (coroutineContext2 != e.a) {
                return (CoroutineContext) coroutineContext2.m0(coroutineContext, C0411a.a);
            }
            return coroutineContext;
        }
    }

    /* compiled from: CoroutineContext.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext$b;", "Lkotlin/coroutines/CoroutineContext$Element;", "E", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public interface b<E extends Element> {
    }

    CoroutineContext P(CoroutineContext coroutineContext);

    CoroutineContext T(b<?> bVar);

    <E extends Element> E c(b<E> bVar);

    <R> R m0(R r, Function2<? super R, ? super Element, ? extends R> function2);
}
