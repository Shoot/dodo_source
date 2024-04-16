package defpackage;

import com.huawei.hms.opendevice.c;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: CardPaymentScenario.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\r"}, d2 = {"Llu6;", "Lvib;", "Ljava/io/Serializable;", "", c.a, "J", "()J", "lifetime", "", "authorizeUrl", "publicEncryptionKey", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lu6  reason: default package */
/* loaded from: classes2.dex */
public final class lu6 extends vib implements Serializable {
    private final long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu6(long j, String str, String str2) {
        super(str, str2, null);
        z65.h(str, "authorizeUrl");
        z65.h(str2, "publicEncryptionKey");
        this.c = j;
    }

    public final long c() {
        return this.c;
    }
}
