package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import com.dodopizza.order.feature.assistant.AssistantFeatureDependencies;
import com.dodopizza.order.feature.assistant.preferences.presentation.AssistantPreferenceViewHolder;
import com.dodopizza.order.feature.assistant.preferences.presentation.AssistantPreferencesPresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ev;
import defpackage.k6;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: AssistantPreferencesFragment.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00016B\u0007¢\u0006\u0004\b3\u00104J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u001dR(\u0010'\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R#\u0010-\u001a\n (*\u0004\u0018\u00010 0 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00067"}, d2 = {"Lgv;", "La70;", "Lqv;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "", "onBackPressed", "Lov;", "preferencesVO", "X7", "Landroidx/recyclerview/widget/RecyclerView;", Image.TYPE_HIGH, "Lk79;", "sh", "()Landroidx/recyclerview/widget/RecyclerView;", "preferenceList", "Landroid/widget/Button;", "i", "rh", "()Landroid/widget/Button;", "nextButton", "Landroid/widget/ImageButton;", "j", "qh", "()Landroid/widget/ImageButton;", "backButton", "Las8;", "Lcom/dodopizza/order/feature/assistant/preferences/presentation/AssistantPreferencesPresenter;", "k", "Las8;", "uh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "l", "Lmoxy/ktx/MoxyKtxDelegate;", "th", "()Lcom/dodopizza/order/feature/assistant/preferences/presentation/AssistantPreferencesPresenter;", "presenter", "Ll6;", "Lkv;", Image.TYPE_MEDIUM, "Ll6;", "preferences", "<init>", "()V", "n", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gv  reason: default package */
/* loaded from: classes2.dex */
public final class gv extends a70 implements qv {
    private final k79 h;
    private final k79 i;
    private final k79 j;
    public as8<AssistantPreferencesPresenter> k;
    private final MoxyKtxDelegate l;
    private final l6<kv> m;
    static final /* synthetic */ je5<Object>[] o = {bc9.f(new ar8(gv.class, "preferenceList", "getPreferenceList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(gv.class, "nextButton", "getNextButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(gv.class, "backButton", "getBackButton()Landroid/widget/ImageButton;", 0)), bc9.f(new ar8(gv.class, "presenter", "getPresenter()Lcom/dodopizza/order/feature/assistant/preferences/presentation/AssistantPreferencesPresenter;", 0))};
    public static final a n = new a(null);
    public static final int p = 8;

    /* compiled from: AssistantPreferencesFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lgv$a;", "", "Lfv;", "data", "Lgv;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gv$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final gv a(fv fvVar) {
            z65.h(fvVar, "data");
            return (gv) y64.d(new gv(), bi0.c(bi0.d("data", fvVar)));
        }
    }

    /* compiled from: AssistantPreferencesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: gv$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            gv.this.th().u();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AssistantPreferencesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: gv$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            gv.this.th().onBackPressed();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AssistantPreferencesFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gv$d */
    /* loaded from: classes2.dex */
    /* synthetic */ class d extends m94 implements Function1<av, Unit> {
        d(Object obj) {
            super(1, obj, AssistantPreferencesPresenter.class, "onPreferenceSelected", "onPreferenceSelected(Lcom/dodopizza/order/domain/assistant/settings/AssistantPreference;)V", 0);
        }

        public final void b(av avVar) {
            z65.h(avVar, "p0");
            ((AssistantPreferencesPresenter) this.receiver).v(avVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(av avVar) {
            b(avVar);
            return Unit.a;
        }
    }

    /* compiled from: AssistantPreferencesFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gv$e */
    /* loaded from: classes2.dex */
    /* synthetic */ class e extends m94 implements Function1<av, Unit> {
        e(Object obj) {
            super(1, obj, AssistantPreferencesPresenter.class, "onPreferenceUnselected", "onPreferenceUnselected(Lcom/dodopizza/order/domain/assistant/settings/AssistantPreference;)V", 0);
        }

        public final void b(av avVar) {
            z65.h(avVar, "p0");
            ((AssistantPreferencesPresenter) this.receiver).w(avVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(av avVar) {
            b(avVar);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: gv$f */
    /* loaded from: classes2.dex */
    public static final class f extends ej5 implements Function1<Object, Boolean> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof kv);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: gv$g */
    /* loaded from: classes2.dex */
    public static final class g extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final g a = new g();

        public g() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = AssistantPreferenceViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AssistantPreferencesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/order/feature/assistant/preferences/presentation/AssistantPreferencesPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/order/feature/assistant/preferences/presentation/AssistantPreferencesPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: gv$h */
    /* loaded from: classes2.dex */
    static final class h extends ej5 implements Function0<AssistantPreferencesPresenter> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AssistantPreferencesPresenter invoke() {
            return gv.this.uh().get();
        }
    }

    /* compiled from: AssistantPreferencesFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lkv;", "old", "new", "Landroidx/recyclerview/widget/e$e;", "a", "(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/e$e;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: gv$i */
    /* loaded from: classes2.dex */
    static final class i extends ej5 implements Function2<List<? extends kv>, List<? extends kv>, e.C0047e> {
        public static final i a = new i();

        i() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final e.C0047e invoke(List<kv> list, List<kv> list2) {
            z65.h(list, "old");
            z65.h(list2, "new");
            e.C0047e b = androidx.recyclerview.widget.e.b(new lv(list, list2));
            z65.g(b, "calculateDiff(...)");
            return b;
        }
    }

    public gv() {
        super(gz8.fragment_assistant_preferences);
        this.h = kb0.e(this, gy8.preference_list);
        this.i = kb0.e(this, gy8.next);
        this.j = kb0.e(this, gy8.m);
        h hVar = new h();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.l = new MoxyKtxDelegate(mvpDelegate, AssistantPreferencesPresenter.class.getName() + ".presenter", hVar);
        this.m = new l6<>(null, 1, null);
    }

    private final ImageButton qh() {
        return (ImageButton) this.j.a(this, o[2]);
    }

    private final Button rh() {
        return (Button) this.i.a(this, o[1]);
    }

    private final RecyclerView sh() {
        return (RecyclerView) this.h.a(this, o[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AssistantPreferencesPresenter th() {
        return (AssistantPreferencesPresenter) this.l.getValue(this, o[3]);
    }

    @Override // defpackage.qv
    public void X7(ov ovVar) {
        z65.h(ovVar, "preferencesVO");
        this.m.Z(ovVar.a(), i.a);
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        th().onBackPressed();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        ev.b a2 = ev.a.a();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
        if (obj != null && !(obj instanceof fv)) {
            throw new ClassCastException("Property data has different class type");
        } else if (obj != null) {
            a2.a((fv) obj, (AssistantFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(AssistantFeatureDependencies.class))).a(this);
            super.onCreate(bundle);
        } else {
            throw new IllegalArgumentException("Argument with key = data not found in bundle");
        }
    }

    @Override // defpackage.a70, defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oma.a(rh(), new b());
        oma.a(qh(), new c());
        sh().addItemDecoration(new eyb(12, 0, 0));
        RecyclerView sh = sh();
        k6 k6Var = new k6(this.m);
        AssistantPreferencesPresenter th = th();
        z65.g(th, "<get-presenter>(...)");
        d dVar = new d(th);
        AssistantPreferencesPresenter th2 = th();
        z65.g(th2, "<get-presenter>(...)");
        new k6.a(k6Var, f.a, new bv(dVar, new e(th2)), g.a).b();
        sh.setAdapter(k6Var.d());
    }

    public final as8<AssistantPreferencesPresenter> uh() {
        as8<AssistantPreferencesPresenter> as8Var = this.k;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
