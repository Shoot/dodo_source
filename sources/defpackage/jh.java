package defpackage;

import java.util.Locale;
import kotlin.Metadata;
/* compiled from: AndroidLocaleDelegate.android.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Ljh;", "Lec8;", "", "a", "Ljava/util/Locale;", "Ljava/util/Locale;", "b", "()Ljava/util/Locale;", "javaLocale", "<init>", "(Ljava/util/Locale;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: jh  reason: default package */
/* loaded from: classes.dex */
public final class jh implements ec8 {
    private final Locale a;

    public jh(Locale locale) {
        z65.h(locale, "javaLocale");
        this.a = locale;
    }

    @Override // defpackage.ec8
    public String a() {
        String languageTag = this.a.toLanguageTag();
        z65.g(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }

    public final Locale b() {
        return this.a;
    }
}
