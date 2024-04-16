package com.dodopizza.order.feature.halves.constructor.presentation;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.halves.HalvesFeatureDependencies;
import com.dodopizza.order.feature.halves.constructor.presentation.HalvesProgressButton;
import com.dodopizza.order.feature.halves.constructor.presentation.a;
import com.dodopizza.order.feature.halves.constructor.presentation.adapter.HalfViewHolder;
import com.dodopizza.order.feature.halves.constructor.presentation.adapter.romanpizza.RomanHalfViewHolder;
import com.dodopizza.persistence.entity.menu.ProductEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.dk4;
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
/* compiled from: HalvesConstructorFragment.kt */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \u0096\u00012\u00020\u00012\u00020\u0002:\u0002\u0097\u0001B\t¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J.\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0007H\u0002J0\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u0017H\u0002J\u0012\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0018\u0010$\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\"H\u0016J\u0018\u0010%\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\"H\u0016J\u001e\u0010)\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eH\u0016J\u001e\u0010*\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eH\u0016J\u0018\u0010+\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\"H\u0016J\u001e\u0010,\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eH\u0016J\u001a\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u001e\u00100\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u001e\u00101\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u00103\u001a\u00020\u00072\u0006\u00102\u001a\u00020\"H\u0016J\b\u00104\u001a\u00020\u0007H\u0016J\u0018\u00106\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00105\u001a\u00020\"H\u0016J\u0010\u00107\u001a\u00020\u00072\u0006\u00105\u001a\u00020\"H\u0016J\u0010\u00108\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u00109\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010:\u001a\u00020\u0007H\u0016J\b\u0010;\u001a\u00020\u0007H\u0016J\b\u0010<\u001a\u00020\u0007H\u0016J\b\u0010=\u001a\u00020\u0007H\u0016J\u0010\u0010@\u001a\u00020\u00072\u0006\u0010?\u001a\u00020>H\u0016J\b\u0010A\u001a\u00020\u0007H\u0016J\b\u0010B\u001a\u00020\u0007H\u0016R\u001b\u0010G\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001b\u0010J\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\bI\u0010FR\u001b\u0010M\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010D\u001a\u0004\bL\u0010FR\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010D\u001a\u0004\bP\u0010QR\u001b\u0010W\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010D\u001a\u0004\bU\u0010VR\u001b\u0010Z\u001a\u00020S8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010D\u001a\u0004\bY\u0010VR\u001b\u0010_\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010D\u001a\u0004\b]\u0010^R\u001b\u0010b\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010D\u001a\u0004\ba\u0010FR\u001b\u0010f\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010D\u001a\u0004\bd\u0010eR\u001b\u0010i\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bg\u0010D\u001a\u0004\bh\u0010eR\u001b\u0010n\u001a\u00020j8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bk\u0010D\u001a\u0004\bl\u0010mR\u001b\u0010s\u001a\u00020o8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010D\u001a\u0004\bq\u0010rR\u001b\u0010v\u001a\u00020o8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bt\u0010D\u001a\u0004\bu\u0010rR\u001b\u0010y\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010D\u001a\u0004\bx\u0010FR\u001b\u0010~\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010D\u001a\u0004\b|\u0010}R\u001d\u0010\u0081\u0001\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b\u007f\u0010D\u001a\u0005\b\u0080\u0001\u0010FR\u001e\u0010\u0084\u0001\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010D\u001a\u0005\b\u0083\u0001\u0010FR1\u0010\u008d\u0001\u001a\n\u0012\u0005\u0012\u00030\u0086\u00010\u0085\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R+\u0010\u0093\u0001\u001a\r \u008e\u0001*\u0005\u0018\u00010\u0086\u00010\u0086\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001¨\u0006\u0098\u0001"}, d2 = {"Lcom/dodopizza/order/feature/halves/constructor/presentation/a;", "Lf70;", "Lwk4;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Lfka;", "sideHalf", "", "Ph", "", "position", "Rh", "Yh", "Zh", "", "", "items", "Lb78;", "pizzaConcept", "Oh", "Xh", "Llm8;", "tags", "", "isStopped", "isOriginalRecipe", "Th", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "title", "rb", Action.NAME_ATTRIBUTE, "Lhn6;", "price", "L3", "u5", "Lxj4;", ProductEntity.TYPE_PIZZA, "productTags", "ga", "Ab", "z5", "U2", "Landroid/view/View;", "view", "onViewCreated", "ug", "Wa", "cost", "e7", "Eg", "halvesTotalPrice", "je", "d2", "s2", "bd", "showLoader", "E7", "w", "j4", "Lwj4;", "data", "eb", "S7", "y8", com.huawei.hms.opendevice.c.a, "Lk79;", "Jh", "()Landroid/view/View;", "shuffle", DateTokenConverter.CONVERTER_KEY, "Fh", "progress", com.huawei.hms.push.e.a, "yh", "gradient", "Landroidx/appcompat/widget/Toolbar;", "f", "Lh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/widget/TextView;", "g", "Mh", "()Landroid/widget/TextView;", "toolbarTitle", Image.TYPE_HIGH, "Nh", "totalCost", "Landroid/widget/Button;", "i", "vh", "()Landroid/widget/Button;", "buildPizza", "j", "wh", "controlsContainer", "k", "Gh", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerLeft", "l", "Hh", "recyclerRight", "Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesPricesView;", Image.TYPE_MEDIUM, "Ah", "()Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesPricesView;", "halvesPrices", "Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesScrollView;", "n", "Ch", "()Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesScrollView;", "halvesScrollViewRight", "o", "Bh", "halvesScrollViewLeft", "p", "xh", "errorStateView", "Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesProgressButton;", "q", "Ih", "()Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesProgressButton;", "refreshButton", "r", "Kh", "tapToSeeIngredients", Image.TYPE_SMALL, "zh", "halfInStopWarning", "Las8;", "Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesConstructorPresenter;", "t", "Las8;", "Eh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "u", "Lmoxy/ktx/MoxyKtxDelegate;", "Dh", "()Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesConstructorPresenter;", "presenter", "<init>", "()V", "v", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class a extends f70 implements wk4 {
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
    public as8<HalvesConstructorPresenter> t;
    private final MoxyKtxDelegate u;
    static final /* synthetic */ je5<Object>[] w = {bc9.f(new ar8(a.class, "shuffle", "getShuffle()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "progress", "getProgress()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "gradient", "getGradient()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(a.class, "toolbarTitle", "getToolbarTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "totalCost", "getTotalCost()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a.class, "buildPizza", "getBuildPizza()Landroid/widget/Button;", 0)), bc9.f(new ar8(a.class, "controlsContainer", "getControlsContainer()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "recyclerLeft", "getRecyclerLeft()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(a.class, "recyclerRight", "getRecyclerRight()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(a.class, "halvesPrices", "getHalvesPrices()Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesPricesView;", 0)), bc9.f(new ar8(a.class, "halvesScrollViewRight", "getHalvesScrollViewRight()Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesScrollView;", 0)), bc9.f(new ar8(a.class, "halvesScrollViewLeft", "getHalvesScrollViewLeft()Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesScrollView;", 0)), bc9.f(new ar8(a.class, "errorStateView", "getErrorStateView()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "refreshButton", "getRefreshButton()Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesProgressButton;", 0)), bc9.f(new ar8(a.class, "tapToSeeIngredients", "getTapToSeeIngredients()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "halfInStopWarning", "getHalfInStopWarning()Landroid/view/View;", 0)), bc9.f(new ar8(a.class, "presenter", "getPresenter()Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesConstructorPresenter;", 0))};
    public static final C0175a v = new C0175a(null);
    public static final int x = 8;

    /* compiled from: HalvesConstructorFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/dodopizza/order/feature/halves/constructor/presentation/a$a;", "", "Lek4;", "data", "Lcom/dodopizza/order/feature/halves/constructor/presentation/a;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: com.dodopizza.order.feature.halves.constructor.presentation.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0175a {
        private C0175a() {
        }

        public /* synthetic */ C0175a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(ek4 ek4Var) {
            z65.h(ek4Var, "data");
            return (a) y64.d(new a(), bi0.c(bi0.d("data", ek4Var)));
        }
    }

    /* compiled from: HalvesConstructorFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[fka.values().length];
            try {
                iArr[fka.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fka.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[b78.values().length];
            try {
                iArr2[b78.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[b78.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesConstructorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwj4;", "data", "", "a", "(Lwj4;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class c extends ej5 implements Function1<wj4, Unit> {
        final /* synthetic */ fka b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(fka fkaVar) {
            super(1);
            this.b = fkaVar;
        }

        public final void a(wj4 wj4Var) {
            z65.h(wj4Var, "data");
            a.this.Dh().y(wj4Var, this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(wj4 wj4Var) {
            a(wj4Var);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class d extends ej5 implements Function1<Object, Boolean> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof xj4);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class e extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final e a = new e();

        public e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = HalfViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
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
            return Boolean.valueOf(obj instanceof xj4);
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
            Object newInstance = RomanHalfViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesConstructorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "position", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class h extends ej5 implements Function1<Integer, Unit> {
        final /* synthetic */ fka b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(fka fkaVar) {
            super(1);
            this.b = fkaVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.a;
        }

        public final void invoke(int i) {
            a.this.Rh(this.b, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HalvesConstructorFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "<anonymous parameter 0>", "position", "", "a", "(II)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class i extends ej5 implements Function2<Integer, Integer, Unit> {
        final /* synthetic */ fka b;

        /* compiled from: HalvesConstructorFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.dodopizza.order.feature.halves.constructor.presentation.a$i$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0176a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[fka.values().length];
                try {
                    iArr[fka.a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[fka.b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(fka fkaVar) {
            super(2);
            this.b = fkaVar;
        }

        public final void a(int i, int i2) {
            un3.e(a.this.zh());
            int i3 = C0176a.$EnumSwitchMapping$0[this.b.ordinal()];
            if (i3 == 1) {
                a.this.Yh(i2);
            } else if (i3 == 2) {
                a.this.Zh(i2);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
            a(num.intValue(), num2.intValue());
            return Unit.a;
        }
    }

    /* compiled from: HalvesConstructorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class j extends ej5 implements Function1<View, Unit> {
        j() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            a.this.Dh().x();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: HalvesConstructorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class k extends ej5 implements Function1<View, Unit> {
        k() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            a.this.Dh().w();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: HalvesConstructorFragment.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/dodopizza/order/feature/halves/constructor/presentation/a$l", "Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesProgressButton$b;", "Landroid/view/View;", "v", "", "onClick", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class l implements HalvesProgressButton.b {
        l() {
        }

        @Override // com.dodopizza.order.feature.halves.constructor.presentation.HalvesProgressButton.b
        public void onClick(View view) {
            z65.h(view, "v");
            a.this.Dh().A();
        }
    }

    /* compiled from: HalvesConstructorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmm8;", "it", "", "a", "(Lmm8;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class m extends ej5 implements Function1<mm8, Unit> {
        m() {
            super(1);
        }

        public final void a(mm8 mm8Var) {
            z65.h(mm8Var, "it");
            a.this.Dh().C(mm8Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(mm8 mm8Var) {
            a(mm8Var);
            return Unit.a;
        }
    }

    /* compiled from: HalvesConstructorFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesConstructorPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/order/feature/halves/constructor/presentation/HalvesConstructorPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class n extends ej5 implements Function0<HalvesConstructorPresenter> {
        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final HalvesConstructorPresenter invoke() {
            return a.this.Eh().get();
        }
    }

    /* compiled from: HalvesConstructorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmm8;", "it", "", "a", "(Lmm8;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class o extends ej5 implements Function1<mm8, Unit> {
        o() {
            super(1);
        }

        public final void a(mm8 mm8Var) {
            z65.h(mm8Var, "it");
            a.this.Dh().C(mm8Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(mm8 mm8Var) {
            a(mm8Var);
            return Unit.a;
        }
    }

    public a() {
        super(gz8.fragment_halfs_constructor);
        this.c = kb0.e(this, gy8.fab_shuffle);
        this.d = kb0.e(this, gy8.g3);
        this.e = kb0.e(this, gy8.gradient);
        this.f = kb0.e(this, gy8.W5);
        this.g = kb0.e(this, gy8.toolbar_title);
        this.h = kb0.e(this, gy8.total_cost);
        this.i = kb0.e(this, gy8.build_halves);
        this.j = kb0.e(this, gy8.controls_container);
        this.k = kb0.e(this, gy8.recycler_l);
        this.l = kb0.e(this, gy8.recycler_r);
        this.m = kb0.e(this, gy8.halves_price);
        this.n = kb0.e(this, gy8.halves_scrollview_r);
        this.o = kb0.e(this, gy8.halves_scrollview_l);
        this.p = kb0.e(this, gy8.error_state);
        this.q = kb0.e(this, gy8.x3);
        this.r = kb0.e(this, gy8.tap_to_see_ingredients);
        this.s = kb0.e(this, gy8.pizza_in_stop_warning);
        n nVar = new n();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.u = new MoxyKtxDelegate(mvpDelegate, HalvesConstructorPresenter.class.getName() + ".presenter", nVar);
    }

    private final HalvesPricesView Ah() {
        return (HalvesPricesView) this.m.a(this, w[10]);
    }

    private final HalvesScrollView Bh() {
        return (HalvesScrollView) this.o.a(this, w[12]);
    }

    private final HalvesScrollView Ch() {
        return (HalvesScrollView) this.n.a(this, w[11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HalvesConstructorPresenter Dh() {
        return (HalvesConstructorPresenter) this.u.getValue(this, w[17]);
    }

    private final View Fh() {
        return (View) this.d.a(this, w[1]);
    }

    private final RecyclerView Gh() {
        return (RecyclerView) this.k.a(this, w[8]);
    }

    private final RecyclerView Hh() {
        return (RecyclerView) this.l.a(this, w[9]);
    }

    private final HalvesProgressButton Ih() {
        return (HalvesProgressButton) this.q.a(this, w[14]);
    }

    private final View Jh() {
        return (View) this.c.a(this, w[0]);
    }

    private final View Kh() {
        return (View) this.r.a(this, w[15]);
    }

    private final Toolbar Lh() {
        return (Toolbar) this.f.a(this, w[3]);
    }

    private final TextView Mh() {
        return (TextView) this.g.a(this, w[4]);
    }

    private final TextView Nh() {
        return (TextView) this.h.a(this, w[5]);
    }

    private final void Oh(RecyclerView recyclerView, fka fkaVar, List<? extends Object> list, b78 b78Var) {
        k6 k6Var = new k6(list);
        int i2 = b.$EnumSwitchMapping$1[b78Var.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                new k6.a(k6Var, f.a, new sn9(fkaVar), g.a).b();
            }
        } else {
            new k6.a(k6Var, d.a, new vj4(fkaVar, new c(fkaVar)), e.a).b();
        }
        recyclerView.setAdapter(k6Var.d());
    }

    private final void Ph(final RecyclerView recyclerView, fka fkaVar) {
        recyclerView.setLayoutManager(new CenterZoomLayoutManager(getContext(), fkaVar));
        recyclerView.post(new Runnable() { // from class: jk4
            @Override // java.lang.Runnable
            public final void run() {
                a.Qh(RecyclerView.this);
            }
        });
        androidx.recyclerview.widget.k kVar = new androidx.recyclerview.widget.k();
        recyclerView.addOnScrollListener(new xoa(kVar, new h(fkaVar), new i(fkaVar)));
        kVar.b(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Qh(RecyclerView recyclerView) {
        z65.h(recyclerView, "$recycler");
        recyclerView.setPadding(0, recyclerView.getHeight() / 2, 0, recyclerView.getHeight() / 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Rh(fka fkaVar, int i2) {
        int i3 = b.$EnumSwitchMapping$0[fkaVar.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                Dh().B(i2);
                return;
            }
            return;
        }
        Dh().z(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Sh(a aVar, View view) {
        z65.h(aVar, "this$0");
        aVar.Dh().onBackPressed();
    }

    private final List<lm8> Th(List<lm8> list, boolean z, boolean z2) {
        List<lm8> I0;
        List<lm8> e2;
        if (z) {
            String string = getResources().getString(r09.sold_out_tag);
            z65.g(string, "getString(...)");
            e2 = jc1.e(new lm8(null, string, null, 0, false, 29, null));
            return e2;
        } else if (z2) {
            I0 = sc1.I0(list);
            String string2 = getResources().getString(r09.original_recipe);
            z65.g(string2, "getString(...)");
            I0.add(new lm8(null, string2, null, 0, false, 29, null));
            return I0;
        } else {
            return list;
        }
    }

    static /* synthetic */ List Uh(a aVar, List list, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return aVar.Th(list, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Vh(a aVar, int i2) {
        z65.h(aVar, "this$0");
        aVar.Gh().smoothScrollToPosition(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Wh(a aVar, int i2) {
        z65.h(aVar, "this$0");
        aVar.Hh().smoothScrollToPosition(i2);
    }

    private final void Xh() {
        Context context = getContext();
        if (context != null) {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int i2 = ew8.d;
            int i3 = ew8.G;
            yh().setBackgroundDrawable(new GradientDrawable(orientation, new int[]{iu1.c(context, i2), iu1.c(context, i3), iu1.c(context, i3), iu1.c(context, i3), iu1.c(context, i3), iu1.c(context, i3), iu1.c(context, i3), iu1.c(context, i3), iu1.c(context, i3), iu1.c(context, i3), iu1.c(context, i3), iu1.c(context, i3), iu1.c(context, i2)}));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Yh(int i2) {
        Bh().b(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Zh(int i2) {
        Ch().b(i2);
    }

    private final Button vh() {
        return (Button) this.i.a(this, w[6]);
    }

    private final View wh() {
        return (View) this.j.a(this, w[7]);
    }

    private final View xh() {
        return (View) this.p.a(this, w[13]);
    }

    private final View yh() {
        return (View) this.e.a(this, w[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View zh() {
        return (View) this.s.a(this, w[16]);
    }

    @Override // defpackage.wk4
    public void Ab(xj4 xj4Var, List<lm8> list) {
        z65.h(xj4Var, ProductEntity.TYPE_PIZZA);
        z65.h(list, "productTags");
        Ah().g(xj4Var, Uh(this, list, xj4Var.j(), false, 4, null));
    }

    @Override // defpackage.wk4
    public void E7() {
        vh().setEnabled(true);
        un3.k(Jh());
    }

    @Override // defpackage.wk4
    public void Eg() {
        un3.e(Nh());
    }

    public final as8<HalvesConstructorPresenter> Eh() {
        as8<HalvesConstructorPresenter> as8Var = this.t;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.wk4
    public void L3(String str, hn6 hn6Var) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(hn6Var, "price");
        Ah().f(str, hn6Var);
    }

    @Override // defpackage.wk4
    public void S7() {
        un3.k(Kh());
    }

    @Override // defpackage.wk4
    public void U2(xj4 xj4Var, List<lm8> list) {
        z65.h(xj4Var, ProductEntity.TYPE_PIZZA);
        z65.h(list, "productTags");
        Ah().c(xj4Var, Th(list, xj4Var.j(), true));
    }

    @Override // defpackage.wk4
    public void Wa(List<? extends Object> list, b78 b78Var) {
        z65.h(list, "items");
        z65.h(b78Var, "pizzaConcept");
        Ch().setPositionsCount(list.size());
        un3.k(Ch());
        Oh(Hh(), fka.b, list, b78Var);
    }

    @Override // defpackage.wk4
    public void bd(final int i2) {
        Hh().post(new Runnable() { // from class: hk4
            @Override // java.lang.Runnable
            public final void run() {
                a.Wh(a.this, i2);
            }
        });
    }

    @Override // defpackage.wk4
    public void d2(hn6 hn6Var) {
        z65.h(hn6Var, "halvesTotalPrice");
        vh().setText(requireContext().getString(r09.constructor_build_pizza_with_price, un6.b(hn6Var)));
    }

    @Override // defpackage.wk4
    public void e7(hn6 hn6Var) {
        z65.h(hn6Var, "cost");
        Nh().setText(getString(r09.constructor_total_cost, un6.b(hn6Var)));
    }

    @Override // defpackage.wk4
    public void eb(wj4 wj4Var) {
        z65.h(wj4Var, "data");
        un3.e(zh());
        com.dodopizza.order.feature.halves.constructor.presentation.e a = com.dodopizza.order.feature.halves.constructor.presentation.e.k.a(wj4Var);
        a.nh(new o());
        a.show(getParentFragmentManager(), "ingredients_dialog");
    }

    @Override // defpackage.wk4
    public void ga(xj4 xj4Var, List<lm8> list) {
        z65.h(xj4Var, ProductEntity.TYPE_PIZZA);
        z65.h(list, "productTags");
        Ah().e(xj4Var, Uh(this, list, xj4Var.j(), false, 4, null));
    }

    @Override // defpackage.wk4
    public void j4() {
        un3.e(wh());
        un3.k(xh());
    }

    @Override // defpackage.wk4
    public void je(boolean z, hn6 hn6Var) {
        int i2;
        z65.h(hn6Var, "halvesTotalPrice");
        Button vh = vh();
        Context requireContext = requireContext();
        if (!z) {
            i2 = r09.constructor_build_pizza;
        } else {
            i2 = r09.not_available_now;
        }
        vh.setText(requireContext.getString(i2, un6.b(hn6Var)));
        vh.setEnabled(!z);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        dk4.b a = dk4.a.a();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
        if (obj != null && !(obj instanceof ek4)) {
            throw new ClassCastException("Property data has different class type");
        } else if (obj != null) {
            a.a((ek4) obj, (HalvesFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(HalvesFeatureDependencies.class))).a(this);
            super.onCreate(bundle);
        } else {
            throw new IllegalArgumentException("Argument with key = data not found in bundle");
        }
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Lh().setNavigationOnClickListener(new View.OnClickListener() { // from class: ik4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a.Sh(a.this, view2);
            }
        });
        Ph(Gh(), fka.a);
        Ph(Hh(), fka.b);
        Xh();
        oma.a(Jh(), new j());
        oma.a(vh(), new k());
        HalvesProgressButton Ih = Ih();
        String string = getString(r09.need_update_button);
        z65.g(string, "getString(...)");
        Ih.setText(string);
        Ih().setCheckNetwork(true);
        Ih().setListener(new l());
        Ah().setOnTagClickListener(new m());
    }

    @Override // defpackage.wk4
    public void rb(String str) {
        z65.h(str, "title");
        TextView Mh = Mh();
        if (str.length() <= 0) {
            str = getString(r09.halves_pizza_title);
        }
        Mh.setText(str);
    }

    @Override // defpackage.wk4
    public void s2(final int i2) {
        Gh().post(new Runnable() { // from class: gk4
            @Override // java.lang.Runnable
            public final void run() {
                a.Vh(a.this, i2);
            }
        });
    }

    @Override // defpackage.wk4
    public void showLoader() {
        un3.k(wh());
        un3.e(Jh());
        vh().setEnabled(false);
        un3.k(Fh());
        un3.e(xh());
    }

    @Override // defpackage.wk4
    public void u5(String str, hn6 hn6Var) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(hn6Var, "price");
        Ah().h(str, hn6Var);
    }

    @Override // defpackage.wk4
    public void ug(List<? extends Object> list, b78 b78Var) {
        z65.h(list, "items");
        z65.h(b78Var, "pizzaConcept");
        Bh().setPositionsCount(list.size());
        un3.k(Bh());
        Oh(Gh(), fka.a, list, b78Var);
    }

    @Override // defpackage.wk4
    public void w() {
        un3.e(Fh());
    }

    @Override // defpackage.wk4
    public void y8() {
        un3.k(zh());
    }

    @Override // defpackage.wk4
    public void z5(String str, hn6 hn6Var) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(hn6Var, "price");
        Ah().d(str, hn6Var);
    }
}
