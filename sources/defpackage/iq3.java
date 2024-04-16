package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
/* compiled from: FeatureService.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001Ba\b\u0007\u0012.\u0010\u0012\u001a*\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000fj\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004`\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b%\u0010&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0016R<\u0010\u0012\u001a*\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000fj\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Liq3;", "Lhq3;", "", LocalityEntity.FIELD_COUNTRY_CODE, "", "Lbq3;", c.a, "", "features", "", "b", "featureCode", "", "a", "getAll", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "featuresByCountry", "Lfq3;", "Lfq3;", "featureRepository", "Lry1;", "Lry1;", "countryRepository", "Lyhb;", DateTokenConverter.CONVERTER_KEY, "Lyhb;", "toggleService", "Lmh0;", e.a, "Lmh0;", "buildInfo", "Lgy3;", "f", "Lgy3;", "firebaseToggleService", "<init>", "(Ljava/util/HashMap;Lfq3;Lry1;Lyhb;Lmh0;Lgy3;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: iq3  reason: default package */
/* loaded from: classes4.dex */
public final class iq3 implements hq3 {
    private final HashMap<String, List<bq3>> a;
    private final fq3 b;
    private final ry1 c;
    private final yhb d;
    private final mh0 e;
    private final gy3 f;

    public iq3(HashMap<String, List<bq3>> hashMap, fq3 fq3Var, ry1 ry1Var, yhb yhbVar, mh0 mh0Var, gy3 gy3Var) {
        z65.h(hashMap, "featuresByCountry");
        z65.h(fq3Var, "featureRepository");
        z65.h(ry1Var, "countryRepository");
        z65.h(yhbVar, "toggleService");
        z65.h(mh0Var, "buildInfo");
        z65.h(gy3Var, "firebaseToggleService");
        this.a = hashMap;
        this.b = fq3Var;
        this.c = ry1Var;
        this.d = yhbVar;
        this.e = mh0Var;
        this.f = gy3Var;
    }

    private final List<bq3> c(String str) {
        List<bq3> list;
        List<bq3> q0;
        List<bq3> list2 = this.a.get(str);
        if (list2 == null) {
            list2 = kc1.l();
        }
        List<bq3> list3 = list2;
        ay1 q = this.c.q(str);
        if (q != null) {
            list = q.d();
        } else {
            list = null;
        }
        if (list == null) {
            list = kc1.l();
        }
        q0 = sc1.q0(list3, list);
        return q0;
    }

    @Override // defpackage.hq3
    public boolean a(bq3 bq3Var) {
        whb a;
        z65.h(bq3Var, "featureCode");
        if (this.e.i() && (a = this.d.a(bq3Var)) != null) {
            return a.a();
        }
        if (!this.b.getAll().contains(bq3Var) && !this.f.a(bq3Var)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.hq3
    public void b(Collection<? extends bq3> collection, String str) {
        List q0;
        z65.h(collection, "features");
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        this.b.clear();
        q0 = sc1.q0(collection, c(str));
        this.b.save(q0);
    }

    @Override // defpackage.hq3
    public Collection<bq3> getAll() {
        return this.b.getAll();
    }
}
