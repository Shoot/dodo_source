package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.ib1;
import java.text.DateFormat;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.AppComponent;
import ru.dodopizza.app.presentation.collaboration.CollaborationPromoPresenter;
/* compiled from: CollaborationPromoDialogFragment.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u00012\u00020\u0002:\u0001MB\u0007¢\u0006\u0004\bK\u0010LJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\tH\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\tH\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\u0010\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u0007H\u0016J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\tH\u0016J\b\u0010\u001f\u001a\u00020\u0007H\u0016J\b\u0010 \u001a\u00020\u0007H\u0016R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010)\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010-R\u001b\u00101\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u0010%R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010#\u001a\u0004\b4\u00105R\u001b\u00109\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010#\u001a\u0004\b8\u00105R\u001b\u0010<\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010#\u001a\u0004\b;\u00105R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010#\u001a\u0004\b?\u0010@R\u001b\u0010D\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010#\u001a\u0004\bC\u0010@R\u001b\u0010J\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006N"}, d2 = {"Llb1;", "Lip6;", "Lnb1;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "", "title", "W2", "information", "Pc", "imageUrl", "z", "w0", "close", "promoCode", "a1", "z4", ElementGenerator.TYPE_LINK, "m1", "J1", "M2", "", "expireTimeMillis", "n", "v", "B", "l5", "o1", "g8", "Landroid/widget/ImageView;", DateTokenConverter.CONVERTER_KEY, "Lk79;", "kh", "()Landroid/widget/ImageView;", "promoCloseButton", e.a, "qh", "promoImage", "Landroid/view/ViewGroup;", "f", "nh", "()Landroid/view/ViewGroup;", "promoExpireContainer", "g", "oh", "promoExpireIcon", "Landroid/widget/TextView;", Image.TYPE_HIGH, "ph", "()Landroid/widget/TextView;", "promoExpireTitle", "i", "sh", "promoTitle", "j", "mh", "promoDescription", "Landroid/widget/Button;", "k", "lh", "()Landroid/widget/Button;", "promoCopyButton", "l", "rh", "promoLinkButton", "Lru/dodopizza/app/presentation/collaboration/CollaborationPromoPresenter;", Image.TYPE_MEDIUM, "Lmoxy/ktx/MoxyKtxDelegate;", "jh", "()Lru/dodopizza/app/presentation/collaboration/CollaborationPromoPresenter;", "presenter", "<init>", "()V", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: lb1  reason: default package */
/* loaded from: classes4.dex */
public final class lb1 extends ip6 implements nb1 {
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final k79 l;
    private final MoxyKtxDelegate m;
    static final /* synthetic */ je5<Object>[] o = {bc9.f(new ar8(lb1.class, "promoCloseButton", "getPromoCloseButton()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(lb1.class, "promoImage", "getPromoImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(lb1.class, "promoExpireContainer", "getPromoExpireContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(lb1.class, "promoExpireIcon", "getPromoExpireIcon()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(lb1.class, "promoExpireTitle", "getPromoExpireTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(lb1.class, "promoTitle", "getPromoTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(lb1.class, "promoDescription", "getPromoDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(lb1.class, "promoCopyButton", "getPromoCopyButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(lb1.class, "promoLinkButton", "getPromoLinkButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(lb1.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/collaboration/CollaborationPromoPresenter;", 0))};
    public static final a n = new a(null);

    /* compiled from: CollaborationPromoDialogFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Llb1$a;", "", "Lrb1;", "collaborationPromo", "Llb1;", "a", "", "ARG_COLLABORATION_PROMO_DATA", "Ljava/lang/String;", "", "CORNER_SIZE", "F", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: lb1$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final lb1 a(rb1 rb1Var) {
            z65.h(rb1Var, "collaborationPromo");
            return (lb1) y64.d(new lb1(), bi0.c(bi0.d("arg_collaboration_promo_data", rb1Var)));
        }
    }

    /* compiled from: CollaborationPromoDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: lb1$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            lb1.this.jh().u();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: CollaborationPromoDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/presentation/collaboration/CollaborationPromoPresenter;", "a", "()Lru/dodopizza/app/presentation/collaboration/CollaborationPromoPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: lb1$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<CollaborationPromoPresenter> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final CollaborationPromoPresenter invoke() {
            ib1.a Y1 = ((AppComponent) lb1.this.getComponentDependenciesRegistry().a(bc9.b(AppComponent.class))).Y1();
            Bundle arguments = lb1.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("arg_collaboration_promo_data")) == null) ? null : null;
            if (obj != null && !(obj instanceof rb1)) {
                throw new ClassCastException("Property arg_collaboration_promo_data has different class type");
            } else if (obj != null) {
                return Y1.b((rb1) obj).a().a();
            } else {
                throw new IllegalArgumentException("Argument with key = arg_collaboration_promo_data not found in bundle");
            }
        }
    }

    public lb1() {
        super(R.layout.dialog_collaboration_promo);
        this.d = kb0.e(this, R.id.collaboration_promo_close_button);
        this.e = kb0.e(this, R.id.collaboration_promo_image);
        this.f = kb0.e(this, R.id.collaboration_promo_expire_container);
        this.g = kb0.e(this, R.id.collaboration_promo_expire_icon);
        this.h = kb0.e(this, R.id.collaboration_promo_expire_title);
        this.i = kb0.e(this, R.id.collaboration_promo_title);
        this.j = kb0.e(this, R.id.collaboration_promo_description);
        this.k = kb0.e(this, R.id.collaboration_promo_copy_button);
        this.l = kb0.e(this, R.id.collaboration_promo_link_button);
        c cVar = new c();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.m = new MoxyKtxDelegate(mvpDelegate, CollaborationPromoPresenter.class.getName() + ".presenter", cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollaborationPromoPresenter jh() {
        return (CollaborationPromoPresenter) this.m.getValue(this, o[9]);
    }

    private final ImageView kh() {
        return (ImageView) this.d.a(this, o[0]);
    }

    private final Button lh() {
        return (Button) this.k.a(this, o[7]);
    }

    private final TextView mh() {
        return (TextView) this.j.a(this, o[6]);
    }

    private final ViewGroup nh() {
        return (ViewGroup) this.f.a(this, o[2]);
    }

    private final ImageView oh() {
        return (ImageView) this.g.a(this, o[3]);
    }

    private final TextView ph() {
        return (TextView) this.h.a(this, o[4]);
    }

    private final ImageView qh() {
        return (ImageView) this.e.a(this, o[1]);
    }

    private final Button rh() {
        return (Button) this.l.a(this, o[8]);
    }

    private final TextView sh() {
        return (TextView) this.i.a(this, o[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void th(lb1 lb1Var, View view) {
        z65.h(lb1Var, "this$0");
        lb1Var.jh().v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void uh(lb1 lb1Var, View view) {
        z65.h(lb1Var, "this$0");
        lb1Var.jh().w();
    }

    @Override // defpackage.nb1
    public void B() {
        un3.e(ph());
    }

    @Override // defpackage.nb1
    public void J1() {
        rh().setVisibility(0);
    }

    @Override // defpackage.nb1
    public void M2() {
        rh().setVisibility(8);
    }

    @Override // defpackage.nb1
    public void Pc(String str) {
        z65.h(str, "information");
        mh().setText(str);
    }

    @Override // defpackage.nb1
    public void W2(String str) {
        z65.h(str, "title");
        sh().setText(str);
    }

    @Override // defpackage.nb1
    public void a1(String str) {
        z65.h(str, "promoCode");
        lh().setVisibility(0);
        lh().setText(str);
    }

    @Override // defpackage.nb1
    public void close() {
        dismiss();
    }

    @Override // defpackage.nb1
    public void g8() {
        lh().setText(lh().getContext().getString(R.string.copied));
        lh().setEnabled(false);
    }

    @Override // defpackage.nb1
    public void l5(String str) {
        z65.h(str, "promoCode");
        Object systemService = requireContext().getSystemService("clipboard");
        z65.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("promoCode", str));
    }

    @Override // defpackage.nb1
    public void m1(String str) {
        z65.h(str, ElementGenerator.TYPE_LINK);
        Context context = getContext();
        if (context != null) {
            av1.g(context, str);
        }
    }

    @Override // defpackage.nb1
    public void n(long j) {
        un3.e(oh());
        Context context = oh().getContext();
        ph().setText(context.getString(R.string.personal_offer_expire_time, DateFormat.getDateInstance(1).format(new Date(j))));
        ph().setTextColor(iu1.c(context, R.color.textIconSecondaryColor));
        un3.k(nh());
    }

    @Override // defpackage.nb1
    public void o1() {
        lh().setEnabled(true);
    }

    @Override // defpackage.ip6, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oma.a(kh(), new b());
        View findViewById = requireDialog().findViewById(R.id.design_bottom_sheet);
        z65.g(findViewById, "findViewById(...)");
        BottomSheetBehavior B = BottomSheetBehavior.B(findViewById);
        z65.g(B, "from(...)");
        lh().setOnClickListener(new View.OnClickListener() { // from class: jb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                lb1.th(lb1.this, view2);
            }
        });
        rh().setOnClickListener(new View.OnClickListener() { // from class: kb1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                lb1.uh(lb1.this, view2);
            }
        });
        if (B.F() <= view.getHeight()) {
            B.f0(3);
        }
    }

    @Override // defpackage.nb1
    public void v(long j) {
        un3.e(oh());
        Context context = oh().getContext();
        ph().setText(context.getString(R.string.personal_offer_expire_time, DateFormat.getDateInstance(1).format(new Date(j))));
        ph().setTextColor(iu1.c(context, R.color.textIconWarningColor));
        un3.k(nh());
    }

    @Override // defpackage.nb1
    public void w0() {
        un3.o(qh(), false);
    }

    @Override // defpackage.nb1
    public void z(String str) {
        z65.h(str, "imageUrl");
        un3.o(qh(), true);
        com.bumptech.glide.b.t(requireContext()).t(str).o0(new mo9(mpb.a(10.0f, getContext()))).a0(R.drawable.ic_banner_placeholder).b0(yj8.HIGH).G0(qh());
    }

    @Override // defpackage.nb1
    public void z4() {
        lh().setVisibility(8);
    }
}
