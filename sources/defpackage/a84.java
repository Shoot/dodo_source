package defpackage;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.controlling.feature.fullscreenimage.FullscreenImageFeatureDependencies;
import com.dodopizza.controlling.feature.fullscreenimage.presentation.FullscreenImagePresenter;
import com.google.android.material.appbar.AppBarLayout;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.u74;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: FullscreenImageFragment.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 G2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001HB\u0007¢\u0006\u0004\bE\u0010FJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0014R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\"R\u001b\u0010&\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010\"R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0016\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0016\u001a\u0004\b3\u00104R(\u0010>\u001a\b\u0012\u0004\u0012\u000207068\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R#\u0010D\u001a\n ?*\u0004\u0018\u000107078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C¨\u0006I"}, d2 = {"La84;", "Lf70;", "Lf84;", "Lw50;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "", "onBackPressed", "", "path", "z", "containsError", "Uf", "", "hh", "Landroid/widget/ImageView;", c.a, "Lk79;", "th", "()Landroid/widget/ImageView;", "photoView", "Landroid/widget/TextView;", DateTokenConverter.CONVERTER_KEY, "sh", "()Landroid/widget/TextView;", "failedActionDesc", "Landroid/widget/LinearLayout;", e.a, "wh", "()Landroid/widget/LinearLayout;", "removeButton", "f", "xh", "retryButton", "Landroid/widget/FrameLayout;", "g", "rh", "()Landroid/widget/FrameLayout;", "clickArea", "Lcom/google/android/material/appbar/AppBarLayout;", Image.TYPE_HIGH, "yh", "()Lcom/google/android/material/appbar/AppBarLayout;", "toolbar", "Landroid/widget/ImageButton;", "i", "qh", "()Landroid/widget/ImageButton;", "backButton", "Las8;", "Lcom/dodopizza/controlling/feature/fullscreenimage/presentation/FullscreenImagePresenter;", "j", "Las8;", "vh", "()Las8;", "setPresenterProvider$controlling_release", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "k", "Lmoxy/ktx/MoxyKtxDelegate;", "uh", "()Lcom/dodopizza/controlling/feature/fullscreenimage/presentation/FullscreenImagePresenter;", "presenter", "<init>", "()V", "l", "a", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: a84  reason: default package */
/* loaded from: classes.dex */
public final class a84 extends f70 implements f84, w50 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    public as8<FullscreenImagePresenter> j;
    private final MoxyKtxDelegate k;
    static final /* synthetic */ je5<Object>[] m = {bc9.f(new ar8(a84.class, "photoView", "getPhotoView()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(a84.class, "failedActionDesc", "getFailedActionDesc()Landroid/widget/TextView;", 0)), bc9.f(new ar8(a84.class, "removeButton", "getRemoveButton()Landroid/widget/LinearLayout;", 0)), bc9.f(new ar8(a84.class, "retryButton", "getRetryButton()Landroid/widget/LinearLayout;", 0)), bc9.f(new ar8(a84.class, "clickArea", "getClickArea()Landroid/widget/FrameLayout;", 0)), bc9.f(new ar8(a84.class, "toolbar", "getToolbar()Lcom/google/android/material/appbar/AppBarLayout;", 0)), bc9.f(new ar8(a84.class, "backButton", "getBackButton()Landroid/widget/ImageButton;", 0)), bc9.f(new ar8(a84.class, "presenter", "getPresenter()Lcom/dodopizza/controlling/feature/fullscreenimage/presentation/FullscreenImagePresenter;", 0))};
    public static final a l = new a(null);

    /* compiled from: FullscreenImageFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"La84$a;", "", "Lv74;", "data", "La84;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: a84$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a84 a(v74 v74Var) {
            z65.h(v74Var, "data");
            return (a84) y64.d(new a84(), bi0.c(bi0.d("key_data", v74Var)));
        }
    }

    /* compiled from: FullscreenImageFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/controlling/feature/fullscreenimage/presentation/FullscreenImagePresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/controlling/feature/fullscreenimage/presentation/FullscreenImagePresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: a84$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<FullscreenImagePresenter> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final FullscreenImagePresenter invoke() {
            return a84.this.vh().get();
        }
    }

    public a84() {
        super(wz8.fullscreen_image_layout);
        this.c = kb0.e(this, zx8.photo_view);
        this.d = kb0.e(this, zx8.failed_action_desc);
        this.e = kb0.e(this, zx8.v0);
        this.f = kb0.e(this, zx8.retry_button);
        this.g = kb0.e(this, zx8.click_area);
        this.h = kb0.e(this, zx8.appbar);
        this.i = kb0.e(this, zx8.b);
        b bVar = new b();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.k = new MoxyKtxDelegate(mvpDelegate, FullscreenImagePresenter.class.getName() + ".presenter", bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Ah(a84 a84Var, View view, MotionEvent motionEvent) {
        z65.h(a84Var, "this$0");
        int action = motionEvent.getAction();
        boolean z = false;
        if (action != 0) {
            return false;
        }
        AppBarLayout yh = a84Var.yh();
        if (a84Var.yh().getVisibility() == 8) {
            z = true;
        }
        un3.o(yh, z);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bh(a84 a84Var, View view) {
        z65.h(a84Var, "this$0");
        a84Var.uh().p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Ch(a84 a84Var, View view) {
        z65.h(a84Var, "this$0");
        a84Var.uh().q();
    }

    private final ImageButton qh() {
        return (ImageButton) this.i.a(this, m[6]);
    }

    private final FrameLayout rh() {
        return (FrameLayout) this.g.a(this, m[4]);
    }

    private final TextView sh() {
        return (TextView) this.d.a(this, m[1]);
    }

    private final ImageView th() {
        return (ImageView) this.c.a(this, m[0]);
    }

    private final FullscreenImagePresenter uh() {
        return (FullscreenImagePresenter) this.k.getValue(this, m[7]);
    }

    private final LinearLayout wh() {
        return (LinearLayout) this.e.a(this, m[2]);
    }

    private final LinearLayout xh() {
        return (LinearLayout) this.f.a(this, m[3]);
    }

    private final AppBarLayout yh() {
        return (AppBarLayout) this.h.a(this, m[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zh(a84 a84Var, View view) {
        z65.h(a84Var, "this$0");
        a84Var.uh().onBackPressed();
    }

    @Override // defpackage.f84
    public void Uf(boolean z) {
        un3.o(sh(), z);
        un3.o(xh(), z);
    }

    @Override // defpackage.f70
    protected int hh() {
        return lw8.a;
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        uh().onBackPressed();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        u74.b a2 = u74.a.a();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("key_data")) == null) ? null : null;
        if (obj != null && !(obj instanceof v74)) {
            throw new ClassCastException("Property key_data has different class type");
        } else if (obj != null) {
            a2.a((v74) obj, (FullscreenImageFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(FullscreenImageFeatureDependencies.class))).a(this);
            super.onCreate(bundle);
        } else {
            throw new IllegalArgumentException("Argument with key = key_data not found in bundle");
        }
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        qh().setOnClickListener(new View.OnClickListener() { // from class: w74
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a84.zh(a84.this, view2);
            }
        });
        rh().setOnTouchListener(new View.OnTouchListener() { // from class: x74
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean Ah;
                Ah = a84.Ah(a84.this, view2, motionEvent);
                return Ah;
            }
        });
        wh().setOnClickListener(new View.OnClickListener() { // from class: y74
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a84.Bh(a84.this, view2);
            }
        });
        xh().setOnClickListener(new View.OnClickListener() { // from class: z74
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                a84.Ch(a84.this, view2);
            }
        });
    }

    public final as8<FullscreenImagePresenter> vh() {
        as8<FullscreenImagePresenter> as8Var = this.j;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.f84
    public void z(String str) {
        z65.h(str, "path");
        com.bumptech.glide.b.u(th()).t(str).G0(th());
    }
}
