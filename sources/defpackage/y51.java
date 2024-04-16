package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ov0;
import defpackage.t51;
import defpackage.xl0;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.backend.domain.checkout.CheckoutAPI;
import ru.dodopizza.backend.domain.checkout.dto.CheckoutInfoDto;
/* compiled from: CheckoutService.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001DBW\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010:\u001a\u000208\u0012\u0006\u0010=\u001a\u00020;\u0012\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\fH\u0002J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016R\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010<R\u0016\u0010?\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010>¨\u0006E"}, d2 = {"Ly51;", "Lx51;", "Lxl0;", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "state", "Lt51;", Image.TYPE_MEDIUM, "Lib8;", "step", "Llia;", "shoppingCart", "n", "Lfv6;", "l", "", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "Lys7;", "paymentData", "Los7;", "k", "", "b", "Ls51;", "checkoutRequest", com.huawei.hms.opendevice.c.a, "", "isCarryout", "La51;", e.a, "Lli7;", DateTokenConverter.CONVERTER_KEY, "Lli7;", "orderService", "Lvi7;", "Lvi7;", "orderStepFactory", "Lew7;", "f", "Lew7;", "paymentService", "Ldua;", "g", "Ldua;", "stateAnalyzer", "Lpv0;", Image.TYPE_HIGH, "Lpv0;", "changeWorkflowResultHandler", "Lfq0;", "i", "Lfq0;", "cartContentService", "Lt52;", "j", "Lt52;", "customerService", "Lru/dodopizza/backend/domain/checkout/CheckoutAPI;", "Lru/dodopizza/backend/domain/checkout/CheckoutAPI;", "checkoutAPI", "Lb51;", "Lb51;", "checkoutInfoConverter", "La51;", "checkoutInfo", "Lml0;", "cacheInspector", "<init>", "(Lli7;Lvi7;Lew7;Ldua;Lpv0;Lfq0;Lt52;Lru/dodopizza/backend/domain/checkout/CheckoutAPI;Lb51;Lml0;)V", "a", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: y51  reason: default package */
/* loaded from: classes4.dex */
public final class y51 extends xl0 implements x51 {
    public static final a n = new a(null);
    private static final long o = TimeUnit.SECONDS.toMillis(15);
    private final li7 d;
    private final vi7 e;
    private final ew7 f;
    private final dua g;
    private final pv0 h;
    private final fq0 i;
    private final t52 j;
    private final CheckoutAPI k;
    private final b51 l;
    private a51 m;

    /* compiled from: CheckoutService.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Ly51$a;", "", "", "CACHE_DURATION", "J", "", "CACHE_KEY_CHECKOUT_INFO", "Ljava/lang/String;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: y51$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CheckoutService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"La51;", "a", "()La51;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y51$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<a51> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final a51 invoke() {
            return y51.this.m;
        }
    }

    /* compiled from: CheckoutService.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lxl0$a;", "a", "()Lxl0$a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y51$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<xl0.a> {
        final /* synthetic */ String b;
        final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, boolean z) {
            super(0);
            this.b = str;
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final xl0.a invoke() {
            CheckoutInfoDto checkoutInfo = y51.this.k.getCheckoutInfo(this.b);
            y51 y51Var = y51.this;
            y51Var.m = y51Var.l.a(checkoutInfo, this.c);
            return xl0.a.C0743a.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(li7 li7Var, vi7 vi7Var, ew7 ew7Var, dua duaVar, pv0 pv0Var, fq0 fq0Var, t52 t52Var, CheckoutAPI checkoutAPI, b51 b51Var, ml0 ml0Var) {
        super(ml0Var);
        z65.h(li7Var, "orderService");
        z65.h(vi7Var, "orderStepFactory");
        z65.h(ew7Var, "paymentService");
        z65.h(duaVar, "stateAnalyzer");
        z65.h(pv0Var, "changeWorkflowResultHandler");
        z65.h(fq0Var, "cartContentService");
        z65.h(t52Var, "customerService");
        z65.h(checkoutAPI, "checkoutAPI");
        z65.h(b51Var, "checkoutInfoConverter");
        z65.h(ml0Var, "cacheInspector");
        this.d = li7Var;
        this.e = vi7Var;
        this.f = ew7Var;
        this.g = duaVar;
        this.h = pv0Var;
        this.i = fq0Var;
        this.j = t52Var;
        this.k = checkoutAPI;
        this.l = b51Var;
        this.m = a51.b.a();
    }

    private final os7 k(String str, ys7 ys7Var) {
        return this.f.g(str, ys7Var);
    }

    private final t51 l(fv6 fv6Var) {
        return t51.a.a(k(fv6Var.a(), fv6Var.b()));
    }

    private final t51 m(StateEntity stateEntity) {
        ov0.a aVar;
        ov0 a2 = this.h.a(stateEntity);
        if (a2 instanceof ov0.a) {
            aVar = (ov0.a) a2;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return new t51.a(aVar);
        }
        throw new IllegalStateException("Something went wrong while creating order");
    }

    private final t51 n(ib8 ib8Var, lia liaVar) {
        b();
        return t51.a.c(ib8Var.b(), liaVar.f());
    }

    @Override // defpackage.x51
    public void b() {
        this.g.b();
        t52.C(this.j, false, 1, null);
    }

    @Override // defpackage.x51
    public t51 c(s51 s51Var) {
        z65.h(s51Var, "checkoutRequest");
        ui7 a2 = this.e.a(this.d.f(s51Var), s51Var.c().b());
        if (a2 instanceof fv6) {
            return l((fv6) a2);
        }
        if (a2 instanceof ib8) {
            return n((ib8) a2, this.i.a());
        }
        if (a2 instanceof mp7) {
            return t51.a.b();
        }
        if (a2 instanceof ro3) {
            return m(((ro3) a2).b());
        }
        if (a2 instanceof ps8) {
            return m(((ps8) a2).b());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.x51
    public a51 e(String str, boolean z) {
        a51 a51Var;
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        synchronized (this) {
            pza pzaVar = pza.a;
            String format = String.format("cache_checkout_info.$1", Arrays.copyOf(new Object[]{str}, 1));
            z65.g(format, "format(...)");
            a51Var = (a51) f(new b(), new c(str, z), new ql0(format, o, z65.c(this.m, a51.b.a())));
        }
        return a51Var;
    }
}
