package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appsflyer.AppsFlyerProperties;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: MoneyFactory.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004H\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0015\u001a\n \u0013*\u0004\u0018\u00010\b0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0018"}, d2 = {"Lkn6;", "Ljn6;", "Lhn6;", "f", "", AppsFlyerProperties.CURRENCY_CODE, "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Locale;", "locale", e.a, "", "amount", "b", "", c.a, "str", "a", "Ljava/lang/String;", "kotlin.jvm.PlatformType", "Ljava/util/Locale;", "currentLocale", "<init>", "()V", "money"}, k = 1, mv = {1, 4, 2})
/* renamed from: kn6  reason: default package */
/* loaded from: classes.dex */
public final class kn6 implements jn6 {
    public static final kn6 c = new kn6();
    private static volatile String a = "RUB";
    private static volatile Locale b = Locale.getDefault();

    private kn6() {
    }

    public static final hn6 f() {
        return c.c(0);
    }

    @Override // defpackage.jn6
    public hn6 a(String str) {
        String F;
        Double i;
        z65.h(str, "str");
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(b);
        z65.g(decimalFormatSymbols, "DecimalFormatSymbols.getInstance(currentLocale)");
        char decimalSeparator = decimalFormatSymbols.getDecimalSeparator();
        String i2 = new ec9("\\D*([\\d]+[" + decimalSeparator + "\\d]?)\\D*").i(str, "$1");
        double d = 0.0d;
        if (i2.length() != 0) {
            F = l0b.F(i2, ",", ".", false, 4, null);
            i = j0b.i(F);
            if (i != null) {
                d = i.doubleValue();
            }
        }
        return b(d);
    }

    @Override // defpackage.jn6
    public hn6 b(double d) {
        return new hn6(d, a);
    }

    @Override // defpackage.jn6
    public hn6 c(int i) {
        return b(i);
    }

    public final void d(String str) {
        z65.h(str, AppsFlyerProperties.CURRENCY_CODE);
        a = str;
    }

    public final void e(Locale locale) {
        z65.h(locale, "locale");
        b = locale;
    }
}
