package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: ProfileLocaleListInteractor.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0005\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0014"}, d2 = {"Lqn8;", "", "", "Ljava/util/Locale;", "a", "b", "locale", "", c.a, "Ljo;", "Ljo;", "appResourceLocalesFactory", "Li32;", "Li32;", "currentLocaleProvider", "Lwl5;", "Lwl5;", "languageService", "<init>", "(Ljo;Li32;Lwl5;)V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qn8  reason: default package */
/* loaded from: classes2.dex */
public final class qn8 {
    private final jo a;
    private final i32 b;
    private final wl5 c;

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: qn8$a */
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(((Locale) t).toLanguageTag(), ((Locale) t2).toLanguageTag());
            return d;
        }
    }

    public qn8(jo joVar, i32 i32Var, wl5 wl5Var) {
        z65.h(joVar, "appResourceLocalesFactory");
        z65.h(i32Var, "currentLocaleProvider");
        z65.h(wl5Var, "languageService");
        this.a = joVar;
        this.b = i32Var;
        this.c = wl5Var;
    }

    public final List<Locale> a() {
        List y0;
        y0 = sc1.y0(this.a.b(), new a());
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : y0) {
            if (hashSet.add(((Locale) obj).getLanguage())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final Locale b() {
        return this.b.get();
    }

    public final void c(Locale locale) {
        z65.h(locale, "locale");
        this.c.d(ul5.a(locale));
    }
}
