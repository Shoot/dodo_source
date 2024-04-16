package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.Toolbar;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.InfoMessage;
import com.dodopizza.android.view.custom.textview.DodoInputText;
import com.dodopizza.contacts.feature.feedback.FeedbackFeatureDependencies;
import com.dodopizza.contacts.feature.feedback.presentation.FeedbackPresenter;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: FeedbackFragment.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 X2\u00020\u00012\u00020\u0002:\u0001YB\u0007¢\u0006\u0004\bV\u0010WJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\"\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J\b\u0010\u001a\u001a\u00020\u0005H\u0016R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u001b\u0010(\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010$R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001d\u001a\u0004\b0\u00101R\u001b\u00105\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u001d\u001a\u0004\b4\u00101R\u001b\u00108\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u001d\u001a\u0004\b7\u00101R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\u001d\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010\u001d\u001a\u0004\b@\u0010AR\u001c\u0010G\u001a\n D*\u0004\u0018\u00010C0C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR(\u0010P\u001a\b\u0012\u0004\u0012\u00020I0H8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR#\u0010U\u001a\n D*\u0004\u0018\u00010I0I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T¨\u0006Z"}, d2 = {"Lgr3;", "Lf70;", "Lbs3;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "onDestroyView", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "d5", "r8", "", "show", "M", "tc", "q2", "sd", "lf", "a6", "Landroidx/appcompat/widget/Toolbar;", com.huawei.hms.opendevice.c.a, "Lk79;", "Ah", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lcom/dodopizza/android/view/custom/textview/DodoInputText;", DateTokenConverter.CONVERTER_KEY, "rh", "()Lcom/dodopizza/android/view/custom/textview/DodoInputText;", "emailText", com.huawei.hms.push.e.a, "th", "messageText", "Landroid/widget/ImageView;", "f", "zh", "()Landroid/widget/ImageView;", "thumbImage", "Landroid/widget/Button;", "g", "yh", "()Landroid/widget/Button;", "sendBtn", Image.TYPE_HIGH, "qh", "attachFileBtn", "i", "xh", "removeFileBtn", "Landroid/widget/ProgressBar;", "j", "wh", "()Landroid/widget/ProgressBar;", "progressBar", "Lcom/dodopizza/android/view/custom/InfoMessage;", "k", "sh", "()Lcom/dodopizza/android/view/custom/InfoMessage;", "infoMessage", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "l", "Lorg/slf4j/Logger;", "logger", "Las8;", "Lcom/dodopizza/contacts/feature/feedback/presentation/FeedbackPresenter;", Image.TYPE_MEDIUM, "Las8;", "vh", "()Las8;", "setPresenterProvider$contacts_release", "(Las8;)V", "presenterProvider", "n", "Lmoxy/ktx/MoxyKtxDelegate;", "uh", "()Lcom/dodopizza/contacts/feature/feedback/presentation/FeedbackPresenter;", "presenter", "<init>", "()V", "o", "a", "contacts_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gr3  reason: default package */
/* loaded from: classes.dex */
public final class gr3 extends f70 implements bs3 {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final Logger l;
    public as8<FeedbackPresenter> m;
    private final MoxyKtxDelegate n;
    static final /* synthetic */ je5<Object>[] p = {bc9.f(new ar8(gr3.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(gr3.class, "emailText", "getEmailText()Lcom/dodopizza/android/view/custom/textview/DodoInputText;", 0)), bc9.f(new ar8(gr3.class, "messageText", "getMessageText()Lcom/dodopizza/android/view/custom/textview/DodoInputText;", 0)), bc9.f(new ar8(gr3.class, "thumbImage", "getThumbImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(gr3.class, "sendBtn", "getSendBtn()Landroid/widget/Button;", 0)), bc9.f(new ar8(gr3.class, "attachFileBtn", "getAttachFileBtn()Landroid/widget/Button;", 0)), bc9.f(new ar8(gr3.class, "removeFileBtn", "getRemoveFileBtn()Landroid/widget/Button;", 0)), bc9.f(new ar8(gr3.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)), bc9.f(new ar8(gr3.class, "infoMessage", "getInfoMessage()Lcom/dodopizza/android/view/custom/InfoMessage;", 0)), bc9.f(new ar8(gr3.class, "presenter", "getPresenter()Lcom/dodopizza/contacts/feature/feedback/presentation/FeedbackPresenter;", 0))};
    public static final a o = new a(null);

    /* compiled from: FeedbackFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Lgr3$a;", "", "Lgr3;", "a", "", "DELAY_SNACK_MESSAGE", "I", "PICK_IMAGE_REQUEST", "<init>", "()V", "contacts_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: gr3$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final gr3 a() {
            return new gr3();
        }
    }

    /* compiled from: FeedbackFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: gr3$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            gr3.this.uh().t();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: FeedbackFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: gr3$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function1<View, Unit> {
        c() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            gr3.this.uh().s();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: FeedbackFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: gr3$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function1<View, Unit> {
        d() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            FeedbackPresenter uh = gr3.this.uh();
            String text = gr3.this.rh().getText();
            z65.g(text, "getText(...)");
            String text2 = gr3.this.th().getText();
            z65.g(text2, "getText(...)");
            uh.u(text, text2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: FeedbackFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/contacts/feature/feedback/presentation/FeedbackPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/contacts/feature/feedback/presentation/FeedbackPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: gr3$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function0<FeedbackPresenter> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final FeedbackPresenter invoke() {
            return gr3.this.vh().get();
        }
    }

    public gr3() {
        super(vz8.fragment_feedback);
        this.c = kb0.e(this, yx8.j);
        this.d = kb0.e(this, yx8.email_text);
        this.e = kb0.e(this, yx8.message_text);
        this.f = kb0.e(this, yx8.thumb_image);
        this.g = kb0.e(this, yx8.send_button);
        this.h = kb0.e(this, yx8.attach_file_btn);
        this.i = kb0.e(this, yx8.remove_file_btn);
        this.j = kb0.e(this, yx8.f);
        this.k = kb0.e(this, yx8.d);
        this.l = LoggerFactory.getLogger("FeedbackFragment");
        e eVar = new e();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.n = new MoxyKtxDelegate(mvpDelegate, FeedbackPresenter.class.getName() + ".presenter", eVar);
    }

    private final Toolbar Ah() {
        return (Toolbar) this.c.a(this, p[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Bh(gr3 gr3Var, View view) {
        z65.h(gr3Var, "this$0");
        gr3Var.uh().onBackPressed();
    }

    private final Button qh() {
        return (Button) this.h.a(this, p[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DodoInputText rh() {
        return (DodoInputText) this.d.a(this, p[1]);
    }

    private final InfoMessage sh() {
        return (InfoMessage) this.k.a(this, p[8]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DodoInputText th() {
        return (DodoInputText) this.e.a(this, p[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FeedbackPresenter uh() {
        return (FeedbackPresenter) this.n.getValue(this, p[9]);
    }

    private final ProgressBar wh() {
        return (ProgressBar) this.j.a(this, p[7]);
    }

    private final Button xh() {
        return (Button) this.i.a(this, p[6]);
    }

    private final Button yh() {
        return (Button) this.g.a(this, p[4]);
    }

    private final ImageView zh() {
        return (ImageView) this.f.a(this, p[3]);
    }

    @Override // defpackage.bs3
    public void M(boolean z) {
        if (z) {
            wh().setVisibility(0);
            yh().setVisibility(8);
            return;
        }
        wh().setVisibility(8);
        yh().setVisibility(0);
    }

    @Override // defpackage.bs3
    public void a6() {
        th().setError(getString(f19.message_input_error));
    }

    @Override // defpackage.bs3
    public void d5() {
        startActivityForResult(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), 1);
    }

    @Override // defpackage.bs3
    public void lf() {
        th().setError(f19.c);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        Uri uri;
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            if (intent != null) {
                uri = intent.getData();
            } else {
                uri = null;
            }
            if (uri != null) {
                try {
                    zh().setImageBitmap(MediaStore.Images.Media.getBitmap(requireContext().getContentResolver(), intent.getData()));
                    zh().setVisibility(0);
                    xh().setVisibility(0);
                    qh().setVisibility(8);
                } catch (IOException e2) {
                    this.l.error("Some trouble with attached file", (Throwable) e2);
                }
            }
        }
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        er3.a.a().a((FeedbackFeatureDependencies) getComponentDependenciesRegistry().a(bc9.b(FeedbackFeatureDependencies.class))).a(this);
        super.onCreate(bundle);
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view = getView();
        if (view != null) {
            gg5.c(view);
        }
        super.onDestroyView();
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        rh().getEditText().setInputType(33);
        rh().getEditText().setFocusableInTouchMode(true);
        th().getEditText().setInputType(131072);
        th().getEditText().setSingleLine(false);
        zh().setVisibility(8);
        xh().setVisibility(8);
        Ah().setNavigationOnClickListener(new View.OnClickListener() { // from class: fr3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                gr3.Bh(gr3.this, view2);
            }
        });
        oma.a(xh(), new b());
        oma.a(qh(), new c());
        oma.a(yh(), new d());
    }

    @Override // defpackage.bs3
    public void q2() {
        rh().setError(f19.c);
    }

    @Override // defpackage.bs3
    public void r8() {
        qh().setVisibility(0);
        xh().setVisibility(8);
        zh().setVisibility(8);
        zh().setImageDrawable(null);
    }

    @Override // defpackage.bs3
    public void sd() {
        rh().setError(getString(f19.a));
    }

    @Override // defpackage.bs3
    public void tc() {
        sh().h(f19.send_error, 3000);
    }

    public final as8<FeedbackPresenter> vh() {
        as8<FeedbackPresenter> as8Var = this.m;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }
}
