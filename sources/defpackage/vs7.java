package defpackage;

import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: PaymentAuthorize.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00038\u0016X\u0096D¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lvs7;", "Lqs7;", "Ljava/io/Serializable;", "", c.a, "Z", "isAuthorized", "()Z", "", "paymentId", "<init>", "(Ljava/lang/String;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vs7  reason: default package */
/* loaded from: classes2.dex */
public final class vs7 extends qs7 implements Serializable {
    private final boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs7(String str) {
        super(str, null);
        z65.h(str, "paymentId");
        this.c = true;
    }
}
