package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.maps.model.LatLngBounds;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: DeliveryAddressMapInteractor.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u001a\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f2\u0006\u0010\t\u001a\u00020\bH&J\"\u0010\u0012\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0014\u001a\u00020\u0013H&¨\u0006\u0015"}, d2 = {"Lmw2;", "", "", "lat", "lon", "Loz3;", "La66;", "a", "Le91;", "clientDeliveryLocation", "Lwx;", "", "Lcom/dodopizza/async/AsyncJob;", DateTokenConverter.CONVERTER_KEY, "Ljx2;", "deliveryLocation", "", "clientPhoneNumber", "b", "Lcom/google/android/gms/maps/model/LatLngBounds;", c.a, "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: mw2  reason: default package */
/* loaded from: classes2.dex */
public interface mw2 {
    oz3<a66> a(double d, double d2);

    wx<Unit> b(jx2 jx2Var, String str);

    LatLngBounds c();

    wx<Unit> d(e91 e91Var);
}
