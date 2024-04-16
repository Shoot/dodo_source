package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.b;
import androidx.fragment.app.d;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpAppCompatDialogFragment;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.AppComponent;
import ru.dodopizza.app.presentation.temporarilyblock.presenter.TemporarilyBlockPresenter;
/* compiled from: TemporarilyBlockDialog.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 )2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001*B\u0007¢\u0006\u0004\b'\u0010(J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0004H\u0016R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006+"}, d2 = {"Lz8b;", "Lmoxy/MvpAppCompatDialogFragment;", "Lf9b;", "Llm1;", "", "ih", "Landroid/view/View;", "hh", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "onResume", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "", "visible", "p0", "p5", "b", "Landroid/view/View;", "loader", "Landroid/widget/TextView;", com.huawei.hms.opendevice.c.a, "Landroid/widget/TextView;", "updateView", "Lkm1;", DateTokenConverter.CONVERTER_KEY, "Lkm1;", "getComponentDependenciesRegistry", "()Lkm1;", "componentDependenciesRegistry", "Lru/dodopizza/app/presentation/temporarilyblock/presenter/TemporarilyBlockPresenter;", e.a, "Lmoxy/ktx/MoxyKtxDelegate;", "jh", "()Lru/dodopizza/app/presentation/temporarilyblock/presenter/TemporarilyBlockPresenter;", "blockPresenter", "<init>", "()V", "f", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: z8b  reason: default package */
/* loaded from: classes4.dex */
public final class z8b extends MvpAppCompatDialogFragment implements f9b, lm1 {
    private View b;
    private TextView c;
    private final km1 d = eu2.d(this);
    private final MoxyKtxDelegate e;
    static final /* synthetic */ je5<Object>[] g = {bc9.f(new ar8(z8b.class, "blockPresenter", "getBlockPresenter()Lru/dodopizza/app/presentation/temporarilyblock/presenter/TemporarilyBlockPresenter;", 0))};
    public static final a f = new a(null);

    /* compiled from: TemporarilyBlockDialog.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, d2 = {"Lz8b$a;", "", "Lz8b;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: z8b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z8b a() {
            return new z8b();
        }
    }

    /* compiled from: TemporarilyBlockDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/presentation/temporarilyblock/presenter/TemporarilyBlockPresenter;", "a", "()Lru/dodopizza/app/presentation/temporarilyblock/presenter/TemporarilyBlockPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z8b$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<TemporarilyBlockPresenter> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TemporarilyBlockPresenter invoke() {
            return ((AppComponent) z8b.this.getComponentDependenciesRegistry().a(bc9.b(AppComponent.class))).e3().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TemporarilyBlockDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: z8b$c */
    /* loaded from: classes4.dex */
    public static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            z8b.this.jh().s();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    public z8b() {
        b bVar = new b();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.e = new MoxyKtxDelegate(mvpDelegate, TemporarilyBlockPresenter.class.getName() + ".presenter", bVar);
    }

    private final View hh() {
        TextView textView = null;
        View inflate = requireActivity().getLayoutInflater().inflate(R.layout.temporarily_block_dialog, (ViewGroup) null, true);
        View findViewById = inflate.findViewById(R.id.update);
        z65.g(findViewById, "findViewById(...)");
        TextView textView2 = (TextView) findViewById;
        this.c = textView2;
        if (textView2 == null) {
            z65.z("updateView");
        } else {
            textView = textView2;
        }
        oma.a(textView, new c());
        View findViewById2 = inflate.findViewById(R.id.loader);
        z65.g(findViewById2, "findViewById(...)");
        this.b = findViewById2;
        z65.e(inflate);
        return inflate;
    }

    private final void ih() {
        d activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TemporarilyBlockPresenter jh() {
        return (TemporarilyBlockPresenter) this.e.getValue(this, g[0]);
    }

    @Override // defpackage.lm1
    public km1 getComponentDependenciesRegistry() {
        return this.d;
    }

    @Override // defpackage.kn, androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        androidx.appcompat.app.b a2 = new b.a(requireContext()).t(hh()).a();
        z65.g(a2, "create(...)");
        return a2;
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        z65.h(dialogInterface, "dialog");
        ih();
        super.onDismiss(dialogInterface);
    }

    @Override // moxy.MvpAppCompatDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        jh().s();
    }

    @Override // defpackage.f9b
    public void p0(boolean z) {
        View view = null;
        if (z) {
            TextView textView = this.c;
            if (textView == null) {
                z65.z("updateView");
                textView = null;
            }
            textView.setVisibility(8);
            View view2 = this.b;
            if (view2 == null) {
                z65.z("loader");
            } else {
                view = view2;
            }
            view.setVisibility(0);
            return;
        }
        TextView textView2 = this.c;
        if (textView2 == null) {
            z65.z("updateView");
            textView2 = null;
        }
        textView2.setVisibility(0);
        View view3 = this.b;
        if (view3 == null) {
            z65.z("loader");
        } else {
            view = view3;
        }
        view.setVisibility(8);
    }

    @Override // defpackage.f9b
    public void p5() {
        dismiss();
    }
}
