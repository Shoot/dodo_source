package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import ru.dodopizza.app.R;
import ru.dodopizza.app.di.locality.LocalityComponent;
import ru.dodopizza.app.presentation.covid.CovidWarningPresenter;
/* compiled from: CovidWarningFragment.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001;B\u0007¢\u0006\u0004\b8\u00109J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0018R\u001b\u0010 \u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u00101\u001a\b\u0012\u0004\u0012\u00020*0)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R#\u00107\u001a\n 2*\u0004\u0018\u00010*0*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u0006<"}, d2 = {"Lb02;", "Lf70;", "Lm02;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "onAttach", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lk02;", "covidWarningVO", "I3", "Landroid/widget/ImageView;", com.huawei.hms.opendevice.c.a, "Lk79;", "oh", "()Landroid/widget/ImageView;", ElementGenerator.TYPE_IMAGE, "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "sh", "()Landroid/widget/TextView;", "title", e.a, "rh", "text", "f", "nh", "()Landroid/view/View;", "button", "Laub;", "g", "Laub;", "th", "()Laub;", "setUrlValidator", "(Laub;)V", "urlValidator", "Las8;", "Lru/dodopizza/app/presentation/covid/CovidWarningPresenter;", Image.TYPE_HIGH, "Las8;", "qh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "i", "Lmoxy/ktx/MoxyKtxDelegate;", "ph", "()Lru/dodopizza/app/presentation/covid/CovidWarningPresenter;", "presenter", "<init>", "()V", "j", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: b02  reason: default package */
/* loaded from: classes4.dex */
public final class b02 extends f70 implements m02 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    public aub g;
    public as8<CovidWarningPresenter> h;
    private final MoxyKtxDelegate i;
    static final /* synthetic */ je5<Object>[] k = {bc9.f(new ar8(b02.class, ElementGenerator.TYPE_IMAGE, "getImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(b02.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(b02.class, "text", "getText()Landroid/widget/TextView;", 0)), bc9.f(new ar8(b02.class, "button", "getButton()Landroid/view/View;", 0)), bc9.f(new ar8(b02.class, "presenter", "getPresenter()Lru/dodopizza/app/presentation/covid/CovidWarningPresenter;", 0))};
    public static final a j = new a(null);

    /* compiled from: CovidWarningFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lb02$a;", "", "Lb02;", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: b02$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b02 a() {
            return new b02();
        }
    }

    /* compiled from: CovidWarningFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b02$b */
    /* loaded from: classes4.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            b02.this.ph().r();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: CovidWarningFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lru/dodopizza/app/presentation/covid/CovidWarningPresenter;", "kotlin.jvm.PlatformType", "a", "()Lru/dodopizza/app/presentation/covid/CovidWarningPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b02$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<CovidWarningPresenter> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final CovidWarningPresenter invoke() {
            return b02.this.qh().get();
        }
    }

    public b02() {
        super(R.layout.fragment_covid_warning);
        this.c = kb0.e(this, R.id.image);
        this.d = kb0.e(this, R.id.title);
        this.e = kb0.e(this, R.id.text);
        this.f = kb0.e(this, R.id.ok_button);
        c cVar = new c();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.i = new MoxyKtxDelegate(mvpDelegate, CovidWarningPresenter.class.getName() + ".presenter", cVar);
    }

    private final View nh() {
        return (View) this.f.a(this, k[3]);
    }

    private final ImageView oh() {
        return (ImageView) this.c.a(this, k[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CovidWarningPresenter ph() {
        return (CovidWarningPresenter) this.i.getValue(this, k[4]);
    }

    private final TextView rh() {
        return (TextView) this.e.a(this, k[2]);
    }

    private final TextView sh() {
        return (TextView) this.d.a(this, k[1]);
    }

    @Override // defpackage.m02
    public void I3(k02 k02Var) {
        z65.h(k02Var, "covidWarningVO");
        sh().setText(k02Var.c());
        rh().setText(k02Var.b());
        if (th().a(k02Var.a())) {
            com.bumptech.glide.b.v(this).t(k02Var.a()).G0(oh());
        } else {
            oh().setImageResource(R.drawable.ic_covid_warning);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        super.onAttach(context);
        ((LocalityComponent) getComponentDependenciesRegistry().a(bc9.b(LocalityComponent.class))).o1().a(this);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        rh().setMovementMethod(new ScrollingMovementMethod());
        oma.a(nh(), new b());
    }

    public final as8<CovidWarningPresenter> qh() {
        as8<CovidWarningPresenter> as8Var = this.h;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    public final aub th() {
        aub aubVar = this.g;
        if (aubVar != null) {
            return aubVar;
        }
        z65.z("urlValidator");
        return null;
    }
}
