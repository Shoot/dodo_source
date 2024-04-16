package ru.dodopizza.app.presentation.checkout.cashcharge;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.b;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent;
import ru.dodopizza.app.presentation.checkout.cashcharge.b;
import ru.dodopizza.app.presentation.checkout.cashcharge.c;
/* compiled from: CashChargeFragment.kt */
@Metadata(d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\b*\u0001F\u0018\u0000 L2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001bB\u0007¢\u0006\u0004\bJ\u0010KJ\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\bH\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016J\b\u0010\u0019\u001a\u00020\bH\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0013H\u0016J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0013H\u0016R\u001b\u0010#\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010,R\u001b\u00100\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b/\u0010'R\u001b\u00103\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010 \u001a\u0004\b2\u0010'R\u001b\u00106\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010 \u001a\u0004\b5\u0010\"R\u001b\u00109\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010 \u001a\u0004\b8\u0010\"R\u001b\u0010<\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010 \u001a\u0004\b;\u0010\"R\u001b\u0010?\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010 \u001a\u0004\b>\u0010\"R\u001b\u0010E\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010H¨\u0006M"}, d2 = {"Lru/dodopizza/app/presentation/checkout/cashcharge/c;", "Lc70;", "Lys0;", "Lw50;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "", "onBackPressed", "Lhn6;", "money", "Cd", "H8", "Z", "isEnabled", "C5", "", "amount", "rg", "u0", "Vf", "b3", "P", "Fc", "a", "currencySymbol", "h3", "D3", Image.TYPE_HIGH, "Lk79;", "Dh", "()Landroid/view/View;", "closeButton", "Landroid/widget/TextView;", "i", "Ch", "()Landroid/widget/TextView;", "cashChargeTitle", "Landroid/widget/EditText;", "j", "yh", "()Landroid/widget/EditText;", "cashChargeAmountEditText", "k", "Ah", "cashChargeMoneySymbolPrefix", "l", "Bh", "cashChargeMoneySymbolSuffix", Image.TYPE_MEDIUM, "Gh", "notEnoughMoneyText", "n", "Eh", "doneButton", "o", "Fh", "haveExactMoneyButton", "p", "zh", "cashChargeContainer", "Lru/dodopizza/app/presentation/checkout/cashcharge/CashChargePresenter;", "q", "Lmoxy/ktx/MoxyKtxDelegate;", "Hh", "()Lru/dodopizza/app/presentation/checkout/cashcharge/CashChargePresenter;", "presenter", "ru/dodopizza/app/presentation/checkout/cashcharge/c$b", "r", "Lru/dodopizza/app/presentation/checkout/cashcharge/c$b;", "amountWatcher", "<init>", "()V", Image.TYPE_SMALL, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class c extends c70 implements ys0, w50 {
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final k79 l;
    private final k79 m;
    private final k79 n;
    private final k79 o;
    private final k79 p;
    private final MoxyKtxDelegate q;
    private final b r;
    static final /* synthetic */ je5<Object>[] t = {bc9.f(new ar8(c.class, "closeButton", "getCloseButton()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "cashChargeTitle", "getCashChargeTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(c.class, "cashChargeAmountEditText", "getCashChargeAmountEditText()Landroid/widget/EditText;", 0)), bc9.f(new ar8(c.class, "cashChargeMoneySymbolPrefix", "getCashChargeMoneySymbolPrefix()Landroid/widget/TextView;", 0)), bc9.f(new ar8(c.class, "cashChargeMoneySymbolSuffix", "getCashChargeMoneySymbolSuffix()Landroid/widget/TextView;", 0)), bc9.f(new ar8(c.class, "notEnoughMoneyText", "getNotEnoughMoneyText()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "doneButton", "getDoneButton()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "haveExactMoneyButton", "getHaveExactMoneyButton()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "cashChargeContainer", "getCashChargeContainer()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/checkout/cashcharge/CashChargePresenter;", 0))};
    public static final a s = new a(null);

    /* compiled from: CashChargeFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lru/dodopizza/app/presentation/checkout/cashcharge/c$a;", "", "Lru/dodopizza/app/presentation/checkout/cashcharge/c;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            return (c) d70.a(new c(), false);
        }
    }

    /* compiled from: CashChargeFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.checkout.cashcharge.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0522c extends ej5 implements Function1<View, Unit> {
        C0522c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.Hh().w(b.a.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: CashChargeFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.Hh().w(b.C0521b.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: CashChargeFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function1<View, Unit> {
        e() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.Hh().w(b.e.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: CashChargeFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/presentation/checkout/cashcharge/CashChargePresenter;", "a", "()Lru/dodopizza/app/presentation/checkout/cashcharge/CashChargePresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function0<CashChargePresenter> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final CashChargePresenter invoke() {
            return ((CheckoutComponent) c.this.getComponentDependenciesRegistry().a(bc9.b(CheckoutComponent.class))).E1().a().a();
        }
    }

    public c() {
        super(R.layout.fragment_cash_charge);
        this.h = kb0.e(this, R.id.close_button);
        this.i = kb0.e(this, R.id.cash_charge_title);
        this.j = kb0.e(this, R.id.cash_charge_amount_edittext);
        this.k = kb0.e(this, R.id.money_symbol_prefix_text);
        this.l = kb0.e(this, R.id.money_symbol_suffix_text);
        this.m = kb0.e(this, R.id.not_enough_money_error);
        this.n = kb0.e(this, R.id.done_button);
        this.o = kb0.e(this, R.id.have_exact_money_button);
        this.p = kb0.e(this, R.id.cash_charge_container);
        f fVar = new f();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.q = new MoxyKtxDelegate(mvpDelegate, CashChargePresenter.class.getName() + ".presenter", fVar);
        this.r = new b();
    }

    private final TextView Ah() {
        return (TextView) this.k.a(this, t[3]);
    }

    private final TextView Bh() {
        return (TextView) this.l.a(this, t[4]);
    }

    private final TextView Ch() {
        return (TextView) this.i.a(this, t[1]);
    }

    private final View Dh() {
        return (View) this.h.a(this, t[0]);
    }

    private final View Eh() {
        return (View) this.n.a(this, t[6]);
    }

    private final View Fh() {
        return (View) this.o.a(this, t[7]);
    }

    private final View Gh() {
        return (View) this.m.a(this, t[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CashChargePresenter Hh() {
        return (CashChargePresenter) this.q.getValue(this, t[9]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ih(c cVar) {
        z65.h(cVar, "this$0");
        gg5.d(cVar.yh());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Jh(c cVar, View view) {
        z65.h(cVar, "this$0");
        gg5.d(cVar.yh());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Kh(c cVar, DialogInterface dialogInterface, int i) {
        z65.h(cVar, "this$0");
        cVar.Hh().w(b.c.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Lh(c cVar, DialogInterface dialogInterface, int i) {
        z65.h(cVar, "this$0");
        cVar.Hh().w(b.d.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditText yh() {
        return (EditText) this.j.a(this, t[2]);
    }

    private final View zh() {
        return (View) this.p.a(this, t[8]);
    }

    @Override // defpackage.ys0
    public void C5(boolean z) {
        Eh().setEnabled(z);
    }

    @Override // defpackage.ys0
    public void Cd(hn6 hn6Var) {
        z65.h(hn6Var, "money");
        Ch().setText(requireContext().getString(R.string.cash_charge_title, un6.b(hn6Var)));
    }

    @Override // defpackage.ys0
    public void D3(String str) {
        z65.h(str, "currencySymbol");
        Ah().setText(str);
        un3.e(Bh());
        un3.k(Ah());
    }

    @Override // defpackage.ys0
    public void Fc() {
        new b.a(requireContext()).r(R.string.cash_charge_dialog_cancel_title).g(R.string.cash_charge_dialog_cancel_message).n(R.string.yes_cancel, new DialogInterface.OnClickListener() { // from class: ls0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                c.Kh(c.this, dialogInterface, i);
            }
        }).j(R.string.continue_text, new DialogInterface.OnClickListener() { // from class: ms0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                c.Lh(c.this, dialogInterface, i);
            }
        }).d(false).u();
    }

    @Override // defpackage.ys0
    public void H8() {
        un3.e(Eh());
        un3.k(Fh());
    }

    @Override // defpackage.ys0
    public void P() {
        startPostponedEnterTransition();
        yh().postDelayed(new Runnable() { // from class: ks0
            @Override // java.lang.Runnable
            public final void run() {
                c.Ih(c.this);
            }
        }, 300L);
    }

    @Override // defpackage.ys0
    public void Vf() {
        un3.k(Gh());
    }

    @Override // defpackage.ys0
    public void Z() {
        un3.e(Fh());
        un3.k(Eh());
    }

    @Override // defpackage.ys0
    public void a() {
        gg5.c(yh());
    }

    @Override // defpackage.ys0
    public void b3() {
        un3.e(Gh());
    }

    @Override // defpackage.ys0
    public void h3(String str) {
        z65.h(str, "currencySymbol");
        Bh().setText(str);
        un3.e(Ah());
        un3.k(Bh());
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        Hh().w(b.a.a);
        return true;
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oma.a(Dh(), new C0522c());
        oma.a(Eh(), new d());
        oma.a(Fh(), new e());
        yh().addTextChangedListener(this.r);
        zh().setOnClickListener(new View.OnClickListener() { // from class: ns0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                c.Jh(c.this, view2);
            }
        });
        ph();
    }

    @Override // defpackage.ys0
    public void rg(String str) {
        z65.h(str, "amount");
        yh().removeTextChangedListener(this.r);
        yh().setText(str);
        yh().setSelection(str.length());
        yh().addTextChangedListener(this.r);
    }

    @Override // defpackage.ys0
    public void u0() {
        jyb.d(this);
    }

    /* compiled from: CashChargeFragment.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J*\u0010\r\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¨\u0006\u000e"}, d2 = {"ru/dodopizza/app/presentation/checkout/cashcharge/c$b", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", Image.TYPE_SMALL, "", "afterTextChanged", "", "", "start", "count", "after", "beforeTextChanged", "before", "onTextChanged", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b implements TextWatcher {
        b() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            c.this.yh().removeTextChangedListener(this);
            c.this.Hh().w(new b.f(String.valueOf(charSequence)));
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
