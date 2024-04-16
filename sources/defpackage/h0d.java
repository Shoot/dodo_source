package defpackage;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: h0d  reason: default package */
/* loaded from: classes2.dex */
public final class h0d {
    private final boolean a;

    public h0d(k0d k0dVar) {
        hh8.j(k0dVar, "BuildInfo must be non-null");
        this.a = !k0dVar.zza();
    }

    public final boolean a(String str) {
        hh8.j(str, "flagName must not be null");
        if (!this.a) {
            return true;
        }
        return j0d.a.get().b(str);
    }
}
