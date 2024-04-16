package defpackage;

import android.content.ContentResolver;
import android.database.Cursor;
import com.google.android.gms.internal.measurement.zzgb;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: kyc  reason: default package */
/* loaded from: classes2.dex */
public final class kyc implements lyc {
    @Override // defpackage.lyc
    public final String a(ContentResolver contentResolver, String str) throws zzgb {
        Cursor query = contentResolver.query(sxc.a, null, null, new String[]{str}, null);
        try {
            if (query != null) {
                if (query.moveToFirst()) {
                    String string = query.getString(1);
                    query.close();
                    return string;
                }
                query.close();
                return null;
            }
            throw new zzgb("Failed to connect to GservicesProvider");
        } catch (Throwable th) {
            if (query != null) {
                try {
                    query.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // defpackage.lyc
    public final <T extends Map<String, String>> T b(ContentResolver contentResolver, String[] strArr, yxc<T> yxcVar) throws zzgb {
        Cursor query = contentResolver.query(sxc.b, null, null, strArr, null);
        try {
            if (query != null) {
                T e = yxcVar.e(query.getCount());
                while (query.moveToNext()) {
                    e.put(query.getString(0), query.getString(1));
                }
                query.close();
                return e;
            }
            throw new zzgb("Failed to connect to GservicesProvider");
        } catch (Throwable th) {
            if (query != null) {
                try {
                    query.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
