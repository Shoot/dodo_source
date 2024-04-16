package im.threads.ui.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import im.threads.R;
import im.threads.business.imageLoading.LoadImageKt;
import im.threads.business.models.ConsultInfo;
import im.threads.business.utils.FileUtils;
import im.threads.databinding.EccActivityConsultPageBinding;
import im.threads.ui.activities.ConsultActivity;
import im.threads.ui.config.Config;
import im.threads.ui.utils.ColorFilterKotlinExtKt;
import im.threads.ui.widget.CustomFontTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ConsultActivity.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0002H\u0002J\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0012\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lim/threads/ui/activities/ConsultActivity;", "Lim/threads/ui/activities/BaseActivity;", "", "hideSystemUI", "setStatusBarColor", "Lim/threads/business/models/ConsultInfo;", "consultInfo", "setConsultAvatar", "setConsultInfo", "setupToolbar", "", "text", "Landroid/widget/TextView;", "textView", "setTextForConsultInfo", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lim/threads/databinding/EccActivityConsultPageBinding;", "binding$delegate", "Lrn5;", "getBinding", "()Lim/threads/databinding/EccActivityConsultPageBinding;", "binding", "Lim/threads/ui/config/Config;", "config$delegate", "getConfig", "()Lim/threads/ui/config/Config;", "config", "<init>", "()V", "Companion", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public class ConsultActivity extends BaseActivity {
    public static final Companion Companion = new Companion(null);
    public static final String consultInfoKey = "consultInfoKey";
    private final rn5 binding$delegate;
    private final rn5 config$delegate;

    public ConsultActivity() {
        rn5 b;
        rn5 b2;
        b = yn5.b(new ConsultActivity$binding$2(this));
        this.binding$delegate = b;
        b2 = yn5.b(ConsultActivity$config$2.INSTANCE);
        this.config$delegate = b2;
    }

    private final EccActivityConsultPageBinding getBinding() {
        return (EccActivityConsultPageBinding) this.binding$delegate.getValue();
    }

    private final Config getConfig() {
        return (Config) this.config$delegate.getValue();
    }

    private final void hideSystemUI() {
        if (Build.VERSION.SDK_INT >= 23) {
            w4c.b(getWindow(), false);
        } else {
            getWindow().getDecorView().setSystemUiVisibility(1280);
        }
    }

    private final void setConsultAvatar(ConsultInfo consultInfo) {
        EccActivityConsultPageBinding binding = getBinding();
        binding.consultImage.setBackground(on.b(this, getConfig().getChatStyle().defaultOperatorAvatar));
        String photoUrl = consultInfo.getPhotoUrl();
        if (photoUrl != null && photoUrl.length() != 0) {
            String convertRelativeUrlToAbsolute = FileUtils.convertRelativeUrlToAbsolute(photoUrl);
            ImageView imageView = binding.consultImage;
            z65.g(imageView, "consultImage");
            LoadImageKt.loadImage$default(imageView, convertRelativeUrlToAbsolute, null, null, null, null, false, false, false, 254, null);
            binding.consultImage.setTag(convertRelativeUrlToAbsolute);
        }
    }

    private final void setConsultInfo(ConsultInfo consultInfo) {
        EccActivityConsultPageBinding binding = getBinding();
        String name = consultInfo.getName();
        CustomFontTextView customFontTextView = binding.consultTitle;
        z65.g(customFontTextView, "consultTitle");
        setTextForConsultInfo(name, customFontTextView);
        String status = consultInfo.getStatus();
        CustomFontTextView customFontTextView2 = binding.consultStatus;
        z65.g(customFontTextView2, "consultStatus");
        setTextForConsultInfo(status, customFontTextView2);
    }

    private final void setStatusBarColor() {
        super.setStatusBarColor(getResources().getBoolean(getConfig().getChatStyle().windowLightStatusBarResId), iu1.c(getBaseContext(), R.color.ecc_black_transparent));
    }

    private final void setTextForConsultInfo(String str, TextView textView) {
        if (str != null && str.length() != 0) {
            textView.setText(str);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }

    private final void setupToolbar() {
        EccActivityConsultPageBinding binding = getBinding();
        binding.toolbar.setTitle("");
        setSupportActionBar(binding.toolbar);
        binding.toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: tr1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConsultActivity.setupToolbar$lambda$5$lambda$3(ConsultActivity.this, view);
            }
        });
        binding.toolbar.Q();
        Drawable overflowIcon = binding.toolbar.getOverflowIcon();
        if (overflowIcon != null) {
            z65.g(overflowIcon, "overflowIcon");
            ColorFilterKotlinExtKt.applyColorFilter$default(overflowIcon, iu1.c(getBaseContext(), getConfig().getChatStyle().chatToolbarTextColorResId), null, 2, null);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, (int) getResources().getDimension(R.dimen.ecc_margin_big), 0, 0);
        binding.toolbar.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupToolbar$lambda$5$lambda$3(ConsultActivity consultActivity, View view) {
        z65.h(consultActivity, "this$0");
        consultActivity.finish();
    }

    public static final void startActivity(Activity activity) {
        Companion.startActivity(activity);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // im.threads.ui.activities.BaseActivity, androidx.fragment.app.d, androidx.activity.ComponentActivity, defpackage.gm1, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hideSystemUI();
        setStatusBarColor();
        setContentView(getBinding().getRoot());
        ConsultInfo consultInfo = (ConsultInfo) getIntent().getParcelableExtra(consultInfoKey);
        if (consultInfo != null) {
            setConsultAvatar(consultInfo);
            setConsultInfo(consultInfo);
        }
        setupToolbar();
    }

    public static final void startActivity(Activity activity, ConsultInfo consultInfo) {
        Companion.startActivity(activity, consultInfo);
    }

    /* compiled from: ConsultActivity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007J\u001a\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lim/threads/ui/activities/ConsultActivity$Companion;", "", "()V", ConsultActivity.consultInfoKey, "", "startActivity", "", "activity", "Landroid/app/Activity;", "consultInfo", "Lim/threads/business/models/ConsultInfo;", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startActivity(Activity activity, ConsultInfo consultInfo) {
            z65.h(consultInfo, "consultInfo");
            Intent intent = new Intent(activity, ConsultActivity.class);
            intent.putExtra(ConsultActivity.consultInfoKey, consultInfo);
            if (activity != null) {
                activity.startActivity(intent);
            }
        }

        public final void startActivity(Activity activity) {
            if (activity != null) {
                activity.startActivity(new Intent(activity, ConsultActivity.class));
            }
        }
    }
}
