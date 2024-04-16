package defpackage;

import com.appsflyer.AppsFlyerProperties;
import java.util.Currency;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: CurrencySymbolFactory.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¨\u0006\u000b"}, d2 = {"Lh32;", "", "Ljava/util/Locale;", "locale", "", AppsFlyerProperties.CURRENCY_CODE, "currencySymbol", "Lg32;", "a", "<init>", "()V", "money"}, k = 1, mv = {1, 4, 2})
/* renamed from: h32  reason: default package */
/* loaded from: classes.dex */
public final class h32 {
    public static final h32 a = new h32();

    private h32() {
    }

    public final g32 a(Locale locale, String str, String str2) {
        z65.h(locale, "locale");
        z65.h(str, AppsFlyerProperties.CURRENCY_CODE);
        if (str2 == null) {
            str2 = Currency.getInstance(str).getSymbol(locale);
        }
        z65.g(str2, "currencySymbol ?: Curren…cyCode).getSymbol(locale)");
        return new g32(str, str2);
    }
}
