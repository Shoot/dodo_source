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
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapPresenter;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.adapter.AddressMapComponentVH;
import com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.d;
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
/* compiled from: EditDeliveryAddressMapFragment.kt */
@Metadata(d1 = {"\u0000ª\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ò\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001#B\t¢\u0006\u0006\bð\u0001\u0010ñ\u0001J\b\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\bH\u0002J\b\u0010\u000f\u001a\u00020\bH\u0002J\b\u0010\u0010\u001a\u00020\bH\u0002J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\b\u0010\u0017\u001a\u00020\nH\u0002J\b\u0010\u0018\u001a\u00020\nH\u0002J\u0012\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001f\u001a\u00020\bH\u0016J\u0010\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001cH\u0014J\b\u0010\"\u001a\u00020\u0011H\u0016J\b\u0010#\u001a\u00020\bH\u0016J\b\u0010$\u001a\u00020\bH\u0016J\u0010\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%H\u0016J\u0010\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(H\u0016J\u0010\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020\u0011H\u0016J\u0018\u00100\u001a\u00020\b2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0011H\u0016J\"\u00105\u001a\u00020\b2\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u000103H\u0016J\u0010\u00108\u001a\u00020\b2\u0006\u00107\u001a\u000206H\u0016J\b\u00109\u001a\u00020\bH\u0016J\u0010\u0010<\u001a\u00020\b2\u0006\u0010;\u001a\u00020:H\u0016J\u0010\u0010=\u001a\u00020\b2\u0006\u0010.\u001a\u00020-H\u0016J\b\u0010>\u001a\u00020\bH\u0016J\b\u0010?\u001a\u00020\bH\u0016J\b\u0010@\u001a\u00020\bH\u0016J\b\u0010A\u001a\u00020\bH\u0016J\b\u0010B\u001a\u00020\bH\u0016J\b\u0010C\u001a\u00020\bH\u0016J\u0010\u0010F\u001a\u00020\b2\u0006\u0010E\u001a\u00020DH\u0016J\u0010\u0010G\u001a\u00020\b2\u0006\u0010E\u001a\u00020DH\u0016R\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010I\u001a\u0004\bJ\u0010KR\u001b\u0010P\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010I\u001a\u0004\bN\u0010OR\u001b\u0010S\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010I\u001a\u0004\bR\u0010OR\u001b\u0010X\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010I\u001a\u0004\bV\u0010WR\u001b\u0010[\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010I\u001a\u0004\bZ\u0010OR\u001b\u0010`\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010I\u001a\u0004\b^\u0010_R\u001b\u0010c\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010I\u001a\u0004\bb\u0010OR\u001b\u0010f\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010I\u001a\u0004\be\u0010OR\u001b\u0010k\u001a\u00020g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010I\u001a\u0004\bi\u0010jR\u001b\u0010p\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010I\u001a\u0004\bn\u0010oR\u001b\u0010r\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010I\u001a\u0004\bq\u0010oR\u001b\u0010u\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010I\u001a\u0004\bt\u0010OR\u001b\u0010x\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010I\u001a\u0004\bw\u0010OR\u001b\u0010}\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010I\u001a\u0004\b{\u0010|R\u001b\u0010\u007f\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010I\u001a\u0004\b~\u0010OR \u0010\u0084\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0081\u0001\u0010I\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R \u0010\u0089\u0001\u001a\u00030\u0085\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0086\u0001\u0010I\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R \u0010\u008c\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008a\u0001\u0010I\u001a\u0006\b\u008b\u0001\u0010\u0083\u0001R \u0010\u008f\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008d\u0001\u0010I\u001a\u0006\b\u008e\u0001\u0010\u0083\u0001R \u0010\u0094\u0001\u001a\u00030\u0090\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0091\u0001\u0010I\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R \u0010\u0097\u0001\u001a\u00030\u0090\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0095\u0001\u0010I\u001a\u0006\b\u0096\u0001\u0010\u0093\u0001R \u0010\u009c\u0001\u001a\u00030\u0098\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0099\u0001\u0010I\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R \u0010\u009f\u0001\u001a\u00030\u0098\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u009d\u0001\u0010I\u001a\u0006\b\u009e\u0001\u0010\u009b\u0001R \u0010¢\u0001\u001a\u00030\u0098\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b \u0001\u0010I\u001a\u0006\b¡\u0001\u0010\u009b\u0001R \u0010¥\u0001\u001a\u00030\u0098\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b£\u0001\u0010I\u001a\u0006\b¤\u0001\u0010\u009b\u0001R \u0010ª\u0001\u001a\u00030¦\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b§\u0001\u0010I\u001a\u0006\b¨\u0001\u0010©\u0001R\u001e\u0010\u00ad\u0001\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b«\u0001\u0010I\u001a\u0005\b¬\u0001\u0010oR\u001e\u0010°\u0001\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b®\u0001\u0010I\u001a\u0005\b¯\u0001\u0010oR \u0010³\u0001\u001a\u00030¦\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b±\u0001\u0010I\u001a\u0006\b²\u0001\u0010©\u0001R\u001e\u0010¶\u0001\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b´\u0001\u0010I\u001a\u0005\bµ\u0001\u0010oR\u001e\u0010¹\u0001\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b·\u0001\u0010I\u001a\u0005\b¸\u0001\u0010oR\"\u0010¾\u0001\u001a\r »\u0001*\u0005\u0018\u00010º\u00010º\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0018\u0010Â\u0001\u001a\u00030¿\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R!\u0010Ç\u0001\u001a\n\u0012\u0005\u0012\u00030Ä\u00010Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R*\u0010Ï\u0001\u001a\u00030È\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÉ\u0001\u0010Ê\u0001\u001a\u0006\bË\u0001\u0010Ì\u0001\"\u0006\bÍ\u0001\u0010Î\u0001R1\u0010Ø\u0001\u001a\n\u0012\u0005\u0012\u00030Ñ\u00010Ð\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÒ\u0001\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010Õ\u0001\"\u0006\bÖ\u0001\u0010×\u0001R*\u0010à\u0001\u001a\u00030Ù\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÚ\u0001\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0006\bÞ\u0001\u0010ß\u0001R+\u0010å\u0001\u001a\r »\u0001*\u0005\u0018\u00010Ñ\u00010Ñ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bá\u0001\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001R!\u0010ë\u0001\u001a\u00030æ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bç\u0001\u0010è\u0001\u001a\u0006\bé\u0001\u0010ê\u0001R\u001e\u0010ï\u0001\u001a\t\u0012\u0004\u0012\u00020\b0ì\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001¨\u0006ó\u0001"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/d;", "Lf70;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/i;", "Liu6$e;", "Liu6$c;", "Lw50;", "Ln87;", "Ltj1$a;", "", "qi", "", "currentIdx", "ui", "Bh", "vi", "si", "yi", "", "isInvisible", "wi", "Loz3;", "Lcw5;", "ci", "Ch", "Dh", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "onDestroyView", "rootView", "ih", "onBackPressed", "a", com.huawei.hms.opendevice.c.a, "Lrg4;", "googleMap", "p6", "Lw56;", "addressVO", "D5", "isInitialRequest", "E0", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "changePinStatus", "Q2", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Lk9a$b;", "request", "q", "y0", "Lcom/google/android/gms/maps/model/LatLngBounds;", "bounds", Image.TYPE_MEDIUM, "d0", "B4", "xi", "Jg", "m7", "S9", "l0", "", "id", "O8", "onCancel", "Landroidx/appcompat/widget/Toolbar;", "Lk79;", "ni", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", DateTokenConverter.CONVERTER_KEY, "ei", "()Landroid/view/View;", "myLocationButton", com.huawei.hms.push.e.a, "Uh", "bottomSheetLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "f", "li", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "root", "g", "ii", "pinView", "Landroidx/recyclerview/widget/RecyclerView;", Image.TYPE_HIGH, "Ph", "()Landroidx/recyclerview/widget/RecyclerView;", "addressComponentsRecyclerView", "i", "Qh", "addressMapBottomSheetBlackout", "j", "Rh", "addressMapStartingBlackout", "Lcom/dodopizza/android/textinputlayout/DodoEditTextInputLayout;", "k", "Sh", "()Lcom/dodopizza/android/textinputlayout/DodoEditTextInputLayout;", "addressMapTextInputLayout", "Lcom/dodopizza/android/buttons/DodoButton;", "l", "Wh", "()Lcom/dodopizza/android/buttons/DodoButton;", "confirmButton", "Xh", "deleteButton", "n", "oi", "warning", "o", "Zh", "errorIcon", "Landroidx/appcompat/widget/AppCompatTextView;", "p", "mi", "()Landroidx/appcompat/widget/AppCompatTextView;", "textWarning", "Yh", "designProgress", "Landroid/widget/LinearLayout;", "r", "Eh", "()Landroid/widget/LinearLayout;", "addressButtonLayout", "Landroidx/fragment/app/FragmentContainerView;", Image.TYPE_SMALL, "di", "()Landroidx/fragment/app/FragmentContainerView;", "mapContainer", "t", "Hh", "addressCatcherLayout", "u", "Gh", "addressCatcherButtonLayout", "Landroid/widget/FrameLayout;", "v", "Nh", "()Landroid/widget/FrameLayout;", "addressCatcherTitleContainer", "w", "Kh", "addressCatcherMessageContainer", "Landroid/widget/TextView;", "x", "Mh", "()Landroid/widget/TextView;", "addressCatcherTitle", "y", "Oh", "addressCatcherTitleSubscribe", "z", "Jh", "addressCatcherMessage", "A", "Lh", "addressCatcherMessageSubscribe", "Landroid/view/ViewGroup;", "B", "Fh", "()Landroid/view/ViewGroup;", "addressCatcherButtonContainer", "I", "fi", "notifyMeButton", "X", "hi", "pickupOrderSuccessScreenButton", "Y", "Ih", "addressCatcherMenuButtonContainer", "Z", "gi", "pickupOrderStartScreenButton", "S4", "Vh", "checkMenuButton", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "T4", "Lorg/slf4j/Logger;", "logger", "Ln66;", "U4", "Ln66;", "mapController", "Ll6;", "Ld7;", "V4", "Ll6;", "detailsFieldsDataset", "Lje4;", "W4", "Lje4;", "bi", "()Lje4;", "setGeoLocationProviderFactory", "(Lje4;)V", "geoLocationProviderFactory", "Las8;", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter;", "X4", "Las8;", "ki", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "Lhq3;", "Y4", "Lhq3;", "ai", "()Lhq3;", "setFeatureService", "(Lhq3;)V", "featureService", "Z4", "Lmoxy/ktx/MoxyKtxDelegate;", "ji", "()Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter;", "presenter", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;", "a5", "Lrn5;", "Th", "()Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;", "args", "Lkotlin/Function0;", "b5", "Lkotlin/jvm/functions/Function0;", "handleMovingBottomSheetOnce", "<init>", "()V", "c5", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class d extends f70 implements com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i, iu6.e, iu6.c, w50, n87, tj1.a {
    private final k79 A;
    private final k79 B;
    private final k79 I;
    private final k79 S4;
    private final Logger T4;
    private final n66 U4;
    private l6<d7> V4;
    public je4 W4;
    private final k79 X;
    public as8<EditDeliveryAddressMapPresenter> X4;
    private final k79 Y;
    public hq3 Y4;
    private final k79 Z;
    private final MoxyKtxDelegate Z4;
    private final rn5 a5;
    private final Function0<Unit> b5;
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
    static final /* synthetic */ je5<Object>[] d5 = {bc9.f(new ar8(d.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(d.class, "myLocationButton", "getMyLocationButton()Landroid/view/View;", 0)), bc9.f(new ar8(d.class, "bottomSheetLayout", "getBottomSheetLayout()Landroid/view/View;", 0)), bc9.f(new ar8(d.class, "root", "getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;", 0)), bc9.f(new ar8(d.class, "pinView", "getPinView()Landroid/view/View;", 0)), bc9.f(new ar8(d.class, "addressComponentsRecyclerView", "getAddressComponentsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(d.class, "addressMapBottomSheetBlackout", "getAddressMapBottomSheetBlackout()Landroid/view/View;", 0)), bc9.f(new ar8(d.class, "addressMapStartingBlackout", "getAddressMapStartingBlackout()Landroid/view/View;", 0)), bc9.f(new ar8(d.class, "addressMapTextInputLayout", "getAddressMapTextInputLayout()Lcom/dodopizza/android/textinputlayout/DodoEditTextInputLayout;", 0)), bc9.f(new ar8(d.class, "confirmButton", "getConfirmButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(d.class, "deleteButton", "getDeleteButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(d.class, "warning", "getWarning()Landroid/view/View;", 0)), bc9.f(new ar8(d.class, "errorIcon", "getErrorIcon()Landroid/view/View;", 0)), bc9.f(new ar8(d.class, "textWarning", "getTextWarning()Landroidx/appcompat/widget/AppCompatTextView;", 0)), bc9.f(new ar8(d.class, "designProgress", "getDesignProgress()Landroid/view/View;", 0)), bc9.f(new ar8(d.class, "addressButtonLayout", "getAddressButtonLayout()Landroid/widget/LinearLayout;", 0)), bc9.f(new ar8(d.class, "mapContainer", "getMapContainer()Landroidx/fragment/app/FragmentContainerView;", 0)), bc9.f(new ar8(d.class, "addressCatcherLayout", "getAddressCatcherLayout()Landroid/widget/LinearLayout;", 0)), bc9.f(new ar8(d.class, "addressCatcherButtonLayout", "getAddressCatcherButtonLayout()Landroid/widget/LinearLayout;", 0)), bc9.f(new ar8(d.class, "addressCatcherTitleContainer", "getAddressCatcherTitleContainer()Landroid/widget/FrameLayout;", 0)), bc9.f(new ar8(d.class, "addressCatcherMessageContainer", "getAddressCatcherMessageContainer()Landroid/widget/FrameLayout;", 0)), bc9.f(new ar8(d.class, "addressCatcherTitle", "getAddressCatcherTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(d.class, "addressCatcherTitleSubscribe", "getAddressCatcherTitleSubscribe()Landroid/widget/TextView;", 0)), bc9.f(new ar8(d.class, "addressCatcherMessage", "getAddressCatcherMessage()Landroid/widget/TextView;", 0)), bc9.f(new ar8(d.class, "addressCatcherMessageSubscribe", "getAddressCatcherMessageSubscribe()Landroid/widget/TextView;", 0)), bc9.f(new ar8(d.class, "addressCatcherButtonContainer", "getAddressCatcherButtonContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(d.class, "notifyMeButton", "getNotifyMeButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(d.class, "pickupOrderSuccessScreenButton", "getPickupOrderSuccessScreenButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(d.class, "addressCatcherMenuButtonContainer", "getAddressCatcherMenuButtonContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(d.class, "pickupOrderStartScreenButton", "getPickupOrderStartScreenButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(d.class, "checkMenuButton", "getCheckMenuButton()Lcom/dodopizza/android/buttons/DodoButton;", 0)), bc9.f(new ar8(d.class, "presenter", "getPresenter()Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter;", 0))};
    public static final a c5 = new a(null);

    /* compiled from: EditDeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0014\u0010\u0010\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/d$a;", "", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;", "data", "Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/d;", "a", "", "DEFAULT_ACTION_BAR_SIZE", "I", "", "EXTRA_FRAGMENT_DATA", "Ljava/lang/String;", "", "PIN_ANIMATION_DURATION", "J", "REQUEST_CODE_ENABLE_LOCATION_PROVIDERS", "SCREEN_DELIMITER", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a aVar) {
            z65.h(aVar, "data");
            return (d) y64.d(new d(), bi0.c(bi0.d("extra_fragment_data", aVar)));
        }
    }

    /* compiled from: EditDeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/dodopizza/geo/feature/editdeliveryaddressmap/presentation/d$b", "Ljg5;", "", "isVisible", "", "a", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b implements jg5 {
        b() {
        }

        @Override // defpackage.jg5
        public void a(boolean z) {
            int i;
            boolean z2;
            int i2;
            int i3;
            int i4;
            DodoButton Wh = d.this.Wh();
            int i5 = 8;
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            Wh.setVisibility(i);
            DodoButton Xh = d.this.Xh();
            if (!z && d.this.ji().H()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            Xh.setVisibility(i2);
            View ei = d.this.ei();
            if (z) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            ei.setVisibility(i3);
            View Qh = d.this.Qh();
            if (z) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            Qh.setVisibility(i4);
            View ii = d.this.ii();
            if (!z) {
                i5 = 0;
            }
            ii.setVisibility(i5);
        }
    }

    /* compiled from: EditDeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;", "a", "()Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/a;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function0<com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a invoke() {
            Bundle arguments = d.this.getArguments();
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
    /* compiled from: EditDeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lqy7;", "result", "Loz3;", "Lcw5;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFragment$getLocation$1", f = "EditDeliveryAddressMapFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0145d extends f3b implements Function2<qy7, cv1<? super oz3<? extends cw5>>, Object> {
        int a;
        /* synthetic */ Object b;

        C0145d(cv1<? super C0145d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            C0145d c0145d = new C0145d(cv1Var);
            c0145d.b = obj;
            return c0145d;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(qy7 qy7Var, cv1<? super oz3<? extends cw5>> cv1Var) {
            return ((C0145d) create(qy7Var, cv1Var)).invokeSuspend(Unit.a);
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
                            return wz3.L(qv5.b.a(qv5.a.a(d.this.bi()), null, 1, null), 1);
                        }
                    }
                }
                return wz3.A(cw5.b.a);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: EditDeliveryAddressMapFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    /* synthetic */ class e extends m94 implements Function0<Unit> {
        e(Object obj) {
            super(0, obj, d.class, "updateMapPadding", "updateMapPadding()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((d) this.receiver).yi();
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
    /* compiled from: EditDeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class h extends ej5 implements Function1<View, Unit> {
        h() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            d.this.ji().L();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class i extends ej5 implements Function1<Integer, Unit> {
        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.a;
        }

        public final void invoke(int i) {
            d.this.ui(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ld7;", "field", "", "text", "", "a", "(Ld7;Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class j extends ej5 implements Function2<d7, String, Unit> {
        j() {
            super(2);
        }

        public final void a(d7 d7Var, String str) {
            z65.h(d7Var, "field");
            z65.h(str, "text");
            d.this.ji().S(d7Var.c(), str);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(d7 d7Var, String str) {
            a(d7Var, str);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld7;", "it", "", "a", "(Ld7;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class k extends ej5 implements Function1<d7, Unit> {
        k() {
            super(1);
        }

        public final void a(d7 d7Var) {
            z65.h(d7Var, "it");
            d.this.ji().T(d7Var.c());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(d7 d7Var) {
            a(d7Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class l extends ej5 implements Function1<View, Unit> {
        l() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            d.this.ji().O();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class m extends ej5 implements Function1<View, Unit> {
        m() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            d.this.ji().R();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class n extends ej5 implements Function1<View, Unit> {
        n() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            d.this.ji().e();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class o extends ej5 implements Function1<View, Unit> {
        o() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            d.this.ji().V(d.this.Th().k());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class p extends ej5 implements Function1<View, Unit> {
        p() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            d.this.ji().M(d.this.Th().k());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class q extends ej5 implements Function1<View, Unit> {
        q() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            d.this.ji().W(d.this.Th().k());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class r extends ej5 implements Function1<View, Unit> {
        r() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            d.this.ji().U();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lu68;", "status", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFragment$onMapReady$1$1", f = "EditDeliveryAddressMapFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class s extends f3b implements Function2<u68, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ Function1<LatLng, Unit> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        s(Function1<? super LatLng, Unit> function1, cv1<? super s> cv1Var) {
            super(2, cv1Var);
            this.d = function1;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            s sVar = new s(this.d, cv1Var);
            sVar.b = obj;
            return sVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(u68 u68Var, cv1<? super Unit> cv1Var) {
            return ((s) create(u68Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                u68 u68Var = (u68) this.b;
                if (u68Var instanceof u68.b) {
                    d.this.ji().X();
                } else if (u68Var instanceof u68.a) {
                    this.d.invoke(((u68.a) u68Var).a());
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: EditDeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/maps/model/LatLng;", "it", "", "a", "(Lcom/google/android/gms/maps/model/LatLng;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class t extends ej5 implements Function1<LatLng, Unit> {
        t() {
            super(1);
        }

        public final void a(LatLng latLng) {
            z65.h(latLng, "it");
            Logger logger = d.this.T4;
            LatLngBounds k = d.this.U4.k();
            Float l = d.this.U4.l();
            logger.info("reverse-geocode bounds / zoom - ", k + " / " + l);
            d.this.ji().P(latLng);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LatLng latLng) {
            a(latLng);
            return Unit.a;
        }
    }

    /* compiled from: EditDeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/geo/feature/editdeliveryaddressmap/presentation/EditDeliveryAddressMapPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class u extends ej5 implements Function0<EditDeliveryAddressMapPresenter> {
        u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final EditDeliveryAddressMapPresenter invoke() {
            return d.this.ki().get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditDeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFragment$requestUserLocation$1", f = "EditDeliveryAddressMapFragment.kt", l = {465}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class v extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ boolean c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EditDeliveryAddressMapFragment.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcw5;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.EditDeliveryAddressMapFragment$requestUserLocation$1$1", f = "EditDeliveryAddressMapFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends f3b implements y84<pz3<? super cw5>, Throwable, cv1<? super Unit>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ d c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, cv1<? super a> cv1Var) {
                super(3, cv1Var);
                this.c = dVar;
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
                    this.c.T4.warn("Failed to request location. ", (Throwable) this.b);
                    return Unit.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EditDeliveryAddressMapFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcw5;", "result", "", "b", "(Lcw5;Lcv1;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class b<T> implements pz3 {
            final /* synthetic */ d a;
            final /* synthetic */ boolean b;

            b(d dVar, boolean z) {
                this.a = dVar;
                this.b = z;
            }

            @Override // defpackage.pz3
            /* renamed from: b */
            public final Object emit(cw5 cw5Var, cv1<? super Unit> cv1Var) {
                if (cw5Var instanceof cw5.c) {
                    gw5.a((cw5.c) cw5Var, this.a, 100);
                } else {
                    this.a.ji().Y(zv5.a(cw5Var), this.b);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(boolean z, cv1<? super v> cv1Var) {
            super(2, cv1Var);
            this.c = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new v(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((v) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                oz3 h = wz3.h(d.this.ci(), new a(d.this, null));
                b bVar = new b(d.this, this.c);
                this.a = 1;
                if (h.collect(bVar, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: EditDeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class w extends ej5 implements Function0<Unit> {
        final /* synthetic */ k9a.b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(k9a.b bVar) {
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
            d.this.ji().N(EditDeliveryAddressMapPresenter.a.b.a, this.b);
        }
    }

    /* compiled from: EditDeliveryAddressMapFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class x extends ej5 implements Function0<Unit> {
        final /* synthetic */ k9a.b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(k9a.b bVar) {
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
            d.this.ji().N(EditDeliveryAddressMapPresenter.a.C0141a.a, this.b);
        }
    }

    public d() {
        super(dz8.fragment_delivery_edit_address_map);
        rn5 b2;
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
        this.t = kb0.e(this, dy8.address_catcher_layout);
        this.u = kb0.e(this, dy8.address_catcher_button_layout);
        this.v = kb0.e(this, dy8.address_catcher_title_container);
        this.w = kb0.e(this, dy8.address_catcher_message_container);
        this.x = kb0.e(this, dy8.address_catcher_title);
        this.y = kb0.e(this, dy8.address_catcher_title_subscribe);
        this.z = kb0.e(this, dy8.address_catcher_message);
        this.A = kb0.e(this, dy8.address_catcher_message_subscribe);
        this.B = kb0.e(this, dy8.address_catcher_button_container);
        this.I = kb0.e(this, dy8.notify_me_button);
        this.X = kb0.e(this, dy8.pickup_order_success_screen_button);
        this.Y = kb0.e(this, dy8.address_catcher_menu_button_container);
        this.Z = kb0.e(this, dy8.pickup_order_start_screen_button);
        this.S4 = kb0.e(this, dy8.check_menu_button);
        this.T4 = LoggerFactory.getLogger("EditDeliveryAddressMapFragment");
        this.U4 = new n66();
        this.V4 = new l6<>(null, 1, null);
        u uVar = new u();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.Z4 = new MoxyKtxDelegate(mvpDelegate, EditDeliveryAddressMapPresenter.class.getName() + ".presenter", uVar);
        b2 = yn5.b(new c());
        this.a5 = b2;
        this.b5 = y97.a(new e(this));
    }

    private final void Bh() {
        ig5.a.b(li(), new b());
    }

    private final int Ch() {
        Integer num;
        Resources resources;
        DisplayMetrics displayMetrics;
        int Dh = Dh();
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            num = Integer.valueOf(displayMetrics.heightPixels);
        } else {
            num = null;
        }
        if (num != null) {
            num.intValue();
            return (num.intValue() / 2) - Dh;
        }
        return Uh().getHeight();
    }

    private final int Dh() {
        TypedValue typedValue = new TypedValue();
        if (requireActivity().getTheme().resolveAttribute(ov8.a, typedValue, true)) {
            return TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        }
        return 60;
    }

    private final LinearLayout Eh() {
        return (LinearLayout) this.r.a(this, d5[15]);
    }

    private final ViewGroup Fh() {
        return (ViewGroup) this.B.a(this, d5[25]);
    }

    private final LinearLayout Gh() {
        return (LinearLayout) this.u.a(this, d5[18]);
    }

    private final LinearLayout Hh() {
        return (LinearLayout) this.t.a(this, d5[17]);
    }

    private final ViewGroup Ih() {
        return (ViewGroup) this.Y.a(this, d5[28]);
    }

    private final TextView Jh() {
        return (TextView) this.z.a(this, d5[23]);
    }

    private final FrameLayout Kh() {
        return (FrameLayout) this.w.a(this, d5[20]);
    }

    private final TextView Lh() {
        return (TextView) this.A.a(this, d5[24]);
    }

    private final TextView Mh() {
        return (TextView) this.x.a(this, d5[21]);
    }

    private final FrameLayout Nh() {
        return (FrameLayout) this.v.a(this, d5[19]);
    }

    private final TextView Oh() {
        return (TextView) this.y.a(this, d5[22]);
    }

    private final RecyclerView Ph() {
        return (RecyclerView) this.h.a(this, d5[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View Qh() {
        return (View) this.i.a(this, d5[6]);
    }

    private final View Rh() {
        return (View) this.j.a(this, d5[7]);
    }

    private final DodoEditTextInputLayout Sh() {
        return (DodoEditTextInputLayout) this.k.a(this, d5[8]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a Th() {
        return (com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.a) this.a5.getValue();
    }

    private final View Uh() {
        return (View) this.e.a(this, d5[2]);
    }

    private final DodoButton Vh() {
        return (DodoButton) this.S4.a(this, d5[30]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DodoButton Wh() {
        return (DodoButton) this.l.a(this, d5[9]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DodoButton Xh() {
        return (DodoButton) this.m.a(this, d5[10]);
    }

    private final View Yh() {
        return (View) this.q.a(this, d5[14]);
    }

    private final View Zh() {
        return (View) this.o.a(this, d5[12]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<cw5> ci() {
        return wz3.x(ky7.a.a(this).a("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"), new C0145d(null));
    }

    private final FragmentContainerView di() {
        return (FragmentContainerView) this.s.a(this, d5[16]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View ei() {
        return (View) this.d.a(this, d5[1]);
    }

    private final DodoButton fi() {
        return (DodoButton) this.I.a(this, d5[26]);
    }

    private final DodoButton gi() {
        return (DodoButton) this.Z.a(this, d5[29]);
    }

    private final DodoButton hi() {
        return (DodoButton) this.X.a(this, d5[27]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View ii() {
        return (View) this.g.a(this, d5[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditDeliveryAddressMapPresenter ji() {
        return (EditDeliveryAddressMapPresenter) this.Z4.getValue(this, d5[31]);
    }

    private final ConstraintLayout li() {
        return (ConstraintLayout) this.f.a(this, d5[3]);
    }

    private final AppCompatTextView mi() {
        return (AppCompatTextView) this.p.a(this, d5[13]);
    }

    private final Toolbar ni() {
        return (Toolbar) this.c.a(this, d5[0]);
    }

    private final View oi() {
        return (View) this.n.a(this, d5[11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5c pi(d dVar, int i2, int i3, View view, c5c c5cVar) {
        z65.h(dVar, "this$0");
        z65.h(view, "view");
        z65.h(c5cVar, "insets");
        p45.j(dVar.li(), 0, 0, 0, i2 + c5cVar.i(), 7, null);
        p45.j(view, 0, i3 + c5cVar.l(), 0, 0, 13, null);
        return c5cVar;
    }

    private final void qi() {
        int i2;
        ni().setNavigationOnClickListener(new View.OnClickListener() { // from class: hd3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.ri(d.this, view);
            }
        });
        Fragment k0 = getChildFragmentManager().k0(dy8.delivery_address_map);
        z65.f(k0, "null cannot be cast to non-null type com.google.android.gms.maps.SupportMapFragment");
        ((SupportMapFragment) k0).gh(this);
        oma.a(Wh(), new l());
        oma.a(Xh(), new m());
        DodoButton Xh = Xh();
        if (!ji().H()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        Xh.setVisibility(i2);
        si();
        Bh();
        oma.a(ei(), new n());
        oma.a(gi(), new o());
        oma.a(Vh(), new p());
        oma.a(hi(), new q());
        oma.a(fi(), new r());
        DodoEditTextInputLayout Sh = Sh();
        ViewGroup.LayoutParams layoutParams = Sh.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            Sh.setLayoutParams(layoutParams);
            EditText editText = Sh().getEditText();
            if (editText != null) {
                editText.setClickable(true);
                editText.setCursorVisible(false);
                editText.setFocusable(false);
                editText.setFocusableInTouchMode(false);
                editText.setInputType(131073);
                oma.a(editText, new h());
            }
            if (Th().k()) {
                FragmentContainerView di = di();
                ViewGroup.LayoutParams layoutParams2 = di.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = 0;
                    di.setLayoutParams(layoutParams2);
                    un3.e(Ph());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            p45.j(Eh(), 0, 0, 0, 0, 13, null);
            Ph().setLayoutManager(new FlexboxLayoutManager(getActivity()));
            Ph().setAdapter(new k6.a(new k6(this.V4), f.a, new b9(new i(), new j(), new k()), g.a).b().d());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ri(d dVar, View view) {
        z65.h(dVar, "this$0");
        dVar.ji().onBackPressed();
    }

    private final void si() {
        BottomSheetBehavior<View> a2 = h64.a(Uh());
        a2.Z(Ch());
        a2.T(false);
        a2.Y(true);
        a2.f0(3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ti(d dVar, rg4 rg4Var, Function1 function1) {
        z65.h(dVar, "this$0");
        z65.h(rg4Var, "$googleMap");
        z65.h(function1, "$onCoordinateChanged");
        if (!dVar.isAdded()) {
            return;
        }
        n66 n66Var = dVar.U4;
        Context requireContext = dVar.requireContext();
        z65.g(requireContext, "requireContext(...)");
        n66Var.p(rg4Var, requireContext);
        wz3.C(wz3.F(dVar.U4.n(), new s(function1, null)), pp5.a(dVar));
        dVar.ji().g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ui(int i2) {
        int childCount = Ph().getChildCount() - 1;
        if (childCount == i2) {
            a();
        } else if (childCount > i2) {
            Ph().getChildAt(i2 + 1).requestFocus();
        }
    }

    private final void vi() {
        ig5.a.d(li());
    }

    private final void wi(boolean z) {
        String string;
        if (z) {
            Wh().setText("");
            return;
        }
        DodoButton Wh = Wh();
        if (Th().k()) {
            string = getString(o09.continue_text);
        } else {
            string = getString(o09.save);
        }
        Wh.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yi() {
        if (!Th().k()) {
            this.U4.x(ni().getHeight(), Ch());
        }
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void B4() {
        fi().setState(DodoButton.a.b);
        gi().setState(DodoButton.a.c);
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void D5(w56 w56Var) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String str;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z2;
        int i15;
        z65.h(w56Var, "addressVO");
        Wh().setState(z56.a(w56Var.g()));
        int i16 = 0;
        if (w56Var.g() == di0.b) {
            z = true;
        } else {
            z = false;
        }
        wi(z);
        Xh().setState(z56.a(w56Var.i()));
        View oi = oi();
        if (w56Var.c()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        oi.setVisibility(i2);
        View Zh = Zh();
        if (w56Var.d()) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        Zh.setVisibility(i3);
        mi().setText(getString(w56Var.n()));
        View Yh = Yh();
        if (w56Var.b()) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        Yh.setVisibility(i4);
        View ii = ii();
        if (!w56Var.b()) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        ii.setVisibility(i5);
        View ei = ei();
        if (w56Var.k()) {
            i6 = 0;
        } else {
            i6 = 8;
        }
        ei.setVisibility(i6);
        Sh().setEnabled(w56Var.f());
        Sh().setHint(w56Var.o());
        EditText editText = Sh().getEditText();
        if (editText != null) {
            editText.setText(w56Var.h());
        }
        DodoEditTextInputLayout Sh = Sh();
        if (w56Var.m()) {
            str = "";
        } else {
            str = null;
        }
        Sh.setError(str);
        View Rh = Rh();
        if (!w56Var.a()) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        Rh.setVisibility(i7);
        BottomSheetBehavior<View> a2 = h64.a(Uh());
        int b2 = z56.b(w56Var.j());
        if (b2 == 3) {
            this.b5.invoke();
        }
        a2.f0(b2);
        h64.b(this.V4, w56Var.l());
        if (ai().a(bq3.I6)) {
            LinearLayout Eh = Eh();
            if (!w56Var.e()) {
                i8 = 0;
            } else {
                i8 = 8;
            }
            Eh.setVisibility(i8);
            LinearLayout Hh = Hh();
            if (w56Var.e()) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            Hh.setVisibility(i9);
            LinearLayout Gh = Gh();
            if (w56Var.e()) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            Gh.setVisibility(i10);
            FrameLayout Nh = Nh();
            if (w56Var.e()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            Nh.setVisibility(i11);
            FrameLayout Kh = Kh();
            if (w56Var.e()) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            Kh.setVisibility(i12);
            ViewGroup Fh = Fh();
            if (w56Var.e()) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            Fh.setVisibility(i13);
            ViewGroup Ih = Ih();
            if (w56Var.e()) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            Ih.setVisibility(i14);
            View oi2 = oi();
            if (!w56Var.e() && w56Var.c()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            oi2.setVisibility(i15);
            RecyclerView Ph = Ph();
            if (!(!w56Var.e())) {
                i16 = 8;
            }
            Ph.setVisibility(i16);
            Sh().setError(null);
            if (w56Var.e()) {
                n1c.e(Nh(), Mh());
                n1c.e(Kh(), Jh());
                n1c.e(Fh(), fi());
                n1c.e(Ih(), gi());
                ji().k0(w56Var.h());
            }
        }
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void E0(boolean z) {
        sh0.d(pp5.a(this), null, null, new v(z, null), 3, null);
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void Jg() {
        xi();
        n1c.e(Nh(), Oh());
        n1c.e(Kh(), Lh());
        n1c.e(Fh(), hi());
        n1c.e(Ih(), Vh());
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
        this.U4.B(latLng, z);
    }

    @Override // defpackage.iu6.e
    public void S9() {
        ji().Q();
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void a() {
        gg5.c(Sh());
    }

    public final hq3 ai() {
        hq3 hq3Var = this.Y4;
        if (hq3Var != null) {
            return hq3Var;
        }
        z65.z("featureService");
        return null;
    }

    public final je4 bi() {
        je4 je4Var = this.W4;
        if (je4Var != null) {
            return je4Var;
        }
        z65.z("geoLocationProviderFactory");
        return null;
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void c() {
        tj1.b bVar = tj1.e;
        String string = requireContext().getString(o09.d0);
        z65.g(string, "getString(...)");
        bVar.a(string, requireContext().getString(o09.i), requireContext().getString(o09.V), "request_permission").show(getChildFragmentManager(), "request_permission");
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void d0(LatLng latLng) {
        z65.h(latLng, "latLng");
        this.U4.A(latLng);
    }

    @Override // defpackage.f70
    protected void ih(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        final int i2;
        z65.h(view, "rootView");
        ViewGroup.LayoutParams layoutParams = li().getLayoutParams();
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
        syb.I0(view, new h77() { // from class: id3
            @Override // defpackage.h77
            public final c5c a(View view2, c5c c5cVar) {
                c5c pi;
                pi = d.pi(d.this, i2, i3, view2, c5cVar);
                return pi;
            }
        });
    }

    public final as8<EditDeliveryAddressMapPresenter> ki() {
        as8<EditDeliveryAddressMapPresenter> as8Var = this.X4;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void m(LatLngBounds latLngBounds) {
        z65.h(latLngBounds, "bounds");
        this.U4.y(latLngBounds);
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void m7() {
        xi();
        oi().setVisibility(0);
        mi().setText(getString(o09.v));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 100 && i3 == -1) {
            E0(true);
        }
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        ji().onBackPressed();
        return true;
    }

    @Override // defpackage.tj1.a
    public void onCancel(String str) {
        z65.h(str, "id");
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        bd3.a.a().a((EditAddressMapFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(EditAddressMapFeatureDependencies.class)), (EditAddressMapRoutingFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(EditAddressMapRoutingFeatureDependencies.class)), (OnDeliveryLocationSelectedDependencies) getComponentDependenciesRegistry().a(bc9.b(OnDeliveryLocationSelectedDependencies.class)), Th(), new sj1(Th().j(), Th().b(), Th().d(), Th().f())).b(this);
        super.onCreate(bundle);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        vi();
        super.onDestroyView();
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        qi();
    }

    @Override // defpackage.n87
    public void p6(final rg4 rg4Var) {
        z65.h(rg4Var, "googleMap");
        rg4Var.l(MapStyleOptions.h(requireContext(), i09.geo_map_style));
        final Function1 b2 = kn2.b(pp5.a(this), 0L, new t(), 1, null);
        rg4Var.p(new rg4.f() { // from class: jd3
            @Override // defpackage.rg4.f
            public final void a() {
                d.ti(d.this, rg4Var, b2);
            }
        });
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void q(k9a.b bVar) {
        z65.h(bVar, "request");
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        x81.c(requireContext, new w(bVar), new x(bVar));
    }

    public void xi() {
        DodoButton fi = fi();
        DodoButton.a aVar = DodoButton.a.a;
        fi.setState(aVar);
        gi().setState(aVar);
    }

    @Override // com.dodopizza.geo.feature.editdeliveryaddressmap.presentation.i
    public void y0() {
        new iu6.a().a(false).e(o09.delete_address_text).c(o09.i).d(o09.N).g(this);
    }

    @Override // defpackage.iu6.c
    public void l0() {
    }
}
