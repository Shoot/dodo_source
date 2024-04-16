package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.dodopizza.order.feature.assistant.AssistantFeatureDependencies;
import com.dodopizza.order.feature.assistant.generator.presentation.AssistantGeneratorPresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.dt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.MvpView;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: AssistantGeneratorFragment.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 #2\u00020\u00012\u00020\u0002:\u0001$B\u0007¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R#\u0010 \u001a\n \u001b*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lft;", "La70;", "", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "", "onBackPressed", "Landroid/widget/ImageButton;", Image.TYPE_HIGH, "Lk79;", "qh", "()Landroid/widget/ImageButton;", "backButton", "Las8;", "Lcom/dodopizza/order/feature/assistant/generator/presentation/AssistantGeneratorPresenter;", "i", "Las8;", "sh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "j", "Lmoxy/ktx/MoxyKtxDelegate;", "rh", "()Lcom/dodopizza/order/feature/assistant/generator/presentation/AssistantGeneratorPresenter;", "presenter", "<init>", "()V", "k", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ft  reason: default package */
/* loaded from: classes2.dex */
public final class ft extends a70 implements MvpView {
    private final k79 h;
    public as8<AssistantGeneratorPresenter> i;
    private final MoxyKtxDelegate j;
    static final /* synthetic */ je5<Object>[] l = {bc9.f(new ar8(ft.class, "backButton", "getBackButton()Landroid/widget/ImageButton;", 0)), bc9.f(new ar8(ft.class, "presenter", "getPresenter()Lcom/dodopizza/order/feature/assistant/generator/presentation/AssistantGeneratorPresenter;", 0))};
    public static final a k = new a(null);
    public static final int m = 8;

    /* compiled from: AssistantGeneratorFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lft$a;", "", "Let;", "data", "Lft;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ft$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ft a(et etVar) {
            z65.h(etVar, "data");
            return (ft) y64.d(new ft(), bi0.c(bi0.d("data", etVar)));
        }
    }

    /* compiled from: AssistantGeneratorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ft$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ft.this.rh().onBackPressed();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AssistantGeneratorFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/order/feature/assistant/generator/presentation/AssistantGeneratorPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/order/feature/assistant/generator/presentation/AssistantGeneratorPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ft$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function0<AssistantGeneratorPresenter> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AssistantGeneratorPresenter invoke() {
            return ft.this.sh().get();
        }
    }

    public ft() {
        super(gz8.fragment_assistant_generator);
        this.h = kb0.e(this, gy8.m);
        c cVar = new c();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.j = new MoxyKtxDelegate(mvpDelegate, AssistantGeneratorPresenter.class.getName() + ".presenter", cVar);
    }

    private final ImageButton qh() {
        return (ImageButton) this.h.a(this, l[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AssistantGeneratorPresenter rh() {
        return (AssistantGeneratorPresenter) this.j.getValue(this, l[1]);
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        rh().onBackPressed();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        dt.b a2 = dt.a.a();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
        if (obj != null && !(obj instanceof et)) {
            throw new ClassCastException("Property data has different class type");
        } else if (obj != null) {
            a2.a((et) obj, (AssistantFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(AssistantFeatureDependencies.class))).a(this);
            super.onCreate(bundle);
        } else {
            throw new IllegalArgumentException("Argument with key = data not found in bundle");
        }
    }

    @Override // defpackage.a70, defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oma.a(qh(), new b());
    }

    public final as8<AssistantGeneratorPresenter> sh() {
        as8<AssistantGeneratorPresenter> as8Var = this.i;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
