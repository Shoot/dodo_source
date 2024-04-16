package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent;
import ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponentFeatureDependencies;
import ru.dodopizza.app.di.modules.presentation.checkout.DaggerCheckoutComponent;
/* compiled from: CheckoutBottomDialogFragment.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ?2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001@B\u0007¢\u0006\u0004\b>\u0010+J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\u001a\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\u0010\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0012H\u0014J\u000e\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bJ\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0016J\u0010\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0016R(\u0010,\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b$\u0010%\u0012\u0004\b*\u0010+\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R(\u00105\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b.\u0010/\u0012\u0004\b4\u0010+\u001a\u0004\b0\u00101\"\u0004\b2\u00103R(\u0010=\u001a\u0010\u0012\f\u0012\n 8*\u0004\u0018\u00010707068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006A"}, d2 = {"Ly31;", "Lr53;", "Ltu6;", "Lbl2;", "", "qh", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "Landroid/app/Dialog;", "onCreateDialog", "onResume", "onPause", "view", "onViewCreated", "finish", "dialog", "kh", "Lb61;", "checkoutState", "uh", "outState", "onSaveInstanceState", "", "data", "ve", "Ldv6;", com.huawei.hms.push.e.a, "Ldv6;", "sh", "()Ldv6;", "setNavigatorHolder", "(Ldv6;)V", "getNavigatorHolder$annotations", "()V", "navigatorHolder", "Lf63;", "f", "Lf63;", "th", "()Lf63;", "setRouter", "(Lf63;)V", "getRouter$annotations", "router", "Lcma;", "Lru/dodopizza/app/di/modules/presentation/checkout/CheckoutComponent;", "kotlin.jvm.PlatformType", "g", "Lcma;", "rh", "()Lcma;", "componentDependenciesRegistry", "<init>", Image.TYPE_HIGH, "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: y31  reason: default package */
/* loaded from: classes4.dex */
public final class y31 extends r53 implements tu6, bl2 {
    public static final a h = new a(null);
    private static b61 i;
    public dv6 e;
    public f63 f;
    private final cma<CheckoutComponent> g = new cma<>(eu2.d(this), bc9.b(CheckoutComponent.class), new b());

