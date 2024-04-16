package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.controlling.feature.ordercompleted.OrderCompletedFeatureDependencies;
import com.dodopizza.controlling.feature.ordercompleted.presentation.orderinfo.CompletedOrderInfoPresenter;
import com.huawei.hms.push.e;
import defpackage.kl1;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.i;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: CompletedOrderInfoFragment.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001*B\u0007¢\u0006\u0004\b(\u0010\"J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016R\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u001b\u0010\u001b\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R!\u0010#\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u0018\u0010'\u001a\u00020$*\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lml1;", "Lf70;", "Lsl1;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Ljl1;", "orderInfo", "a2", "a8", "gd", "f2", "M6", "Landroid/widget/TextView;", com.huawei.hms.opendevice.c.a, "Lk79;", "ph", "()Landroid/widget/TextView;", "orderContentsDescription", DateTokenConverter.CONVERTER_KEY, "qh", "orderTotalCost", e.a, "sh", "wrapItemsDescriptionButton", "Lcom/dodopizza/controlling/feature/ordercompleted/presentation/orderinfo/CompletedOrderInfoPresenter;", "f", "Lmoxy/ktx/MoxyKtxDelegate;", "rh", "()Lcom/dodopizza/controlling/feature/ordercompleted/presentation/orderinfo/CompletedOrderInfoPresenter;", "getPresenter$annotations", "()V", "presenter", "", "th", "(Landroid/widget/TextView;)Z", "isTextEllipsized", "<init>", "g", "a", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ml1  reason: default package */
/* loaded from: classes.dex */
public final class ml1 extends f70 implements sl1 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final MoxyKtxDelegate f;
    static final /* synthetic */ je5<Object>[] h = {bc9.f(new ar8(ml1.class, "orderContentsDescription", "getOrderContentsDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ml1.class, "orderTotalCost", "getOrderTotalCost()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ml1.class, "wrapItemsDescriptionButton", "getWrapItemsDescriptionButton()Landroid/widget/TextView;", 0)), bc9.f(new ar8(ml1.class, "presenter", "getPresenter()Lcom/dodopizza/controlling/feature/ordercompleted/presentation/orderinfo/CompletedOrderInfoPresenter;", 0))};
    public static final a g = new a(null);

    /* compiled from: CompletedOrderInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lml1$a;", "", "Lll1;", "data", "Landroid/os/Bundle;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ml1$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bundle a(ll1 ll1Var) {
            z65.h(ll1Var, "data");
            return bi0.c(bi0.d("data", ll1Var));
        }
    }

    /* compiled from: CompletedOrderInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ml1$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ml1 ml1Var = ml1.this;
            ml1.this.rh().t(ml1Var.th(ml1Var.ph()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: CompletedOrderInfoFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ml1$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ml1.this.rh().u();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: CompletedOrderInfoFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/controlling/feature/ordercompleted/presentation/orderinfo/CompletedOrderInfoPresenter;", "a", "()Lcom/dodopizza/controlling/feature/ordercompleted/presentation/orderinfo/CompletedOrderInfoPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ml1$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function0<CompletedOrderInfoPresenter> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final CompletedOrderInfoPresenter invoke() {
            kl1.b a = kl1.a.a();
            Bundle arguments = ml1.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
            if (obj != null && !(obj instanceof ll1)) {
                throw new ClassCastException("Property data has different class type");
            } else if (obj != null) {
                return a.a((ll1) obj, (OrderCompletedFeatureDependencies) ml1.this.getComponentDependenciesRegistry().a(bc9.b(OrderCompletedFeatureDependencies.class))).a();
            } else {
                throw new IllegalArgumentException("Argument with key = data not found in bundle");
            }
        }
    }

    public ml1() {
        super(wz8.fragment_completed_order_info);
        this.c = kb0.e(this, zx8.order_contents_description);
        this.d = kb0.e(this, zx8.order_total_cost);
        this.e = kb0.e(this, zx8.wrap_items_description_button);
        d dVar = new d();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.f = new MoxyKtxDelegate(mvpDelegate, CompletedOrderInfoPresenter.class.getName() + ".presenter", dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView ph() {
        return (TextView) this.c.a(this, h[0]);
    }

    private final TextView qh() {
        return (TextView) this.d.a(this, h[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CompletedOrderInfoPresenter rh() {
        return (CompletedOrderInfoPresenter) this.f.getValue(this, h[3]);
    }

    private final TextView sh() {
        return (TextView) this.e.a(this, h[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean th(TextView textView) {
        IntRange q;
        q = i.q(0, textView.getLayout().getLineCount());
        if ((q instanceof Collection) && ((Collection) q).isEmpty()) {
            return false;
        }
        Iterator<Integer> it = q.iterator();
        while (it.hasNext()) {
            if (textView.getLayout().getEllipsisCount(((q55) it).b()) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sl1
    public void M6() {
        un3.e(sh());
    }

    @Override // defpackage.sl1
    public void a2(jl1 jl1Var) {
        String i0;
        z65.h(jl1Var, "orderInfo");
        TextView ph = ph();
        i0 = sc1.i0(jl1Var.a(), null, null, null, 0, null, null, 63, null);
        ph.setText(i0);
        qh().setText(un6.b(jl1Var.b()));
    }

    @Override // defpackage.sl1
    public void a8() {
        ph().setMaxLines(getResources().getInteger(xy8.order_items_description_wrapped_lines_count));
    }

    @Override // defpackage.sl1
    public void f2() {
        un3.k(sh());
    }

    @Override // defpackage.sl1
    public void gd() {
        ph().setMaxLines(Integer.MAX_VALUE);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oma.a(ph(), new b());
        oma.a(sh(), new c());
    }
}
