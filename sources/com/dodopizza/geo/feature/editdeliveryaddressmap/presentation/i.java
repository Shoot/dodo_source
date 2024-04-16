package com.dodopizza.geo.feature.editdeliveryaddressmap.presentation;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k9a;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: EditDeliveryAddressMapView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0006H'J\b\u0010\r\u001a\u00020\u0004H'J\b\u0010\u000e\u001a\u00020\u0004H'J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH'J\b\u0010\u0012\u001a\u00020\u0004H'J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H'J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH'J\b\u0010\u0017\u001a\u00020\u0004H'J\b\u0010\u0018\u001a\u00020\u0004H'J\b\u0010\u0019\u001a\u00020\u0004H'¨\u0006\u001a"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/i;", "Lmoxy/MvpView;", "Lw56;", "addressVO", "", "D5", "", "isInitialRequest", "E0", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "changePinStatus", "Q2", com.huawei.hms.opendevice.c.a, "a", "Lk9a$b;", "request", "q", "y0", "Lcom/google/android/gms/maps/model/LatLngBounds;", "bounds", Image.TYPE_MEDIUM, "d0", "B4", "Jg", "m7", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface i extends MvpView {

    /* compiled from: EditDeliveryAddressMapView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ void a(i iVar, LatLng latLng, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                iVar.Q2(latLng, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showLocationWithAnimation");
        }
    }

    @StateStrategyType(OneExecutionStateStrategy.class)
    void B4();

    void D5(w56 w56Var);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void E0(boolean z);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void Jg();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void Q2(LatLng latLng, boolean z);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void a();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void c();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void d0(LatLng latLng);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void m(LatLngBounds latLngBounds);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void m7();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void q(k9a.b bVar);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void y0();
}
