package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import defpackage.et7;
import defpackage.jw7;
import defpackage.ox1;
import defpackage.zw9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: PaymentMethodListInteractor.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001e\u001a\u00020\u001c\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010+\u001a\u00020(¢\u0006\u0004\b,\u0010-J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J.\u0010\u0010\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000f0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\"\u0010\u0015\u001a\f\u0012\u0004\u0012\u00020\u00130\tj\u0002`\u00142\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\u0016\u001a\u00020\rH\u0016J\u0012\u0010\u0018\u001a\f\u0012\u0004\u0012\u00020\u00130\tj\u0002`\u0014H\u0016R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"Lpt7;", "Lot7;", "Lox1;", "Ljw7;", "", "isSelected", "isCarryoutOrRestaurant", "Let7$c;", "o", "Lwx;", "Lvt7;", DateTokenConverter.CONVERTER_KEY, "", "", "cardIds", "Lkotlin/Pair;", com.huawei.hms.opendevice.c.a, "email", "needToSubscribeToNews", "", "Lcom/dodopizza/async/AsyncJob;", com.huawei.hms.push.e.a, "taxPayerId", "b", "a", "Lt41;", "Lt41;", "checkoutDetailsService", "Lew7;", "Lew7;", "paymentService", "Lt52;", "Lt52;", "customerService", "Lz7b;", "Lz7b;", "taxPayerIdService", "Lgc;", "Lgc;", "analytics", "Lvg7;", "f", "Lvg7;", "orderPizzeriaStateService", "<init>", "(Lt41;Lew7;Lt52;Lz7b;Lgc;Lvg7;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: pt7  reason: default package */
/* loaded from: classes4.dex */
public final class pt7 implements ot7, ox1 {
    private final t41 a;
    private final ew7 b;
    private final t52 c;
    private final z7b d;
    private final gc e;
    private final vg7 f;

    /* compiled from: PaymentMethodListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@"}, d2 = {"Lkotlin/Pair;", "", "", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListInteractorImpl$removeCards$1", f = "PaymentMethodListInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pt7$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function1<cv1<? super Pair<? extends Boolean, ? extends List<? extends String>>>, Object> {
        int a;
        final /* synthetic */ List<String> b;
        final /* synthetic */ pt7 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<String> list, pt7 pt7Var, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.b = list;
            this.c = pt7Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(this.b, this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Pair<Boolean, ? extends List<String>>> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            boolean z;
            int w2;
            Pair pair;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                List<String> list = this.b;
                pt7 pt7Var = this.c;
                w = lc1.w(list, 10);
                ArrayList<Pair> arrayList = new ArrayList(w);
                Iterator<T> it = list.iterator();
                while (true) {
                    z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    String str = (String) it.next();
                    try {
                        pt7Var.b.b(str);
                        pair = new Pair(nf0.a(true), str);
                    } catch (Exception unused) {
                        pair = new Pair(nf0.a(false), str);
                    }
                    arrayList.add(pair);
                }
                if (!arrayList.isEmpty()) {
                    for (Pair pair2 : arrayList) {
                        if (!((Boolean) pair2.a()).booleanValue()) {
                            break;
                        }
                    }
                }
                z = true;
                ArrayList<Pair> arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((Boolean) ((Pair) obj2).a()).booleanValue()) {
                        arrayList2.add(obj2);
                    }
                }
                w2 = lc1.w(arrayList2, 10);
                ArrayList arrayList3 = new ArrayList(w2);
                for (Pair pair3 : arrayList2) {
                    arrayList3.add((String) pair3.b());
                }
                return new Pair(nf0.a(z), arrayList3);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PaymentMethodListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lvt7;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListInteractorImpl$requestPaymentMethodListData$1", f = "PaymentMethodListInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pt7$b */
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function1<cv1<? super vt7>, Object> {
        int a;
        final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z, cv1<? super b> cv1Var) {
            super(1, cv1Var);
            this.c = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super vt7> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                jw7 b = pt7.this.a.k().g().b();
                String str = (b == null || (str = b.getId()) == null) ? "" : "";
                n42 f = pt7.this.c.f();
                String c = pt7.this.d.c();
                Collection<jw7> a = pt7.this.b.a();
                pt7 pt7Var = pt7.this;
                boolean z = this.c;
                w = lc1.w(a, 10);
                ArrayList arrayList = new ArrayList(w);
                for (jw7 jw7Var : a) {
                    arrayList.add(pt7Var.o(jw7Var, z65.c(jw7Var.getId(), str), z));
                }
                pt7 pt7Var2 = pt7.this;
                return new vt7(arrayList, new et7.b(f.g(), f.n()), pt7Var2.c.r(), new et7.d(c), pt7Var2.d.a());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PaymentMethodListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListInteractorImpl$trackPaymentMethodListScreen$1", f = "PaymentMethodListInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pt7$c */
    /* loaded from: classes4.dex */
    static final class c extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(cv1Var);
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
                pt7.this.e.a(new zw9.i(pt7.this.f.e()));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PaymentMethodListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListInteractorImpl$updateEmailSubscription$1", f = "PaymentMethodListInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pt7$d */
    /* loaded from: classes4.dex */
    static final class d extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, boolean z, cv1<? super d> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = z;
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
                pt7.this.c.v(this.c);
                pt7.this.c.x(this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: PaymentMethodListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.paymentwaylist.PaymentMethodListInteractorImpl$updateTaxPayerId$1", f = "PaymentMethodListInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pt7$e */
    /* loaded from: classes4.dex */
    static final class e extends f3b implements Function1<cv1<? super String>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, cv1<? super e> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new e(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super String> cv1Var) {
            return ((e) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return pt7.this.d.b(this.c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public pt7(t41 t41Var, ew7 ew7Var, t52 t52Var, z7b z7bVar, gc gcVar, vg7 vg7Var) {
        z65.h(t41Var, "checkoutDetailsService");
        z65.h(ew7Var, "paymentService");
        z65.h(t52Var, "customerService");
        z65.h(z7bVar, "taxPayerIdService");
        z65.h(gcVar, "analytics");
        z65.h(vg7Var, "orderPizzeriaStateService");
        this.a = t41Var;
        this.b = ew7Var;
        this.c = t52Var;
        this.d = z7bVar;
        this.e = gcVar;
        this.f = vg7Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final et7.c o(jw7 jw7Var, boolean z, boolean z2) {
        if (jw7Var instanceof jw7.c) {
            return new et7.c.a(jw7Var, z2, z);
        }
        return new et7.c.b(jw7Var, z2, z);
    }

    @Override // defpackage.ot7
    public wx<Unit> a() {
        return n(new c(null));
    }

    @Override // defpackage.ot7
    public wx<String> b(String str) {
        z65.h(str, "taxPayerId");
        return m(new e(str, null));
    }

    @Override // defpackage.ot7
    public wx<Pair<Boolean, List<String>>> c(List<String> list) {
        z65.h(list, "cardIds");
        return m(new a(list, this, null));
    }

    @Override // defpackage.ot7
    public wx<vt7> d(boolean z) {
        return m(new b(z, null));
    }

    @Override // defpackage.ot7
    public wx<Unit> e(String str, boolean z) {
        z65.h(str, "email");
        return n(new d(str, z, null));
    }

    public <T> wx<T> m(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> n(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }
}
