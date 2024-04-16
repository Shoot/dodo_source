package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.ox1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.data.dto.response.CheckAvailabilityResponse;
import ru.dodopizza.app.domain.DodopizzaApi;
/* compiled from: TemporarilyBlockInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"La9b;", "Lox1;", "Lwx;", "Lru/dodopizza/app/data/dto/response/CheckAvailabilityResponse;", c.a, "Lru/dodopizza/app/domain/DodopizzaApi;", "a", "Lru/dodopizza/app/domain/DodopizzaApi;", "dodoPizzaApi", "<init>", "(Lru/dodopizza/app/domain/DodopizzaApi;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: a9b  reason: default package */
/* loaded from: classes4.dex */
public final class a9b implements ox1 {
    private final DodopizzaApi a;

    /* compiled from: TemporarilyBlockInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/dodopizza/app/data/dto/response/CheckAvailabilityResponse;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.temporarilyblock.interactor.TemporarilyBlockInteractor$checkAvailability$1", f = "TemporarilyBlockInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: a9b$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function1<cv1<? super CheckAvailabilityResponse>, Object> {
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
        public final Object invoke(cv1<? super CheckAvailabilityResponse> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return a9b.this.a.checkAvailability();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public a9b(DodopizzaApi dodopizzaApi) {
        z65.h(dodopizzaApi, "dodoPizzaApi");
        this.a = dodopizzaApi;
    }

    public <T> wx<T> b(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public final wx<CheckAvailabilityResponse> c() {
        return b(new a(null));
    }
}
