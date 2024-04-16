package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: t5d  reason: default package */
/* loaded from: classes2.dex */
public final class t5d implements q5d {
    private static final izc<Boolean> a;
    private static final izc<Boolean> b;
    private static final izc<Boolean> c;
    private static final izc<Long> d;

    static {
        e0d e = new e0d(fzc.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.client.consent_state_v1", true);
        b = e.d("measurement.client.3p_consent_state_v1", true);
        c = e.d("measurement.service.consent_state_v1_W36", true);
        d = e.b("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // defpackage.q5d
    public final long zza() {
        return d.b().longValue();
    }
}
