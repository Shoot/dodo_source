package cloud.mindbox.mobile_sdk.services;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: MindboxOneTimeEventWorker.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcloud/mindbox/mobile_sdk/services/MindboxOneTimeEventWorker;", "Landroidx/work/Worker;", "Landroidx/work/ListenableWorker$a;", "doWork", "", "onStopped", "Lz7c;", "a", "Lrn5;", com.huawei.hms.opendevice.c.a, "()Lz7c;", "workerDelegate", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MindboxOneTimeEventWorker extends Worker {
    private final rn5 a;

    /* compiled from: MindboxOneTimeEventWorker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/work/ListenableWorker$a;", "a", "()Landroidx/work/ListenableWorker$a;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<ListenableWorker.a> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ListenableWorker.a invoke() {
            z7c c = MindboxOneTimeEventWorker.this.c();
            Context applicationContext = MindboxOneTimeEventWorker.this.getApplicationContext();
            z65.g(applicationContext, "applicationContext");
            return c.f(applicationContext, MindboxOneTimeEventWorker.this);
        }
    }

    /* compiled from: MindboxOneTimeEventWorker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<Unit> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            MindboxOneTimeEventWorker.this.c().b(MindboxOneTimeEventWorker.this);
        }
    }

    /* compiled from: MindboxOneTimeEventWorker.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lz7c;", "a", "()Lz7c;"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<z7c> {
        public static final c a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final z7c invoke() {
            return new z7c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MindboxOneTimeEventWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        rn5 b2;
        z65.h(context, "appContext");
        z65.h(workerParameters, "workerParams");
        b2 = yn5.b(c.a);
        this.a = b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z7c c() {
        return (z7c) this.a.getValue();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        yx5 yx5Var = yx5.a;
        ListenableWorker.a a2 = ListenableWorker.a.a();
        z65.g(a2, "failure()");
        return (ListenableWorker.a) yx5Var.b(a2, new a());
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        yx5.a.d(new b());
    }
}
