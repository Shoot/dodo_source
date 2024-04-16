package defpackage;

import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.android.volley.f;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.lx1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: MindboxLoggerImpl.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\"\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0012\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006%"}, d2 = {"Lfk6;", "Lek6;", "", "message", "", "j", "", "parent", com.huawei.hms.opendevice.c.a, "i", DateTokenConverter.CONVERTER_KEY, e.a, "", "exception", "f", "a", "k", "Lap5;", "Lap5;", "DEFAULT_LOG_LEVEL", "Lio6;", "Lbk6;", "g", "()Lio6;", "monitoringRepository", "Lqx1;", "Lqx1;", Image.TYPE_HIGH, "()Lqx1;", "monitoringScope", "getLevel$sdk_release", "()Lap5;", "setLevel$sdk_release", "(Lap5;)V", "level", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: fk6  reason: default package */
/* loaded from: classes.dex */
public final class fk6 implements ek6 {
    private static final ap5 c;
    private static final bk6 d;
    private static final qx1 e;
    private static volatile ap5 f;
    static final /* synthetic */ je5<Object>[] b = {bc9.f(new ar8(fk6.class, "monitoringRepository", "getMonitoringRepository()Lcloud/mindbox/mobile_sdk/monitoring/domain/interfaces/MonitoringRepository;", 0))};
    public static final fk6 a = new fk6();

    /* compiled from: MindboxLoggerImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgo;", "Lio6;", "a", "(Lgo;)Lio6;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: fk6$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<go, io6> {
        public static final a a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final io6 invoke(go goVar) {
            z65.h(goVar, "$this$mindboxInject");
            return goVar.g();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxLoggerImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "cloud.mindbox.mobile_sdk.logger.MindboxLoggerImpl$saveLog$1", f = "MindboxLoggerImpl.kt", l = {106}, m = "invokeSuspend")
    /* renamed from: fk6$b */
    /* loaded from: classes.dex */
    public static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.b = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(this.b, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d = a75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                io6 g = fk6.a.g();
                b55 f0 = b55.f0();
                z65.g(f0, "now()");
                ddc d2 = vn3.d(f0);
                String str = this.b;
                this.a = 1;
                if (g.c(d2, str, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"fk6$c", "Lkotlin/coroutines/a;", "Llx1;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "exception", "", "N", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0})
    /* renamed from: fk6$c */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.coroutines.a implements lx1 {
        public c(lx1.a aVar) {
            super(aVar);
        }

        @Override // defpackage.lx1
        public void N(CoroutineContext coroutineContext, Throwable th) {
            Log.e("Mindbox", "Mindbox monitoring caught unhandled error", th);
        }
    }

    static {
        ap5 ap5Var = ap5.ERROR;
        c = ap5Var;
        d = ck6.a(a.a);
        e = rx1.a(k2b.b(null, 1, null).P(v33.a()).P(new c(lx1.J)));
        f.b = false;
        f = ap5Var;
    }

    private fk6() {
    }

    private final String c(Object obj, String str) {
        return obj.getClass().getSimpleName() + ": " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final io6 g() {
        return (io6) d.a(this, b[0]);
    }

    private final void j(String str) {
        if (!sj6.a.c()) {
            return;
        }
        qh0.d(e, null, null, new b(str, null), 3, null);
    }

    @Override // defpackage.ek6
    public void a(Object obj, String str) {
        z65.h(obj, "parent");
        z65.h(str, "message");
        String c2 = c(obj, str);
        if (f.i() <= ap5.WARN.i()) {
            Log.w("Mindbox", c2);
        }
        j(c2);
    }

    public void d(Object obj, String str) {
        z65.h(obj, "parent");
        z65.h(str, "message");
        String c2 = c(obj, str);
        if (f.i() <= ap5.DEBUG.i()) {
            Log.d("Mindbox", c2);
        }
        j(c2);
    }

    public void e(Object obj, String str) {
        z65.h(obj, "parent");
        z65.h(str, "message");
        String c2 = c(obj, str);
        if (f.i() <= ap5.ERROR.i()) {
            Log.e("Mindbox", c2);
        }
        j(c2);
    }

    public void f(Object obj, String str, Throwable th) {
        String b2;
        z65.h(obj, "parent");
        z65.h(str, "message");
        z65.h(th, "exception");
        String c2 = c(obj, str);
        if (f.i() <= ap5.ERROR.i()) {
            Log.e("Mindbox", c2, th);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c2);
        b2 = vl3.b(th);
        sb.append(b2);
        j(sb.toString());
    }

    public final qx1 h() {
        return e;
    }

    public void i(Object obj, String str) {
        z65.h(obj, "parent");
        z65.h(str, "message");
        String c2 = c(obj, str);
        if (f.i() <= ap5.INFO.i()) {
            Log.i("Mindbox", c2);
        }
        j(c2);
    }

    public void k(Object obj, String str, Throwable th) {
        String b2;
        z65.h(obj, "parent");
        z65.h(str, "message");
        z65.h(th, "exception");
        String c2 = c(obj, str);
        if (f.i() <= ap5.WARN.i()) {
            Log.w("Mindbox", c2, th);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c2);
        b2 = vl3.b(th);
        sb.append(b2);
        j(sb.toString());
    }
}
