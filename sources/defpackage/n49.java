package defpackage;

import com.dodopizza.controlling.feature.rateapp.presentation.RateAppDialogPresenter;
import kotlin.Metadata;
/* compiled from: RateAppDialogModule.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007¨\u0006\r"}, d2 = {"Ln49;", "", "Lm49;", "interactor", "Lq49;", "router", "Lcom/dodopizza/controlling/feature/rateapp/presentation/RateAppDialogPresenter;", "b", "Lx49;", "rateAppService", "a", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: n49  reason: default package */
/* loaded from: classes.dex */
public final class n49 {
    public static final n49 a = new n49();

    private n49() {
    }

    public final m49 a(x49 x49Var) {
        z65.h(x49Var, "rateAppService");
        return new m49(x49Var);
    }

    public final RateAppDialogPresenter b(m49 m49Var, q49 q49Var) {
        z65.h(m49Var, "interactor");
        z65.h(q49Var, "router");
        return new RateAppDialogPresenter(m49Var, q49Var);
    }
}
