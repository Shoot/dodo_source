package defpackage;

import android.os.Binder;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: yyc  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class yyc {
    public static <V> V a(xyc<V> xycVar) {
        try {
            return xycVar.zza();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return xycVar.zza();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }
}
