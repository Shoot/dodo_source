package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: KustoFeaturesDataProvider.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\bR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lzh5;", "", "", "", c.a, "b", "a", "Lld9;", "Lld9;", "remoteConfigService", "Lhq3;", "Lhq3;", "featureService", "<init>", "(Lld9;Lhq3;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: zh5  reason: default package */
/* loaded from: classes3.dex */
public final class zh5 {
    private final ld9 a;
    private final hq3 b;

    /* compiled from: KustoFeaturesDataProvider.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lzh5$a;", "", "Lhq3;", "featureService", "Lzh5;", "a", "Lld9;", "Lld9;", "remoteConfigService", "<init>", "(Lld9;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zh5$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final ld9 a;

        public a(ld9 ld9Var) {
            z65.h(ld9Var, "remoteConfigService");
            this.a = ld9Var;
        }

        public final zh5 a(hq3 hq3Var) {
            z65.h(hq3Var, "featureService");
            return new zh5(this.a, hq3Var);
        }
    }

    public zh5(ld9 ld9Var, hq3 hq3Var) {
        z65.h(ld9Var, "remoteConfigService");
        z65.h(hq3Var, "featureService");
        this.a = ld9Var;
        this.b = hq3Var;
    }

    private final Collection<String> b() {
        int w;
        Collection<bq3> all = this.b.getAll();
        w = lc1.w(all, 10);
        ArrayList arrayList = new ArrayList(w);
        for (bq3 bq3Var : all) {
            arrayList.add(bq3Var.getValue());
        }
        return arrayList;
    }

    private final Collection<String> c() {
        Map<String, Boolean> c = this.a.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Boolean> entry : c.entrySet()) {
            if (entry.getValue().booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    public Collection<String> a() {
        List q0;
        q0 = sc1.q0(c(), b());
        return q0;
    }
}
