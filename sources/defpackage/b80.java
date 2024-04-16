package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.Serializable;
import java.math.RoundingMode;
import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: MoneyStringFormatter.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016R\u001a\u0010\u000f\u001a\u00020\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lb80;", "Ltn6;", "Ljava/io/Serializable;", "Ljava/util/Locale;", "locale", "Ljava/text/Format;", DateTokenConverter.CONVERTER_KEY, "", "amount", "", c.a, "a", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "symbol", "b", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "<init>", "(Ljava/lang/String;Ljava/util/Locale;)V", "money"}, k = 1, mv = {1, 4, 2})
/* renamed from: b80  reason: default package */
/* loaded from: classes.dex */
public abstract class b80 implements tn6, Serializable {
    private final String a;
    private final Locale b;

    public b80(String str, Locale locale) {
        z65.h(str, "symbol");
        z65.h(locale, "locale");
        this.a = str;
        this.b = locale;
    }

    private final Format d(Locale locale) {
        if (locale == null) {
            locale = this.b;
        }
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        numberFormat.setRoundingMode(RoundingMode.FLOOR);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setMinimumFractionDigits(2);
        z65.g(numberFormat, "NumberFormat.getInstance…ractionDigits = 2\n      }");
        return numberFormat;
    }

    @Override // defpackage.tn6
    public String a() {
        return this.a;
    }

    @Override // defpackage.tn6
    public String c(double d, Locale locale) {
        String format = d(locale).format(Double.valueOf(d));
        z65.g(format, "amountFormatter(locale).format(amount)");
        return new ec9("(\\.00|,00)$").i(format, "");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String e() {
        return this.a;
    }
}
