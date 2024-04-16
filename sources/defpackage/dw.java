package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.order.feature.assistant.AssistantFeatureDependencies;
import com.dodopizza.order.feature.assistant.sharing.presentation.AssistantSharingPresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.aw;
import defpackage.jw;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: AssistantSharingFragment.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 J2\u00020\u00012\u00020\u0002:\u0001KB\u0007¢\u0006\u0004\bH\u0010IJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\u0012\u0010\u0012\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016R\u001b\u0010\u001e\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010'R\u001b\u0010+\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010'R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u001b\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u001b\u001a\u0004\b3\u00104R\u001b\u00108\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u001b\u001a\u0004\b7\u0010\"R(\u0010A\u001a\b\u0012\u0004\u0012\u00020:098\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R#\u0010G\u001a\n B*\u0004\u0018\u00010:0:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006L"}, d2 = {"Ldw;", "La70;", "Llw;", "", "Dh", "Landroid/view/View;", "view", "Landroid/graphics/Bitmap;", "th", "pizzaCardBitmap", "rh", "bitmap", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "Fh", "sh", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onViewCreated", "Ljw;", "sharingVO", "C9", "", "onBackPressed", "db", Image.TYPE_HIGH, "Lk79;", "wh", "()Landroid/view/View;", "pizzaCard", "Landroid/widget/ImageView;", "i", "yh", "()Landroid/widget/ImageView;", "pizzaImage", "Landroid/widget/TextView;", "j", "zh", "()Landroid/widget/TextView;", "pizzaName", "k", "xh", "pizzaDescription", "Landroid/widget/ImageButton;", "l", "uh", "()Landroid/widget/ImageButton;", "backButton", "Landroid/widget/Button;", Image.TYPE_MEDIUM, "Ch", "()Landroid/widget/Button;", "shareButton", "n", "vh", "logo", "Las8;", "Lcom/dodopizza/order/feature/assistant/sharing/presentation/AssistantSharingPresenter;", "o", "Las8;", "Bh", "()Las8;", "setPresenterProvider", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "p", "Lmoxy/ktx/MoxyKtxDelegate;", "Ah", "()Lcom/dodopizza/order/feature/assistant/sharing/presentation/AssistantSharingPresenter;", "presenter", "<init>", "()V", "q", "a", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dw  reason: default package */
/* loaded from: classes2.dex */
public final class dw extends a70 implements lw {
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final k79 l;
    private final k79 m;
    private final k79 n;
    public as8<AssistantSharingPresenter> o;
    private final MoxyKtxDelegate p;
    static final /* synthetic */ je5<Object>[] r = {bc9.f(new ar8(dw.class, "pizzaCard", "getPizzaCard()Landroid/view/View;", 0)), bc9.f(new ar8(dw.class, "pizzaImage", "getPizzaImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(dw.class, "pizzaName", "getPizzaName()Landroid/widget/TextView;", 0)), bc9.f(new ar8(dw.class, "pizzaDescription", "getPizzaDescription()Landroid/widget/TextView;", 0)), bc9.f(new ar8(dw.class, "backButton", "getBackButton()Landroid/widget/ImageButton;", 0)), bc9.f(new ar8(dw.class, "shareButton", "getShareButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(dw.class, "logo", "getLogo()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(dw.class, "presenter", "getPresenter()Lcom/dodopizza/order/feature/assistant/sharing/presentation/AssistantSharingPresenter;", 0))};
    public static final a q = new a(null);
    public static final int s = 8;

    /* compiled from: AssistantSharingFragment.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\b¨\u0006\u0011"}, d2 = {"Ldw$a;", "", "Lbw;", "data", "Ldw;", "a", "", "EXTRA_KEY_DATA", "Ljava/lang/String;", "", "MAX_QUALITY_PERCENT", "I", "SHARED_FILE_MIME_TYPE", "SHARED_FILE_PREFIX", "SHARED_FILE_SUFFIX", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: dw$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dw a(bw bwVar) {
            z65.h(bwVar, "data");
            return (dw) y64.d(new dw(), bi0.c(lnb.a("data", bwVar)));
        }
    }

    /* compiled from: AssistantSharingFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dw$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[jw.a.values().length];
            try {
                iArr[jw.a.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[jw.a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AssistantSharingFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dw$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            dw.this.Ah().onBackPressed();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AssistantSharingFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dw$d */
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            dw.this.Ah().w();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: AssistantSharingFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/order/feature/assistant/sharing/presentation/AssistantSharingPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/order/feature/assistant/sharing/presentation/AssistantSharingPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: dw$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function0<AssistantSharingPresenter> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final AssistantSharingPresenter invoke() {
            return dw.this.Bh().get();
        }
    }

    public dw() {
        super(gz8.fragment_assistant_sharing);
        this.h = kb0.e(this, gy8.pizza_card);
        this.i = kb0.e(this, gy8.pizza_image);
        this.j = kb0.e(this, gy8.pizza_name);
        this.k = kb0.e(this, gy8.pizza_description);
        this.l = kb0.e(this, gy8.m);
        this.m = kb0.e(this, gy8.share_button_large);
        this.n = kb0.e(this, gy8.logo);
        e eVar = new e();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.p = new MoxyKtxDelegate(mvpDelegate, AssistantSharingPresenter.class.getName() + ".presenter", eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AssistantSharingPresenter Ah() {
        return (AssistantSharingPresenter) this.p.getValue(this, r[7]);
    }

    private final Button Ch() {
        return (Button) this.m.a(this, r[5]);
    }

    private final void Dh() {
        Bitmap th = th(rh(th(wh())));
        File sh = sh();
        Fh(th, sh);
        MediaScannerConnection.scanFile(requireContext(), new String[]{sh.getPath()}, new String[]{"image/png"}, new MediaScannerConnection.OnScanCompletedListener() { // from class: cw
            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public final void onScanCompleted(String str, Uri uri) {
                dw.Eh(dw.this, str, uri);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Eh(dw dwVar, String str, Uri uri) {
        z65.h(dwVar, "this$0");
        new qha(dwVar.requireActivity()).e(uri).f("image/png").g();
    }

    private final void Fh(Bitmap bitmap, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            Unit unit = Unit.a;
            aa1.a(fileOutputStream, null);
        } finally {
        }
    }

    private final View rh(Bitmap bitmap) {
        View inflate = getLayoutInflater().inflate(gz8.layout_assistant_sharing_frame, (ViewGroup) null);
        ((ImageView) inflate.findViewById(gy8.pizza_card_picture)).setImageBitmap(bitmap);
        inflate.measure(0, 0);
        inflate.layout(0, 0, inflate.getMeasuredWidth(), inflate.getMeasuredHeight());
        z65.g(inflate, "apply(...)");
        return inflate;
    }

    private final File sh() {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        externalStoragePublicDirectory.mkdirs();
        File createTempFile = File.createTempFile("dodopizza", ".png", externalStoragePublicDirectory);
        z65.g(createTempFile, "createTempFile(...)");
        return createTempFile;
    }

    private final Bitmap th(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        z65.g(createBitmap, "createBitmap(...)");
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    private final ImageButton uh() {
        return (ImageButton) this.l.a(this, r[4]);
    }

    private final ImageView vh() {
        return (ImageView) this.n.a(this, r[6]);
    }

    private final View wh() {
        return (View) this.h.a(this, r[0]);
    }

    private final TextView xh() {
        return (TextView) this.k.a(this, r[3]);
    }

    private final ImageView yh() {
        return (ImageView) this.i.a(this, r[1]);
    }

    private final TextView zh() {
        return (TextView) this.j.a(this, r[2]);
    }

    public final as8<AssistantSharingPresenter> Bh() {
        as8<AssistantSharingPresenter> as8Var = this.o;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.lw
    public void C9(jw jwVar) {
        z65.h(jwVar, "sharingVO");
        int i = b.$EnumSwitchMapping$0[jwVar.a().ordinal()];
        if (i != 1) {
            if (i == 2) {
                vh().setImageResource(bx8.assistant_sharing_logo_ar);
            }
        } else {
            vh().setImageResource(bx8.assistant_sharing_logo);
        }
        com.bumptech.glide.b.u(yh()).t(jwVar.b().c()).o0(new gi4(kx9.a(24), kx9.a(24), 0.0f, 0.0f)).a0(bx8.c).G0(yh());
        zh().setText(jwVar.b().getName());
        xh().setText(jwVar.b().b());
    }

    @Override // defpackage.lw
    public void db() {
        try {
            Dh();
        } catch (Exception e2) {
            Ah().x(e2);
        }
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        Ah().onBackPressed();
        return true;
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        aw.b a2 = aw.a.a();
        Bundle arguments = getArguments();
        Object obj = (arguments == null || (obj = arguments.get("data")) == null) ? null : null;
        if (obj != null && !(obj instanceof bw)) {
            throw new ClassCastException("Property data has different class type");
        } else if (obj != null) {
            a2.a((bw) obj, (AssistantFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(AssistantFeatureDependencies.class))).a(this);
            super.onCreate(bundle);
        } else {
            throw new IllegalArgumentException("Argument with key = data not found in bundle");
        }
    }

    @Override // defpackage.a70, defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        oma.a(uh(), new c());
        oma.a(Ch(), new d());
    }
}
