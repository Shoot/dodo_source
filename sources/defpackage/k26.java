package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import defpackage.ox1;
import defpackage.rq0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: LoyaltyProductsInteractor.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0018\u0010\t\u001a\f\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\b2\u0006\u0010\u0006\u001a\u00020\u0005R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lk26;", "Lox1;", "Lwx;", "Lm26;", "g", "", ShoppingInfoEntity.FIELD_SHOPPING_ID, "", "Lcom/dodopizza/async/AsyncJob;", DateTokenConverter.CONVERTER_KEY, "Lh26;", "a", "Lh26;", "loyaltyProductsData", "Lmxa;", "b", "Lmxa;", "stopRepository", "Lds0;", c.a, "Lds0;", "cartService", "<init>", "(Lh26;Lmxa;Lds0;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: k26  reason: default package */
/* loaded from: classes2.dex */
public final class k26 implements ox1 {
    private final h26 a;
    private final mxa b;
    private final ds0 c;

    /* compiled from: LoyaltyProductsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.products.presentation.LoyaltyProductsInteractor$addProductToCart$1", f = "LoyaltyProductsInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: k26$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String b;
        final /* synthetic */ k26 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, k26 k26Var, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.b = str;
            this.c = k26Var;
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
                this.c.c.a(new rq0.a("", "", 0, "", 0, "", kn6.f(), this.b, "", false, null, null, null, null, 0, 24064, null));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LoyaltyProductsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lm26;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.products.presentation.LoyaltyProductsInteractor$getLoyaltyProducts$1", f = "LoyaltyProductsInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: k26$b */
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function1<cv1<? super m26>, Object> {
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
        public final Object invoke(cv1<? super m26> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            boolean z;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                double d = k26.this.a.d();
                Collection<String> b = k26.this.b.b();
                double b2 = k26.this.a.b();
                String a = k26.this.a.a();
                boolean c = k26.this.a.c();
                rba i = k26.this.a.i();
                hn6 f = k26.this.a.f();
                List<y16> e = k26.this.a.e();
                k26 k26Var = k26.this;
                w = lc1.w(e, 10);
                ArrayList arrayList = new ArrayList(w);
                for (y16 y16Var : e) {
                    boolean contains = b.contains(y16Var.t());
                    String G0 = y16Var.G0();
                    String name = y16Var.getName();
                    String a2 = y16Var.a();
                    tl8 b3 = y16Var.b();
                    double b4 = k26Var.a.b();
                    if (k26Var.a.b() <= d) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new e26(contains, G0, name, a2, b3, b4, z));
                }
                return new m26(d, b2, f, a, c, i, arrayList);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public k26(h26 h26Var, mxa mxaVar, ds0 ds0Var) {
        z65.h(h26Var, "loyaltyProductsData");
        z65.h(mxaVar, "stopRepository");
        z65.h(ds0Var, "cartService");
        this.a = h26Var;
        this.b = mxaVar;
        this.c = ds0Var;
    }

    public final wx<Unit> d(String str) {
        z65.h(str, ShoppingInfoEntity.FIELD_SHOPPING_ID);
        return f(new a(str, this, null));
    }

    public <T> wx<T> e(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> f(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }

    public final wx<m26> g() {
        return e(new b(null));
    }
}
