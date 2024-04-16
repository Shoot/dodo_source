package defpackage;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.google.i18n.phonenumbers.b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: PhoneFormatDetector.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Ll28;", "Lk28;", "", LocalityEntity.FIELD_COUNTRY_CODE, "", "phoneCountryCode", "Lj28;", "defaultFormat", "a", "Lm28;", "Lm28;", "phoneFormatRepository", "Lcom/google/i18n/phonenumbers/b;", "b", "Lcom/google/i18n/phonenumbers/b;", "phoneNumberUtil", "<init>", "(Lm28;)V", "phonenumber"}, k = 1, mv = {1, 9, 0})
/* renamed from: l28  reason: default package */
/* loaded from: classes2.dex */
public final class l28 implements k28 {
    private final m28 a;
    private final b b;

    public l28(m28 m28Var) {
        z65.h(m28Var, "phoneFormatRepository");
        this.a = m28Var;
        b v = b.v();
        z65.g(v, "getInstance(...)");
        this.b = v;
    }

    @Override // defpackage.k28
    public j28 a(String str, int i, j28 j28Var) {
        j28 j28Var2;
        z65.h(j28Var, "defaultFormat");
        Map<String, j28> all = this.a.getAll();
        Object obj = null;
        if (str != null) {
            j28Var2 = all.get(str);
        } else {
            j28Var2 = null;
        }
        if (j28Var2 == null) {
            List<String> G = this.b.G(i);
            if (G.contains(j28Var.a())) {
                j28Var2 = j28Var;
            } else {
                z65.e(G);
                Iterator<T> it = G.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (all.containsKey((String) next)) {
                        obj = next;
                        break;
                    }
                }
                j28Var2 = all.get((String) obj);
            }
        }
        if (j28Var2 != null) {
            return j28Var2;
        }
        return j28Var;
    }
}
