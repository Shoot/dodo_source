package defpackage;

import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
/* compiled from: CurrencySymbol.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\u000b"}, d2 = {"Lg32;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", AppsFlyerProperties.CURRENCY_CODE, "b", "symbol", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "money"}, k = 1, mv = {1, 4, 2})
/* renamed from: g32  reason: default package */
/* loaded from: classes.dex */
public final class g32 {
    private final String a;
    private final String b;

    public g32(String str, String str2) {
        z65.h(str, AppsFlyerProperties.CURRENCY_CODE);
        z65.h(str2, "symbol");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }
}
