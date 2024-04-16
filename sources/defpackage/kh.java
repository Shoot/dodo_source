package defpackage;

import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: AndroidLocaleDelegate.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkh;", "Lfc8;", "", "languageTag", "Lec8;", "a", "Lns5;", "b", "()Lns5;", "current", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: kh  reason: default package */
/* loaded from: classes.dex */
public final class kh implements fc8 {
    @Override // defpackage.fc8
    public ec8 a(String str) {
        z65.h(str, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(str);
        z65.g(forLanguageTag, "forLanguageTag(languageTag)");
        return new jh(forLanguageTag);
    }

    @Override // defpackage.fc8
    public ns5 b() {
        List e;
        Locale locale = Locale.getDefault();
        z65.g(locale, "getDefault()");
        e = jc1.e(new is5(new jh(locale)));
        return new ns5(e);
    }
}
