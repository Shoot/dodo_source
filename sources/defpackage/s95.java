package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.l95;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
/* compiled from: Job.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u001a\u0017\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u000e\u001a\u00020\u0007*\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u001a\n\u0010\u000f\u001a\u00020\u0007*\u00020\u0000\u001a\n\u0010\u0010\u001a\u00020\u0007*\u00020\n\u001a\u001e\u0010\u0014\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0013\"\u0015\u0010\u0018\u001a\u00020\u0015*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0015\u0010\u001b\u001a\u00020\u0000*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Ll95;", "parent", "Lbl1;", "a", "Lf43;", "handle", Image.TYPE_HIGH, "", "g", "(Ll95;Lcv1;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", DateTokenConverter.CONVERTER_KEY, "i", "j", "", "message", "", c.a, "", "l", "(Lkotlin/coroutines/CoroutineContext;)Z", "isActive", "k", "(Lkotlin/coroutines/CoroutineContext;)Ll95;", "job", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/JobKt")
/* renamed from: s95 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s95 {
    public static final bl1 a(l95 l95Var) {
        return new n95(l95Var);
    }

    public static /* synthetic */ bl1 b(l95 l95Var, int i, Object obj) {
        if ((i & 1) != 0) {
            l95Var = null;
        }
        return q95.a(l95Var);
    }

    public static final void c(l95 l95Var, String str, Throwable th) {
        l95Var.a(tl3.a(str, th));
    }

    public static final void d(CoroutineContext coroutineContext, CancellationException cancellationException) {
        l95 l95Var = (l95) coroutineContext.c(l95.M);
        if (l95Var != null) {
            l95Var.a(cancellationException);
        }
    }

    public static /* synthetic */ void e(l95 l95Var, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        q95.c(l95Var, str, th);
    }

    public static /* synthetic */ void f(CoroutineContext coroutineContext, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        q95.d(coroutineContext, cancellationException);
    }

    public static final Object g(l95 l95Var, cv1<? super Unit> cv1Var) {
        Object d;
        l95.a.a(l95Var, null, 1, null);
        Object n = l95Var.n(cv1Var);
        d = c75.d();
        if (n == d) {
            return n;
        }
        return Unit.a;
    }

    public static final f43 h(l95 l95Var, f43 f43Var) {
        return l95Var.r(new l43(f43Var));
    }

    public static final void i(l95 l95Var) {
        if (l95Var.b()) {
            return;
        }
        throw l95Var.q();
    }

    public static final void j(CoroutineContext coroutineContext) {
        l95 l95Var = (l95) coroutineContext.c(l95.M);
        if (l95Var != null) {
            q95.j(l95Var);
        }
    }

    public static final l95 k(CoroutineContext coroutineContext) {
        l95 l95Var = (l95) coroutineContext.c(l95.M);
        if (l95Var != null) {
            return l95Var;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static final boolean l(CoroutineContext coroutineContext) {
        l95 l95Var = (l95) coroutineContext.c(l95.M);
        if (l95Var == null || !l95Var.b()) {
            return false;
        }
        return true;
    }
}
