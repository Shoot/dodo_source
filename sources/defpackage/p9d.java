package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: p9d  reason: default package */
/* loaded from: classes2.dex */
public final class p9d implements m9d {
    private static final izc<Boolean> a;
    private static final izc<Boolean> b;

    static {
        e0d e = new e0d(fzc.a("com.google.android.gms.measurement")).f().e();
        a = e.d("measurement.tcf.client.dev", false);
        b = e.d("measurement.tcf.service", false);
    }

    @Override // defpackage.m9d
    public final boolean b() {
        return a.b().booleanValue();
    }

    @Override // defpackage.m9d
    public final boolean c() {
        return b.b().booleanValue();
    }

    @Override // defpackage.m9d
    public final boolean zza() {
        return true;
    }
}
