package kotlin.coroutines;

import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
/* compiled from: ContinuationInterceptor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\"\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&J\u0014\u0010\u0007\u001a\u00020\u00062\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¨\u0006\n"}, d2 = {"Lkotlin/coroutines/d;", "Lkotlin/coroutines/CoroutineContext$Element;", "T", "Lcv1;", "continuation", "b0", "", "Q", "J4", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface d extends CoroutineContext.Element {
    public static final b J4 = b.a;

    /* compiled from: ContinuationInterceptor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static <E extends CoroutineContext.Element> E a(d dVar, CoroutineContext.b<E> bVar) {
            z65.h(bVar, Action.KEY_ATTRIBUTE);
            if (bVar instanceof kotlin.coroutines.b) {
                kotlin.coroutines.b bVar2 = (kotlin.coroutines.b) bVar;
                if (!bVar2.a(dVar.getKey())) {
                    return null;
                }
                E e = (E) bVar2.b(dVar);
                if (!(e instanceof CoroutineContext.Element)) {
                    return null;
                }
                return e;
            } else if (d.J4 != bVar) {
                return null;
            } else {
                z65.f(dVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return dVar;
            }
        }

        public static CoroutineContext b(d dVar, CoroutineContext.b<?> bVar) {
            z65.h(bVar, Action.KEY_ATTRIBUTE);
            if (bVar instanceof kotlin.coroutines.b) {
                kotlin.coroutines.b bVar2 = (kotlin.coroutines.b) bVar;
                if (bVar2.a(dVar.getKey()) && bVar2.b(dVar) != null) {
                    return e.a;
                }
                return dVar;
            } else if (d.J4 == bVar) {
                return e.a;
            } else {
                return dVar;
            }
        }
    }

    /* compiled from: ContinuationInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/coroutines/d$b;", "Lkotlin/coroutines/CoroutineContext$b;", "Lkotlin/coroutines/d;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class b implements CoroutineContext.b<d> {
        static final /* synthetic */ b a = new b();

        private b() {
        }
    }

    void Q(cv1<?> cv1Var);

    <T> cv1<T> b0(cv1<? super T> cv1Var);
}
