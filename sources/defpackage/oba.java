package defpackage;

import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.ox1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.data.dto.request.FeedbackBody;
import ru.dodopizza.app.domain.DodopizzaApi;
/* compiled from: SendFeedbackInteractor.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Loba;", "Lox1;", "", "feedback", "Lwx;", "", "Lcom/dodopizza/async/AsyncJob;", e.a, "Lava;", "a", "Lava;", "stateProvider", "Lru/dodopizza/app/domain/DodopizzaApi;", "b", "Lru/dodopizza/app/domain/DodopizzaApi;", "dodoPizzaApi", "Ldt5;", c.a, "Ldt5;", "locality", "<init>", "(Lava;Lru/dodopizza/app/domain/DodopizzaApi;Ldt5;)V", "contacts_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: oba  reason: default package */
/* loaded from: classes.dex */
public final class oba implements ox1 {
    private final ava a;
    private final DodopizzaApi b;
    private final dt5 c;

    /* compiled from: SendFeedbackInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.contacts.feature.feedback.presentation.SendFeedbackInteractor$sendFeedBack$1", f = "SendFeedbackInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: oba$a */
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function1<cv1<? super Unit>, Object> {
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
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                oba.this.b.sendFeedback(new FeedbackBody(oba.this.c.getId(), null, oba.this.a.e().getOrderPizzeriaId(), this.c));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public oba(ava avaVar, DodopizzaApi dodopizzaApi, dt5 dt5Var) {
        z65.h(avaVar, "stateProvider");
        z65.h(dodopizzaApi, "dodoPizzaApi");
        z65.h(dt5Var, "locality");
        this.a = avaVar;
        this.b = dodopizzaApi;
        this.c = dt5Var;
    }

    public wx<Unit> d(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }

    public final wx<Unit> e(String str) {
        z65.h(str, "feedback");
        return d(new a(str, null));
    }
}
