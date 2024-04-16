package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.bt0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter;
import ru.dodopizza.app.presentation.checkout.details.b;
/* compiled from: CashNotesResultListener.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lct0;", "Lwk9;", "Lbt0;", "resultData", "", "a", "Lf63;", "Lf63;", "router", "Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "b", "Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "presenter", "<init>", "(Lf63;Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;)V", c.a, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ct0  reason: default package */
/* loaded from: classes4.dex */
public final class ct0 implements wk9<bt0> {
    public static final a c = new a(null);
    private final f63 a;
    private final CheckoutDetailsPresenter b;

    /* compiled from: CashNotesResultListener.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lct0$a;", "", "", "RESULT_CASH_CHARGE", "I", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ct0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ct0(f63 f63Var, CheckoutDetailsPresenter checkoutDetailsPresenter) {
        z65.h(f63Var, "router");
        z65.h(checkoutDetailsPresenter, "presenter");
        this.a = f63Var;
        this.b = checkoutDetailsPresenter;
    }

    @Override // defpackage.wk9
    /* renamed from: a */
    public void onResult(bt0 bt0Var) {
        z65.h(bt0Var, "resultData");
        if (bt0Var instanceof bt0.a) {
            this.b.w(new b.k(((bt0.a) bt0Var).a()));
        } else if (z65.c(bt0Var, bt0.b.a)) {
            this.b.w(b.y.a);
        }
    }
}
