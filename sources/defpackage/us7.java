package defpackage;

import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: PaymentAuthorize.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lus7;", "Lqs7;", "Ljava/io/Serializable;", "", c.a, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "navigateUrl", "paymentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: us7  reason: default package */
/* loaded from: classes2.dex */
public final class us7 extends qs7 implements Serializable {
    private final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us7(String str, String str2) {
        super(str, null);
        z65.h(str, "paymentId");
        z65.h(str2, "navigateUrl");
        this.c = str2;
    }

    public final String b() {
        return this.c;
    }
}
