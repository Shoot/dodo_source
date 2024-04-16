package defpackage;

import com.dodopizza.persistence.entity.UpsaleStateEntity;
import kotlin.Metadata;
/* compiled from: PaymentFactory.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lbt7;", "Lat7;", "", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "Lys7;", "paymentData", "Los7;", "a", "Lcw7;", "Lcw7;", "paymentScenarioFactory", "<init>", "(Lcw7;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bt7  reason: default package */
/* loaded from: classes2.dex */
public final class bt7 implements at7 {
    private final cw7 a;

    public bt7(cw7 cw7Var) {
        z65.h(cw7Var, "paymentScenarioFactory");
        this.a = cw7Var;
    }

    @Override // defpackage.at7
    public os7 a(String str, ys7 ys7Var) {
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        z65.h(ys7Var, "paymentData");
        return new os7(ys7Var.g(), str, ys7Var.a(), gw7.a, this.a.a(ys7Var));
    }
}
