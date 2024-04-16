package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: LocaleExtensions.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u000b"}, d2 = {"Lts5;", "", "Lns5;", "localeList", "a", "Lwi;", "textPaint", "", "b", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ts5  reason: default package */
/* loaded from: classes.dex */
public final class ts5 {
    public static final ts5 a = new ts5();

    private ts5() {
    }

    public final Object a(ns5 ns5Var) {
        int w;
        z65.h(ns5Var, "localeList");
        w = lc1.w(ns5Var, 10);
        ArrayList arrayList = new ArrayList(w);
        Iterator<is5> it = ns5Var.iterator();
        while (it.hasNext()) {
            arrayList.add(ms5.a(it.next()));
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return rs5.a(qs5.a((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(wi wiVar, ns5 ns5Var) {
        int w;
        z65.h(wiVar, "textPaint");
        z65.h(ns5Var, "localeList");
        w = lc1.w(ns5Var, 10);
        ArrayList arrayList = new ArrayList(w);
        Iterator<is5> it = ns5Var.iterator();
        while (it.hasNext()) {
            arrayList.add(ms5.a(it.next()));
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        wiVar.setTextLocales(qs5.a((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
