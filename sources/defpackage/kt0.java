package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.InfoMessage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gt0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.presentation.catchaddress.presenter.CatchAddressPresenter;
/* compiled from: CatchAddressFragment.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0001?B\u0007¢\u0006\u0004\b<\u0010=J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010#R\u001b\u0010'\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010#R\u001b\u0010+\u001a\u00020\u00038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0019\u001a\u0004\b3\u00104R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006@"}, d2 = {"Lkt0;", "Lf70;", "Ltt0;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "a4", "", "visible", "y2", "Ge", "p0", "Of", "a5", "I6", "G8", "O7", "w8", "X6", "rd", "Landroid/widget/TextView;", c.a, "Lk79;", "th", "()Landroid/widget/TextView;", "messageView", DateTokenConverter.CONVERTER_KEY, "sh", "messageTitleView", "Landroid/widget/Button;", e.a, "ph", "()Landroid/widget/Button;", "actionButton", "f", "rh", "exitButton", "g", "vh", "()Landroid/view/View;", "progressView", "Lcom/dodopizza/android/view/custom/InfoMessage;", Image.TYPE_HIGH, "qh", "()Lcom/dodopizza/android/view/custom/InfoMessage;", "alertMessage", "Landroidx/appcompat/widget/Toolbar;", "i", "wh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lru/dodopizza/app/presentation/catchaddress/presenter/CatchAddressPresenter;", "j", "Lmoxy/ktx/MoxyKtxDelegate;", "uh", "()Lru/dodopizza/app/presentation/catchaddress/presenter/CatchAddressPresenter;", "presenter", "<init>", "()V", "k", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: kt0  reason: default package */
/* loaded from: classes4.dex */
public final class kt0 extends f70 implements tt0 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final MoxyKtxDelegate j;
    static final /* synthetic */ je5<Object>[] l = {bc9.f(new ar8(kt0.class, "messageView", "getMessageView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(kt0.class, "messageTitleView", "getMessageTitleView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(kt0.class, "actionButton", "getActionButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(kt0.class, "exitButton", "getExitButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(kt0.class, "progressView", "getProgressView()Landroid/view/View;", 0)), bc9.f(new ar8(kt0.class, "alertMessage", "getAlertMessage()Lcom/dodopizza/android/view/custom/InfoMessage;", 0)), bc9.f(new ar8(kt0.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(kt0.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/catchaddress/presenter/CatchAddressPresenter;", 0))};
    public static final a k = new a(null);

    /* compiled from: CatchAddressFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lkt0$a;", "", "", "addressId", "", "withCarryout", "Lkt0;", "a", "KEY_ADDRESS_ID", "Ljava/lang/String;", "KEY_WITH_CARRYOUT", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: kt0$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kt0 a(String str, boolean z) {
            z65.h(str, "addressId");
            return (kt0) y64.d(new kt0(), bi0.c(bi0.d("key_address", str), bi0.d("key_with_carryout", Boolean.valueOf(z))));
        }
    }

    /* compiled from: CatchAddressFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lru/dodopizza/app/presentation/catchaddress/presenter/CatchAddressPresenter;", "a", "()Lru/dodopizza/app/presentation/catchaddress/presenter/CatchAddressPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kt0$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function0<CatchAddressPresenter> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final CatchAddressPresenter invoke() {
            Object obj;
            gt0.a a3 = ((LocalityComponent) kt0.this.getComponentDependenciesRegistry().a(bc9.b(LocalityComponent.class))).a3();
            Bundle arguments = kt0.this.getArguments();
            String str = (arguments == null || (str = arguments.get("key_address")) == null) ? "" : "";
            if (str instanceof String) {
                gt0.a c = a3.c((String) str);
                kt0 kt0Var = kt0.this;
                Boolean bool = Boolean.FALSE;
                Bundle arguments2 = kt0Var.getArguments();
                if (arguments2 != null && (obj = arguments2.get("key_with_carryout")) != null) {
                    bool = obj;
                }
                if (bool != null && !(bool instanceof Boolean)) {
                    throw new ClassCastException("Property key_with_carryout has different class type");
                } else if (bool != null) {
                    return c.b(bool.booleanValue()).a().a();
                } else {
                    throw new IllegalArgumentException("Argument with key = key_with_carryout not found in bundle");
                }
            }
            throw new ClassCastException("Property key_address has different class type");
        }
    }

    public kt0() {
        super(R.layout.fragment_catch_address);
        this.c = kb0.e(this, R.id.message);
        this.d = kb0.e(this, R.id.message_title);
        this.e = kb0.e(this, R.id.orange_button);
        this.f = kb0.e(this, R.id.white_button);
        this.g = kb0.e(this, R.id.progress_bar);
        this.h = kb0.e(this, R.id.info);
        this.i = kb0.e(this, R.id.toolbar);
        b bVar = new b();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.j = new MoxyKtxDelegate(mvpDelegate, CatchAddressPresenter.class.getName() + ".presenter", bVar);
    }

    private final Button ph() {
        return (Button) this.e.a(this, l[2]);
    }

    private final InfoMessage qh() {
        return (InfoMessage) this.h.a(this, l[5]);
    }

    private final Button rh() {
        return (Button) this.f.a(this, l[3]);
    }

    private final TextView sh() {
        return (TextView) this.d.a(this, l[1]);
    }

    private final TextView th() {
        return (TextView) this.c.a(this, l[0]);
    }

    private final CatchAddressPresenter uh() {
        return (CatchAddressPresenter) this.j.getValue(this, l[7]);
    }

    private final View vh() {
        return (View) this.g.a(this, l[4]);
    }

    private final Toolbar wh() {
        return (Toolbar) this.i.a(this, l[6]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void xh(kt0 kt0Var, View view) {
        z65.h(kt0Var, "this$0");
        kt0Var.uh().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void yh(kt0 kt0Var, View view) {
        z65.h(kt0Var, "this$0");
        kt0Var.uh().w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zh(kt0 kt0Var, View view) {
        z65.h(kt0Var, "this$0");
        kt0Var.uh().y();
    }

    @Override // defpackage.tt0
    public void G8() {
        rh().setText(R.string.select_carryout);
    }

    @Override // defpackage.tt0
    public void Ge(boolean z) {
        un3.o(rh(), z);
    }

    @Override // defpackage.tt0
    public void I6() {
        ph().setText(R.string.enter_phone_number);
    }

    @Override // defpackage.tt0
    public void O7() {
        rh().setText(R.string.skip);
    }

    @Override // defpackage.tt0
    public void Of() {
        qh().i(getString(R.string.promocode_failure_error), 3000);
    }

    @Override // defpackage.tt0
    public void X6() {
        th().setText(R.string.catch_address_message_success_1);
    }

    @Override // defpackage.tt0
    public void a4() {
        sh().setText(R.string.catch_address_message_title_success);
    }

    @Override // defpackage.tt0
    public void a5() {
        ph().setText(R.string.subscribe_sms);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        wh().setNavigationOnClickListener(new View.OnClickListener() { // from class: ht0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                kt0.xh(kt0.this, view2);
            }
        });
        ph().setOnClickListener(new View.OnClickListener() { // from class: it0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                kt0.yh(kt0.this, view2);
            }
        });
        rh().setOnClickListener(new View.OnClickListener() { // from class: jt0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                kt0.zh(kt0.this, view2);
            }
        });
    }

    @Override // defpackage.tt0
    public void p0(boolean z) {
        un3.o(vh(), z);
    }

    @Override // defpackage.tt0
    public void rd() {
        ph().setText(R.string.ready);
    }

    @Override // defpackage.tt0
    public void w8() {
        th().setText(R.string.catch_address_message_success_2);
    }

    @Override // defpackage.tt0
    public void y2(boolean z) {
        un3.o(ph(), z);
    }
}
