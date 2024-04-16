package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.loyalty.referralsystem.ReferralSystemPresenter;
import com.dodopizza.loyalty.referralsystem.adapter.ReferralSystemHistoryOperationViewHolder;
import com.dodopizza.loyalty.referralsystem.di.ReferralSystemFeatureDependencies;
import com.inappstory.sdk.stories.api.models.Image;
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
/* compiled from: ReferralSystemFragment.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \\2\u00020\u00012\u00020\u0002:\u0001]B\u0007¢\u0006\u0004\bZ\u0010[J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\u0018\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u0007H\u0016J\u0016\u0010 \u001a\u00020\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016J\b\u0010!\u001a\u00020\u0007H\u0016R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u001b\u0010/\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010+R\u001b\u00102\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b1\u0010+R\u001b\u00105\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b4\u0010+R\u001b\u00108\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010$\u001a\u0004\b7\u0010+R\u001b\u0010;\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010$\u001a\u0004\b:\u0010+R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010$\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010$\u001a\u0004\bC\u0010DR\u001b\u0010H\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010$\u001a\u0004\bG\u0010?R\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010$\u001a\u0004\bK\u0010LR\u001b\u0010P\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010$\u001a\u0004\bO\u0010+R\u001b\u0010S\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010$\u001a\u0004\bR\u0010DR\u001b\u0010Y\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X¨\u0006^"}, d2 = {"Lob9;", "Lf70;", "Lzb9;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "", "earnedSum", "ee", "invitedCount", "bb", "maxInviteCount", "og", "l8", "T9", "S5", "s7", "", "yourGift", "yourGiftDesc", "df", "yourFriendGift", "yourFriendGiftDesc", "zb", "M8", "Hf", "", "Lsa9;", "operations", "nd", "sf", "Landroidx/appcompat/widget/Toolbar;", com.huawei.hms.opendevice.c.a, "Lk79;", "Bh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "oh", "()Landroid/widget/TextView;", "earnedBalanceTitle", com.huawei.hms.push.e.a, "zh", "invitedFriendCountTitle", "f", "vh", "forYouGiftTitle", "g", "uh", "forYouGiftDescription", Image.TYPE_HIGH, "th", "forYouFriendGiftTitle", "i", "sh", "forYouFriendGiftDescription", "Landroid/view/ViewGroup;", "j", "qh", "()Landroid/view/ViewGroup;", "enterInviteCodeContainer", "Landroid/widget/Button;", "k", "ph", "()Landroid/widget/Button;", "enterInviteCodeButton", "l", "wh", "historyContainer", "Landroidx/recyclerview/widget/RecyclerView;", Image.TYPE_MEDIUM, "xh", "()Landroidx/recyclerview/widget/RecyclerView;", "historyList", "n", "rh", "faqDescription3", "o", "yh", "inviteFriendButton", "Lcom/dodopizza/loyalty/referralsystem/ReferralSystemPresenter;", "p", "Lmoxy/ktx/MoxyKtxDelegate;", "Ah", "()Lcom/dodopizza/loyalty/referralsystem/ReferralSystemPresenter;", "presenter", "<init>", "()V", "q", "a", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ob9  reason: default package */
/* loaded from: classes2.dex */
public final class ob9 extends f70 implements zb9 {
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
    private final MoxyKtxDelegate p;
    static final /* synthetic */ je5<Object>[] r = {bc9.f(new ar8(ob9.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(ob9.class, "earnedBalanceTitle", "getEarnedBalanceTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ob9.class, "invitedFriendCountTitle", "getInvitedFriendCountTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ob9.class, "forYouGiftTitle", "getForYouGiftTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ob9.class, "forYouGiftDescription", "getForYouGiftDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ob9.class, "forYouFriendGiftTitle", "getForYouFriendGiftTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ob9.class, "forYouFriendGiftDescription", "getForYouFriendGiftDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ob9.class, "enterInviteCodeContainer", "getEnterInviteCodeContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(ob9.class, "enterInviteCodeButton", "getEnterInviteCodeButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(ob9.class, "historyContainer", "getHistoryContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(ob9.class, "historyList", "getHistoryList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(ob9.class, "faqDescription3", "getFaqDescription3()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ob9.class, "inviteFriendButton", "getInviteFriendButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(ob9.class, "presenter", "getPresenter()Lcom/dodopizza/loyalty/referralsystem/ReferralSystemPresenter;", 0))};
    public static final a q = new a(null);

    /* compiled from: ReferralSystemFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lob9$a;", "", "Lob9;", "a", "<init>", "()V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ob9$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ob9 a() {
            return new ob9();
        }
    }

    /* compiled from: ReferralSystemFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ob9$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ob9.this.Ah().x();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ReferralSystemFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/loyalty/referralsystem/ReferralSystemPresenter;", "a", "()Lcom/dodopizza/loyalty/referralsystem/ReferralSystemPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ob9$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function0<ReferralSystemPresenter> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ReferralSystemPresenter invoke() {
            return kb9.a.a().a((ReferralSystemFeatureDependencies) ob9.this.getComponentDependenciesRegistry().a(bc9.b(ReferralSystemFeatureDependencies.class))).a();
        }
    }

    /* compiled from: ReferralSystemFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ob9$d */
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ob9.this.Ah().w();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ob9$e */
    /* loaded from: classes2.dex */
    public static final class e extends ej5 implements Function1<Object, Boolean> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof sa9);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ob9$f */
    /* loaded from: classes2.dex */
    public static final class f extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final f a = new f();

        public f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = ReferralSystemHistoryOperationViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    public ob9() {
        super(ez8.fragment_referral_system);
        this.c = kb0.e(this, ey8.referral_system_toolbar);
        this.d = kb0.e(this, ey8.referral_system_earned_balance);
        this.e = kb0.e(this, ey8.referral_system_earned_invited_title);
        this.f = kb0.e(this, ey8.referral_system_your_gift_title);
        this.g = kb0.e(this, ey8.referral_system_gift_for_you_conditions_title);
        this.h = kb0.e(this, ey8.referral_system_friend_gift_title);
        this.i = kb0.e(this, ey8.referral_system_gift_for_you_friend_conditions_title);
        this.j = kb0.e(this, ey8.referral_system_enter_invite_code_container);
        this.k = kb0.e(this, ey8.referral_system_enter_invite_code_button);
        this.l = kb0.e(this, ey8.referral_system_invite_history);
        this.m = kb0.e(this, ey8.referral_system_history_list);
        this.n = kb0.e(this, ey8.referral_system_faq_description_3);
        this.o = kb0.e(this, ey8.referral_system_invite_friend_button);
        c cVar = new c();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.p = new MoxyKtxDelegate(mvpDelegate, ReferralSystemPresenter.class.getName() + ".presenter", cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReferralSystemPresenter Ah() {
        return (ReferralSystemPresenter) this.p.getValue(this, r[13]);
    }

    private final Toolbar Bh() {
        return (Toolbar) this.c.a(this, r[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ch(ob9 ob9Var, View view) {
        z65.h(ob9Var, "this$0");
        ob9Var.Ah().onBackPressed();
    }

    private final TextView oh() {
        return (TextView) this.d.a(this, r[1]);
    }

    private final Button ph() {
        return (Button) this.k.a(this, r[8]);
    }

    private final ViewGroup qh() {
        return (ViewGroup) this.j.a(this, r[7]);
    }

    private final TextView rh() {
        return (TextView) this.n.a(this, r[11]);
    }

    private final TextView sh() {
        return (TextView) this.i.a(this, r[6]);
    }

    private final TextView th() {
        return (TextView) this.h.a(this, r[5]);
    }

    private final TextView uh() {
        return (TextView) this.g.a(this, r[4]);
    }

    private final TextView vh() {
        return (TextView) this.f.a(this, r[3]);
    }

    private final ViewGroup wh() {
        return (ViewGroup) this.l.a(this, r[9]);
    }

    private final RecyclerView xh() {
        return (RecyclerView) this.m.a(this, r[10]);
    }

    private final Button yh() {
        return (Button) this.o.a(this, r[12]);
    }

    private final TextView zh() {
        return (TextView) this.e.a(this, r[2]);
    }

    @Override // defpackage.zb9
    public void Hf() {
        un3.e(qh());
    }

    @Override // defpackage.zb9
    public void M8() {
        un3.k(qh());
        oma.a(ph(), new d());
    }

    @Override // defpackage.zb9
    public void S5() {
        un3.j(yh(), 0L, 1, null);
    }

    @Override // defpackage.zb9
    public void T9() {
        zh().setText(getString(p09.referral_system_max_invited_title));
    }

    @Override // defpackage.zb9
    public void bb(int i) {
        zh().setText(getResources().getQuantityString(d09.referral_system_invited_title_without_limit, i, Integer.valueOf(i)));
    }

    @Override // defpackage.zb9
    public void df(String str, String str2) {
        z65.h(str, "yourGift");
        z65.h(str2, "yourGiftDesc");
        vh().setText(str);
        uh().setText(str2);
        rh().setText(getString(p09.referral_system_faq_description_3, str));
    }

    @Override // defpackage.zb9
    public void ee(int i) {
        oh().setText(String.valueOf(i));
    }

    @Override // defpackage.zb9
    public void l8() {
        zh().setText(getString(p09.referral_system_invited_no_one_title));
    }

    @Override // defpackage.zb9
    public void nd(List<sa9> list) {
        z65.h(list, "operations");
        xh().setAdapter(new k6.a(new k6(list), e.a, new pb9(), f.a).b().d());
        un3.k(wh());
    }

    @Override // defpackage.zb9
    public void og(int i, int i2) {
        zh().setText(getResources().getQuantityString(d09.referral_system_invited_title_with_limit, i, Integer.valueOf(i), Integer.valueOf(i2 - i)));
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oma.a(yh(), new b());
        Bh().setNavigationOnClickListener(new View.OnClickListener() { // from class: nb9
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ob9.Ch(ob9.this, view2);
            }
        });
        rh().setText(getString(p09.referral_system_faq_description_3, "0"));
    }

    @Override // defpackage.zb9
    public void s7() {
        un3.d(yh(), 0L, 1, null);
    }

    @Override // defpackage.zb9
    public void sf() {
        un3.e(wh());
    }

    @Override // defpackage.zb9
    public void zb(String str, String str2) {
        z65.h(str, "yourFriendGift");
        z65.h(str2, "yourFriendGiftDesc");
        th().setText(str);
        sh().setText(str2);
    }
}
