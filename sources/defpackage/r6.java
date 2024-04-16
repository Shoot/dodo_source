package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.StateErrorEntity;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.ox1;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.data.dto.request.StateRequest;
import ru.dodopizza.app.domain.DodopizzaApi;
import ru.dodopizza.app.domain.exceptions.SetDeliveryException;
/* compiled from: AddAddressInteractor.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001b\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lr6;", "Lox1;", "Lw6;", "address", "Lwx;", "", "g", "Lava;", "a", "Lava;", "stateProvider", "Ldua;", "b", "Ldua;", "stateAnalyzer", "Lj9a;", c.a, "Lj9a;", "selectedAddressState", "Lru/dodopizza/app/domain/DodopizzaApi;", DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/app/domain/DodopizzaApi;", "dodoPizzaApi", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", e.a, "Lorg/slf4j/Logger;", "logger", "<init>", "(Lava;Ldua;Lj9a;Lru/dodopizza/app/domain/DodopizzaApi;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: r6  reason: default package */
/* loaded from: classes4.dex */
public final class r6 implements ox1 {
    private final ava a;
    private final dua b;
    private final j9a c;
    private final DodopizzaApi d;
    private final Logger e;

    /* compiled from: AddAddressInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.deliveryaddress.AddAddressInteractor$isNeedCatch$1", f = "AddAddressInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: r6$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function1<cv1<? super Boolean>, Object> {
        int a;
        final /* synthetic */ w6 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w6 w6Var, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.c = w6Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Boolean> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            StateErrorEntity stateErrorEntity;
            boolean z;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                StateEntity e = r6.this.a.e();
                r6.this.c.h(this.c);
                try {
                    Iterator<StateErrorEntity> it = r6.this.b.d(r6.this.d.setAddress(new StateRequest(e, j9.a(this.c), ""))).getErrors().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            stateErrorEntity = it.next();
                            Integer errorCode = stateErrorEntity.getErrorCode();
                            if (errorCode != null && errorCode.intValue() == 211) {
                                break;
                            }
                        } else {
                            stateErrorEntity = null;
                            break;
                        }
                    }
                    if (stateErrorEntity != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return nf0.a(z);
                } catch (Exception e2) {
                    r6.this.e.error("Failed to set delivery address", (Throwable) e2);
                    throw new SetDeliveryException(e2);
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public r6(ava avaVar, dua duaVar, j9a j9aVar, DodopizzaApi dodopizzaApi) {
        z65.h(avaVar, "stateProvider");
        z65.h(duaVar, "stateAnalyzer");
        z65.h(j9aVar, "selectedAddressState");
        z65.h(dodopizzaApi, "dodoPizzaApi");
        this.a = avaVar;
        this.b = duaVar;
        this.c = j9aVar;
        this.d = dodopizzaApi;
        this.e = LoggerFactory.getLogger("AddAddressInteractor");
    }

    public <T> wx<T> f(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public final wx<Boolean> g(w6 w6Var) {
        z65.h(w6Var, "address");
        return f(new a(w6Var, null));
    }
}
