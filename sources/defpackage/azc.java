package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: azc  reason: default package */
/* loaded from: classes2.dex */
public final class azc implements uyc {
    private static azc c;
    private final Context a;
    private final ContentObserver b;

    private azc() {
        this.a = null;
        this.b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static azc a(Context context) {
        azc azcVar;
        azc azcVar2;
        synchronized (azc.class) {
            try {
                if (c == null) {
                    if (gy7.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        azcVar2 = new azc(context);
                    } else {
                        azcVar2 = new azc();
                    }
                    c = azcVar2;
                }
                azcVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return azcVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void b() {
        Context context;
        synchronized (azc.class) {
            try {
                azc azcVar = c;
                if (azcVar != null && (context = azcVar.a) != null && azcVar.b != null) {
                    context.getContentResolver().unregisterContentObserver(c.b);
                }
                c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.uyc
    /* renamed from: d */
    public final String k(final String str) {
        Context context = this.a;
        if (context != null && !oyc.b(context)) {
            try {
                return (String) yyc.a(new xyc() { // from class: zyc
                    @Override // defpackage.xyc
                    public final Object zza() {
                        return azc.this.c(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String c(String str) {
        return qxc.a(this.a.getContentResolver(), str, null);
    }

    private azc(Context context) {
        this.a = context;
        czc czcVar = new czc(this, null);
        this.b = czcVar;
        context.getContentResolver().registerContentObserver(sxc.a, true, czcVar);
    }
}
