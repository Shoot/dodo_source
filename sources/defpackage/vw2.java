package defpackage;

import com.google.android.gms.maps.model.LatLngBounds;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: DeliveryAddressMapView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000bH&J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000bH&J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&J\b\u0010\u0015\u001a\u00020\u0004H&J\b\u0010\u0016\u001a\u00020\u0004H&J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u000bH&J\b\u0010\u0019\u001a\u00020\u0004H&¨\u0006\u001a"}, d2 = {"Lvw2;", "Lmoxy/MvpView;", "La66;", "addressVO", "", "P5", c.a, "dh", "Lov5;", "location", "w7", "", "isVisible", "y9", "maxZoomLevelReached", "ea", "K5", "q9", "Lcom/google/android/gms/maps/model/LatLngBounds;", "latLngBounds", "G1", "kb", e.a, "isLoading", "l", "Rf", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vw2  reason: default package */
/* loaded from: classes2.dex */
public interface vw2 extends MvpView {
    void G1(LatLngBounds latLngBounds);

    void K5(boolean z);

    void P5(a66 a66Var);

    void Rf();

    void c();

    void dh();

    void e();

    void ea(boolean z);

    void kb();

    void l(boolean z);

    void q9(boolean z);

    void w7(ov5 ov5Var);

    void y9(boolean z);
}
