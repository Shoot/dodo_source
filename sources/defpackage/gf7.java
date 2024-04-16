package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import defpackage.ox1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: OrderHistoryInteractor.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b(\u0010)J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u0016J\u001a\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\t0\u0003j\u0002`\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u001a\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\t0\u0003j\u0002`\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\"\u0010\u0012\u001a\f\u0012\u0004\u0012\u00020\t0\u0003j\u0002`\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fH\u0016R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, d2 = {"Lgf7;", "Lff7;", "Lox1;", "Lwx;", "", "Lye7;", "getHistory", "", "orderId", "", "Lcom/dodopizza/async/AsyncJob;", "b", "", "ordersCount", com.huawei.hms.opendevice.c.a, "Lae7;", "orderHistory", "positionInList", "a", "Lsf7;", "Lsf7;", "orderHistoryService", "Lli7;", "Lli7;", "orderService", "Lf8c;", "Lf8c;", "workflowIdProvider", "Lt52;", DateTokenConverter.CONVERTER_KEY, "Lt52;", "customerService", "Ldt5;", e.a, "Ldt5;", "currentLocality", "Lgc;", "f", "Lgc;", "analytics", "<init>", "(Lsf7;Lli7;Lf8c;Lt52;Ldt5;Lgc;)V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gf7  reason: default package */
/* loaded from: classes2.dex */
public final class gf7 implements ff7, ox1 {
    private final sf7 a;
    private final li7 b;
    private final f8c c;
    private final t52 d;
    private final dt5 e;
    private final gc f;

    /* compiled from: OrderHistoryInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lye7;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistory.OrderHistoryInteractorImpl$getHistory$1", f = "OrderHistoryInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: gf7$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function1<cv1<? super List<? extends ye7>>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super List<ye7>> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Collection<ae7> history = gf7.this.a.getHistory();
                w = lc1.w(history, 10);
                ArrayList arrayList = new ArrayList(w);
                for (ae7 ae7Var : history) {
                    arrayList.add(new ye7(ae7Var));
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderHistoryInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistory.OrderHistoryInteractorImpl$repeatOrder$1", f = "OrderHistoryInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: gf7$b */
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
                gf7.this.b.d(this.c, gf7.this.c.b());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderHistoryInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistory.OrderHistoryInteractorImpl$trackOrderHistoryOpen$1", f = "OrderHistoryInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: gf7$c */
    /* loaded from: classes2.dex */
    static final class c extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i, cv1<? super c> cv1Var) {
            super(1, cv1Var);
            this.c = i;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(this.c, cv1Var);
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
                gf7.this.f.a(new nf7(gf7.this.e.getName(), gf7.this.d.f().i(), this.c));
                gf7.this.f.a(new ex9(this.c, ck1.q));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: OrderHistoryInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistory.OrderHistoryInteractorImpl$trackRepeatOrder$1", f = "OrderHistoryInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: gf7$d */
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
                gf7.this.f.a(new hg9(gf7.this.e.getName(), gf7.this.d.f().i(), this.c, this.d));
                gf7.this.f.a(new gg9(this.c, rf7.c));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public gf7(sf7 sf7Var, li7 li7Var, f8c f8cVar, t52 t52Var, dt5 dt5Var, gc gcVar) {
        z65.h(sf7Var, "orderHistoryService");
        z65.h(li7Var, "orderService");
        z65.h(f8cVar, "workflowIdProvider");
        z65.h(t52Var, "customerService");
        z65.h(dt5Var, "currentLocality");
        z65.h(gcVar, "analytics");
        this.a = sf7Var;
        this.b = li7Var;
        this.c = f8cVar;
        this.d = t52Var;
        this.e = dt5Var;
        this.f = gcVar;
    }

    @Override // defpackage.ff7
    public wx<Unit> a(ae7 ae7Var, int i) {
        z65.h(ae7Var, "orderHistory");
        return k(new d(i, ae7Var, null));
    }

    @Override // defpackage.ff7
    public wx<Unit> b(String str) {
        z65.h(str, "orderId");
        return k(new b(str, null));
    }

    @Override // defpackage.ff7
    public wx<Unit> c(int i) {
        return k(new c(i, null));
    }

    @Override // defpackage.ff7
    public wx<List<ye7>> getHistory() {
        return j(new a(null));
    }

    public <T> wx<T> j(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> k(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }
}
