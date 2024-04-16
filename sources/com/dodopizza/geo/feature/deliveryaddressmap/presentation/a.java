package com.dodopizza.geo.feature.deliveryaddressmap.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.buttons.DodoButton;
import com.dodopizza.android.textinputlayout.DodoEditTextInputLayout;
import com.dodopizza.geo.feature.deliveryaddressmap.DeliveryAddressMapFeatureDependencies;
import com.dodopizza.geo.feature.deliveryaddressmap.presentation.DeliveryAddressMapPresenter;
import com.dodopizza.geo.feature.deliveryaddressmap.presentation.a;
import com.dodopizza.kustoworker.KustoStorage;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.material.snackbar.Snackbar;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.cw5;
import defpackage.fw2;
import defpackage.qv5;
import defpackage.rg4;
import defpackage.tj1;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: DeliveryAddressMapFragment.kt */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 ¹\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0004º\u0001»\u0001B\t¢\u0006\u0006\b·\u0001\u0010¸\u0001J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\f\u0010\r\u001a\u00020\f*\u00020\u000bH\u0002J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\u0010\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010!\u001a\u00020\u0006H\u0016J\b\u0010\"\u001a\u00020\u0006H\u0016J\u0010\u0010%\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0016J\"\u0010+\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016J\u0010\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u001fH\u0016J\u0010\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u001fH\u0016J\u0010\u00100\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u001fH\u0016J\u0010\u00101\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u001fH\u0016J\u0010\u00104\u001a\u00020\u00062\u0006\u00103\u001a\u000202H\u0016J\u0010\u00105\u001a\u00020\u00062\u0006\u00103\u001a\u000202H\u0016J\u0010\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u001fH\u0016J\b\u00108\u001a\u00020\u0006H\u0016R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010:\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010AR\u001b\u0010D\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010:\u001a\u0004\bC\u0010AR\u001b\u0010G\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010:\u001a\u0004\bF\u0010AR\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010:\u001a\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010:\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010:\u001a\u0004\bT\u0010UR\u001b\u0010Z\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010:\u001a\u0004\bX\u0010YR\u001b\u0010]\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010:\u001a\u0004\b\\\u0010YR\u001b\u0010_\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010:\u001a\u0004\b^\u0010YR\u001b\u0010b\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010:\u001a\u0004\ba\u0010YR\u001b\u0010e\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010:\u001a\u0004\bd\u0010YR\u001b\u0010j\u001a\u00020f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010:\u001a\u0004\bh\u0010iR\u001b\u0010m\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010:\u001a\u0004\bl\u0010YR\u001b\u0010p\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010:\u001a\u0004\bo\u0010YR\u001b\u0010s\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010:\u001a\u0004\br\u0010YR\u001b\u0010v\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bt\u0010:\u001a\u0004\bu\u0010KR\u001b\u0010y\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010:\u001a\u0004\bx\u0010KR\u001b\u0010|\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010:\u001a\u0004\b{\u0010KR\u001b\u0010\u007f\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b}\u0010:\u001a\u0004\b~\u0010AR\u001e\u0010\u0082\u0001\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010:\u001a\u0005\b\u0081\u0001\u0010AR\u001e\u0010\u0085\u0001\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010:\u001a\u0005\b\u0084\u0001\u0010YR\u001e\u0010\u0088\u0001\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010:\u001a\u0005\b\u0087\u0001\u0010UR\"\u0010\u008d\u0001\u001a\r \u008a\u0001*\u0005\u0018\u00010\u0089\u00010\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001b\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R*\u0010\u0098\u0001\u001a\u00030\u0091\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R*\u0010 \u0001\u001a\u00030\u0099\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R*\u0010¨\u0001\u001a\u00030¡\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R1\u0010±\u0001\u001a\n\u0012\u0005\u0012\u00030ª\u00010©\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R+\u0010¶\u0001\u001a\r \u008a\u0001*\u0005\u0018\u00010ª\u00010ª\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001¨\u0006¼\u0001"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddressmap/presentation/a;", "Lf70;", "Lvw2;", "Ln87;", "Lw50;", "Ltj1$a;", "", "Wh", "Loz3;", "Lcw5;", "Jh", "Ljq1;", "Lcom/dodopizza/android/buttons/DodoButton$a;", "Yh", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "Lrg4;", "googleMap", "p6", "Lcom/google/android/gms/maps/model/LatLngBounds;", "latLngBounds", "G1", "kb", com.huawei.hms.push.e.a, "La66;", "addressVO", "P5", "", "onBackPressed", com.huawei.hms.opendevice.c.a, "dh", "Lov5;", "location", "w7", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "isVisible", "y9", "maxZoomLevelReached", "ea", "K5", "q9", "", "id", "O8", "onCancel", "isLoading", "l", "Rf", "Landroidx/appcompat/widget/Toolbar;", "Lk79;", "Sh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "uh", "()Landroid/widget/TextView;", "address", "Th", "warning", "f", "Bh", "addressLocation", "Lcom/dodopizza/android/buttons/DodoButton;", "g", "Dh", "()Lcom/dodopizza/android/buttons/DodoButton;", "confirmButton", "Landroid/widget/Button;", Image.TYPE_HIGH, "Eh", "()Landroid/widget/Button;", "enterAddressManuallyButton", "Landroid/view/ViewGroup;", "i", "Ch", "()Landroid/view/ViewGroup;", "buttonContainer", "j", "Ah", "()Landroid/view/View;", "addressGroup", "k", "Fh", "error", "Kh", "myLocationButton", Image.TYPE_MEDIUM, "Uh", "zoomIn", "n", "Vh", "zoomOut", "Lcom/dodopizza/android/textinputlayout/DodoEditTextInputLayout;", "o", "zh", "()Lcom/dodopizza/android/textinputlayout/DodoEditTextInputLayout;", "addressField", "p", "wh", "addressCatcherGroup", "q", "Qh", "separator", "r", "Gh", "errorGroup", Image.TYPE_SMALL, "Lh", "notifyMeButton", "t", "Nh", "pickupOrderButton", "u", "Mh", "orderWithPickupButton", "v", "xh", "addressCatcherHeadline", "w", "yh", "addressCatcherMessage", "x", "Rh", "snackbarAnchor", "y", "vh", "addressCatcherButtonContainer", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "z", "Lorg/slf4j/Logger;", "logger", "A", "Lrg4;", "deliveryMap", "Lh37;", "B", "Lh37;", "getNotificationsPermission", "()Lh37;", "setNotificationsPermission", "(Lh37;)V", "notificationsPermission", "Lje4;", "I", "Lje4;", "Ih", "()Lje4;", "setGeoLocationProviderFactory", "(Lje4;)V", "geoLocationProviderFactory", "Lhq3;", "X", "Lhq3;", "Hh", "()Lhq3;", "setFeatureService", "(Lhq3;)V", "featureService", "Las8;", "Lcom/dodopizza/geo/feature/deliveryaddressmap/presentation/DeliveryAddressMapPresenter;", "Y", "Las8;", "Ph", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "Z", "Lmoxy/ktx/MoxyKtxDelegate;", "Oh", "()Lcom/dodopizza/geo/feature/deliveryaddressmap/presentation/DeliveryAddressMapPresenter;", "presenter", "<init>", "()V", "S4", "a", "b", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class a extends f70 implements vw2, n87, w50, tj1.a {
    private rg4 A;
    public h37 B;
    public je4 I;
    public hq3 X;
    public as8<DeliveryAddressMapPresenter> Y;
    private final MoxyKtxDelegate Z;
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final k79 l;
    private final k79 m;
    private final k79 n;
    private final k79 o;
    private final k79 p;
    private final k79 q;
    private final k79 r;
    private final k79 s;
    private final k79 t;
    private final k79 u;
    private final k79 v;
    private final k79 w;
    private final k79 x;
    private final k79 y;
    private final Logger z;
    static final /* synthetic */ je5<Object>[] T4 = {bc9.f(new ar8(a.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(a.class, "address", "getAddress()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "warning", "getWarning()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "addressLocation", "getAddressLocation()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "confirmButton", "getConfirmButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(a.class, "enterAddressManuallyButton", "getEnterAddressManuallyButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(a.class, "buttonContainer", "getButtonContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(a.class, "addressGroup", "getAddressGroup()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "error", "getError()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "myLocationButton", "getMyLocationButton()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "zoomIn", "getZoomIn()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "zoomOut", "getZoomOut()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "addressField", "getAddressField()Lcom/dodopizza/android/textinputlayout/DodoEditTextInputLayout;", 0)), bc9.f(new ar8(a.class, "addressCatcherGroup", "getAddressCatcherGroup()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "separator", "getSeparator()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "errorGroup", "getErrorGroup()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "notifyMeButton", "getNotifyMeButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(a.class, "pickupOrderButton", "getPickupOrderButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(a.class, "orderWithPickupButton", "getOrderWithPickupButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(a.class, "addressCatcherHeadline", "getAddressCatcherHeadline()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "addressCatcherMessage", "getAddressCatcherMessage()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "snackbarAnchor", "getSnackbarAnchor()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "addressCatcherButtonContainer", "getAddressCatcherButtonContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(a.class, "presenter", "getPresenter()Lcom/dodopizza/geo/feature/deliveryaddressmap/presentation/DeliveryAddressMapPresenter;", 0))};
    public static final C0134a S4 = new C0134a(null);

    /* compiled from: DeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddressmap/presentation/a$a;", "", "Lcom/dodopizza/geo/feature/deliveryaddressmap/presentation/a$b;", "data", "Lcom/dodopizza/geo/feature/deliveryaddressmap/presentation/a;", "a", "", "EXTRA_COUNTRY_CODE", "Ljava/lang/String;", "EXTRA_SOURCE", "", "REQUEST_CODE_ENABLE_LOCATION_PROVIDERS", "I", "", "STREET_MAP_SCALE", "F", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.geo.feature.deliveryaddressmap.presentation.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0134a {
        private C0134a() {
        }

        public /* synthetic */ C0134a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(b bVar) {
            z65.h(bVar, "data");
            return (a) y64.d(new a(), bi0.c(bi0.d("extra_country_code", bVar.a()), bi0.d("extra_source", bVar.b())));
        }
    }

    /* compiled from: DeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddressmap/presentation/a$b;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "Lck1;", "b", "Lck1;", "()Lck1;", KustoStorage.KustoTable.COLUMN_SOURCE, "<init>", "(Ljava/lang/String;Lck1;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b {
        private final String a;
        private final ck1 b;

        public b(String str, ck1 ck1Var) {
            z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
            z65.h(ck1Var, KustoStorage.KustoTable.COLUMN_SOURCE);
            this.a = str;
            this.b = ck1Var;
        }

        public final String a() {
            return this.a;
        }

        public final ck1 b() {
            return this.b;
        }
    }

    /* compiled from: DeliveryAddressMapFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[i66.values().length];
            try {
                iArr[i66.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i66.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[jq1.values().length];
            try {
                iArr2[jq1.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[jq1.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[jq1.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lqy7;", "result", "Loz3;", "Lcw5;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddressmap.presentation.DeliveryAddressMapFragment$getLocation$1", f = "DeliveryAddressMapFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements Function2<qy7, cv1<? super oz3<? extends cw5>>, Object> {
        int a;
        /* synthetic */ Object b;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(cv1Var);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(qy7 qy7Var, cv1<? super oz3<? extends cw5>> cv1Var) {
            return ((d) create(qy7Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                List<dy7> b = ((qy7) this.b).b();
                if (!(b instanceof Collection) || !b.isEmpty()) {
                    for (dy7 dy7Var : b) {
                        if (dy7Var.d() == ry7.GRANTED) {
                            return wz3.L(qv5.b.a(qv5.a.a(a.this.Ih()), null, 1, null), 1);
                        }
                    }
                }
                return wz3.A(cw5.b.a);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class e extends ej5 implements Function1<View, Unit> {
        e() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            a.this.Oh().z();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class f extends ej5 implements Function1<View, Unit> {
        f() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            a.this.Oh().B();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class g extends ej5 implements Function1<View, Unit> {
        g() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            a.this.Oh().e();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class h extends ej5 implements Function1<View, Unit> {
        h() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            a.this.Oh().B();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class i extends ej5 implements Function1<View, Unit> {
        i() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            a.this.Oh().C();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class j extends ej5 implements Function1<View, Unit> {
        j() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            a.this.Oh().E();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class k extends ej5 implements Function1<View, Unit> {
        k() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            a.this.Oh().D();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: DeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/maps/model/LatLng;", "it", "", "a", "(Lcom/google/android/gms/maps/model/LatLng;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class l extends ej5 implements Function1<LatLng, Unit> {
        l() {
            super(1);
        }

        public final void a(LatLng latLng) {
            z65.h(latLng, "it");
            a.this.Oh().A(latLng.a, latLng.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LatLng latLng) {
            a(latLng);
            return Unit.a;
        }
    }

    /* compiled from: DeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/geo/feature/deliveryaddressmap/presentation/DeliveryAddressMapPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/geo/feature/deliveryaddressmap/presentation/DeliveryAddressMapPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class m extends ej5 implements Function0<DeliveryAddressMapPresenter> {
        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final DeliveryAddressMapPresenter invoke() {
            return a.this.Ph().get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.deliveryaddressmap.presentation.DeliveryAddressMapFragment$requestUserLocation$1", f = "DeliveryAddressMapFragment.kt", l = {296}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DeliveryAddressMapFragment.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcw5;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "com.dodopizza.geo.feature.deliveryaddressmap.presentation.DeliveryAddressMapFragment$requestUserLocation$1$1", f = "DeliveryAddressMapFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.dodopizza.geo.feature.deliveryaddressmap.presentation.a$n$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0135a extends f3b implements y84<pz3<? super cw5>, Throwable, cv1<? super Unit>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ a c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0135a(a aVar, cv1<? super C0135a> cv1Var) {
                super(3, cv1Var);
                this.c = aVar;
            }

            @Override // defpackage.y84
            /* renamed from: i */
            public final Object invoke(pz3<? super cw5> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
                C0135a c0135a = new C0135a(this.c, cv1Var);
                c0135a.b = th;
                return c0135a.invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                c75.d();
                if (this.a == 0) {
                    vk9.b(obj);
                    this.c.z.warn("Failed to request location. ", (Throwable) this.b);
                    return Unit.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DeliveryAddressMapFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcw5;", "result", "", "b", "(Lcw5;Lcv1;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class b<T> implements pz3 {
            final /* synthetic */ a a;

            b(a aVar) {
                this.a = aVar;
            }

            @Override // defpackage.pz3
            /* renamed from: b */
            public final Object emit(cw5 cw5Var, cv1<? super Unit> cv1Var) {
                if (cw5Var instanceof cw5.c) {
                    gw5.a((cw5.c) cw5Var, this.a, 100);
                } else {
                    this.a.Oh().F(zv5.a(cw5Var));
                }
                return Unit.a;
            }
        }

        n(cv1<? super n> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new n(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((n) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                oz3 h = wz3.h(a.this.Jh(), new C0135a(a.this, null));
                b bVar = new b(a.this);
                this.a = 1;
                if (h.collect(bVar, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: DeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class o extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ a66 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(a66 a66Var) {
            super(1);
            this.b = a66Var;
        }

        public final void a(View view) {
            z65.h(view, "it");
            a.this.l(true);
            a.this.Oh().L((gqb) this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    public a() {
        super(dz8.fragment_delivery_address_map);
        this.c = kb0.e(this, dy8.delivery_address_map_toolbar);
        this.d = kb0.e(this, dy8.b);
        this.e = kb0.e(this, dy8.P0);
        this.f = kb0.e(this, dy8.address_location);
        this.g = kb0.e(this, dy8.N);
        this.h = kb0.e(this, dy8.enter_address_manually_button);
        this.i = kb0.e(this, dy8.button_container);
        this.j = kb0.e(this, dy8.address_group);
        int i2 = dy8.error_group;
        this.k = kb0.e(this, i2);
        this.l = kb0.e(this, dy8.m0);
        this.m = kb0.e(this, dy8.zoom_in_button);
        this.n = kb0.e(this, dy8.zoom_out_button);
        this.o = kb0.e(this, dy8.delivery_location_address);
        this.p = kb0.e(this, dy8.address_catcher_group);
        this.q = kb0.e(this, dy8.K0);
        this.r = kb0.e(this, i2);
        this.s = kb0.e(this, dy8.notify_me_button);
        this.t = kb0.e(this, dy8.pickup_order_button);
        this.u = kb0.e(this, dy8.pickup_order_success_screen_button);
        this.v = kb0.e(this, dy8.address_catcher_headline);
        this.w = kb0.e(this, dy8.address_catcher_message);
        this.x = kb0.e(this, dy8.M0);
        this.y = kb0.e(this, dy8.address_catcher_button_container);
        this.z = LoggerFactory.getLogger("DeliveryAddressMapFragment");
        m mVar = new m();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.Z = new MoxyKtxDelegate(mvpDelegate, DeliveryAddressMapPresenter.class.getName() + ".presenter", mVar);
    }

    private final View Ah() {
        return (View) this.j.a(this, T4[7]);
    }

    private final TextView Bh() {
        return (TextView) this.f.a(this, T4[3]);
    }

    private final ViewGroup Ch() {
        return (ViewGroup) this.i.a(this, T4[6]);
    }

    private final DodoButton Dh() {
        return (DodoButton) this.g.a(this, T4[4]);
    }

    private final Button Eh() {
        return (Button) this.h.a(this, T4[5]);
    }

    private final View Fh() {
        return (View) this.k.a(this, T4[8]);
    }

    private final View Gh() {
        return (View) this.r.a(this, T4[15]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<cw5> Jh() {
        return wz3.x(ky7.a.a(this).a("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"), new d(null));
    }

    private final View Kh() {
        return (View) this.l.a(this, T4[9]);
    }

    private final DodoButton Lh() {
        return (DodoButton) this.s.a(this, T4[16]);
    }

    private final DodoButton Mh() {
        return (DodoButton) this.u.a(this, T4[18]);
    }

    private final DodoButton Nh() {
        return (DodoButton) this.t.a(this, T4[17]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeliveryAddressMapPresenter Oh() {
        return (DeliveryAddressMapPresenter) this.Z.getValue(this, T4[23]);
    }

    private final View Qh() {
        return (View) this.q.a(this, T4[14]);
    }

    private final View Rh() {
        return (View) this.x.a(this, T4[21]);
    }

    private final Toolbar Sh() {
        return (Toolbar) this.c.a(this, T4[0]);
    }

    private final TextView Th() {
        return (TextView) this.e.a(this, T4[2]);
    }

    private final View Uh() {
        return (View) this.m.a(this, T4[10]);
    }

    private final View Vh() {
        return (View) this.n.a(this, T4[11]);
    }

    private final void Wh() {
        Sh().setNavigationOnClickListener(new View.OnClickListener() { // from class: kw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.Xh(a.this, view);
            }
        });
        Fragment k0 = getChildFragmentManager().k0(dy8.map);
        z65.f(k0, "null cannot be cast to non-null type com.google.android.gms.maps.SupportMapFragment");
        ((SupportMapFragment) k0).gh(this);
        oma.a(Dh(), new e());
        oma.a(Eh(), new f());
        oma.a(Kh(), new g());
        EditText editText = zh().getEditText();
        if (editText != null) {
            oma.a(editText, new h());
        }
        oma.a(Lh(), new i());
        oma.a(Nh(), new j());
        oma.a(Mh(), new k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Xh(a aVar, View view) {
        z65.h(aVar, "this$0");
        aVar.Oh().onBackPressed();
    }

    private final DodoButton.a Yh(jq1 jq1Var) {
        int i2 = c.$EnumSwitchMapping$1[jq1Var.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return DodoButton.a.c;
                }
                throw new NoWhenBranchMatchedException();
            }
            return DodoButton.a.b;
        }
        return DodoButton.a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Zh(a aVar) {
        z65.h(aVar, "this$0");
        DeliveryAddressMapPresenter.b x = aVar.Oh().x();
        if (x instanceof DeliveryAddressMapPresenter.b.a) {
            aVar.G1(((DeliveryAddressMapPresenter.b.a) x).a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ai(Function1 function1, rg4 rg4Var) {
        z65.h(function1, "$onCoordinateChanged");
        z65.h(rg4Var, "$googleMap");
        LatLng latLng = rg4Var.e().a;
        z65.g(latLng, "target");
        function1.invoke(latLng);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bi(a aVar, rg4 rg4Var, View view) {
        boolean z;
        z65.h(aVar, "this$0");
        z65.h(rg4Var, "$googleMap");
        DeliveryAddressMapPresenter Oh = aVar.Oh();
        if (rg4Var.e().b == rg4Var.f()) {
            z = true;
        } else {
            z = false;
        }
        Oh.G(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ci(a aVar, rg4 rg4Var, View view) {
        boolean z;
        z65.h(aVar, "this$0");
        z65.h(rg4Var, "$googleMap");
        DeliveryAddressMapPresenter Oh = aVar.Oh();
        if (rg4Var.e().b == rg4Var.g()) {
            z = true;
        } else {
            z = false;
        }
        Oh.H(!z);
    }

    private final TextView uh() {
        return (TextView) this.d.a(this, T4[1]);
    }

    private final ViewGroup vh() {
        return (ViewGroup) this.y.a(this, T4[22]);
    }

    private final View wh() {
        return (View) this.p.a(this, T4[13]);
    }

    private final TextView xh() {
        return (TextView) this.v.a(this, T4[19]);
    }

    private final TextView yh() {
        return (TextView) this.w.a(this, T4[20]);
    }

    private final DodoEditTextInputLayout zh() {
        return (DodoEditTextInputLayout) this.o.a(this, T4[12]);
    }

    @Override // defpackage.vw2
    public void G1(LatLngBounds latLngBounds) {
        z65.h(latLngBounds, "latLngBounds");
        rg4 rg4Var = this.A;
        if (rg4Var != null) {
            rg4Var.b(vm0.a(latLngBounds, 0));
        }
    }

    public final hq3 Hh() {
        hq3 hq3Var = this.X;
        if (hq3Var != null) {
            return hq3Var;
        }
        z65.z("featureService");
        return null;
    }

    public final je4 Ih() {
        je4 je4Var = this.I;
        if (je4Var != null) {
            return je4Var;
        }
        z65.z("geoLocationProviderFactory");
        return null;
    }

    @Override // defpackage.vw2
    public void K5(boolean z) {
        rg4 rg4Var = this.A;
        if (rg4Var != null) {
            rg4Var.b(vm0.d());
        }
        Uh().setEnabled(true);
        Vh().setEnabled(z);
    }

    @Override // defpackage.tj1.a
    public void O8(String str) {
        z65.h(str, "id");
        Context context = getContext();
        if (context != null) {
            av1.c(context);
        }
    }

    @Override // defpackage.vw2
    public void P5(a66 a66Var) {
        int i2;
        int i3;
        z65.h(a66Var, "addressVO");
        int i4 = 0;
        if (Hh().a(bq3.I6) && (a66Var instanceof gqb)) {
            un3.e(Ah());
            un3.e(Gh());
            un3.e(Qh());
            un3.e(Th());
            un3.e(Ch());
            un3.k(wh());
            n1c.e(vh(), Lh());
            EditText editText = zh().getEditText();
            if (editText != null) {
                editText.setFocusable(false);
            }
            EditText editText2 = zh().getEditText();
            if (editText2 != null) {
                editText2.setText(a66Var.a());
            }
            zh().setHint(getString(o09.delivery_location_address_filed_short_hint));
            xh().setText(getString(o09.address_catcher_headline));
            yh().setText(getString(o09.address_catcher_message));
            oma.a(Lh(), new o(a66Var));
            return;
        }
        un3.e(wh());
        un3.k(Qh());
        un3.k(Ch());
        View Ah = Ah();
        if (a66Var.g()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        Ah.setVisibility(i2);
        if (Hh().a(bq3.Z4)) {
            un3.e(Bh());
        }
        int i5 = c.$EnumSwitchMapping$0[a66Var.e().ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                Dh().setState(Yh(a66Var.c()));
                Dh().setText(getString(a66Var.d()));
                n1c.e(Ch(), Dh());
            }
        } else {
            n1c.e(Ch(), Eh());
        }
        View Fh = Fh();
        if (a66Var.h()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        Fh.setVisibility(i3);
        TextView Th = Th();
        if (!a66Var.i()) {
            i4 = 8;
        }
        Th.setVisibility(i4);
        Th().setText(getString(a66Var.f()));
        uh().setText(a66Var.a());
        Bh().setText(a66Var.b());
    }

    public final as8<DeliveryAddressMapPresenter> Ph() {
        as8<DeliveryAddressMapPresenter> as8Var = this.Y;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.vw2
    public void Rf() {
        xh().setText(getString(o09.address_update_subscription_success_headline));
        yh().setText(getString(o09.address_update_subscription_success_message));
        n1c.e(vh(), Mh());
        DodoButton Lh = Lh();
        DodoButton.a aVar = DodoButton.a.a;
        Lh.setState(aVar);
        Nh().setState(aVar);
    }

    @Override // defpackage.vw2
    public void c() {
        String string = requireContext().getString(o09.d0);
        z65.g(string, "getString(...)");
        String string2 = requireContext().getString(o09.i);
        z65.g(string2, "getString(...)");
        String string3 = requireContext().getString(o09.V);
        z65.g(string3, "getString(...)");
        tj1.e.a(string, string2, string3, "request_permission").show(getChildFragmentManager(), "request_permission");
    }

    @Override // defpackage.vw2
    public void dh() {
        sh0.d(pp5.a(this), null, null, new n(null), 3, null);
    }

    @Override // defpackage.vw2
    public void e() {
        if (getView() != null) {
            Snackbar.i0(Rh(), getString(o09.v), 0).U();
        }
    }

    @Override // defpackage.vw2
    public void ea(boolean z) {
        rg4 rg4Var = this.A;
        if (rg4Var != null) {
            rg4Var.b(vm0.c());
        }
        Vh().setEnabled(true);
        Uh().setEnabled(z);
    }

    @Override // defpackage.vw2
    public void kb() {
        Lh().setState(DodoButton.a.b);
        Nh().setState(DodoButton.a.c);
    }

    @Override // defpackage.vw2
    public void l(boolean z) {
        if (z) {
            Lh().setState(DodoButton.a.b);
            Nh().setState(DodoButton.a.c);
            return;
        }
        DodoButton Lh = Lh();
        DodoButton.a aVar = DodoButton.a.a;
        Lh.setState(aVar);
        Nh().setState(aVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 100 && i3 == -1) {
            dh();
        }
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        Oh().onBackPressed();
        return true;
    }

    @Override // defpackage.tj1.a
    public void onCancel(String str) {
        z65.h(str, "id");
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Object obj;
        Object obj2;
        fw2.b a = fw2.a.a();
        DeliveryAddressMapFeatureDependencies deliveryAddressMapFeatureDependencies = (DeliveryAddressMapFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(DeliveryAddressMapFeatureDependencies.class));
        Bundle arguments = getArguments();
        ck1 ck1Var = null;
        if (arguments == null || (obj = arguments.get("extra_country_code")) == null) {
            obj = null;
        }
        if (obj != null && !(obj instanceof String)) {
            throw new ClassCastException("Property extra_country_code has different class type");
        } else if (obj != null) {
            String str = (String) obj;
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (obj2 = arguments2.get("extra_source")) != null) {
                ck1Var = obj2;
            }
            if (ck1Var != null && !(ck1Var instanceof ck1)) {
                throw new ClassCastException("Property extra_source has different class type");
            } else if (ck1Var != null) {
                a.a(deliveryAddressMapFeatureDependencies, str, ck1Var).a(this);
                super.onCreate(bundle);
            } else {
                throw new IllegalArgumentException("Argument with key = extra_source not found in bundle");
            }
        } else {
            throw new IllegalArgumentException("Argument with key = extra_country_code not found in bundle");
        }
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Wh();
    }

    @Override // defpackage.n87
    public void p6(final rg4 rg4Var) {
        z65.h(rg4Var, "googleMap");
        this.A = rg4Var;
        final Function1 b2 = kn2.b(pp5.a(this), 0L, new l(), 1, null);
        rg4 rg4Var2 = this.A;
        if (rg4Var2 != null) {
            rg4Var2.p(new rg4.f() { // from class: gw2
                @Override // defpackage.rg4.f
                public final void a() {
                    a.Zh(a.this);
                }
            });
            rg4Var2.m(new rg4.c() { // from class: hw2
                @Override // defpackage.rg4.c
                public final void b() {
                    a.ai(Function1.this, rg4Var);
                }
            });
        }
        Uh().setOnClickListener(new View.OnClickListener() { // from class: iw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.bi(a.this, rg4Var, view);
            }
        });
        Vh().setOnClickListener(new View.OnClickListener() { // from class: jw2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.ci(a.this, rg4Var, view);
            }
        });
    }

    @Override // defpackage.vw2
    public void q9(boolean z) {
        un3.o(Uh(), z);
        un3.o(Vh(), z);
    }

    @Override // defpackage.vw2
    public void w7(ov5 ov5Var) {
        z65.h(ov5Var, "location");
        rg4 rg4Var = this.A;
        if (rg4Var != null) {
            rg4Var.b(vm0.b(new LatLng(ov5Var.b(), ov5Var.c()), 15.0f));
        }
    }

    @Override // defpackage.vw2
    public void y9(boolean z) {
        un3.o(Kh(), z);
    }
}
