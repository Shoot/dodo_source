package defpackage;

import com.dodopizza.persistence.entity.UpsaleStateEntity;
import kotlin.Metadata;
/* compiled from: OrderStep.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u000b"}, d2 = {"Lfv6;", "Lui7;", "Lys7;", "b", "Lys7;", "()Lys7;", "paymentData", "", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "<init>", "(Ljava/lang/String;Lys7;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fv6  reason: default package */
/* loaded from: classes4.dex */
public final class fv6 extends ui7 {
    private final ys7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv6(String str, ys7 ys7Var) {
        super(str, null);
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        z65.h(ys7Var, "paymentData");
        this.b = ys7Var;
    }

    public final ys7 b() {
        return this.b;
    }
}
