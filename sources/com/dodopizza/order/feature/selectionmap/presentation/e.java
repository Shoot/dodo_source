package com.dodopizza.order.feature.selectionmap.presentation;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.selectionmap.SelectionMapFeatureDependencies;
import com.dodopizza.order.feature.selectionmap.presentation.c;
import com.dodopizza.order.feature.selectionmap.presentation.d;
import com.dodopizza.order.feature.selectionmap.presentation.e;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.c5c;
import defpackage.c7a;
import defpackage.cw5;
import defpackage.qv5;
import defpackage.rg4;
import defpackage.tj1;
import defpackage.u68;
import defpackage.w9a;
import im.threads.business.transport.MessageAttributes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
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
/* compiled from: SelectionMapFragment.kt */
@Metadata(d1 = {"\u0000\u009a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 ±\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002²\u0001B\t¢\u0006\u0006\b¯\u0001\u0010°\u0001J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u0012\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0005H\u0002J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u001a\u0010!\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u000e\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"J\u000e\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0007J\u0006\u0010'\u001a\u00020\u0005J\u0010\u0010*\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010(J\u0016\u0010.\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u0007J\u0016\u00101\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u00100\u001a\u00020/J\u0010\u00103\u001a\u00020\u00052\u0006\u00102\u001a\u00020\u001dH\u0014J\u0010\u00106\u001a\u00020\u00052\u0006\u00105\u001a\u000204H\u0016J\u0018\u0010;\u001a\u00020\u00052\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0016J\u0010\u0010<\u001a\u00020\u00052\u0006\u00108\u001a\u000207H\u0016J\u0010\u0010>\u001a\u00020\u00052\u0006\u0010=\u001a\u000209H\u0016J\u0010\u0010?\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010B\u001a\u00020\u00052\u0006\u0010A\u001a\u00020@H\u0016J8\u0010J\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u0002092\u0006\u0010H\u001a\u0002092\u0006\u0010I\u001a\u000209H\u0016J\b\u0010K\u001a\u00020\u0005H\u0016J\u0018\u0010N\u001a\u00020\u00052\u0006\u0010M\u001a\u00020L2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010O\u001a\u00020\u00052\u0006\u0010M\u001a\u00020L2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010P\u001a\u00020\u0005H\u0016J\u0010\u0010R\u001a\u00020\u00052\u0006\u0010M\u001a\u00020QH\u0016J\b\u0010S\u001a\u00020\u0005H\u0016J\u0010\u0010U\u001a\u00020\u00052\u0006\u0010T\u001a\u00020+H\u0016J\u0010\u0010W\u001a\u00020\u00052\u0006\u0010V\u001a\u000209H\u0016J\"\u0010\\\u001a\u00020\u00052\u0006\u0010X\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020\u00072\b\u0010[\u001a\u0004\u0018\u00010ZH\u0016J\b\u0010]\u001a\u00020\u0005H\u0016J\u0010\u0010_\u001a\u00020\u00052\u0006\u0010^\u001a\u00020/H\u0016J\u0010\u0010`\u001a\u00020\u00052\u0006\u0010^\u001a\u00020/H\u0016R\u001b\u0010e\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010b\u001a\u0004\bc\u0010dR\u001b\u0010i\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010b\u001a\u0004\bg\u0010hR\u0014\u0010m\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010q\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010t\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010v\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bu\u0010sR\u0016\u0010x\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bw\u0010sR\u0016\u0010y\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010sR\u0016\u0010V\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u001d\u0010\u0080\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010}0|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001a\u0010\u0082\u0001\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bB\u0010\u0081\u0001R\u001a\u0010T\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u0085\u0001\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010{R\"\u0010\u008a\u0001\u001a\r \u0087\u0001*\u0005\u0018\u00010\u0086\u00010\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R*\u0010\u0092\u0001\u001a\u00030\u008b\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R*\u0010\u009a\u0001\u001a\u00030\u0093\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u0095\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R1\u0010£\u0001\u001a\n\u0012\u0005\u0012\u00030\u009c\u00010\u009b\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001\"\u0006\b¡\u0001\u0010¢\u0001R+\u0010¨\u0001\u001a\r \u0087\u0001*\u0005\u0018\u00010\u009c\u00010\u009c\u00018@X\u0080\u0084\u0002¢\u0006\u0010\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R!\u0010®\u0001\u001a\u00030©\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001¨\u0006³\u0001"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/e;", "Lf70;", "Lcom/dodopizza/order/feature/selectionmap/presentation/k;", "Ln87;", "Ltj1$a;", "", "Fh", "", "offset", "Mh", "Lev2;", "deliveryAddressInfoVoData", "Le91;", "clientDeliveryLocation", "Lh", "Lb68;", "pizzeriaVO", "Landroid/graphics/drawable/Drawable;", "yh", "Loz3;", "Lcw5;", "zh", "Jh", "Lqv5;", "Ih", "Hh", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lnaa;", MessageAttributes.TYPE, "sh", "padding", "Nh", "th", "Ls88;", "filterVO", "c5", "Ld88;", "pizzeria", "position", "Y7", "", "localityId", "uh", "rootView", "ih", "Lrg4;", "googleMap", "p6", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "", "pinStatusChange", "Yd", "x0", "isInitialRequest", "E0", "c0", "Lcom/google/android/gms/maps/model/LatLngBounds;", "bounds", Image.TYPE_MEDIUM, "Ljb7;", "operationalTypeVo", "Lhn3;", "pizzeriaType", "isShortStreetNameEnabled", "isSelectedFromMap", "isNearestPizzeria", "W7", "j", "Laaa;", "vo", "Ne", "K7", "d6", "Lcom/dodopizza/order/feature/selectionmap/presentation/c;", "L5", "y7", "selectedPizzeria", "x3", "focusOnUser", "o", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", com.huawei.hms.opendevice.c.a, "id", "O8", "onCancel", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "Lk79;", "Ah", "()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "myLocationButton", DateTokenConverter.CONVERTER_KEY, "Bh", "()Landroid/view/View;", "pinView", "Ln66;", com.huawei.hms.push.e.a, "Ln66;", "mapController", "Lea8;", "f", "Lea8;", "pizzeriasClusterMapController", "g", "Landroid/graphics/drawable/Drawable;", "openDrawable", Image.TYPE_HIGH, "focusedDrawable", "i", "closedDrawable", "userDrawable", "k", "Z", "", "Lm86;", "l", "Ljava/util/List;", "pizzeriasMarkerList", "Lm86;", "userMarker", "n", "Lb68;", "withClusterisation", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "p", "Lorg/slf4j/Logger;", "logger", "Lje4;", "q", "Lje4;", "xh", "()Lje4;", "setGeoLocationProviderFactory", "(Lje4;)V", "geoLocationProviderFactory", "Lhq3;", "r", "Lhq3;", "wh", "()Lhq3;", "setFeatureService", "(Lhq3;)V", "featureService", "Las8;", "Lcom/dodopizza/order/feature/selectionmap/presentation/SelectionMapPresenter;", Image.TYPE_SMALL, "Las8;", "Dh", "()Las8;", "setPresenterProvider$order_release", "(Las8;)V", "presenterProvider", "t", "Lmoxy/ktx/MoxyKtxDelegate;", "Ch", "()Lcom/dodopizza/order/feature/selectionmap/presentation/SelectionMapPresenter;", "presenter", "Lcom/dodopizza/order/feature/selectionmap/presentation/f;", "u", "Lrn5;", "vh", "()Lcom/dodopizza/order/feature/selectionmap/presentation/f;", "args", "<init>", "()V", "v", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class e extends f70 implements com.dodopizza.order.feature.selectionmap.presentation.k, n87, tj1.a {
    private final k79 c;
    private final k79 d;
    private final n66 e;
    private final ea8 f;
    private Drawable g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private boolean k;
    private final List<m86> l;
    private m86 m;
    private b68 n;
    private boolean o;
    private final Logger p;
    public je4 q;
    public hq3 r;
    public as8<SelectionMapPresenter> s;
    private final MoxyKtxDelegate t;
    private final rn5 u;
    static final /* synthetic */ je5<Object>[] w = {bc9.f(new ar8(e.class, "myLocationButton", "getMyLocationButton()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", 0)), bc9.f(new ar8(e.class, "pinView", "getPinView()Landroid/view/View;", 0)), bc9.f(new ar8(e.class, "presenter", "getPresenter$order_release()Lcom/dodopizza/order/feature/selectionmap/presentation/SelectionMapPresenter;", 0))};
    public static final a v = new a(null);
    public static final int x = 8;

    /* compiled from: SelectionMapFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/e$a;", "", "Lcom/dodopizza/order/feature/selectionmap/presentation/f;", "arguments", "Lcom/dodopizza/order/feature/selectionmap/presentation/e;", "a", "", "ARG_SELECTED_INITIAL_DATA", "Ljava/lang/String;", "DELIVERY_PIN_MOVED", "", "LOCATION_BUTTON_PADDING", "I", "PIZZERIA_INFO_VALUE", "REQUEST_CODE_ENABLE_LOCATION_PROVIDERS", "REQUEST_PERMISSION_ID", "SELECT_DELIVERY_KEY", "SELECT_PIZZERIA_BACK_CLICK_VALUE", "SELECT_PIZZERIA_KEY", "SELECT_PIZZERIA_VALUE", "SELECT_PIZZERIA_VO_VALUE", "SHOW_DELIVERY_ADDRESS_VALUE", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(com.dodopizza.order.feature.selectionmap.presentation.f fVar) {
            z65.h(fVar, "arguments");
            return (e) y64.d(new e(), bi0.c(bi0.d("arg_selected_initial_data", fVar)));
        }
    }

    /* compiled from: SelectionMapFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/f;", "a", "()Lcom/dodopizza/order/feature/selectionmap/presentation/f;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function0<com.dodopizza.order.feature.selectionmap.presentation.f> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final com.dodopizza.order.feature.selectionmap.presentation.f invoke() {
            Bundle arguments = e.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("arg_selected_initial_data")) == null) ? null : null;
            if (obj != null && !(obj instanceof com.dodopizza.order.feature.selectionmap.presentation.f)) {
                throw new ClassCastException("Property arg_selected_initial_data has different class type");
            } else if (obj != null) {
                return (com.dodopizza.order.feature.selectionmap.presentation.f) obj;
            } else {
                throw new IllegalArgumentException("Argument with key = arg_selected_initial_data not found in bundle");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionMapFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lqy7;", "result", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapFragment$getLocation$1", f = "SelectionMapFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function2<qy7, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ boolean c;
        final /* synthetic */ e d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z, e eVar, cv1<? super c> cv1Var) {
            super(2, cv1Var);
            this.c = z;
            this.d = eVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(this.c, this.d, cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(qy7 qy7Var, cv1<? super Unit> cv1Var) {
            return ((c) create(qy7Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                defpackage.a75.d()
                int r0 = r4.a
                if (r0 != 0) goto L80
                defpackage.vk9.b(r5)
                java.lang.Object r5 = r4.b
                qy7 r5 = (defpackage.qy7) r5
                boolean r0 = r4.c
                if (r0 != 0) goto L1b
                com.dodopizza.order.feature.selectionmap.presentation.e r0 = r4.d
                com.dodopizza.order.feature.selectionmap.presentation.SelectionMapPresenter r0 = r0.Ch()
                r0.K0()
            L1b:
                java.util.List r0 = r5.b()
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L25:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L3b
                java.lang.Object r1 = r0.next()
                r2 = r1
                dy7 r2 = (defpackage.dy7) r2
                ry7 r2 = r2.d()
                ry7 r3 = defpackage.ry7.GRANTED
                if (r2 != r3) goto L25
                goto L3c
            L3b:
                r1 = 0
            L3c:
                if (r1 != 0) goto L7d
                java.util.List r5 = r5.b()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                boolean r0 = r5 instanceof java.util.Collection
                if (r0 == 0) goto L52
                r0 = r5
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L52
                goto L7d
            L52:
                java.util.Iterator r5 = r5.iterator()
            L56:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L7d
                java.lang.Object r0 = r5.next()
                dy7 r0 = (defpackage.dy7) r0
                ry7 r1 = r0.d()
                ry7 r2 = defpackage.ry7.DENIED
                if (r1 == r2) goto L72
                ry7 r0 = r0.d()
                ry7 r1 = defpackage.ry7.DENIED_FOREVER
                if (r0 != r1) goto L56
            L72:
                com.dodopizza.order.feature.selectionmap.presentation.e r5 = r4.d
                com.dodopizza.order.feature.selectionmap.presentation.SelectionMapPresenter r5 = r5.Ch()
                com.dodopizza.order.feature.selectionmap.presentation.d$l r0 = com.dodopizza.order.feature.selectionmap.presentation.d.l.a
                r5.w(r0)
            L7d:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            L80:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.order.feature.selectionmap.presentation.e.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionMapFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lqy7;", "result", "Loz3;", "Lcw5;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapFragment$getLocation$2", f = "SelectionMapFragment.kt", l = {}, m = "invokeSuspend")
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
                            return e.this.Jh();
                        }
                    }
                }
                return wz3.A(cw5.b.a);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Lcw5;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapFragment$lastOrSingleRequestLocation$1", f = "SelectionMapFragment.kt", l = {611}, m = "invokeSuspend")
    /* renamed from: com.dodopizza.order.feature.selectionmap.presentation.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0205e extends f3b implements Function2<pz3<? super cw5>, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ qv5 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0205e(qv5 qv5Var, cv1<? super C0205e> cv1Var) {
            super(2, cv1Var);
            this.c = qv5Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            C0205e c0205e = new C0205e(this.c, cv1Var);
            c0205e.b = obj;
            return c0205e;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super cw5> pz3Var, cv1<? super Unit> cv1Var) {
            return ((C0205e) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
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
                oz3 L = wz3.L(qv5.b.a(this.c, null, 1, null), 1);
                this.a = 1;
                if (wz3.q((pz3) this.b, L, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionMapFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lu68;", "status", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapFragment$onMapReady$1$1", f = "SelectionMapFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends f3b implements Function2<u68, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ Function1<LatLng, Unit> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Function1<? super LatLng, Unit> function1, cv1<? super f> cv1Var) {
            super(2, cv1Var);
            this.d = function1;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f fVar = new f(this.d, cv1Var);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(u68 u68Var, cv1<? super Unit> cv1Var) {
            return ((f) create(u68Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                u68 u68Var = (u68) this.b;
                if (u68Var instanceof u68.b) {
                    e.this.Ch().w(d.k.a);
                } else if (u68Var instanceof u68.a) {
                    this.d.invoke(((u68.a) u68Var).a());
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionMapFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lu68;", "status", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapFragment$onMapReady$1$2", f = "SelectionMapFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends f3b implements Function2<u68, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ Function1<LatLng, Unit> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Function1<? super LatLng, Unit> function1, cv1<? super g> cv1Var) {
            super(2, cv1Var);
            this.d = function1;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            g gVar = new g(this.d, cv1Var);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(u68 u68Var, cv1<? super Unit> cv1Var) {
            return ((g) create(u68Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                u68 u68Var = (u68) this.b;
                if (u68Var instanceof u68.b) {
                    e.this.Ch().w(d.k.a);
                } else if (u68Var instanceof u68.a) {
                    this.d.invoke(((u68.a) u68Var).a());
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SelectionMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/google/android/gms/maps/model/LatLng;", "latLng", "", "a", "(Lcom/google/android/gms/maps/model/LatLng;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class h extends ej5 implements Function1<LatLng, Unit> {
        h() {
            super(1);
        }

        public final void a(LatLng latLng) {
            z65.h(latLng, "latLng");
            e.this.Ch().w(new d.j(latLng));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LatLng latLng) {
            a(latLng);
            return Unit.a;
        }
    }

    /* compiled from: SelectionMapFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/SelectionMapPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/order/feature/selectionmap/presentation/SelectionMapPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class i extends ej5 implements Function0<SelectionMapPresenter> {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SelectionMapPresenter invoke() {
            return e.this.Dh().get();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectionMapFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapFragment$requestLocation$1", f = "SelectionMapFragment.kt", l = {520}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ boolean c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectionMapFragment.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcw5;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapFragment$requestLocation$1$1", f = "SelectionMapFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends f3b implements y84<pz3<? super cw5>, Throwable, cv1<? super Unit>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ e c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, cv1<? super a> cv1Var) {
                super(3, cv1Var);
                this.c = eVar;
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
                    this.c.p.warn("Failed to request location. ", (Throwable) this.b);
                    return Unit.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectionMapFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcw5;", "result", "", "b", "(Lcw5;Lcv1;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class b<T> implements pz3 {
            final /* synthetic */ e a;
            final /* synthetic */ boolean b;

            b(e eVar, boolean z) {
                this.a = eVar;
                this.b = z;
            }

            @Override // defpackage.pz3
            /* renamed from: b */
            public final Object emit(cw5 cw5Var, cv1<? super Unit> cv1Var) {
                if (cw5Var instanceof cw5.d) {
                    cw5.d dVar = (cw5.d) cw5Var;
                    this.a.Ch().w(new d.f(new ov5(dVar.a().getLatitude(), dVar.a().getLongitude(), null, null, 12, null), this.b));
                } else if (cw5Var instanceof cw5.a) {
                    this.a.Ch().w(d.c.a);
                } else if (!z65.c(cw5Var, cw5.b.a) && (cw5Var instanceof cw5.c)) {
                    gw5.a((cw5.c) cw5Var, this.a, 100);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(boolean z, cv1<? super j> cv1Var) {
            super(2, cv1Var);
            this.c = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new j(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((j) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                oz3 h = wz3.h(e.this.zh(), new a(e.this, null));
                b bVar = new b(e.this, this.c);
                this.a = 1;
                if (h.collect(bVar, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: SelectionMapFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapFragment$requestUserLocation$1", f = "SelectionMapFragment.kt", l = {306}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class k extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ boolean c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectionMapFragment.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lcw5;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "com.dodopizza.order.feature.selectionmap.presentation.SelectionMapFragment$requestUserLocation$1$1", f = "SelectionMapFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends f3b implements y84<pz3<? super cw5>, Throwable, cv1<? super Unit>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ e c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar, cv1<? super a> cv1Var) {
                super(3, cv1Var);
                this.c = eVar;
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
                    this.c.p.warn("Failed to request location. ", (Throwable) this.b);
                    return Unit.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectionMapFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcw5;", "result", "", "b", "(Lcw5;Lcv1;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes2.dex */
        public static final class b<T> implements pz3 {
            final /* synthetic */ e a;
            final /* synthetic */ boolean b;

            b(e eVar, boolean z) {
                this.a = eVar;
                this.b = z;
            }

            @Override // defpackage.pz3
            /* renamed from: b */
            public final Object emit(cw5 cw5Var, cv1<? super Unit> cv1Var) {
                if (cw5Var instanceof cw5.c) {
                    gw5.a((cw5.c) cw5Var, this.a, 100);
                } else {
                    this.a.Ch().w(new d.h(zv5.a(cw5Var), this.b));
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z, cv1<? super k> cv1Var) {
            super(2, cv1Var);
            this.c = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new k(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((k) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                oz3 h = wz3.h(e.this.zh(), new a(e.this, null));
                b bVar = new b(e.this, this.c);
                this.a = 1;
                if (h.collect(bVar, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: SelectionMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld88;", "it", "", "a", "(Ld88;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class l extends ej5 implements Function1<d88, Boolean> {
        final /* synthetic */ com.dodopizza.order.feature.selectionmap.presentation.c a;
        final /* synthetic */ e b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(com.dodopizza.order.feature.selectionmap.presentation.c cVar, e eVar) {
            super(1);
            this.a = cVar;
            this.b = eVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(d88 d88Var) {
            Object obj;
            z65.h(d88Var, "it");
            Iterator<T> it = ((c.C0203c) this.a).a().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (z65.c(((b68) obj).d(), d88Var.getId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            b68 b68Var = (b68) obj;
            if (b68Var != null) {
                this.b.Ch().w(new d.n(b68Var));
            }
            return Boolean.TRUE;
        }
    }

    /* compiled from: SelectionMapFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm86;", "marker", "", "a", "(Lm86;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class m extends ej5 implements Function1<m86, Boolean> {
        final /* synthetic */ com.dodopizza.order.feature.selectionmap.presentation.c a;
        final /* synthetic */ e b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(com.dodopizza.order.feature.selectionmap.presentation.c cVar, e eVar) {
            super(1);
            this.a = cVar;
            this.b = eVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(m86 m86Var) {
            Object obj;
            z65.h(m86Var, "marker");
            Iterator<T> it = ((c.C0203c) this.a).a().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (z65.c(((b68) obj).d(), m86Var.c())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            b68 b68Var = (b68) obj;
            if (b68Var != null) {
                this.b.Ch().w(new d.n(b68Var));
            }
            return Boolean.TRUE;
        }
    }

    public e() {
        super(gz8.fragment_selection_map);
        rn5 b2;
        this.c = kb0.e(this, gy8.w1);
        this.d = kb0.e(this, gy8.m2);
        this.e = new n66();
        this.f = new ea8();
        this.l = new ArrayList();
        this.p = LoggerFactory.getLogger("SelectionMapFragment");
        i iVar = new i();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.t = new MoxyKtxDelegate(mvpDelegate, SelectionMapPresenter.class.getName() + ".presenter", iVar);
        b2 = yn5.b(new b());
        this.u = b2;
    }

    private final FloatingActionButton Ah() {
        return (FloatingActionButton) this.c.a(this, w[0]);
    }

    private final View Bh() {
        return (View) this.d.a(this, w[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c5c Eh(int i2, View view, c5c c5cVar) {
        z65.h(view, "view");
        z65.h(c5cVar, "insets");
        n45 f2 = c5cVar.f(c5c.m.d());
        z65.g(f2, "getInsets(...)");
        p45.l(view, 0, 0, 0, i2 + f2.d, 7, null);
        p45.j(view, 0, 0, 0, 0, 13, null);
        return c5cVar;
    }

    private final void Fh() {
        Hh();
        this.o = wh().a(bq3.F6);
        Fragment k0 = getChildFragmentManager().k0(gy8.selection_map);
        z65.f(k0, "null cannot be cast to non-null type com.google.android.gms.maps.SupportMapFragment");
        ((SupportMapFragment) k0).gh(this);
        Ah().setOnClickListener(new View.OnClickListener() { // from class: eaa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e.Gh(e.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Gh(e eVar, View view) {
        z65.h(eVar, "this$0");
        eVar.Ch().w(d.e.a);
    }

    private final void Hh() {
        this.g = (Drawable) mh5.b(iu1.e(requireContext(), bx8.K), "Can't find R.drawable.ic_pizzeria_open");
        this.h = (Drawable) mh5.b(iu1.e(requireContext(), bx8.I), "Can't find R.drawable.ic_pizzeria_active");
        this.i = (Drawable) mh5.b(iu1.e(requireContext(), bx8.J), "Can't find R.drawable.ic_pizzeria_close");
        this.j = (Drawable) mh5.b(iu1.e(requireContext(), bx8.i0), "Can't find R.drawable.user");
    }

    private final oz3<cw5> Ih(qv5 qv5Var) {
        return wz3.G(qv5Var.a(), new C0205e(qv5Var, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<cw5> Jh() {
        return Ih(qv5.a.a(xh()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kh(e eVar, rg4 rg4Var, Function1 function1) {
        z65.h(eVar, "this$0");
        z65.h(rg4Var, "$googleMap");
        z65.h(function1, "$onCoordinateChanged");
        if (!eVar.isAdded()) {
            return;
        }
        if (eVar.o) {
            ea8 ea8Var = eVar.f;
            Context requireContext = eVar.requireContext();
            z65.g(requireContext, "requireContext(...)");
            ea8Var.p(rg4Var, requireContext);
            wz3.C(wz3.F(eVar.f.n(), new f(function1, null)), pp5.a(eVar));
        } else {
            n66 n66Var = eVar.e;
            Context requireContext2 = eVar.requireContext();
            z65.g(requireContext2, "requireContext(...)");
            n66Var.p(rg4Var, requireContext2);
            wz3.C(wz3.F(eVar.e.n(), new g(function1, null)), pp5.a(eVar));
        }
        eVar.Ch().w(d.i.a);
    }

    private final void Lh(ev2 ev2Var, e91 e91Var) {
        i64.a(this, "delivery_key", bi0.c(bi0.d("show_delivery_address_value", new xu2(vh().n(), false, vh().d(), vh().b(), e91Var, vh().l(), vh().m(), vh().e(), ev2Var))));
    }

    private final void Mh(int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = Ah().getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.bottomMargin = i2 + jx9.a.a(21);
            Ah().setLayoutParams(marginLayoutParams);
        }
    }

    private final com.dodopizza.order.feature.selectionmap.presentation.f vh() {
        return (com.dodopizza.order.feature.selectionmap.presentation.f) this.u.getValue();
    }

    private final Drawable yh(b68 b68Var) {
        Drawable drawable;
        if (ov9.f(b68Var.g().H(), b68Var.g().L()) && b68Var.f() != jb7.e) {
            drawable = this.g;
            if (drawable == null) {
                z65.z("openDrawable");
                return null;
            }
        } else {
            drawable = this.i;
            if (drawable == null) {
                z65.z("closedDrawable");
                return null;
            }
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<cw5> zh() {
        boolean a2 = y64.a(this, "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
        if (!a2) {
            Ch().J0(c7a.a.b);
        }
        return wz3.x(wz3.F(ky7.a.a(this).a("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"), new c(a2, this, null)), new d(null));
    }

    public final SelectionMapPresenter Ch() {
        return (SelectionMapPresenter) this.t.getValue(this, w[2]);
    }

    public final as8<SelectionMapPresenter> Dh() {
        as8<SelectionMapPresenter> as8Var = this.s;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void E0(boolean z) {
        sh0.d(pp5.a(this), null, null, new k(z, null), 3, null);
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void K7(aaa aaaVar, e91 e91Var) {
        z65.h(aaaVar, "vo");
        z65.h(e91Var, "clientDeliveryLocation");
        Bh().setVisibility(0);
        Lh(ev2.c(aaaVar.p(), null, null, true, true, null, r09.specify_delivery_address, false, false, null, 467, null), e91Var);
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void L5(com.dodopizza.order.feature.selectionmap.presentation.c cVar) {
        int w2;
        z65.h(cVar, "vo");
        c.a aVar = c.a.a;
        if (z65.c(cVar, aVar)) {
            i64.a(this, "select_pizzeria_key", bi0.c(bi0.d("select_pizzeria_vo_value", aVar)));
            return;
        }
        c.b bVar = c.b.a;
        if (z65.c(cVar, bVar)) {
            i64.a(this, "select_pizzeria_key", bi0.c(bi0.d("select_pizzeria_vo_value", bVar)));
        } else if (cVar instanceof c.C0203c) {
            Drawable drawable = null;
            if (this.o) {
                ea8 ea8Var = this.f;
                Context requireContext = requireContext();
                z65.g(requireContext, "requireContext(...)");
                ea8Var.M(requireContext);
                this.f.i();
                this.l.clear();
                ea8 ea8Var2 = this.f;
                List<b68> a2 = ((c.C0203c) cVar).a();
                w2 = lc1.w(a2, 10);
                ArrayList arrayList = new ArrayList(w2);
                for (b68 b68Var : a2) {
                    arrayList.add(b68Var.g());
                }
                ea8Var2.J(arrayList);
                this.f.R(new l(cVar, this));
                m86 m86Var = this.m;
                if (m86Var != null) {
                    ea8 ea8Var3 = this.f;
                    Drawable drawable2 = this.j;
                    if (drawable2 == null) {
                        z65.z("userDrawable");
                    } else {
                        drawable = drawable2;
                    }
                    ea8Var3.e(m86Var, drawable);
                }
            } else {
                this.e.i();
                this.l.clear();
                this.e.v(new m(cVar, this));
                for (b68 b68Var2 : ((c.C0203c) cVar).a()) {
                    this.l.add(this.e.d(uv5.a(b68Var2.g().x()), yh(b68Var2), b68Var2.g().getId()));
                }
                m86 m86Var2 = this.m;
                if (m86Var2 != null) {
                    n66 n66Var = this.e;
                    Drawable drawable3 = this.j;
                    if (drawable3 == null) {
                        z65.z("userDrawable");
                    } else {
                        drawable = drawable3;
                    }
                    n66Var.e(m86Var2, drawable);
                }
            }
            i64.a(this, "select_pizzeria_key", bi0.c(bi0.d("select_pizzeria_vo_value", cVar)));
        }
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void Ne(aaa aaaVar, e91 e91Var) {
        z65.h(aaaVar, "vo");
        z65.h(e91Var, "clientDeliveryLocation");
        Bh().setVisibility(0);
        if (aaaVar.d() == m8.a) {
            Lh(aaaVar.p(), e91Var);
        }
    }

    public final void Nh(int i2) {
        if (this.o) {
            this.f.x(0, i2);
        } else {
            this.e.x(0, i2);
        }
        Mh(i2);
    }

    @Override // defpackage.tj1.a
    public void O8(String str) {
        z65.h(str, "id");
        Context context = getContext();
        if (context != null) {
            av1.c(context);
        }
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void W7(d88 d88Var, jb7 jb7Var, hn3 hn3Var, boolean z, boolean z2, boolean z3) {
        z65.h(d88Var, "pizzeria");
        z65.h(jb7Var, "operationalTypeVo");
        z65.h(hn3Var, "pizzeriaType");
        i64.a(this, "select_pizzeria_key", bi0.c(lnb.a("pizzeria_info_value", new t88(d88Var, jb7Var, hn3Var, z, z2, z3))));
    }

    public final void Y7(d88 d88Var, int i2) {
        z65.h(d88Var, "pizzeria");
        Ch().w(new d.m(d88Var, i2));
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void Yd(LatLng latLng, boolean z) {
        z65.h(latLng, "latLng");
        if (this.o) {
            this.f.B(latLng, z);
        } else {
            this.e.B(latLng, z);
        }
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void c() {
        tj1.b bVar = tj1.e;
        String string = requireContext().getString(o09.d0);
        z65.g(string, "getString(...)");
        bVar.a(string, requireContext().getString(o09.i), requireContext().getString(o09.V), "request_permission").show(getChildFragmentManager(), "request_permission");
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void c0(b68 b68Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        z65.h(b68Var, "pizzeriaVO");
        if (this.o) {
            this.f.O(b68Var.g());
            return;
        }
        b68 b68Var2 = this.n;
        Drawable drawable = null;
        if (b68Var2 != null) {
            Iterator<T> it = this.l.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj3 = it.next();
                    m86 m86Var = (m86) obj3;
                    if (m86Var != null) {
                        obj4 = m86Var.c();
                    } else {
                        obj4 = null;
                    }
                    if (z65.c(obj4, b68Var2.g().getId())) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            m86 m86Var2 = (m86) obj3;
            if (m86Var2 != null) {
                m86Var2.g(this.e.m(yh(b68Var2)));
            }
        }
        Iterator<T> it2 = this.l.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                m86 m86Var3 = (m86) obj;
                if (m86Var3 != null) {
                    obj2 = m86Var3.c();
                } else {
                    obj2 = null;
                }
                if (z65.c(obj2, b68Var.g().getId())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        m86 m86Var4 = (m86) obj;
        if (m86Var4 != null) {
            m86Var4.f();
            this.l.remove(m86Var4);
        }
        List<m86> list = this.l;
        n66 n66Var = this.e;
        LatLng a2 = uv5.a(b68Var.g().x());
        Drawable drawable2 = this.h;
        if (drawable2 == null) {
            z65.z("focusedDrawable");
        } else {
            drawable = drawable2;
        }
        list.add(n66Var.d(a2, drawable, b68Var.g().getId()));
        this.n = b68Var;
    }

    public final void c5(s88 s88Var) {
        Ch().w(new d.a(s88Var));
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void d6() {
        Bh().setVisibility(8);
    }

    @Override // defpackage.f70
    protected void ih(View view) {
        z65.h(view, "rootView");
        final int paddingBottom = view.getPaddingBottom();
        syb.I0(view, new h77() { // from class: caa
            @Override // defpackage.h77
            public final c5c a(View view2, c5c c5cVar) {
                c5c Eh;
                Eh = e.Eh(paddingBottom, view2, c5cVar);
                return Eh;
            }
        });
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void j() {
        Toast.makeText(getContext(), r09.location_not_available, 1).show();
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void m(LatLngBounds latLngBounds) {
        z65.h(latLngBounds, "bounds");
        if (this.o) {
            this.f.z(latLngBounds);
        } else {
            this.e.z(latLngBounds);
        }
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void o(boolean z) {
        this.k = z;
        sh0.d(pp5.a(this), null, null, new j(z, null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 100 && i3 == -1) {
            o(this.k);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        w9a.b a2 = w9a.a.a();
        SelectionMapFeatureDependencies selectionMapFeatureDependencies = (SelectionMapFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(SelectionMapFeatureDependencies.class));
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("arg_selected_initial_data")) == null) ? null : null;
        if (obj != null && !(obj instanceof com.dodopizza.order.feature.selectionmap.presentation.f)) {
            throw new ClassCastException("Property arg_selected_initial_data has different class type");
        } else if (obj != null) {
            a2.a(selectionMapFeatureDependencies, (com.dodopizza.order.feature.selectionmap.presentation.f) obj).a(this);
            super.onAttach(context);
        } else {
            throw new IllegalArgumentException("Argument with key = arg_selected_initial_data not found in bundle");
        }
    }

    @Override // defpackage.tj1.a
    public void onCancel(String str) {
        z65.h(str, "id");
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Fh();
    }

    @Override // defpackage.n87
    public void p6(final rg4 rg4Var) {
        int i2;
        z65.h(rg4Var, "googleMap");
        if (vh().k() == naa.a) {
            i2 = k09.combined_map_style;
        } else {
            i2 = k09.pizzeria_map_style;
        }
        rg4Var.l(MapStyleOptions.h(requireContext(), i2));
        final Function1 b2 = kn2.b(pp5.a(this), 0L, new h(), 1, null);
        rg4Var.p(new rg4.f() { // from class: daa
            @Override // defpackage.rg4.f
            public final void a() {
                e.Kh(e.this, rg4Var, b2);
            }
        });
    }

    public final void sh(naa naaVar) {
        int i2;
        z65.h(naaVar, MessageAttributes.TYPE);
        if (naaVar == naa.a) {
            i2 = k09.combined_map_style;
        } else {
            i2 = k09.pizzeria_map_style;
        }
        if (isAdded() && this.o) {
            ea8 ea8Var = this.f;
            MapStyleOptions h2 = MapStyleOptions.h(requireContext(), i2);
            z65.g(h2, "loadRawResourceStyle(...)");
            ea8Var.K(h2);
        }
        Ch().h0(naaVar);
    }

    public final void th() {
        Ch().w(d.b.a);
    }

    public final void uh(e91 e91Var, String str) {
        z65.h(e91Var, "clientDeliveryLocation");
        z65.h(str, "localityId");
        Ch().g0(e91Var, str);
    }

    public final hq3 wh() {
        hq3 hq3Var = this.r;
        if (hq3Var != null) {
            return hq3Var;
        }
        z65.z("featureService");
        return null;
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void x0(LatLng latLng) {
        Drawable drawable;
        m86 f2;
        Drawable drawable2;
        z65.h(latLng, "latLng");
        if (this.o) {
            ea8 ea8Var = this.f;
            Drawable drawable3 = this.j;
            if (drawable3 == null) {
                z65.z("userDrawable");
                drawable2 = null;
            } else {
                drawable2 = drawable3;
            }
            f2 = n66.f(ea8Var, latLng, drawable2, null, 4, null);
        } else {
            n66 n66Var = this.e;
            Drawable drawable4 = this.j;
            if (drawable4 == null) {
                z65.z("userDrawable");
                drawable = null;
            } else {
                drawable = drawable4;
            }
            f2 = n66.f(n66Var, latLng, drawable, null, 4, null);
        }
        this.m = f2;
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void x3(d88 d88Var) {
        z65.h(d88Var, "selectedPizzeria");
        i64.a(this, "select_pizzeria_key", bi0.c(bi0.d("select_pizzeria_value", d88Var)));
    }

    public final je4 xh() {
        je4 je4Var = this.q;
        if (je4Var != null) {
            return je4Var;
        }
        z65.z("geoLocationProviderFactory");
        return null;
    }

    @Override // com.dodopizza.order.feature.selectionmap.presentation.k
    public void y7() {
        if (this.o) {
            this.f.i();
        } else {
            this.e.i();
        }
        this.l.clear();
    }
}
