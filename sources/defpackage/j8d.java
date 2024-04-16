package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: j8d  reason: default package */
/* loaded from: classes2.dex */
public final class j8d implements k8d {
    private static final izc<Boolean> a;
    private static final izc<Boolean> b;
    private static final izc<Boolean> c;
    private static final izc<Boolean> d;
    private static final izc<Boolean> e;
    private static final izc<Boolean> f;
    private static final izc<Boolean> g;
    private static final izc<Boolean> h;
    private static final izc<Boolean> i;
    private static final izc<Boolean> j;
    private static final izc<Boolean> k;
    private static final izc<Boolean> l;
    private static final izc<Boolean> m;
    private static final izc<Boolean> n;

    static {
        e0d e2 = new e0d(fzc.a("com.google.android.gms.measurement")).f().e();
        a = e2.d("measurement.redaction.app_instance_id", true);
        b = e2.d("measurement.redaction.client_ephemeral_aiid_generation", true);
        c = e2.d("measurement.redaction.config_redacted_fields", true);
        d = e2.d("measurement.redaction.device_info", true);
        e = e2.d("measurement.redaction.e_tag", true);
        f = e2.d("measurement.redaction.enhanced_uid", true);
        g = e2.d("measurement.redaction.populate_ephemeral_app_instance_id", true);
        h = e2.d("measurement.redaction.google_signals", true);
        i = e2.d("measurement.redaction.no_aiid_in_config_request", true);
        j = e2.d("measurement.redaction.retain_major_os_version", true);
        k = e2.d("measurement.redaction.scion_payload_generator", true);
        l = e2.d("measurement.redaction.upload_redacted_fields", true);
        m = e2.d("measurement.redaction.upload_subdomain_override", true);
        n = e2.d("measurement.redaction.user_id", true);
    }

    @Override // defpackage.k8d
    public final boolean b() {
        return k.b().booleanValue();
    }

    @Override // defpackage.k8d
    public final boolean zza() {
        return j.b().booleanValue();
    }
}
