package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.ox1;
import defpackage.pja;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: BuyMoreInteractor.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001b¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002J\u001e\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0002j\u0002`\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lui0;", "Lox1;", "Lwx;", "", "Lwi0;", "i", "", "items", "", "Lcom/dodopizza/async/AsyncJob;", "f", "Lsi0;", "a", "Lsi0;", "buyMoreInfo", "Lds0;", "b", "Lds0;", "cartService", "Luja;", c.a, "Luja;", "shoppingItemRepository", "Lsq0;", DateTokenConverter.CONVERTER_KEY, "Lsq0;", "cartItemDataFactory", "Lgc;", e.a, "Lgc;", "analytics", "<init>", "(Lsi0;Lds0;Luja;Lsq0;Lgc;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ui0  reason: default package */
/* loaded from: classes4.dex */
public final class ui0 implements ox1 {
    private final si0 a;
    private final ds0 b;
    private final uja c;
    private final sq0 d;
    private final gc e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyMoreInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.BuyMoreInteractor$addToCart$1", f = "BuyMoreInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ui0$a */
    /* loaded from: classes4.dex */
    public static final class a extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ List<String> b;
        final /* synthetic */ ui0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<String> list, ui0 ui0Var, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.b = list;
            this.c = ui0Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(this.b, this.c, cv1Var);
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
                ui0 ui0Var = this.c;
                for (String str : this.b) {
                    tja a = ui0Var.c.a(str);
                    if (a != null) {
                        ui0Var.b.a(ui0Var.d.a(new pja.d(a)));
                        ui0Var.e.a(new ei0(a));
                    }
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyMoreInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lwi0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.BuyMoreInteractor$buyMoreItems$1", f = "BuyMoreInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ui0$b */
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements Function1<cv1<? super List<? extends wi0>>, Object> {
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
        public final Object invoke(cv1<? super List<wi0>> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                List<vi0> a = ui0.this.a.a();
                w = lc1.w(a, 10);
                ArrayList arrayList = new ArrayList(w);
                for (vi0 vi0Var : a) {
                    arrayList.add(new wi0(vi0Var.G0(), vi0Var.getName(), vi0Var.h(), vi0Var.a()));
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public ui0(si0 si0Var, ds0 ds0Var, uja ujaVar, sq0 sq0Var, gc gcVar) {
        z65.h(si0Var, "buyMoreInfo");
        z65.h(ds0Var, "cartService");
        z65.h(ujaVar, "shoppingItemRepository");
        z65.h(sq0Var, "cartItemDataFactory");
        z65.h(gcVar, "analytics");
        this.a = si0Var;
        this.b = ds0Var;
        this.c = ujaVar;
        this.d = sq0Var;
        this.e = gcVar;
    }

    public final wx<Unit> f(List<String> list) {
        z65.h(list, "items");
        return h(new a(list, this, null));
    }

    public <T> wx<T> g(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> h(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }

    public final wx<List<wi0>> i() {
        return g(new b(null));
    }
}
