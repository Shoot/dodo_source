package defpackage;

import defpackage.atb;
import defpackage.lsb;
import defpackage.ox1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: UpsaleInteractor.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u0005H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003H\u0016J4\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u00040\u0003j\u0002`\u00052\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n0\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u001c"}, d2 = {"Lssb;", "Lrsb;", "Lox1;", "Lwx;", "", "Lcom/dodopizza/async/AsyncJob;", com.huawei.hms.opendevice.c.a, "Lltb;", "a", "", "Lkotlin/Pair;", "", "Latb$a;", "shownProducts", "Lnsb;", "upsaleInfo", "b", "Ltsb;", "Ltsb;", "upsaleItemsService", "Lktb;", "Lktb;", "upsaleStateService", "Lgc;", "Lgc;", "analytics", "<init>", "(Ltsb;Lktb;Lgc;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ssb  reason: default package */
/* loaded from: classes2.dex */
public final class ssb implements rsb, ox1 {
    private final tsb a;
    private final ktb b;
    private final gc c;

    /* compiled from: UpsaleInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.upsell.presentation.UpsaleInteractorImpl$addUpsale$1", f = "UpsaleInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ssb$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function1<cv1<? super Unit>, Object> {
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
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ssb.this.b.d();
                ssb.this.c.a(lsb.a.a);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: UpsaleInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lltb;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.upsell.presentation.UpsaleInteractorImpl$getUpsaleVO$1", f = "UpsaleInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ssb$b */
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function1<cv1<? super ltb>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super ltb> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ksb a = ssb.this.a.a();
                Collection<zsb> b = a.b();
                w = lc1.w(b, 10);
                ArrayList arrayList = new ArrayList(w);
                for (zsb zsbVar : b) {
                    arrayList.add(usb.e(zsbVar));
                }
                return new ltb(arrayList, a.a());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: UpsaleInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.upsell.presentation.UpsaleInteractorImpl$trackUpsaleShown$1", f = "UpsaleInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ssb$c */
    /* loaded from: classes2.dex */
    static final class c extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ List<Pair<Integer, atb.a>> c;
        final /* synthetic */ nsb d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List<Pair<Integer, atb.a>> list, nsb nsbVar, cv1<? super c> cv1Var) {
            super(1, cv1Var);
            this.c = list;
            this.d = nsbVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                gc gcVar = ssb.this.c;
                List<Pair<Integer, atb.a>> list = this.c;
                w = lc1.w(list, 10);
                ArrayList arrayList = new ArrayList(w);
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    arrayList.add(lnb.a(pair.c(), usb.d((atb.a) pair.d())));
                }
                gcVar.a(new lsb.c(arrayList, this.d.c(), this.d.d()));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public ssb(tsb tsbVar, ktb ktbVar, gc gcVar) {
        z65.h(tsbVar, "upsaleItemsService");
        z65.h(ktbVar, "upsaleStateService");
        z65.h(gcVar, "analytics");
        this.a = tsbVar;
        this.b = ktbVar;
        this.c = gcVar;
    }

    @Override // defpackage.rsb
    public wx<ltb> a() {
        return g(new b(null));
    }

    @Override // defpackage.rsb
    public wx<Unit> b(List<Pair<Integer, atb.a>> list, nsb nsbVar) {
        z65.h(list, "shownProducts");
        z65.h(nsbVar, "upsaleInfo");
        return h(new c(list, nsbVar, null));
    }

    @Override // defpackage.rsb
    public wx<Unit> c() {
        return h(new a(null));
    }

    public <T> wx<T> g(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> h(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }
}
