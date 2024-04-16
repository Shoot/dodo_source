package defpackage;

import android.view.Choreographer;
import defpackage.no6;
import defpackage.sk9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActualAndroid.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lip2;", "Lno6;", "R", "Lkotlin/Function1;", "", "onFrame", "S", "(Lkotlin/jvm/functions/Function1;Lcv1;)Ljava/lang/Object;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "b", "Landroid/view/Choreographer;", "choreographer", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ip2  reason: default package */
/* loaded from: classes.dex */
public final class ip2 implements no6 {
    public static final ip2 a = new ip2();
    private static final Choreographer b = (Choreographer) qh0.e(v33.c().p0(), new a(null));

    /* compiled from: ActualAndroid.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "androidx.compose.runtime.DefaultChoreographerFrameClock$choreographer$1", f = "ActualAndroid.android.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ip2$a */
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super Choreographer>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Choreographer> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return Choreographer.getInstance();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ActualAndroid.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "R", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: ip2$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<Throwable, Unit> {
        final /* synthetic */ Choreographer.FrameCallback a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.a = frameCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            ip2.b.removeFrameCallback(this.a);
        }
    }

    /* compiled from: ActualAndroid.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "R", "frameTimeNanos", "", "doFrame"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: ip2$c */
    /* loaded from: classes.dex */
    static final class c implements Choreographer.FrameCallback {
        final /* synthetic */ fn0<R> a;
        final /* synthetic */ Function1<Long, R> b;

        /* JADX WARN: Multi-variable type inference failed */
        c(fn0<? super R> fn0Var, Function1<? super Long, ? extends R> function1) {
            this.a = fn0Var;
            this.b = function1;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object b;
            cv1 cv1Var = this.a;
            ip2 ip2Var = ip2.a;
            Function1<Long, R> function1 = this.b;
            try {
                sk9.a aVar = sk9.b;
                b = sk9.b(function1.invoke(Long.valueOf(j)));
            } catch (Throwable th) {
                sk9.a aVar2 = sk9.b;
                b = sk9.b(vk9.a(th));
            }
            cv1Var.resumeWith(b);
        }
    }

    private ip2() {
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext P(CoroutineContext coroutineContext) {
        return no6.a.d(this, coroutineContext);
    }

    @Override // defpackage.no6
    public <R> Object S(Function1<? super Long, ? extends R> function1, cv1<? super R> cv1Var) {
        cv1 c2;
        Object d;
        c2 = b75.c(cv1Var);
        gn0 gn0Var = new gn0(c2, 1);
        gn0Var.w();
        c cVar = new c(gn0Var, function1);
        b.postFrameCallback(cVar);
        gn0Var.u(new b(cVar));
        Object s = gn0Var.s();
        d = c75.d();
        if (s == d) {
            io2.c(cv1Var);
        }
        return s;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext T(CoroutineContext.b<?> bVar) {
        return no6.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E c(CoroutineContext.b<E> bVar) {
        return (E) no6.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public /* synthetic */ CoroutineContext.b getKey() {
        return mo6.a(this);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R m0(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) no6.a.a(this, r, function2);
    }
}
