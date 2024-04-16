package defpackage;

import com.dodopizza.geo.feature.suggestions.presentation.f;
/* compiled from: DeliveryLocationSuggestionsModule_ProvideSuggestionAddressSelectVOFactoryFactory.java */
/* renamed from: hz2  reason: default package */
/* loaded from: classes2.dex */
public final class hz2 implements no3<f> {
    private final as8<ny2> a;
    private final as8<jv5> b;
    private final as8<g91> c;

    public hz2(as8<ny2> as8Var, as8<jv5> as8Var2, as8<g91> as8Var3) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
    }

    public static hz2 a(as8<ny2> as8Var, as8<jv5> as8Var2, as8<g91> as8Var3) {
        return new hz2(as8Var, as8Var2, as8Var3);
    }

    public static f c(ny2 ny2Var, jv5 jv5Var, g91 g91Var) {
        return (f) jh8.e(vy2.a.j(ny2Var, jv5Var, g91Var));
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public f get() {
        return c(this.a.get(), this.b.get(), this.c.get());
    }
}
