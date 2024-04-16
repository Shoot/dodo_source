package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
/* compiled from: MotionDurationScale.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lto6;", "Lkotlin/coroutines/CoroutineContext$Element;", "O", "b", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: to6  reason: default package */
/* loaded from: classes.dex */
public interface to6 extends CoroutineContext.Element {
    public static final b O = b.a;

    /* compiled from: MotionDurationScale.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: to6$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static <R> R a(to6 to6Var, R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            z65.h(function2, "operation");
            return (R) CoroutineContext.Element.a.a(to6Var, r, function2);
        }

        public static <E extends CoroutineContext.Element> E b(to6 to6Var, CoroutineContext.b<E> bVar) {
            z65.h(bVar, Action.KEY_ATTRIBUTE);
            return (E) CoroutineContext.Element.a.b(to6Var, bVar);
        }

        public static CoroutineContext c(to6 to6Var, CoroutineContext.b<?> bVar) {
            z65.h(bVar, Action.KEY_ATTRIBUTE);
            return CoroutineContext.Element.a.c(to6Var, bVar);
        }

        public static CoroutineContext d(to6 to6Var, CoroutineContext coroutineContext) {
            z65.h(coroutineContext, CoreConstants.CONTEXT_SCOPE_VALUE);
            return CoroutineContext.Element.a.d(to6Var, coroutineContext);
        }
    }

    /* compiled from: MotionDurationScale.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lto6$b;", "Lkotlin/coroutines/CoroutineContext$b;", "Lto6;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: to6$b */
    /* loaded from: classes.dex */
    public static final class b implements CoroutineContext.b<to6> {
        static final /* synthetic */ b a = new b();

        private b() {
        }
    }
}
