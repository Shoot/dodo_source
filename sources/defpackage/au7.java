package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.bu7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter;
import ru.dodopizza.app.presentation.checkout.details.b;
/* compiled from: PaymentMethodSelectionListener.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lau7;", "Lwk9;", "Lbu7;", "resultData", "", "a", "Lf63;", "Lf63;", "getRouter", "()Lf63;", "router", "Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "b", "Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "getPresenter", "()Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "presenter", "<init>", "(Lf63;Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;)V", c.a, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: au7  reason: default package */
/* loaded from: classes4.dex */
public final class au7 implements wk9<bu7> {
    public static final a c = new a(null);
    private final f63 a;
    private final CheckoutDetailsPresenter b;

    /* compiled from: PaymentMethodSelectionListener.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau7$a;", "", "", "RESULT_SELECT_PAYMENT_METHOD", "I", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: au7$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public au7(f63 f63Var, CheckoutDetailsPresenter checkoutDetailsPresenter) {
        z65.h(f63Var, "router");
        z65.h(checkoutDetailsPresenter, "presenter");
        this.a = f63Var;
        this.b = checkoutDetailsPresenter;
    }

    @Override // defpackage.wk9
    /* renamed from: a */
    public void onResult(bu7 bu7Var) {
        z65.h(bu7Var, "resultData");
        if (bu7Var instanceof bu7.a) {
            this.b.w(new b.w0(((bu7.a) bu7Var).a()));
        } else if (z65.c(bu7Var, bu7.b.a)) {
            this.b.w(b.y.a);
        }
    }
}
