package defpackage;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.dodopizza.app.presentation.selectpizzeria.combined.b;
import ru.dodopizza.app.presentation.selectpizzeria.combined.h;
import ru.dodopizza.app.presentation.selectpizzeria.e;
/* compiled from: CheckoutSelectPizzeriaFragmentProvider.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lw51;", "Ly7a;", "Lfn3;", "Lgn3;", "b", "Lg9a;", "data", "Landroidx/fragment/app/Fragment;", "a", "Lhq3;", "Lhq3;", "getFeatureService", "()Lhq3;", "featureService", "Lih4;", "Lih4;", "getGooglePlayServicesHelper", "()Lih4;", "googlePlayServicesHelper", "<init>", "(Lhq3;Lih4;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: w51  reason: default package */
/* loaded from: classes4.dex */
public final class w51 implements y7a {
    private final hq3 a;
    private final ih4 b;

    /* compiled from: CheckoutSelectPizzeriaFragmentProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w51$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[fn3.values().length];
            try {
                iArr[fn3.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fn3.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public w51(hq3 hq3Var, ih4 ih4Var) {
        z65.h(hq3Var, "featureService");
        z65.h(ih4Var, "googlePlayServicesHelper");
        this.a = hq3Var;
        this.b = ih4Var;
    }

    private final gn3 b(fn3 fn3Var) {
        int i = a.$EnumSwitchMapping$0[fn3Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return gn3.b;
            }
            throw new NoWhenBranchMatchedException();
        }
        return gn3.a;
    }

    @Override // defpackage.y7a
    public Fragment a(g9a g9aVar) {
        z65.h(g9aVar, "data");
        x7a x7aVar = new x7a(g9aVar.c(), true, g9aVar.b(), n8a.b, g9aVar.d(), b(g9aVar.a()));
        if (this.a.a(bq3.e6) && this.b.a()) {
            return h.a5.a(x7aVar);
        }
        if (this.a.a(bq3.d6)) {
            return b.Y.a(x7aVar);
        }
        return e.A.a(x7aVar);
    }
}
