package defpackage;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: mzc  reason: default package */
/* loaded from: classes2.dex */
public final class mzc extends izc<Boolean> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public mzc(e0d e0dVar, String str, Boolean bool, boolean z) {
        super(e0dVar, str, bool);
    }

    @Override // defpackage.izc
    final /* synthetic */ Boolean c(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (sxc.c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (sxc.d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String k = super.k();
        String valueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", "Invalid boolean value for " + k + ": " + valueOf);
        return null;
    }
}
