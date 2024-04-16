package defpackage;

import com.dodopizza.persistence.entity.UpsaleStateEntity;
import kotlin.Metadata;
/* compiled from: OrderStep.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\n"}, d2 = {"Lib8;", "Lui7;", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "orderId", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ib8  reason: default package */
/* loaded from: classes4.dex */
public final class ib8 extends ui7 {
    private final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib8(String str, String str2) {
        super(str, null);
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        z65.h(str2, "orderId");
        this.b = str2;
    }

    public final String b() {
        return this.b;
    }
}
