package ru.dodopizza.app.presentation.mainscreen;

import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.kp7;
import defpackage.ox1;
import defpackage.tmb;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.mindbox.model.MindboxProperties;
/* compiled from: MainScreenInteractor.kt */
@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB¯\u0001\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010;\u001a\u000208\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010C\u001a\u00020@\u0012\f\u0010H\u001a\b\u0012\u0004\u0012\u00020E0D\u0012\u0006\u0010L\u001a\u00020I\u0012\f\u0010O\u001a\b\u0012\u0004\u0012\u00020M0D\u0012\u0006\u0010S\u001a\u00020P\u0012\u0006\u0010W\u001a\u00020T\u0012\u0006\u0010[\u001a\u00020X\u0012\u0006\u0010_\u001a\u00020\\\u0012\u0006\u0010c\u001a\u00020`\u0012\b\b\u0001\u0010g\u001a\u00020d¢\u0006\u0004\br\u0010sJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\n\u001a\u00020\u0005J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0005J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\u0006\u0010\u0010\u001a\u00020\u0005J\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0013\u001a\u00020\u0005J\u0010\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001b\u001a\u00020\u001aH\u0086@¢\u0006\u0004\b\u001b\u0010\u0017R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020E0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001a\u0010O\u001a\b\u0012\u0004\u0012\u00020M0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010GR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001c\u0010k\u001a\n i*\u0004\u0018\u00010h0h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010jR\u001c\u0010n\u001a\n i*\u0004\u0018\u00010E0E8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u001c\u0010q\u001a\n i*\u0004\u0018\u00010M0M8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010p¨\u0006t"}, d2 = {"Lru/dodopizza/app/presentation/mainscreen/a;", "Lox1;", "Lwx;", "", "v", "", "menuItemId", "selectedProducts", "Lqd6;", "x", "specialOfferId", "Lce0;", "C", "personalOfferId", "Lp08;", "B", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "Lkp7;", "E", "orderId", "A", "", "D", "(Lcv1;)Ljava/lang/Object;", "Lru/dodopizza/mindbox/model/MindboxProperties;", "y", "Lru/dodopizza/app/presentation/mainscreen/a$a;", "t", "Lfq0;", "a", "Lfq0;", "cartContentService", "Lc62;", "b", "Lc62;", "customizationService", "Lah6;", com.huawei.hms.opendevice.c.a, "Lah6;", "menuService", "Lqra;", DateTokenConverter.CONVERTER_KEY, "Lqra;", "specialOfferService", "Lhq3;", com.huawei.hms.push.e.a, "Lhq3;", "featureService", "Li00;", "f", "Li00;", "authorizationState", "Lava;", "g", "Lava;", "stateProvider", "Ldua;", Image.TYPE_HIGH, "Ldua;", "stateAnalyzer", "Lbo;", "i", "Lbo;", "appInitializationStateProvider", "Ldt5;", "j", "Ldt5;", "locality", "Las8;", "Lay1;", "k", "Las8;", "countryProvider", "Lt52;", "l", "Lt52;", "customerService", "Lcl6;", Image.TYPE_MEDIUM, "mindboxServiceProvider", "Lu2c;", "n", "Lu2c;", "waitForPaidOrderService", "Lli7;", "o", "Lli7;", "orderService", "Ll08;", "p", "Ll08;", "personalOfferConverter", "Lut8;", "q", "Lut8;", "pushTokenProvider", "Leh6;", "r", "Leh6;", "menuUpdateInteractor", "Lkx1;", Image.TYPE_SMALL, "Lkx1;", "ioDispatcher", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "w", "()Lay1;", tmb.c.COUNTRY_JSON_NAME, "z", "()Lcl6;", "mindboxService", "<init>", "(Lfq0;Lc62;Lah6;Lqra;Lhq3;Li00;Lava;Ldua;Lbo;Ldt5;Las8;Lt52;Las8;Lu2c;Lli7;Ll08;Lut8;Leh6;Lkx1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class a implements ox1 {
    private final fq0 a;
    private final c62 b;
    private final ah6 c;
    private final qra d;
    private final hq3 e;
    private final i00 f;
    private final ava g;
    private final dua h;
    private final bo i;
    private final dt5 j;
    private final as8<ay1> k;
    private final t52 l;
    private final as8<cl6> m;
    private final u2c n;
    private final li7 o;
    private final l08 p;
    private final ut8 q;
    private final eh6 r;
    private final kx1 s;
    private final Logger t;

    /* compiled from: MainScreenInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/presentation/mainscreen/a$a;", "", "a", "b", com.huawei.hms.opendevice.c.a, "Lru/dodopizza/app/presentation/mainscreen/a$a$b;", "Lru/dodopizza/app/presentation/mainscreen/a$a$c;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.mainscreen.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0577a {
        public static final C0578a a = C0578a.a;

        /* compiled from: MainScreenInteractor.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/mainscreen/a$a$a;", "", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "stateEntity", "Lru/dodopizza/app/presentation/mainscreen/a$a$c;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ru.dodopizza.app.presentation.mainscreen.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0578a {
            static final /* synthetic */ C0578a a = new C0578a();

            private C0578a() {
            }

            public final c a(StateEntity stateEntity) {
                boolean z;
                Integer step;
                z65.h(stateEntity, "stateEntity");
                if (stateEntity.getPlacedOrderId() == null && ((step = stateEntity.getStep()) == null || step.intValue() != 3)) {
                    z = false;
                } else {
                    z = true;
                }
                return new c(z, stateEntity.getWorkflowId());
            }
        }

        /* compiled from: MainScreenInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/dodopizza/app/presentation/mainscreen/a$a$b;", "Lru/dodopizza/app/presentation/mainscreen/a$a;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ru.dodopizza.app.presentation.mainscreen.a$a$b */
        /* loaded from: classes4.dex */
        public static final class b implements InterfaceC0577a {
            public static final b b = new b();

            private b() {
            }
        }

        /* compiled from: MainScreenInteractor.kt */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lru/dodopizza/app/presentation/mainscreen/a$a$c;", "Lru/dodopizza/app/presentation/mainscreen/a$a;", "", "toString", "", "hashCode", "", "other", "", "equals", "b", "Z", "()Z", "isWaitForPaidOrder", com.huawei.hms.opendevice.c.a, "Ljava/lang/String;", "a", "()Ljava/lang/String;", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "<init>", "(ZLjava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ru.dodopizza.app.presentation.mainscreen.a$a$c */
        /* loaded from: classes4.dex */
        public static final class c implements InterfaceC0577a {
            private final boolean b;
            private final String c;

            public c(boolean z, String str) {
                z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
                this.b = z;
                this.c = str;
            }

            public final String a() {
                return this.c;
            }

            public final boolean b() {
                return this.b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                if (this.b == cVar.b && z65.c(this.c, cVar.c)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (a91.a(this.b) * 31) + this.c.hashCode();
            }

            public String toString() {
                boolean z = this.b;
                String str = this.c;
                return "Success(isWaitForPaidOrder=" + z + ", workflowId=" + str + ")";
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lru/dodopizza/app/presentation/mainscreen/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenInteractor$actualizeStateAndMenu$2", f = "MainScreenInteractor.kt", l = {SyslogConstants.LOG_LOCAL6}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements Function2<qx1, cv1<? super InterfaceC0577a>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super InterfaceC0577a> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                bo boVar = a.this.i;
                this.a = 1;
                if (co.b(boVar, this) == d) {
                    return d;
                }
            }
            try {
                StateEntity c = a.this.h.c();
                a.this.r.r(fb8.d.a(a.this.j, c.getSelectedPizzeriaId()), jua.c(c));
                return InterfaceC0577a.a.a(c);
            } catch (Exception e) {
                a.this.r.r(fb8.d.a(a.this.j, null), jk7.e);
                a.this.t.error("Failed to actualize state", (Throwable) e);
                return InterfaceC0577a.b.b;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenInteractor$getCartGoodsCount$1", f = "MainScreenInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function1<cv1<? super Integer>, Object> {
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
        public final Object invoke(cv1<? super Integer> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return nf0.c(a.this.a.a().o());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lqd6;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenInteractor$getMenuItem$1", f = "MainScreenInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d extends f3b implements Function1<cv1<? super qd6>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2, cv1<? super d> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super qd6> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            List y0;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                qd6 a = a.this.c.a(this.c);
                if (a == null) {
                    a = a.this.c.o(this.c);
                }
                if (a != null && this.d.length() > 0) {
                    y0 = m0b.y0(this.d, new String[]{","}, false, 0, 6, null);
                    a.this.b.i(a.f(), y0);
                }
                String str = this.c;
                return mh5.b(a, "Menu item with id=" + str + " not found");
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lru/dodopizza/mindbox/model/MindboxProperties;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenInteractor$getMindboxProps$2", f = "MainScreenInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends f3b implements Function2<qx1, cv1<? super MindboxProperties>, Object> {
        int a;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new e(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super MindboxProperties> cv1Var) {
            return ((e) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return a.this.z().e();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenInteractor$getOrderType$1", f = "MainScreenInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class f extends f3b implements Function1<cv1<? super Integer>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, cv1<? super f> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new f(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Integer> cv1Var) {
            return ((f) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                bc7 g = a.this.o.g(this.c);
                String str = this.c;
                return nf0.c(((bc7) mh5.b(g, "Order with id " + str + " not found")).E());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lp08;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenInteractor$getPersonalOfferData$1", f = "MainScreenInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g extends f3b implements Function1<cv1<? super p08>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, cv1<? super g> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new g(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super p08> cv1Var) {
            return ((g) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            p67 p67Var;
            String str;
            boolean y;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                boolean b = a.this.f.b();
                if (b && (str = this.c) != null) {
                    y = l0b.y(str);
                    if (!y) {
                        String str2 = this.c;
                        for (zz7 zz7Var : a.this.l.k()) {
                            if (z65.c(zz7Var.f(), str2)) {
                                p67Var = a.this.p.a(zz7Var);
                                return new p08(b, p67Var);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                p67Var = null;
                return new p08(b, p67Var);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lce0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenInteractor$getSpecialOffer$1", f = "MainScreenInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h extends f3b implements Function1<cv1<? super ce0>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, cv1<? super h> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new h(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super ce0> cv1Var) {
            return ((h) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                String str = this.c;
                for (Object obj2 : a.this.d.a(a.this.j.getId(), jua.c(a.this.g.e()), a.this.g.e().getOrderPizzeriaId())) {
                    if (z65.c(((ce0) obj2).getId(), str)) {
                        return obj2;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenInteractor$registerMindbox$2", f = "MainScreenInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class i extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        i(cv1<? super i> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new i(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((i) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                a.this.z().a(a.this.q.a());
                if (a.this.f.b()) {
                    a.this.z().b(a.this.j.getName(), a.this.w().getName());
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MainScreenInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lkp7;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.mainscreen.MainScreenInteractor$waitForPaidOrder$1", f = "MainScreenInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class j extends f3b implements Function1<cv1<? super kp7>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, cv1<? super j> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new j(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super kp7> cv1Var) {
            return ((j) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (!a.this.e.a(bq3.V4) && !a.this.e.a(bq3.l5)) {
                    return kp7.c.a;
                }
                return a.this.n.a(this.c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public a(fq0 fq0Var, c62 c62Var, ah6 ah6Var, qra qraVar, hq3 hq3Var, i00 i00Var, ava avaVar, dua duaVar, bo boVar, dt5 dt5Var, as8<ay1> as8Var, t52 t52Var, as8<cl6> as8Var2, u2c u2cVar, li7 li7Var, l08 l08Var, ut8 ut8Var, eh6 eh6Var, kx1 kx1Var) {
        z65.h(fq0Var, "cartContentService");
        z65.h(c62Var, "customizationService");
        z65.h(ah6Var, "menuService");
        z65.h(qraVar, "specialOfferService");
        z65.h(hq3Var, "featureService");
        z65.h(i00Var, "authorizationState");
        z65.h(avaVar, "stateProvider");
        z65.h(duaVar, "stateAnalyzer");
        z65.h(boVar, "appInitializationStateProvider");
        z65.h(dt5Var, "locality");
        z65.h(as8Var, "countryProvider");
        z65.h(t52Var, "customerService");
        z65.h(as8Var2, "mindboxServiceProvider");
        z65.h(u2cVar, "waitForPaidOrderService");
        z65.h(li7Var, "orderService");
        z65.h(l08Var, "personalOfferConverter");
        z65.h(ut8Var, "pushTokenProvider");
        z65.h(eh6Var, "menuUpdateInteractor");
        z65.h(kx1Var, "ioDispatcher");
        this.a = fq0Var;
        this.b = c62Var;
        this.c = ah6Var;
        this.d = qraVar;
        this.e = hq3Var;
        this.f = i00Var;
        this.g = avaVar;
        this.h = duaVar;
        this.i = boVar;
        this.j = dt5Var;
        this.k = as8Var;
        this.l = t52Var;
        this.m = as8Var2;
        this.n = u2cVar;
        this.o = li7Var;
        this.p = l08Var;
        this.q = ut8Var;
        this.r = eh6Var;
        this.s = kx1Var;
        this.t = LoggerFactory.getLogger("MainScreenInteractor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ay1 w() {
        return this.k.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cl6 z() {
        return this.m.get();
    }

    public final wx<Integer> A(String str) {
        z65.h(str, "orderId");
        return u(new f(str, null));
    }

    public final wx<p08> B(String str) {
        return u(new g(str, null));
    }

    public final wx<ce0> C(String str) {
        z65.h(str, "specialOfferId");
        return u(new h(str, null));
    }

    public final Object D(cv1<? super Unit> cv1Var) {
        Object d2;
        Object g2 = qh0.g(this.s, new i(null), cv1Var);
        d2 = c75.d();
        if (g2 == d2) {
            return g2;
        }
        return Unit.a;
    }

    public final wx<kp7> E(String str) {
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        return u(new j(str, null));
    }

    public final Object t(cv1<? super InterfaceC0577a> cv1Var) {
        return qh0.g(this.s, new b(null), cv1Var);
    }

    public <T> wx<T> u(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public final wx<Integer> v() {
        return u(new c(null));
    }

    public final wx<qd6> x(String str, String str2) {
        z65.h(str, "menuItemId");
        z65.h(str2, "selectedProducts");
        return u(new d(str, str2, null));
    }

    public final Object y(cv1<? super MindboxProperties> cv1Var) {
        return qh0.g(this.s, new e(null), cv1Var);
    }
}
