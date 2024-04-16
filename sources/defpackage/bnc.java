package defpackage;

import com.google.android.gms.common.Feature;
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* renamed from: bnc  reason: default package */
/* loaded from: classes2.dex */
public final class bnc {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature d;
    public static final Feature[] e;

    static {
        Feature feature = new Feature("sms_code_autofill", 2L);
        a = feature;
        Feature feature2 = new Feature("sms_code_browser", 2L);
        b = feature2;
        Feature feature3 = new Feature("sms_retrieve", 1L);
        c = feature3;
        Feature feature4 = new Feature("user_consent", 3L);
        d = feature4;
        e = new Feature[]{feature, feature2, feature3, feature4};
    }
}
