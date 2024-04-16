package defpackage;

import com.dodopizza.controlling.feature.couriertipscard.presentation.CourierTipsCardPresenter;
import kotlin.Metadata;
/* compiled from: CourierTipsCardModule.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¨\u0006\u0013"}, d2 = {"Ljz1;", "", "Lez1;", "data", "Lgc;", "analytics", "Liz1;", "interactor", "Lfz1;", "courierTipsCardDelegate", "Lcom/dodopizza/controlling/feature/couriertipscard/presentation/CourierTipsCardPresenter;", "b", "Ltz1;", "courierTipsService", "Lpz1;", "courierTipsFeatureState", "a", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jz1  reason: default package */
/* loaded from: classes.dex */
public final class jz1 {
    public static final jz1 a = new jz1();

    private jz1() {
    }

    public final iz1 a(tz1 tz1Var, pz1 pz1Var) {
        z65.h(tz1Var, "courierTipsService");
        z65.h(pz1Var, "courierTipsFeatureState");
        return new iz1(tz1Var, pz1Var, null, 4, null);
    }

    public final CourierTipsCardPresenter b(ez1 ez1Var, gc gcVar, iz1 iz1Var, fz1 fz1Var) {
        z65.h(ez1Var, "data");
        z65.h(gcVar, "analytics");
        z65.h(iz1Var, "interactor");
        z65.h(fz1Var, "courierTipsCardDelegate");
        return new CourierTipsCardPresenter(ez1Var, gcVar, iz1Var, fz1Var);
    }
}
