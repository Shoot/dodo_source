package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.wl5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LanguageService.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0007B#\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\"\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013¨\u0006\u0017"}, d2 = {"Lxl5;", "Lwl5;", "Ltl5;", "languageConfig", "", "f", e.a, "a", "newLanguageConfig", "Lwl5$a;", DateTokenConverter.CONVERTER_KEY, c.a, "", LocalityEntity.FIELD_COUNTRY_CODE, "b", "Lvl5;", "Lvl5;", "repository", "", "Ljava/util/Map;", "countryCodeAndDefaultLanguage", "<init>", "(Lvl5;Ljava/util/Map;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xl5  reason: default package */
/* loaded from: classes4.dex */
public final class xl5 implements wl5 {
    public static final a c = new a(null);
    private static final tl5 d = olb.a.b();
    private final vl5 a;
    private Map<String, tl5> b;

    /* compiled from: LanguageService.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxl5$a;", "", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xl5$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public xl5(vl5 vl5Var, Map<String, tl5> map) {
        Map<String, tl5> p;
        z65.h(vl5Var, "repository");
        z65.h(map, "countryCodeAndDefaultLanguage");
        this.a = vl5Var;
        this.b = map;
        p = g86.p(map, lnb.a("", d));
        this.b = p;
    }

    private final tl5 e() {
        Object b0;
        Object next;
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.b.values()) {
            if (z65.c(((tl5) obj).b(), Locale.getDefault().getLanguage())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (z65.c(((tl5) obj2).a(), Locale.getDefault().getCountry())) {
                arrayList2.add(obj2);
            }
        }
        b0 = sc1.b0(arrayList2);
        tl5 tl5Var = (tl5) b0;
        if (tl5Var == null) {
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                next = null;
            } else {
                next = it.next();
                if (it.hasNext()) {
                    String a2 = ((tl5) next).a();
                    do {
                        Object next2 = it.next();
                        String a3 = ((tl5) next2).a();
                        if (a2.compareTo(a3) > 0) {
                            next = next2;
                            a2 = a3;
                        }
                    } while (it.hasNext());
                }
            }
            tl5 tl5Var2 = (tl5) next;
            if (tl5Var2 == null) {
                return d;
            }
            return tl5Var2;
        }
        return tl5Var;
    }

    private final void f(tl5 tl5Var) {
        this.a.c(tl5Var);
    }

    @Override // defpackage.wl5
    public tl5 a() {
        return this.a.d();
    }

    @Override // defpackage.wl5
    public tl5 b(String str) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        tl5 tl5Var = this.b.get(str);
        if (tl5Var == null) {
            return d;
        }
        return tl5Var;
    }

    @Override // defpackage.wl5
    public tl5 c() {
        tl5 e = e();
        f(e);
        return e;
    }

    @Override // defpackage.wl5
    public wl5.a d(tl5 tl5Var) {
        z65.h(tl5Var, "newLanguageConfig");
        if (!z65.c(this.a.d(), tl5Var)) {
            f(tl5Var);
            return wl5.a.C0724a.a;
        }
        return wl5.a.b.a;
    }
}
