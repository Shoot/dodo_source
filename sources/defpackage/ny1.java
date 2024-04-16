package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: CountryLanguageConfigService.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0015"}, d2 = {"Lny1;", "", "", LocalityEntity.FIELD_COUNTRY_CODE, "Lay1;", "b", "Ltl5;", "f", e.a, "", "a", c.a, DateTokenConverter.CONVERTER_KEY, "Lwl5;", "Lwl5;", "languageService", "Lry1;", "Lry1;", "countryRepository", "<init>", "(Lwl5;Lry1;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ny1  reason: default package */
/* loaded from: classes4.dex */
public final class ny1 {
    private final wl5 a;
    private final ry1 b;

    public ny1(wl5 wl5Var, ry1 ry1Var) {
        z65.h(wl5Var, "languageService");
        z65.h(ry1Var, "countryRepository");
        this.a = wl5Var;
        this.b = ry1Var;
    }

    private final ay1 b(String str) {
        return this.b.q(str);
    }

    private final tl5 e(String str) {
        return this.a.b(str);
    }

    private final tl5 f(String str) {
        String Q0;
        String K0;
        Q0 = m0b.Q0(str, "-", null, 2, null);
        K0 = m0b.K0(str, "-", null, 2, null);
        return new tl5(Q0, K0);
    }

    public final List<tl5> a(String str) {
        List<tl5> e;
        List<String> i;
        int w;
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        ay1 b = b(str);
        if (b == null || (i = b.i()) == null) {
            e = jc1.e(e(str));
            return e;
        }
        List<String> list = i;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        for (String str2 : list) {
            arrayList.add(f(str2));
        }
        return arrayList;
    }

    public final tl5 c(String str) {
        Object obj;
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        List<tl5> a = a(str);
        tl5 a2 = this.a.a();
        Iterator<T> it = a.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String b = ((tl5) next).b();
            if (a2 != null) {
                obj = a2.b();
            }
            if (z65.c(b, obj)) {
                obj = next;
                break;
            }
        }
        tl5 tl5Var = (tl5) obj;
        if (tl5Var == null) {
            return d(str);
        }
        return tl5Var;
    }

    public final tl5 d(String str) {
        String c;
        tl5 f;
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        ay1 b = b(str);
        if (b == null || (c = b.c()) == null || (f = f(c)) == null) {
            return e(str);
        }
        return f;
    }
}
