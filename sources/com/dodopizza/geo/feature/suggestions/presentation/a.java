package com.dodopizza.geo.feature.suggestions.presentation;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.textinputlayout.DodoEditTextInputLayout;
import com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureDependencies;
import com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsFeatureServiceDependencies;
import com.dodopizza.geo.feature.suggestions.DeliveryLocationSuggestionsRouterFeatureDependencies;
import com.dodopizza.geo.feature.suggestions.adapter.DeliveryLocationVHImpl;
import com.dodopizza.geo.feature.suggestions.presentation.a;
import com.dodopizza.geo.feature.suggestions.presentation.c;
import com.dodopizza.geo.feature.suggestions.presentation.g;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k6;
import defpackage.py2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.MvpPresenter;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: DeliveryLocationSuggestionsFragment.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 w2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001'B\u0007¢\u0006\u0004\bu\u0010vJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0014J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u001e\u0010\u0019\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0018\u001a\u00020\u0012H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016J\b\u0010\u001d\u001a\u00020\u0004H\u0016J\b\u0010\u001e\u001a\u00020\u0004H\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016J\b\u0010 \u001a\u00020\u0004H\u0016J\b\u0010!\u001a\u00020\u0004H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016J\b\u0010#\u001a\u00020\u0004H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016J\b\u0010&\u001a\u00020\u0004H\u0016J\b\u0010'\u001a\u00020\u0004H\u0016J\b\u0010(\u001a\u00020\u0012H\u0016J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u0012H\u0016J\u0010\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H\u0016J\u0010\u00100\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.H\u0016J\b\u00101\u001a\u00020\u0004H\u0016J\u0012\u00103\u001a\u00020\u00042\b\u00102\u001a\u0004\u0018\u00010+H\u0016J\u0010\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u00020.H\u0016R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010@\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010@\u001a\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010@\u001a\u0004\bP\u0010QR\u001b\u0010V\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010@\u001a\u0004\bT\u0010UR\u001b\u0010[\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010@\u001a\u0004\bY\u0010ZR\u001b\u0010a\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R(\u0010i\u001a\b\u0012\u0004\u0012\u00020c0b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR(\u0010n\u001a\b\u0012\u0004\u0012\u00020j0b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bk\u0010d\u001a\u0004\bl\u0010f\"\u0004\bm\u0010hR\u001b\u0010t\u001a\u00020o8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010s¨\u0006x"}, d2 = {"Lcom/dodopizza/geo/feature/suggestions/presentation/a;", "Lf70;", "Lcom/dodopizza/geo/feature/suggestions/presentation/e;", "Lw50;", "", "Bh", "Ch", "Loz3;", "Lcw5;", "Eh", "", "hh", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "", "isShouldBeVisible", "Rc", "", "Le2b;", "suggestions", "isShowDistance", "b7", "B7", "j1", "Nd", "I7", "b9", "Ma", "u8", "Tf", "V", "g2", "ma", "Sa", "Ka", "a", "onBackPressed", "isVisible", "c8", "", "formattedAddress", "m6", "Lcom/dodopizza/geo/feature/suggestions/presentation/g$a;", "location", "E4", "k", "hint", "Jf", "deliveryLocation", "W6", "Lje4;", com.huawei.hms.opendevice.c.a, "Lje4;", "uh", "()Lje4;", "setGeoLocationProviderFactory", "(Lje4;)V", "geoLocationProviderFactory", "Lcom/dodopizza/android/textinputlayout/DodoEditTextInputLayout;", DateTokenConverter.CONVERTER_KEY, "Lk79;", "qh", "()Lcom/dodopizza/android/textinputlayout/DodoEditTextInputLayout;", "addressField", "Landroidx/recyclerview/widget/RecyclerView;", com.huawei.hms.push.e.a, "rh", "()Landroidx/recyclerview/widget/RecyclerView;", "addressList", "Landroidx/appcompat/widget/Toolbar;", "f", "Ah", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lcom/dodopizza/geo/feature/suggestions/presentation/ShimmerListView;", "g", "zh", "()Lcom/dodopizza/geo/feature/suggestions/presentation/ShimmerListView;", "shimmer", Image.TYPE_HIGH, "vh", "()Landroid/view/View;", "myLocation", "Landroid/widget/TextView;", "i", "th", "()Landroid/widget/TextView;", "emptyContent", "Lny2;", "j", "Lrn5;", "sh", "()Lny2;", "args", "Las8;", "Lcom/dodopizza/geo/feature/suggestions/presentation/DeliveryLocationSuggestionsPresenterImpl;", "Las8;", "yh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "Lcom/dodopizza/geo/feature/suggestions/presentation/DeliveryLocationSuggestionsPresenterLiteImpl;", "l", "xh", "setPresenterLiteProvider", "presenterLiteProvider", "Lcom/dodopizza/geo/feature/suggestions/presentation/c;", Image.TYPE_MEDIUM, "Lmoxy/ktx/MoxyKtxDelegate;", "wh", "()Lcom/dodopizza/geo/feature/suggestions/presentation/c;", "presenter", "<init>", "()V", "n", "geo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class a extends f70 implements com.dodopizza.geo.feature.suggestions.presentation.e, w50 {
    public je4 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final rn5 j;
    public as8<DeliveryLocationSuggestionsPresenterImpl> k;
    public as8<DeliveryLocationSuggestionsPresenterLiteImpl> l;
    private final MoxyKtxDelegate m;
    static final /* synthetic */ je5<Object>[] o = {bc9.f(new ar8(a.class, "addressField", "getAddressField()Lcom/dodopizza/android/textinputlayout/DodoEditTextInputLayout;", 0)), bc9.f(new ar8(a.class, "addressList", "getAddressList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(a.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(a.class, "shimmer", "getShimmer()Lcom/dodopizza/geo/feature/suggestions/presentation/ShimmerListView;", 0)), bc9.f(new ar8(a.class, "myLocation", "getMyLocation()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "emptyContent", "getEmptyContent()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "presenter", "getPresenter()Lcom/dodopizza/geo/feature/suggestions/presentation/DeliveryLocationSuggestionsPresenter;", 0))};
    public static final C0158a n = new C0158a(null);

    /* compiled from: DeliveryLocationSuggestionsFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/dodopizza/geo/feature/suggestions/presentation/a$a;", "", "Lny2;", "args", "Lcom/dodopizza/geo/feature/suggestions/presentation/a;", "a", "", "EXTRA_KEY_ARGUMENTS", "Ljava/lang/String;", "SELECT_DELIVERY_SUGGESTION_KEY", "SELECT_DELIVERY_SUGGESTION_VALUE", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.geo.feature.suggestions.presentation.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0158a {
        private C0158a() {
        }

        public /* synthetic */ C0158a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(ny2 ny2Var) {
            z65.h(ny2Var, "args");
            if (ny2Var instanceof g2b) {
                return (a) y64.d(new a(), bi0.c(bi0.d("extra_key_arguments", ny2Var)));
            }
            if (ny2Var instanceof h2b) {
                return (a) y64.d(new a(), bi0.c(bi0.d("extra_key_arguments", ny2Var)));
            }
            throw new IllegalArgumentException("Can't create DeliveryLocationSuggestionsFragment with argument type");
        }
    }

    /* compiled from: DeliveryLocationSuggestionsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lny2;", "a", "()Lny2;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function0<ny2> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ny2 invoke() {
            Bundle arguments = a.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("extra_key_arguments")) == null) ? null : null;
            if (obj != null && !(obj instanceof ny2)) {
                throw new ClassCastException("Property extra_key_arguments has different class type");
            } else if (obj != null) {
                return (ny2) obj;
            } else {
                throw new IllegalArgumentException("Argument with key = extra_key_arguments not found in bundle");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryLocationSuggestionsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c extends ej5 implements Function1<String, Unit> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            z65.h(str, "it");
            a.this.wh().f(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeliveryLocationSuggestionsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            a.this.wh().e();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: DeliveryLocationSuggestionsFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function0<Object> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ny2 sh = a.this.sh();
            if (sh instanceof g2b) {
                return a.this.yh().get();
            }
            if (sh instanceof h2b) {
                return a.this.xh().get();
            }
            throw new IllegalArgumentException("Can't create DeliveryLocationSuggestionsFragment with argument type");
        }
    }

    /* compiled from: DeliveryLocationSuggestionsFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.geo.feature.suggestions.presentation.DeliveryLocationSuggestionsFragment$requestLocation$1", f = "DeliveryLocationSuggestionsFragment.kt", l = {260}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class f extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DeliveryLocationSuggestionsFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcw5;", "it", "", "b", "(Lcw5;Lcv1;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.dodopizza.geo.feature.suggestions.presentation.a$f$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0159a<T> implements pz3 {
            final /* synthetic */ a a;

            C0159a(a aVar) {
                this.a = aVar;
            }

            @Override // defpackage.pz3
            /* renamed from: b */
            public final Object emit(cw5 cw5Var, cv1<? super Unit> cv1Var) {
                this.a.wh().m(zv5.a(cw5Var));
                return Unit.a;
            }
        }

        f(cv1<? super f> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new f(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((f) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                oz3 Eh = a.this.Eh();
                C0159a c0159a = new C0159a(a.this);
                this.a = 1;
                if (Eh.collect(c0159a, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: DeliveryLocationSuggestionsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class g extends ej5 implements Function0<Unit> {
        final /* synthetic */ g.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(g.a aVar) {
            super(0);
            this.b = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            a.this.wh().a(new c.a.b(this.b));
        }
    }

    /* compiled from: DeliveryLocationSuggestionsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class h extends ej5 implements Function0<Unit> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            a.this.wh().a(c.a.C0161a.a);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class i extends ej5 implements Function1<Object, Boolean> {
        public static final i a = new i();

        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof e2b);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class j extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final j a = new j();

        public j() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = DeliveryLocationVHImpl.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: DeliveryLocationSuggestionsFragment.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/dodopizza/geo/feature/suggestions/presentation/a$k", "Lf2b;", "Le2b;", "suggestionVO", "", "position", "", "a", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class k implements f2b {
        k() {
        }

        @Override // defpackage.f2b
        public void a(e2b e2bVar, int i) {
            z65.h(e2bVar, "suggestionVO");
            a.this.wh().n(e2bVar.a(), i);
        }
    }

    /* compiled from: DeliveryLocationSuggestionsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class l extends ej5 implements Function0<String> {
        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            String string = a.this.getString(o09.p);
            z65.g(string, "getString(...)");
            return string;
        }
    }

    public a() {
        super(dz8.fragment_delivery_location);
        rn5 b2;
        this.d = kb0.e(this, dy8.delivery_location_address);
        this.e = kb0.e(this, dy8.delivery_location_list);
        this.f = kb0.e(this, dy8.delivery_location_toolbar);
        this.g = kb0.e(this, dy8.shimmer_layout);
        this.h = kb0.e(this, dy8.my_location);
        this.i = kb0.e(this, dy8.empty_content);
        b2 = yn5.b(new b());
        this.j = b2;
        e eVar = new e();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.m = new MoxyKtxDelegate(mvpDelegate, Object.class.getName() + ".presenter", eVar);
    }

    private final Toolbar Ah() {
        return (Toolbar) this.f.a(this, o[2]);
    }

    private final void Bh() {
        rh().setLayoutManager(new LinearLayoutManager(getContext()));
        Function1 b2 = kn2.b(pp5.a(this), 0L, new c(), 1, null);
        EditText editText = qh().getEditText();
        if (editText != null) {
            editText.setHint(getString(o09.p));
        }
        EditText editText2 = qh().getEditText();
        if (editText2 != null) {
            e97.a(editText2, b2);
        }
        int i2 = 0;
        qh().F0(false);
        Ch();
        Toolbar Ah = Ah();
        if (!sh().l()) {
            i2 = 8;
        }
        Ah.setVisibility(i2);
    }

    private final void Ch() {
        Ah().setNavigationOnClickListener(new View.OnClickListener() { // from class: qy2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a.Dh(a.this, view);
            }
        });
        oma.a(vh(), new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Dh(a aVar, View view) {
        z65.h(aVar, "this$0");
        aVar.wh().j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<cw5> Eh() {
        return qv5.a.a(uh()).a();
    }

    private final DodoEditTextInputLayout qh() {
        return (DodoEditTextInputLayout) this.d.a(this, o[0]);
    }

    private final RecyclerView rh() {
        return (RecyclerView) this.e.a(this, o[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ny2 sh() {
        return (ny2) this.j.getValue();
    }

    private final TextView th() {
        return (TextView) this.i.a(this, o[5]);
    }

    private final View vh() {
        return (View) this.h.a(this, o[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.dodopizza.geo.feature.suggestions.presentation.c wh() {
        MvpPresenter value = this.m.getValue(this, o[6]);
        z65.g(value, "getValue(...)");
        return (com.dodopizza.geo.feature.suggestions.presentation.c) value;
    }

    private final ShimmerListView zh() {
        return (ShimmerListView) this.g.a(this, o[3]);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void B7() {
        un3.e(rh());
        th().setText(getString(o09.suggestion_empty_content));
        un3.k(th());
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void E4(g.a aVar) {
        z65.h(aVar, "location");
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        x81.c(requireContext, new g(aVar), new h());
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void I7() {
        qh().setError(getString(o09.addresses_invalid_address));
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void Jf(String str) {
        EditText editText = qh().getEditText();
        if (editText != null) {
            editText.setHint((CharSequence) mh5.d(str, new l()));
        }
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void Ka() {
        qh().setEnabled(true);
        EditText editText = qh().getEditText();
        if (editText != null) {
            editText.setInputType(1);
        }
        rh().setVisibility(0);
        zh().setVisibility(8);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void Ma() {
        qh().setError(getString(o09.suggestion_selected_address_delivery_error));
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void Nd() {
        p45.j(rh(), 0, 0, 0, 0, 13, null);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void Rc(boolean z) {
        if (z) {
            u8();
            th().setText(getString(o09.start_entering_address));
        }
        un3.o(th(), z);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void Sa() {
        qh().setEnabled(false);
        EditText editText = qh().getEditText();
        if (editText != null) {
            editText.setInputType(0);
        }
        rh().setVisibility(8);
        zh().setVisibility(0);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void Tf() {
        un3.e(rh());
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void V() {
        gg5.d(qh());
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void W6(g.a aVar) {
        z65.h(aVar, "deliveryLocation");
        i64.a(this, "select_delivery_suggestion_key", bi0.c(bi0.d("select_delivery_suggestion_value", aVar)));
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void a() {
        gg5.c(qh());
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void b7(List<e2b> list, boolean z) {
        z65.h(list, "suggestions");
        rh().setAdapter(new k6.a(new k6(list), i.a, new z1b(z, new k()), j.a).b().d());
        un3.e(th());
        un3.k(rh());
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void b9() {
        qh().setError(getString(o09.address_delivery_incomplete_2));
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void c8(boolean z) {
        un3.o(vh(), z);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void g2() {
        qh().setProgress(true);
        rh().setVisibility(8);
        zh().setVisibility(0);
    }

    @Override // defpackage.f70
    protected int hh() {
        return nw8.a;
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void j1() {
        un3.e(rh());
        th().setText(getString(o09.suggestion_network_problem));
        un3.k(th());
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void k() {
        sh0.d(pp5.a(this), null, null, new f(null), 3, null);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void m6(String str) {
        z65.h(str, "formattedAddress");
        EditText editText = qh().getEditText();
        if (editText != null) {
            editText.setText(str);
        }
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void ma() {
        qh().setProgress(false);
        zh().setVisibility(8);
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        wh().onBackPressed();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        py2.b a = py2.a.a();
        DeliveryLocationSuggestionsFeatureDependencies deliveryLocationSuggestionsFeatureDependencies = (DeliveryLocationSuggestionsFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(DeliveryLocationSuggestionsFeatureDependencies.class));
        DeliveryLocationSuggestionsRouterFeatureDependencies deliveryLocationSuggestionsRouterFeatureDependencies = (DeliveryLocationSuggestionsRouterFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(DeliveryLocationSuggestionsRouterFeatureDependencies.class));
        DeliveryLocationSuggestionsFeatureServiceDependencies deliveryLocationSuggestionsFeatureServiceDependencies = (DeliveryLocationSuggestionsFeatureServiceDependencies) getComponentDependenciesRegistry().a(bc9.b(DeliveryLocationSuggestionsFeatureServiceDependencies.class));
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("extra_key_arguments")) == null) ? null : null;
        if (obj != null && !(obj instanceof ny2)) {
            throw new ClassCastException("Property extra_key_arguments has different class type");
        } else if (obj != null) {
            a.a(deliveryLocationSuggestionsFeatureDependencies, deliveryLocationSuggestionsRouterFeatureDependencies, deliveryLocationSuggestionsFeatureServiceDependencies, (ny2) obj).a(this);
            super.onCreate(bundle);
        } else {
            throw new IllegalArgumentException("Argument with key = extra_key_arguments not found in bundle");
        }
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Bh();
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void u8() {
        qh().setError(null);
    }

    public final je4 uh() {
        je4 je4Var = this.c;
        if (je4Var != null) {
            return je4Var;
        }
        z65.z("geoLocationProviderFactory");
        return null;
    }

    public final as8<DeliveryLocationSuggestionsPresenterLiteImpl> xh() {
        as8<DeliveryLocationSuggestionsPresenterLiteImpl> as8Var = this.l;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterLiteProvider");
        return null;
    }

    public final as8<DeliveryLocationSuggestionsPresenterImpl> yh() {
        as8<DeliveryLocationSuggestionsPresenterImpl> as8Var = this.k;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
