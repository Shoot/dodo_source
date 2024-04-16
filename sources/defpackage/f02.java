package defpackage;

import defpackage.ox1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: CovidWarningInteractor.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lf02;", "Le02;", "Lox1;", "Lwx;", "Lk02;", "a", "Lyz1;", "Lyz1;", "covidService", "<init>", "(Lyz1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: f02  reason: default package */
/* loaded from: classes4.dex */
public final class f02 implements e02, ox1 {
    private final yz1 a;

    /* compiled from: CovidWarningInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lk02;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.covid.CovidWarningInteractorImpl$getCovidWarningVO$1", f = "CovidWarningInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: f02$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function1<cv1<? super k02>, Object> {
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
        public final Object invoke(cv1<? super k02> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                d02 a = f02.this.a.a();
                return new k02(a.c(), a.b(), a.a());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public f02(yz1 yz1Var) {
        z65.h(yz1Var, "covidService");
        this.a = yz1Var;
    }

    @Override // defpackage.e02
    public wx<k02> a() {
        return c(new a(null));
    }

    public <T> wx<T> c(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }
}
