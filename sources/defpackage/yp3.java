package defpackage;

import java.util.HashMap;
import java.util.List;
/* compiled from: FeatureAppModule_ProvidePerCountryFeaturesFactory.java */
/* renamed from: yp3  reason: default package */
/* loaded from: classes3.dex */
public final class yp3 implements no3<HashMap<String, List<bq3>>> {

    /* compiled from: FeatureAppModule_ProvidePerCountryFeaturesFactory.java */
    /* renamed from: yp3$a */
    /* loaded from: classes3.dex */
    private static final class a {
        private static final yp3 a = new yp3();
    }

    public static yp3 a() {
        return a.a;
    }

    public static HashMap<String, List<bq3>> c() {
        return (HashMap) jh8.e(up3.a.d());
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public HashMap<String, List<bq3>> get() {
        return c();
    }
}
