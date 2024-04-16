package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.personalprice.PersonalPriceBadgeView;
import com.dodopizza.order.feature.product.card.presentation.shoppingitem.ProductCardBottomView;
import com.dodopizza.order.feature.product.card.presentation.shoppingitem.ShoppingItemNavigationBar;
import com.dodopizza.order.feature.product.card.presentation.view.ExpandableFoodValueInfoIconView;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.goa;
import defpackage.ym;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.MvpPresenter;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.modules.presentation.product.card.snack.SnackProductCardFeatureDependencies;
import ru.dodopizza.app.presentation.product.card.snacks.SnackProductCardPresenter;
/* compiled from: SnackProductCardFragment.kt */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 c2\u00020\u00012\u00020\u0002:\u0001dB\u0007¢\u0006\u0004\ba\u0010bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0010H\u0016J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\u0010\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0016J\b\u0010#\u001a\u00020\u0005H\u0016J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u001dH\u0016R\u001b\u0010+\u001a\u00020&8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010(\u001a\u0004\b8\u00109R\u001b\u0010=\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010(\u001a\u0004\b<\u0010/R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010(\u001a\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010(\u001a\u0004\bE\u0010FR\u001b\u0010J\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010(\u001a\u0004\bI\u0010/R\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR(\u0010[\u001a\b\u0012\u0004\u0012\u00020T0S8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001b\u0010`\u001a\u00020T8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_¨\u0006e"}, d2 = {"Lioa;", "Lb2;", "Lqoa;", "Lfoa;", "snackInfoVO", "", "yh", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "onResume", "m4", "me", "Lkm8;", "productSize", "E3", "", "portionSize", "Tb", "U1", "Dc", "price", "J9", "Lhn6;", "rawPrice", "actualPrice", "C2", "p", "N", "", "isEnabled", "I", "", "timeRemain", "x", "E", "loyaltyEnable", "I5", "Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ShoppingItemNavigationBar;", com.huawei.hms.opendevice.c.a, "Lk79;", "mh", "()Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ShoppingItemNavigationBar;", "navigationBar", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "xh", "()Landroid/widget/TextView;", "title", "Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ProductCardBottomView;", e.a, "oh", "()Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ProductCardBottomView;", "bottomView", "Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", "f", "qh", "()Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", "infoIcon", "g", "ph", "compositionDescription", "Lcom/dodopizza/order/feature/personalprice/PersonalPriceBadgeView;", Image.TYPE_HIGH, "sh", "()Lcom/dodopizza/order/feature/personalprice/PersonalPriceBadgeView;", "personalPriceBadge", "Landroid/widget/ImageView;", "i", "rh", "()Landroid/widget/ImageView;", "itemImage", "j", "vh", "snackSize", "Lu18;", "k", "Lu18;", "wh", "()Lu18;", "setTimerFormatter", "(Lu18;)V", "timerFormatter", "Las8;", "Lru/dodopizza/app/presentation/product/card/snacks/SnackProductCardPresenter;", "l", "Las8;", "uh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", Image.TYPE_MEDIUM, "Lmoxy/ktx/MoxyKtxDelegate;", "th", "()Lru/dodopizza/app/presentation/product/card/snacks/SnackProductCardPresenter;", "presenter", "<init>", "()V", "n", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ioa  reason: default package */
/* loaded from: classes4.dex */
public final class ioa extends b2 implements qoa {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final k79 j;
    public u18 k;
    public as8<SnackProductCardPresenter> l;
    private final MoxyKtxDelegate m;
    static final /* synthetic */ je5<Object>[] o = {bc9.f(new ar8(ioa.class, "navigationBar", "getNavigationBar()Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ShoppingItemNavigationBar;", 0)), bc9.f(new ar8(ioa.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ioa.class, "bottomView", "getBottomView()Lcom/dodopizza/order/feature/product/card/presentation/shoppingitem/ProductCardBottomView;", 0)), bc9.f(new ar8(ioa.class, "infoIcon", "getInfoIcon()Lcom/dodopizza/order/feature/product/card/presentation/view/ExpandableFoodValueInfoIconView;", 0)), bc9.f(new ar8(ioa.class, "compositionDescription", "getCompositionDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ioa.class, "personalPriceBadge", "getPersonalPriceBadge()Lcom/dodopizza/order/feature/personalprice/PersonalPriceBadgeView;", 0)), bc9.f(new ar8(ioa.class, "itemImage", "getItemImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(ioa.class, "snackSize", "getSnackSize()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ioa.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/product/card/snacks/SnackProductCardPresenter;", 0))};
    public static final a n = new a(null);

    /* compiled from: SnackProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, d2 = {"Lioa$a;", "", "Lhoa;", "arguments", "Lioa;", "a", "", "ARG_IS_HERO", "Ljava/lang/String;", "ARG_MENU_ITEM_ID", "ARG_MENU_ITEM_ID_V5", "ARG_POSITION_IN_MENU", "ARG_SCREEN", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ioa$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ioa a(hoa hoaVar) {
            z65.h(hoaVar, "arguments");
            return (ioa) y64.d(new ioa(), bi0.c(bi0.d("arg_menu_item_id", hoaVar.a()), bi0.d("arg_menu_item_id_v5", hoaVar.b()), bi0.d("arg_screen", hoaVar.d()), bi0.d("arg_position_in_menu", Integer.valueOf(hoaVar.c())), bi0.d("arg_is_hero", Boolean.valueOf(hoaVar.e()))));
        }
    }

    /* compiled from: SnackProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/product/card/snacks/SnackProductCardPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/product/card/snacks/SnackProductCardPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ioa$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<SnackProductCardPresenter> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SnackProductCardPresenter invoke() {
            return ioa.this.uh().get();
        }
    }

    /* compiled from: SnackProductCardFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ioa$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ foa b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(foa foaVar) {
            super(0);
            this.b = foaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SnackProductCardPresenter nh = ioa.this.nh();
            foa foaVar = this.b;
            Bundle arguments = ioa.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("arg_is_hero")) == null) ? null : null;
            if (obj != null && !(obj instanceof Boolean)) {
                throw new ClassCastException("Property arg_is_hero has different class type");
            } else if (obj != null) {
                nh.C(foaVar, ((Boolean) obj).booleanValue());
            } else {
                throw new IllegalArgumentException("Argument with key = arg_is_hero not found in bundle");
            }
        }
    }

    public ioa() {
        super(R.layout.fragment_snack_product_card);
        this.c = kb0.e(this, R.id.snack_card_item_navigation_bar);
        this.d = kb0.e(this, R.id.snack_card_title);
        this.e = kb0.e(this, R.id.snack_card_bottom_shopping_bar);
        this.f = kb0.e(this, R.id.snack_card_info_icon);
        this.g = kb0.e(this, R.id.snack_card_composition_description);
        this.h = kb0.e(this, R.id.snack_discount_badge);
        this.i = kb0.e(this, R.id.snack_card_item_image);
        this.j = kb0.e(this, R.id.snack_card_size_title);
        b bVar = new b();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.m = new MoxyKtxDelegate(mvpDelegate, SnackProductCardPresenter.class.getName() + ".presenter", bVar);
    }

    private final ProductCardBottomView oh() {
        return (ProductCardBottomView) this.e.a(this, o[2]);
    }

    private final TextView ph() {
        return (TextView) this.g.a(this, o[4]);
    }

    private final ExpandableFoodValueInfoIconView qh() {
        return (ExpandableFoodValueInfoIconView) this.f.a(this, o[3]);
    }

    private final ImageView rh() {
        return (ImageView) this.i.a(this, o[6]);
    }

    private final PersonalPriceBadgeView sh() {
        return (PersonalPriceBadgeView) this.h.a(this, o[5]);
    }

    private final TextView vh() {
        return (TextView) this.j.a(this, o[7]);
    }

    private final void yh(foa foaVar) {
        com.bumptech.glide.b.t(requireContext()).t(foaVar.g()).a0(ff4.a()).o0(new xt0()).G0(rh());
    }

    @Override // defpackage.qoa
    public void C2(hn6 hn6Var, hn6 hn6Var2) {
        z65.h(hn6Var, "rawPrice");
        z65.h(hn6Var2, "actualPrice");
        ProductCardBottomView oh = oh();
        String b2 = un6.b(hn6Var);
        String b3 = un6.b(hn6Var2);
        String string = getString(R.string.add_to_cart_button);
        z65.g(string, "getString(...)");
        oh.e(b2, b3, string);
    }

    @Override // defpackage.qoa
    public void Dc() {
        un3.e(qh());
    }

    @Override // defpackage.qoa
    public void E() {
        PersonalPriceBadgeView sh = sh();
        String string = getString(R.string.personal_price_badge_discount_expired);
        z65.g(string, "getString(...)");
        sh.setDiscountText(string);
        sh().a();
    }

    @Override // defpackage.qoa
    public void E3(km8 km8Var) {
        z65.h(km8Var, "productSize");
        vh().setText(getResources().getString(R.string.size, km8Var.getValue(), getResources().getString(pb6.a(nb6.a.a(Integer.parseInt(km8Var.a()))).a())));
    }

    @Override // defpackage.qoa
    public void I(boolean z) {
        sh().setEnabled(z);
    }

    @Override // defpackage.jl8
    public void I5(boolean z) {
        if (z) {
            oh().g();
        } else {
            oh().h();
        }
    }

    @Override // defpackage.qoa
    public void J9(String str) {
        z65.h(str, "price");
        String string = requireContext().getString(R.string.add_to_cart_button_title, str);
        z65.g(string, "getString(...)");
        oh().c(string);
    }

    @Override // defpackage.qoa
    public void N() {
        un3.e(sh());
    }

    @Override // defpackage.qoa
    public void Tb(String str) {
        z65.h(str, "portionSize");
        TextView vh = vh();
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        vh.setText(ql8.d(str, requireContext));
    }

    @Override // defpackage.qoa
    public void U1() {
        un3.e(vh());
    }

    @Override // defpackage.qoa
    public void m4(foa foaVar) {
        z65.h(foaVar, "snackInfoVO");
        xh().setText(foaVar.h());
        ph().setText(foaVar.c());
        yh(foaVar);
        nh().A(foaVar);
        oh().a(new c(foaVar));
        if (foaVar.l()) {
            oh().f();
        }
    }

    @Override // defpackage.qoa
    public void me(foa foaVar) {
        List e;
        z65.h(foaVar, "snackInfoVO");
        un3.k(qh());
        ExpandableFoodValueInfoIconView qh = qh();
        e = jc1.e(new ExpandableFoodValueInfoIconView.c(foaVar.h(), foaVar.e(), foaVar.a(), foaVar.b()));
        ExpandableFoodValueInfoIconView.u(qh, e, false, 2, null);
    }

    @Override // defpackage.b2
    public ShoppingItemNavigationBar mh() {
        return (ShoppingItemNavigationBar) this.c.a(this, o[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Object obj;
        Object obj2;
        boolean z;
        Object obj3;
        Set<String> keySet;
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        goa.b a2 = goa.a.a();
        SnackProductCardFeatureDependencies snackProductCardFeatureDependencies = (SnackProductCardFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(SnackProductCardFeatureDependencies.class));
        Bundle arguments = getArguments();
        ym.d dVar = null;
        if (arguments == null || (obj = arguments.get("arg_menu_item_id")) == null) {
            obj = null;
        }
        if (obj != null && !(obj instanceof String)) {
            throw new ClassCastException("Property arg_menu_item_id has different class type");
        } else if (obj != null) {
            String str = (String) obj;
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (obj2 = arguments2.get("arg_menu_item_id_v5")) == null) {
                obj2 = null;
            }
            Bundle arguments3 = getArguments();
            if (arguments3 != null && (keySet = arguments3.keySet()) != null) {
                z = keySet.contains("arg_menu_item_id_v5");
            } else {
                z = false;
            }
            if (obj2 != null && !(obj2 instanceof String)) {
                throw new ClassCastException("Property arg_menu_item_id_v5 has different class type");
            } else if (obj2 == null && !z) {
                throw new IllegalArgumentException("Argument with key = arg_menu_item_id_v5 not found in bundle");
            } else {
                String str2 = (String) obj2;
                Bundle arguments4 = getArguments();
                if (arguments4 != null && (obj3 = arguments4.get("arg_screen")) != null) {
                    dVar = obj3;
                }
                if (dVar != null && !(dVar instanceof ym.d)) {
                    throw new ClassCastException("Property arg_screen has different class type");
                } else if (dVar != null) {
                    a2.a(snackProductCardFeatureDependencies, str, str2, dVar).a(this);
                    super.onAttach(context);
                } else {
                    throw new IllegalArgumentException("Argument with key = arg_screen not found in bundle");
                }
            }
        } else {
            throw new IllegalArgumentException("Argument with key = arg_menu_item_id not found in bundle");
        }
    }

    @Override // defpackage.f70, moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onResume() {
        Object obj;
        Object obj2;
        super.onResume();
        SnackProductCardPresenter nh = nh();
        Bundle arguments = getArguments();
        Boolean bool = null;
        if (arguments == null || (obj = arguments.get("arg_position_in_menu")) == null) {
            obj = null;
        }
        if (obj != null && !(obj instanceof Integer)) {
            throw new ClassCastException("Property arg_position_in_menu has different class type");
        } else if (obj != null) {
            int intValue = ((Integer) obj).intValue();
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (obj2 = arguments2.get("arg_is_hero")) != null) {
                bool = obj2;
            }
            if (bool != null && !(bool instanceof Boolean)) {
                throw new ClassCastException("Property arg_is_hero has different class type");
            } else if (bool != null) {
                nh.K(intValue, bool.booleanValue());
            } else {
                throw new IllegalArgumentException("Argument with key = arg_is_hero not found in bundle");
            }
        } else {
            throw new IllegalArgumentException("Argument with key = arg_position_in_menu not found in bundle");
        }
    }

    @Override // defpackage.qoa
    public void p() {
        PersonalPriceBadgeView sh = sh();
        String string = getString(R.string.discount);
        z65.g(string, "getString(...)");
        sh.setDiscountText(string);
        un3.k(sh());
    }

    @Override // defpackage.b2
    /* renamed from: th */
    public SnackProductCardPresenter nh() {
        MvpPresenter value = this.m.getValue(this, o[8]);
        z65.g(value, "getValue(...)");
        return (SnackProductCardPresenter) value;
    }

    public final as8<SnackProductCardPresenter> uh() {
        as8<SnackProductCardPresenter> as8Var = this.l;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    public final u18 wh() {
        u18 u18Var = this.k;
        if (u18Var != null) {
            return u18Var;
        }
        z65.z("timerFormatter");
        return null;
    }

    @Override // defpackage.qoa
    public void x(long j) {
        PersonalPriceBadgeView sh = sh();
        u18 wh = wh();
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        sh.setTimeRemain(wh.a(requireContext, j));
    }

    public TextView xh() {
        return (TextView) this.d.a(this, o[1]);
    }
}
