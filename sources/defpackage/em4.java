package defpackage;

import android.os.Handler;
import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.i;
/* compiled from: HandlerDispatcher.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010$\u001a\u00020\n¢\u0006\u0004\b+\u0010,B\u001d\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b+\u0010-J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u001e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0016J$\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0013\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Lem4;", "Lfm4;", "Lvt2;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "E0", "", "W", "x", "", "timeMillis", "Lfn0;", "continuation", Image.TYPE_MEDIUM, "Lf43;", Image.TYPE_SMALL, "", "toString", "", "other", "equals", "", "hashCode", "Landroid/os/Handler;", c.a, "Landroid/os/Handler;", "handler", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", Action.NAME_ATTRIBUTE, e.a, "Z", "invokeImmediately", "_immediate", "Lem4;", "f", "F0", "()Lem4;", "immediate", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0})
/* renamed from: em4  reason: default package */
/* loaded from: classes3.dex */
public final class em4 extends fm4 implements vt2 {
    private volatile em4 _immediate;
    private final Handler c;
    private final String d;
    private final boolean e;
    private final em4 f;

    /* compiled from: Runnable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: em4$a */
    /* loaded from: classes3.dex */
    public static final class a implements Runnable {
        final /* synthetic */ fn0 a;
        final /* synthetic */ em4 b;

        public a(fn0 fn0Var, em4 em4Var) {
            this.a = fn0Var;
            this.b = em4Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.W(this.b, Unit.a);
        }
    }

    /* compiled from: HandlerDispatcher.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: em4$b */
    /* loaded from: classes3.dex */
    static final class b extends ej5 implements Function1<Throwable, Unit> {
        final /* synthetic */ Runnable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            this.b = runnable;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            em4.this.c.removeCallbacks(this.b);
        }
    }

    private em4(Handler handler, String str, boolean z) {
        super(null);
        this.c = handler;
        this.d = str;
        this.e = z;
        this._immediate = z ? this : null;
        em4 em4Var = this._immediate;
        if (em4Var == null) {
            em4Var = new em4(handler, str, true);
            this._immediate = em4Var;
        }
        this.f = em4Var;
    }

    private final void E0(CoroutineContext coroutineContext, Runnable runnable) {
        q95.d(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        v33.b().x(coroutineContext, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I0(em4 em4Var, Runnable runnable) {
        em4Var.c.removeCallbacks(runnable);
    }

    @Override // defpackage.fm4
    /* renamed from: F0 */
    public em4 r0() {
        return this.f;
    }

    @Override // defpackage.kx1
    public boolean W(CoroutineContext coroutineContext) {
        if (this.e && z65.c(Looper.myLooper(), this.c.getLooper())) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof em4) && ((em4) obj).c == this.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // defpackage.vt2
    public void m(long j, fn0<? super Unit> fn0Var) {
        long i;
        a aVar = new a(fn0Var, this);
        Handler handler = this.c;
        i = i.i(j, 4611686018427387903L);
        if (handler.postDelayed(aVar, i)) {
            fn0Var.u(new b(aVar));
        } else {
            E0(fn0Var.getContext(), aVar);
        }
    }

    @Override // defpackage.fm4, defpackage.vt2
    public f43 s(long j, final Runnable runnable, CoroutineContext coroutineContext) {
        long i;
        Handler handler = this.c;
        i = i.i(j, 4611686018427387903L);
        if (handler.postDelayed(runnable, i)) {
            return new f43() { // from class: dm4
                @Override // defpackage.f43
                public final void a() {
                    em4.I0(em4.this, runnable);
                }
            };
        }
        E0(coroutineContext, runnable);
        return yz6.a;
    }

    @Override // defpackage.t46, defpackage.kx1
    public String toString() {
        String q0 = q0();
        if (q0 == null) {
            String str = this.d;
            if (str == null) {
                str = this.c.toString();
            }
            if (this.e) {
                return str + ".immediate";
            }
            return str;
        }
        return q0;
    }

    @Override // defpackage.kx1
    public void x(CoroutineContext coroutineContext, Runnable runnable) {
        if (!this.c.post(runnable)) {
            E0(coroutineContext, runnable);
        }
    }

    public /* synthetic */ em4(Handler handler, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public em4(Handler handler, String str) {
        this(handler, str, false);
    }
}
