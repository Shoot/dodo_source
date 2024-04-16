package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: gsc  reason: default package */
/* loaded from: classes2.dex */
final class gsc implements p70<LocationSettingsResult> {
    private final a7b<hw5> a;

    public gsc(a7b<hw5> a7bVar) {
        this.a = a7bVar;
    }

    @Override // defpackage.p70
    public final /* bridge */ /* synthetic */ void a(LocationSettingsResult locationSettingsResult) {
        LocationSettingsResult locationSettingsResult2 = locationSettingsResult;
        Status d = locationSettingsResult2.d();
        if (d.v()) {
            this.a.c(new hw5(locationSettingsResult2));
        } else if (d.u()) {
            this.a.b(new ResolvableApiException(d));
        } else {
            this.a.b(new ApiException(d));
        }
    }
}
