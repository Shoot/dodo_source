package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AndroidUiDispatcher.android.kt */
@Metadata(d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t*\u00010\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001\u0013B\u0019\b\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b:\u0010;J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0017\u00109\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006="}, d2 = {"Landroidx/compose/ui/platform/n;", "Lkx1;", "Ljava/lang/Runnable;", "N0", "", "Q0", "", "frameTimeNanos", "O0", "Landroid/view/Choreographer$FrameCallback;", "callback", "S0", "(Landroid/view/Choreographer$FrameCallback;)V", "Y0", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "block", "x", "Landroid/view/Choreographer;", com.huawei.hms.opendevice.c.a, "Landroid/view/Choreographer;", "K0", "()Landroid/view/Choreographer;", "choreographer", "Landroid/os/Handler;", DateTokenConverter.CONVERTER_KEY, "Landroid/os/Handler;", "handler", "", com.huawei.hms.push.e.a, "Ljava/lang/Object;", "lock", "Lgr;", "f", "Lgr;", "toRunTrampolined", "", "g", "Ljava/util/List;", "toRunOnFrame", Image.TYPE_HIGH, "spareToRunOnFrame", "", "i", "Z", "scheduledTrampolineDispatch", "j", "scheduledFrameDispatch", "androidx/compose/ui/platform/n$d", "k", "Landroidx/compose/ui/platform/n$d;", "dispatchCallback", "Lno6;", "l", "Lno6;", "M0", "()Lno6;", "frameClock", "<init>", "(Landroid/view/Choreographer;Landroid/os/Handler;)V", Image.TYPE_MEDIUM, "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class n extends kx1 {
    public static final c m = new c(null);
    public static final int n = 8;
    private static final rn5<CoroutineContext> o;
    private static final ThreadLocal<CoroutineContext> p;
    private final Choreographer c;
    private final Handler d;
    private final Object e;
    private final gr<Runnable> f;
    private List<Choreographer.FrameCallback> g;
    private List<Choreographer.FrameCallback> h;
    private boolean i;
    private boolean j;
    private final d k;
    private final no6 l;

    /* compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "a", "()Lkotlin/coroutines/CoroutineContext;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<CoroutineContext> {
        public static final a a = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AndroidUiDispatcher.android.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.compose.ui.platform.n$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0024a extends f3b implements Function2<qx1, cv1<? super Choreographer>, Object> {
            int a;

            C0024a(cv1<? super C0024a> cv1Var) {
                super(2, cv1Var);
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new C0024a(cv1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super Choreographer> cv1Var) {
                return ((C0024a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final CoroutineContext invoke() {
            boolean b;
            Choreographer choreographer;
            b = cj.b();
            if (b) {
                choreographer = Choreographer.getInstance();
            } else {
                choreographer = (Choreographer) qh0.e(v33.c(), new C0024a(null));
            }
            z65.g(choreographer, "if (isMainThread()) Chor…eographer.getInstance() }");
            Handler a2 = cm4.a(Looper.getMainLooper());
            z65.g(a2, "createAsync(Looper.getMainLooper())");
            n nVar = new n(choreographer, a2, null);
            return nVar.P(nVar.M0());
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\u0004"}, d2 = {"androidx/compose/ui/platform/n$b", "Ljava/lang/ThreadLocal;", "Lkotlin/coroutines/CoroutineContext;", "a", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class b extends ThreadLocal<CoroutineContext> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public CoroutineContext initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            z65.g(choreographer, "getInstance()");
            Looper myLooper = Looper.myLooper();
            if (myLooper != null) {
                Handler a = cm4.a(myLooper);
                z65.g(a, "createAsync(\n           …d\")\n                    )");
                n nVar = new n(choreographer, a, null);
                return nVar.P(nVar.M0());
            }
            throw new IllegalStateException("no Looper on this thread".toString());
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/n$c;", "", "Lkotlin/coroutines/CoroutineContext;", "Main$delegate", "Lrn5;", "b", "()Lkotlin/coroutines/CoroutineContext;", "Main", "a", "CurrentThread", "Ljava/lang/ThreadLocal;", "currentThread", "Ljava/lang/ThreadLocal;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CoroutineContext a() {
            boolean b;
            b = cj.b();
            if (b) {
                return b();
            }
            CoroutineContext coroutineContext = (CoroutineContext) n.p.get();
            if (coroutineContext != null) {
                return coroutineContext;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
        }

        public final CoroutineContext b() {
            return (CoroutineContext) n.o.getValue();
        }
    }

    /* compiled from: AndroidUiDispatcher.android.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"androidx/compose/ui/platform/n$d", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "", "run", "", "frameTimeNanos", "doFrame", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class d implements Choreographer.FrameCallback, Runnable {
        d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            n.this.d.removeCallbacks(this);
            n.this.Q0();
            n.this.O0(j);
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.Q0();
            Object obj = n.this.e;
            n nVar = n.this;
            synchronized (obj) {
                try {
                    if (nVar.g.isEmpty()) {
                        nVar.K0().removeFrameCallback(this);
                        nVar.j = false;
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    static {
        rn5<CoroutineContext> b2;
        b2 = yn5.b(a.a);
        o = b2;
        p = new b();
    }

    public /* synthetic */ n(Choreographer choreographer, Handler handler, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer, handler);
    }

    private final Runnable N0() {
        Runnable e0;
        synchronized (this.e) {
            e0 = this.f.e0();
        }
        return e0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(long j) {
        synchronized (this.e) {
            if (!this.j) {
                return;
            }
            this.j = false;
            List<Choreographer.FrameCallback> list = this.g;
            this.g = this.h;
            this.h = list;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).doFrame(j);
            }
            list.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0() {
        boolean z;
        do {
            Runnable N0 = N0();
            while (N0 != null) {
                N0.run();
                N0 = N0();
            }
            synchronized (this.e) {
                if (this.f.isEmpty()) {
                    z = false;
                    this.i = false;
                } else {
                    z = true;
                }
            }
        } while (z);
    }

    public final Choreographer K0() {
        return this.c;
    }

    public final no6 M0() {
        return this.l;
    }

    public final void S0(Choreographer.FrameCallback frameCallback) {
        z65.h(frameCallback, "callback");
        synchronized (this.e) {
            try {
                this.g.add(frameCallback);
                if (!this.j) {
                    this.j = true;
                    this.c.postFrameCallback(this.k);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Y0(Choreographer.FrameCallback frameCallback) {
        z65.h(frameCallback, "callback");
        synchronized (this.e) {
            this.g.remove(frameCallback);
        }
    }

    @Override // defpackage.kx1
    public void x(CoroutineContext coroutineContext, Runnable runnable) {
        z65.h(coroutineContext, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(runnable, "block");
        synchronized (this.e) {
            try {
                this.f.x(runnable);
                if (!this.i) {
                    this.i = true;
                    this.d.post(this.k);
                    if (!this.j) {
                        this.j = true;
                        this.c.postFrameCallback(this.k);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private n(Choreographer choreographer, Handler handler) {
        this.c = choreographer;
        this.d = handler;
        this.e = new Object();
        this.f = new gr<>();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.k = new d();
        this.l = new dj(choreographer, this);
    }
}
