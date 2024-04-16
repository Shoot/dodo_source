package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.controlling.feature.feedbackphotos.FeedbackPhotosFeatureDependencies;
import com.dodopizza.controlling.feature.feedbackphotos.presentation.FeedbackPhotosPresenter;
import com.dodopizza.controlling.feature.feedbackphotos.presentation.PhotoPreviewViewHolder;
import defpackage.k6;
import defpackage.mr3;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: FeedbackPhotosFragment.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b \u0010!J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R#\u0010\u001f\u001a\n \u001a*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006$"}, d2 = {"Lpr3;", "Lf70;", "Lxr3;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "Lq58;", "photos", "ha", "Landroidx/recyclerview/widget/RecyclerView;", com.huawei.hms.opendevice.c.a, "Lk79;", "nh", "()Landroidx/recyclerview/widget/RecyclerView;", "feedbackPhotos", "Las8;", "Lcom/dodopizza/controlling/feature/feedbackphotos/presentation/FeedbackPhotosPresenter;", DateTokenConverter.CONVERTER_KEY, "Las8;", "ph", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", com.huawei.hms.push.e.a, "Lmoxy/ktx/MoxyKtxDelegate;", "oh", "()Lcom/dodopizza/controlling/feature/feedbackphotos/presentation/FeedbackPhotosPresenter;", "presenter", "<init>", "()V", "f", "a", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pr3  reason: default package */
/* loaded from: classes.dex */
public final class pr3 extends f70 implements xr3 {
    private final k79 c;
    public as8<FeedbackPhotosPresenter> d;
    private final MoxyKtxDelegate e;
    static final /* synthetic */ je5<Object>[] g = {bc9.f(new ar8(pr3.class, "feedbackPhotos", "getFeedbackPhotos()Landroidx/recyclerview/widget/RecyclerView;", 0)), bc9.f(new ar8(pr3.class, "presenter", "getPresenter()Lcom/dodopizza/controlling/feature/feedbackphotos/presentation/FeedbackPhotosPresenter;", 0))};
    public static final a f = new a(null);

    /* compiled from: FeedbackPhotosFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lpr3$a;", "", "Lnr3;", "data", "Landroid/os/Bundle;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: pr3$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bundle a(nr3 nr3Var) {
            z65.h(nr3Var, "data");
            return bi0.c(bi0.d("data", nr3Var));
        }
    }

    /* compiled from: FeedbackPhotosFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/controlling/feature/feedbackphotos/presentation/FeedbackPhotosPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/controlling/feature/feedbackphotos/presentation/FeedbackPhotosPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: pr3$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<FeedbackPhotosPresenter> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final FeedbackPhotosPresenter invoke() {
            return pr3.this.ph().get();
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "", "item", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: pr3$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function1<Object, Boolean> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            z65.h(obj, "item");
            return Boolean.valueOf(obj instanceof q58);
        }
    }

    /* compiled from: AdapterBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\n\b\u0001\u0010\u0002\u0018\u0001*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"D", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "VH", "Landroid/view/ViewGroup;", "parentView", "Landroid/view/LayoutInflater;", "layoutInflater", "Landroidx/recyclerview/widget/RecyclerView$d0;", "a", "(Landroid/view/ViewGroup;Landroid/view/LayoutInflater;)Landroidx/recyclerview/widget/RecyclerView$d0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: pr3$d */
    /* loaded from: classes.dex */
    public static final class d extends ej5 implements Function2<ViewGroup, LayoutInflater, RecyclerView.d0> {
        public static final d a = new d();

        public d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final RecyclerView.d0 invoke(ViewGroup viewGroup, LayoutInflater layoutInflater) {
            z65.h(viewGroup, "parentView");
            z65.h(layoutInflater, "layoutInflater");
            Object newInstance = PhotoPreviewViewHolder.class.getDeclaredConstructor(kzb.class).newInstance(new i07(viewGroup, layoutInflater));
            z65.g(newInstance, "newInstance(...)");
            return (RecyclerView.d0) newInstance;
        }
    }

    /* compiled from: FeedbackPhotosFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "path", "", "containsError", "", "a", "(Ljava/lang/String;Z)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: pr3$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function2<String, Boolean, Unit> {
        e() {
            super(2);
        }

        public final void a(String str, boolean z) {
            z65.h(str, "path");
            pr3.this.oh().K(str, z);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, Boolean bool) {
            a(str, bool.booleanValue());
            return Unit.a;
        }
    }

    public pr3() {
        super(wz8.fragment_feedback_photos);
        this.c = kb0.e(this, zx8.feedback_photos);
        b bVar = new b();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.e = new MoxyKtxDelegate(mvpDelegate, FeedbackPhotosPresenter.class.getName() + ".presenter", bVar);
    }

    private final RecyclerView nh() {
        return (RecyclerView) this.c.a(this, g[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FeedbackPhotosPresenter oh() {
        return (FeedbackPhotosPresenter) this.e.getValue(this, g[1]);
    }

    @Override // defpackage.xr3
    public void ha(List<q58> list) {
        z65.h(list, "photos");
        nh().setAdapter(new k6.a(new k6(list), c.a, new p58(new e()), d.a).b().d());
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        mr3.b a2 = mr3.a.a();
        FeedbackPhotosFeatureDependencies feedbackPhotosFeatureDependencies = (FeedbackPhotosFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(FeedbackPhotosFeatureDependencies.class));
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
        if (obj != null && !(obj instanceof nr3)) {
            throw new ClassCastException("Property data has different class type");
        } else if (obj != null) {
            a2.a(feedbackPhotosFeatureDependencies, (nr3) obj).a(this);
            super.onCreate(bundle);
        } else {
            throw new IllegalArgumentException("Argument with key = data not found in bundle");
        }
    }

    public final as8<FeedbackPhotosPresenter> ph() {
        as8<FeedbackPhotosPresenter> as8Var = this.d;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
