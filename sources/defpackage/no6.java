package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: MonotonicFrameClock.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u0000 \b2\u00020\u0001:\u0001\tJ-\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lno6;", "Lkotlin/coroutines/CoroutineContext$Element;", "R", "Lkotlin/Function1;", "", "onFrame", "S", "(Lkotlin/jvm/functions/Function1;Lcv1;)Ljava/lang/Object;", "N", "b", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: no6  reason: default package */
/* loaded from: classes.dex */
public interface no6 extends CoroutineContext.Element {
    public static final b N = b.a;

    /* compiled from: MonotonicFrameClock.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: no6$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static <R> R a(no6 no6Var, R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            z65.h(function2, "operation");
            return (R) CoroutineContext.Element.a.a(no6Var, r, function2);
        }

        public static <E extends CoroutineContext.Element> E b(no6 no6Var, CoroutineContext.b<E> bVar) {
            z65.h(bVar, Action.KEY_ATTRIBUTE);
            return (E) CoroutineContext.Element.a.b(no6Var, bVar);
        }

        public static CoroutineContext c(no6 no6Var, CoroutineContext.b<?> bVar) {
            z65.h(bVar, Action.KEY_ATTRIBUTE);
            return CoroutineContext.Element.a.c(no6Var, bVar);
        }

        public static CoroutineContext d(no6 no6Var, CoroutineContext coroutineContext) {
            z65.h(coroutineContext, CoreConstants.CONTEXT_SCOPE_VALUE);
            return CoroutineContext.Element.a.d(no6Var, coroutineContext);
        }
    }

    /* compiled from: MonotonicFrameClock.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lno6$b;", "Lkotlin/coroutines/CoroutineContext$b;", "Lno6;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: no6$b */
    /* loaded from: classes.dex */
    public static final class b implements CoroutineContext.b<no6> {
        static final /* synthetic */ b a = new b();

        private b() {
        }
    }

    <R> Object S(Function1<? super Long, ? extends R> function1, cv1<? super R> cv1Var);
}
