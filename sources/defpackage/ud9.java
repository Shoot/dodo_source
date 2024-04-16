package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.product.card.presentation.removeingredient.RemoveIngredientsFeatureDependencies;
import com.dodopizza.order.feature.product.card.presentation.removeingredient.RemoveIngredientsPresenter;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.sd9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpAppCompatDialogFragment;
import moxy.MvpDelegate;
import moxy.MvpPresenter;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: RemoveIngredientsDialog.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 E2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001FB\u0007¢\u0006\u0004\bC\u0010DJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u001a\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u0015\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J\u0016\u0010\u001f\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J\b\u0010 \u001a\u00020\u0004H\u0016R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010)\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010#\u001a\u0004\b,\u0010-R\u001a\u00104\u001a\u00020/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R(\u0010=\u001a\b\u0012\u0004\u0012\u000206058\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001b\u0010B\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006G"}, d2 = {"Lud9;", "Lmoxy/MvpAppCompatDialogFragment;", "Lzd9;", "Llm1;", "", "nh", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "Landroid/app/Dialog;", "onCreateDialog", "onCreate", "Lvl8;", "ingredient", "K0", "Gb", "i8", "Qd", "", "", "removedIngredientsIds", "Kf", "close", "Landroid/widget/Button;", "b", "Lk79;", "lh", "()Landroid/widget/Button;", "restoreDefaultsButton", com.huawei.hms.opendevice.c.a, "mh", "saveCustomizationButton", "Lcom/google/android/material/chip/ChipGroup;", DateTokenConverter.CONVERTER_KEY, "ih", "()Lcom/google/android/material/chip/ChipGroup;", "ingredientsChipGroup", "Lkm1;", e.a, "Lkm1;", "getComponentDependenciesRegistry", "()Lkm1;", "componentDependenciesRegistry", "Las8;", "Lcom/dodopizza/order/feature/product/card/presentation/removeingredient/RemoveIngredientsPresenter;", "f", "Las8;", "kh", "()Las8;", "setPresenterProvider$order_release", "(Las8;)V", "presenterProvider", "g", "Lmoxy/ktx/MoxyKtxDelegate;", "jh", "()Lcom/dodopizza/order/feature/product/card/presentation/removeingredient/RemoveIngredientsPresenter;", "presenter", "<init>", "()V", Image.TYPE_HIGH, "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ud9  reason: default package */
/* loaded from: classes2.dex */
public final class ud9 extends MvpAppCompatDialogFragment implements zd9, lm1 {
    private final k79 b = kb0.e(this, gy8.restore_defaults_button);
    private final k79 c = kb0.e(this, gy8.save_customization_button);
    private final k79 d = kb0.e(this, gy8.ingredients_chip_group);
    private final km1 e = eu2.d(this);
    public as8<RemoveIngredientsPresenter> f;
    private final MoxyKtxDelegate g;
    static final /* synthetic */ je5<Object>[] i = {bc9.f(new ar8(ud9.class, "restoreDefaultsButton", "getRestoreDefaultsButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(ud9.class, "saveCustomizationButton", "getSaveCustomizationButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(ud9.class, "ingredientsChipGroup", "getIngredientsChipGroup()Lcom/google/android/material/chip/ChipGroup;", 0)), bc9.f(new ar8(ud9.class, "presenter", "getPresenter()Lcom/dodopizza/order/feature/product/card/presentation/removeingredient/RemoveIngredientsPresenter;", 0))};
    public static final a h = new a(null);
    public static final int j = 8;

    /* compiled from: RemoveIngredientsDialog.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lud9$a;", "", "", "menuItem", "", "Lvl8;", "ingredients", "Lud9;", "a", "ARG_INGREDIENTS", "Ljava/lang/String;", "ARG_MENU_ITEM_ID", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ud9$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ud9 a(String str, List<vl8> list) {
            z65.h(str, "menuItem");
            z65.h(list, "ingredients");
            return (ud9) y64.d(new ud9(), bi0.c(bi0.d("arg_menu_item_id", str), bi0.d("arg_ingredients", new ArrayList(list))));
        }
    }

    /* compiled from: RemoveIngredientsDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ud9$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ud9.this.jh().s();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: RemoveIngredientsDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ud9$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ud9.this.jh().t();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: RemoveIngredientsDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/order/feature/product/card/presentation/removeingredient/RemoveIngredientsPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/order/feature/product/card/presentation/removeingredient/RemoveIngredientsPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ud9$d */
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function0<RemoveIngredientsPresenter> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final RemoveIngredientsPresenter invoke() {
            return ud9.this.kh().get();
        }
    }

