package defpackage;

import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: nzc  reason: default package */
/* loaded from: classes2.dex */
public final class nzc extends izc<Long> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public nzc(e0d e0dVar, String str, Long l, boolean z) {
        super(e0dVar, str, l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.izc
    /* renamed from: o */
    public final Long c(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String k = super.k();
        String valueOf = String.valueOf(obj);
        Log.e("PhenotypeFlag", "Invalid long value for " + k + ": " + valueOf);
        return null;
    }
}
