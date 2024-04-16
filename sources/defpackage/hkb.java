package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: TransactionExecutor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lhkb;", "Ljava/util/concurrent/Executor;", "Ljava/lang/Runnable;", "command", "", "execute", c.a, "a", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/ArrayDeque;", "b", "Ljava/util/ArrayDeque;", "tasks", "Ljava/lang/Runnable;", "active", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", "syncLock", "<init>", "(Ljava/util/concurrent/Executor;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: hkb  reason: default package */
/* loaded from: classes.dex */
public final class hkb implements Executor {
    private final Executor a;
    private final ArrayDeque<Runnable> b;
    private Runnable c;
    private final Object d;

    public hkb(Executor executor) {
        z65.h(executor, "executor");
        this.a = executor;
        this.b = new ArrayDeque<>();
        this.d = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Runnable runnable, hkb hkbVar) {
        z65.h(runnable, "$command");
        z65.h(hkbVar, "this$0");
        try {
            runnable.run();
        } finally {
            hkbVar.c();
        }
    }

    public final void c() {
        synchronized (this.d) {
            try {
                Runnable poll = this.b.poll();
                Runnable runnable = poll;
                this.c = runnable;
                if (poll != null) {
                    this.a.execute(runnable);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        z65.h(runnable, "command");
        synchronized (this.d) {
            try {
                this.b.offer(new Runnable() { // from class: gkb
                    @Override // java.lang.Runnable
                    public final void run() {
                        hkb.b(runnable, this);
                    }
                });
                if (this.c == null) {
                    c();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
