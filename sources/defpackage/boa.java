package defpackage;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.5.1 */
/* renamed from: boa  reason: default package */
/* loaded from: classes2.dex */
public abstract class boa extends b<a.d.c> {
    private static final a.g<obd> k;
    private static final a.AbstractC0215a<obd, a.d.c> l;
    private static final a<a.d.c> m;

    static {
        a.g<obd> gVar = new a.g<>();
        k = gVar;
        zlc zlcVar = new zlc();
        l = zlcVar;
        m = new a<>("SmsRetriever.API", zlcVar, gVar);
    }

    public boa(@RecentlyNonNull Context context) {
        super(context, m, a.d.I4, b.a.c);
    }

    @RecentlyNonNull
    public abstract y6b<Void> y();
}
