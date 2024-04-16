package defpackage;
/* compiled from: FirebasePerfApplicationInfoValidator.java */
/* renamed from: ow3  reason: default package */
/* loaded from: classes2.dex */
public class ow3 extends yx7 {
    private static final sh b = sh.e();
    private final np a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ow3(np npVar) {
        this.a = npVar;
    }

    private boolean g() {
        np npVar = this.a;
        if (npVar == null) {
            b.j("ApplicationInfo is null");
            return false;
        } else if (!npVar.l0()) {
            b.j("GoogleAppId is null");
            return false;
        } else if (!this.a.j0()) {
            b.j("AppInstanceId is null");
            return false;
        } else if (!this.a.k0()) {
            b.j("ApplicationProcessState is null");
            return false;
        } else if (this.a.i0()) {
            if (!this.a.f0().e0()) {
                b.j("AndroidAppInfo.packageName is null");
                return false;
            } else if (!this.a.f0().f0()) {
                b.j("AndroidAppInfo.sdkVersion is null");
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @Override // defpackage.yx7
    public boolean c() {
        if (!g()) {
            b.j("ApplicationInfo is invalid");
            return false;
        }
        return true;
    }
}
