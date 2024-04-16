package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: PaymentAuthorize.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0006R\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0005\u001a\u0004\b\n\u0010\u0006¨\u0006\u0012"}, d2 = {"Lrs7;", "Lqs7;", "Ljava/io/Serializable;", "", c.a, "Ljava/lang/String;", "()Ljava/lang/String;", "navigateUrl", DateTokenConverter.CONVERTER_KEY, "paReq", e.a, "b", "md", "f", "termUrl", "paymentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: rs7  reason: default package */
/* loaded from: classes2.dex */
public final class rs7 extends qs7 implements Serializable {
    private final String c;
    private final String d;
    private final String e;
    private final String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs7(String str, String str2, String str3, String str4, String str5) {
        super(str, null);
        z65.h(str, "paymentId");
        z65.h(str2, "navigateUrl");
        z65.h(str3, "paReq");
        z65.h(str4, "md");
        z65.h(str5, "termUrl");
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final String b() {
        return this.e;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.f;
    }
}
