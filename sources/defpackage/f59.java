package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.controlling.feature.ratingapplied.RatingAppliedFeatureDependencies;
import com.dodopizza.controlling.feature.ratingapplied.presentation.PromoActionViewHolder;
import com.dodopizza.controlling.feature.ratingapplied.presentation.RatingAppliedPresenter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.d59;
import defpackage.k6;
import defpackage.tmb;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: RatingAppliedFragment.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00015B\u0007¢\u0006\u0004\b2\u00103J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016R\u001b\u0010\u001c\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001e\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010'R\u001b\u0010+\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0019\u001a\u0004\b*\u0010\u001bR\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00066"}, d2 = {"Lf59;", "Lf70;", "Ll59;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Lvm9;", "data", Image.TYPE_SMALL, "", "visible", "H", "Ud", "Lay1;", tmb.c.COUNTRY_JSON_NAME, "uf", "", RemoteMessageConst.Notification.URL, DateTokenConverter.CONVERTER_KEY, "Z", "ua", com.huawei.hms.opendevice.c.a, "Lk79;", "nh", "()Landroid/view/View;", "closeButton", "oh", "contactMeConfirmation", "Landroidx/recyclerview/widget/RecyclerView;", com.huawei.hms.push.e.a, "rh", "()Landroidx/recyclerview/widget/RecyclerView;", "promoList", "Landroid/widget/Button;", "f", "ph", "()Landroid/widget/Button;", "doneButton", "g", "sh", "rnDigitalCard", "Lcom/dodopizza/controlling/feature/ratingapplied/presentation/RatingAppliedPresenter;", Image.TYPE_HIGH, "Lmoxy/ktx/MoxyKtxDelegate;", "qh", "()Lcom/dodopizza/controlling/feature/ratingapplied/presentation/RatingAppliedPresenter;", "presenter", "<init>", "()V", "i", "a", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: f59  reason: default package */
/* loaded from: classes.dex */
public final class f59 extends f70 implements l59 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final MoxyKtxDelegate h;
    static final /* synthetic */ je5<Object>[] j = {bc9.f(new ar8(f59.class, "closeButton", "getCloseButton()Landroid/view/View;", 0)), bc9.f(new ar8(f59.class, "contactMeConfirmation", "getContactMeConfirmation()Landroid/view/View;", 0)), bc9.f(new ar8(f59.class, "promoList", "getPromoList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(f59.class, "doneButton", "getDoneButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(f59.class, "rnDigitalCard", "getRnDigitalCard()Landroid/view/View;", 0)), bc9.f(new ar8(f59.class, "presenter", "getPresenter()Lcom/dodopizza/controlling/feature/ratingapplied/presentation/RatingAppliedPresenter;", 0))};
    public static final a i = new a(null);

    /* compiled from: RatingAppliedFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lf59$a;", "", "Le59;", "data", "Lf59;", "a", "", "EXTRA_KEY_CONTACT_ME_CHECKED", "Ljava/lang/String;", "EXTRA_KEY_ORDER_ID", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: f59$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f59 a(e59 e59Var) {
            z65.h(e59Var, "data");
            return (f59) y64.d(new f59(), bi0.c(bi0.d("extra_key_order_id", e59Var.b()), bi0.d("extra_key_contact_me_checked", Boolean.valueOf(e59Var.a()))));
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f59$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function1<Object, Boolean> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof mp8);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f59$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final c a = new c();

        public c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = PromoActionViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: RatingAppliedFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmp8;", "promoVO", "", "a", "(Lmp8;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f59$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function1<mp8, Unit> {
        d() {
            super(1);
        }

        public final void a(mp8 mp8Var) {
            z65.h(mp8Var, "promoVO");
            f59.this.qh().s(mp8Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(mp8 mp8Var) {
            a(mp8Var);
            return Unit.a;
        }
    }

    /* compiled from: RatingAppliedFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f59$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function1<View, Unit> {
        e() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            f59.this.qh().r();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: RatingAppliedFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f59$f */
    /* loaded from: classes.dex */
    static final class f extends ej5 implements Function1<View, Unit> {
        f() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            f59.this.qh().t();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: RatingAppliedFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f59$g */
    /* loaded from: classes.dex */
    /* synthetic */ class g extends m94 implements Function1<Boolean, Unit> {
        g(Object obj) {
            super(1, obj, RatingAppliedPresenter.class, "onRnDigitalFormAvailabilityChanged", "onRnDigitalFormAvailabilityChanged(Z)V", 0);
        }

        public final void b(boolean z) {
            ((RatingAppliedPresenter) this.receiver).u(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            b(bool.booleanValue());
            return Unit.a;
        }
    }

    /* compiled from: RatingAppliedFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/controlling/feature/ratingapplied/presentation/RatingAppliedPresenter;", "a", "()Lcom/dodopizza/controlling/feature/ratingapplied/presentation/RatingAppliedPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: f59$h */
    /* loaded from: classes.dex */
    static final class h extends ej5 implements Function0<RatingAppliedPresenter> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final RatingAppliedPresenter invoke() {
            Object obj;
            Object obj2;
            d59.b a = d59.a.a();
            Bundle arguments = f59.this.getArguments();
            Boolean bool = null;
            if (arguments == null || (obj = arguments.get("extra_key_order_id")) == null) {
                obj = null;
            }
            if (obj != null && !(obj instanceof String)) {
                throw new ClassCastException("Property extra_key_order_id has different class type");
            } else if (obj != null) {
                String str = (String) obj;
                Bundle arguments2 = f59.this.getArguments();
                if (arguments2 != null && (obj2 = arguments2.get("extra_key_contact_me_checked")) != null) {
                    bool = obj2;
                }
                if (bool != null && !(bool instanceof Boolean)) {
                    throw new ClassCastException("Property extra_key_contact_me_checked has different class type");
                } else if (bool != null) {
                    return a.a(str, bool.booleanValue(), (RatingAppliedFeatureDependencies) f59.this.getComponentDependenciesRegistry().a(bc9.b(RatingAppliedFeatureDependencies.class))).a();
                } else {
                    throw new IllegalArgumentException("Argument with key = extra_key_contact_me_checked not found in bundle");
                }
            } else {
                throw new IllegalArgumentException("Argument with key = extra_key_order_id not found in bundle");
            }
        }
    }

    public f59() {
        super(wz8.fragment_rating_applied);
        this.c = kb0.e(this, zx8.rating_applied_close_button);
        this.d = kb0.e(this, zx8.rating_applied_contact_me_confirmation);
        this.e = kb0.e(this, zx8.rating_applied_promo_list);
        this.f = kb0.e(this, zx8.rating_applied_done_button);
        this.g = kb0.e(this, zx8.rndigital_card);
        h hVar = new h();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.h = new MoxyKtxDelegate(mvpDelegate, RatingAppliedPresenter.class.getName() + ".presenter", hVar);
    }

    private final View nh() {
        return (View) this.c.a(this, j[0]);
    }

    private final View oh() {
        return (View) this.d.a(this, j[1]);
    }

    private final Button ph() {
        return (Button) this.f.a(this, j[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RatingAppliedPresenter qh() {
        return (RatingAppliedPresenter) this.h.getValue(this, j[5]);
    }

    private final RecyclerView rh() {
        return (RecyclerView) this.e.a(this, j[2]);
    }

    private final View sh() {
        return (View) this.g.a(this, j[4]);
    }

    @Override // defpackage.l59
    public void H(boolean z) {
        un3.o(sh(), z);
    }

    @Override // defpackage.l59
    public void Ud() {
        un3.k(oh());
    }

    @Override // defpackage.l59
    public void Z() {
        un3.k(ph());
    }

    @Override // defpackage.l59
    public void d(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        Context context = getContext();
        if (context != null) {
            av1.g(context, str);
        }
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oma.a(nh(), new e());
        oma.a(ph(), new f());
        rh().setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        rh().addItemDecoration(new zo4(16, 24, 24));
        rh().setHasFixedSize(true);
        x8c.b(this, new g(qh()));
    }

    @Override // defpackage.l59
    public void s(vm9 vm9Var) {
        z65.h(vm9Var, "data");
        FragmentManager childFragmentManager = getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        p p = childFragmentManager.p();
        z65.g(p, "beginTransaction()");
        x8c.a(p, zx8.rndigital_card_container, vm9Var, q19.RatingAppliedTheme);
        p.l();
    }

    @Override // defpackage.l59
    public void ua() {
        un3.e(ph());
    }

    @Override // defpackage.l59
    public void uf(ay1 ay1Var) {
        List o;
        z65.h(ay1Var, tmb.c.COUNTRY_JSON_NAME);
        o = kc1.o(new mp8(g19.promo_recruiting, Integer.valueOf(g19.promo_recruiting_text), c09.promo_recruiting, ay1Var.n().d()), new mp8(g19.promo_controlling, c09.promo_controlling, ay1Var.n().a()));
        rh().setAdapter(new k6.a(new k6(o), b.a, new hp8(new d()), c.a).b().d());
    }
}
