package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.BidiFormatter;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.textview.DodoInputText;
import com.dodopizza.profile.feature.profilesettings.ProfileSettingsDependencies;
import com.dodopizza.profile.feature.profilesettings.presentation.ProfileSettingsPresenter;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.iu6;
import defpackage.tj1;
import defpackage.vm2;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.MvpDelegate;
import moxy.ktx.MoxyKtxDelegate;
/* compiled from: ProfileSettingsFragment.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 \u009f\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002 \u0001B\t¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0012\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u0010\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0007H\u0016J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u0007H\u0016J\u0010\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0017H\u0016J\u0010\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0017H\u0016J\u0010\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u0017H\u0016J\b\u0010#\u001a\u00020\u0007H\u0016J\b\u0010$\u001a\u00020\u0007H\u0016J\u0010\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0017H\u0016J\b\u0010'\u001a\u00020\u0007H\u0016J\b\u0010(\u001a\u00020\u0007H\u0016J\b\u0010)\u001a\u00020\u0014H\u0016J\b\u0010*\u001a\u00020\u0007H\u0016J\b\u0010+\u001a\u00020\u0007H\u0016J\u0010\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0017H\u0016J\u0010\u0010/\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0017H\u0016J\u0010\u00100\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0017H\u0016J\b\u00101\u001a\u00020\u0007H\u0016J\b\u00102\u001a\u00020\u0007H\u0016J\b\u00103\u001a\u00020\u0007H\u0016J\b\u00104\u001a\u00020\u0007H\u0016J\b\u00105\u001a\u00020\u0007H\u0016J\u0010\u00108\u001a\u00020\u00072\u0006\u00107\u001a\u000206H\u0016J\b\u00109\u001a\u00020\u0007H\u0016J\b\u0010:\u001a\u00020\u0007H\u0016J\b\u0010;\u001a\u00020\u0007H\u0016J\b\u0010<\u001a\u00020\u0007H\u0016J\b\u0010=\u001a\u00020\u0007H\u0016J\b\u0010>\u001a\u00020\u0007H\u0016J\b\u0010?\u001a\u00020\u0007H\u0016J\b\u0010@\u001a\u00020\u0007H\u0016J0\u0010G\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u00172\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\u00172\u0006\u0010E\u001a\u00020B2\u0006\u0010F\u001a\u00020\u0014H\u0016R\u001b\u0010M\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010J\u001a\u0004\bP\u0010QR\u001b\u0010U\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010J\u001a\u0004\bT\u0010QR\u001b\u0010X\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bV\u0010J\u001a\u0004\bW\u0010QR\u001b\u0010[\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010J\u001a\u0004\bZ\u0010QR\u001b\u0010`\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010J\u001a\u0004\b^\u0010_R\u001b\u0010d\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010J\u001a\u0004\bb\u0010cR\u001b\u0010g\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010J\u001a\u0004\bf\u0010cR\u001b\u0010l\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010J\u001a\u0004\bj\u0010kR\u001b\u0010o\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010J\u001a\u0004\bn\u0010cR\u001b\u0010r\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010J\u001a\u0004\bq\u0010cR\u001b\u0010u\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010J\u001a\u0004\bt\u0010cR\u001b\u0010x\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bv\u0010J\u001a\u0004\bw\u0010cR\u001b\u0010}\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bz\u0010J\u001a\u0004\b{\u0010|R\u001e\u0010\u0082\u0001\u001a\u00020~8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b\u007f\u0010J\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001e\u0010\u0085\u0001\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010J\u001a\u0005\b\u0084\u0001\u0010kR\u001e\u0010\u0088\u0001\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010J\u001a\u0005\b\u0087\u0001\u0010cR \u0010\u008d\u0001\u001a\u00030\u0089\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008a\u0001\u0010J\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R1\u0010\u0096\u0001\u001a\n\u0012\u0005\u0012\u00030\u008f\u00010\u008e\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R+\u0010\u009c\u0001\u001a\r \u0097\u0001*\u0005\u0018\u00010\u008f\u00010\u008f\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001¨\u0006¡\u0001"}, d2 = {"Ljo8;", "Lf70;", "Lqo8;", "Lw50;", "Ltj1$a;", "Liu6$e;", "Liu6$d;", "", "Kh", "Lh", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/View;", "view", "onViewCreated", "S9", "Z9", "aa", "i5", "", "isSms", "t6", "", Action.NAME_ATTRIBUTE, "v4", "ef", "x2", "g7", "phoneNumber", "t3", "birthday", "P3", "notFullbirthday", "b6", "ya", "o5", "email", "Ba", "J4", "g5", "onBackPressed", "ed", "u7", "birthdayString", "F7", "id", "O8", "onCancel", "l7", "k0", "X1", "k1", "Y1", "", "deletingDateUtcMillis", "ue", "Cb", "m9", "Oc", "h6", "Z5", "y4", "Qe", "Jd", "versionName", "", "versionCode", "buildType", "rcVersion", "isDebug", "qa", "Landroidx/appcompat/widget/Toolbar;", com.huawei.hms.opendevice.c.a, "Lk79;", "Hh", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "Lcom/dodopizza/android/view/custom/textview/DodoInputText;", DateTokenConverter.CONVERTER_KEY, "Ih", "()Lcom/dodopizza/android/view/custom/textview/DodoInputText;", "userNameText", com.huawei.hms.push.e.a, "Ah", "phoneNumberText", "f", "wh", "emailText", "g", "qh", "birthdayText", "Lcom/google/android/material/switchmaterial/SwitchMaterial;", Image.TYPE_HIGH, "Gh", "()Lcom/google/android/material/switchmaterial/SwitchMaterial;", "switchReceiveSms", "i", "sh", "()Landroid/view/View;", "deleteAccountButton", "j", "yh", "logoutButton", "Landroid/widget/ProgressBar;", "k", "zh", "()Landroid/widget/ProgressBar;", "logoutProgressBar", "l", "Dh", "selectLocaleLayout", Image.TYPE_MEDIUM, "Eh", "separatorBottomSelectLocale", "n", "xh", "legalDocuments", "o", "vh", "deletionStatusView", "Landroid/widget/TextView;", "p", "uh", "()Landroid/widget/TextView;", "deletionStatusTitle", "Landroid/widget/Button;", "q", "rh", "()Landroid/widget/Button;", "cancelDeletionButton", "r", "th", "deletionProgressBar", Image.TYPE_SMALL, "Fh", "separatorDeletion", "Landroidx/appcompat/widget/AppCompatTextView;", "t", "Jh", "()Landroidx/appcompat/widget/AppCompatTextView;", "versionText", "Las8;", "Lcom/dodopizza/profile/feature/profilesettings/presentation/ProfileSettingsPresenter;", "u", "Las8;", "Ch", "()Las8;", "setPresenterProvider$profile_release", "(Las8;)V", "presenterProvider", "kotlin.jvm.PlatformType", "v", "Lmoxy/ktx/MoxyKtxDelegate;", "Bh", "()Lcom/dodopizza/profile/feature/profilesettings/presentation/ProfileSettingsPresenter;", "presenter", "<init>", "()V", "w", "a", "profile_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: jo8  reason: default package */
/* loaded from: classes2.dex */
public final class jo8 extends f70 implements qo8, w50, tj1.a, iu6.e, iu6.d {
    private final k79 c;
    private final k79 d;
    private final k79 e;
    private final k79 f;
    private final k79 g;
    private final k79 h;
    private final k79 i;
    private final k79 j;
    private final k79 k;
    private final k79 l;
    private final k79 m;
    private final k79 n;
    private final k79 o;
    private final k79 p;
    private final k79 q;
    private final k79 r;
    private final k79 s;
    private final k79 t;
    public as8<ProfileSettingsPresenter> u;
    private final MoxyKtxDelegate v;
    static final /* synthetic */ je5<Object>[] x = {bc9.f(new ar8(jo8.class, "toolbar", "getToolbar()Landroidx/appcompat/widget/Toolbar;", 0)), bc9.f(new ar8(jo8.class, "userNameText", "getUserNameText()Lcom/dodopizza/android/view/custom/textview/DodoInputText;", 0)), bc9.f(new ar8(jo8.class, "phoneNumberText", "getPhoneNumberText()Lcom/dodopizza/android/view/custom/textview/DodoInputText;", 0)), bc9.f(new ar8(jo8.class, "emailText", "getEmailText()Lcom/dodopizza/android/view/custom/textview/DodoInputText;", 0)), bc9.f(new ar8(jo8.class, "birthdayText", "getBirthdayText()Lcom/dodopizza/android/view/custom/textview/DodoInputText;", 0)), bc9.f(new ar8(jo8.class, "switchReceiveSms", "getSwitchReceiveSms()Lcom/google/android/material/switchmaterial/SwitchMaterial;", 0)), bc9.f(new ar8(jo8.class, "deleteAccountButton", "getDeleteAccountButton()Landroid/view/View;", 0)), bc9.f(new ar8(jo8.class, "logoutButton", "getLogoutButton()Landroid/view/View;", 0)), bc9.f(new ar8(jo8.class, "logoutProgressBar", "getLogoutProgressBar()Landroid/widget/ProgressBar;", 0)), bc9.f(new ar8(jo8.class, "selectLocaleLayout", "getSelectLocaleLayout()Landroid/view/View;", 0)), bc9.f(new ar8(jo8.class, "separatorBottomSelectLocale", "getSeparatorBottomSelectLocale()Landroid/view/View;", 0)), bc9.f(new ar8(jo8.class, "legalDocuments", "getLegalDocuments()Landroid/view/View;", 0)), bc9.f(new ar8(jo8.class, "deletionStatusView", "getDeletionStatusView()Landroid/view/View;", 0)), bc9.f(new ar8(jo8.class, "deletionStatusTitle", "getDeletionStatusTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(jo8.class, "cancelDeletionButton", "getCancelDeletionButton()Landroid/widget/Button;", 0)), bc9.f(new ar8(jo8.class, "deletionProgressBar", "getDeletionProgressBar()Landroid/widget/ProgressBar;", 0)), bc9.f(new ar8(jo8.class, "separatorDeletion", "getSeparatorDeletion()Landroid/view/View;", 0)), bc9.f(new ar8(jo8.class, "versionText", "getVersionText()Landroidx/appcompat/widget/AppCompatTextView;", 0)), bc9.f(new ar8(jo8.class, "presenter", "getPresenter()Lcom/dodopizza/profile/feature/profilesettings/presentation/ProfileSettingsPresenter;", 0))};
    public static final a w = new a(null);

    /* compiled from: ProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Ljo8$a;", "", "Ljo8;", "a", "", "BIRTHDAY_CONFIRM_ID", "Ljava/lang/String;", "GO_TO_APP_SETTINGS_ID", "<init>", "()V", "profile_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: jo8$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final jo8 a() {
            return new jo8();
        }
    }

    /* compiled from: ProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jo8$b */
    /* loaded from: classes2.dex */
    static final class b extends ej5 implements Function1<View, Unit> {
        b() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            gg5.c(jo8.this.yh());
            jo8.this.Bh().U();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ProfileSettingsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jo8$c */
    /* loaded from: classes2.dex */
    /* synthetic */ class c extends m94 implements Function1<String, Unit> {
        c(Object obj) {
            super(1, obj, ProfileSettingsPresenter.class, "onUserNameChanged", "onUserNameChanged(Ljava/lang/String;)V", 0);
        }

        public final void b(String str) {
            z65.h(str, "p0");
            ((ProfileSettingsPresenter) this.receiver).a0(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            b(str);
            return Unit.a;
        }
    }

    /* compiled from: ProfileSettingsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jo8$d */
    /* loaded from: classes2.dex */
    /* synthetic */ class d extends m94 implements Function1<String, Unit> {
        d(Object obj) {
            super(1, obj, ProfileSettingsPresenter.class, "onEmailChanged", "onEmailChanged(Ljava/lang/String;)V", 0);
        }

        public final void b(String str) {
            z65.h(str, "p0");
            ((ProfileSettingsPresenter) this.receiver).V(str);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            b(str);
            return Unit.a;
        }
    }

    /* compiled from: ProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jo8$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function1<View, Unit> {
        e() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            jo8.this.Bh().R();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jo8$f */
    /* loaded from: classes2.dex */
    static final class f extends ej5 implements Function1<View, Unit> {
        f() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            jo8.this.Bh().Y();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jo8$g */
    /* loaded from: classes2.dex */
    static final class g extends ej5 implements Function1<View, Unit> {
        g() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            jo8.this.Bh().T();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/dodopizza/profile/feature/profilesettings/presentation/ProfileSettingsPresenter;", "kotlin.jvm.PlatformType", "a", "()Lcom/dodopizza/profile/feature/profilesettings/presentation/ProfileSettingsPresenter;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jo8$h */
    /* loaded from: classes2.dex */
    static final class h extends ej5 implements Function0<ProfileSettingsPresenter> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final ProfileSettingsPresenter invoke() {
            return jo8.this.Ch().get();
        }
    }

    /* compiled from: ProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jo8$i */
    /* loaded from: classes2.dex */
    static final class i extends ej5 implements Function1<View, Unit> {
        i() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            jo8.this.Bh().O();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jo8$j */
    /* loaded from: classes2.dex */
    static final class j extends ej5 implements Function1<View, Unit> {
        j() {
            super(1);
        }

        public final void a(View view) {
            z65.h(view, "it");
            jo8.this.Bh().M();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* compiled from: ProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "dayOfMonth", "month", "year", "", "a", "(III)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jo8$k */
    /* loaded from: classes2.dex */
    static final class k extends ej5 implements y84<Integer, Integer, Integer, Unit> {
        k() {
            super(3);
        }

        public final void a(int i, int i2, int i3) {
            jo8.this.Bh().P(i, i2, i3);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) {
            a(num.intValue(), num2.intValue(), num3.intValue());
            return Unit.a;
        }
    }

    /* compiled from: ProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luoa;", "", "a", "(Luoa;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jo8$l */
    /* loaded from: classes2.dex */
    static final class l extends ej5 implements Function1<uoa, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileSettingsFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "a", "()Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: jo8$l$a */
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function0<View> {
            final /* synthetic */ jo8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(jo8 jo8Var) {
                super(0);
                this.a = jo8Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final View invoke() {
                View requireView = this.a.requireView();
                z65.g(requireView, "requireView(...)");
                return requireView;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileSettingsFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: jo8$l$b */
        /* loaded from: classes2.dex */
        public static final class b extends ej5 implements Function0<String> {
            final /* synthetic */ jo8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(jo8 jo8Var) {
                super(0);
                this.a = jo8Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                String string = this.a.getString(t09.profile_settings_account_deletion_success_cancel_message);
                z65.g(string, "getString(...)");
                return string;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileSettingsFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: jo8$l$c */
        /* loaded from: classes2.dex */
        public static final class c extends ej5 implements Function0<Integer> {
            public static final c a = new c();

            c() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 3;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileSettingsFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: jo8$l$d */
        /* loaded from: classes2.dex */
        public static final class d extends ej5 implements Function0<Integer> {
            public static final d a = new d();

            d() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 2;
            }
        }

        l() {
            super(1);
        }

        public final void a(uoa uoaVar) {
            z65.h(uoaVar, "$this$invoke");
            uoaVar.e(new a(jo8.this));
            uoaVar.h(new b(jo8.this));
            uoaVar.d(c.a);
            uoaVar.f(d.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(uoa uoaVar) {
            a(uoaVar);
            return Unit.a;
        }
    }

    /* compiled from: ProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luoa;", "", "a", "(Luoa;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jo8$m */
    /* loaded from: classes2.dex */
    static final class m extends ej5 implements Function1<uoa, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileSettingsFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "a", "()Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: jo8$m$a */
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function0<View> {
            final /* synthetic */ jo8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(jo8 jo8Var) {
                super(0);
                this.a = jo8Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final View invoke() {
                View requireView = this.a.requireView();
                z65.g(requireView, "requireView(...)");
                return requireView;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileSettingsFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: jo8$m$b */
        /* loaded from: classes2.dex */
        public static final class b extends ej5 implements Function0<String> {
            final /* synthetic */ jo8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(jo8 jo8Var) {
                super(0);
                this.a = jo8Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                String string = this.a.getString(t09.l);
                z65.g(string, "getString(...)");
                return string;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileSettingsFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: jo8$m$c */
        /* loaded from: classes2.dex */
        public static final class c extends ej5 implements Function0<Integer> {
            public static final c a = new c();

            c() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 5;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileSettingsFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: jo8$m$d */
        /* loaded from: classes2.dex */
        public static final class d extends ej5 implements Function0<Integer> {
            public static final d a = new d();

            d() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 2;
            }
        }

        m() {
            super(1);
        }

        public final void a(uoa uoaVar) {
            z65.h(uoaVar, "$this$invoke");
            uoaVar.e(new a(jo8.this));
            uoaVar.h(new b(jo8.this));
            uoaVar.d(c.a);
            uoaVar.f(d.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(uoa uoaVar) {
            a(uoaVar);
            return Unit.a;
        }
    }

    /* compiled from: ProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luoa;", "", "a", "(Luoa;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jo8$n */
    /* loaded from: classes2.dex */
    static final class n extends ej5 implements Function1<uoa, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileSettingsFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "a", "()Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: jo8$n$a */
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function0<View> {
            final /* synthetic */ jo8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(jo8 jo8Var) {
                super(0);
                this.a = jo8Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final View invoke() {
                View requireView = this.a.requireView();
                z65.g(requireView, "requireView(...)");
                return requireView;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileSettingsFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: jo8$n$b */
        /* loaded from: classes2.dex */
        public static final class b extends ej5 implements Function0<String> {
            final /* synthetic */ jo8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(jo8 jo8Var) {
                super(0);
                this.a = jo8Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                String string = this.a.getString(t09.birthday_already_set);
                z65.g(string, "getString(...)");
                return string;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileSettingsFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: jo8$n$c */
        /* loaded from: classes2.dex */
        public static final class c extends ej5 implements Function0<Integer> {
            public static final c a = new c();

            c() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 3;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileSettingsFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: jo8$n$d */
        /* loaded from: classes2.dex */
        public static final class d extends ej5 implements Function0<Integer> {
            public static final d a = new d();

            d() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 2;
            }
        }

        n() {
            super(1);
        }

        public final void a(uoa uoaVar) {
            z65.h(uoaVar, "$this$invoke");
            uoaVar.e(new a(jo8.this));
            uoaVar.h(new b(jo8.this));
            uoaVar.d(c.a);
            uoaVar.f(d.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(uoa uoaVar) {
            a(uoaVar);
            return Unit.a;
        }
    }

    /* compiled from: ProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Luoa;", "", "a", "(Luoa;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jo8$o */
    /* loaded from: classes2.dex */
    static final class o extends ej5 implements Function1<uoa, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileSettingsFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "a", "()Landroid/view/View;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: jo8$o$a */
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function0<View> {
            final /* synthetic */ jo8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(jo8 jo8Var) {
                super(0);
                this.a = jo8Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final View invoke() {
                View requireView = this.a.requireView();
                z65.g(requireView, "requireView(...)");
                return requireView;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileSettingsFragment.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: jo8$o$b */
        /* loaded from: classes2.dex */
        public static final class b extends ej5 implements Function0<String> {
            final /* synthetic */ jo8 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(jo8 jo8Var) {
                super(0);
                this.a = jo8Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                String string = this.a.getString(t09.l);
                z65.g(string, "getString(...)");
                return string;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileSettingsFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: jo8$o$c */
        /* loaded from: classes2.dex */
        public static final class c extends ej5 implements Function0<Integer> {
            public static final c a = new c();

            c() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 3;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProfileSettingsFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: jo8$o$d */
        /* loaded from: classes2.dex */
        public static final class d extends ej5 implements Function0<Integer> {
            public static final d a = new d();

            d() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                return 2;
            }
        }

        o() {
            super(1);
        }

        public final void a(uoa uoaVar) {
            z65.h(uoaVar, "$this$invoke");
            uoaVar.e(new a(jo8.this));
            uoaVar.h(new b(jo8.this));
            uoaVar.d(c.a);
            uoaVar.f(d.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(uoa uoaVar) {
            a(uoaVar);
            return Unit.a;
        }
    }

    /* compiled from: ProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "year", "", "a", "(III)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: jo8$p */
    /* loaded from: classes2.dex */
    static final class p extends ej5 implements y84<Integer, Integer, Integer, Unit> {
        p() {
            super(3);
        }

        public final void a(int i, int i2, int i3) {
            jo8.this.Bh().S(i3);
        }

        @Override // defpackage.y84
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3) {
            a(num.intValue(), num2.intValue(), num3.intValue());
            return Unit.a;
        }
    }

    public jo8() {
        super(iz8.fragment_profile_settings);
        this.c = kb0.e(this, iy8.profile_settings_toolbar);
        this.d = kb0.e(this, iy8.profile_settings_name_field);
        this.e = kb0.e(this, iy8.profile_settings_phone_number_field);
        this.f = kb0.e(this, iy8.profile_settings_email_field);
        this.g = kb0.e(this, iy8.profile_settings_birthday_field);
        this.h = kb0.e(this, iy8.profile_settings_switch_receive_sms);
        this.i = kb0.e(this, iy8.profile_settings_delete_account_button);
        this.j = kb0.e(this, iy8.profile_settings_logout_button);
        this.k = kb0.e(this, iy8.profile_settings_logout_progress_bar);
        this.l = kb0.e(this, iy8.profile_settings_select_locale_layout);
        this.m = kb0.e(this, iy8.profile_settings_divider);
        this.n = kb0.e(this, iy8.profile_settings_legal_documents);
        this.o = kb0.e(this, iy8.profile_settings_deletion_status_container);
        this.p = kb0.e(this, iy8.profile_settings_deletion_status_title);
        this.q = kb0.e(this, iy8.profile_settings_cancel_deletion_button);
        this.r = kb0.e(this, iy8.profile_settings_progress_bar);
        this.s = kb0.e(this, iy8.profile_settings_delete_separator);
        this.t = kb0.e(this, iy8.profile_settings_version);
        h hVar = new h();
        MvpDelegate mvpDelegate = getMvpDelegate();
        z65.g(mvpDelegate, "mvpDelegate");
        this.v = new MoxyKtxDelegate(mvpDelegate, ProfileSettingsPresenter.class.getName() + ".presenter", hVar);
    }

    private final DodoInputText Ah() {
        return (DodoInputText) this.e.a(this, x[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProfileSettingsPresenter Bh() {
        return (ProfileSettingsPresenter) this.v.getValue(this, x[18]);
    }

    private final View Dh() {
        return (View) this.l.a(this, x[9]);
    }

    private final View Eh() {
        return (View) this.m.a(this, x[10]);
    }

    private final View Fh() {
        return (View) this.s.a(this, x[16]);
    }

    private final SwitchMaterial Gh() {
        return (SwitchMaterial) this.h.a(this, x[5]);
    }

    private final Toolbar Hh() {
        return (Toolbar) this.c.a(this, x[0]);
    }

    private final DodoInputText Ih() {
        return (DodoInputText) this.d.a(this, x[1]);
    }

    private final AppCompatTextView Jh() {
        return (AppCompatTextView) this.t.a(this, x[17]);
    }

    private final void Kh() {
        Bh().W();
        androidx.fragment.app.d activity = getActivity();
        if (activity != null) {
            Intent intent = new Intent("android.settings.APP_LOCALE_SETTINGS");
            intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
            startActivity(intent);
        }
    }

    private final void Lh() {
        View view = getView();
        if (view != null) {
            gg5.c(view);
        }
        Bh().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Mh(jo8 jo8Var, View view) {
        z65.h(jo8Var, "this$0");
        jo8Var.Lh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Nh(jo8 jo8Var, CompoundButton compoundButton, boolean z) {
        z65.h(jo8Var, "this$0");
        jo8Var.Bh().Z(z);
    }

    private final DodoInputText qh() {
        return (DodoInputText) this.g.a(this, x[4]);
    }

    private final Button rh() {
        return (Button) this.q.a(this, x[14]);
    }

    private final View sh() {
        return (View) this.i.a(this, x[6]);
    }

    private final ProgressBar th() {
        return (ProgressBar) this.r.a(this, x[15]);
    }

    private final TextView uh() {
        return (TextView) this.p.a(this, x[13]);
    }

    private final View vh() {
        return (View) this.o.a(this, x[12]);
    }

    private final DodoInputText wh() {
        return (DodoInputText) this.f.a(this, x[3]);
    }

    private final View xh() {
        return (View) this.n.a(this, x[11]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View yh() {
        return (View) this.j.a(this, x[7]);
    }

    private final ProgressBar zh() {
        return (ProgressBar) this.k.a(this, x[8]);
    }

    @Override // defpackage.qo8
    public void Ba(String str) {
        z65.h(str, "email");
        wh().setText(str);
    }

    @Override // defpackage.qo8
    public void Cb() {
        un3.e(vh());
    }

    public final as8<ProfileSettingsPresenter> Ch() {
        as8<ProfileSettingsPresenter> as8Var = this.u;
        if (as8Var != null) {
            return as8Var;
        }
        z65.z("presenterProvider");
        return null;
    }

    @Override // defpackage.qo8
    public void F7(String str) {
        z65.h(str, "birthdayString");
        String string = getString(t09.birthday_alert_text, str);
        z65.g(string, "getString(...)");
        String string2 = getString(t09.confirm);
        z65.g(string2, "getString(...)");
        String string3 = getString(t09.i);
        z65.g(string3, "getString(...)");
        tj1.e.a(string, string3, string2, "birthday_alert").show(getChildFragmentManager(), "birthday_alert");
    }

    @Override // defpackage.qo8
    public void J4() {
        un3.k(zh());
    }

    @Override // defpackage.qo8
    public void Jd() {
        un3.e(th());
        rh().setEnabled(true);
    }

    @Override // defpackage.tj1.a
    public void O8(String str) {
        z65.h(str, "id");
        if (z65.c(str, "birthday_alert")) {
            Bh().Q();
        }
        if (z65.c(str, "go_to_app_settings")) {
            Kh();
        }
    }

    @Override // defpackage.qo8
    public void Oc() {
        un3.e(th());
        sh().setEnabled(true);
    }

    @Override // defpackage.qo8
    public void P3(String str) {
        z65.h(str, "birthday");
        qh().setText(str);
        qh().setHelperText(null);
    }

    @Override // defpackage.qo8
    public void Qe() {
        rh().setEnabled(false);
        un3.k(th());
    }

    @Override // defpackage.iu6.e
    public void S9() {
        Bh().N();
    }

    @Override // defpackage.qo8
    public void X1() {
        tj1.b bVar = tj1.e;
        String string = requireContext().getString(t09.profile_settings_select_locale_dialog_text);
        z65.g(string, "getString(...)");
        bVar.a(string, requireContext().getString(t09.profile_settings_select_locale_dialog_cancel), requireContext().getString(t09.profile_settings_select_locale_dialog_confirm), "go_to_app_settings").show(getChildFragmentManager(), "go_to_app_settings");
    }

    @Override // defpackage.qo8
    public void Y1() {
        un3.e(sh());
        un3.e(Fh());
    }

    @Override // defpackage.qo8
    public void Z5() {
        soa.a.a(new o()).P(yh()).U();
    }

    @Override // defpackage.iu6.d
    public void Z9() {
        Bh().L();
    }

    @Override // defpackage.qo8
    public void aa() {
        wh().setError((String) null);
    }

    @Override // defpackage.qo8
    public void b6(String str) {
        z65.h(str, "notFullbirthday");
        qh().setText(str);
        qh().setHelperText(getString(t09.profile_settings_not_full_birthday_message));
    }

    @Override // defpackage.qo8
    public void ed() {
        vm2.a aVar = vm2.g;
        aVar.d(vm2.a.c(aVar, false, false, false, 7, null), this, new k()).show(getChildFragmentManager(), "dateDialog");
    }

    @Override // defpackage.qo8
    public void ef() {
        Ih().setError(t09.name_input_error);
    }

    @Override // defpackage.qo8
    public void g5() {
        un3.e(zh());
    }

    @Override // defpackage.qo8
    public void g7() {
        soa.a.a(new m()).P(yh()).U();
    }

    @Override // defpackage.qo8
    public void h6() {
        soa.a.a(new l()).P(yh()).U();
    }

    @Override // defpackage.qo8
    public void i5() {
        wh().setError(t09.k);
    }

    @Override // defpackage.qo8
    public void k0() {
        if (Dh().getVisibility() == 0) {
            un3.k(Eh());
        }
        un3.k(xh());
    }

    @Override // defpackage.qo8
    public void k1() {
        oma.a(sh(), new i());
        un3.k(sh());
        un3.k(Fh());
    }

    @Override // defpackage.qo8
    public void l7() {
        un3.k(Dh());
    }

    @Override // defpackage.qo8
    public void m9() {
        sh().setEnabled(false);
        un3.k(th());
    }

    @Override // defpackage.qo8
    public void o5() {
        soa.a.a(new n()).P(yh()).U();
    }

    @Override // defpackage.w50
    public boolean onBackPressed() {
        Lh();
        return true;
    }

    @Override // defpackage.tj1.a
    public void onCancel(String str) {
        z65.h(str, "id");
        if (z65.c(str, "go_to_app_settings")) {
            Bh().X();
        }
    }

    @Override // moxy.MvpAppCompatFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        go8.a.a().a((ProfileSettingsDependencies) getComponentDependenciesRegistry().a(bc9.b(ProfileSettingsDependencies.class))).a(this);
        super.onCreate(bundle);
    }

    @Override // defpackage.f70, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        z65.h(view, "view");
        super.onViewCreated(view, bundle);
        Hh().setNavigationOnClickListener(new View.OnClickListener() { // from class: ho8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                jo8.Mh(jo8.this, view2);
            }
        });
        oma.a(yh(), new b());
        EditText editText = Ih().getEditText();
        z65.g(editText, "getEditText(...)");
        ProfileSettingsPresenter Bh = Bh();
        z65.g(Bh, "<get-presenter>(...)");
        e97.a(editText, new c(Bh));
        Ah().getEditText().setEnabled(false);
        Ah().getEditText().setFocusable(false);
        wh().getEditText().setInputType(33);
        EditText editText2 = wh().getEditText();
        z65.g(editText2, "getEditText(...)");
        ProfileSettingsPresenter Bh2 = Bh();
        z65.g(Bh2, "<get-presenter>(...)");
        e97.a(editText2, new d(Bh2));
        qh().getEditText().setFocusable(false);
        qh().getEditText().setFocusableInTouchMode(false);
        qh().getEditText().setInputType(524288);
        EditText editText3 = qh().getEditText();
        z65.g(editText3, "getEditText(...)");
        oma.a(editText3, new e());
        oma.a(Dh(), new f());
        oma.a(xh(), new g());
    }

    @Override // defpackage.qo8
    public void qa(String str, int i2, String str2, int i3, boolean z) {
        z65.h(str, "versionName");
        z65.h(str2, "buildType");
        StringBuilder sb = new StringBuilder(getString(t09.app_version, str, String.valueOf(i2)));
        if (z) {
            sb.append(" DEBUG");
        }
        if (z65.c(str2, "regress")) {
            sb.append(", RC version " + i3);
        }
        Jh().setText(sb.toString());
    }

    @Override // defpackage.qo8
    public void t3(String str) {
        z65.h(str, "phoneNumber");
        Ah().setText(BidiFormatter.getInstance().unicodeWrap(str));
    }

    @Override // defpackage.qo8
    public void t6(boolean z) {
        Gh().setOnCheckedChangeListener(null);
        Gh().setChecked(z);
        Gh().jumpDrawablesToCurrentState();
        Gh().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: io8
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                jo8.Nh(jo8.this, compoundButton, z2);
            }
        });
    }

    @Override // defpackage.qo8
    public void u7() {
        vm2.a aVar = vm2.g;
        aVar.d(vm2.a.c(aVar, false, false, false, 4, null), this, new p()).show(getChildFragmentManager(), "dateDialog");
    }

    @Override // defpackage.qo8
    public void ue(long j2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        int days = (int) (timeUnit.toDays(j2) - timeUnit.toDays(Calendar.getInstance().getTimeInMillis()));
        if (days <= 0) {
            uh().setText(getString(t09.profile_settings_account_deletion_status_today_title));
        } else {
            uh().setText(getResources().getQuantityString(f09.profile_settings_account_deletion_status_in_days_title, days, String.valueOf(days)));
        }
        oma.a(rh(), new j());
        un3.k(vh());
    }

    @Override // defpackage.qo8
    public void v4(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        Ih().setText(str);
    }

    @Override // defpackage.qo8
    public void x2() {
        Ih().setError((String) null);
    }

    @Override // defpackage.qo8
    public void y4() {
        new iu6.a().e(t09.account_deletion_confirm_dialog_title).b(t09.account_deletion_confirm_dialog_description).d(t09.account_deletion_confirm_dialog_positive_button).c(t09.account_deletion_confirm_dialog_negative_button).g(this);
    }

    @Override // defpackage.qo8
    public void ya() {
        qh().setText(getString(t09.birthday_not_defined));
    }
}
