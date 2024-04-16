package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: CardPaymentScenario.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0004\u0010\fR\"\u0010\u0012\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lj4c;", "Lpp0;", "Ljava/io/Serializable;", "", "a", "J", "b", "()J", "lifetime", "", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "successUrl", c.a, "failureUrl", "setRedirectUrl", "(Ljava/lang/String;)V", "redirectUrl", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: j4c  reason: default package */
/* loaded from: classes2.dex */
public final class j4c extends pp0 implements Serializable {
    private final long a;
    private final String b;
    private final String c;
    private String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4c(long j, String str, String str2, String str3) {
        super(null);
        z65.h(str, "successUrl");
        z65.h(str2, "failureUrl");
        z65.h(str3, "redirectUrl");
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final String a() {
        return this.c;
    }

    public final long b() {
        return this.a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }
}
