package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: FullyDrawnReporter.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\tR\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0011\u0010!\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u000b\u0010 ¨\u0006$"}, d2 = {"Lh84;", "", "", "b", "Ljava/util/concurrent/Executor;", "a", "Ljava/util/concurrent/Executor;", "executor", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "reportFullyDrawn", c.a, "Ljava/lang/Object;", "lock", "", DateTokenConverter.CONVERTER_KEY, "I", "reporterCount", "", e.a, "Z", "reportPosted", "f", "reportedFullyDrawn", "", "g", "Ljava/util/List;", "onReportCallbacks", "Ljava/lang/Runnable;", Image.TYPE_HIGH, "Ljava/lang/Runnable;", "reportRunnable", "()Z", "isFullyDrawnReported", "<init>", "(Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function0;)V", "activity_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: h84  reason: default package */
/* loaded from: classes.dex */
public final class h84 {
    private final Executor a;
    private final Function0<Unit> b;
    private final Object c;
    private int d;
    private boolean e;
    private boolean f;
    private final List<Function0<Unit>> g;
    private final Runnable h;

    public h84(Executor executor, Function0<Unit> function0) {
        z65.h(executor, "executor");
        z65.h(function0, "reportFullyDrawn");
        this.a = executor;
        this.b = function0;
        this.c = new Object();
        this.g = new ArrayList();
        this.h = new Runnable() { // from class: g84
            @Override // java.lang.Runnable
            public final void run() {
                h84.d(h84.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(h84 h84Var) {
        z65.h(h84Var, "this$0");
        synchronized (h84Var.c) {
            try {
                h84Var.e = false;
                if (h84Var.d == 0 && !h84Var.f) {
                    h84Var.b.invoke();
                    h84Var.b();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.c) {
            try {
                this.f = true;
                Iterator<T> it = this.g.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.g.clear();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z;
        synchronized (this.c) {
            z = this.f;
        }
        return z;
    }
}
