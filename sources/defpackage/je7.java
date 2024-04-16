package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.InfoMessage;
import com.dodopizza.orderhistory.feature.orderhistory.OrderHistoryFeatureDependencies;
import com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.OrderHistoryDetailsPresenter;
import com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.adapter.ComboOrderItemVH;
import com.dodopizza.orderhistory.feature.orderhistory.presentation.orderhistorydetails.adapter.SimpleOrderItemVH;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ee7;
import defpackage.k4a;
import defpackage.k6;
import defpackage.xf7;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: OrderHistoryDetailsFragment.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 u2\u00020\u00012\u00020\u0002:\u0001vB\u0007¢\u0006\u0004\bs\u0010tJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u000eH\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0003H\u0016J\b\u0010 \u001a\u00020\u0005H\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J\u0016\u0010%\u001a\u00020\u00052\f\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0016J\u0016\u0010(\u001a\u00020\u00052\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\"H\u0016J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0011H\u0016J\b\u0010+\u001a\u00020\u0005H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\b\u0010-\u001a\u00020\u0005H\u0016R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00107R\u001b\u0010<\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b:\u0010;R\u001b\u0010)\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u00100\u001a\u0004\b?\u0010@R\u001b\u0010C\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u00100\u001a\u0004\bB\u0010@R\u001b\u0010F\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u00100\u001a\u0004\bE\u0010@R\u001b\u0010\u0017\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u00100\u001a\u0004\bH\u0010@R\u001b\u0010K\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u00100\u001a\u0004\bJ\u0010@R\u001b\u0010N\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u00100\u001a\u0004\bM\u0010;R\u001b\u0010Q\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u00100\u001a\u0004\bP\u0010;R\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u00100\u001a\u0004\bT\u0010UR\u001b\u0010Y\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u00100\u001a\u0004\bX\u0010@R\u001b\u0010\\\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u00100\u001a\u0004\b[\u0010;R\"\u0010d\u001a\u00020]8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR(\u0010m\u001a\b\u0012\u0004\u0012\u00020f0e8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR#\u0010r\u001a\n n*\u0004\u0018\u00010f0f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010o\u001a\u0004\bp\u0010q¨\u0006w"}, d2 = {"Lje7;", "Lf70;", "Lse7;", "", "isLoading", "", "Gh", "Hh", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "", "title", "r", "Lhn6;", "price", "J0", "Ljk7;", MessageAttributes.TYPE, "M1", "address", "A0", "date", "p8", "b", "w", "U", "isVisible", "j5", "uc", "Od", "", "Lz21;", "checks", "s3", "Lxf7;", "orderItems", "n9", "deliveryFee", "D0", "r0", "J", "ic", "Landroidx/appcompat/widget/Toolbar;", com.huawei.hms.opendevice.c.a, "Lk79;", "Eh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/recyclerview/widget/RecyclerView;", DateTokenConverter.CONVERTER_KEY, "Ch", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", com.huawei.hms.push.e.a, "th", "()Landroid/view/View;", "deliveryFeeSection", "Landroid/widget/TextView;", "f", "sh", "()Landroid/widget/TextView;", "g", "yh", "orderPrice", Image.TYPE_HIGH, "uh", "deliveryType", "i", "ph", "j", "xh", "orderDate", "k", "Dh", "repeatOrderButton", "l", "wh", "loader", "Lcom/dodopizza/android/view/custom/InfoMessage;", Image.TYPE_MEDIUM, "vh", "()Lcom/dodopizza/android/view/custom/InfoMessage;", "infoMessage", "n", "qh", "check", "o", "rh", "checkLoader", "Lg78;", "p", "Lg78;", "zh", "()Lg78;", "setPizzaDoughNameFormatter", "(Lg78;)V", "pizzaDoughNameFormatter", "Las8;", "Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistorydetails/OrderHistoryDetailsPresenter;", "q", "Las8;", "Bh", "()Las8;", "setPresenterProvider$orderhistory_release", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "Lmoxy/ktx/MoxyKtxDelegate;", "Ah", "()Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistorydetails/OrderHistoryDetailsPresenter;", "presenter", "<init>", "()V", Image.TYPE_SMALL, "a", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: je7  reason: default package */
/* loaded from: classes2.dex */
public final class je7 extends f70 implements se7 {
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
    public g78 p;
    public as8<OrderHistoryDetailsPresenter> q;
    private final MoxyKtxDelegate r;
    static final /* synthetic */ je5<Object>[] t = {bc9.f(new ar8(je7.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(je7.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(je7.class, "deliveryFeeSection", "getDeliveryFeeSection()Landroid/view/View;", 0)), bc9.f(new ar8(je7.class, "deliveryFee", "getDeliveryFee()Landroid/widget/TextView;", 0)), bc9.f(new ar8(je7.class, "orderPrice", "getOrderPrice()Landroid/widget/TextView;", 0)), bc9.f(new ar8(je7.class, "deliveryType", "getDeliveryType()Landroid/widget/TextView;", 0)), bc9.f(new ar8(je7.class, "address", "getAddress()Landroid/widget/TextView;", 0)), bc9.f(new ar8(je7.class, "orderDate", "getOrderDate()Landroid/widget/TextView;", 0)), bc9.f(new ar8(je7.class, "repeatOrderButton", "getRepeatOrderButton()Landroid/view/View;", 0)), bc9.f(new ar8(je7.class, "loader", "getLoader()Landroid/view/View;", 0)), bc9.f(new ar8(je7.class, "infoMessage", "getInfoMessage()Lcom/dodopizza/android/view/custom/InfoMessage;", 0)), bc9.f(new ar8(je7.class, "check", "getCheck()Landroid/widget/TextView;", 0)), bc9.f(new ar8(je7.class, "checkLoader", "getCheckLoader()Landroid/view/View;", 0)), bc9.f(new ar8(je7.class, "presenter", "getPresenter()Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistorydetails/OrderHistoryDetailsPresenter;", 0))};
    public static final a s = new a(null);

    /* compiled from: OrderHistoryDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lje7$a;", "", "Lae7;", "orderHistory", "", "position", "Lje7;", "a", "", "ARG_KEY_ORDER_HISTORY", "Ljava/lang/String;", "ARG_KEY_POSITION", "CHECK_LOAD_ERROR", "<init>", "()V", "orderhistory_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: je7$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final je7 a(ae7 ae7Var, int i) {
            z65.h(ae7Var, "orderHistory");
            return (je7) y64.d(new je7(), bi0.c(bi0.d("arg_key_order_history", ae7Var), bi0.d("position", Integer.valueOf(i))));
        }
    }

    /* compiled from: OrderHistoryDetailsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: je7$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[jk7.values().length];
            try {
                iArr[jk7.e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jk7.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[jk7.f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: OrderHistoryDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: je7$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            je7.this.Ah().C();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: OrderHistoryDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: je7$d */
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            je7.this.Ah().A();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: OrderHistoryDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistorydetails/OrderHistoryDetailsPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/orderhistory/feature/orderhistory/presentation/orderhistorydetails/OrderHistoryDetailsPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: je7$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function0<OrderHistoryDetailsPresenter> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OrderHistoryDetailsPresenter invoke() {
            return je7.this.Bh().get();
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: je7$f */
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
            return Boolean.valueOf(obj instanceof xf7.b);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: je7$g */
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
            Object newInstance = SimpleOrderItemVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: je7$h */
    /* loaded from: classes2.dex */
    public static final class h extends ej5 implements Function1<Object, Boolean> {
        public static final h a = new h();

        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof xf7.a);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: je7$i */
    /* loaded from: classes2.dex */
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
            Object newInstance = ComboOrderItemVH.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    public je7() {
        super(hz8.fragment_order_history_details);
        this.c = kb0.e(this, hy8.H);
        this.d = kb0.e(this, hy8.D);
        this.e = kb0.e(this, hy8.f);
        this.f = kb0.e(this, hy8.delivery_fee);
        this.g = kb0.e(this, hy8.order_price);
        this.h = kb0.e(this, hy8.delivery_type);
        this.i = kb0.e(this, hy8.a);
        this.j = kb0.e(this, hy8.order_time_value);
        this.k = kb0.e(this, hy8.repeat_order_button);
        this.l = kb0.e(this, hy8.n);
        this.m = kb0.e(this, hy8.k);
        this.n = kb0.e(this, hy8.check);
        this.o = kb0.e(this, hy8.checkLoader);
        e eVar = new e();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.r = new MoxyKtxDelegate(mvpDelegate, OrderHistoryDetailsPresenter.class.getName() + ".presenter", eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderHistoryDetailsPresenter Ah() {
        return (OrderHistoryDetailsPresenter) this.r.getValue(this, t[13]);
    }

    private final RecyclerView Ch() {
        return (RecyclerView) this.d.a(this, t[1]);
    }

    private final View Dh() {
        return (View) this.k.a(this, t[8]);
    }

    private final Toolbar Eh() {
        return (Toolbar) this.c.a(this, t[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Fh(je7 je7Var, View view) {
        z65.h(je7Var, "this$0");
        je7Var.Ah().onBackPressed();
    }

    private final void Gh(boolean z) {
        un3.o(qh(), !z);
        un3.o(rh(), z);
    }

    private final void Hh(boolean z) {
        un3.o(Dh(), !z);
        un3.o(wh(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ih(je7 je7Var, k4a k4aVar, z21 z21Var) {
        z65.h(je7Var, "this$0");
        z65.h(k4aVar, "$this_apply");
        z65.h(z21Var, "it");
        je7Var.Ah().B(z21Var);
        k4aVar.dismiss();
    }

    private final TextView ph() {
        return (TextView) this.i.a(this, t[6]);
    }

    private final TextView qh() {
        return (TextView) this.n.a(this, t[11]);
    }

    private final View rh() {
        return (View) this.o.a(this, t[12]);
    }

    private final TextView sh() {
        return (TextView) this.f.a(this, t[3]);
    }

    private final View th() {
        return (View) this.e.a(this, t[2]);
    }

    private final TextView uh() {
        return (TextView) this.h.a(this, t[5]);
    }

    private final InfoMessage vh() {
        return (InfoMessage) this.m.a(this, t[10]);
    }

    private final View wh() {
        return (View) this.l.a(this, t[9]);
    }

    private final TextView xh() {
        return (TextView) this.j.a(this, t[7]);
    }

    private final TextView yh() {
        return (TextView) this.g.a(this, t[4]);
    }

    @Override // defpackage.se7
    public void A0(String str) {
        z65.h(str, "address");
        ph().setText(str);
    }

    public final as8<OrderHistoryDetailsPresenter> Bh() {
        as8<OrderHistoryDetailsPresenter> as8Var = this.q;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.se7
    public void D0(hn6 hn6Var) {
        z65.h(hn6Var, "deliveryFee");
        un3.k(th());
        sh().setText(un6.b(hn6Var));
    }

    @Override // defpackage.se7
    public void J() {
        un3.e(th());
    }

    @Override // defpackage.se7
    public void J0(hn6 hn6Var) {
        z65.h(hn6Var, "price");
        yh().setText(getString(s09.order_price_label_with_amount, un6.b(hn6Var)));
    }

    @Override // defpackage.se7
    public void M1(jk7 jk7Var) {
        int i2;
        z65.h(jk7Var, MessageAttributes.TYPE);
        TextView uh = uh();
        int i3 = b.$EnumSwitchMapping$0[jk7Var.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    i2 = s09.n;
                } else {
                    throw new IllegalStateException(("Order type " + jk7Var + " is not supported").toString());
                }
            } else {
                i2 = s09.n;
            }
        } else {
            i2 = s09.d;
        }
        uh.setText(getString(i2));
    }

    @Override // defpackage.se7
    public void Od() {
        Gh(false);
    }

    @Override // defpackage.se7
    public void U() {
        vh().h(s09.repeat_order_error, 2000);
    }

    @Override // defpackage.se7
    public void b() {
        Hh(true);
    }

    @Override // defpackage.se7
    public void ic() {
        String string = getString(s09.e);
        z65.g(string, "getString(...)");
        String string2 = getString(s09.close);
        z65.g(string2, "getString(...)");
        tj1.e.a(string, "", string2, "check_load_error").show(getChildFragmentManager(), "check_load_error");
    }

    @Override // defpackage.se7
    public void j5(boolean z) {
        un3.o(qh(), z);
    }

    @Override // defpackage.se7
    public void n9(List<? extends xf7> list) {
        z65.h(list, "orderItems");
        Ch().setAdapter(new k6.a(new k6.a(new k6(list), f.a, new ola(zh()), g.a).b(), h.a, new qh1(zh()), i.a).b().d());
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Object obj;
        Object obj2;
        ee7.a c2 = sg2.a().c((OrderHistoryFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(OrderHistoryFeatureDependencies.class)));
        Bundle arguments = getArguments();
        Integer num = null;
        if (arguments == null || (obj = arguments.get("arg_key_order_history")) == null) {
            obj = null;
        }
        if (obj != null && !(obj instanceof ae7)) {
            throw new ClassCastException("Property arg_key_order_history has different class type");
        } else if (obj != null) {
            ee7.a d2 = c2.d((ae7) obj);
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (obj2 = arguments2.get("position")) != null) {
                num = obj2;
            }
            if (num != null && !(num instanceof Integer)) {
                throw new ClassCastException("Property position has different class type");
            } else if (num != null) {
                d2.b(num.intValue()).a().a(this);
                super.onCreate(bundle);
            } else {
                throw new IllegalArgumentException("Argument with key = position not found in bundle");
            }
        } else {
            throw new IllegalArgumentException("Argument with key = arg_key_order_history not found in bundle");
        }
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Eh().setNavigationOnClickListener(new View.OnClickListener() { // from class: he7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                je7.Fh(je7.this, view2);
            }
        });
        syb.H0(Ch(), false);
        Ch().setLayoutManager(new LinearLayoutManager(getContext()));
        oma.a(Dh(), new c());
        oma.a(qh(), new d());
    }

    @Override // defpackage.se7
    public void p8(String str) {
        z65.h(str, "date");
        xh().setText(str);
    }

    @Override // defpackage.se7
    public void r(String str) {
        z65.h(str, "title");
        Eh().setTitle(requireContext().getString(s09.order_history_number_title, str));
    }

    @Override // defpackage.se7
    public void r0() {
        un3.k(th());
        sh().setText(getString(s09.f));
    }

    @Override // defpackage.se7
    public void s3(List<z21> list) {
        z65.h(list, "checks");
        final k4a a2 = k4a.g.a(list);
        a2.rh(new k4a.b() { // from class: ie7
            @Override // defpackage.k4a.b
            public final void a(z21 z21Var) {
                je7.Ih(je7.this, a2, z21Var);
            }
        });
        a2.show(getParentFragmentManager(), (String) null);
    }

    @Override // defpackage.se7
    public void uc() {
        Gh(true);
    }

    @Override // defpackage.se7
    public void w() {
        Hh(false);
    }

    public final g78 zh() {
        g78 g78Var = this.p;
        if (g78Var != null) {
            return g78Var;
        }
        z65.z("pizzaDoughNameFormatter");
        return null;
    }
}
