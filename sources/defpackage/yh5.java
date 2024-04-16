package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.zh5;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.i;
/* compiled from: KustoExperimentsInterceptor.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00062\u00020\u0001:\u0002\u000b\u0004B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0002J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0014"}, d2 = {"Lyh5;", "Lrc;", "", "", "b", "", c.a, "Llc;", "consumer", "Lqc;", "event", "a", "Lld9;", "Lld9;", "remoteConfigService", "Lzh5;", "Lzh5;", "featureDataProvider", "<init>", "(Lld9;Lzh5;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: yh5  reason: default package */
/* loaded from: classes3.dex */
public final class yh5 implements rc {
    private static final a c = new a(null);
    private static final List<String> d;
    private final ld9 a;
    private final zh5 b;

    /* compiled from: KustoExperimentsInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lyh5$a;", "", "", "EXPERIMENTS_PARAM_KEY", "Ljava/lang/String;", "FEATURES_PARAM_KEY", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: yh5$a */
    /* loaded from: classes3.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: KustoExperimentsInterceptor.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lyh5$b;", "", "Lhq3;", "featureService", "Lyh5;", "a", "Lld9;", "Lld9;", "remoteConfigService", "Lzh5$a;", "b", "Lzh5$a;", "kustoFeaturesDataProviderFactory", "<init>", "(Lld9;Lzh5$a;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: yh5$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private final ld9 a;
        private final zh5.a b;

        public b(ld9 ld9Var, zh5.a aVar) {
            z65.h(ld9Var, "remoteConfigService");
            z65.h(aVar, "kustoFeaturesDataProviderFactory");
            this.a = ld9Var;
            this.b = aVar;
        }

        public final yh5 a(hq3 hq3Var) {
            z65.h(hq3Var, "featureService");
            return new yh5(this.a, this.b.a(hq3Var));
        }
    }

    static {
        List<String> o;
        o = kc1.o("select_order_type_on_start_segment", "redesign_deferred_time_segment", "cart_scrollable_button_segment", "personal_offers_in_cart_android_segment", "dodocoin_balance_in_menu_android_segment", "drinks_two_column_segment", "distance_to_delivery_address_validation_segment", "combo_customize_sections_rearrangement_segment", "menu_subcategories_segment", "profile_in_header_segment", "choose_order_type_variants_segment", "show_infinite_upsell_android_segment");
        d = o;
    }

    public yh5(ld9 ld9Var, zh5 zh5Var) {
        z65.h(ld9Var, "remoteConfigService");
        z65.h(zh5Var, "featureDataProvider");
        this.a = ld9Var;
        this.b = zh5Var;
    }

    private final Map<String, String> b() {
        int w;
        int e;
        int e2;
        Map<String, String> d2 = this.a.d();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : d) {
            if (d2.containsKey((String) obj)) {
                arrayList.add(obj);
            }
        }
        w = lc1.w(arrayList, 10);
        e = f86.e(w);
        e2 = i.e(e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (String str : arrayList) {
            String str2 = d2.get(str);
            z65.e(str2);
            linkedHashMap.put(str, str2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((String) entry.getValue()).length() > 0) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap2;
    }

    private final List<String> c() {
        List<String> F0;
        F0 = sc1.F0(this.b.a());
        return F0;
    }

    @Override // defpackage.rc
    public qc a(lc lcVar, qc qcVar) {
        Map p;
        Map p2;
        z65.h(lcVar, "consumer");
        z65.h(qcVar, "event");
        if (lcVar instanceof ph5) {
            p = g86.p(qcVar.d(), lnb.a("experiments", b()));
            p2 = g86.p(p, lnb.a("features", c()));
            return qc.b(qcVar, null, null, p2, 3, null);
        }
        return qcVar;
    }
}
