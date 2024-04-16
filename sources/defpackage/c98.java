package defpackage;

import defpackage.d98;
import defpackage.lk7;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.dodopizza.app.presentation.checkout.details.CheckoutDetailsPresenter;
import ru.dodopizza.app.presentation.checkout.details.b;
/* compiled from: PizzeriaSelectionListener.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lc98;", "Lwk9;", "Ld98;", "Lc8a;", "Llk7$d;", "b", "resultData", "", "a", "Lf63;", "Lf63;", "getRouter", "()Lf63;", "router", "Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "getPresenter", "()Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;", "presenter", "<init>", "(Lf63;Lru/dodopizza/app/presentation/checkout/details/CheckoutDetailsPresenter;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: c98  reason: default package */
/* loaded from: classes4.dex */
public final class c98 implements wk9<d98> {
    private final f63 a;
    private final CheckoutDetailsPresenter b;

    /* compiled from: PizzeriaSelectionListener.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c98$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[c8a.values().length];
            try {
                iArr[c8a.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c8a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public c98(f63 f63Var, CheckoutDetailsPresenter checkoutDetailsPresenter) {
        z65.h(f63Var, "router");
        z65.h(checkoutDetailsPresenter, "presenter");
        this.a = f63Var;
        this.b = checkoutDetailsPresenter;
    }

    private final lk7.d b(c8a c8aVar) {
        int i = a.$EnumSwitchMapping$0[c8aVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return lk7.d.c;
            }
            throw new NoWhenBranchMatchedException();
        }
        return lk7.d.b;
    }

    @Override // defpackage.wk9
    /* renamed from: a */
    public void onResult(d98 d98Var) {
        z65.h(d98Var, "resultData");
        boolean z = d98Var instanceof d98.a;
        if (z) {
            d98.a aVar = (d98.a) d98Var;
            if (aVar.c() == n9a.a) {
                this.b.w(new b.s0(aVar.b(), b(aVar.a())));
                return;
            }
        }
        if (z) {
            d98.a aVar2 = (d98.a) d98Var;
            if (aVar2.c() == n9a.b) {
                this.b.w(new b.z0(aVar2.b(), b(aVar2.a()), aVar2.d()));
                return;
            }
        }
        if (d98Var instanceof d98.b) {
            this.b.w(b.j0.a);
        }
    }
}
