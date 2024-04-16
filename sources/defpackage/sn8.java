package defpackage;

import java.util.Locale;
import kotlin.Metadata;
/* compiled from: ProfileLocaleListPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¨\u0006\u0005"}, d2 = {"Ljava/util/Locale;", "currentLocale", "selectedLocale", "Lct5;", "b", "profile_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: sn8  reason: default package */
/* loaded from: classes2.dex */
public final class sn8 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ct5 b(Locale locale, Locale locale2, Locale locale3) {
        Locale locale4 = new Locale(locale.getLanguage());
        String displayLanguage = locale4.getDisplayLanguage(locale4);
        z65.g(displayLanguage, "getDisplayLanguage(...)");
        String a = qza.a(displayLanguage, locale4);
        String displayLanguage2 = locale4.getDisplayLanguage(locale2);
        z65.g(displayLanguage2, "getDisplayLanguage(...)");
        String a2 = qza.a(displayLanguage2, locale2);
        return new ct5(a, a2, z65.c(locale, locale3), !z65.c(a, a2), locale);
    }
}
