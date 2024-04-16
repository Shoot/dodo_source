package ru.dodopizza.app.presentation.selectpizzeria;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.location.Location;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.osmdroid.util.BoundingBox;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.a;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.selectpizzeria.PizzeriasMap;
/* compiled from: PizzeriasMap.kt */
@Metadata(d1 = {"\u0000Ý\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001m\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010r\u001a\u00020q\u0012\b\u0010t\u001a\u0004\u0018\u00010s¢\u0006\u0004\bu\u0010vJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0010\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018J\u0016\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bJ\u0016\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bJ\u000e\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\rJ\b\u0010\"\u001a\u00020\u0004H\u0002J\b\u0010#\u001a\u00020\u0004H\u0002J\b\u0010$\u001a\u00020\u0004H\u0002J\u0012\u0010'\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%H\u0002J\b\u0010(\u001a\u00020\u0004H\u0002J\b\u0010)\u001a\u00020\u0004H\u0002J\u0018\u0010*\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002R6\u00103\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010+j\u0004\u0018\u0001`,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00108\u001a\n 5*\u0004\u0018\u000104048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00070=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010@R\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u0014\u0010L\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010KR\u0016\u0010O\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010NR\u0016\u0010P\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010NR\u0016\u0010Q\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010NR\u0018\u0010T\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010SR\u0018\u0010W\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010VR\u0018\u0010[\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u001e\u0010^\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010]R\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010d\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010ZR\u0018\u0010e\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010ZR\u0018\u0010h\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010gR\u0018\u0010j\u001a\u0004\u0018\u00010f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010gR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010p\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010o¨\u0006w"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/PizzeriasMap;", "Landroid/widget/FrameLayout;", "", "pizzeriaId", "", "setSelectedPizzeria", "", "Lb68;", "pickUpPizzeriasVOs", "setPizzerias", "Lorg/osmdroid/util/BoundingBox;", "boundingBox", "setBoundingBox", "", "value", "setZoomButtonsAlpha", "Lhdc;", "zoomListener", "setZoomListener", "setMyLocationButtonAlpha", "clearFocus", "Landroid/view/View$OnClickListener;", "listener", "setOnMyLocationClickListener", "", "isEnabled", "setMyLocationButtonEnabled", "", "latitude", "longitude", "r", Image.TYPE_MEDIUM, "bias", "setControlViewVerticalBias", "l", "i", "o", "Lorg/osmdroid/tileprovider/tilesource/a;", "tileSource", Image.TYPE_SMALL, "k", "j", Image.TYPE_HIGH, "Lkotlin/Function1;", "Lru/dodopizza/app/presentation/selectpizzeria/OnPizzeriaTapListener;", "a", "Lkotlin/jvm/functions/Function1;", "getOnPizzeriaTapListener", "()Lkotlin/jvm/functions/Function1;", "setOnPizzeriaTapListener", "(Lkotlin/jvm/functions/Function1;)V", "onPizzeriaTapListener", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "b", "Lorg/slf4j/Logger;", "logger", "Lru/dodopizza/app/presentation/selectpizzeria/a;", com.huawei.hms.opendevice.c.a, "Lru/dodopizza/app/presentation/selectpizzeria/a;", "permissionChecker", "", "Lqm7;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "pizzeriaOverlayItems", com.huawei.hms.push.e.a, "pizzerias", "Landroid/graphics/drawable/StateListDrawable;", "f", "Landroid/graphics/drawable/StateListDrawable;", "openListDrawable", "g", "closedListDrawable", "Lxa8;", "Lxa8;", "myLocationProvider", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/drawable/Drawable;", "openDrawable", "focusedDrawable", "closedDrawable", "Lorg/osmdroid/views/MapView;", "Lorg/osmdroid/views/MapView;", "mapView", "Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap;", "personIcon", "Landroid/widget/ImageButton;", "n", "Landroid/widget/ImageButton;", "myLocationButton", "Lz75;", "Lz75;", "itemItemizedIconOverlay", "Lor6;", "p", "Lor6;", "myLocationNewOverlay", "q", "zoomIn", "zoomOut", "Landroid/view/View;", "Landroid/view/View;", "zoomDivider", "t", "mapActionsContainer", "u", "Lhdc;", "ru/dodopizza/app/presentation/selectpizzeria/b", "v", "Lru/dodopizza/app/presentation/selectpizzeria/b;", "gestureListener", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PizzeriasMap extends FrameLayout {
    private Function1<? super b68, Unit> a;
    private final Logger b;
    private final ru.dodopizza.app.presentation.selectpizzeria.a c;
    private final List<qm7> d;
    private final List<b68> e;
    private final StateListDrawable f;
    private final StateListDrawable g;
    private final xa8 h;
    private Drawable i;
    private Drawable j;
    private Drawable k;
    private MapView l;
    private Bitmap m;
    private ImageButton n;
    private z75<qm7> o;
    private or6 p;
    private ImageButton q;
    private ImageButton r;
    private View s;
    private View t;
    private hdc u;
    private final ru.dodopizza.app.presentation.selectpizzeria.b v;

    /* compiled from: PizzeriasMap.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"ru/dodopizza/app/presentation/selectpizzeria/PizzeriasMap$a", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ MapView a;
        final /* synthetic */ double b;
        final /* synthetic */ double c;

        a(MapView mapView, double d, double d2) {
            this.a = mapView;
            this.b = d;
            this.c = d2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(MapView mapView, double d, double d2) {
            z65.h(mapView, "$this_apply");
            mapView.getController().e(new GeoPoint(d, d2), Double.valueOf(mapView.getZoomLevelDouble()), 0L);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            final MapView mapView = this.a;
            final double d = this.b;
            final double d2 = this.c;
            mapView.post(new Runnable() { // from class: va8
                @Override // java.lang.Runnable
                public final void run() {
                    PizzeriasMap.a.b(MapView.this, d, d2);
                }
            });
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* compiled from: PizzeriasMap.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"ru/dodopizza/app/presentation/selectpizzeria/PizzeriasMap$b", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "onGlobalLayout", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ MapView a;
        final /* synthetic */ BoundingBox b;

        b(MapView mapView, BoundingBox boundingBox) {
            this.a = mapView;
            this.b = boundingBox;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(MapView mapView, BoundingBox boundingBox) {
            z65.h(mapView, "$this_apply");
            z65.h(boundingBox, "$boundingBox");
            mapView.R(boundingBox, true);
            mapView.invalidate();
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            final MapView mapView = this.a;
            final BoundingBox boundingBox = this.b;
            mapView.post(new Runnable() { // from class: wa8
                @Override // java.lang.Runnable
                public final void run() {
                    PizzeriasMap.b.b(MapView.this, boundingBox);
                }
            });
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PizzeriasMap(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.b = LoggerFactory.getLogger(PizzeriasMap.class);
        this.c = new ru.dodopizza.app.presentation.selectpizzeria.a();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new StateListDrawable();
        this.g = new StateListDrawable();
        this.h = new xa8();
        this.v = new ru.dodopizza.app.presentation.selectpizzeria.b(this);
        l();
    }

    private final void h(double d, double d2) {
        MapView mapView = this.l;
        if (mapView != null) {
            mapView.getViewTreeObserver().addOnGlobalLayoutListener(new a(mapView, d, d2));
        }
    }

    private final void i() {
        this.i = (Drawable) mh5.b(iu1.e(getContext(), R.drawable.ic_pizzeria_open), "Can't find R.drawable.ic_pizzeria_open");
        this.j = (Drawable) mh5.b(iu1.e(getContext(), R.drawable.ic_pizzeria_active), "Can't find R.drawable.ic_pizzeria_active");
        this.k = (Drawable) mh5.b(iu1.e(getContext(), R.drawable.ic_pizzeria_close), "Can't find R.drawable.ic_pizzeria_close");
    }

    private final void j() {
        Float f;
        Bitmap bitmap;
        List<pm7> overlays;
        this.p = new or6(this.h, this.l);
        Bitmap decodeResource = BitmapFactory.decodeResource(getContext().getResources(), bx8.i0);
        this.m = decodeResource;
        Float f2 = null;
        if (decodeResource != null) {
            f = Float.valueOf(decodeResource.getWidth() / 2.0f);
        } else {
            f = null;
        }
        if (this.m != null) {
            f2 = Float.valueOf(bitmap.getHeight() / 2.0f);
        }
        or6 or6Var = this.p;
        if (or6Var != null) {
            or6Var.I(this.m);
            if (f != null && f2 != null) {
                or6Var.H(f.floatValue(), f2.floatValue());
            }
            or6Var.u();
            or6Var.D(true);
        }
        MapView mapView = this.l;
        if (mapView != null && (overlays = mapView.getOverlays()) != null) {
            overlays.add(this.p);
        }
    }

    private final void k() {
        StateListDrawable stateListDrawable = this.f;
        int[] iArr = {16842908};
        Drawable drawable = this.j;
        List<pm7> list = null;
        if (drawable == null) {
            z65.z("focusedDrawable");
            drawable = null;
        }
        stateListDrawable.addState(iArr, drawable);
        StateListDrawable stateListDrawable2 = this.f;
        int[] iArr2 = new int[0];
        Drawable drawable2 = this.i;
        if (drawable2 == null) {
            z65.z("openDrawable");
            drawable2 = null;
        }
        stateListDrawable2.addState(iArr2, drawable2);
        StateListDrawable stateListDrawable3 = this.g;
        int[] iArr3 = {16842908};
        Drawable drawable3 = this.j;
        if (drawable3 == null) {
            z65.z("focusedDrawable");
            drawable3 = null;
        }
        stateListDrawable3.addState(iArr3, drawable3);
        StateListDrawable stateListDrawable4 = this.g;
        int[] iArr4 = new int[0];
        Drawable drawable4 = this.k;
        if (drawable4 == null) {
            z65.z("closedDrawable");
            drawable4 = null;
        }
        stateListDrawable4.addState(iArr4, drawable4);
        z75<qm7> z75Var = new z75<>(this.d, this.f, this.v, getContext().getApplicationContext());
        this.o = z75Var;
        z75Var.D(true);
        MapView mapView = this.l;
        if (mapView != null) {
            list = mapView.getOverlays();
        }
        if (list != null) {
            list.add(this.o);
        }
    }

    private final void l() {
        if (isInEditMode()) {
            View.inflate(getContext(), R.layout.osm_map_layout, this);
            return;
        }
        dq1.a().y("ru.dodopizza.app");
        i();
        ru.dodopizza.app.presentation.selectpizzeria.a aVar = this.c;
        Context context = getContext();
        z65.g(context, "getContext(...)");
        if (aVar.a(context)) {
            o();
        } else {
            View.inflate(getContext(), R.layout.osm_map_layout_not_available, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(PizzeriasMap pizzeriasMap, double d, double d2, View view, int i, int i2, int i3, int i4) {
        z65.h(pizzeriasMap, "this$0");
        pizzeriasMap.h(d, d2);
    }

    private final void o() {
        org.osmdroid.tileprovider.tilesource.a aVar;
        MapView mapView;
        p76 tileProvider;
        View.inflate(getContext(), R.layout.osm_map_layout, this);
        this.l = (MapView) findViewById(R.id.osm_map_view);
        this.n = (ImageButton) findViewById(R.id.my_location_button);
        MapView mapView2 = this.l;
        final bs4 bs4Var = null;
        if (mapView2 != null) {
            mapView2.setTilesScaledToDpi(true);
            mapView2.setMinZoomLevel(Double.valueOf(5.0d));
            mapView2.setMaxZoomLevel(Double.valueOf(19.0d));
            mapView2.setLayerType(2, null);
            mapView2.getZoomController().q(a.f.NEVER);
            mapView2.setMultiTouchControls(true);
        }
        MapView mapView3 = this.l;
        if (mapView3 != null && (tileProvider = mapView3.getTileProvider()) != null) {
            aVar = tileProvider.p();
        } else {
            aVar = null;
        }
        s(aVar);
        MapView mapView4 = this.l;
        if (mapView4 != null) {
            bs4Var = mapView4.getController();
        }
        if (bs4Var != null) {
            bs4Var.g(10.0d);
            bs4Var.f(true);
        }
        this.q = (ImageButton) findViewById(R.id.zoom_in_button);
        this.r = (ImageButton) findViewById(R.id.zoom_out_button);
        this.s = findViewById(R.id.zoom_divider);
        this.t = findViewById(R.id.map_actions_container);
        ImageButton imageButton = this.q;
        if (imageButton != null) {
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: ra8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PizzeriasMap.p(bs4.this, this, view);
                }
            });
        }
        ImageButton imageButton2 = this.r;
        if (imageButton2 != null) {
            imageButton2.setOnClickListener(new View.OnClickListener() { // from class: sa8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PizzeriasMap.q(bs4.this, this, view);
                }
            });
        }
        k();
        j();
        if ((!this.e.isEmpty()) && (mapView = this.l) != null) {
            mapView.post(new Runnable() { // from class: ta8
                @Override // java.lang.Runnable
                public final void run() {
                    PizzeriasMap.setUpMap$lambda$7$lambda$6(PizzeriasMap.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(bs4 bs4Var, PizzeriasMap pizzeriasMap, View view) {
        z65.h(pizzeriasMap, "this$0");
        if (bs4Var != null) {
            bs4Var.r();
        }
        hdc hdcVar = pizzeriasMap.u;
        if (hdcVar != null) {
            hdcVar.c2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(bs4 bs4Var, PizzeriasMap pizzeriasMap, View view) {
        z65.h(pizzeriasMap, "this$0");
        if (bs4Var != null) {
            bs4Var.B();
        }
        hdc hdcVar = pizzeriasMap.u;
        if (hdcVar != null) {
            hdcVar.xd();
        }
    }

    private final void s(org.osmdroid.tileprovider.tilesource.a aVar) {
        if (aVar != null) {
            float c = aVar.c();
            int i = (int) (c * (((getResources().getDisplayMetrics().density * 256) * 0.75f) / c));
            if (dq1.a().A()) {
                this.b.debug("Scaling tiles to " + i);
            }
            cgb.M(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setUpMap$lambda$7$lambda$6(PizzeriasMap pizzeriasMap) {
        z65.h(pizzeriasMap, "this$0");
        pizzeriasMap.setPizzerias(pizzeriasMap.e);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        z75<qm7> z75Var = this.o;
        if (z75Var != null) {
            z75Var.E(null);
            MapView mapView = this.l;
            if (mapView != null) {
                mapView.postInvalidate();
            }
        }
    }

    public final Function1<b68, Unit> getOnPizzeriaTapListener() {
        return this.a;
    }

    public final void m(final double d, final double d2) {
        if (isAttachedToWindow()) {
            MapView mapView = this.l;
            if (mapView != null && mapView.w()) {
                h(d, d2);
                return;
            }
            MapView mapView2 = this.l;
            if (mapView2 != null) {
                mapView2.m(new MapView.f() { // from class: ua8
                    @Override // org.osmdroid.views.MapView.f
                    public final void a(View view, int i, int i2, int i3, int i4) {
                        PizzeriasMap.n(PizzeriasMap.this, d, d2, view, i, i2, i3, i4);
                    }
                });
            }
        }
    }

    public final void r(double d, double d2) {
        if (isAttachedToWindow()) {
            Location location = new Location("");
            location.setLatitude(d);
            location.setLongitude(d2);
            this.h.d(location);
            or6 or6Var = this.p;
            if (or6Var != null) {
                or6Var.w();
            }
        }
    }

    public final void setBoundingBox(BoundingBox boundingBox) {
        z65.h(boundingBox, "boundingBox");
        MapView mapView = this.l;
        if (mapView != null) {
            mapView.getViewTreeObserver().addOnGlobalLayoutListener(new b(mapView, boundingBox));
        }
    }

    public final void setControlViewVerticalBias(float f) {
        ViewGroup.LayoutParams layoutParams;
        View view = this.t;
        ConstraintLayout.b bVar = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof ConstraintLayout.b) {
            bVar = (ConstraintLayout.b) layoutParams;
        }
        if (bVar != null) {
            bVar.G = f;
        }
        View view2 = this.t;
        if (view2 != null) {
            view2.setLayoutParams(bVar);
        }
    }

    public final void setMyLocationButtonAlpha(float f) {
        ImageButton imageButton = this.n;
        if (imageButton != null) {
            imageButton.setAlpha(f);
        }
    }

    public final void setMyLocationButtonEnabled(boolean z) {
        ImageButton imageButton = this.n;
        if (imageButton != null) {
            imageButton.setEnabled(z);
        }
    }

    public final void setOnMyLocationClickListener(View.OnClickListener onClickListener) {
        ImageButton imageButton = this.n;
        if (imageButton != null) {
            imageButton.setOnClickListener(onClickListener);
        }
    }

    public final void setOnPizzeriaTapListener(Function1<? super b68, Unit> function1) {
        this.a = function1;
    }

    public final void setPizzerias(List<b68> list) {
        z65.h(list, "pickUpPizzeriasVOs");
        this.e.clear();
        this.e.addAll(list);
        z75<qm7> z75Var = this.o;
        if (z75Var != null) {
            this.d.clear();
            z75Var.K();
            for (b68 b68Var : this.e) {
                ov5 x = b68Var.g().x();
                qm7 qm7Var = new qm7(b68Var.g().getName(), "", new GeoPoint(x.b(), x.c()));
                if (!ov9.f(b68Var.g().H(), b68Var.g().L()) || b68Var.f() == jb7.e) {
                    qm7Var.d(this.g);
                }
                this.d.add(qm7Var);
            }
            z75Var.H(this.d);
        }
    }

    public final void setSelectedPizzeria(String str) {
        z65.h(str, "pizzeriaId");
        Iterator<b68> it = this.e.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (z65.c(it.next().d(), str)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return;
        }
        qm7 qm7Var = this.d.get(i);
        z75<qm7> z75Var = this.o;
        if (z75Var != null) {
            z75Var.E(qm7Var);
        }
        MapView mapView = this.l;
        if (mapView != null) {
            mapView.postInvalidate();
        }
    }

    public final void setZoomButtonsAlpha(float f) {
        ImageButton imageButton = this.q;
        if (imageButton != null) {
            imageButton.setAlpha(f);
        }
        ImageButton imageButton2 = this.r;
        if (imageButton2 != null) {
            imageButton2.setAlpha(f);
        }
        View view = this.s;
        if (view != null) {
            view.setAlpha(f);
        }
    }

    public final void setZoomListener(hdc hdcVar) {
        z65.h(hdcVar, "zoomListener");
        this.u = hdcVar;
    }
}
