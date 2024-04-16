package defpackage;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.location.LocationSettingsRequest;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: aga  reason: default package */
/* loaded from: classes2.dex */
public class aga extends b<a.d.c> {
    public aga(@RecentlyNonNull Context context) {
        super(context, dw5.a, a.d.I4, b.a.c);
    }

    @RecentlyNonNull
    public y6b<hw5> y(@RecentlyNonNull final LocationSettingsRequest locationSettingsRequest) {
        return i(h.a().c(new yc9(locationSettingsRequest) { // from class: esc
            private final LocationSettingsRequest a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = locationSettingsRequest;
            }

            @Override // defpackage.yc9
            public final void a(Object obj, Object obj2) {
                ((ypc) obj).m0(this.a, new gsc((a7b) obj2), null);
            }
        }).f(2426).a());
    }
}
