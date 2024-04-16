package defpackage;

import java.util.Locale;
import kotlin.Metadata;
/* compiled from: LanguageConfig.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0001¨\u0006\u0004"}, d2 = {"Ltl5;", "Ljava/util/Locale;", "b", "a", "infrastructure-base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: ul5  reason: default package */
/* loaded from: classes4.dex */
public final class ul5 {
    public static final tl5 a(Locale locale) {
        z65.h(locale, "<this>");
        String language = locale.getLanguage();
        z65.g(language, "getLanguage(...)");
        String country = locale.getCountry();
        z65.g(country, "getCountry(...)");
        return new tl5(language, country);
    }

    public static final Locale b(tl5 tl5Var) {
        z65.h(tl5Var, "<this>");
        return new Locale(tl5Var.b(), tl5Var.a());
    }
}
