package defpackage;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.MvpView;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent;
import ru.dodopizza.app.presentation.checkout.deliverytotable.TableNumberSelectionPresenter;
/* compiled from: TableNumberSelectionFragment.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001dB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Ly5b;", "Lc70;", "", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Landroid/widget/EditText;", Image.TYPE_HIGH, "Lk79;", "vh", "()Landroid/widget/EditText;", "tableNumber", "Landroidx/appcompat/widget/Toolbar;", "i", "wh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lru/dodopizza/app/presentation/checkout/deliverytotable/TableNumberSelectionPresenter;", "j", "Lmoxy/ktx/MoxyKtxDelegate;", "uh", "()Lru/dodopizza/app/presentation/checkout/deliverytotable/TableNumberSelectionPresenter;", "presenter", "<init>", "()V", "k", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: y5b  reason: default package */
/* loaded from: classes4.dex */
public final class y5b extends c70 implements MvpView {
    private final k79 h;
    private final k79 i;
    private final MoxyKtxDelegate j;
    static final /* synthetic */ je5<Object>[] l = {bc9.f(new ar8(y5b.class, "tableNumber", "getTableNumber()Landroid/widget/EditText;", 0)), bc9.f(new ar8(y5b.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(y5b.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/checkout/deliverytotable/TableNumberSelectionPresenter;", 0))};
    public static final a k = new a(null);

    /* compiled from: TableNumberSelectionFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Ly5b$a;", "", "Ly5b;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: y5b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y5b a() {
            return new y5b();
        }
    }

    /* compiled from: TableNumberSelectionFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/presentation/checkout/deliverytotable/TableNumberSelectionPresenter;", "a", "()Lru/dodopizza/app/presentation/checkout/deliverytotable/TableNumberSelectionPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: y5b$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<TableNumberSelectionPresenter> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TableNumberSelectionPresenter invoke() {
            return ((CheckoutComponent) y5b.this.getComponentDependenciesRegistry().a(bc9.b(CheckoutComponent.class))).f3().a();
        }
    }

    public y5b() {
        super(R.layout.fragment_table_number);
        this.h = kb0.e(this, R.id.table_number_view);
        this.i = kb0.e(this, R.id.fragment_table_number_toolbar);
        b bVar = new b();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.j = new MoxyKtxDelegate(mvpDelegate, TableNumberSelectionPresenter.class.getName() + ".presenter", bVar);
    }

    private final TableNumberSelectionPresenter uh() {
        return (TableNumberSelectionPresenter) this.j.getValue(this, l[2]);
    }

    private final EditText vh() {
        return (EditText) this.h.a(this, l[0]);
    }

    private final Toolbar wh() {
        return (Toolbar) this.i.a(this, l[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xh(y5b y5bVar, View view) {
        z65.h(y5bVar, "this$0");
        y5bVar.uh().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean yh(y5b y5bVar, TextView textView, int i, KeyEvent keyEvent) {
        z65.h(y5bVar, "this$0");
        if (i == 6) {
            y5bVar.uh().r(y5bVar.vh().getText().toString());
            return true;
        }
        return true;
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        ph();
        d70.a(this, false);
        gg5.d(vh());
        wh().setNavigationOnClickListener(new View.OnClickListener() { // from class: w5b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                y5b.xh(y5b.this, view2);
            }
        });
        vh().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: x5b
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean yh;
                yh = y5b.yh(y5b.this, textView, i, keyEvent);
                return yh;
            }
        });
    }
}
