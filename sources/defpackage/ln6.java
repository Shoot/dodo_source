package defpackage;

import java.util.Locale;
import kotlin.Metadata;
/* compiled from: MoneyFormatterFactory.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lln6;", "", "Lg32;", "currencySymbol", "Ljava/util/Locale;", "locale", "Ltn6;", "a", "<init>", "()V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: ln6  reason: default package */
/* loaded from: classes.dex */
public final class ln6 {
    public static final ln6 a = new ln6();

    private ln6() {
    }

    public final tn6 a(g32 g32Var, Locale locale) {
        z65.h(g32Var, "currencySymbol");
        z65.h(locale, "locale");
        String b = g32Var.b();
        String a2 = g32Var.a();
        if (z65.c(a2, "GBP")) {
            return new ui8(b, locale);
        }
        if (z65.c(a2, "AED")) {
            return new ui8(b + " ", locale);
        }
        return new u1b(b, locale);
    }
}
