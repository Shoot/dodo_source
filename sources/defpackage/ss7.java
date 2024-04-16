package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: PaymentAuthorize.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lss7;", "Lqs7;", "Ljava/io/Serializable;", "", "paymentId", "<init>", "(Ljava/lang/String;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ss7  reason: default package */
/* loaded from: classes2.dex */
public final class ss7 extends qs7 implements Serializable {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ss7(String str) {
        super(str, null);
        z65.h(str, "paymentId");
    }
}
