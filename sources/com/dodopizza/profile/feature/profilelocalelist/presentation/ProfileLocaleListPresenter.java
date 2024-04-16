package com.dodopizza.profile.feature.profilelocalelist.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
/* compiled from: ProfileLocaleListPresenter.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b&\u0010'J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0014J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0003J\u0006\u0010\u000b\u001a\u00020\u0003R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010\"¨\u0006("}, d2 = {"Lcom/dodopizza/profile/feature/profilelocalelist/presentation/ProfileLocaleListPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lwn8;", "", "r", "v", "onFirstViewAttach", "Lct5;", "localeVO", "t", "u", Image.TYPE_SMALL, "Lqn8;", "a", "Lqn8;", "interactor", "Ldo;", "b", "Ldo;", "appInitializer", "Lgc;", c.a, "Lgc;", "analytics", "Lf63;", DateTokenConverter.CONVERTER_KEY, "Lf63;", "router", "", "Ljava/util/Locale;", e.a, "Ljava/util/List;", "locales", "f", "Ljava/util/Locale;", "selectedLocale", "g", "currentLocale", "<init>", "(Lqn8;Ldo;Lgc;Lf63;)V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ProfileLocaleListPresenter extends BasePresenter<wn8> {
    private final qn8 a;
    private final Cdo b;
    private final gc c;
    private final f63 d;
    private List<Locale> e;
    private Locale f;
    private Locale g;

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a<T> implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            Locale a = ((ct5) t2).a();
            Locale locale = ProfileLocaleListPresenter.this.g;
            Locale locale2 = null;
            if (locale == null) {
                z65.z("currentLocale");
                locale = null;
            }
            Boolean valueOf = Boolean.valueOf(z65.c(a, locale));
            Locale a2 = ((ct5) t).a();
            Locale locale3 = ProfileLocaleListPresenter.this.g;
            if (locale3 == null) {
                z65.z("currentLocale");
            } else {
                locale2 = locale3;
            }
            d = mk1.d(valueOf, Boolean.valueOf(z65.c(a2, locale2)));
            return d;
        }
    }

    public ProfileLocaleListPresenter(qn8 qn8Var, Cdo cdo, gc gcVar, f63 f63Var) {
        z65.h(qn8Var, "interactor");
        z65.h(cdo, "appInitializer");
        z65.h(gcVar, "analytics");
        z65.h(f63Var, "router");
        this.a = qn8Var;
        this.b = cdo;
        this.c = gcVar;
        this.d = f63Var;
    }

    private final void r() {
        this.f = this.a.b();
        this.g = this.a.b();
        this.e = this.a.a();
    }

    private final void v() {
        int w;
        List<ct5> y0;
        ct5 b;
        List<Locale> list = this.e;
        if (list == null) {
            z65.z("locales");
            list = null;
        }
        List<Locale> list2 = list;
        w = lc1.w(list2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (Locale locale : list2) {
            Locale locale2 = this.g;
            if (locale2 == null) {
                z65.z("currentLocale");
                locale2 = null;
            }
            Locale locale3 = this.f;
            if (locale3 == null) {
                z65.z("selectedLocale");
                locale3 = null;
            }
            b = sn8.b(locale, locale2, locale3);
            arrayList.add(b);
        }
        y0 = sc1.y0(arrayList, new a());
        ((wn8) getViewState()).u(y0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        r();
        v();
        gc gcVar = this.c;
        Locale locale = this.g;
        if (locale == null) {
            z65.z("currentLocale");
            locale = null;
        }
        gcVar.a(hd.a(locale));
    }

    public final void s() {
        this.d.d();
    }

    public final void t(ct5 ct5Var) {
        z65.h(ct5Var, "localeVO");
        this.f = ct5Var.a();
        v();
    }

    public final void u() {
        qn8 qn8Var = this.a;
        Locale locale = this.f;
        Locale locale2 = null;
        if (locale == null) {
            z65.z("selectedLocale");
            locale = null;
        }
        qn8Var.c(locale);
        gc gcVar = this.c;
        Locale locale3 = this.f;
        if (locale3 == null) {
            z65.z("selectedLocale");
        } else {
            locale2 = locale3;
        }
        gcVar.a(hd.b(locale2));
        this.b.l();
    }
}
