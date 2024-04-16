package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: p8d  reason: default package */
/* loaded from: classes2.dex */
public final class p8d implements q8d {
    private static final izc<Boolean> a = new e0d(fzc.a("com.google.android.gms.measurement")).f().e().d("measurement.sessionid.enable_client_session_id", true);

    @Override // defpackage.q8d
    public final boolean b() {
        return a.b().booleanValue();
    }

    @Override // defpackage.q8d
    public final boolean zza() {
        return true;
    }
}
