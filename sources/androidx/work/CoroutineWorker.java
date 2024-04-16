package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.l95;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: CoroutineWorker.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0013\u0010\u0005\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002J\u0006\u0010\u000b\u001a\u00020\nR\u001a\u0010\u0010\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\u001d\u001a\u00020\u00178\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Lkr5;", "Landroidx/work/ListenableWorker$a;", "startWork", "a", "(Lcv1;)Ljava/lang/Object;", "La54;", DateTokenConverter.CONVERTER_KEY, "getForegroundInfoAsync", "", "onStopped", "Lbl1;", "Lbl1;", Image.TYPE_HIGH, "()Lbl1;", "job", "Lufa;", "b", "Lufa;", "g", "()Lufa;", "future", "Lkx1;", com.huawei.hms.opendevice.c.a, "Lkx1;", "()Lkx1;", "getCoroutineContext$annotations", "()V", "coroutineContext", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {
    private final bl1 a;
    private final ufa<ListenableWorker.a> b;
    private final kx1 c;

    /* compiled from: CoroutineWorker.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes.dex */
    static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CoroutineWorker.this.g().isCancelled()) {
                l95.a.a(CoroutineWorker.this.h(), null, 1, null);
            }
        }
    }

    /* compiled from: CoroutineWorker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @nn2(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        Object a;
        int b;
        final /* synthetic */ t95<a54> c;
        final /* synthetic */ CoroutineWorker d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t95<a54> t95Var, CoroutineWorker coroutineWorker, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.c = t95Var;
            this.d = coroutineWorker;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            t95 t95Var;
            d = c75.d();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    t95Var = (t95) this.a;
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                t95 t95Var2 = this.c;
                CoroutineWorker coroutineWorker = this.d;
                this.a = t95Var2;
                this.b = 1;
                Object d2 = coroutineWorker.d(this);
                if (d2 == d) {
                    return d;
                }
                t95Var = t95Var2;
                obj = d2;
            }
            t95Var.b(obj);
            return Unit.a;
        }
    }

    /* compiled from: CoroutineWorker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @nn2(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class c extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((c) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            try {
                if (i != 0) {
                    if (i == 1) {
                        vk9.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    vk9.b(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.a = 1;
                    obj = coroutineWorker.a(this);
                    if (obj == d) {
                        return d;
                    }
                }
                CoroutineWorker.this.g().p((ListenableWorker.a) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.g().q(th);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        bl1 b2;
        z65.h(context, "appContext");
        z65.h(workerParameters, "params");
        b2 = s95.b(null, 1, null);
        this.a = b2;
        ufa<ListenableWorker.a> t = ufa.t();
        z65.g(t, "create()");
        this.b = t;
        t.k(new a(), getTaskExecutor().c());
        this.c = v33.a();
    }

    static /* synthetic */ Object e(CoroutineWorker coroutineWorker, cv1 cv1Var) {
        throw new IllegalStateException("Not implemented");
    }

    public abstract Object a(cv1<? super ListenableWorker.a> cv1Var);

    public kx1 c() {
        return this.c;
    }

    public Object d(cv1<? super a54> cv1Var) {
        return e(this, cv1Var);
    }

    public final ufa<ListenableWorker.a> g() {
        return this.b;
    }

    @Override // androidx.work.ListenableWorker
    public final kr5<a54> getForegroundInfoAsync() {
        bl1 b2;
        b2 = s95.b(null, 1, null);
        qx1 a2 = rx1.a(c().P(b2));
        t95 t95Var = new t95(b2, null, 2, null);
        sh0.d(a2, null, null, new b(t95Var, this, null), 3, null);
        return t95Var;
    }

    public final bl1 h() {
        return this.a;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.b.cancel(false);
    }

    @Override // androidx.work.ListenableWorker
    public final kr5<ListenableWorker.a> startWork() {
        sh0.d(rx1.a(c().P(this.a)), null, null, new c(null), 3, null);
        return this.b;
    }
}
