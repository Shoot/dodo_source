package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
/* compiled from: CoroutineScope.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0000\u001aJ\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\u0011\u001a\u00020\u0010*\u00020\u00002\u0010\b\u0002\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u001a\n\u0010\u0012\u001a\u00020\u0010*\u00020\u0000\"\u001b\u0010\u0018\u001a\u00020\u0013*\u00020\u00008F¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lqx1;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, Image.TYPE_HIGH, "b", "R", "Lkotlin/Function2;", "Lcv1;", "", "block", e.a, "(Lkotlin/jvm/functions/Function2;Lcv1;)Ljava/lang/Object;", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "", c.a, "f", "", "g", "(Lqx1;)Z", "isActive$annotations", "(Lqx1;)V", "isActive", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* renamed from: rx1 */
/* loaded from: classes3.dex */
public final class rx1 {
    public static final qx1 a(CoroutineContext coroutineContext) {
        bl1 b;
        if (coroutineContext.c(l95.M) == null) {
            b = s95.b(null, 1, null);
            coroutineContext = coroutineContext.P(b);
        }
        return new xu1(coroutineContext);
    }

    public static final qx1 b() {
        return new xu1(k2b.b(null, 1, null).P(v33.c()));
    }

    public static final void c(qx1 qx1Var, CancellationException cancellationException) {
        l95 l95Var = (l95) qx1Var.getCoroutineContext().c(l95.M);
        if (l95Var != null) {
            l95Var.a(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + qx1Var).toString());
    }

    public static /* synthetic */ void d(qx1 qx1Var, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        c(qx1Var, cancellationException);
    }

    public static final <R> Object e(Function2<? super qx1, ? super cv1<? super R>, ? extends Object> function2, cv1<? super R> cv1Var) {
        Object d;
        tw9 tw9Var = new tw9(cv1Var.getContext(), cv1Var);
        Object d2 = kqb.d(tw9Var, tw9Var, function2);
        d = c75.d();
        if (d2 == d) {
            io2.c(cv1Var);
        }
        return d2;
    }

    public static final void f(qx1 qx1Var) {
        q95.k(qx1Var.getCoroutineContext());
    }

    public static final boolean g(qx1 qx1Var) {
        l95 l95Var = (l95) qx1Var.getCoroutineContext().c(l95.M);
        if (l95Var != null) {
            return l95Var.b();
        }
        return true;
    }

    public static final qx1 h(qx1 qx1Var, CoroutineContext coroutineContext) {
        return new xu1(qx1Var.getCoroutineContext().P(coroutineContext));
    }
}
