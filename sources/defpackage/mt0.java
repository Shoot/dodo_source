package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.ox1;
import defpackage.y6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.domain.DodopizzaApi;
/* compiled from: CatchAddressInteractor.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0007j\u0002`\f2\u0006\u0010\n\u001a\u00020\bH\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lmt0;", "Llt0;", "Lox1;", "", "id", "", "isDeliveryScreen", "Lwx;", "Lw6;", "b", "address", "", "Lcom/dodopizza/async/AsyncJob;", "a", "Lru/dodopizza/app/domain/DodopizzaApi;", "Lru/dodopizza/app/domain/DodopizzaApi;", "dodopizzaApi", "Lx42;", "Lx42;", "customerAddressService", "Lgc;", c.a, "Lgc;", "analytics", "Lh8;", DateTokenConverter.CONVERTER_KEY, "Lh8;", "addressFormatter", "Lvg7;", e.a, "Lvg7;", "orderPizzeriaStateService", "<init>", "(Lru/dodopizza/app/domain/DodopizzaApi;Lx42;Lgc;Lh8;Lvg7;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: mt0  reason: default package */
/* loaded from: classes4.dex */
public class mt0 implements lt0, ox1 {
    private final DodopizzaApi a;
    private final x42 b;
    private final gc c;
    private final h8 d;
    private final vg7 e;

    /* compiled from: CatchAddressInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lw6;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.catchaddress.interactor.CatchAddressInteractorImpl$getAddressById$1", f = "CatchAddressInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: mt0$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function1<cv1<? super w6>, Object> {
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
        public final Object invoke(cv1<? super w6> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return mt0.this.b.d(this.c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: CatchAddressInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.catchaddress.interactor.CatchAddressInteractorImpl$subscribeSms$1", f = "CatchAddressInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: mt0$b */
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ w6 b;
        final /* synthetic */ mt0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(w6 w6Var, mt0 mt0Var, cv1<? super b> cv1Var) {
            super(1, cv1Var);
            this.b = w6Var;
            this.c = mt0Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(this.b, this.c, cv1Var);
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
                this.c.a.subscribeOpenDeliveryAddress(j9.a(this.b));
                this.c.c.a(new y6.a(this.c.d.b(this.b)));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public mt0(DodopizzaApi dodopizzaApi, x42 x42Var, gc gcVar, h8 h8Var, vg7 vg7Var) {
        z65.h(dodopizzaApi, "dodopizzaApi");
        z65.h(x42Var, "customerAddressService");
        z65.h(gcVar, "analytics");
        z65.h(h8Var, "addressFormatter");
        z65.h(vg7Var, "orderPizzeriaStateService");
        this.a = dodopizzaApi;
        this.b = x42Var;
        this.c = gcVar;
        this.d = h8Var;
        this.e = vg7Var;
    }

    @Override // defpackage.lt0
    public wx<Unit> a(w6 w6Var) {
        z65.h(w6Var, "address");
        return h(new b(w6Var, this, null));
    }

    @Override // defpackage.lt0
    public wx<w6> b(String str, boolean z) {
        z65.h(str, "id");
        return g(new a(str, null));
    }

    public <T> wx<T> g(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> h(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }
}
