package defpackage;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p;
import androidx.savedstate.a;
import com.dodopizza.controlling.feature.ratingcomment.RatingCommentFeatureDependencies;
import com.dodopizza.controlling.feature.ratingcomment.di.RatingCommentComponent;
import com.dodopizza.controlling.feature.ratingcomment.presentation.RatingCommentPresenter;
import com.google.android.material.appbar.AppBarLayout;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.f71;
import java.io.File;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: RatingCommentFragment.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ^2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001_B\u0007¢\u0006\u0004\b\\\u0010]J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0003J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\b\u0010\u001f\u001a\u00020\u0007H\u0016J\b\u0010 \u001a\u00020\nH\u0016J\b\u0010!\u001a\u00020\nH\u0016J\u0010\u0010$\u001a\u00020\n2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u001cH\u0016J\u0010\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u0007H\u0016J\u0010\u0010)\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u0007H\u0016J\u0010\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020*H\u0016J\u0010\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0007H\u0016R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u0010=R\u001b\u0010B\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00101\u001a\u0004\b@\u0010AR(\u0010K\u001a\b\u0012\u0004\u0012\u00020D0C8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR#\u0010Q\u001a\n L*\u0004\u0018\u00010D0D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR \u0010[\u001a\b\u0012\u0004\u0012\u00020V0U8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z¨\u0006`"}, d2 = {"Lt59;", "Lr53;", "Ld69;", "Lw50;", "Lf71$d;", "Lb69;", "vh", "", "Dh", "isPhotosToolbarVisible", "", "Hh", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/app/Dialog;", "dialog", "kh", "stateToSave", "g3", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "", "comment", "dc", "onBackPressed", "onResume", "onPause", "", "failedPhotosNumber", "ah", "optionId", "xe", "visible", "yf", "U6", "Lnr3;", "data", "U7", "highlightButton", "f4", "Landroid/widget/EditText;", com.huawei.hms.push.e.a, "Lk79;", "wh", "()Landroid/widget/EditText;", "commentInput", "Landroidx/core/widget/NestedScrollView;", "f", "xh", "()Landroidx/core/widget/NestedScrollView;", "commentInputScrollContainer", "Lcom/google/android/material/appbar/AppBarLayout;", "g", "zh", "()Lcom/google/android/material/appbar/AppBarLayout;", "feedbackPhotosToolbar", Image.TYPE_HIGH, "Ah", "()Landroid/view/View;", "photoPickerButtonContainer", "Las8;", "Lcom/dodopizza/controlling/feature/ratingcomment/presentation/RatingCommentPresenter;", "i", "Las8;", "Ch", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "j", "Lmoxy/ktx/MoxyKtxDelegate;", "Bh", "()Lcom/dodopizza/controlling/feature/ratingcomment/presentation/RatingCommentPresenter;", "presenter", "k", "Lb69;", "state", "Lcma;", "Lcom/dodopizza/controlling/feature/ratingcomment/di/RatingCommentComponent;", "l", "Lcma;", "yh", "()Lcma;", "componentDependenciesRegistry", "<init>", "()V", Image.TYPE_MEDIUM, "a", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: t59  reason: default package */
/* loaded from: classes.dex */
public final class t59 extends r53 implements d69, w50, f71.d {
    private final k79 e = kb0.e(this, zx8.rating_comment_input);
    private final k79 f = kb0.e(this, zx8.rating_comment_scroll_container);
    private final k79 g = kb0.e(this, zx8.feedback_photos_toolbar);
    private final k79 h = kb0.e(this, zx8.photo_picker_button_container);
    public as8<RatingCommentPresenter> i;
    private final MoxyKtxDelegate j;
    private b69 k;
    private final cma<RatingCommentComponent> l;
    static final /* synthetic */ je5<Object>[] n = {bc9.f(new ar8(t59.class, "commentInput", "getCommentInput()Landroid/widget/EditText;", 0)), bc9.f(new ar8(t59.class, "commentInputScrollContainer", "getCommentInputScrollContainer()Landroidx/core/widget/NestedScrollView;", 0)), bc9.f(new ar8(t59.class, "feedbackPhotosToolbar", "getFeedbackPhotosToolbar()Lcom/google/android/material/appbar/AppBarLayout;", 0)), bc9.f(new ar8(t59.class, "photoPickerButtonContainer", "getPhotoPickerButtonContainer()Landroid/view/View;", 0)), bc9.f(new ar8(t59.class, "presenter", "getPresenter()Lcom/dodopizza/controlling/feature/ratingcomment/presentation/RatingCommentPresenter;", 0))};
    public static final a m = new a(null);

    /* compiled from: RatingCommentFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, d2 = {"Lt59$a;", "", "Lm59;", "data", "Lt59;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "OPTION_REMOVE_FAILED_PHOTOS", "OPTION_RETRY_FAILED_PHOTOS_UPLOAD", "STATE_BUNDLE_KEY", "STATE_KEY", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: t59$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t59 a(m59 m59Var) {
            z65.h(m59Var, "data");
            return (t59) y64.d(new t59(), bi0.c(bi0.d("data", m59Var)));
        }
    }

    /* compiled from: RatingCommentFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/controlling/feature/ratingcomment/di/RatingCommentComponent;", "a", "()Lcom/dodopizza/controlling/feature/ratingcomment/di/RatingCommentComponent;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: t59$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<RatingCommentComponent> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final RatingCommentComponent invoke() {
            RatingCommentComponent.b a = RatingCommentComponent.d.a();
            b69 vh = t59.this.vh();
            Bundle arguments = t59.this.getArguments();
            Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
            if (obj != null && !(obj instanceof m59)) {
                throw new ClassCastException("Property data has different class type");
            } else if (obj != null) {
                return a.a(vh, (m59) obj, t59.this.Dh(), (RatingCommentFeatureDependencies) t59.this.getComponentDependenciesRegistry().a(bc9.b(RatingCommentFeatureDependencies.class)));
            } else {
                throw new IllegalArgumentException("Argument with key = data not found in bundle");
            }
        }
    }

    /* compiled from: RatingCommentFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: t59$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            t59.this.Bh().t();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: RatingCommentFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: t59$d */
    /* loaded from: classes.dex */
    /* synthetic */ class d extends m94 implements Function1<String, Unit> {
        d(Object obj) {
            super(1, obj, RatingCommentPresenter.class, "onCommentEdited", "onCommentEdited(Ljava/lang/String;)V", 0);
        }

        public final void b(String str) {
            z65.h(str, "p0");
            ((RatingCommentPresenter) this.receiver).u(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            b(str);
            return Unit.a;
        }
    }

    /* compiled from: RatingCommentFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: t59$e */
    /* loaded from: classes.dex */
    /* synthetic */ class e extends m94 implements Function1<File, Unit> {
        e(Object obj) {
            super(1, obj, RatingCommentPresenter.class, "onPhotoSelected", "onPhotoSelected(Ljava/io/File;)V", 0);
        }

        public final void b(File file) {
            z65.h(file, "p0");
            ((RatingCommentPresenter) this.receiver).w(file);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(File file) {
            b(file);
            return Unit.a;
        }
    }

    /* compiled from: RatingCommentFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/controlling/feature/ratingcomment/presentation/RatingCommentPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/controlling/feature/ratingcomment/presentation/RatingCommentPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: t59$f */
    /* loaded from: classes.dex */
    static final class f extends ej5 implements Function0<RatingCommentPresenter> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final RatingCommentPresenter invoke() {
            return t59.this.Ch().get();
        }
    }

    public t59() {
        f fVar = new f();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.j = new MoxyKtxDelegate(mvpDelegate, RatingCommentPresenter.class.getName() + ".presenter", fVar);
        this.l = new cma<>(eu2.d(this), bc9.b(RatingCommentComponent.class), new b());
    }

    private final View Ah() {
        return (View) this.h.a(this, n[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RatingCommentPresenter Bh() {
        return (RatingCommentPresenter) this.j.getValue(this, n[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"UnsupportedChromeOsCameraSystemFeature"})
    public final boolean Dh() {
        Boolean bool;
        PackageManager packageManager;
        Context context = getContext();
        if (context != null && (packageManager = context.getPackageManager()) != null) {
            bool = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.camera"));
        } else {
            bool = null;
        }
        return ((Boolean) mh5.c(bool, Boolean.FALSE)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle Eh(t59 t59Var) {
        z65.h(t59Var, "this$0");
        return bi0.c(bi0.d("state", t59Var.k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Fh(t59 t59Var, TextView textView, int i, KeyEvent keyEvent) {
        z65.h(t59Var, "this$0");
        if (i == 6) {
            t59Var.Bh().v();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Gh(t59 t59Var) {
        boolean z;
        z65.h(t59Var, "this$0");
        if (t59Var.xh().getScrollY() != 0) {
            z = true;
        } else {
            z = false;
        }
        t59Var.zh().x(z);
    }

    private final void Hh(boolean z) {
        int i;
        if (z) {
            i = -wh().getPaddingTop();
        } else {
            i = 0;
        }
        p45.j(xh(), 0, i, 0, 0, 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b69 vh() {
        Serializable serializable;
        Bundle b2 = getSavedStateRegistry().b("state_bundle");
        if (b2 != null) {
            serializable = b2.getSerializable("state");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof b69)) {
            return null;
        }
        return (b69) serializable;
    }

    private final EditText wh() {
        return (EditText) this.e.a(this, n[0]);
    }

    private final NestedScrollView xh() {
        return (NestedScrollView) this.f.a(this, n[1]);
    }

    private final AppBarLayout zh() {
        return (AppBarLayout) this.g.a(this, n[2]);
    }

    public final as8<RatingCommentPresenter> Ch() {
        as8<RatingCommentPresenter> as8Var = this.i;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.d69
    public void U6(boolean z) {
        un3.o(Ah(), z);
    }

    @Override // defpackage.d69
    public void U7(nr3 nr3Var) {
        z65.h(nr3Var, "data");
        FragmentManager childFragmentManager = getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        p p = childFragmentManager.p();
        z65.g(p, "beginTransaction()");
        v8c.a(p, zx8.feedback_photos_container, nr3Var);
        p.l();
    }

    @Override // defpackage.d69
    public void ah(int i) {
        int i2 = g19.try_again_label;
        int i3 = lx8.c;
        int i4 = lw8.c;
        nb7 nb7Var = new nb7("option_retry_image_loading", i2, i3, i4);
        nb7 nb7Var2 = new nb7("option_send_without_error_photo", g19.send_without_label, lx8.ic_send, i4);
        f71.a aVar = new f71.a();
        String string = getString(g19.failed_to_load_photo_label, Integer.valueOf(i));
        z65.g(string, "getString(...)");
        aVar.b(string).a(nb7Var).a(nb7Var2).c(this);
    }

    @Override // defpackage.d69
    public void dc(String str) {
        z65.h(str, "comment");
        wh().setText(str);
        wh().setSelection(wh().getText().length());
    }

    @Override // defpackage.d69
    public void f4(boolean z) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        z65.g(childFragmentManager, "getChildFragmentManager(...)");
        p p = childFragmentManager.p();
        z65.g(p, "beginTransaction()");
        w8c.a(p, zx8.photo_picker_button_container, new m58(z));
        p.l();
    }

    @Override // defpackage.d69
    public void g3(b69 b69Var) {
        z65.h(b69Var, "stateToSave");
        this.k = b69Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.r53
    public void kh(Dialog dialog) {
        z65.h(dialog, "dialog");
        super.kh(dialog);
        View findViewById = dialog.findViewById(zx8.E0);
        z65.g(findViewById, "findViewById(...)");
        oma.a(findViewById, new c());
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        Bh().t();
        return true;
    }

    @Override // moxy.MvpBottomSheetDialogFragment, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        setCancelable(false);
        getComponentDependenciesRegistry().b().P1(this);
        super.onCreate(bundle);
        setStyle(0, q19.BottomSheetWithoutFloatingStyle);
        getSavedStateRegistry().h("state_bundle", new a.c() { // from class: q59
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle Eh;
                Eh = t59.Eh(t59.this);
                return Eh;
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        return layoutInflater.inflate(wz8.fragment_rating_comment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        gg5.c(wh());
    }

    @Override // moxy.MvpBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        gg5.d(wh());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        jb0.a.a(this);
        boolean z = true;
        wh().setRawInputType(1);
        wh().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: r59
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean Fh;
                Fh = t59.Fh(t59.this, textView, i, keyEvent);
                return Fh;
            }
        });
        EditText wh = wh();
        RatingCommentPresenter Bh = Bh();
        z65.g(Bh, "<get-presenter>(...)");
        e97.a(wh, new d(Bh));
        zh().v(true);
        xh().getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: s59
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                t59.Gh(t59.this);
            }
        });
        if (zh().getVisibility() != 0) {
            z = false;
        }
        Hh(z);
        RatingCommentPresenter Bh2 = Bh();
        z65.g(Bh2, "<get-presenter>(...)");
        w8c.b(this, new e(Bh2));
    }

    @Override // defpackage.f71.d
    public void xe(String str) {
        z65.h(str, "optionId");
        if (z65.c(str, "option_retry_image_loading")) {
            Bh().y();
        } else if (z65.c(str, "option_send_without_error_photo")) {
            Bh().x();
        }
    }

    @Override // defpackage.d69
    public void yf(boolean z) {
        un3.o(zh(), z);
        Hh(z);
    }

    @Override // defpackage.r53, defpackage.lm1
    /* renamed from: yh */
    public cma<RatingCommentComponent> getComponentDependenciesRegistry() {
        return this.l;
    }
}
