package defpackage;

import defpackage.el9;
import kotlin.Metadata;
import ru.dodopizza.backend.domain.country.CountryApi;
/* compiled from: CountryApiFactoryImpl.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcy1;", "Lby1;", "", "baseUrl", "Lru/dodopizza/backend/domain/country/CountryApi;", "a", "Lel9;", "Lel9;", "retrofitFactory", "<init>", "(Lel9;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cy1  reason: default package */
/* loaded from: classes.dex */
public final class cy1 implements by1 {
    private final el9 a;

    public cy1(el9 el9Var) {
        z65.h(el9Var, "retrofitFactory");
        this.a = el9Var;
    }

    @Override // defpackage.by1
    public CountryApi a(String str) {
        z65.h(str, "baseUrl");
        return (CountryApi) this.a.d(new el9.b(sq4.j.b(str))).create(CountryApi.class);
    }
}
