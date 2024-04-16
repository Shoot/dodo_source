package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.c;
import androidx.compose.foundation.layout.d;
import ch.qos.logback.core.CoreConstants;
import com.dodopizza.order.feature.personaldelivery.DynamicDeliveryFeatureDependencies;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DynamicDeliveryInfoBottomSheetFragment.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000  2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J$\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Ls93;", "Lr53;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "onAttach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "Lf63;", e.a, "Lf63;", "ph", "()Lf63;", "setRouter", "(Lf63;)V", "router", "Lgc;", "f", "Lgc;", "getAnalytics", "()Lgc;", "setAnalytics", "(Lgc;)V", "analytics", "<init>", "()V", "g", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: s93  reason: default package */
/* loaded from: classes2.dex */
public final class s93 extends r53 {
    public static final a g = new a(null);
    public static final int h = 8;
    public f63 e;
    public gc f;

    /* compiled from: DynamicDeliveryInfoBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Ls93$a;", "", "Lq93;", "levels", "Ls93;", "a", "", "DYNAMIC_DELIVERY_ARGS", "Ljava/lang/String;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: s93$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s93 a(q93 q93Var) {
            z65.h(q93Var, "levels");
            return (s93) y64.d(new s93(), bi0.c(bi0.d("dynamicDeliveryArg", q93Var)));
        }
    }

    /* compiled from: DynamicDeliveryInfoBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Lqn1;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: s93$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function2<qn1, Integer, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DynamicDeliveryInfoBottomSheetFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: s93$b$a */
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function0<Unit> {
            final /* synthetic */ s93 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s93 s93Var) {
                super(0);
                this.a = s93Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.ph().d();
            }
        }

        b() {
            super(2);
        }

        public final void a(qn1 qn1Var, int i) {
            Object obj;
            if ((i & 11) == 2 && qn1Var.g()) {
                qn1Var.E();
                return;
            }
            if (tn1.K()) {
                tn1.V(-665618367, i, -1, "com.dodopizza.order.feature.personaldelivery.DynamicDeliveryInfoBottomSheetFragment.onCreateView.<anonymous>.<anonymous> (DynamicDeliveryInfoBottomSheetFragment.kt:63)");
            }
            Bundle arguments = s93.this.getArguments();
            if (arguments == null || (obj = arguments.get("dynamicDeliveryArg")) == null) {
                obj = null;
            }
            if (obj != null && !(obj instanceof q93)) {
                throw new ClassCastException("Property dynamicDeliveryArg has different class type");
            } else if (obj != null) {
                float f = 20;
                w93.a(c.a(d.b(sm6.a, 0.0f, 1, null), fd1.a(ew8.d, qn1Var, 0), ko9.e(i73.o(f), i73.o(f), 0.0f, 0.0f, 12, null)), ((q93) obj).a(), new a(s93.this), qn1Var, 64, 0);
                if (tn1.K()) {
                    tn1.U();
                }
            } else {
                throw new IllegalArgumentException("Argument with key = dynamicDeliveryArg not found in bundle");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        super.onAttach(context);
        p93.a.a().a((DynamicDeliveryFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(DynamicDeliveryFeatureDependencies.class))).a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        nn1 nn1Var = new nn1(requireContext, null, 0, 6, null);
        nn1Var.setContent(gn1.c(-665618367, true, new b()));
        return nn1Var;
    }

    public final f63 ph() {
        f63 f63Var = this.e;
        if (f63Var != null) {
            return f63Var;
        }
        z65.z("router");
        return null;
    }
}
