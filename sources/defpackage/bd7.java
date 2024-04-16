package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.bumptech.glide.h;
import com.dodopizza.activeorder.feature.orderdetails.OrderDetailsFeatureDependencies;
import com.dodopizza.activeorder.feature.orderdetails.presentation.OrderDetailsPresenter;
import com.dodopizza.activeorder.feature.orderdetails.presentation.OrderSauceViewHolder;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k6;
import defpackage.yc7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: OrderDetailsFragment.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 p2\u00020\u00012\u00020\u0002:\u0001qB\t\b\u0000¢\u0006\u0004\bn\u0010oJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0016\u0010\u0010\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0016\u0010 \u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\rH\u0016J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0014H\u0016J\u0018\u0010%\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nH\u0016J\u0012\u0010'\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u001bH\u0016J\u001c\u0010*\u001a\u00020\u00052\b\u0010(\u001a\u0004\u0018\u00010\u001b2\b\u0010)\u001a\u0004\u0018\u00010\u001bH\u0016R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b=\u0010>R\u001b\u0010B\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010-\u001a\u0004\bA\u0010>R\u001b\u0010E\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010-\u001a\u0004\bD\u00104R\u001b\u0010I\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010-\u001a\u0004\bG\u0010HR\u001b\u0010L\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010-\u001a\u0004\bK\u0010HR\u001b\u0010\u0015\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010-\u001a\u0004\bN\u0010>R\u001b\u0010Q\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010-\u001a\u0004\bP\u0010>R\u001b\u0010T\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010-\u001a\u0004\bS\u0010>R\u001b\u0010W\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010-\u001a\u0004\bV\u0010>R\u001b\u0010Z\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010-\u001a\u0004\bY\u0010>R\u0016\u0010^\u001a\u00020[8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\\\u0010]R(\u0010g\u001a\b\u0012\u0004\u0012\u00020`0_8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR#\u0010m\u001a\n h*\u0004\u0018\u00010`0`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l¨\u0006r"}, d2 = {"Lbd7;", "Lf70;", "Lpd7;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "", "num", "setTitle", "", "Lhd7;", "goods", "A3", "Ljk7;", "orderType", "zf", "Lhn6;", "deliveryFee", "D0", "r0", "J", "total", "L0", "", "addressTextString", "D7", "Ljd7;", "sauces", "Nb", "cost", "eh", "saucesCount", "freeSaucesCount", "v2", "exactTime", "Oa", "timeFrom", "timeTo", "I8", "Landroidx/appcompat/widget/Toolbar;", com.huawei.hms.opendevice.c.a, "Lk79;", "zh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/recyclerview/widget/RecyclerView;", DateTokenConverter.CONVERTER_KEY, "vh", "()Landroidx/recyclerview/widget/RecyclerView;", "productsRecycler", "Landroid/widget/RelativeLayout;", com.huawei.hms.push.e.a, "xh", "()Landroid/widget/RelativeLayout;", "saucesListCount", "Landroid/widget/TextView;", "f", "ph", "()Landroid/widget/TextView;", "numSaucesTxt", "g", "Bh", "totalCostSaucesTxt", Image.TYPE_HIGH, "yh", "saucesRecycler", "i", "wh", "()Landroid/view/View;", "saucesLine", "j", "oh", "deliveryFeeSection", "k", "nh", "l", "Ah", "totalAmount", Image.TYPE_MEDIUM, "sh", "orderTypeTitle", "n", "qh", "orderAddress", "o", "rh", "orderStatus", "Lzd7;", "p", "Lzd7;", "orderGoodListAdapter", "Las8;", "Lcom/dodopizza/activeorder/feature/orderdetails/presentation/OrderDetailsPresenter;", "q", "Las8;", "uh", "()Las8;", "setPresenterProvider$activeorder_release", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "r", "Lmoxy/ktx/MoxyKtxDelegate;", "th", "()Lcom/dodopizza/activeorder/feature/orderdetails/presentation/OrderDetailsPresenter;", "presenter", "<init>", "()V", Image.TYPE_SMALL, "a", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bd7  reason: default package */
/* loaded from: classes.dex */
public final class bd7 extends f70 implements pd7 {
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
    private zd7 p;
    public as8<OrderDetailsPresenter> q;
    private final MoxyKtxDelegate r;
    static final /* synthetic */ je5<Object>[] t = {bc9.f(new ar8(bd7.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(bd7.class, "productsRecycler", "getProductsRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(bd7.class, "saucesListCount", "getSaucesListCount()Landroid/widget/RelativeLayout;", 0)), bc9.f(new ar8(bd7.class, "numSaucesTxt", "getNumSaucesTxt()Landroid/widget/TextView;", 0)), bc9.f(new ar8(bd7.class, "totalCostSaucesTxt", "getTotalCostSaucesTxt()Landroid/widget/TextView;", 0)), bc9.f(new ar8(bd7.class, "saucesRecycler", "getSaucesRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(bd7.class, "saucesLine", "getSaucesLine()Landroid/view/View;", 0)), bc9.f(new ar8(bd7.class, "deliveryFeeSection", "getDeliveryFeeSection()Landroid/view/View;", 0)), bc9.f(new ar8(bd7.class, "deliveryFee", "getDeliveryFee()Landroid/widget/TextView;", 0)), bc9.f(new ar8(bd7.class, "totalAmount", "getTotalAmount()Landroid/widget/TextView;", 0)), bc9.f(new ar8(bd7.class, "orderTypeTitle", "getOrderTypeTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(bd7.class, "orderAddress", "getOrderAddress()Landroid/widget/TextView;", 0)), bc9.f(new ar8(bd7.class, "orderStatus", "getOrderStatus()Landroid/widget/TextView;", 0)), bc9.f(new ar8(bd7.class, "presenter", "getPresenter()Lcom/dodopizza/activeorder/feature/orderdetails/presentation/OrderDetailsPresenter;", 0))};
    public static final a s = new a(null);

    /* compiled from: OrderDetailsFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lbd7$a;", "", "Lzc7;", "data", "Lbd7;", "a", "", "DIVIDER_PADDING", "I", "", "ORDER_ID", "Ljava/lang/String;", "<init>", "()V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: bd7$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final bd7 a(zc7 zc7Var) {
            z65.h(zc7Var, "data");
            return (bd7) y64.d(new bd7(), bi0.c(bi0.d("order_id", zc7Var.a())));
        }
    }

    /* compiled from: OrderDetailsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bd7$b */
    /* loaded from: classes.dex */
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

    /* compiled from: OrderDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/activeorder/feature/orderdetails/presentation/OrderDetailsPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/activeorder/feature/orderdetails/presentation/OrderDetailsPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bd7$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<OrderDetailsPresenter> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final OrderDetailsPresenter invoke() {
            return bd7.this.uh().get();
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bd7$d */
    /* loaded from: classes.dex */
    public static final class d extends ej5 implements Function1<Object, Boolean> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof jd7);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bd7$e */
    /* loaded from: classes.dex */
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
            Object newInstance = OrderSauceViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    public bd7() {
        super(rz8.fragment_order_card);
        this.c = kb0.e(this, ux8.o0);
        this.d = kb0.e(this, ux8.product_list);
        this.e = kb0.e(this, ux8.sauces_list_container);
        this.f = kb0.e(this, ux8.num_sauces_text);
        this.g = kb0.e(this, ux8.total_cost_sauces_text);
        this.h = kb0.e(this, ux8.sauces_list);
        this.i = kb0.e(this, ux8.sauces_line);
        this.j = kb0.e(this, ux8.y);
        this.k = kb0.e(this, ux8.x);
        this.l = kb0.e(this, ux8.total_amount);
        this.m = kb0.e(this, ux8.order_type_title);
        this.n = kb0.e(this, ux8.order_address);
        this.o = kb0.e(this, ux8.order_time);
        c cVar = new c();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.r = new MoxyKtxDelegate(mvpDelegate, OrderDetailsPresenter.class.getName() + ".presenter", cVar);
    }

    private final TextView Ah() {
        return (TextView) this.l.a(this, t[9]);
    }

    private final TextView Bh() {
        return (TextView) this.g.a(this, t[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ch(bd7 bd7Var, View view) {
        z65.h(bd7Var, "this$0");
        bd7Var.th().onBackPressed();
    }

    private final TextView nh() {
        return (TextView) this.k.a(this, t[8]);
    }

    private final View oh() {
        return (View) this.j.a(this, t[7]);
    }

    private final TextView ph() {
        return (TextView) this.f.a(this, t[3]);
    }

    private final TextView qh() {
        return (TextView) this.n.a(this, t[11]);
    }

    private final TextView rh() {
        return (TextView) this.o.a(this, t[12]);
    }

    private final TextView sh() {
        return (TextView) this.m.a(this, t[10]);
    }

    private final OrderDetailsPresenter th() {
        return (OrderDetailsPresenter) this.r.getValue(this, t[13]);
    }

    private final RecyclerView vh() {
        return (RecyclerView) this.d.a(this, t[1]);
    }

    private final View wh() {
        return (View) this.i.a(this, t[6]);
    }

    private final RelativeLayout xh() {
        return (RelativeLayout) this.e.a(this, t[2]);
    }

    private final RecyclerView yh() {
        return (RecyclerView) this.h.a(this, t[5]);
    }

    private final Toolbar zh() {
        return (Toolbar) this.c.a(this, t[0]);
    }

    @Override // defpackage.pd7
    public void A3(List<hd7> list) {
        z65.h(list, "goods");
        if (!list.isEmpty()) {
            zd7 zd7Var = this.p;
            if (zd7Var == null) {
                z65.z("orderGoodListAdapter");
                zd7Var = null;
            }
            zd7Var.l(list);
        }
    }

    @Override // defpackage.pd7
    public void D0(hn6 hn6Var) {
        z65.h(hn6Var, "deliveryFee");
        un3.k(oh());
        nh().setText(un6.b(hn6Var));
    }

    @Override // defpackage.pd7
    public void D7(String str) {
        z65.h(str, "addressTextString");
        qh().setText(str);
        un3.k(qh());
    }

    @Override // defpackage.pd7
    public void I8(String str, String str2) {
        rh().setText(getString(d19.delivery_time_interval2, str, str2));
        un3.k(rh());
    }

    @Override // defpackage.pd7
    public void J() {
        un3.e(oh());
    }

    @Override // defpackage.pd7
    public void L0(hn6 hn6Var) {
        z65.h(hn6Var, "total");
        Ah().setText(un6.b(hn6Var));
    }

    @Override // defpackage.pd7
    public void Nb(List<jd7> list) {
        z65.h(list, "sauces");
        if (!list.isEmpty()) {
            yh().setAdapter(new k6.a(new k6(list), d.a, new ki7(), e.a).b().d());
            un3.k(xh());
            un3.k(wh());
        }
    }

    @Override // defpackage.pd7
    public void Oa(String str) {
        rh().setText(str);
        un3.k(rh());
    }

    @Override // defpackage.pd7
    public void eh(hn6 hn6Var) {
        z65.h(hn6Var, "cost");
        if (hn6Var.d()) {
            un3.e(Bh());
        } else {
            Bh().setText(getString(d19.o, un6.b(hn6Var)));
        }
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        yc7.b a2 = yc7.a.a();
        OrderDetailsFeatureDependencies orderDetailsFeatureDependencies = (OrderDetailsFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(OrderDetailsFeatureDependencies.class));
        Bundle arguments = getArguments();
        String str = (arguments == null || (str = arguments.get("order_id")) == null) ? "" : "";
        if (str instanceof String) {
            a2.a(orderDetailsFeatureDependencies, (String) str).a(this);
            super.onCreate(bundle);
            return;
        }
        throw new ClassCastException("Property order_id has different class type");
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        zh().setNavigationOnClickListener(new View.OnClickListener() { // from class: ad7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                bd7.Ch(bd7.this, view2);
            }
        });
        h v = com.bumptech.glide.b.v(this);
        z65.g(v, "with(...)");
        this.p = new zd7(v);
        RecyclerView vh = vh();
        zd7 zd7Var = this.p;
        if (zd7Var == null) {
            z65.z("orderGoodListAdapter");
            zd7Var = null;
        }
        vh.setAdapter(zd7Var);
        vh().addItemDecoration(new eyb(6, 0, 0, 6, null));
        vh().setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        vh().setNestedScrollingEnabled(false);
        un3.e(wh());
        un3.e(xh());
    }

    @Override // defpackage.pd7
    public void r0() {
        un3.k(oh());
        nh().setText(getString(d19.m));
    }

    @Override // defpackage.pd7
    public void setTitle(int i) {
        zh().setTitle(getString(d19.order_num_title, Integer.valueOf(i)));
    }

    public final as8<OrderDetailsPresenter> uh() {
        as8<OrderDetailsPresenter> as8Var = this.q;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.pd7
    public void v2(int i, int i2) {
        String string;
        if (i2 < i) {
            string = getString(d19.sauces_count_with_nonfree, Integer.valueOf(i), Integer.valueOf(i2));
            z65.e(string);
        } else {
            string = getString(d19.sauces_all_free);
            z65.e(string);
        }
        ph().setText(string);
        un3.k(ph());
    }

    @Override // defpackage.pd7
    public void zf(jk7 jk7Var) {
        int i;
        z65.h(jk7Var, "orderType");
        un3.k(sh());
        TextView sh = sh();
        int i2 = b.$EnumSwitchMapping$0[jk7Var.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    i = d19.pickup_delivery;
                } else {
                    throw new IllegalStateException(("Order type " + jk7Var + " is not supported").toString());
                }
            } else {
                i = d19.M;
            }
        } else {
            i = d19.i;
        }
        sh.setText(getString(i));
    }
}
