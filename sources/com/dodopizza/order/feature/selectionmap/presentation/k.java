package com.dodopizza.order.feature.selectionmap.presentation;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;
/* compiled from: SelectionMapView.kt */
@StateStrategyType(AddToEndSingleStrategy.class)
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\ba\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'J\b\u0010\t\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\u0006H&J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH&J\b\u0010\u0010\u001a\u00020\u0006H'J\b\u0010\u0011\u001a\u00020\u0006H'J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H'J<\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u0012H'J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH&J\u0010\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H'J\u0010\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H'J\u001a\u0010(\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010'\u001a\u00020\u0012H&J\u0010\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0012H'¨\u0006+"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/k;", "Lmoxy/MvpView;", "Laaa;", "vo", "Le91;", "clientDeliveryLocation", "", "Ne", "K7", "d6", "Lcom/dodopizza/order/feature/selectionmap/presentation/c;", "L5", "y7", "Ld88;", "selectedPizzeria", "x3", com.huawei.hms.opendevice.c.a, "j", "", "isInitialRequest", "E0", "pizzeria", "Ljb7;", "operationalTypeVo", "Lhn3;", "pizzeriaType", "isShortStreetNameEnabled", "isSelectedFromMap", "isNearestPizzeria", "W7", "Lcom/google/android/gms/maps/model/LatLngBounds;", "bounds", Image.TYPE_MEDIUM, "Lb68;", "pizzeriaVO", "c0", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "x0", "pinStatusChange", "Yd", "focusOnUser", "o", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface k extends MvpView {

    /* compiled from: SelectionMapView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ void a(k kVar, LatLng latLng, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    z = true;
                }
                kVar.Yd(latLng, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMapCoordinates");
        }
    }

    @StateStrategyType(OneExecutionStateStrategy.class)
    void E0(boolean z);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void K7(aaa aaaVar, e91 e91Var);

    void L5(c cVar);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void Ne(aaa aaaVar, e91 e91Var);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void W7(d88 d88Var, jb7 jb7Var, hn3 hn3Var, boolean z, boolean z2, boolean z3);

    void Yd(LatLng latLng, boolean z);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void c();

    @StateStrategyType(OneExecutionStateStrategy.class)
    void c0(b68 b68Var);

    void d6();

    @StateStrategyType(SkipStrategy.class)
    void j();

    void m(LatLngBounds latLngBounds);

    @StateStrategyType(SkipStrategy.class)
    void o(boolean z);

    @StateStrategyType(OneExecutionStateStrategy.class)
    void x0(LatLng latLng);

    void x3(d88 d88Var);

    void y7();
}
