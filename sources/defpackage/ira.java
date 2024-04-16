package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.promoaction.SpecialOfferDialogFeatureDependency;
import com.dodopizza.order.feature.promoaction.presentation.SpecialOfferDialogPresenter;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.aq;
import defpackage.fra;
import defpackage.ira;
import defpackage.iu6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: SpecialOfferDialogFragment.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000  2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001ZB\u0007¢\u0006\u0004\bX\u0010YJ\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016J\b\u0010\u0015\u001a\u00020\bH\u0016J\b\u0010\u0016\u001a\u00020\bH\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\bH\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J\b\u0010\u001c\u001a\u00020\bH\u0016J\b\u0010\u001d\u001a\u00020\bH\u0016J\u0010\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\u0010\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u001eH\u0016J\u0010\u0010#\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\bH\u0016J\b\u0010%\u001a\u00020\bH\u0016J\b\u0010&\u001a\u00020\bH\u0016J\u0010\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020\rH\u0016J\u0010\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020\u0010H\u0016J\b\u0010+\u001a\u00020\bH\u0016J\b\u0010,\u001a\u00020\bH\u0016J\b\u0010-\u001a\u00020\bH\u0016J\b\u0010.\u001a\u00020\bH\u0016R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00106\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u00101\u001a\u0004\b5\u00103R\u001b\u0010:\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u00101\u001a\u0004\b8\u00109R\u001b\u0010<\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u00101\u001a\u0004\b;\u00103R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u00101\u001a\u0004\b?\u0010@R\u001b\u0010D\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u00101\u001a\u0004\bC\u0010@R\u001b\u0010G\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u00101\u001a\u0004\bF\u0010@R\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u00101\u001a\u0004\bJ\u0010KR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u00101\u001a\u0004\bO\u0010PR\u001b\u0010W\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V¨\u0006["}, d2 = {"Lira;", "Lip6;", "Lmra;", "Liu6$e;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Ltra;", "specialOffer", "ja", "", "imageUrl", "z", "", "localImageResId", "Vc", "w0", "xf", "J8", "c3", "u6", "y1", "Yf", "b1", "k3", "ta", "I0", "", "expireTimeMillis", "n", "futureExpireTimeMillis", "Ta", "v", "B", "w9", "close", "warningMessage", "j0", "warningMessageId", "R0", com.huawei.hms.push.e.a, "f", "g", "S9", "Landroid/widget/ImageView;", DateTokenConverter.CONVERTER_KEY, "Lk79;", "kh", "()Landroid/widget/ImageView;", "specialOfferCloseButton", "ph", "specialOfferImage", "Landroid/view/ViewGroup;", "mh", "()Landroid/view/ViewGroup;", "specialOfferExpireContainer", "nh", "specialOfferExpireIcon", "Landroid/widget/TextView;", Image.TYPE_HIGH, "oh", "()Landroid/widget/TextView;", "specialOfferExpireTitle", "i", "qh", "specialOfferTitle", "j", "lh", "specialOfferDescription", "Landroid/widget/ViewSwitcher;", "k", "hh", "()Landroid/widget/ViewSwitcher;", "buttonSwitcher", "Landroid/widget/Button;", "l", "jh", "()Landroid/widget/Button;", "specialOfferApplyButton", "Lcom/dodopizza/order/feature/promoaction/presentation/SpecialOfferDialogPresenter;", Image.TYPE_MEDIUM, "Lmoxy/ktx/MoxyKtxDelegate;", "ih", "()Lcom/dodopizza/order/feature/promoaction/presentation/SpecialOfferDialogPresenter;", "presenter", "<init>", "()V", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ira  reason: default package */
/* loaded from: classes2.dex */
public final class ira extends ip6 implements mra, iu6.e {
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
    static final /* synthetic */ je5<Object>[] o = {bc9.f(new ar8(ira.class, "specialOfferCloseButton", "getSpecialOfferCloseButton()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(ira.class, "specialOfferImage", "getSpecialOfferImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(ira.class, "specialOfferExpireContainer", "getSpecialOfferExpireContainer()Landroid/view/ViewGroup;", 0)), bc9.f(new ar8(ira.class, "specialOfferExpireIcon", "getSpecialOfferExpireIcon()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(ira.class, "specialOfferExpireTitle", "getSpecialOfferExpireTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ira.class, "specialOfferTitle", "getSpecialOfferTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ira.class, "specialOfferDescription", "getSpecialOfferDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ira.class, "buttonSwitcher", "getButtonSwitcher()Landroid/widget/ViewSwitcher;", 0)), bc9.f(new ar8(ira.class, "specialOfferApplyButton", "getSpecialOfferApplyButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(ira.class, "presenter", "getPresenter()Lcom/dodopizza/order/feature/promoaction/presentation/SpecialOfferDialogPresenter;", 0))};
    public static final a n = new a(null);
    public static final int p = 8;

    /* compiled from: SpecialOfferDialogFragment.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J \u0010\u0016\u001a\u00020\f*\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001c¨\u0006!"}, d2 = {"Lira$a;", "", "Lp67;", "personalOffer", "", com.huawei.hms.opendevice.c.a, "Laq;", "b", "Lce0;", "bonusAction", "Lcq8;", "sender", "Lira;", DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "Lt2a;", "f", "Landroidx/fragment/app/Fragment;", "recipient", "Lkotlin/Function0;", "", "resultListener", "g", "", "ARG_SENDER", "Ljava/lang/String;", "ARG_SPECIAL_OFFER_DATA", "BUTTON_INDEX", "I", "OFFER_APPLIED_RESULT_KEY", "PROGRESS_INDEX", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ira$a */
    /* loaded from: classes2.dex */
    public static final class a {

        /* compiled from: SpecialOfferDialogFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ira$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0366a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[j08.values().length];
                try {
                    iArr[j08.c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j08.e.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[yp.values().length];
                try {
                    iArr2[yp.c.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[yp.d.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[yp.e.ordinal()] = 3;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[yp.f.ordinal()] = 4;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[yp.g.ordinal()] = 5;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final aq b(p67 p67Var) {
            if (p67Var.f().length() > 0) {
                return new aq.f(p67Var.f(), new r67(p67Var.h().a(), p67Var.h().b(), p67Var.h().d(), p67Var.h().c()));
            }
            return new aq.d(p67Var.a(), p67Var.f(), new r67(p67Var.h().a(), p67Var.h().b(), p67Var.h().d(), p67Var.h().c()));
        }

        private final int c(p67 p67Var) {
            if (p67Var.d().length() == 0 && (p67Var instanceof k08)) {
                int i = C0366a.$EnumSwitchMapping$0[((k08) p67Var).n().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return b09.discount;
                    }
                    return b09.cashback;
                }
                return b09.gift;
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(Function0 function0, String str, Bundle bundle) {
            z65.h(function0, "$resultListener");
            z65.h(str, "<anonymous parameter 0>");
            z65.h(bundle, "<anonymous parameter 1>");
            function0.invoke();
        }

        public final ira d(ce0 ce0Var, cq8 cq8Var) {
            aq aqVar;
            aq fVar;
            z65.h(ce0Var, "bonusAction");
            z65.h(cq8Var, "sender");
            String id = ce0Var.getId();
            String e = ce0Var.e();
            String f = ce0Var.f();
            String d = ce0Var.d();
            int i = C0366a.$EnumSwitchMapping$1[ce0Var.c().a().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                fVar = new aq.b(ce0Var.c().getValue());
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            fVar = new aq.e(ce0Var.c().getValue());
                        }
                    } else {
                        fVar = new aq.a(ce0Var.c().getValue());
                    }
                } else {
                    fVar = new aq.f(ce0Var.c().getValue(), null);
                }
                aqVar = fVar;
            } else {
                aqVar = aq.c.a;
            }
            return (ira) y64.d(new ira(), bi0.c(bi0.d("arg_special_offer_data", new tra(id, e, 0, false, f, d, aqVar, 12, null)), bi0.d("arg_sender", cq8Var)));
        }

        public final ira e(p67 p67Var, cq8 cq8Var) {
            z65.h(p67Var, "personalOffer");
            z65.h(cq8Var, "sender");
            return (ira) y64.d(new ira(), bi0.c(bi0.d("arg_special_offer_data", new tra(p67Var.a(), p67Var.d(), c(p67Var), false, p67Var.e(), p67Var.c(), b(p67Var), 8, null)), bi0.d("arg_sender", cq8Var)));
        }

        public final ira f(t2a t2aVar, cq8 cq8Var) {
            z65.h(t2aVar, "personalOffer");
            z65.h(cq8Var, "sender");
            return (ira) y64.d(new ira(), bi0.c(bi0.d("arg_special_offer_data", new tra(t2aVar.a(), t2aVar.d(), t2aVar.n(), true, t2aVar.e(), t2aVar.c(), b(t2aVar))), bi0.d("arg_sender", cq8Var)));
        }

        public final ira g(ira iraVar, Fragment fragment, final Function0<Unit> function0) {
            z65.h(iraVar, "<this>");
            z65.h(fragment, "recipient");
            z65.h(function0, "resultListener");
            fragment.getChildFragmentManager().A1("offer_applied_result_key", fragment, new r64() { // from class: hra
                @Override // defpackage.r64
                public final void a(String str, Bundle bundle) {
                    ira.a.h(Function0.this, str, bundle);
                }
            });
            return iraVar;
        }
    }

    /* compiled from: SpecialOfferDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ira$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ira.this.ih().I();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: SpecialOfferDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/order/feature/promoaction/presentation/SpecialOfferDialogPresenter;", "a", "()Lcom/dodopizza/order/feature/promoaction/presentation/SpecialOfferDialogPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ira$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function0<SpecialOfferDialogPresenter> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final SpecialOfferDialogPresenter invoke() {
            Object obj;
            Object obj2;
            fra.b a = fra.a.a();
            Bundle arguments = ira.this.getArguments();
            cq8 cq8Var = null;
            if (arguments == null || (obj = arguments.get("arg_special_offer_data")) == null) {
                obj = null;
            }
            if (obj != null && !(obj instanceof tra)) {
                throw new ClassCastException("Property arg_special_offer_data has different class type");
            } else if (obj != null) {
                tra traVar = (tra) obj;
                Bundle arguments2 = ira.this.getArguments();
                if (arguments2 != null && (obj2 = arguments2.get("arg_sender")) != null) {
                    cq8Var = obj2;
                }
                if (cq8Var != null && !(cq8Var instanceof cq8)) {
                    throw new ClassCastException("Property arg_sender has different class type");
                } else if (cq8Var != null) {
                    return a.a(traVar, cq8Var, (SpecialOfferDialogFeatureDependency) ira.this.getComponentDependenciesRegistry().a(bc9.b(SpecialOfferDialogFeatureDependency.class))).a();
                } else {
                    throw new IllegalArgumentException("Argument with key = arg_sender not found in bundle");
                }
            } else {
                throw new IllegalArgumentException("Argument with key = arg_special_offer_data not found in bundle");
            }
        }
    }

    /* compiled from: SpecialOfferDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ira$d */
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ira.this.ih().t();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: SpecialOfferDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ira$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function1<View, Unit> {
        e() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ira.this.close();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: SpecialOfferDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ira$f */
    /* loaded from: classes2.dex */
    static final class f extends ej5 implements Function1<View, Unit> {
        f() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ira.this.close();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    public ira() {
        super(gz8.dialog_special_offer);
        this.d = kb0.e(this, gy8.special_offer_fragment_close_button);
        this.e = kb0.e(this, gy8.special_offer_fragment_image);
        this.f = kb0.e(this, gy8.special_offer_fragment_expire_container);
        this.g = kb0.e(this, gy8.personal_offer_expire_icon);
        this.h = kb0.e(this, gy8.personal_offer_expire_title);
        this.i = kb0.e(this, gy8.special_offer_fragment_title);
        this.j = kb0.e(this, gy8.special_offer_fragment_description);
        this.k = kb0.e(this, gy8.special_offer_fragment_button_switcher);
        this.l = kb0.e(this, gy8.special_offer_fragment_apply_button);
        c cVar = new c();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.m = new MoxyKtxDelegate(mvpDelegate, SpecialOfferDialogPresenter.class.getName() + ".presenter", cVar);
    }

    private final ViewSwitcher hh() {
        return (ViewSwitcher) this.k.a(this, o[7]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SpecialOfferDialogPresenter ih() {
        return (SpecialOfferDialogPresenter) this.m.getValue(this, o[9]);
    }

    private final Button jh() {
        return (Button) this.l.a(this, o[8]);
    }

    private final ImageView kh() {
        return (ImageView) this.d.a(this, o[0]);
    }

    private final TextView lh() {
        return (TextView) this.j.a(this, o[6]);
    }

    private final ViewGroup mh() {
        return (ViewGroup) this.f.a(this, o[2]);
    }

    private final ImageView nh() {
        return (ImageView) this.g.a(this, o[3]);
    }

    private final TextView oh() {
        return (TextView) this.h.a(this, o[4]);
    }

    private final ImageView ph() {
        return (ImageView) this.e.a(this, o[1]);
    }

    private final TextView qh() {
        return (TextView) this.i.a(this, o[5]);
    }

    @Override // defpackage.mra
    public void B() {
        un3.e(oh());
    }

    @Override // defpackage.mra
    public void I0() {
        new iu6.a().e(r09.confirm_change_promoaction_dialog_title).b(r09.confirm_change_promoaction_dialog_message).d(r09.confirm_change_promocode_dialog_positive).c(r09.confirm_change_promocode_dialog_negative).g(this);
    }

    @Override // defpackage.mra
    public void J8() {
        jh().setText(getString(r09.promoaction_applied));
        jh().setActivated(true);
        oma.a(jh(), new f());
        un3.o(hh(), true);
    }

    @Override // defpackage.mra
    public void R0(int i) {
        String string = getString(i);
        z65.g(string, "getString(...)");
        j0(string);
    }

    @Override // defpackage.iu6.e
    public void S9() {
        ih().A();
    }

    @Override // defpackage.mra
    public void Ta(long j) {
        nh().setImageResource(bx8.ic_lock);
        un3.k(nh());
        oh().setText(getString(r09.personal_offer_future_expire_time, chb.a(j)));
        oh().setTextColor(iu1.c(requireContext(), ew8.B));
        un3.k(mh());
    }

    @Override // defpackage.mra
    public void Vc(int i) {
        un3.o(ph(), true);
        com.bumptech.glide.b.t(requireContext()).s(Integer.valueOf(i)).o0(new mo9(mpb.a(10.0f, getContext()))).a0(bx8.ic_banner_placeholder).b0(yj8.HIGH).G0(ph());
    }

    @Override // defpackage.mra
    public void Yf() {
        jh().setText(getString(r09.action_goto));
        un3.o(hh(), true);
    }

    @Override // defpackage.mra
    public void b1() {
        jh().setText(getString(r09.action_goto));
        un3.o(hh(), true);
    }

    @Override // defpackage.mra
    public void c3() {
        i64.a(this, "offer_applied_result_key", new Bundle());
    }

    @Override // defpackage.mra
    public void close() {
        dismiss();
    }

    @Override // defpackage.mra
    public void e() {
        mpb.d(requireContext(), getString(r09.promocode_failure_error));
    }

    @Override // defpackage.mra
    public void f() {
        hh().setDisplayedChild(1);
    }

    @Override // defpackage.mra
    public void g() {
        hh().setDisplayedChild(0);
    }

    @Override // defpackage.mra
    public void j0(String str) {
        z65.h(str, "warningMessage");
        mpb.d(requireContext(), str);
    }

    @Override // defpackage.mra
    public void ja(tra traVar) {
        z65.h(traVar, "specialOffer");
        qh().setText(traVar.e());
        lh().setText(traVar.b());
        oma.a(jh(), new d());
    }

    @Override // defpackage.mra
    public void k3() {
        jh().setText(getString(r09.action_goto));
        un3.o(hh(), true);
    }

    @Override // defpackage.mra
    public void n(long j) {
        un3.e(nh());
        oh().setText(getString(r09.personal_offer_expire_time, chb.a(j)));
        oh().setTextColor(iu1.c(requireContext(), ew8.B));
        un3.k(mh());
    }

    @Override // defpackage.ip6, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oma.a(kh(), new b());
        View findViewById = requireDialog().findViewById(gy8.c0);
        z65.g(findViewById, "findViewById(...)");
        BottomSheetBehavior B = BottomSheetBehavior.B(findViewById);
        z65.g(B, "from(...)");
        if (B.F() <= view.getHeight()) {
            B.f0(3);
        }
    }

    @Override // defpackage.mra
    public void ta() {
        R0(r09.action_goto_menu_not_found);
    }

    @Override // defpackage.mra
    public void u6() {
        jh().setText(getString(r09.action_apply_promocode));
        un3.o(hh(), true);
    }

    @Override // defpackage.mra
    public void v(long j) {
        un3.e(nh());
        oh().setText(getString(r09.personal_offer_expire_time, chb.a(j)));
        oh().setTextColor(iu1.c(requireContext(), ew8.E));
        un3.k(mh());
    }

    @Override // defpackage.mra
    public void w0() {
        un3.o(ph(), false);
    }

    @Override // defpackage.mra
    public void w9() {
        un3.o(hh(), false);
    }

    @Override // defpackage.mra
    public void xf() {
        jh().setText(getString(r09.promocode_applied));
        jh().setActivated(true);
        oma.a(jh(), new e());
        un3.o(hh(), true);
    }

    @Override // defpackage.mra
    public void y1() {
        jh().setText(getString(r09.action_apply_promoaction));
        un3.o(hh(), true);
    }

    @Override // defpackage.mra
    public void z(String str) {
        z65.h(str, "imageUrl");
        un3.o(ph(), true);
        com.bumptech.glide.b.t(requireContext()).t(str).o0(new mo9(mpb.a(10.0f, getContext()))).a0(bx8.ic_banner_placeholder).b0(yj8.HIGH).G0(ph());
    }
}
