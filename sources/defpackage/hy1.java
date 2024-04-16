package defpackage;

import defpackage.tmb;
import kotlin.Metadata;
/* compiled from: CountryDataMapper.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, d2 = {"Lhy1;", "Lgy1;", "Lay1;", tmb.c.COUNTRY_JSON_NAME, "", "selectedCountryCode", "Lzy1;", "a", "Lpy1;", "Lpy1;", "countryNameService", "<init>", "(Lpy1;)V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hy1  reason: default package */
/* loaded from: classes2.dex */
public final class hy1 implements gy1 {
    private final py1 a;

    public hy1(py1 py1Var) {
        z65.h(py1Var, "countryNameService");
        this.a = py1Var;
    }

    @Override // defpackage.gy1
    public zy1 a(ay1 ay1Var, String str) {
        z65.h(ay1Var, tmb.c.COUNTRY_JSON_NAME);
        z65.h(str, "selectedCountryCode");
        return new zy1(ay1Var.getCode(), ay1Var.f(), ay1Var.getName(), this.a.a(ay1Var.f()), z65.c(ay1Var.getCode(), str));
    }
}
