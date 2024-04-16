package defpackage;

import kotlin.Metadata;
import ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderPresenter;
/* compiled from: ComboCustomizeBuilderModule.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J \u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¨\u0006\u0011"}, d2 = {"Leh1;", "", "Lc62;", "customizationService", "Lmxa;", "stopRepository", "Lah1;", "a", "comboCustomizeBuilderInteractor", "Lgy3;", "firebaseToggleService", "Lld9;", "remoteConfigService", "Lru/dodopizza/app/presentation/product/card/combo/customize/ComboCustomizeBuilderPresenter;", "b", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: eh1  reason: default package */
/* loaded from: classes3.dex */
public final class eh1 {
    public static final eh1 a = new eh1();

    private eh1() {
    }

    public final ah1 a(c62 c62Var, mxa mxaVar) {
        z65.h(c62Var, "customizationService");
        z65.h(mxaVar, "stopRepository");
        return new ah1(c62Var, mxaVar, null, 4, null);
    }

    public final ComboCustomizeBuilderPresenter b(ah1 ah1Var, gy3 gy3Var, ld9 ld9Var) {
        z65.h(ah1Var, "comboCustomizeBuilderInteractor");
        z65.h(gy3Var, "firebaseToggleService");
        z65.h(ld9Var, "remoteConfigService");
        return new ComboCustomizeBuilderPresenter(ah1Var, gy3Var, ld9Var);
    }
}
