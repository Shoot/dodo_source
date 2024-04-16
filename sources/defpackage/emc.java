package defpackage;

import com.google.android.gms.common.Feature;
/* compiled from: com.google.android.gms:play-services-instantapps@@17.0.1 */
/* renamed from: emc  reason: default package */
/* loaded from: classes2.dex */
public final class emc {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature d;
    public static final Feature[] e;

    static {
        Feature feature = new Feature("device_enabled_api", 1L);
        a = feature;
        Feature feature2 = new Feature("instant_app_removed_api", 1L);
        b = feature2;
        Feature feature3 = new Feature("instant_app_installed_api", 1L);
        c = feature3;
        Feature feature4 = new Feature("instant_app_uninstalled_api", 1L);
        d = feature4;
        e = new Feature[]{feature, feature2, feature3, feature4};
    }
}
