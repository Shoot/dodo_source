package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import defpackage.ox1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: OrderHistoryDetailsInteractor.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B9\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!\u0012\u0006\u0010(\u001a\u00020%¢\u0006\u0004\b)\u0010*J\u001a\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lme7;", "Lox1;", "Lle7;", "", "orderId", "Lwx;", "", "Lcom/dodopizza/async/AsyncJob;", "b", "orderNumber", "orderUUID", "", "positionInList", com.huawei.hms.opendevice.c.a, "Lae7;", "orderHistory", "a", "", "Lz21;", "getChecks", "Lli7;", "Lli7;", "orderService", "Lf8c;", "Lf8c;", "workflowIdProvider", "Lt52;", "Lt52;", "customerService", "Ldt5;", DateTokenConverter.CONVERTER_KEY, "Ldt5;", "currentLocality", "Lgc;", e.a, "Lgc;", "analytics", "Lm31;", "f", "Lm31;", "checkService", "<init>", "(Lli7;Lf8c;Lt52;Ldt5;Lgc;Lm31;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: me7  reason: default package */
/* loaded from: classes2.dex */
public final class me7 implements ox1, le7 {
    private final li7 a;
    private final f8c b;
    private final t52 c;
    private final dt5 d;
    private final gc e;
    private final m31 f;

    /* compiled from: OrderHistoryDetailsInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lz21;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.OrderHistoryDetailsInteractorImpl$getChecks$1", f = "OrderHistoryDetailsInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: me7$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function1<cv1<? super List<? extends z21>>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super List<z21>> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                me7.this.f.a(this.c);
                return me7.this.f.b();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderHistoryDetailsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.OrderHistoryDetailsInteractorImpl$repeatOrder$1", f = "OrderHistoryDetailsInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: me7$b */
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, cv1<? super b> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                me7.this.a.d(this.c, me7.this.b.b());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderHistoryDetailsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.OrderHistoryDetailsInteractorImpl$trackOpenOrderCard$1", f = "OrderHistoryDetailsInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: me7$c */
    /* loaded from: classes2.dex */
    static final class c extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ String d;
        final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, int i, cv1<? super c> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = str2;
            this.e = i;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(this.c, this.d, this.e, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                me7.this.e.a(new of7(me7.this.d.getName(), me7.this.c.f().i(), this.c, this.d, this.e));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderHistoryDetailsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.OrderHistoryDetailsInteractorImpl$trackRepeatOrder$1", f = "OrderHistoryDetailsInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: me7$d */
    /* loaded from: classes2.dex */
    static final class d extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ int c;
        final /* synthetic */ ae7 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i, ae7 ae7Var, cv1<? super d> cv1Var) {
            super(1, cv1Var);
            this.c = i;
            this.d = ae7Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                me7.this.e.a(new ig9(me7.this.d.getName(), me7.this.c.f().i(), this.c, this.d));
                me7.this.e.a(new gg9(this.c, rf7.b));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public me7(li7 li7Var, f8c f8cVar, t52 t52Var, dt5 dt5Var, gc gcVar, m31 m31Var) {
        z65.h(li7Var, "orderService");
        z65.h(f8cVar, "workflowIdProvider");
        z65.h(t52Var, "customerService");
        z65.h(dt5Var, "currentLocality");
        z65.h(gcVar, "analytics");
        z65.h(m31Var, "checkService");
        this.a = li7Var;
        this.b = f8cVar;
        this.c = t52Var;
        this.d = dt5Var;
        this.e = gcVar;
        this.f = m31Var;
    }

    @Override // defpackage.le7
    public wx<Unit> a(ae7 ae7Var, int i) {
        z65.h(ae7Var, "orderHistory");
        return j(new d(i, ae7Var, null));
    }

    @Override // defpackage.le7
    public wx<Unit> b(String str) {
        z65.h(str, "orderId");
        return k(new b(str, null));
    }

    @Override // defpackage.le7
    public wx<Unit> c(String str, String str2, int i) {
        z65.h(str, "orderNumber");
        z65.h(str2, "orderUUID");
        return j(new c(str, str2, i, null));
    }

    @Override // defpackage.le7
    public wx<List<z21>> getChecks(String str) {
        z65.h(str, "orderId");
        return j(new a(str, null));
    }

    public <T> wx<T> j(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> k(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }
}
