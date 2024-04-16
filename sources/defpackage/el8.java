package defpackage;

import androidx.annotation.RecentlyNonNull;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* renamed from: el8  reason: default package */
/* loaded from: classes2.dex */
public class el8 {
    Map<String, String> a = new HashMap();

    @RecentlyNonNull
    public final Map<String, String> a(@RecentlyNonNull String str) {
        String str2;
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, String> entry : this.a.entrySet()) {
            String valueOf = String.valueOf(str);
            String valueOf2 = String.valueOf(entry.getKey());
            if (valueOf2.length() != 0) {
                str2 = valueOf.concat(valueOf2);
            } else {
                str2 = new String(valueOf);
            }
            hashMap.put(str2, entry.getValue());
        }
        return hashMap;
    }

    @RecentlyNonNull
    public String toString() {
        return g2d.zzb(this.a);
    }
}