    /* compiled from: CheckoutBottomDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Ly31$a;", "", "Lb61;", "checkoutState", "Ly31;", "a", "", "ACTUAL_CHECKOUT_STATE", "Ljava/lang/String;", "EXTRA_CHECKOUT_STATE", "actualState", "Lb61;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: y31$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y31 a(b61 b61Var) {
            z65.h(b61Var, "checkoutState");
            return (y31) y64.d(new y31(), bi0.c(bi0.d("extra_checkout_state", b61Var)));
        }
    }

    /* compiled from: CheckoutBottomDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/di/modules/presentation/checkout/CheckoutComponent;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/di/modules/presentation/checkout/CheckoutComponent;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y31$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<CheckoutComponent> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final CheckoutComponent invoke() {
            return DaggerCheckoutComponent.a().b((CheckoutComponentFeatureDependencies) y31.this.getComponentDependenciesRegistry().a(bc9.b(CheckoutComponentFeatureDependencies.class))).a();
        }
    }

    /* compiled from: CheckoutBottomDialogFragment.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"y31$c", "Landroid/content/DialogInterface$OnKeyListener;", "Landroid/content/DialogInterface;", "dialog", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKey", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: y31$c */
    /* loaded from: classes4.dex */
    public static final class c implements DialogInterface.OnKeyListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            z65.h(dialogInterface, "dialog");
            z65.h(keyEvent, "event");
            if (i == 4 && keyEvent.getAction() == 1) {
                y31.this.qh();
                return true;
            }
            return false;
        }
    }

    /* compiled from: BackToScreen.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"y31$d", "Lyw9;", "Lh6c;", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Ljava/lang/Object;", "getData", "()Ljava/lang/Object;", "data", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: y31$d */
    /* loaded from: classes4.dex */
    public static final class d implements yw9, h6c {
        private final String a;
        private final Object b;

        public d(Object obj) {
            if (Modifier.isFinal(ru.dodopizza.app.presentation.checkout.details.c.class.getModifiers())) {
                String name = ru.dodopizza.app.presentation.checkout.details.c.class.getName();
                z65.g(name, "getName(...)");
                this.a = name;
                this.b = obj;
                return;
            }
            throw new IllegalArgumentException(("creator`s return type is " + ru.dodopizza.app.presentation.checkout.details.c.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
        }

        @Override // defpackage.yw9
        public String b() {
            return this.a;
        }

        @Override // defpackage.h6c
        public Object getData() {
            return this.b;
        }
    }

    /* compiled from: CheckoutBottomDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y31$e */
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function1<View, Unit> {
        e() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            y31.this.qh();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: CheckoutBottomDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lb61;", "a", "()Lb61;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y31$f */
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function0<b61> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final b61 invoke() {
            Bundle arguments = y31.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("extra_checkout_state")) == null) ? null : null;
            if (obj != null && !(obj instanceof b61)) {
                throw new ClassCastException("Property extra_checkout_state has different class type");
            } else if (obj != null) {
                return (b61) obj;
            } else {
                throw new IllegalArgumentException("Argument with key = extra_checkout_state not found in bundle");
            }
        }
    }

    /* compiled from: CheckoutBottomDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/presentation/checkout/details/c;", "a", "()Lru/dodopizza/app/presentation/checkout/details/c;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y31$g */
    /* loaded from: classes4.dex */
    static final class g extends ej5 implements Function0<ru.dodopizza.app.presentation.checkout.details.c> {
        final /* synthetic */ b61 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(b61 b61Var) {
            super(0);
            this.a = b61Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ru.dodopizza.app.presentation.checkout.details.c invoke() {
            return ru.dodopizza.app.presentation.checkout.details.c.D5.a(this.a);
        }
    }

    /* compiled from: FragmentScreen.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"y31$h", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: y31$h */
    /* loaded from: classes4.dex */
    public static final class h implements s64, k6c {
        private final String a;
        private final boolean b;
        final /* synthetic */ Function0 c;

        public h(boolean z, Function0 function0) {
            this.c = function0;
            if (Modifier.isFinal(ru.dodopizza.app.presentation.checkout.details.c.class.getModifiers())) {
                String name = ru.dodopizza.app.presentation.checkout.details.c.class.getName();
                z65.g(name, "getName(...)");
                this.a = name;
                this.b = z;
                return;
            }
            throw new IllegalArgumentException(("creator`s return type is " + ru.dodopizza.app.presentation.checkout.details.c.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [ru.dodopizza.app.presentation.checkout.details.c, androidx.fragment.app.Fragment] */
        @Override // defpackage.s64
        public ru.dodopizza.app.presentation.checkout.details.c a() {
            return (Fragment) this.c.invoke();
        }

        @Override // defpackage.yw9
        public String b() {
            return this.a;
        }

        @Override // defpackage.k6c
        public boolean d() {
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void qh() {
        Object b0;
        Unit unit;
        List<Fragment> y0 = getChildFragmentManager().y0();
        z65.g(y0, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : y0) {
            if (((Fragment) obj).isVisible()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof w50) {
                arrayList2.add(obj2);
            }
        }
        b0 = sc1.b0(arrayList2);
        w50 w50Var = (w50) b0;
        if (w50Var != null) {
            if (!w50Var.onBackPressed()) {
                th().d();
            }
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            th().d();
        }
    }

    @Override // defpackage.tu6
    public void finish() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.r53
    public void kh(Dialog dialog) {
        z65.h(dialog, "dialog");
        super.kh(dialog);
        View findViewById = dialog.findViewById(R.id.touch_outside);
        z65.g(findViewById, "findViewById(...)");
        oma.a(findViewById, new e());
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        super.onAttach(context);
        getComponentDependenciesRegistry().b().s3().a(this);
    }

    @Override // moxy.MvpBottomSheetDialogFragment, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.BottomSheetWithoutFloatingStyle);
    }

    @Override // defpackage.r53, com.google.android.material.bottomsheet.b, defpackage.kn, androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnKeyListener(new c());
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.dialog_bottom_checkout, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        sh().b();
        super.onPause();
    }

    @Override // moxy.MvpBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        dv6 sh = sh();
        FragmentManager childFragmentManager = getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        sh.a(new y46(this, R.id.container, childFragmentManager, new w31()));
    }

    @Override // moxy.MvpBottomSheetDialogFragment, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        z65.h(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("actual_checkout_state", i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        b61 b61Var = null;
        if (bundle != null) {
            Serializable serializable = bundle.getSerializable("actual_checkout_state");
            if (serializable instanceof b61) {
                b61Var = (b61) serializable;
            }
        }
        th().f(new h(false, new g((b61) mh5.d(b61Var, new f()))));
    }

    @Override // defpackage.r53, defpackage.lm1
    /* renamed from: rh */
    public cma<CheckoutComponent> getComponentDependenciesRegistry() {
        return this.g;
    }

    public final dv6 sh() {
        dv6 dv6Var = this.e;
        if (dv6Var != null) {
            return dv6Var;
        }
        z65.z("navigatorHolder");
        return null;
    }

    public final f63 th() {
        f63 f63Var = this.f;
        if (f63Var != null) {
            return f63Var;
        }
        z65.z("router");
        return null;
    }

    public final void uh(b61 b61Var) {
        z65.h(b61Var, "checkoutState");
        i = b61Var;
    }

    @Override // defpackage.bl2
    public void ve(Object obj) {
        z65.h(obj, "data");
        if (obj instanceof hw7) {
            th().c(new d(obj));
        }
    }
}
