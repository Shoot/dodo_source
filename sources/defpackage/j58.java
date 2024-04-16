package defpackage;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.controlling.feature.photopickerbutton.PhotoPickerButtonFeatureDependencies;
import com.dodopizza.controlling.feature.photopickerbutton.presentation.PhotoPickerButtonPresenter;
import com.huawei.hms.push.e;
import defpackage.j58;
import java.io.File;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: PhotoPickerButtonFragment.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001%B\u0007¢\u0006\u0004\b\"\u0010#J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0016R(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R#\u0010\u001b\u001a\n \u0016*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lj58;", "Lf70;", "Lo58;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "Ljava/io/File;", "photoFile", "m8", "Las8;", "Lcom/dodopizza/controlling/feature/photopickerbutton/presentation/PhotoPickerButtonPresenter;", com.huawei.hms.opendevice.c.a, "Las8;", "ph", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lmoxy/ktx/MoxyKtxDelegate;", "oh", "()Lcom/dodopizza/controlling/feature/photopickerbutton/presentation/PhotoPickerButtonPresenter;", "presenter", "Landroid/widget/ImageButton;", e.a, "Lk79;", "nh", "()Landroid/widget/ImageButton;", "addPhotoButton", "<init>", "()V", "f", "a", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: j58  reason: default package */
/* loaded from: classes.dex */
public final class j58 extends f70 implements o58 {
    public as8<PhotoPickerButtonPresenter> c;
    private final MoxyKtxDelegate d;
    private final k79 e;
    static final /* synthetic */ je5<Object>[] g = {bc9.f(new ar8(j58.class, "presenter", "getPresenter()Lcom/dodopizza/controlling/feature/photopickerbutton/presentation/PhotoPickerButtonPresenter;", 0)), bc9.f(new ar8(j58.class, "addPhotoButton", "getAddPhotoButton()Landroid/widget/ImageButton;", 0))};
    public static final a f = new a(null);

    /* compiled from: PhotoPickerButtonFragment.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J&\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\rR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lj58$a;", "", "Landroid/os/Bundle;", "bundle", "Ljava/io/File;", com.huawei.hms.opendevice.c.a, "Lm58;", "uiConfig", "b", "Landroidx/fragment/app/Fragment;", "hostFragment", "Lkotlin/Function1;", "", "Lcom/dodopizza/controlling/feature/photopickerbutton/presentation/PhotoPickerButtonResultListener;", "action", DateTokenConverter.CONVERTER_KEY, "", "EXTRA_KEY_RESULT", "Ljava/lang/String;", "EXTRA_KEY_UI_CONFIG", "RESULT_KEY", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: j58$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final File c(Bundle bundle) {
            Serializable serializable = bundle.getSerializable("result");
            z65.f(serializable, "null cannot be cast to non-null type java.io.File");
            return (File) serializable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(Function1 function1, String str, Bundle bundle) {
            z65.h(function1, "$action");
            z65.h(str, "<anonymous parameter 0>");
            z65.h(bundle, "bundle");
            function1.invoke(j58.f.c(bundle));
        }

        public final Bundle b(m58 m58Var) {
            z65.h(m58Var, "uiConfig");
            return bi0.c(bi0.d("uiConfig", m58Var));
        }

        public final void d(Fragment fragment, final Function1<? super File, Unit> function1) {
            z65.h(fragment, "hostFragment");
            z65.h(function1, "action");
            fragment.getChildFragmentManager().A1("photo_picker_button_result", fragment, new r64() { // from class: i58
                @Override // defpackage.r64
                public final void a(String str, Bundle bundle) {
                    j58.a.e(Function1.this, str, bundle);
                }
            });
        }
    }

    /* compiled from: PhotoPickerButtonFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: j58$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            j58.this.oh().r();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: PhotoPickerButtonFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/controlling/feature/photopickerbutton/presentation/PhotoPickerButtonPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/controlling/feature/photopickerbutton/presentation/PhotoPickerButtonPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: j58$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<PhotoPickerButtonPresenter> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final PhotoPickerButtonPresenter invoke() {
            return j58.this.ph().get();
        }
    }

    public j58() {
        super(wz8.fragment_photo_picker);
        c cVar = new c();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.d = new MoxyKtxDelegate(mvpDelegate, PhotoPickerButtonPresenter.class.getName() + ".presenter", cVar);
        this.e = kb0.e(this, zx8.rating_comment_add_photo);
    }

    private final ImageButton nh() {
        return (ImageButton) this.e.a(this, g[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PhotoPickerButtonPresenter oh() {
        return (PhotoPickerButtonPresenter) this.d.getValue(this, g[0]);
    }

    @Override // defpackage.o58
    public void m8(File file) {
        z65.h(file, "photoFile");
        getParentFragmentManager().z1("photo_picker_button_result", bi0.c(bi0.d("result", file)));
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        h58.a.a().a((PhotoPickerButtonFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(PhotoPickerButtonFeatureDependencies.class))).a(this);
        super.onCreate(bundle);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("uiConfig")) == null) ? null : null;
        if (obj != null && !(obj instanceof m58)) {
            throw new ClassCastException("Property uiConfig has different class type");
        } else if (obj != null) {
            if (((m58) obj).a()) {
                cw4.c(nh(), ColorStateList.valueOf(iu1.c(requireContext(), lw8.b)));
            }
            oma.a(view, new b());
        } else {
            throw new IllegalArgumentException("Argument with key = uiConfig not found in bundle");
        }
    }

    public final as8<PhotoPickerButtonPresenter> ph() {
        as8<PhotoPickerButtonPresenter> as8Var = this.c;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
