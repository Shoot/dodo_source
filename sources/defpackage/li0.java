package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.push.e;
import defpackage.qi0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.AppComponent;
/* compiled from: BuyMoreBottomFragment.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 )2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b'\u0010(J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0014J&\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0012\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u001a\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0015H\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006+"}, d2 = {"Lli0;", "Lr53;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "Landroid/app/Dialog;", "dialog", "kh", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "onCreateDialog", "view", "onViewCreated", "Landroid/content/DialogInterface;", "onDismiss", "Lf63;", e.a, "Lf63;", "qh", "()Lf63;", "setRouter", "(Lf63;)V", "router", "Lgc;", "f", "Lgc;", "ph", "()Lgc;", "setAnalytics", "(Lgc;)V", "analytics", "<init>", "()V", "g", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: li0  reason: default package */
/* loaded from: classes4.dex */
public final class li0 extends r53 {
    public static final a g = new a(null);
    public f63 e;
    public gc f;

    /* compiled from: BuyMoreBottomFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lli0$a;", "", "Loi0;", "products", "Lli0;", "a", "", "BUY_MORE_PRODUCTS_ARG", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: li0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final li0 a(oi0 oi0Var) {
            z65.h(oi0Var, "products");
            return (li0) y64.d(new li0(), bi0.c(bi0.d("buyMore", oi0Var)));
        }
    }

    /* compiled from: BuyMoreBottomFragment.kt */
    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"li0$b", "Landroid/content/DialogInterface$OnKeyListener;", "Landroid/content/DialogInterface;", "dialog", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKey", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: li0$b */
    /* loaded from: classes4.dex */
    public static final class b implements DialogInterface.OnKeyListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            z65.h(dialogInterface, "dialog");
            z65.h(keyEvent, "event");
            if (i == 4 && keyEvent.getAction() == 1) {
                li0.this.ph().a(fi0.a);
                li0.this.qh().i(1000, Unit.a);
                return true;
            }
            return false;
        }
    }

    /* compiled from: BuyMoreBottomFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: li0$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            li0.this.ph().a(ji0.a);
            li0.this.qh().i(1000, Unit.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: BuyMoreBottomFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "state", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: li0$d */
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function1<Integer, Unit> {
        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.a;
        }

        public final void invoke(int i) {
            if (i == 5) {
                li0.this.ph().a(ii0.a);
                li0.this.qh().i(1000, Unit.a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.r53
    public void kh(Dialog dialog) {
        z65.h(dialog, "dialog");
        super.kh(dialog);
        View findViewById = dialog.findViewById(R.id.touch_outside);
        z65.g(findViewById, "findViewById(...)");
        oma.a(findViewById, new c());
        lh(new d());
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        super.onAttach(context);
        ((AppComponent) getComponentDependenciesRegistry().a(bc9.b(AppComponent.class))).D3(this);
    }

    @Override // moxy.MvpBottomSheetDialogFragment, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.BottomSheetWithoutFloatingStyle);
    }

    @Override // defpackage.r53, com.google.android.material.bottomsheet.b, defpackage.kn, androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnKeyListener(new b());
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.dialog_bottom_buy_more, viewGroup, false);
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        z65.h(dialogInterface, "dialog");
        qh().l(1000, Unit.a);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        qi0.a aVar = qi0.i;
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("buyMore")) == null) ? null : null;
        if (obj != null && !(obj instanceof oi0)) {
            throw new ClassCastException("Property buyMore has different class type");
        } else if (obj != null) {
            getChildFragmentManager().p().b(R.id.container, aVar.a((oi0) obj)).k();
        } else {
            throw new IllegalArgumentException("Argument with key = buyMore not found in bundle");
        }
    }

    public final gc ph() {
        gc gcVar = this.f;
        if (gcVar != null) {
            return gcVar;
        }
        z65.z("analytics");
        return null;
    }

    public final f63 qh() {
        f63 f63Var = this.e;
        if (f63Var != null) {
            return f63Var;
        }
        z65.z("router");
        return null;
    }
}
