package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.a6b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter;
import ru.dodopizza.app.presentation.checkout.details.b;
/* compiled from: TableNumberSelectionListener.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lz5b;", "Lwk9;", "La6b;", "resultData", "", "a", "Lf63;", "Lf63;", "getRouter", "()Lf63;", "router", "Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "b", "Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "getPresenter", "()Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "presenter", "", c.a, "Z", "isFromAlert", "<init>", "(Lf63;Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;Z)V", DateTokenConverter.CONVERTER_KEY, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: z5b  reason: default package */
/* loaded from: classes4.dex */
public final class z5b implements wk9<a6b> {
    public static final a d = new a(null);
    private final f63 a;
    private final CheckoutDetailsPresenter b;
    private final boolean c;

    /* compiled from: TableNumberSelectionListener.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lz5b$a;", "", "", "RESULT_SELECT_TABLE_NUMBER", "I", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: z5b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public z5b(f63 f63Var, CheckoutDetailsPresenter checkoutDetailsPresenter, boolean z) {
        z65.h(f63Var, "router");
        z65.h(checkoutDetailsPresenter, "presenter");
        this.a = f63Var;
        this.b = checkoutDetailsPresenter;
        this.c = z;
    }

    @Override // defpackage.wk9
    /* renamed from: a */
    public void onResult(a6b a6bVar) {
        z65.h(a6bVar, "resultData");
        if (a6bVar instanceof a6b.a) {
            if (this.c) {
                this.b.w(new b.r(((a6b.a) a6bVar).a()));
            } else {
                this.b.w(new b.q(((a6b.a) a6bVar).a()));
            }
        } else if (z65.c(a6bVar, a6b.b.a)) {
            this.b.w(b.y.a);
        }
    }
}
