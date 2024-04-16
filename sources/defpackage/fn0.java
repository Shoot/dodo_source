package defpackage;

import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: CancellableContinuation.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002J%\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u0006\u0010\u0007J9\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH'¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\tH'J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0004H'J\u0014\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\tH&J\"\u0010\u0017\u001a\u00020\n2\u0018\u0010\u0016\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u0015H&J\u001b\u0010\u0019\u001a\u00020\n*\u00020\u00182\u0006\u0010\u0003\u001a\u00028\u0000H'¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00028\u00002\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH'¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006\""}, d2 = {"Lfn0;", "T", "Lcv1;", "value", "", "idempotent", Image.TYPE_MEDIUM, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "", "onCancellation", "e0", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "exception", "x", "token", "x0", "cause", "", "L", "Lkotlinx/coroutines/CompletionHandler;", "handler", "u", "Lkx1;", "W", "(Lkx1;Ljava/lang/Object;)V", "G", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "b", "()Z", "isActive", e.a, "isCompleted", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: fn0  reason: default package */
/* loaded from: classes3.dex */
public interface fn0<T> extends cv1<T> {

    /* compiled from: CancellableContinuation.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: fn0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static /* synthetic */ boolean a(fn0 fn0Var, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return fn0Var.L(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static /* synthetic */ Object b(fn0 fn0Var, Object obj, Object obj2, int i, Object obj3) {
            if (obj3 == null) {
                if ((i & 2) != 0) {
                    obj2 = null;
                }
                return fn0Var.m(obj, obj2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
        }
    }

    void G(T t, Function1<? super Throwable, Unit> function1);

    boolean L(Throwable th);

    void W(kx1 kx1Var, T t);

    boolean b();

    boolean e();

    Object e0(T t, Object obj, Function1<? super Throwable, Unit> function1);

    Object m(T t, Object obj);

    void u(Function1<? super Throwable, Unit> function1);

    Object x(Throwable th);

    void x0(Object obj);
}
