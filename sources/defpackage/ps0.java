package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.ox1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: CashChargeInteractor.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lps0;", "Lox1;", "Los0;", "", "g", "Lwx;", "Lws0;", "a", "Lt41;", "Lt41;", "checkoutDetailsService", "Lfq0;", "b", "Lfq0;", "cartContentService", "Ljn6;", c.a, "Ljn6;", "moneyFactory", "Lmn6;", DateTokenConverter.CONVERTER_KEY, "Lmn6;", "moneyFormatterProvider", "<init>", "(Lt41;Lfq0;Ljn6;Lmn6;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ps0  reason: default package */
/* loaded from: classes4.dex */
public final class ps0 implements ox1, os0 {
    private final t41 a;
    private final fq0 b;
    private final jn6 c;
    private final mn6 d;

    /* compiled from: CashChargeInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lws0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.checkout.cashcharge.CashChargeInteractorImpl$getCashChargeVO$1", f = "CashChargeInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ps0$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function1<cv1<? super ws0>, Object> {
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
        public final Object invoke(cv1<? super ws0> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return new ws0(ps0.this.b.a().n(), (hn6) mh5.c(ps0.this.a.k().g().a(), ps0.this.c.b(0.0d)), "", ps0.this.g());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public ps0(t41 t41Var, fq0 fq0Var, jn6 jn6Var, mn6 mn6Var) {
        z65.h(t41Var, "checkoutDetailsService");
        z65.h(fq0Var, "cartContentService");
        z65.h(jn6Var, "moneyFactory");
        z65.h(mn6Var, "moneyFormatterProvider");
        this.a = t41Var;
        this.b = fq0Var;
        this.c = jn6Var;
        this.d = mn6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean g() {
        return this.d.a() instanceof ui8;
    }

    @Override // defpackage.os0
    public wx<ws0> a() {
        return f(new a(null));
    }

    public <T> wx<T> f(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }
}
