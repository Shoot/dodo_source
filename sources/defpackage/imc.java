package defpackage;

import com.google.android.gms.common.Feature;
/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.2.0 */
/* renamed from: imc  reason: default package */
/* loaded from: classes2.dex */
public final class imc {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature d;
    public static final Feature e;
    public static final Feature f;
    public static final Feature g;
    public static final Feature h;
    public static final Feature[] i;

    static {
        Feature feature = new Feature("auth_blockstore", 3L);
        a = feature;
        Feature feature2 = new Feature("blockstore_data_transfer", 1L);
        b = feature2;
        Feature feature3 = new Feature("blockstore_notify_app_restore", 1L);
        c = feature3;
        Feature feature4 = new Feature("blockstore_store_bytes_with_options", 2L);
        d = feature4;
        Feature feature5 = new Feature("blockstore_is_end_to_end_encryption_available", 1L);
        e = feature5;
        Feature feature6 = new Feature("blockstore_enable_cloud_backup", 1L);
        f = feature6;
        Feature feature7 = new Feature("blockstore_delete_bytes", 2L);
        g = feature7;
        Feature feature8 = new Feature("blockstore_retrieve_bytes_with_options", 3L);
        h = feature8;
        i = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8};
    }
}
