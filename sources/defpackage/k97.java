package defpackage;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import defpackage.i97;
import kotlin.Metadata;
/* compiled from: OnboardingFlowResolver.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"Lk97;", "Lj97;", "", LocalityEntity.FIELD_COUNTRY_CODE, "Li97;", "b", "a", "Lhq3;", "Lhq3;", "featureService", "<init>", "(Lhq3;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: k97  reason: default package */
/* loaded from: classes4.dex */
public final class k97 implements j97 {
    private final hq3 a;

    public k97(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        this.a = hq3Var;
    }

    private final i97 b(String str) {
        if (this.a.a(bq3.Y)) {
            return new i97.c(str, null, null, 6, null);
        }
        return new i97.b(str);
    }

    @Override // defpackage.j97
    public i97 a(String str) {
        i97 b;
        if (str == null || (b = b(str)) == null) {
            return i97.d.a;
        }
        return b;
    }
}
