package defpackage;

import android.content.Context;
import android.location.LocationManager;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: LocationSettingsCheckerImpl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lfw5;", "Lew5;", "", "a", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fw5  reason: default package */
/* loaded from: classes4.dex */
public final class fw5 implements ew5 {
    private final Context a;

    public fw5(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context;
    }

    @Override // defpackage.ew5
    public boolean a() {
        LocationManager locationManager = (LocationManager) iu1.i(this.a, LocationManager.class);
        if (locationManager != null) {
            return locationManager.isProviderEnabled("gps");
        }
        return false;
    }
}
