package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
/* compiled from: DispatchQueue.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lm33;", "", "Ljava/lang/Runnable;", "runnable", "", "f", Image.TYPE_HIGH, "i", "g", e.a, "", "b", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, c.a, "a", "Z", "paused", "finished", "isDraining", "Ljava/util/Queue;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Queue;", "queue", "<init>", "()V", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* renamed from: m33  reason: default package */
/* loaded from: classes.dex */
public final class m33 {
    private boolean b;
    private boolean c;
    private boolean a = true;
    private final Queue<Runnable> d = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(m33 m33Var, Runnable runnable) {
        z65.h(m33Var, "this$0");
        z65.h(runnable, "$runnable");
        m33Var.f(runnable);
    }

    private final void f(Runnable runnable) {
        if (this.d.offer(runnable)) {
            e();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables".toString());
    }

    public final boolean b() {
        if (!this.b && this.a) {
            return false;
        }
        return true;
    }

    public final void c(CoroutineContext coroutineContext, final Runnable runnable) {
        z65.h(coroutineContext, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(runnable, "runnable");
        t46 p0 = v33.c().p0();
        if (!p0.W(coroutineContext) && !b()) {
            f(runnable);
        } else {
            p0.x(coroutineContext, new Runnable() { // from class: l33
                @Override // java.lang.Runnable
                public final void run() {
                    m33.d(m33.this, runnable);
                }
            });
        }
    }

    public final void e() {
        if (this.c) {
            return;
        }
        try {
            this.c = true;
            while ((!this.d.isEmpty()) && b()) {
                Runnable poll = this.d.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        } finally {
            this.c = false;
        }
    }

    public final void g() {
        this.b = true;
        e();
    }

    public final void h() {
        this.a = true;
    }

    public final void i() {
        if (!this.a) {
            return;
        }
        if (!this.b) {
            this.a = false;
            e();
            return;
        }
        throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
    }
}
