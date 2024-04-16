package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: v6d  reason: default package */
/* loaded from: classes2.dex */
public final class v6d implements s6d {
    private static final izc<Boolean> a;
    private static final izc<Boolean> b;
    private static final izc<Boolean> c;
    private static final izc<Boolean> d;

    static {
        e0d e = new e0d(fzc.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        b = e.d("measurement.audience.refresh_event_count_filters_timestamp", false);
        c = e.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        d = e.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // defpackage.s6d
    public final boolean b() {
        return b.b().booleanValue();
    }

    @Override // defpackage.s6d
    public final boolean c() {
        return c.b().booleanValue();
    }

    @Override // defpackage.s6d
    public final boolean d() {
        return d.b().booleanValue();
    }

    @Override // defpackage.s6d
    public final boolean zza() {
        return true;
    }
}
