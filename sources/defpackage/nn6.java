package defpackage;

import java.util.Locale;
import kotlin.Metadata;
/* compiled from: MoneyFormatterProvider.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u000b¨\u0006\u000f"}, d2 = {"Lnn6;", "Lmn6;", "Ljava/util/Locale;", "locale", "", "code", "customSymbol", "", "b", "Ltn6;", "a", "Ltn6;", "formatter", "<init>", "()V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: nn6  reason: default package */
/* loaded from: classes.dex */
public final class nn6 implements mn6 {
    public static final nn6 a = new nn6();
    private static volatile tn6 b = new u1b("", null, 2, null);

    private nn6() {
    }

    @Override // defpackage.mn6
    public tn6 a() {
        return b;
    }

    public void b(Locale locale, String str, String str2) {
        z65.h(locale, "locale");
        z65.h(str, "code");
        b = ln6.a.a(h32.a.a(locale, str, str2), locale);
    }
}
