package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.bottomsheet.LockableBottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import moxy.MvpBottomSheetDialogFragment;
/* compiled from: DodoBottomSheetDialogFragment.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0016\u0010\u000b\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0017J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014R(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR.\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00050\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010*\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lr53;", "Lmoxy/MvpBottomSheetDialogFragment;", "Llm1;", "Landroid/app/Dialog;", "dialog", "", "nh", "Lcom/dodopizza/android/bottomsheet/LockableBottomSheetBehavior;", "Landroid/view/View;", "bottomSheetBehavior", "mh", "hh", "ih", "Landroid/os/Bundle;", "savedInstanceState", "onCreateDialog", "", "isCancelable", "setCancelable", "kh", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "getDialogOnShowListener", "()Lkotlin/jvm/functions/Function0;", "setDialogOnShowListener", "(Lkotlin/jvm/functions/Function0;)V", "dialogOnShowListener", "Lkotlin/Function1;", "", com.huawei.hms.opendevice.c.a, "Lkotlin/jvm/functions/Function1;", "jh", "()Lkotlin/jvm/functions/Function1;", "lh", "(Lkotlin/jvm/functions/Function1;)V", "stateChangedListener", "Lkm1;", DateTokenConverter.CONVERTER_KEY, "Lkm1;", "getComponentDependenciesRegistry", "()Lkm1;", "componentDependenciesRegistry", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: r53  reason: default package */
/* loaded from: classes.dex */
public class r53 extends MvpBottomSheetDialogFragment implements lm1 {
    private Function0<Unit> b = b.a;
    private Function1<? super Integer, Unit> c = c.a;
    private final km1 d = eu2.d(this);

    /* compiled from: DodoBottomSheetDialogFragment.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"r53$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$f;", "Landroid/view/View;", "bottomSheet", "", "newState", "", com.huawei.hms.opendevice.c.a, "", "slideOffset", "b", "android_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: r53$a */
    /* loaded from: classes.dex */
    public static final class a extends BottomSheetBehavior.f {
        a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View view, float f) {
            z65.h(view, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View view, int i) {
            z65.h(view, "bottomSheet");
            r53.this.jh().invoke(Integer.valueOf(i));
        }
    }

    /* compiled from: DodoBottomSheetDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: r53$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<Unit> {
        public static final b a = new b();

        b() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }
    }

    /* compiled from: DodoBottomSheetDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: r53$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<Integer, Unit> {
        public static final c a = new c();

        c() {
            super(1);
        }

        public final void invoke(int i) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.a;
        }
    }

    private final void hh(LockableBottomSheetBehavior<View> lockableBottomSheetBehavior) {
        lockableBottomSheetBehavior.s(new a());
    }

    private final LockableBottomSheetBehavior<View> ih(Dialog dialog) {
        BottomSheetBehavior B = BottomSheetBehavior.B(dialog.findViewById(vx8.f));
        z65.f(B, "null cannot be cast to non-null type com.dodopizza.android.bottomsheet.LockableBottomSheetBehavior<android.view.View>");
        return (LockableBottomSheetBehavior) B;
    }

    private final void mh(LockableBottomSheetBehavior<View> lockableBottomSheetBehavior) {
        lockableBottomSheetBehavior.f0(3);
        lockableBottomSheetBehavior.Y(true);
        lockableBottomSheetBehavior.e0(true);
        lockableBottomSheetBehavior.s0(isCancelable());
    }

    private final void nh(final Dialog dialog) {
        dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: q53
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                r53.oh(r53.this, dialog, dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void oh(r53 r53Var, Dialog dialog, DialogInterface dialogInterface) {
        z65.h(r53Var, "this$0");
        z65.h(dialog, "$dialog");
        r53Var.b.invoke();
        LockableBottomSheetBehavior<View> ih = r53Var.ih(dialog);
        r53Var.mh(ih);
        r53Var.hh(ih);
        r53Var.kh(dialog);
    }

    @Override // defpackage.lm1
    public km1 getComponentDependenciesRegistry() {
        return this.d;
    }

    public final Function1<Integer, Unit> jh() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void kh(Dialog dialog) {
        z65.h(dialog, "dialog");
    }

    public final void lh(Function1<? super Integer, Unit> function1) {
        z65.h(function1, "<set-?>");
        this.c = function1;
    }

    @Override // com.google.android.material.bottomsheet.b, defpackage.kn, androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        w32 w32Var = new w32(requireContext, getTheme());
        nh(w32Var);
        return w32Var;
    }

    @Override // androidx.fragment.app.c
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(z);
        }
    }
}