    public ud9() {
        d dVar = new d();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.g = new MoxyKtxDelegate(mvpDelegate, RemoveIngredientsPresenter.class.getName() + ".presenter", dVar);
    }

    private final ChipGroup ih() {
        return (ChipGroup) this.d.a(this, i[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RemoveIngredientsPresenter jh() {
        MvpPresenter value = this.g.getValue(this, i[3]);
        z65.g(value, "getValue(...)");
        return (RemoveIngredientsPresenter) value;
    }

    private final Button lh() {
        return (Button) this.b.a(this, i[0]);
    }

    private final Button mh() {
        return (Button) this.c.a(this, i[1]);
    }

    private final void nh() {
        Object obj;
        Object obj2;
        sd9.b a2 = sd9.a.a();
        RemoveIngredientsFeatureDependencies removeIngredientsFeatureDependencies = (RemoveIngredientsFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(RemoveIngredientsFeatureDependencies.class));
        Bundle arguments = getArguments();
        List<vl8> list = null;
        if (arguments == null || (obj = arguments.get("arg_menu_item_id")) == null) {
            obj = null;
        }
        if (obj != null && !(obj instanceof String)) {
            throw new ClassCastException("Property arg_menu_item_id has different class type");
        } else if (obj != null) {
            String str = (String) obj;
            Bundle arguments2 = getArguments();
            if (arguments2 != null && (obj2 = arguments2.get("arg_ingredients")) != null) {
                list = obj2;
            }
            if (list != null && !(list instanceof List)) {
                throw new ClassCastException("Property arg_ingredients has different class type");
            } else if (list != null) {
                a2.a(removeIngredientsFeatureDependencies, str, list).a(this);
            } else {
                throw new IllegalArgumentException("Argument with key = arg_ingredients not found in bundle");
            }
        } else {
            throw new IllegalArgumentException("Argument with key = arg_menu_item_id not found in bundle");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oh(ud9 ud9Var, vl8 vl8Var, CompoundButton compoundButton, boolean z) {
        z65.h(ud9Var, "this$0");
        z65.h(vl8Var, "$ingredient");
        ud9Var.jh().r(vl8Var, !z);
    }

    @Override // defpackage.zd9
    public void Gb() {
        lh().setEnabled(true);
    }

    @Override // defpackage.zd9
    public void K0(final vl8 vl8Var) {
        String o;
        z65.h(vl8Var, "ingredient");
        Context context = ih().getContext();
        Chip chip = new Chip(context);
        chip.setId(View.generateViewId());
        chip.setChipBackgroundColorResource(ew8.chip_background_color);
        chip.setTextColor(iu1.d(context, ew8.chip_text_color));
        o = l0b.o(qhb.a(vl8Var.getName()));
        chip.setText(o);
        if (vl8Var.b()) {
            chip.setCheckable(true);
            chip.setCheckedIconVisible(false);
            chip.setChecked(true ^ vl8Var.c());
            chip.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: td9
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    ud9.oh(ud9.this, vl8Var, compoundButton, z);
                }
            });
        } else {
            chip.setEnabled(false);
        }
        ih().addView(chip);
    }

    @Override // defpackage.zd9
    public void Kf(Collection<String> collection) {
        w78 w78Var;
        z65.h(collection, "removedIngredientsIds");
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof w78) {
            w78Var = (w78) targetFragment;
        } else {
            w78Var = null;
        }
        if (w78Var != null) {
            w78Var.Qf(collection);
        }
    }

    @Override // defpackage.zd9
    public void Qd() {
        for (View view : dzb.b(ih())) {
            ih().g(view.getId());
        }
    }

    @Override // defpackage.zd9
    public void close() {
        dismiss();
    }

    @Override // defpackage.lm1
    public km1 getComponentDependenciesRegistry() {
        return this.e;
    }

    @Override // defpackage.zd9
    public void i8() {
        lh().setEnabled(false);
    }

    public final as8<RemoveIngredientsPresenter> kh() {
        as8<RemoveIngredientsPresenter> as8Var = this.f;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        nh();
        super.onAttach(context);
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
    }

    @Override // defpackage.kn, androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        z65.g(onCreateDialog, "onCreateDialog(...)");
        onCreateDialog.setCancelable(false);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        return layoutInflater.inflate(gz8.dialog_remove_ingredients_layout, (ViewGroup) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oma.a(lh(), new b());
        oma.a(mh(), new c());
    }
}
