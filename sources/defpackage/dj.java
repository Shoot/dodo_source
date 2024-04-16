package defpackage;

import android.view.Choreographer;
import androidx.compose.ui.platform.n;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.no6;
import defpackage.sk9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: AndroidUiFrameClock.android.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Ldj;", "Lno6;", "R", "Lkotlin/Function1;", "", "onFrame", "S", "(Lkotlin/jvm/functions/Function1;Lcv1;)Ljava/lang/Object;", "Landroid/view/Choreographer;", "a", "Landroid/view/Choreographer;", DateTokenConverter.CONVERTER_KEY, "()Landroid/view/Choreographer;", "choreographer", "Landroidx/compose/ui/platform/n;", "b", "Landroidx/compose/ui/platform/n;", "dispatcher", "<init>", "(Landroid/view/Choreographer;Landroidx/compose/ui/platform/n;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: dj  reason: default package */
/* loaded from: classes.dex */
public final class dj implements no6 {
    private final Choreographer a;
    private final n b;

    /* compiled from: AndroidUiFrameClock.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "R", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: dj$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<Throwable, Unit> {
        final /* synthetic */ n a;
        final /* synthetic */ Choreographer.FrameCallback b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n nVar, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.a = nVar;
            this.b = frameCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            this.a.Y0(this.b);
        }
    }

    /* compiled from: AndroidUiFrameClock.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "R", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: dj$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<Throwable, Unit> {
        final /* synthetic */ Choreographer.FrameCallback b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.b = frameCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            dj.this.d().removeFrameCallback(this.b);
        }
    }

    /* compiled from: AndroidUiFrameClock.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "R", "frameTimeNanos", "", "doFrame"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: dj$c */
    /* loaded from: classes.dex */
    static final class c implements Choreographer.FrameCallback {
        final /* synthetic */ fn0<R> a;
        final /* synthetic */ dj b;
        final /* synthetic */ Function1<Long, R> c;

        /* JADX WARN: Multi-variable type inference failed */
        c(fn0<? super R> fn0Var, dj djVar, Function1<? super Long, ? extends R> function1) {
            this.a = fn0Var;
            this.b = djVar;
            this.c = function1;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            Object b;
            cv1 cv1Var = this.a;
            Function1<Long, R> function1 = this.c;
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

    public dj(Choreographer choreographer, n nVar) {
        z65.h(choreographer, "choreographer");
        this.a = choreographer;
        this.b = nVar;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext P(CoroutineContext coroutineContext) {
        return no6.a.d(this, coroutineContext);
    }

    @Override // defpackage.no6
    public <R> Object S(Function1<? super Long, ? extends R> function1, cv1<? super R> cv1Var) {
        cv1 c2;
        Object d;
        n nVar = this.b;
        if (nVar == null) {
            CoroutineContext.Element c3 = cv1Var.getContext().c(d.J4);
            if (c3 instanceof n) {
                nVar = (n) c3;
            } else {
                nVar = null;
            }
        }
        c2 = b75.c(cv1Var);
        gn0 gn0Var = new gn0(c2, 1);
        gn0Var.w();
        c cVar = new c(gn0Var, this, function1);
        if (nVar != null && z65.c(nVar.K0(), d())) {
            nVar.S0(cVar);
            gn0Var.u(new a(nVar, cVar));
        } else {
            d().postFrameCallback(cVar);
            gn0Var.u(new b(cVar));
        }
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

    public final Choreographer d() {
        return this.a;
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
