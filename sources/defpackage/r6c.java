package defpackage;

import java.util.Locale;
import kotlin.Metadata;
/* compiled from: WordBoundary.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"Lr6c;", "", "Ls6c;", "a", "Ls6c;", "wordIterator", "Ljava/util/Locale;", "locale", "", "text", "<init>", "(Ljava/util/Locale;Ljava/lang/CharSequence;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: r6c  reason: default package */
/* loaded from: classes.dex */
public final class r6c {
    private final s6c a;

    public r6c(Locale locale, CharSequence charSequence) {
        z65.h(locale, "locale");
        z65.h(charSequence, "text");
        this.a = new s6c(charSequence, 0, charSequence.length(), locale);
    }
}
