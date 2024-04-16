package defpackage;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import kotlin.Metadata;
/* compiled from: AddressFormatterFactory.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Li8;", "", "", LocalityEntity.FIELD_COUNTRY_CODE, "Lh8;", "a", "Lhq3;", "Lhq3;", "featureService", "<init>", "(Lhq3;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: i8  reason: default package */
/* loaded from: classes4.dex */
public final class i8 {
    private final hq3 a;

    public i8(hq3 hq3Var) {
        z65.h(hq3Var, "featureService");
        this.a = hq3Var;
    }

    public final h8 a(String str) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        int hashCode = str.hashCode();
        if (hashCode != 49809) {
            if (hashCode != 53467) {
                if (hashCode == 54395 && str.equals("704")) {
                    return new x1c();
                }
            } else if (str.equals("616")) {
                return new db8();
            }
        } else if (str.equals("276")) {
            return new jn2();
        }
        return new j8(this.a);
    }
}
