package defpackage;

import android.location.Location;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: PizzeriasMap.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016R$\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lxa8;", "Lis4;", "Lhs4;", "myLocationConsumer", "", "a", "", c.a, "Landroid/location/Location;", "b", "destroy", "Landroid/location/Location;", "getLastLocation", "()Landroid/location/Location;", DateTokenConverter.CONVERTER_KEY, "(Landroid/location/Location;)V", "lastLocation", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: xa8  reason: default package */
/* loaded from: classes4.dex */
public final class xa8 implements is4 {
    private Location a;

    @Override // defpackage.is4
    public boolean a(hs4 hs4Var) {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.is4
    public Location b() {
        return this.a;
    }

    public final void d(Location location) {
        this.a = location;
    }

    @Override // defpackage.is4
    public void c() {
    }

    @Override // defpackage.is4
    public void destroy() {
    }
}
