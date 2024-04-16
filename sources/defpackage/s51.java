package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: CheckoutRequest.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0015"}, d2 = {"Ls51;", "", "", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "b", "clientName", "Lhx2;", c.a, "Lhx2;", "()Lhx2;", "deliveryInfo", "Lct7;", "Lct7;", "()Lct7;", "paymentInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lhx2;Lct7;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: s51  reason: default package */
/* loaded from: classes4.dex */
public final class s51 {
    private final String a;
    private final String b;
    private final hx2 c;
    private final ct7 d;

    public s51(String str, String str2, hx2 hx2Var, ct7 ct7Var) {
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        z65.h(str2, "clientName");
        z65.h(hx2Var, "deliveryInfo");
        z65.h(ct7Var, "paymentInfo");
        this.a = str;
        this.b = str2;
        this.c = hx2Var;
        this.d = ct7Var;
    }

    public final String a() {
        return this.b;
    }

    public final hx2 b() {
        return this.c;
    }

    public final ct7 c() {
        return this.d;
    }

    public final String d() {
        return this.a;
    }
}
