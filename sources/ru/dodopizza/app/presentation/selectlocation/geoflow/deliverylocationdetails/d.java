package ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.iu6;
import defpackage.k6;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.AppComponent;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent;
import ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.DeliveryLocationDetailsPresenter;
import ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.d;
/* compiled from: DeliveryLocationDetailsFragment.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 Z2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001 B\u0007¢\u0006\u0004\bX\u0010YJ\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u001a\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0006H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\u0016\u0010\u0016\u001a\u00020\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\b\u0010\u001c\u001a\u00020\u0006H\u0016J\b\u0010\u001d\u001a\u00020\u0006H\u0016J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0014H\u0016J\b\u0010 \u001a\u00020\u0006H\u0016J\u0010\u0010#\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016J\b\u0010%\u001a\u00020!H\u0016R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u00104\u001a\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u00104\u001a\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u00104\u001a\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u00104\u001a\u0004\bN\u0010OR\u001b\u0010S\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u00104\u001a\u0004\bR\u0010JR\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006["}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/d;", "Lf70;", "Lfy2;", "Liu6$e;", "Liu6$c;", "Lw50;", "", "Ah", "Dh", "Lf63;", "Ch", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "y0", "S9", "l0", "", "Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/a;", "fields", "m5", "", "mainAddress", "bc", "fc", "Ng", "ia", "w", "targetView", "Sf", "a", "", "visible", "P8", "o2", "onBackPressed", "Lrx2;", com.huawei.hms.opendevice.c.a, "Lrn5;", "sh", "()Lrx2;", "args", "Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/DeliveryLocationDetailsPresenter;", DateTokenConverter.CONVERTER_KEY, "Lmoxy/ktx/MoxyKtxDelegate;", "xh", "()Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/DeliveryLocationDetailsPresenter;", "presenter", "Landroidx/recyclerview/widget/RecyclerView;", com.huawei.hms.push.e.a, "Lk79;", "rh", "()Landroidx/recyclerview/widget/RecyclerView;", "addressComponentsRecyclerView", "Landroid/widget/TextView;", "f", "wh", "()Landroid/widget/TextView;", "mainAddressOld", "Landroid/widget/LinearLayout;", "g", "vh", "()Landroid/widget/LinearLayout;", "mainAddressNew", "Lcom/google/android/material/appbar/MaterialToolbar;", Image.TYPE_HIGH, "zh", "()Lcom/google/android/material/appbar/MaterialToolbar;", "toolBar", "Landroid/widget/Button;", "i", "yh", "()Landroid/widget/Button;", "saveBtn", "Landroid/widget/ProgressBar;", "j", "uh", "()Landroid/widget/ProgressBar;", "loader", "k", "th", "deleteBtn", "Landroid/widget/EditText;", "l", "Landroid/widget/EditText;", "editTextForKeyboard", "<init>", "()V", Image.TYPE_MEDIUM, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class d extends f70 implements fy2, iu6.e, iu6.c, w50 {
    private final rn5 c;
    private final MoxyKtxDelegate d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private EditText l;
    static final /* synthetic */ je5<Object>[] n = {bc9.f(new ar8(d.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/DeliveryLocationDetailsPresenter;", 0)), bc9.f(new ar8(d.class, "addressComponentsRecyclerView", "getAddressComponentsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(d.class, "mainAddressOld", "getMainAddressOld()Landroid/widget/TextView;", 0)), bc9.f(new ar8(d.class, "mainAddressNew", "getMainAddressNew()Landroid/widget/LinearLayout;", 0)), bc9.f(new ar8(d.class, "toolBar", "getToolBar()Lcom/google/android/material/appbar/MaterialToolbar;", 0)), bc9.f(new ar8(d.class, "saveBtn", "getSaveBtn()Landroid/widget/Button;", 0)), bc9.f(new ar8(d.class, "loader", "getLoader()Landroid/widget/ProgressBar;", 0)), bc9.f(new ar8(d.class, "deleteBtn", "getDeleteBtn()Landroid/widget/Button;", 0))};
    public static final a m = new a(null);

    /* compiled from: DeliveryLocationDetailsFragment.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/d$a;", "", "Lrx2;", "data", "Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/d;", "a", "", "COMMENT_FIELD_HEIGHT", "I", "", "EXTRA_KEY_ARGUMENTS", "Ljava/lang/String;", "", "TIMEOUT_TO_CLOSE_KEYBOARD", "J", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(rx2 rx2Var) {
            z65.h(rx2Var, "data");
            return (d) y64.d(new d(), bi0.c(bi0.d("extra_key_arguments", rx2Var)));
        }
    }

    /* compiled from: DeliveryLocationDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lrx2;", "a", "()Lrx2;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<rx2> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final rx2 invoke() {
            Bundle arguments = d.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("extra_key_arguments")) == null) ? null : null;
            if (obj != null && !(obj instanceof rx2)) {
                throw new ClassCastException("Property extra_key_arguments has different class type");
            } else if (obj != null) {
                return (rx2) obj;
            } else {
                throw new IllegalArgumentException("Argument with key = extra_key_arguments not found in bundle");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryLocationDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            if (view.isEnabled()) {
                d.this.Dh();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryLocationDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.d$d  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0608d extends ej5 implements Function1<View, Unit> {
        C0608d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            d.this.xh().C();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: DeliveryLocationDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/DeliveryLocationDetailsPresenter;", "a", "()Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/DeliveryLocationDetailsPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function0<DeliveryLocationDetailsPresenter> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final DeliveryLocationDetailsPresenter invoke() {
            return ((LocalityComponent) d.this.getComponentDependenciesRegistry().a(bc9.b(LocalityComponent.class))).g3().b(d.this.Ch()).c(d.this.sh()).a().a();
        }
    }

    /* compiled from: DeliveryLocationDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function0<Unit> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            d.this.xh().B(DeliveryLocationDetailsPresenter.a.b.a);
        }
    }

    /* compiled from: DeliveryLocationDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class g extends ej5 implements Function0<Unit> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            d.this.xh().B(DeliveryLocationDetailsPresenter.a.C0603a.a);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class h extends ej5 implements Function1<Object, Boolean> {
        public static final h a = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class i extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final i a = new i();

        public i() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = AddressDetailsFieldVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: DeliveryLocationDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/a;", "field", "", "text", "", "a", "(Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/a;Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class j extends ej5 implements Function2<ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a, String, Unit> {
        j() {
            super(2);
        }

        public final void a(ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a aVar, String str) {
            z65.h(aVar, "field");
            z65.h(str, "text");
            d.this.xh().E(aVar, str);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a aVar, String str) {
            a(aVar, str);
            return Unit.a;
        }
    }

    /* compiled from: DeliveryLocationDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class k extends ej5 implements Function0<Unit> {
        k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            d.this.Dh();
        }
    }

    /* compiled from: DeliveryLocationDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/a;", "field", "", "newValue", "", "a", "(Lru/dodopizza/app/presentation/selectlocation/geoflow/deliverylocationdetails/a;Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class l extends ej5 implements Function2<ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a, String, Unit> {
        l() {
            super(2);
        }

        public final void a(ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a aVar, String str) {
            z65.h(aVar, "field");
            z65.h(str, "newValue");
            d.this.xh().F(ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.b.b(aVar), str);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a aVar, String str) {
            a(aVar, str);
            return Unit.a;
        }
    }

    /* compiled from: DeliveryLocationDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "b", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class m extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str) {
            super(1);
            this.b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(d dVar, String str) {
            z65.h(dVar, "this$0");
            z65.h(str, "$mainAddress");
            dVar.xh().H(str);
        }

        public final void b(View view) {
            z65.h(view, "it");
            View rootView = view.getRootView();
            z65.g(rootView, "getRootView(...)");
            gg5.c(rootView);
            Handler handler = new Handler(Looper.getMainLooper());
            final d dVar = d.this;
            final String str = this.b;
            handler.postDelayed(new Runnable() { // from class: ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.e
                @Override // java.lang.Runnable
                public final void run() {
                    d.m.c(d.this, str);
                }
            }, 200L);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            b(view);
            return Unit.a;
        }
    }

    public d() {
        super(R.layout.fragment_delivery_location_details);
        rn5 b2;
        b2 = yn5.b(new b());
        this.c = b2;
        e eVar = new e();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.d = new MoxyKtxDelegate(mvpDelegate, DeliveryLocationDetailsPresenter.class.getName() + ".presenter", eVar);
        this.e = kb0.e(this, R.id.delivery_location_details_recycler_view);
        this.f = kb0.e(this, R.id.delivery_location_details_main_address_old);
        this.g = kb0.e(this, R.id.delivery_location_details_main_address_new);
        this.h = kb0.e(this, R.id.delivery_location_details_toolbar);
        this.i = kb0.e(this, R.id.delivery_location_details_done_btn);
        this.j = kb0.e(this, R.id.delivery_location_details_loader);
        this.k = kb0.e(this, R.id.delivery_location_details_delete_button);
    }

    private final void Ah() {
        zh().setNavigationOnClickListener(new View.OnClickListener() { // from class: px2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d.Bh(d.this, view);
            }
        });
        oma.a(yh(), new c());
        oma.a(th(), new C0608d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bh(d dVar, View view) {
        z65.h(dVar, "this$0");
        dVar.xh().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f63 Ch() {
        if (getParentFragment() instanceof c70) {
            return ((CheckoutComponent) getComponentDependenciesRegistry().a(bc9.b(CheckoutComponent.class))).b();
        }
        return ((AppComponent) getComponentDependenciesRegistry().a(bc9.b(AppComponent.class))).A1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Dh() {
        xh().G();
    }

    private final RecyclerView rh() {
        return (RecyclerView) this.e.a(this, n[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rx2 sh() {
        return (rx2) this.c.getValue();
    }

    private final Button th() {
        return (Button) this.k.a(this, n[7]);
    }

    private final ProgressBar uh() {
        return (ProgressBar) this.j.a(this, n[6]);
    }

    private final LinearLayout vh() {
        return (LinearLayout) this.g.a(this, n[3]);
    }

    private final TextView wh() {
        return (TextView) this.f.a(this, n[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeliveryLocationDetailsPresenter xh() {
        return (DeliveryLocationDetailsPresenter) this.d.getValue(this, n[0]);
    }

    private final Button yh() {
        return (Button) this.i.a(this, n[5]);
    }

    private final MaterialToolbar zh() {
        return (MaterialToolbar) this.h.a(this, n[4]);
    }

    @Override // defpackage.fy2
    public void Ng() {
        yh().setEnabled(true);
    }

    @Override // defpackage.fy2
    public void P8(boolean z) {
        int i2;
        Button th = th();
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        th.setVisibility(i2);
    }

    @Override // defpackage.iu6.e
    public void S9() {
        xh().D();
    }

    @Override // defpackage.fy2
    public void Sf(ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a aVar) {
        z65.h(aVar, "targetView");
        EditText editText = (EditText) rh().findViewWithTag(ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.b.b(aVar));
        this.l = editText;
        if (editText != null) {
            gg5.d(editText);
        }
    }

    @Override // defpackage.fy2
    public void a() {
        gg5.c(rh());
    }

    @Override // defpackage.fy2
    public void bc(String str) {
        z65.h(str, "mainAddress");
        wh().setText(str);
        un3.k(wh());
        un3.e(vh());
    }

    @Override // defpackage.fy2
    public void fc(String str) {
        z65.h(str, "mainAddress");
        un3.e(wh());
        un3.k(vh());
        ((TextView) vh().findViewById(R.id.delivery_location_details_text_view)).setText(getString(R.string.delivery_address));
        TextInputEditText textInputEditText = (TextInputEditText) vh().findViewById(R.id.delivery_location_details_edit_text);
        textInputEditText.setFocusable(false);
        textInputEditText.setText(str);
        z65.e(textInputEditText);
        oma.a(textInputEditText, new m(str));
    }

    @Override // defpackage.fy2
    public void ia() {
        yh().setEnabled(false);
    }

    @Override // defpackage.fy2
    public void m5(List<? extends ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a> list) {
        z65.h(list, "fields");
        rh().setAdapter(new k6.a(new k6(list), h.a, new m7(new j(), new k(), new l()), i.a).b().d());
    }

    @Override // defpackage.fy2
    public void o2() {
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        w81.c(requireContext, new f(), new g());
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        xh().onBackPressed();
        return true;
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Ah();
        rh().setLayoutManager(new FlexboxLayoutManager(getActivity()));
    }

    @Override // defpackage.fy2
    public void w() {
        un3.e(uh());
    }

    @Override // defpackage.fy2
    public void y0() {
        new iu6.a().a(false).e(R.string.delete_address_text).c(R.string.cancel).d(R.string.remove).g(this);
    }

    @Override // defpackage.iu6.c
    public void l0() {
    }
}
