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
import com.dodopizza.order.feature.assistant.mood.presentation.AssistantMoodPresenter;
import com.dodopizza.order.feature.assistant.mood.presentation.AssistantMoodViewHolder;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.k6;
import defpackage.lu;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: AssistantMoodFragment.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u0002:\u00019B\u0007¢\u0006\u0004\b6\u00107J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010 R(\u0010*\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R#\u00100\u001a\n +*\u0004\u0018\u00010#0#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001a\u00105\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u0006:"}, d2 = {"Lou;", "La70;", "Lyu;", "Lju;", "mood", "", "wh", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "", "onBackPressed", "Lwu;", "moodVO", "o4", "Landroidx/recyclerview/widget/RecyclerView;", Image.TYPE_HIGH, "Lk79;", "sh", "()Landroidx/recyclerview/widget/RecyclerView;", "moodList", "Landroid/widget/Button;", "i", "th", "()Landroid/widget/Button;", "nextButton", "Landroid/widget/ImageButton;", "j", "rh", "()Landroid/widget/ImageButton;", "backButton", "Las8;", "Lcom/dodopizza/order/feature/assistant/mood/presentation/AssistantMoodPresenter;", "k", "Las8;", "vh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "l", "Lmoxy/ktx/MoxyKtxDelegate;", "uh", "()Lcom/dodopizza/order/feature/assistant/mood/presentation/AssistantMoodPresenter;", "presenter", "Ll6;", "Lsu;", Image.TYPE_MEDIUM, "Ll6;", "moods", "<init>", "()V", "n", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ou  reason: default package */
/* loaded from: classes2.dex */
public final class ou extends a70 implements yu {
    private final k79 h;
    private final k79 i;
    private final k79 j;
    public as8<AssistantMoodPresenter> k;
    private final MoxyKtxDelegate l;
    private final l6<su> m;
    static final /* synthetic */ je5<Object>[] o = {bc9.f(new ar8(ou.class, "moodList", "getMoodList()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(ou.class, "nextButton", "getNextButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(ou.class, "backButton", "getBackButton()Landroid/widget/ImageButton;", 0)), bc9.f(new ar8(ou.class, "presenter", "getPresenter()Lcom/dodopizza/order/feature/assistant/mood/presentation/AssistantMoodPresenter;", 0))};
    public static final a n = new a(null);
    public static final int p = 8;

    /* compiled from: AssistantMoodFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lou$a;", "", "Lmu;", "data", "Lou;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ou$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ou a(mu muVar) {
            z65.h(muVar, "data");
            return (ou) y64.d(new ou(), bi0.c(bi0.d("data", muVar)));
        }
    }

    /* compiled from: AssistantMoodFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ou$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ou.this.uh().u();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AssistantMoodFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ou$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ou.this.uh().onBackPressed();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AssistantMoodFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ou$d */
    /* loaded from: classes2.dex */
    /* synthetic */ class d extends m94 implements Function1<ju, Unit> {
        d(Object obj) {
            super(1, obj, ou.class, "onSelectedMoodChange", "onSelectedMoodChange(Lcom/dodopizza/order/domain/assistant/settings/AssistantMood;)V", 0);
        }

        public final void b(ju juVar) {
            z65.h(juVar, "p0");
            ((ou) this.receiver).wh(juVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ju juVar) {
            b(juVar);
            return Unit.a;
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ou$e */
    /* loaded from: classes2.dex */
    public static final class e extends ej5 implements Function1<Object, Boolean> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof su);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ou$f */
    /* loaded from: classes2.dex */
    public static final class f extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final f a = new f();

        public f() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = AssistantMoodViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: AssistantMoodFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/order/feature/assistant/mood/presentation/AssistantMoodPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/order/feature/assistant/mood/presentation/AssistantMoodPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ou$g */
    /* loaded from: classes2.dex */
    static final class g extends ej5 implements Function0<AssistantMoodPresenter> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AssistantMoodPresenter invoke() {
            return ou.this.vh().get();
        }
    }

    /* compiled from: AssistantMoodFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lsu;", "old", "new", "Landroidx/recyclerview/widget/e$e;", "a", "(Ljava/util/List;Ljava/util/List;)Landroidx/recyclerview/widget/e$e;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ou$h */
    /* loaded from: classes2.dex */
    static final class h extends ej5 implements Function2<List<? extends su>, List<? extends su>, e.C0047e> {
        public static final h a = new h();

        h() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final e.C0047e invoke(List<su> list, List<su> list2) {
            z65.h(list, "old");
            z65.h(list2, "new");
            e.C0047e b = androidx.recyclerview.widget.e.b(new tu(list, list2));
            z65.g(b, "calculateDiff(...)");
            return b;
        }
    }

    public ou() {
        super(gz8.fragment_assistant_mood);
        this.h = kb0.e(this, gy8.mood_list);
        this.i = kb0.e(this, gy8.next);
        this.j = kb0.e(this, gy8.m);
        g gVar = new g();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.l = new MoxyKtxDelegate(mvpDelegate, AssistantMoodPresenter.class.getName() + ".presenter", gVar);
        this.m = new l6<>(null, 1, null);
    }

    private final ImageButton rh() {
        return (ImageButton) this.j.a(this, o[2]);
    }

    private final RecyclerView sh() {
        return (RecyclerView) this.h.a(this, o[0]);
    }

    private final Button th() {
        return (Button) this.i.a(this, o[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AssistantMoodPresenter uh() {
        return (AssistantMoodPresenter) this.l.getValue(this, o[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wh(ju juVar) {
        if (juVar.a() != null) {
            oh(juVar.a());
        }
        uh().v(juVar);
    }

    @Override // defpackage.yu
    public void o4(wu wuVar) {
        z65.h(wuVar, "moodVO");
        Button th = th();
        List<su> a2 = wuVar.a();
        boolean z = false;
        if (!(a2 instanceof Collection) || !a2.isEmpty()) {
            Iterator<T> it = a2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((su) it.next()).b()) {
                    z = true;
                    break;
                }
            }
        }
        th.setEnabled(z);
        this.m.Z(wuVar.a(), h.a);
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        uh().onBackPressed();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        lu.b a2 = lu.a.a();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
        if (obj != null && !(obj instanceof mu)) {
            throw new ClassCastException("Property data has different class type");
        } else if (obj != null) {
            a2.a((mu) obj, (AssistantFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(AssistantFeatureDependencies.class))).a(this);
            super.onCreate(bundle);
        } else {
            throw new IllegalArgumentException("Argument with key = data not found in bundle");
        }
    }

    @Override // defpackage.a70, defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oma.a(th(), new b());
        oma.a(rh(), new c());
        RecyclerView sh = sh();
        k6 k6Var = new k6(this.m);
        new k6.a(k6Var, e.a, new ku(new d(this)), f.a).b();
        sh.setAdapter(k6Var.d());
    }

    public final as8<AssistantMoodPresenter> vh() {
        as8<AssistantMoodPresenter> as8Var = this.k;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
