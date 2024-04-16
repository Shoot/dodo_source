package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: o7d  reason: default package */
/* loaded from: classes2.dex */
public final class o7d implements p7d {
    private static final izc<Boolean> a;
    private static final izc<Boolean> b;
    private static final izc<Boolean> c;
    private static final izc<Long> d;

    static {
        e0d e = new e0d(fzc.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.sdk.collection.enable_extend_user_property_size", true);
        b = e.d("measurement.sdk.collection.last_deep_link_referrer2", true);
        c = e.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        d = e.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // defpackage.p7d
    public final boolean zza() {
        return c.b().booleanValue();
    }
}
