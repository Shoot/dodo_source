package defpackage;

import android.os.LocaleList;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: AndroidLocaleDelegate.android.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Loh;", "Lfc8;", "", "languageTag", "Lec8;", "a", "Landroid/os/LocaleList;", "Landroid/os/LocaleList;", "lastPlatformLocaleList", "Lns5;", "b", "Lns5;", "lastLocaleList", "Lw3b;", c.a, "Lw3b;", "lock", "()Lns5;", "current", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: oh  reason: default package */
/* loaded from: classes.dex */
public final class oh implements fc8 {
    private LocaleList a;
    private ns5 b;
    private final w3b c = u3b.a();

    @Override // defpackage.fc8
    public ec8 a(String str) {
        z65.h(str, "languageTag");
        Locale forLanguageTag = Locale.forLanguageTag(str);
        z65.g(forLanguageTag, "forLanguageTag(languageTag)");
        return new jh(forLanguageTag);
    }

    @Override // defpackage.fc8
    public ns5 b() {
        LocaleList localeList;
        int size;
        Locale locale;
        localeList = LocaleList.getDefault();
        z65.g(localeList, "getDefault()");
        synchronized (this.c) {
            ns5 ns5Var = this.b;
            if (ns5Var == null || localeList != this.a) {
                size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    locale = localeList.get(i);
                    z65.g(locale, "platformLocaleList[position]");
                    arrayList.add(new is5(new jh(locale)));
                }
                ns5 ns5Var2 = new ns5(arrayList);
                this.a = localeList;
                this.b = ns5Var2;
                return ns5Var2;
            }
            return ns5Var;
        }
    }
}
