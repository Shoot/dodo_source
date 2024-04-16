package defpackage;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: OnboardingSelectedCountryService.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0007\u001a\u00020\u0004R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\t¨\u0006\r"}, d2 = {"Lv97;", "", "", LocalityEntity.FIELD_COUNTRY_CODE, "", c.a, "a", "b", "Lci8;", "Lci8;", "preferencesAssetsDataSource", "<init>", "(Lci8;)V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: v97  reason: default package */
/* loaded from: classes2.dex */
public final class v97 {
    private final ci8 a;

    public v97(ci8 ci8Var) {
        z65.h(ci8Var, "preferencesAssetsDataSource");
        this.a = ci8Var;
    }

    public final String a() {
        return this.a.q();
    }

    public final void b() {
        this.a.h();
    }

    public final void c(String str) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        this.a.D(str);
    }
}
