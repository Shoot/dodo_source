package ru.dodopizza.app.presentation.checkout.emailforchecks;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.df3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.modules.presentation.checkout.CheckoutComponent;
import ru.dodopizza.app.presentation.checkout.emailforchecks.b;
import ru.dodopizza.app.presentation.checkout.emailforchecks.c;
/* compiled from: EmailForChecksFragment.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 12\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0013B\u0007¢\u0006\u0004\b/\u00100J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\bH\u0016R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010 \u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u001cR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010$R\u001b\u0010(\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010\u001cR\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u00062"}, d2 = {"Lru/dodopizza/app/presentation/checkout/emailforchecks/c;", "Lc70;", "Lkf3;", "Lw50;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "", "onBackPressed", "", "email", "Sg", "isSubscribed", "sc", "isEnabled", "Q0", "a", "Landroid/widget/EditText;", Image.TYPE_HIGH, "Lk79;", "xh", "()Landroid/widget/EditText;", "emailEditText", "i", "vh", "()Landroid/view/View;", "clearEmailButton", "j", "wh", "closeButton", "Landroid/widget/Switch;", "k", "Ah", "()Landroid/widget/Switch;", "subscribeToEmailSwitch", "l", "zh", "saveButton", "Lru/dodopizza/app/presentation/checkout/emailforchecks/EmailForChecksPresenter;", Image.TYPE_MEDIUM, "Lmoxy/ktx/MoxyKtxDelegate;", "yh", "()Lru/dodopizza/app/presentation/checkout/emailforchecks/EmailForChecksPresenter;", "presenter", "<init>", "()V", "n", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class c extends c70 implements kf3, w50 {
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final k79 l;
    private final MoxyKtxDelegate m;
    static final /* synthetic */ je5<Object>[] o = {bc9.f(new ar8(c.class, "emailEditText", "getEmailEditText()Landroid/widget/EditText;", 0)), bc9.f(new ar8(c.class, "clearEmailButton", "getClearEmailButton()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "closeButton", "getCloseButton()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "subscribeToEmailSwitch", "getSubscribeToEmailSwitch()Landroid/widget/Switch;", 0)), bc9.f(new ar8(c.class, "saveButton", "getSaveButton()Landroid/view/View;", 0)), bc9.f(new ar8(c.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/checkout/emailforchecks/EmailForChecksPresenter;", 0))};
    public static final a n = new a(null);

    /* compiled from: EmailForChecksFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lru/dodopizza/app/presentation/checkout/emailforchecks/c$a;", "", "Lgf3;", "data", "Lru/dodopizza/app/presentation/checkout/emailforchecks/c;", "a", "", "EXTRA_EMAIL", "Ljava/lang/String;", "EXTRA_IS_SUBSCRIBED", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(gf3 gf3Var) {
            z65.h(gf3Var, "data");
            return (c) y64.d(d70.a(new c(), false), bi0.c(bi0.d("extra_email", gf3Var.a()), bi0.d("extra_is_subscribed", Boolean.valueOf(gf3Var.b()))));
        }
    }

    /* compiled from: EmailForChecksFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "text", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
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
            z65.h(str, "text");
            c.this.yh().w(new b.c(str));
        }
    }

    /* compiled from: EmailForChecksFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.dodopizza.app.presentation.checkout.emailforchecks.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0537c extends ej5 implements Function1<View, Unit> {
        C0537c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.yh().w(b.C0536b.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: EmailForChecksFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.yh().w(b.a.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: EmailForChecksFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function1<View, Unit> {
        e() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            c.this.yh().w(b.d.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: EmailForChecksFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/presentation/checkout/emailforchecks/EmailForChecksPresenter;", "a", "()Lru/dodopizza/app/presentation/checkout/emailforchecks/EmailForChecksPresenter;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function0<EmailForChecksPresenter> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final EmailForChecksPresenter invoke() {
            df3.a J1 = ((CheckoutComponent) c.this.getComponentDependenciesRegistry().a(bc9.b(CheckoutComponent.class))).J1();
            Bundle arguments = c.this.getArguments();
            String str = (arguments == null || (str = arguments.get("extra_email")) == null) ? "" : "";
            if (str instanceof String) {
                df3.a b = J1.b((String) str);
                Bundle arguments2 = c.this.getArguments();
                Object obj = (arguments2 == null || (obj = arguments2.get("extra_is_subscribed")) == null) ? null : null;
                if (obj != null && !(obj instanceof Boolean)) {
                    throw new ClassCastException("Property extra_is_subscribed has different class type");
                } else if (obj != null) {
                    return b.c(((Boolean) obj).booleanValue()).a().a();
                } else {
                    throw new IllegalArgumentException("Argument with key = extra_is_subscribed not found in bundle");
                }
            }
            throw new ClassCastException("Property extra_email has different class type");
        }
    }

    public c() {
        super(R.layout.fragment_email_for_checks);
        this.h = kb0.e(this, R.id.email_edit_text);
        this.i = kb0.e(this, R.id.clear_email_button);
        this.j = kb0.e(this, R.id.close_button);
        this.k = kb0.e(this, R.id.subscribe_switch);
        this.l = kb0.e(this, R.id.save_button);
        f fVar = new f();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.m = new MoxyKtxDelegate(mvpDelegate, EmailForChecksPresenter.class.getName() + ".presenter", fVar);
    }

    private final Switch Ah() {
        return (Switch) this.k.a(this, o[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bh(c cVar, CompoundButton compoundButton, boolean z) {
        z65.h(cVar, "this$0");
        cVar.yh().w(new b.e(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ch(c cVar) {
        z65.h(cVar, "this$0");
        gg5.d(cVar.xh());
    }

    private final View vh() {
        return (View) this.i.a(this, o[1]);
    }

    private final View wh() {
        return (View) this.j.a(this, o[2]);
    }

    private final EditText xh() {
        return (EditText) this.h.a(this, o[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmailForChecksPresenter yh() {
        return (EmailForChecksPresenter) this.m.getValue(this, o[5]);
    }

    private final View zh() {
        return (View) this.l.a(this, o[4]);
    }

    @Override // defpackage.kf3
    public void Q0(boolean z) {
        zh().setEnabled(z);
    }

    @Override // defpackage.kf3
    public void Sg(String str) {
        z65.h(str, "email");
        xh().setText(str);
    }

    @Override // defpackage.kf3
    public void a() {
        gg5.c(xh());
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        yh().w(b.a.a);
        return true;
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        e97.a(xh(), new b());
        oma.a(vh(), new C0537c());
        oma.a(wh(), new d());
        Ah().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ef3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                c.Bh(c.this, compoundButton, z);
            }
        });
        oma.a(zh(), new e());
        ph();
        xh().postDelayed(new Runnable() { // from class: ff3
            @Override // java.lang.Runnable
            public final void run() {
                c.Ch(c.this);
            }
        }, 300L);
    }

    @Override // defpackage.kf3
    public void sc(boolean z) {
        Ah().setChecked(z);
    }
}
