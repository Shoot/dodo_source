package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.d;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
/* compiled from: ServiceLifecycleDispatcher.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0015¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/q;", "", "Landroidx/lifecycle/d$a;", "event", "", "f", com.huawei.hms.opendevice.c.a, "b", com.huawei.hms.push.e.a, DateTokenConverter.CONVERTER_KEY, "Landroidx/lifecycle/h;", "a", "Landroidx/lifecycle/h;", "registry", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/q$a;", "Landroidx/lifecycle/q$a;", "lastDispatchRunnable", "Landroidx/lifecycle/d;", "()Landroidx/lifecycle/d;", "lifecycle", "Lop5;", "provider", "<init>", "(Lop5;)V", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class q {
    private final h a;
    private final Handler b;
    private a c;

    /* compiled from: ServiceLifecycleDispatcher.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/q$a;", "Ljava/lang/Runnable;", "", "run", "Landroidx/lifecycle/h;", "a", "Landroidx/lifecycle/h;", "registry", "Landroidx/lifecycle/d$a;", "b", "Landroidx/lifecycle/d$a;", "getEvent", "()Landroidx/lifecycle/d$a;", "event", "", com.huawei.hms.opendevice.c.a, "Z", "wasExecuted", "<init>", "(Landroidx/lifecycle/h;Landroidx/lifecycle/d$a;)V", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a implements Runnable {
        private final h a;
        private final d.a b;
        private boolean c;

        public a(h hVar, d.a aVar) {
            z65.h(hVar, "registry");
            z65.h(aVar, "event");
            this.a = hVar;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.c) {
                this.a.i(this.b);
                this.c = true;
            }
        }
    }

    public q(op5 op5Var) {
        z65.h(op5Var, "provider");
        this.a = new h(op5Var);
        this.b = new Handler();
    }

    private final void f(d.a aVar) {
        a aVar2 = this.c;
        if (aVar2 != null) {
            aVar2.run();
        }
        a aVar3 = new a(this.a, aVar);
        this.c = aVar3;
        Handler handler = this.b;
        z65.e(aVar3);
        handler.postAtFrontOfQueue(aVar3);
    }

    public d a() {
        return this.a;
    }

    public void b() {
        f(d.a.ON_START);
    }

    public void c() {
        f(d.a.ON_CREATE);
    }

    public void d() {
        f(d.a.ON_STOP);
        f(d.a.ON_DESTROY);
    }

    public void e() {
        f(d.a.ON_START);
    }
}
