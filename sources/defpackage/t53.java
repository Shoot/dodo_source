package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DodoCountDownTimer.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002JL\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\tR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015¨\u0006\u0019"}, d2 = {"Lt53;", "", "", c.a, "", "millisInFuture", "interval", "Lkotlin/Function1;", "onTick", "Lkotlin/Function0;", "onFinish", "onCanceled", DateTokenConverter.CONVERTER_KEY, "a", "J", "stopTimeInFuture", "", "b", "Z", "cancelled", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: t53  reason: default package */
/* loaded from: classes2.dex */
public final class t53 {
    public static final a d = new a(null);
    public static final int e = 8;
    private long a;
    private boolean b;
    private Handler c;

    /* compiled from: DodoCountDownTimer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lt53$a;", "", "", "MSG", "I", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: t53$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: DodoCountDownTimer.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"t53$b", "Landroid/os/Handler;", "Landroid/os/Message;", RemoteMessageConst.MessageBody.MSG, "", "handleMessage", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: t53$b */
    /* loaded from: classes2.dex */
    public static final class b extends Handler {
        final /* synthetic */ Function0<Unit> b;
        final /* synthetic */ Function0<Unit> c;
        final /* synthetic */ Function1<Long, Unit> d;
        final /* synthetic */ long e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function0<Unit> function0, Function0<Unit> function02, Function1<? super Long, Unit> function1, long j, Looper looper) {
            super(looper);
            this.b = function0;
            this.c = function02;
            this.d = function1;
            this.e = j;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            z65.h(message, RemoteMessageConst.MessageBody.MSG);
            t53 t53Var = t53.this;
            Function0<Unit> function0 = this.b;
            Function0<Unit> function02 = this.c;
            Function1<Long, Unit> function1 = this.d;
            long j = this.e;
            synchronized (t53Var) {
                if (t53Var.b) {
                    function0.invoke();
                    return;
                }
                long elapsedRealtime = t53Var.a - SystemClock.elapsedRealtime();
                long j2 = 0;
                if (elapsedRealtime <= 0) {
                    function02.invoke();
                    Unit unit = Unit.a;
                } else {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    function1.invoke(Long.valueOf(elapsedRealtime));
                    long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime2;
                    if (elapsedRealtime < j) {
                        long j3 = elapsedRealtime - elapsedRealtime3;
                        if (j3 >= 0) {
                            j2 = j3;
                        }
                    } else {
                        long j4 = j - elapsedRealtime3;
                        while (j4 < 0) {
                            j4 += j;
                        }
                        j2 = j4;
                    }
                    sendMessageDelayed(obtainMessage(1), j2);
                }
            }
        }
    }

    public t53() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
    }

    public final synchronized void c() {
        try {
            this.b = true;
            Handler handler = this.c;
            if (handler != null) {
                handler.removeMessages(1);
            }
            this.c = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized t53 d(long j, long j2, Function1<? super Long, Unit> function1, Function0<Unit> function0, Function0<Unit> function02) {
        z65.h(function1, "onTick");
        z65.h(function0, "onFinish");
        z65.h(function02, "onCanceled");
        this.b = false;
        if (j <= 0) {
            function0.invoke();
            return this;
        }
        this.a = SystemClock.elapsedRealtime() + j;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            b bVar = new b(function02, function0, function1, j2, myLooper);
            this.c = bVar;
            bVar.sendMessage(bVar.obtainMessage(1));
            return this;
        }
        Thread currentThread = Thread.currentThread();
        throw new IllegalArgumentException("Can't create handler inside thread " + currentThread + " that has not called Looper.prepare()");
    }
}
