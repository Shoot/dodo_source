package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: CardPaymentScenario.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\n\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\u0004\u0010\u0007¨\u0006\u0010"}, d2 = {"Lch4;", "Lpp0;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "merchantId", "b", "gateway", DateTokenConverter.CONVERTER_KEY, "paymentDataString", "environment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ch4  reason: default package */
/* loaded from: classes2.dex */
public final class ch4 extends pp0 implements Serializable {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch4(String str, String str2, String str3, String str4) {
        super(null);
        z65.h(str, "merchantId");
        z65.h(str2, "gateway");
        z65.h(str3, "paymentDataString");
        z65.h(str4, "environment");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }
}
