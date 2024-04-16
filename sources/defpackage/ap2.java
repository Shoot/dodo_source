package defpackage;

import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: CardPaymentScenario.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\bR\"\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lap2;", "Lpp0;", "Ljava/io/Serializable;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "setRedirectUrl", "(Ljava/lang/String;)V", "redirectUrl", "<init>", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ap2  reason: default package */
/* loaded from: classes2.dex */
public final class ap2 extends pp0 implements Serializable {
    private String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap2(String str) {
        super(null);
        z65.h(str, "redirectUrl");
        this.a = str;
    }

    public final String a() {
        return this.a;
    }
}
