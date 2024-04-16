package defpackage;

import com.huawei.hms.push.e;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
/* compiled from: Job.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 #2\u00020\u0001:\u0001\u0019J\f\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H'J\b\u0010\u0006\u001a\u00020\u0005H&J\u001a\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H&J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH'J\u0013\u0010\u000e\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0015\u001a\u00020\u00142\u0018\u0010\u0013\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u0012H&J6\u0010\u0018\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\u0018\u0010\u0013\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\b0\u0010j\u0002`\u0012H'R\u0014\u0010\u001b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00000\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Ll95;", "Lkotlin/coroutines/CoroutineContext$Element;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "q", "", "start", "cause", "", "a", "La71;", "child", "Ly61;", "n0", "n", "(Lcv1;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lf43;", "r", "onCancelling", "invokeImmediately", "o", "b", "()Z", "isActive", e.a, "isCompleted", "isCancelled", "Lkotlin/sequences/Sequence;", "l", "()Lkotlin/sequences/Sequence;", "children", "M", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: l95  reason: default package */
/* loaded from: classes3.dex */
public interface l95 extends CoroutineContext.Element {
    public static final b M = b.a;

    /* compiled from: Job.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: l95$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public static /* synthetic */ void a(l95 l95Var, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                l95Var.a(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static <R> R b(l95 l95Var, R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.a.a(l95Var, r, function2);
        }

        public static <E extends CoroutineContext.Element> E c(l95 l95Var, CoroutineContext.b<E> bVar) {
            return (E) CoroutineContext.Element.a.b(l95Var, bVar);
        }

        public static /* synthetic */ f43 d(l95 l95Var, boolean z, boolean z2, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return l95Var.o(z, z2, function1);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static CoroutineContext e(l95 l95Var, CoroutineContext.b<?> bVar) {
            return CoroutineContext.Element.a.c(l95Var, bVar);
        }

        public static CoroutineContext f(l95 l95Var, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(l95Var, coroutineContext);
        }
    }

    /* compiled from: Job.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ll95$b;", "Lkotlin/coroutines/CoroutineContext$b;", "Ll95;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: l95$b */
    /* loaded from: classes3.dex */
    public static final class b implements CoroutineContext.b<l95> {
        static final /* synthetic */ b a = new b();

        private b() {
        }
    }

    void a(CancellationException cancellationException);

    boolean b();

    boolean e();

    boolean isCancelled();

    Sequence<l95> l();

    Object n(cv1<? super Unit> cv1Var);

    y61 n0(a71 a71Var);

    f43 o(boolean z, boolean z2, Function1<? super Throwable, Unit> function1);

    CancellationException q();

    f43 r(Function1<? super Throwable, Unit> function1);

    boolean start();
}
