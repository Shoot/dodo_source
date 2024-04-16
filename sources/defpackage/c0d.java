package defpackage;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: c0d  reason: default package */
/* loaded from: classes2.dex */
public final class c0d extends izc<Double> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public c0d(e0d e0dVar, String str, Double d, boolean z) {
        super(e0dVar, str, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.izc
    /* renamed from: o */
    public final Double c(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String k = super.k();
        String valueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", "Invalid double value for " + k + ": " + valueOf);
        return null;
    }
}
