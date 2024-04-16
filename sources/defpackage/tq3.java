package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.controlling.feature.binaryfeedback.presentation.BinaryFeedbackView;
import com.dodopizza.controlling.feature.feedbackbuttons.FeedbackButtonsFeatureDependencies;
import com.dodopizza.controlling.feature.feedbackbuttons.presentation.FeedbackButtonsPresenter;
import com.dodopizza.controlling.feature.starsfeedback.presentation.StarsFeedbackView;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.oq3;
import defpackage.tq3;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: FeedbackButtonsFragment.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0001?B\u0007¢\u0006\u0004\b<\u0010=J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0005H\u0016J\u0010\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\u0016R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00101\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010-R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010+\u001a\u0004\b9\u0010:¨\u0006@"}, d2 = {"Ltq3;", "Lf70;", "Ldr3;", "", "ratingValue", "", "isDraft", "", "sh", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/LayoutInflater;", "onGetLayoutInflater", "Landroid/view/View;", "view", "onViewCreated", "Lcom/dodopizza/controlling/feature/orderrating/presentation/c;", "result", "Ya", "W0", "D4", "v0", "isChangeable", "q1", "g0", "Db", "Kg", "B0", "n4", "Lf69;", "description", "o3", "Lv69;", "title", "d1", "Lcom/dodopizza/controlling/feature/feedbackbuttons/presentation/FeedbackButtonsPresenter;", com.huawei.hms.opendevice.c.a, "Lmoxy/ktx/MoxyKtxDelegate;", "oh", "()Lcom/dodopizza/controlling/feature/feedbackbuttons/presentation/FeedbackButtonsPresenter;", "presenter", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "Lk79;", "qh", "()Landroid/widget/TextView;", "ratingTitle", com.huawei.hms.push.e.a, "ph", "ratingActionDesc", "Lcom/dodopizza/controlling/feature/starsfeedback/presentation/StarsFeedbackView;", "f", "rh", "()Lcom/dodopizza/controlling/feature/starsfeedback/presentation/StarsFeedbackView;", "starsFeedbackView", "Lcom/dodopizza/controlling/feature/binaryfeedback/presentation/BinaryFeedbackView;", "g", "nh", "()Lcom/dodopizza/controlling/feature/binaryfeedback/presentation/BinaryFeedbackView;", "binaryFeedbackView", "<init>", "()V", Image.TYPE_HIGH, "a", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: tq3  reason: default package */
/* loaded from: classes.dex */
public final class tq3 extends f70 implements dr3 {
    private final MoxyKtxDelegate c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    static final /* synthetic */ je5<Object>[] i = {bc9.f(new ar8(tq3.class, "presenter", "getPresenter()Lcom/dodopizza/controlling/feature/feedbackbuttons/presentation/FeedbackButtonsPresenter;", 0)), bc9.f(new ar8(tq3.class, "ratingTitle", "getRatingTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(tq3.class, "ratingActionDesc", "getRatingActionDesc()Landroid/widget/TextView;", 0)), bc9.f(new ar8(tq3.class, "starsFeedbackView", "getStarsFeedbackView()Lcom/dodopizza/controlling/feature/starsfeedback/presentation/StarsFeedbackView;", 0)), bc9.f(new ar8(tq3.class, "binaryFeedbackView", "getBinaryFeedbackView()Lcom/dodopizza/controlling/feature/binaryfeedback/presentation/BinaryFeedbackView;", 0))};
    public static final a h = new a(null);

    /* compiled from: FeedbackButtonsFragment.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bJ&\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u001a"}, d2 = {"Ltq3$a;", "", "Landroid/os/Bundle;", "bundle", "Lcom/dodopizza/controlling/feature/orderrating/presentation/c;", com.huawei.hms.opendevice.c.a, "Lpq3;", "data", "", "themeResId", "b", "Landroidx/fragment/app/Fragment;", "hostFragment", "Lkotlin/Function1;", "", "Lcom/dodopizza/controlling/feature/feedbackbuttons/presentation/FeedbackButtonsResultListener;", "action", DateTokenConverter.CONVERTER_KEY, "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "EXTRA_KEY_RESULT", "EXTRA_KEY_THEME", "RESULT_KEY", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: tq3$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final com.dodopizza.controlling.feature.orderrating.presentation.c c(Bundle bundle) {
            Serializable serializable = bundle.getSerializable("result");
            z65.f(serializable, "null cannot be cast to non-null type com.dodopizza.controlling.feature.orderrating.presentation.OrderRatingResult");
            return (com.dodopizza.controlling.feature.orderrating.presentation.c) serializable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(Function1 function1, String str, Bundle bundle) {
            z65.h(function1, "$action");
            z65.h(str, "<anonymous parameter 0>");
            z65.h(bundle, "bundle");
            function1.invoke(tq3.h.c(bundle));
        }

        public final Bundle b(pq3 pq3Var, int i) {
            z65.h(pq3Var, "data");
            return bi0.c(bi0.d("data", pq3Var), bi0.d("theme", Integer.valueOf(i)));
        }

        public final void d(Fragment fragment, final Function1<? super com.dodopizza.controlling.feature.orderrating.presentation.c, Unit> function1) {
            z65.h(fragment, "hostFragment");
            z65.h(function1, "action");
            fragment.getChildFragmentManager().A1("feedback_buttons_result", fragment, new r64() { // from class: sq3
                @Override // defpackage.r64
                public final void a(String str, Bundle bundle) {
                    tq3.a.e(Function1.this, str, bundle);
                }
            });
        }
    }

    /* compiled from: FeedbackButtonsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tq3$b */
    /* loaded from: classes.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[f69.values().length];
            try {
                iArr[f69.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f69.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f69.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[v69.values().length];
            try {
                iArr2[v69.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[v69.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[v69.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: FeedbackButtonsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "starIndex", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tq3$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<Integer, Unit> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.a;
        }

        public final void invoke(int i) {
            tq3.this.oh().z(i + 1);
        }
    }

    /* compiled from: FeedbackButtonsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dodopizza/controlling/feature/binaryfeedback/presentation/BinaryFeedbackView$c$b;", "it", "", "a", "(Lcom/dodopizza/controlling/feature/binaryfeedback/presentation/BinaryFeedbackView$c$b;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tq3$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function1<BinaryFeedbackView.c.b, Unit> {
        d() {
            super(1);
        }

        public final void a(BinaryFeedbackView.c.b bVar) {
            boolean z;
            z65.h(bVar, "it");
            FeedbackButtonsPresenter oh = tq3.this.oh();
            if (bVar == BinaryFeedbackView.c.b.a) {
                z = true;
            } else {
                z = false;
            }
            oh.y(z);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BinaryFeedbackView.c.b bVar) {
            a(bVar);
            return Unit.a;
        }
    }

    /* compiled from: FeedbackButtonsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/controlling/feature/feedbackbuttons/presentation/FeedbackButtonsPresenter;", "a", "()Lcom/dodopizza/controlling/feature/feedbackbuttons/presentation/FeedbackButtonsPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: tq3$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function0<FeedbackButtonsPresenter> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final FeedbackButtonsPresenter invoke() {
            oq3.b a = oq3.a.a();
            FeedbackButtonsFeatureDependencies feedbackButtonsFeatureDependencies = (FeedbackButtonsFeatureDependencies) tq3.this.getComponentDependenciesRegistry().a(bc9.b(FeedbackButtonsFeatureDependencies.class));
            Bundle arguments = tq3.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
            if (obj != null && !(obj instanceof pq3)) {
                throw new ClassCastException("Property data has different class type");
            } else if (obj != null) {
                return a.a(feedbackButtonsFeatureDependencies, (pq3) obj).a();
            } else {
                throw new IllegalArgumentException("Argument with key = data not found in bundle");
            }
        }
    }

    public tq3() {
        super(wz8.fragment_feedback_buttons);
        e eVar = new e();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.c = new MoxyKtxDelegate(mvpDelegate, FeedbackButtonsPresenter.class.getName() + ".presenter", eVar);
        this.d = kb0.e(this, zx8.rating_title);
        this.e = kb0.e(this, zx8.rating_action_desc);
        this.f = kb0.e(this, zx8.order_stars_feedback);
        this.g = kb0.e(this, zx8.order_binary_feedback);
    }

    private final BinaryFeedbackView nh() {
        return (BinaryFeedbackView) this.g.a(this, i[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FeedbackButtonsPresenter oh() {
        return (FeedbackButtonsPresenter) this.c.getValue(this, i[0]);
    }

    private final TextView ph() {
        return (TextView) this.e.a(this, i[2]);
    }

    private final TextView qh() {
        return (TextView) this.d.a(this, i[1]);
    }

    private final StarsFeedbackView rh() {
        return (StarsFeedbackView) this.f.a(this, i[3]);
    }

    private final void sh(int i2, boolean z) {
        rh().setSelectedStar(i2 - 1);
        rh().setStarsTintEnabled(z);
        un3.k(rh());
    }

    @Override // defpackage.dr3
    public void B0() {
        un3.e(nh());
    }

    @Override // defpackage.dr3
    public void D4(int i2) {
        sh(i2, true);
    }

    @Override // defpackage.dr3
    public void Db() {
        nh().setButtonsState(BinaryFeedbackView.c.b.a);
        un3.k(nh());
    }

    @Override // defpackage.dr3
    public void Kg() {
        nh().setButtonsState(BinaryFeedbackView.c.b.b);
        un3.k(nh());
    }

    @Override // defpackage.dr3
    public void W0(int i2) {
        sh(i2, false);
    }

    @Override // defpackage.dr3
    public void Ya(com.dodopizza.controlling.feature.orderrating.presentation.c cVar) {
        z65.h(cVar, "result");
        getParentFragmentManager().z1("feedback_buttons_result", bi0.c(bi0.d("result", cVar)));
    }

    @Override // defpackage.dr3
    public void d1(v69 v69Var) {
        String string;
        z65.h(v69Var, "title");
        TextView qh = qh();
        int i2 = b.$EnumSwitchMapping$1[v69Var.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    string = getString(g19.rating_value);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                string = getString(g19.rate_order_text);
            }
        } else {
            string = getString(g19.binary_feedback_text);
        }
        qh.setText(string);
    }

    @Override // defpackage.dr3
    public void g0() {
        nh().setButtonsState(BinaryFeedbackView.c.a.a);
        un3.k(nh());
    }

    @Override // defpackage.dr3
    public void n4(boolean z) {
        nh().setSelectionEnabled(z);
    }

    @Override // defpackage.dr3
    public void o3(f69 f69Var) {
        z65.h(f69Var, "description");
        int i2 = b.$EnumSwitchMapping$0[f69Var.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    un3.e(ph());
                    return;
                }
                return;
            }
            un3.k(ph());
            ph().setText(getString(g19.not_sent_order_rating_text));
            return;
        }
        un3.k(ph());
        ph().setText(getString(g19.not_send_binary_feedback_text));
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        z65.g(onGetLayoutInflater, "onGetLayoutInflater(...)");
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("theme")) == null) ? null : null;
        if (obj != null && !(obj instanceof Integer)) {
            throw new ClassCastException("Property theme has different class type");
        } else if (obj != null) {
            return tdb.a(onGetLayoutInflater, ((Integer) obj).intValue());
        } else {
            throw new IllegalArgumentException("Argument with key = theme not found in bundle");
        }
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        rh().setOnStarClick(new c());
        nh().setButtonsClickListener(new d());
    }

    @Override // defpackage.dr3
    public void q1(boolean z) {
        rh().setEditable(z);
    }

    @Override // defpackage.dr3
    public void v0() {
        un3.e(rh());
    }
}
