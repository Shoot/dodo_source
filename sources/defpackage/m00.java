package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AutoCloser.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0012B\u001f\u0012\u0006\u0010C\u001a\u00020%\u0012\u0006\u0010E\u001a\u00020D\u0012\u0006\u0010F\u001a\u00020(¢\u0006\u0004\bG\u0010HJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J'\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010\"\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u00102\u001a\u00020,8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u00108\u001a\u00020%8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b3\u0010&\u001a\u0004\b4\u00105\"\u0004\b6\u00107R$\u0010=\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0014\u00109\u001a\u0004\b3\u0010:\"\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010?R\u0014\u0010A\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0014\u0010B\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001d¨\u0006I"}, d2 = {"Lm00;", "", "Lz2b;", "delegateOpenHelper", "", "k", "V", "Lkotlin/Function1;", "Ly2b;", "block", "g", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "j", e.a, DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Runnable;", "onAutoClose", "l", "a", "Lz2b;", "i", "()Lz2b;", Image.TYPE_MEDIUM, "(Lz2b;)V", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "handler", c.a, "Ljava/lang/Runnable;", "getOnAutoCloseCallback$room_runtime_release", "()Ljava/lang/Runnable;", "setOnAutoCloseCallback$room_runtime_release", "(Ljava/lang/Runnable;)V", "onAutoCloseCallback", "Ljava/lang/Object;", "lock", "", "J", "autoCloseTimeoutInMs", "Ljava/util/concurrent/Executor;", "f", "Ljava/util/concurrent/Executor;", "executor", "", "I", "getRefCount$room_runtime_release", "()I", "setRefCount$room_runtime_release", "(I)V", "refCount", Image.TYPE_HIGH, "getLastDecrementRefCountTimeStamp$room_runtime_release", "()J", "setLastDecrementRefCountTimeStamp$room_runtime_release", "(J)V", "lastDecrementRefCountTimeStamp", "Ly2b;", "()Ly2b;", "setDelegateDatabase$room_runtime_release", "(Ly2b;)V", "delegateDatabase", "", "Z", "manuallyClosed", "executeAutoCloser", "autoCloser", "autoCloseTimeoutAmount", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "autoCloseExecutor", "<init>", "(JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/Executor;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: m00  reason: default package */
/* loaded from: classes.dex */
public final class m00 {
    public static final a m = new a(null);
    public z2b a;
    private final Handler b;
    private Runnable c;
    private final Object d;
    private long e;
    private final Executor f;
    private int g;
    private long h;
    private y2b i;
    private boolean j;
    private final Runnable k;
    private final Runnable l;

    /* compiled from: AutoCloser.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lm00$a;", "", "", "autoCloseBug", "Ljava/lang/String;", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: m00$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public m00(long j, TimeUnit timeUnit, Executor executor) {
        z65.h(timeUnit, "autoCloseTimeUnit");
        z65.h(executor, "autoCloseExecutor");
        this.b = new Handler(Looper.getMainLooper());
        this.d = new Object();
        this.e = timeUnit.toMillis(j);
        this.f = executor;
        this.h = SystemClock.uptimeMillis();
        this.k = new Runnable() { // from class: k00
            @Override // java.lang.Runnable
            public final void run() {
                m00.f(m00.this);
            }
        };
        this.l = new Runnable() { // from class: l00
            @Override // java.lang.Runnable
            public final void run() {
                m00.c(m00.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(m00 m00Var) {
        Unit unit;
        z65.h(m00Var, "this$0");
        synchronized (m00Var.d) {
            try {
                if (SystemClock.uptimeMillis() - m00Var.h < m00Var.e) {
                    return;
                }
                if (m00Var.g != 0) {
                    return;
                }
                Runnable runnable = m00Var.c;
                if (runnable != null) {
                    runnable.run();
                    unit = Unit.a;
                } else {
                    unit = null;
                }
                if (unit != null) {
                    y2b y2bVar = m00Var.i;
                    if (y2bVar != null && y2bVar.isOpen()) {
                        y2bVar.close();
                    }
                    m00Var.i = null;
                    Unit unit2 = Unit.a;
                    return;
                }
                throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(m00 m00Var) {
        z65.h(m00Var, "this$0");
        m00Var.f.execute(m00Var.l);
    }

    public final void d() throws IOException {
        synchronized (this.d) {
            try {
                this.j = true;
                y2b y2bVar = this.i;
                if (y2bVar != null) {
                    y2bVar.close();
                }
                this.i = null;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.d) {
            try {
                int i = this.g;
                if (i > 0) {
                    int i2 = i - 1;
                    this.g = i2;
                    if (i2 == 0) {
                        if (this.i == null) {
                            return;
                        }
                        this.b.postDelayed(this.k, this.e);
                    }
                    Unit unit = Unit.a;
                    return;
                }
                throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement".toString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final <V> V g(Function1<? super y2b, ? extends V> function1) {
        z65.h(function1, "block");
        try {
            return function1.invoke(j());
        } finally {
            e();
        }
    }

    public final y2b h() {
        return this.i;
    }

    public final z2b i() {
        z2b z2bVar = this.a;
        if (z2bVar != null) {
            return z2bVar;
        }
        z65.z("delegateOpenHelper");
        return null;
    }

    public final y2b j() {
        synchronized (this.d) {
            this.b.removeCallbacks(this.k);
            this.g++;
            if (!this.j) {
                y2b y2bVar = this.i;
                if (y2bVar != null && y2bVar.isOpen()) {
                    return y2bVar;
                }
                y2b l1 = i().l1();
                this.i = l1;
                return l1;
            }
            throw new IllegalStateException("Attempting to open already closed database.".toString());
        }
    }

    public final void k(z2b z2bVar) {
        z65.h(z2bVar, "delegateOpenHelper");
        m(z2bVar);
    }

    public final void l(Runnable runnable) {
        z65.h(runnable, "onAutoClose");
        this.c = runnable;
    }

    public final void m(z2b z2bVar) {
        z65.h(z2bVar, "<set-?>");
        this.a = z2bVar;
    }
}
