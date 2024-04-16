package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.ox1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: ContactsInteractor.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lqs1;", "Lps1;", "Lox1;", "Lwx;", "Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "a", "Lru/dodopizza/app/domain/country/CountryService;", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Ljv5;", "b", "Ljv5;", "localityService", "Lrt5;", c.a, "Lrt5;", "localityInfoService", "<init>", "(Lru/dodopizza/app/domain/country/CountryService;Ljv5;Lrt5;)V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qs1  reason: default package */
/* loaded from: classes2.dex */
public final class qs1 implements ps1, ox1 {
    private final CountryService a;
    private final jv5 b;
    private final rt5 c;

    /* compiled from: ContactsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/dodopizza/profile/feature/profilesettings/presentation/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.profile.feature.profilesettings.presentation.ContactsInteractorImpl$getContactInfo$1", f = "ContactsInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: qs1$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function1<cv1<? super com.dodopizza.profile.feature.profilesettings.presentation.a>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super com.dodopizza.profile.feature.profilesettings.presentation.a> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                dt5 i = qs1.this.b.i();
                String str11 = null;
                if (i != null) {
                    str = i.a();
                } else {
                    str = null;
                }
                ay1 c = qs1.this.a.c((String) mh5.c(str, "643"));
                dt5 i2 = qs1.this.b.i();
                if (i2 != null) {
                    jt5 a = qs1.this.c.a(i2);
                    String b = a.b();
                    if (b.length() <= 0) {
                        b = null;
                    }
                    String str12 = (String) mh5.c(b, c.e().b());
                    String a2 = c.e().a();
                    cqa h = a.h("vkontakte");
                    if (h != null) {
                        str2 = h.b();
                    } else {
                        str2 = null;
                    }
                    if (str2 == null) {
                        str3 = "";
                    } else {
                        str3 = str2;
                    }
                    cqa h2 = a.h("twitter");
                    if (h2 != null) {
                        str4 = h2.b();
                    } else {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str5 = "";
                    } else {
                        str5 = str4;
                    }
                    cqa h3 = a.h("instagram");
                    if (h3 != null) {
                        str6 = h3.b();
                    } else {
                        str6 = null;
                    }
                    if (str6 == null) {
                        str7 = "";
                    } else {
                        str7 = str6;
                    }
                    cqa h4 = a.h("youtube");
                    if (h4 != null) {
                        str8 = h4.b();
                    } else {
                        str8 = null;
                    }
                    if (str8 == null) {
                        str9 = "";
                    } else {
                        str9 = str8;
                    }
                    cqa h5 = a.h("facebook");
                    if (h5 != null) {
                        str11 = h5.b();
                    }
                    if (str11 == null) {
                        str10 = "";
                    } else {
                        str10 = str11;
                    }
                    return new com.dodopizza.profile.feature.profilesettings.presentation.a(str12, a2, str3, str5, str7, str9, str10, a.f(), a.d());
                }
                throw new IllegalStateException("Couldn't retrieve current locality info");
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public qs1(CountryService countryService, jv5 jv5Var, rt5 rt5Var) {
        z65.h(countryService, "countryService");
        z65.h(jv5Var, "localityService");
        z65.h(rt5Var, "localityInfoService");
        this.a = countryService;
        this.b = jv5Var;
        this.c = rt5Var;
    }

    @Override // defpackage.ps1
    public wx<com.dodopizza.profile.feature.profilesettings.presentation.a> a() {
        return e(new a(null));
    }

    public <T> wx<T> e(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }
}
