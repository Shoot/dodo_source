package ru.dodopizza.app.presentation.checkout.taxpayerid;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.t7b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent;
import ru.dodopizza.app.presentation.checkout.taxpayerid.b;
import ru.dodopizza.app.presentation.checkout.taxpayerid.c;
/* compiled from: TaxPayerIdFragment.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 *2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0011B\u0007¢\u0006\u0004\b(\u0010)J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\bH\u0016R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001b\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001e\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001aR\u001b\u0010!\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u001aR\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lru/dodopizza/app/presentation/checkout/taxpayerid/c;", "Lc70;", "Lf8b;", "Lw50;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "", "onBackPressed", "", "taxPayerId", "H9", "isEnabled", "Q0", "a", "Landroid/widget/EditText;", Image.TYPE_HIGH, "Lk79;", "yh", "()Landroid/widget/EditText;", "taxPayerIdEditText", "i", "uh", "()Landroid/view/View;", "clearTaxPayerIdButton", "j", "vh", "closeButton", "k", "xh", "saveButton", "Lru/dodopizza/app/presentation/checkout/taxpayerid/TaxPayerIdPresenter;", "l", "Lmoxy/ktx/MoxyKtxDelegate;", "wh", "()Lru/dodopizza/app/presentation/checkout/taxpayerid/TaxPayerIdPresenter;", "presenter", "<init>", "()V", Image.TYPE_MEDIUM, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class c extends c70 implements f8b, w50 {
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final MoxyKtxDelegate l;
    static final /* synthetic */ je5<Object>[] n = {bc9.f(new ar8(c.class, "taxPayerIdEditText", "getTaxPayerIdEditText()Landroid/widget/EditText;", 0)), bc9.f(new ar8(c.class, "clearTaxPayerIdButton", "getClearTaxPayerIdButton()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "closeButton", "getCloseButton()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "saveButton", "getSaveButton()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/checkout/taxpayerid/TaxPayerIdPresenter;", 0))};
    public static final a m = new a(null);

    /* compiled from: TaxPayerIdFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lru/dodopizza/app/presentation/checkout/taxpayerid/c$a;", "", "Lv7b;", "data", "Lru/dodopizza/app/presentation/checkout/taxpayerid/c;", "a", "", "EXTRA_TAX_PAYER_ID", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(v7b v7bVar) {
            z65.h(v7bVar, "data");
            return (c) y64.d(d70.a(new c(), false), bi0.c(bi0.d("extra_tax_payer_id", v7bVar.a())));
        }
    }

    /* compiled from: TaxPayerIdFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "newText", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<String, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String str) {
            z65.h(str, "newText");
            c.this.wh().w(new b.d(str));
        }
    }

    /* compiled from: TaxPayerIdFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.checkout.taxpayerid.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0562c extends ej5 implements Function1<View, Unit> {
        C0562c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.wh().w(b.C0561b.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: TaxPayerIdFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.wh().w(b.a.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: TaxPayerIdFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function1<View, Unit> {
        e() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.wh().w(b.c.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: TaxPayerIdFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/presentation/checkout/taxpayerid/TaxPayerIdPresenter;", "a", "()Lru/dodopizza/app/presentation/checkout/taxpayerid/TaxPayerIdPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function0<TaxPayerIdPresenter> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final TaxPayerIdPresenter invoke() {
            t7b.a i4 = ((CheckoutComponent) c.this.getComponentDependenciesRegistry().a(bc9.b(CheckoutComponent.class))).i4();
            Bundle arguments = c.this.getArguments();
            String str = (arguments == null || (str = arguments.get("extra_tax_payer_id")) == null) ? "" : "";
            if (str instanceof String) {
                return i4.b((String) str).a().a();
            }
            throw new ClassCastException("Property extra_tax_payer_id has different class type");
        }
    }

    public c() {
        super(R.layout.fragment_tax_payer_id);
        this.h = kb0.e(this, R.id.tax_payer_id_edit_text);
        this.i = kb0.e(this, R.id.clear_tax_payer_id_button);
        this.j = kb0.e(this, R.id.close_button);
        this.k = kb0.e(this, R.id.save_button);
        f fVar = new f();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.l = new MoxyKtxDelegate(mvpDelegate, TaxPayerIdPresenter.class.getName() + ".presenter", fVar);
    }

    private final View uh() {
        return (View) this.i.a(this, n[1]);
    }

    private final View vh() {
        return (View) this.j.a(this, n[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TaxPayerIdPresenter wh() {
        return (TaxPayerIdPresenter) this.l.getValue(this, n[4]);
    }

    private final View xh() {
        return (View) this.k.a(this, n[3]);
    }

    private final EditText yh() {
        return (EditText) this.h.a(this, n[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zh(c cVar) {
        z65.h(cVar, "this$0");
        gg5.d(cVar.yh());
    }

    @Override // defpackage.f8b
    public void H9(String str) {
        z65.h(str, "taxPayerId");
        yh().setText(str);
        yh().setSelection(yh().getText().length());
    }

    @Override // defpackage.f8b
    public void Q0(boolean z) {
        xh().setEnabled(z);
    }

    @Override // defpackage.f8b
    public void a() {
        gg5.c(yh());
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        wh().w(b.a.a);
        return true;
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        e97.a(yh(), new b());
        oma.a(uh(), new C0562c());
        oma.a(vh(), new d());
        oma.a(xh(), new e());
        ph();
        yh().postDelayed(new Runnable() { // from class: u7b
            @Override // java.lang.Runnable
            public final void run() {
                c.zh(c.this);
            }
        }, 300L);
    }
}
