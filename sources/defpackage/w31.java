package defpackage;

import android.transition.Transition;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CheckoutAnimationConductor.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0007\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J*\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016R \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0013"}, d2 = {"Lw31;", "Lw64;", "Landroid/transition/Transition;", "Landroidx/fragment/app/Fragment;", "currentFragment", "nextFragment", "", "b", "Lhj1;", "command", "Landroidx/fragment/app/p;", "fragmentTransaction", "a", "Lkotlin/Function1;", "Lrha;", "Lkotlin/jvm/functions/Function1;", "createSharedElementMapper", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: w31  reason: default package */
/* loaded from: classes4.dex */
public final class w31 implements w64 {
    public static final a b = new a(null);
    private final Function1<Fragment, rha> a = c.a;

    /* compiled from: CheckoutAnimationConductor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lw31$a;", "", "", "TRANSITION_NAME", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w31$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CheckoutAnimationConductor.kt */
    @Metadata(d1 = {"\u0000\r\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003*\u0001\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/fragment/app/Fragment;", "fragment", "w31$c$a", "a", "(Landroidx/fragment/app/Fragment;)Lw31$c$a;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: w31$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function1<Fragment, a> {
        public static final c a = new c();

        /* compiled from: CheckoutAnimationConductor.kt */
        @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¨\u0006\n"}, d2 = {"w31$c$a", "Lrha;", "", "", "names", "", "Landroid/view/View;", "sharedElements", "", DateTokenConverter.CONVERTER_KEY, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
        /* renamed from: w31$c$a */
        /* loaded from: classes4.dex */
        public static final class a extends rha {
            final /* synthetic */ Fragment b;

            a(Fragment fragment) {
                this.b = fragment;
            }

            @Override // defpackage.rha
            public void d(List<String> list, Map<String, View> map) {
                z65.h(list, "names");
                z65.h(map, "sharedElements");
                list.add("checkoutTransition");
                View view = this.b.getView();
                if (view != null) {
                    view.setTransitionName(list.get(0));
                }
                String str = list.get(0);
                View requireView = this.b.requireView();
                z65.g(requireView, "requireView(...)");
                map.put(str, requireView);
            }
        }

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final a invoke(Fragment fragment) {
            z65.h(fragment, "fragment");
            return new a(fragment);
        }
    }

    private final void b(Transition transition, Fragment fragment, Fragment fragment2) {
        transition.addListener(new b(fragment, fragment2));
    }

    @Override // defpackage.w64
    public void a(hj1 hj1Var, Fragment fragment, Fragment fragment2, p pVar) {
        z65.h(hj1Var, "command");
        z65.h(fragment2, "nextFragment");
        z65.h(pVar, "fragmentTransaction");
        if (fragment == null) {
            return;
        }
        View requireView = fragment.requireView();
        z65.g(requireView, "requireView(...)");
        requireView.setTransitionName("checkoutTransition");
        pVar.h(requireView, requireView.getTransitionName()).B(true);
        a61 a61Var = new a61();
        b(a61Var, fragment, fragment2);
        fragment2.setSharedElementEnterTransition(a61Var);
        fragment.setExitSharedElementCallback(this.a.invoke(fragment));
        fragment2.setEnterSharedElementCallback(this.a.invoke(fragment2));
    }

    /* compiled from: CheckoutAnimationConductor.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"w31$b", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "", "onTransitionEnd", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w31$b */
    /* loaded from: classes4.dex */
    public static final class b implements Transition.TransitionListener {
        final /* synthetic */ Fragment a;
        final /* synthetic */ Fragment b;

        b(Fragment fragment, Fragment fragment2) {
            this.a = fragment;
            this.b = fragment2;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            View view = this.a.getView();
            if (view != null) {
                view.setTransitionName(null);
            }
            View view2 = this.b.getView();
            if (view2 != null) {
                view2.setTransitionName(null);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }
}
