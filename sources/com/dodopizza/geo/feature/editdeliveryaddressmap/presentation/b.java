package com.dodopizza.geo.feature.editdeliveryaddressmap.presentation;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.buttons.DodoButton;
import com.dodopizza.android.textinputlayout.DodoEditTextInputLayout;
import com.dodopizza.geo.domain.OnDeliveryLocationSelectedDependencies;
import com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapFeatureDependencies;
import com.dodopizza.geo.feature.editdeliveryaddressmap.EditAddressMapRoutingFeatureDependencies;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMPresenter;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.adapter.AddressMapComponentVH;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.b;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.cw5;
import defpackage.iu6;
import defpackage.k6;
import defpackage.k9a;
import defpackage.qv5;
import defpackage.rg4;
import defpackage.tj1;
import defpackage.u68;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: EditDeliveryAddressMapFSMFragment.kt */
@Metadata(d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 Þ\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001#B\t¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001J\b\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002J\b\u0010\u000f\u001a\u00020\bH\u0002J\b\u0010\u0010\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\b\u0010\u0017\u001a\u00020\nH\u0002J\b\u0010\u0018\u001a\u00020\nH\u0002J\u0012\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001f\u001a\u00020\bH\u0016J\u0010\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001cH\u0014J\b\u0010\"\u001a\u00020\u0011H\u0016J\b\u0010#\u001a\u00020\bH\u0016J\b\u0010$\u001a\u00020\bH\u0016J\u0010\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0016J\u0010\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(H\u0016J\u0010\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u0011H\u0016J\u0018\u00100\u001a\u00020\b2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0011H\u0016J\"\u00105\u001a\u00020\b2\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u000103H\u0016J\u0010\u00108\u001a\u00020\b2\u0006\u00107\u001a\u000206H\u0016J\b\u00109\u001a\u00020\bH\u0016J\u0010\u0010<\u001a\u00020\b2\u0006\u0010;\u001a\u00020:H\u0016J\u0010\u0010=\u001a\u00020\b2\u0006\u0010.\u001a\u00020-H\u0016J\b\u0010>\u001a\u00020\bH\u0016J\b\u0010?\u001a\u00020\bH\u0016J\b\u0010@\u001a\u00020\bH\u0016J\b\u0010A\u001a\u00020\bH\u0016J\b\u0010B\u001a\u00020\bH\u0016J\b\u0010C\u001a\u00020\bH\u0016J\u0010\u0010F\u001a\u00020\b2\u0006\u0010E\u001a\u00020DH\u0016J\u0010\u0010G\u001a\u00020\b2\u0006\u0010E\u001a\u00020DH\u0016R\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010I\u001a\u0004\bJ\u0010KR\u001b\u0010P\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010I\u001a\u0004\bN\u0010OR\u001b\u0010S\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010I\u001a\u0004\bR\u0010OR\u001b\u0010X\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010I\u001a\u0004\bV\u0010WR\u001b\u0010[\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010I\u001a\u0004\bZ\u0010OR\u001b\u0010`\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010I\u001a\u0004\b^\u0010_R\u001b\u0010c\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010I\u001a\u0004\bb\u0010OR\u001b\u0010f\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010I\u001a\u0004\be\u0010OR\u001b\u0010k\u001a\u00020g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010I\u001a\u0004\bi\u0010jR\u001b\u0010p\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010I\u001a\u0004\bn\u0010oR\u001b\u0010r\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010I\u001a\u0004\bq\u0010oR\u001b\u0010u\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010I\u001a\u0004\bt\u0010OR\u001b\u0010x\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010I\u001a\u0004\bw\u0010OR\u001b\u0010}\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010I\u001a\u0004\b{\u0010|R\u001b\u0010\u007f\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010I\u001a\u0004\b~\u0010OR \u0010\u0084\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0081\u0001\u0010I\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R \u0010\u0089\u0001\u001a\u00030\u0085\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0086\u0001\u0010I\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001e\u0010\u008c\u0001\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010I\u001a\u0005\b\u008b\u0001\u0010oR\u001e\u0010\u008f\u0001\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010I\u001a\u0005\b\u008e\u0001\u0010oR\u001e\u0010\u0092\u0001\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0090\u0001\u0010I\u001a\u0005\b\u0091\u0001\u0010oR \u0010\u0097\u0001\u001a\u00030\u0093\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0094\u0001\u0010I\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R \u0010\u009a\u0001\u001a\u00030\u0093\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0098\u0001\u0010I\u001a\u0006\b\u0099\u0001\u0010\u0096\u0001R \u0010\u009f\u0001\u001a\u00030\u009b\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009c\u0001\u0010I\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R \u0010¢\u0001\u001a\u00030\u009b\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b \u0001\u0010I\u001a\u0006\b¡\u0001\u0010\u009e\u0001R \u0010¥\u0001\u001a\u00030\u009b\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b£\u0001\u0010I\u001a\u0006\b¤\u0001\u0010\u009e\u0001R \u0010¨\u0001\u001a\u00030\u009b\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b¦\u0001\u0010I\u001a\u0006\b§\u0001\u0010\u009e\u0001R \u0010\u00ad\u0001\u001a\u00030©\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\bª\u0001\u0010I\u001a\u0006\b«\u0001\u0010¬\u0001R\"\u0010²\u0001\u001a\r ¯\u0001*\u0005\u0018\u00010®\u00010®\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0018\u0010¶\u0001\u001a\u00030³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R!\u0010»\u0001\u001a\n\u0012\u0005\u0012\u00030¸\u00010·\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R*\u0010Ã\u0001\u001a\u00030¼\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R1\u0010Ì\u0001\u001a\n\u0012\u0005\u0012\u00030Å\u00010Ä\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010Ë\u0001R+\u0010Ñ\u0001\u001a\r ¯\u0001*\u0005\u0018\u00010Å\u00010Å\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001R!\u0010×\u0001\u001a\u00030Ò\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u001e\u0010Û\u0001\u001a\t\u0012\u0004\u0012\u00020\b0Ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001¨\u0006ß\u0001"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/b;", "Lf70;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/i;", "Liu6$e;", "Liu6$c;", "Lw50;", "Ln87;", "Ltj1$a;", "", "ii", "", "currentIdx", "mi", "Ah", "ni", "ki", "qi", "", "isInvisible", "oi", "Loz3;", "Lcw5;", "Uh", "Bh", "Ch", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "onDestroyView", "rootView", "ih", "onBackPressed", "a", com.huawei.hms.opendevice.c.a, "Lrg4;", "googleMap", "p6", "Lw56;", "addressVO", "D5", "isInitialRequest", "E0", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "changePinStatus", "Q2", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Lk9a$b;", "request", "q", "y0", "Lcom/google/android/gms/maps/model/LatLngBounds;", "bounds", Image.TYPE_MEDIUM, "d0", "B4", "pi", "Jg", "m7", "S9", "l0", "", "id", "O8", "onCancel", "Landroidx/appcompat/widget/Toolbar;", "Lk79;", "fi", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", DateTokenConverter.CONVERTER_KEY, "Wh", "()Landroid/view/View;", "myLocationButton", com.huawei.hms.push.e.a, "Oh", "bottomSheetLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "f", "di", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "root", "g", "ai", "pinView", "Landroidx/recyclerview/widget/RecyclerView;", Image.TYPE_HIGH, "Jh", "()Landroidx/recyclerview/widget/RecyclerView;", "addressComponentsRecyclerView", "i", "Kh", "addressMapBottomSheetBlackout", "j", "Lh", "addressMapStartingBlackout", "Lcom/dodopizza/android/textinputlayout/DodoEditTextInputLayout;", "k", "Mh", "()Lcom/dodopizza/android/textinputlayout/DodoEditTextInputLayout;", "addressMapTextInputLayout", "Lcom/dodopizza/android/buttons/DodoButton;", "l", "Ph", "()Lcom/dodopizza/android/buttons/DodoButton;", "confirmButton", "Qh", "deleteButton", "n", "gi", "warning", "o", "Sh", "errorIcon", "Landroidx/appcompat/widget/AppCompatTextView;", "p", "ei", "()Landroidx/appcompat/widget/AppCompatTextView;", "textWarning", "Rh", "designProgress", "Landroid/widget/LinearLayout;", "r", "Dh", "()Landroid/widget/LinearLayout;", "addressButtonLayout", "Landroidx/fragment/app/FragmentContainerView;", Image.TYPE_SMALL, "Vh", "()Landroidx/fragment/app/FragmentContainerView;", "mapContainer", "t", "Xh", "notifyMeButton", "u", "Zh", "pickupOrderButton", "v", "Yh", "orderWithPickupButton", "Landroid/widget/FrameLayout;", "w", "Hh", "()Landroid/widget/FrameLayout;", "addressCatcherTitleContainer", "x", "Fh", "addressCatcherMessageContainer", "Landroid/widget/TextView;", "y", "getAddressCatcherTitle", "()Landroid/widget/TextView;", "addressCatcherTitle", "z", "Ih", "addressCatcherTitleSubscribe", "A", "getAddressCatcherMessage", "addressCatcherMessage", "B", "Gh", "addressCatcherMessageSubscribe", "Landroid/view/ViewGroup;", "I", "Eh", "()Landroid/view/ViewGroup;", "addressCatcherButtonContainer", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "X", "Lorg/slf4j/Logger;", "logger", "Ln66;", "Y", "Ln66;", "mapController", "Ll6;", "Ld7;", "Z", "Ll6;", "detailsFieldsDataset", "Lje4;", "S4", "Lje4;", "Th", "()Lje4;", "setGeoLocationProviderFactory", "(Lje4;)V", "geoLocationProviderFactory", "Las8;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter;", "T4", "Las8;", "ci", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "U4", "Lmoxy/ktx/MoxyKtxDelegate;", "bi", "()Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter;", "presenter", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;", "V4", "Lrn5;", "Nh", "()Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;", "args", "Lkotlin/Function0;", "W4", "Lkotlin/jvm/functions/Function0;", "handleMovingBottomSheetOnce", "<init>", "()V", "X4", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class b extends f70 implements com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i, iu6.e, iu6.c, w50, n87, tj1.a {
    private final k79 A;
    private final k79 B;
    private final k79 I;
    public je4 S4;
    public as8<EditDeliveryAddressMapFSMPresenter> T4;
    private final MoxyKtxDelegate U4;
    private final rn5 V4;
    private final Function0<Unit> W4;
    private final Logger X;
    private final n66 Y;
    private l6<d7> Z;
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
    private final k79 z;
    static final /* synthetic */ je5<Object>[] Y4 = {bc9.f(new ar8(b.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(b.class, "myLocationButton", "getMyLocationButton()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "bottomSheetLayout", "getBottomSheetLayout()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "root", "getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;", 0)), bc9.f(new ar8(b.class, "pinView", "getPinView()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "addressComponentsRecyclerView", "getAddressComponentsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(b.class, "addressMapBottomSheetBlackout", "getAddressMapBottomSheetBlackout()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "addressMapStartingBlackout", "getAddressMapStartingBlackout()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "addressMapTextInputLayout", "getAddressMapTextInputLayout()Lcom/dodopizza/android/textinputlayout/DodoEditTextInputLayout;", 0)), bc9.f(new ar8(b.class, "confirmButton", "getConfirmButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(b.class, "deleteButton", "getDeleteButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(b.class, "warning", "getWarning()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "errorIcon", "getErrorIcon()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "textWarning", "getTextWarning()Landroidx/appcompat/widget/AppCompatTextView;", 0)), bc9.f(new ar8(b.class, "designProgress", "getDesignProgress()Landroid/view/View;", 0)), bc9.f(new ar8(b.class, "addressButtonLayout", "getAddressButtonLayout()Landroid/widget/LinearLayout;", 0)), bc9.f(new ar8(b.class, "mapContainer", "getMapContainer()Landroidx/fragment/app/FragmentContainerView;", 0)), bc9.f(new ar8(b.class, "notifyMeButton", "getNotifyMeButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(b.class, "pickupOrderButton", "getPickupOrderButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(b.class, "orderWithPickupButton", "getOrderWithPickupButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(b.class, "addressCatcherTitleContainer", "getAddressCatcherTitleContainer()Landroid/widget/FrameLayout;", 0)), bc9.f(new ar8(b.class, "addressCatcherMessageContainer", "getAddressCatcherMessageContainer()Landroid/widget/FrameLayout;", 0)), bc9.f(new ar8(b.class, "addressCatcherTitle", "getAddressCatcherTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(b.class, "addressCatcherTitleSubscribe", "getAddressCatcherTitleSubscribe()Landroid/widget/TextView;", 0)), bc9.f(new ar8(b.class, "addressCatcherMessage", "getAddressCatcherMessage()Landroid/widget/TextView;", 0)), bc9.f(new ar8(b.class, "addressCatcherMessageSubscribe", "getAddressCatcherMessageSubscribe()Landroid/widget/TextView;", 0)), bc9.f(new ar8(b.class, "addressCatcherButtonContainer", "getAddressCatcherButtonContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(b.class, "presenter", "getPresenter()Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter;", 0))};
    public static final a X4 = new a(null);

    /* compiled from: EditDeliveryAddressMapFSMFragment.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/b$a;", "", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;", "data", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/b;", "a", "", "DEFAULT_ACTION_BAR_SIZE", "I", "", "EXTRA_FRAGMENT_DATA", "Ljava/lang/String;", "", "PIN_ANIMATION_DURATION", "J", "REQUEST_CODE_ENABLE_LOCATION_PROVIDERS", "SCREEN_DELIMITER", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a aVar) {
            z65.h(aVar, "data");
            return (b) y64.d(new b(), bi0.c(bi0.d("extra_fragment_data", aVar)));
        }
    }

    /* compiled from: EditDeliveryAddressMapFSMFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/dodopizza/geo/feature/editdeliveryaddressmap/presentation/b$b", "Ljg5;", "", "isVisible", "", "a", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0143b implements jg5 {
        C0143b() {
        }

        @Override // defpackage.jg5
        public void a(boolean z) {
            int i;
            boolean z2;
            int i2;
            int i3;
            int i4;
            DodoButton Ph = b.this.Ph();
            int i5 = 8;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            Ph.setVisibility(i);
            DodoButton Qh = b.this.Qh();
            if (!z && b.this.bi().d0()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            Qh.setVisibility(i2);
            View Wh = b.this.Wh();
            if (z) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            Wh.setVisibility(i3);
            View Kh = b.this.Kh();
            if (z) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            Kh.setVisibility(i4);
            View ai = b.this.ai();
            if (!z) {
                i5 = 0;
            }
            ai.setVisibility(i5);
        }
    }

    /* compiled from: EditDeliveryAddressMapFSMFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;", "a", "()Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function0<com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a invoke() {
            Bundle arguments = b.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("extra_fragment_data")) == null) ? null : null;
            if (obj != null && !(obj instanceof com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a)) {
                throw new ClassCastException("Property extra_fragment_data has different class type");
            } else if (obj != null) {
                return (com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a) obj;
            } else {
                throw new IllegalArgumentException("Argument with key = extra_fragment_data not found in bundle");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lqy7;", "result", "Loz3;", "Lcw5;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMFragment$getLocation$1", f = "EditDeliveryAddressMapFSMFragment.kt", l = {}, m = "invokeSuspend")
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
                            return wz3.L(qv5.b.a(qv5.a.a(b.this.Th()), null, 1, null), 1);
                        }
                    }
                }
                return wz3.A(cw5.b.a);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: EditDeliveryAddressMapFSMFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    /* synthetic */ class e extends m94 implements Function0<Unit> {
        e(Object obj) {
            super(0, obj, b.class, "updateMapPadding", "updateMapPadding()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((b) this.receiver).qi();
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class f extends ej5 implements Function1<Object, Boolean> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof d7);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class g extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final g a = new g();

        public g() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = AddressMapComponentVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld7;", "it", "", "a", "(Ld7;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class h extends ej5 implements Function1<d7, Unit> {
        h() {
            super(1);
        }

        public final void a(d7 d7Var) {
            z65.h(d7Var, "it");
            b.this.bi().w(new EditDeliveryAddressMapFSMPresenter.b.f(d7Var.c()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(d7 d7Var) {
            a(d7Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class i extends ej5 implements Function1<View, Unit> {
        i() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            b.this.bi().w(EditDeliveryAddressMapFSMPresenter.b.l.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class j extends ej5 implements Function1<View, Unit> {
        j() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            b.this.bi().w(EditDeliveryAddressMapFSMPresenter.b.c.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class k extends ej5 implements Function1<View, Unit> {
        k() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            b.this.bi().w(EditDeliveryAddressMapFSMPresenter.b.i.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class l extends ej5 implements Function1<View, Unit> {
        l() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            b.this.bi().w(EditDeliveryAddressMapFSMPresenter.b.m.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class m extends ej5 implements Function1<Integer, Unit> {
        m() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.a;
        }

        public final void invoke(int i) {
            b.this.mi(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ld7;", "field", "", "text", "", "a", "(Ld7;Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class n extends ej5 implements Function2<d7, String, Unit> {
        n() {
            super(2);
        }

        public final void a(d7 d7Var, String str) {
            z65.h(d7Var, "field");
            z65.h(str, "text");
            b.this.bi().w(new EditDeliveryAddressMapFSMPresenter.b.e(d7Var.c(), str));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(d7 d7Var, String str) {
            a(d7Var, str);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lu68;", "status", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMFragment$onMapReady$1$1", f = "EditDeliveryAddressMapFSMFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class o extends f3b implements Function2<u68, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ Function1<LatLng, Unit> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        o(Function1<? super LatLng, Unit> function1, cv1<? super o> cv1Var) {
            super(2, cv1Var);
            this.d = function1;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            o oVar = new o(this.d, cv1Var);
            oVar.b = obj;
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(u68 u68Var, cv1<? super Unit> cv1Var) {
            return ((o) create(u68Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                u68 u68Var = (u68) this.b;
                if (u68Var instanceof u68.b) {
                    b.this.bi().w(EditDeliveryAddressMapFSMPresenter.b.k.a);
                } else if (u68Var instanceof u68.a) {
                    this.d.invoke(((u68.a) u68Var).a());
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: EditDeliveryAddressMapFSMFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/maps/model/LatLng;", "it", "", "a", "(Lcom/google/android/gms/maps/model/LatLng;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class p extends ej5 implements Function1<LatLng, Unit> {
        p() {
            super(1);
        }

        public final void a(LatLng latLng) {
            z65.h(latLng, "it");
            Logger logger = b.this.X;
            LatLngBounds k = b.this.Y.k();
            Float l = b.this.Y.l();
            logger.info("reverse-geocode bounds / zoom - ", k + " / " + l);
            b.this.bi().w(new EditDeliveryAddressMapFSMPresenter.b.j(latLng));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LatLng latLng) {
            a(latLng);
            return Unit.a;
        }
    }

    /* compiled from: EditDeliveryAddressMapFSMFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapFSMPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class q extends ej5 implements Function0<EditDeliveryAddressMapFSMPresenter> {
        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final EditDeliveryAddressMapFSMPresenter invoke() {
            return b.this.ci().get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFSMFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMFragment$requestUserLocation$1", f = "EditDeliveryAddressMapFSMFragment.kt", l = {430}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class r extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ boolean c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EditDeliveryAddressMapFSMFragment.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcw5;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFSMFragment$requestUserLocation$1$1", f = "EditDeliveryAddressMapFSMFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends f3b implements y84<pz3<? super cw5>, Throwable, cv1<? super Unit>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ b c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, cv1<? super a> cv1Var) {
                super(3, cv1Var);
                this.c = bVar;
            }

            @Override // defpackage.y84
            /* renamed from: i */
            public final Object invoke(pz3<? super cw5> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
                a aVar = new a(this.c, cv1Var);
                aVar.b = th;
                return aVar.invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                c75.d();
                if (this.a == 0) {
                    vk9.b(obj);
                    this.c.X.warn("Failed to request location. ", (Throwable) this.b);
                    return Unit.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EditDeliveryAddressMapFSMFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcw5;", "result", "", "b", "(Lcw5;Lcv1;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.b$r$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0144b<T> implements pz3 {
            final /* synthetic */ b a;
            final /* synthetic */ boolean b;

            C0144b(b bVar, boolean z) {
                this.a = bVar;
                this.b = z;
            }

            @Override // defpackage.pz3
            /* renamed from: b */
            public final Object emit(cw5 cw5Var, cv1<? super Unit> cv1Var) {
                if (cw5Var instanceof cw5.c) {
                    gw5.a((cw5.c) cw5Var, this.a, 100);
                } else {
                    this.a.bi().w(new EditDeliveryAddressMapFSMPresenter.b.g(zv5.a(cw5Var), this.b));
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(boolean z, cv1<? super r> cv1Var) {
            super(2, cv1Var);
            this.c = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new r(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((r) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                oz3 h = wz3.h(b.this.Uh(), new a(b.this, null));
                C0144b c0144b = new C0144b(b.this, this.c);
                this.a = 1;
                if (h.collect(c0144b, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: EditDeliveryAddressMapFSMFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class s extends ej5 implements Function0<Unit> {
        final /* synthetic */ k9a.b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(k9a.b bVar) {
            super(0);
            this.b = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            b.this.bi().w(new EditDeliveryAddressMapFSMPresenter.b.C0137b(EditDeliveryAddressMapPresenter.a.b.a, this.b));
        }
    }

    /* compiled from: EditDeliveryAddressMapFSMFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class t extends ej5 implements Function0<Unit> {
        final /* synthetic */ k9a.b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(k9a.b bVar) {
            super(0);
            this.b = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            b.this.bi().w(new EditDeliveryAddressMapFSMPresenter.b.C0137b(EditDeliveryAddressMapPresenter.a.C0141a.a, this.b));
        }
    }

    public b() {
        super(dz8.fragment_delivery_edit_address_map);
        rn5 b;
        this.c = kb0.e(this, dy8.delivery_address_map_toolbar);
        this.d = kb0.e(this, dy8.delivery_address_map_my_location_button);
        this.e = kb0.e(this, dy8.bottom_sheet_address);
        this.f = kb0.e(this, dy8.root_delivery_edit_address_map);
        this.g = kb0.e(this, dy8.E0);
        this.h = kb0.e(this, dy8.delivery_address_map_components_recycler_view);
        this.i = kb0.e(this, dy8.address_map_bottom_sheet_blackout);
        this.j = kb0.e(this, dy8.address_map_starting_blackout);
        this.k = kb0.e(this, dy8.address_map_edit_text_layout);
        this.l = kb0.e(this, dy8.J0);
        this.m = kb0.e(this, dy8.delete_address_button);
        this.n = kb0.e(this, dy8.P0);
        this.o = kb0.e(this, dy8.f0);
        this.p = kb0.e(this, dy8.N0);
        this.q = kb0.e(this, dy8.design_progress);
        this.r = kb0.e(this, dy8.address_button_layout);
        this.s = kb0.e(this, dy8.delivery_address_map);
        this.t = kb0.e(this, dy8.notify_me_button);
        this.u = kb0.e(this, dy8.pickup_order_button);
        this.v = kb0.e(this, dy8.pickup_order_success_screen_button);
        this.w = kb0.e(this, dy8.address_catcher_title_container);
        this.x = kb0.e(this, dy8.address_catcher_message_container);
        this.y = kb0.e(this, dy8.address_catcher_title);
        this.z = kb0.e(this, dy8.address_catcher_title_subscribe);
        this.A = kb0.e(this, dy8.address_catcher_message);
        this.B = kb0.e(this, dy8.address_catcher_message_subscribe);
        this.I = kb0.e(this, dy8.address_catcher_button_container);
        this.X = LoggerFactory.getLogger("EditDeliveryAddressMapFragment");
        this.Y = new n66();
        this.Z = new l6<>(null, 1, null);
        q qVar = new q();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.U4 = new MoxyKtxDelegate(mvpDelegate, EditDeliveryAddressMapFSMPresenter.class.getName() + ".presenter", qVar);
        b = yn5.b(new c());
        this.V4 = b;
        this.W4 = y97.a(new e(this));
    }

    private final void Ah() {
        ig5.a.b(di(), new C0143b());
    }

    private final int Bh() {
        Integer num;
        Resources resources;
        DisplayMetrics displayMetrics;
        int Ch = Ch();
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            num = Integer.valueOf(displayMetrics.heightPixels);
        } else {
            num = null;
        }
        if (num != null) {
            num.intValue();
            return (num.intValue() / 2) - Ch;
        }
        return Oh().getHeight();
    }

    private final int Ch() {
        TypedValue typedValue = new TypedValue();
        if (requireActivity().getTheme().resolveAttribute(ov8.a, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        return 60;
    }

    private final LinearLayout Dh() {
        return (LinearLayout) this.r.a(this, Y4[15]);
    }

    private final ViewGroup Eh() {
        return (ViewGroup) this.I.a(this, Y4[26]);
    }

    private final FrameLayout Fh() {
        return (FrameLayout) this.x.a(this, Y4[21]);
    }

    private final TextView Gh() {
        return (TextView) this.B.a(this, Y4[25]);
    }

    private final FrameLayout Hh() {
        return (FrameLayout) this.w.a(this, Y4[20]);
    }

    private final TextView Ih() {
        return (TextView) this.z.a(this, Y4[23]);
    }

    private final RecyclerView Jh() {
        return (RecyclerView) this.h.a(this, Y4[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View Kh() {
        return (View) this.i.a(this, Y4[6]);
    }

    private final View Lh() {
        return (View) this.j.a(this, Y4[7]);
    }

    private final DodoEditTextInputLayout Mh() {
        return (DodoEditTextInputLayout) this.k.a(this, Y4[8]);
    }

    private final com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a Nh() {
        return (com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a) this.V4.getValue();
    }

    private final View Oh() {
        return (View) this.e.a(this, Y4[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DodoButton Ph() {
        return (DodoButton) this.l.a(this, Y4[9]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DodoButton Qh() {
        return (DodoButton) this.m.a(this, Y4[10]);
    }

    private final View Rh() {
        return (View) this.q.a(this, Y4[14]);
    }

    private final View Sh() {
        return (View) this.o.a(this, Y4[12]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<cw5> Uh() {
        return wz3.x(ky7.a.a(this).a("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"), new d(null));
    }

    private final FragmentContainerView Vh() {
        return (FragmentContainerView) this.s.a(this, Y4[16]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View Wh() {
        return (View) this.d.a(this, Y4[1]);
    }

    private final DodoButton Xh() {
        return (DodoButton) this.t.a(this, Y4[17]);
    }

    private final DodoButton Yh() {
        return (DodoButton) this.v.a(this, Y4[19]);
    }

    private final DodoButton Zh() {
        return (DodoButton) this.u.a(this, Y4[18]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View ai() {
        return (View) this.g.a(this, Y4[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditDeliveryAddressMapFSMPresenter bi() {
        return (EditDeliveryAddressMapFSMPresenter) this.U4.getValue(this, Y4[27]);
    }

    private final ConstraintLayout di() {
        return (ConstraintLayout) this.f.a(this, Y4[3]);
    }

    private final AppCompatTextView ei() {
        return (AppCompatTextView) this.p.a(this, Y4[13]);
    }

    private final Toolbar fi() {
        return (Toolbar) this.c.a(this, Y4[0]);
    }

    private final View gi() {
        return (View) this.n.a(this, Y4[11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5c hi(b bVar, int i2, int i3, View view, c5c c5cVar) {
        z65.h(bVar, "this$0");
        z65.h(view, "view");
        z65.h(c5cVar, "insets");
        p45.j(bVar.di(), 0, 0, 0, i2 + c5cVar.i(), 7, null);
        p45.j(view, 0, i3 + c5cVar.l(), 0, 0, 13, null);
        return c5cVar;
    }

    private final void ii() {
        int i2;
        fi().setNavigationOnClickListener(new View.OnClickListener() { // from class: dd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b.ji(b.this, view);
            }
        });
        Fragment k0 = getChildFragmentManager().k0(dy8.delivery_address_map);
        z65.f(k0, "null cannot be cast to non-null type com.google.android.gms.maps.SupportMapFragment");
        ((SupportMapFragment) k0).gh(this);
        oma.a(Ph(), new i());
        oma.a(Qh(), new j());
        DodoButton Qh = Qh();
        if (!bi().d0()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        Qh.setVisibility(i2);
        ki();
        Ah();
        oma.a(Wh(), new k());
        DodoEditTextInputLayout Mh = Mh();
        ViewGroup.LayoutParams layoutParams = Mh.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            Mh.setLayoutParams(layoutParams);
            EditText editText = Mh().getEditText();
            if (editText != null) {
                editText.setClickable(true);
                editText.setCursorVisible(false);
                editText.setFocusable(false);
                editText.setFocusableInTouchMode(false);
                editText.setInputType(131073);
                oma.a(editText, new l());
            }
            if (Nh().k()) {
                FragmentContainerView Vh = Vh();
                ViewGroup.LayoutParams layoutParams2 = Vh.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = 0;
                    Vh.setLayoutParams(layoutParams2);
                    un3.e(Jh());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            p45.j(Dh(), 0, 0, 0, 0, 13, null);
            Jh().setLayoutManager(new FlexboxLayoutManager(getActivity()));
            Jh().setAdapter(new k6.a(new k6(this.Z), f.a, new b9(new m(), new n(), new h()), g.a).b().d());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ji(b bVar, View view) {
        z65.h(bVar, "this$0");
        bVar.bi().w(EditDeliveryAddressMapFSMPresenter.b.a.a);
    }

    private final void ki() {
        BottomSheetBehavior<View> a2 = h64.a(Oh());
        a2.Z(Bh());
        a2.T(false);
        a2.Y(true);
        a2.f0(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void li(b bVar, rg4 rg4Var, Function1 function1) {
        z65.h(bVar, "this$0");
        z65.h(rg4Var, "$googleMap");
        z65.h(function1, "$onCoordinateChanged");
        if (!bVar.isAdded()) {
            return;
        }
        n66 n66Var = bVar.Y;
        Context requireContext = bVar.requireContext();
        z65.g(requireContext, "requireContext(...)");
        n66Var.p(rg4Var, requireContext);
        wz3.C(wz3.F(bVar.Y.n(), new o(function1, null)), pp5.a(bVar));
        bVar.bi().w(EditDeliveryAddressMapFSMPresenter.b.h.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mi(int i2) {
        int childCount = Jh().getChildCount() - 1;
        if (childCount == i2) {
            a();
        } else if (childCount > i2) {
            Jh().getChildAt(i2 + 1).requestFocus();
        }
    }

    private final void ni() {
        ig5.a.d(di());
    }

    private final void oi(boolean z) {
        String string;
        if (z) {
            Ph().setText("");
            return;
        }
        DodoButton Ph = Ph();
        if (Nh().k()) {
            string = getString(o09.continue_text);
        } else {
            string = getString(o09.save);
        }
        Ph.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void qi() {
        if (!Nh().k()) {
            this.Y.x(fi().getHeight(), Bh());
        }
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void B4() {
        Xh().setState(DodoButton.a.b);
        Zh().setState(DodoButton.a.c);
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void D5(w56 w56Var) {
        boolean z;
        int i2;
        int i3;
        int i4;
        String str;
        int i5;
        int i6;
        z65.h(w56Var, "addressVO");
        Ph().setState(z56.a(w56Var.g()));
        int i7 = 0;
        if (w56Var.g() == di0.b) {
            z = true;
        } else {
            z = false;
        }
        oi(z);
        Qh().setState(z56.a(w56Var.i()));
        View gi = gi();
        if (w56Var.c()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        gi.setVisibility(i2);
        View Sh = Sh();
        if (w56Var.d()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        Sh.setVisibility(i3);
        ei().setText(getString(w56Var.n()));
        View Wh = Wh();
        if (w56Var.k()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        Wh.setVisibility(i4);
        Mh().setEnabled(w56Var.f());
        Mh().setHint(w56Var.o());
        EditText editText = Mh().getEditText();
        if (editText != null) {
            editText.setText(w56Var.h());
        }
        DodoEditTextInputLayout Mh = Mh();
        if (w56Var.m()) {
            str = "";
        } else {
            str = null;
        }
        Mh.setError(str);
        View Rh = Rh();
        if (w56Var.b()) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        Rh.setVisibility(i5);
        View ai = ai();
        if (!w56Var.b()) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        ai.setVisibility(i6);
        View Lh = Lh();
        if (!(!w56Var.a())) {
            i7 = 8;
        }
        Lh.setVisibility(i7);
        BottomSheetBehavior<View> a2 = h64.a(Oh());
        int b = z56.b(w56Var.j());
        if (b == 3) {
            this.W4.invoke();
        }
        a2.f0(b);
        h64.b(this.Z, w56Var.l());
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void E0(boolean z) {
        sh0.d(pp5.a(this), null, null, new r(z, null), 3, null);
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void Jg() {
        pi();
        n1c.e(Hh(), Ih());
        n1c.e(Fh(), Gh());
        n1c.e(Eh(), Yh());
    }

    @Override // defpackage.tj1.a
    public void O8(String str) {
        z65.h(str, "id");
        Context context = getContext();
        if (context != null) {
            av1.c(context);
        }
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void Q2(LatLng latLng, boolean z) {
        z65.h(latLng, "latLng");
        this.Y.B(latLng, z);
    }

    @Override // defpackage.iu6.e
    public void S9() {
        bi().w(EditDeliveryAddressMapFSMPresenter.b.d.a);
    }

    public final je4 Th() {
        je4 je4Var = this.S4;
        if (je4Var != null) {
            return je4Var;
        }
        z65.z("geoLocationProviderFactory");
        return null;
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void a() {
        gg5.c(Mh());
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void c() {
        tj1.b bVar = tj1.e;
        String string = requireContext().getString(o09.d0);
        z65.g(string, "getString(...)");
        bVar.a(string, requireContext().getString(o09.i), requireContext().getString(o09.V), "request_permission").show(getChildFragmentManager(), "request_permission");
    }

    public final as8<EditDeliveryAddressMapFSMPresenter> ci() {
        as8<EditDeliveryAddressMapFSMPresenter> as8Var = this.T4;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void d0(LatLng latLng) {
        z65.h(latLng, "latLng");
        this.Y.A(latLng);
    }

    @Override // defpackage.f70
    protected void ih(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        final int i2;
        z65.h(view, "rootView");
        ViewGroup.LayoutParams layoutParams = di().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        final int i3 = 0;
        if (marginLayoutParams != null) {
            i2 = marginLayoutParams.bottomMargin;
        } else {
            i2 = 0;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        }
        if (marginLayoutParams2 != null) {
            i3 = marginLayoutParams2.topMargin;
        }
        syb.I0(view, new h77() { // from class: cd3
            @Override // defpackage.h77
            public final c5c a(View view2, c5c c5cVar) {
                c5c hi;
                hi = b.hi(b.this, i2, i3, view2, c5cVar);
                return hi;
            }
        });
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void m(LatLngBounds latLngBounds) {
        z65.h(latLngBounds, "bounds");
        this.Y.y(latLngBounds);
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void m7() {
        pi();
        gi().setVisibility(0);
        ei().setText(getString(o09.v));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 100 && i3 == -1) {
            E0(true);
        }
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        bi().w(EditDeliveryAddressMapFSMPresenter.b.a.a);
        return true;
    }

    @Override // defpackage.tj1.a
    public void onCancel(String str) {
        z65.h(str, "id");
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        bd3.a.a().a((EditAddressMapFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(EditAddressMapFeatureDependencies.class)), (EditAddressMapRoutingFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(EditAddressMapRoutingFeatureDependencies.class)), (OnDeliveryLocationSelectedDependencies) getComponentDependenciesRegistry().a(bc9.b(OnDeliveryLocationSelectedDependencies.class)), Nh(), new sj1(Nh().j(), Nh().b(), Nh().d(), Nh().f())).a(this);
        super.onCreate(bundle);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ni();
        super.onDestroyView();
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        ii();
    }

    @Override // defpackage.n87
    public void p6(final rg4 rg4Var) {
        z65.h(rg4Var, "googleMap");
        rg4Var.l(MapStyleOptions.h(requireContext(), i09.geo_map_style));
        final Function1 b = kn2.b(pp5.a(this), 0L, new p(), 1, null);
        rg4Var.p(new rg4.f() { // from class: ed3
            @Override // defpackage.rg4.f
            public final void a() {
                b.li(b.this, rg4Var, b);
            }
        });
    }

    public void pi() {
        DodoButton Xh = Xh();
        DodoButton.a aVar = DodoButton.a.a;
        Xh.setState(aVar);
        Zh().setState(aVar);
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void q(k9a.b bVar) {
        z65.h(bVar, "request");
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        x81.c(requireContext, new s(bVar), new t(bVar));
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void y0() {
        new iu6.a().a(false).e(o09.delete_address_text).c(o09.i).d(o09.N).g(this);
    }

    @Override // defpackage.iu6.c
    public void l0() {
    }
}
