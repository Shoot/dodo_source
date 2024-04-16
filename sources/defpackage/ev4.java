package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.feature.imagepicker.ImagePickerDialogFeatureDependencies;
import com.dodopizza.feature.imagepicker.presentation.ImagePickerDialogPresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.cv4;
import defpackage.v5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: ImagePickerDialogFragment.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0002GHB\u0007¢\u0006\u0004\bD\u0010EJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\nH\u0002J\u0012\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0003H\u0016J\b\u0010!\u001a\u00020\u0005H\u0016J\b\u0010\"\u001a\u00020\u0005H\u0016R(\u0010+\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R#\u00101\u001a\n ,*\u0004\u0018\u00010$0$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u00109\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00103\u001a\u0004\b8\u00105R\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00070:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020>0:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010<R\u0018\u0010C\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006I"}, d2 = {"Lev4;", "Lr53;", "Ljv4;", "", "captured", "", "yh", "Landroid/net/Uri;", "uri", "zh", "Ljava/io/File;", "th", "contentUri", "fileInCache", "sh", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "outState", "onSaveInstanceState", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "view", "onViewCreated", "", "permission", "wf", "visible", "x8", "S3", "kf", "Las8;", "Lcom/dodopizza/feature/imagepicker/presentation/ImagePickerDialogPresenter;", com.huawei.hms.push.e.a, "Las8;", "xh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "f", "Lmoxy/ktx/MoxyKtxDelegate;", "wh", "()Lcom/dodopizza/feature/imagepicker/presentation/ImagePickerDialogPresenter;", "presenter", "g", "Lk79;", "uh", "()Landroid/view/View;", "captureImageButton", Image.TYPE_HIGH, "vh", "pickImageButton", "La6;", "i", "La6;", "imageCapture", "Lv58;", "j", "imagePicker", "k", "Ljava/io/File;", "capturingImage", "<init>", "()V", "l", "a", "b", "feature-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ev4  reason: default package */
/* loaded from: classes.dex */
public final class ev4 extends r53 implements jv4 {
    public as8<ImagePickerDialogPresenter> e;
    private final MoxyKtxDelegate f;
    private final k79 g;
    private final k79 h;
    private a6<Uri> i;
    private a6<v58> j;
    private File k;
    static final /* synthetic */ je5<Object>[] m = {bc9.f(new ar8(ev4.class, "presenter", "getPresenter()Lcom/dodopizza/feature/imagepicker/presentation/ImagePickerDialogPresenter;", 0)), bc9.f(new ar8(ev4.class, "captureImageButton", "getCaptureImageButton()Landroid/view/View;", 0)), bc9.f(new ar8(ev4.class, "pickImageButton", "getPickImageButton()Landroid/view/View;", 0))};
    public static final a l = new a(null);

    /* compiled from: ImagePickerDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lev4$a;", "", "Ldv4;", "data", "Lev4;", "a", "", "CACHE_IMAGES_FOLDER", "Ljava/lang/String;", "CACHE_IMAGE_PREFIX", "EXTRA_KEY_CAPTURING_FILE", "EXTRA_KEY_DATA", "<init>", "()V", "feature-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ev4$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ev4 a(dv4 dv4Var) {
            z65.h(dv4Var, "data");
            return (ev4) y64.d(new ev4(), bi0.c(bi0.d("data", dv4Var)));
        }
    }

    /* compiled from: ImagePickerDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lev4$b;", "Ly5;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/net/Uri;", "input", "Landroid/content/Intent;", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "feature-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ev4$b */
    /* loaded from: classes.dex */
    private static final class b extends y5 {
        @Override // defpackage.s5
        /* renamed from: d */
        public Intent a(Context context, Uri uri) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            z65.h(uri, "input");
            Intent flags = super.d(context, uri).setFlags(2);
            z65.g(flags, "setFlags(...)");
            return flags;
        }
    }

    /* compiled from: ImagePickerDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ev4$c */
    /* loaded from: classes.dex */
    /* synthetic */ class c implements r5, i94 {
        c() {
        }

        @Override // defpackage.i94
        public final b94<?> b() {
            return new m94(1, ev4.this, ev4.class, "processPickedImage", "processPickedImage(Landroid/net/Uri;)V", 0);
        }

        @Override // defpackage.r5
        /* renamed from: c */
        public final void a(Uri uri) {
            ev4.this.zh(uri);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof r5) || !(obj instanceof i94)) {
                return false;
            }
            return z65.c(b(), ((i94) obj).b());
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    /* compiled from: ImagePickerDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ev4$d */
    /* loaded from: classes.dex */
    /* synthetic */ class d implements r5, i94 {
        d() {
        }

        @Override // defpackage.r5
        public /* bridge */ /* synthetic */ void a(Object obj) {
            c(((Boolean) obj).booleanValue());
        }

        @Override // defpackage.i94
        public final b94<?> b() {
            return new m94(1, ev4.this, ev4.class, "processCapturedImage", "processCapturedImage(Z)V", 0);
        }

        public final void c(boolean z) {
            ev4.this.yh(z);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof r5) || !(obj instanceof i94)) {
                return false;
            }
            return z65.c(b(), ((i94) obj).b());
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    /* compiled from: ImagePickerDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ev4$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function1<View, Unit> {
        e() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ev4.this.wh().t();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ImagePickerDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ev4$f */
    /* loaded from: classes.dex */
    static final class f extends ej5 implements Function1<View, Unit> {
        f() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            ev4.this.wh().x();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ImagePickerDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/feature/imagepicker/presentation/ImagePickerDialogPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/feature/imagepicker/presentation/ImagePickerDialogPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ev4$g */
    /* loaded from: classes.dex */
    static final class g extends ej5 implements Function0<ImagePickerDialogPresenter> {
        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ImagePickerDialogPresenter invoke() {
            return ev4.this.xh().get();
        }
    }

    /* compiled from: ImagePickerDialogFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.feature.imagepicker.presentation.ImagePickerDialogFragment$requestPermission$1", f = "ImagePickerDialogFragment.kt", l = {121}, m = "invokeSuspend")
    /* renamed from: ev4$h */
    /* loaded from: classes.dex */
    static final class h extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, cv1<? super h> cv1Var) {
            super(2, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new h(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((h) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            Object b0;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                oz3<qy7> a = ky7.a.a(ev4.this).a(this.c);
                this.a = 1;
                obj = wz3.u(a, this);
                if (obj == d) {
                    return d;
                }
            }
            b0 = sc1.b0(((qy7) obj).b());
            dy7 dy7Var = (dy7) b0;
            if (dy7Var == null) {
                return Unit.a;
            }
            ev4.this.wh().w(dy7Var);
            return Unit.a;
        }
    }

    public ev4() {
        g gVar = new g();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.f = new MoxyKtxDelegate(mvpDelegate, ImagePickerDialogPresenter.class.getName() + ".presenter", gVar);
        this.g = kb0.e(this, cy8.capture_image);
        this.h = kb0.e(this, cy8.pick_image);
    }

    private final void sh(Uri uri, File file) {
        InputStream openInputStream = requireContext().getContentResolver().openInputStream(uri);
        if (openInputStream != null) {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                kk0.b(openInputStream, fileOutputStream, 0, 2, null);
                aa1.a(fileOutputStream, null);
                aa1.a(openInputStream, null);
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    aa1.a(openInputStream, th);
                    throw th2;
                }
            }
        }
        throw new IllegalStateException(("Failed to open content's input stream: " + uri).toString());
    }

    private final File th() {
        File file = new File(requireContext().getCacheDir(), "image_picker_dialog");
        file.mkdirs();
        File createTempFile = File.createTempFile("image_", null, file);
        z65.g(createTempFile, "createTempFile(...)");
        return createTempFile;
    }

    private final View uh() {
        return (View) this.g.a(this, m[1]);
    }

    private final View vh() {
        return (View) this.h.a(this, m[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImagePickerDialogPresenter wh() {
        return (ImagePickerDialogPresenter) this.f.getValue(this, m[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yh(boolean z) {
        if (!z) {
            return;
        }
        try {
            File file = this.k;
            if (file != null) {
                wh().u(file);
                return;
            }
            throw new IllegalStateException("Captured image Uri is missing".toString());
        } catch (Exception e2) {
            wh().v(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zh(Uri uri) {
        if (uri == null) {
            return;
        }
        try {
            File th = th();
            sh(uri, th);
            wh().u(th);
        } catch (Exception e2) {
            wh().v(e2);
        }
    }

    @Override // defpackage.jv4
    public void S3() {
        File th = th();
        Context requireContext = requireContext();
        z65.g(requireContext, "requireContext(...)");
        Uri a2 = cu3.a(requireContext, th);
        this.k = th;
        a6<Uri> a6Var = this.i;
        if (a6Var == null) {
            z65.z("imageCapture");
            a6Var = null;
        }
        a6Var.a(a2);
    }

    @Override // defpackage.jv4
    public void kf() {
        a6<v58> a6Var = this.j;
        if (a6Var == null) {
            z65.z("imagePicker");
            a6Var = null;
        }
        a6Var.a(w58.a(v5.c.a));
    }

    @Override // moxy.MvpBottomSheetDialogFragment, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Object obj;
        Serializable serializable;
        cv4.b a2 = cv4.a.a();
        Bundle arguments = getArguments();
        File file = null;
        if (arguments == null || (obj = arguments.get("data")) == null) {
            obj = null;
        }
        if (obj != null && !(obj instanceof dv4)) {
            throw new ClassCastException("Property data has different class type");
        } else if (obj != null) {
            a2.a((dv4) obj, (ImagePickerDialogFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(ImagePickerDialogFeatureDependencies.class))).a(this);
            if (bundle != null) {
                serializable = bundle.getSerializable("capturing_file");
            } else {
                serializable = null;
            }
            if (serializable instanceof File) {
                file = (File) serializable;
            }
            this.k = file;
            super.onCreate(bundle);
            a6<v58> registerForActivityResult = registerForActivityResult(new v5(), new c());
            z65.g(registerForActivityResult, "registerForActivityResult(...)");
            this.j = registerForActivityResult;
            a6<Uri> registerForActivityResult2 = registerForActivityResult(new b(), new d());
            z65.g(registerForActivityResult2, "registerForActivityResult(...)");
            this.i = registerForActivityResult2;
        } else {
            throw new IllegalArgumentException("Argument with key = data not found in bundle");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        return layoutInflater.inflate(cz8.fragment_image_picker, viewGroup);
    }

    @Override // moxy.MvpBottomSheetDialogFragment, androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        z65.h(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("capturing_file", this.k);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        oma.a(uh(), new e());
        oma.a(vh(), new f());
    }

    @Override // defpackage.jv4
    public void wf(String str) {
        z65.h(str, "permission");
        sh0.d(pp5.a(this), null, null, new h(str, null), 3, null);
    }

    @Override // defpackage.jv4
    public void x8(boolean z) {
        un3.o(uh(), z);
    }

    public final as8<ImagePickerDialogPresenter> xh() {
        as8<ImagePickerDialogPresenter> as8Var = this.e;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
