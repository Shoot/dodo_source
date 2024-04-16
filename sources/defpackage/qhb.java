package defpackage;

import java.util.Locale;
import kotlin.Metadata;
/* compiled from: ToLowerCaseLocalized.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¨\u0006\u0002"}, d2 = {"", "a", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: qhb  reason: default package */
/* loaded from: classes4.dex */
public final class qhb {
    public static final String a(String str) {
        z65.h(str, "<this>");
        if (!z65.c(Locale.getDefault().getLanguage(), Locale.GERMANY.getLanguage())) {
            Locale locale = Locale.getDefault();
            z65.g(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            z65.g(lowerCase, "toLowerCase(...)");
            return lowerCase;
        }
        return str;
    }
}
