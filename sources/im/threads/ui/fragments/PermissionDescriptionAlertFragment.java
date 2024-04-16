package im.threads.ui.fragments;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import im.threads.R;
import im.threads.business.transport.MessageAttributes;
import im.threads.ui.config.Config;
import im.threads.ui.fragments.PermissionDescriptionAlertFragment;
import im.threads.ui.styles.permissions.ContentGravity;
import im.threads.ui.styles.permissions.PermissionDescriptionButtonStyle;
import im.threads.ui.styles.permissions.PermissionDescriptionDialogBackgroundStyle;
import im.threads.ui.styles.permissions.PermissionDescriptionDialogStyle;
import im.threads.ui.styles.permissions.PermissionDescriptionImageStyle;
import im.threads.ui.styles.permissions.PermissionDescriptionTextStyle;
import im.threads.ui.styles.permissions.PermissionDescriptionType;
import im.threads.ui.utils.ColorsHelper;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PermissionDescriptionAlertFragment.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 N2\u00020\u0001:\u0002NOB\u0007¢\u0006\u0004\bL\u0010MJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\u001a\u0010\u0016\u001a\u00020\n2\b\b\u0001\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0018\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u001a\u0010\u001b\u001a\u00020\n2\b\b\u0001\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J$\u0010\u001f\u001a\u00020\n2\b\b\u0001\u0010\u001c\u001a\u00020\u00142\b\b\u0003\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0006H\u0002J \u0010&\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0002J\u001a\u0010(\u001a\u00020\n2\b\b\u0001\u0010'\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 H\u0002J\u001a\u0010*\u001a\u00020\n2\b\b\u0001\u0010)\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0006H\u0002J\u001a\u0010.\u001a\u00020\n2\b\b\u0001\u0010+\u001a\u00020\u00142\u0006\u0010-\u001a\u00020,H\u0002J,\u00101\u001a\u00020\n2\b\b\u0001\u0010/\u001a\u00020\u00142\b\b\u0001\u00100\u001a\u00020\u00142\u0006\u0010-\u001a\u00020,2\u0006\u0010\u001e\u001a\u00020\u0006H\u0002J\u0018\u00104\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u00103\u001a\u000202H\u0002J\u0010\u00107\u001a\u00020\n2\u0006\u00106\u001a\u000205H\u0016J\b\u00108\u001a\u00020\nH\u0016J\u0012\u0010<\u001a\u00020;2\b\u0010:\u001a\u0004\u0018\u000109H\u0016J\b\u0010=\u001a\u00020\nH\u0016J&\u0010B\u001a\u0004\u0018\u00010\u00062\u0006\u0010?\u001a\u00020>2\b\u0010A\u001a\u0004\u0018\u00010@2\b\u0010:\u001a\u0004\u0018\u000109H\u0016R\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J¨\u0006P"}, d2 = {"Lim/threads/ui/fragments/PermissionDescriptionAlertFragment;", "Landroidx/fragment/app/c;", "Lim/threads/ui/styles/permissions/PermissionDescriptionType;", MessageAttributes.TYPE, "Lim/threads/ui/styles/permissions/PermissionDescriptionDialogStyle;", "getPermissionDescriptionDialogStyle", "Landroid/view/View;", "dialogView", "Lim/threads/ui/styles/permissions/PermissionDescriptionImageStyle;", "imageStyle", "", "setIllustration", "Landroid/widget/ImageView;", "imageView", "setImageViewLayoutParams", "Landroid/widget/TextView;", "textView", "Lim/threads/ui/styles/permissions/PermissionDescriptionTextStyle;", "textStyle", "setTextStyle", "", "textAppearanceResId", "setTextAppearance", "", "fontPath", "setFont", "textSizeSpResId", "setTextSize", "marginTopDpResId", "marginBottomDpResId", "view", "setViewMargins", "Landroid/widget/Button;", "button", "Lim/threads/ui/styles/permissions/PermissionDescriptionButtonStyle;", "buttonStyle", "Landroid/view/View$OnClickListener;", "onClickListener", "setButtonStyle", "textResId", "setText", "backgroundResId", "setBackground", "cornerRadiusDpResId", "Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable", "setCornerRadius", "strokeColorResId", "strokeWidthDpResId", "setStroke", "Lim/threads/ui/styles/permissions/PermissionDescriptionDialogBackgroundStyle;", "backgroundStyle", "setDialogBackground", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "onAttach", "onDetach", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "onCreateView", "Lim/threads/ui/fragments/PermissionDescriptionAlertFragment$OnAllowPermissionClickListener;", "onAllowPermissionClickListener", "Lim/threads/ui/fragments/PermissionDescriptionAlertFragment$OnAllowPermissionClickListener;", "Lim/threads/ui/config/Config;", "config$delegate", "Lrn5;", "getConfig", "()Lim/threads/ui/config/Config;", "config", "<init>", "()V", "Companion", "OnAllowPermissionClickListener", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class PermissionDescriptionAlertFragment extends androidx.fragment.app.c {
    public static final Companion Companion = new Companion(null);
    private static final String KEY_PERMISSION_DESCRIPTION_TYPE = "KEY_PERMISSION_DESCRIPTION_TYPE";
    private static final String KEY_REQUEST_CODE = "KEY_REQUEST_CODE";
    public static final String TAG = "PermissionDescriptionAlertDialogFragment";
    private final rn5 config$delegate;
    private OnAllowPermissionClickListener onAllowPermissionClickListener;

    /* compiled from: PermissionDescriptionAlertFragment.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lim/threads/ui/fragments/PermissionDescriptionAlertFragment$Companion;", "", "()V", PermissionDescriptionAlertFragment.KEY_PERMISSION_DESCRIPTION_TYPE, "", PermissionDescriptionAlertFragment.KEY_REQUEST_CODE, "TAG", "getGravity", "", "contentGravity", "Lim/threads/ui/styles/permissions/ContentGravity;", "newInstance", "Lim/threads/ui/fragments/PermissionDescriptionAlertFragment;", MessageAttributes.TYPE, "Lim/threads/ui/styles/permissions/PermissionDescriptionType;", "requestCode", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {

        /* compiled from: PermissionDescriptionAlertFragment.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ContentGravity.values().length];
                try {
                    iArr[ContentGravity.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ContentGravity.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ContentGravity.RIGHT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getGravity(ContentGravity contentGravity) {
            int i = WhenMappings.$EnumSwitchMapping$0[contentGravity.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return 1;
                }
                if (i == 3) {
                    return 8388613;
                }
                throw new NoWhenBranchMatchedException();
            }
            return 8388611;
        }

        public final PermissionDescriptionAlertFragment newInstance(PermissionDescriptionType permissionDescriptionType, int i) {
            z65.h(permissionDescriptionType, MessageAttributes.TYPE);
            Bundle bundle = new Bundle();
            bundle.putSerializable(PermissionDescriptionAlertFragment.KEY_PERMISSION_DESCRIPTION_TYPE, permissionDescriptionType);
            bundle.putInt(PermissionDescriptionAlertFragment.KEY_REQUEST_CODE, i);
            PermissionDescriptionAlertFragment permissionDescriptionAlertFragment = new PermissionDescriptionAlertFragment();
            permissionDescriptionAlertFragment.setArguments(bundle);
            return permissionDescriptionAlertFragment;
        }
    }

    /* compiled from: PermissionDescriptionAlertFragment.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lim/threads/ui/fragments/PermissionDescriptionAlertFragment$OnAllowPermissionClickListener;", "", "onAllowClick", "", MessageAttributes.TYPE, "Lim/threads/ui/styles/permissions/PermissionDescriptionType;", "requestCode", "", "onDialogDetached", "threads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface OnAllowPermissionClickListener {
        void onAllowClick(PermissionDescriptionType permissionDescriptionType, int i);

        void onDialogDetached();
    }

    /* compiled from: PermissionDescriptionAlertFragment.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PermissionDescriptionType.values().length];
            try {
                iArr[PermissionDescriptionType.STORAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionDescriptionType.RECORD_AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PermissionDescriptionType.CAMERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PermissionDescriptionAlertFragment() {
        rn5 b;
        b = yn5.b(PermissionDescriptionAlertFragment$config$2.INSTANCE);
        this.config$delegate = b;
    }

    private final Config getConfig() {
        return (Config) this.config$delegate.getValue();
    }

    private final PermissionDescriptionDialogStyle getPermissionDescriptionDialogStyle(PermissionDescriptionType permissionDescriptionType) {
        int i = WhenMappings.$EnumSwitchMapping$0[permissionDescriptionType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return getConfig().getCameraPermissionDescriptionDialogStyle();
                }
                throw new NoWhenBranchMatchedException();
            }
            return getConfig().getRecordAudioPermissionDescriptionDialogStyle();
        }
        return getConfig().getStoragePermissionDescriptionDialogStyle();
    }

    public static final PermissionDescriptionAlertFragment newInstance(PermissionDescriptionType permissionDescriptionType, int i) {
        return Companion.newInstance(permissionDescriptionType, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$1(PermissionDescriptionAlertFragment permissionDescriptionAlertFragment, PermissionDescriptionType permissionDescriptionType, int i, View view) {
        z65.h(permissionDescriptionAlertFragment, "this$0");
        z65.h(permissionDescriptionType, tmb.TYPE_JSON_NAME);
        OnAllowPermissionClickListener onAllowPermissionClickListener = permissionDescriptionAlertFragment.onAllowPermissionClickListener;
        if (onAllowPermissionClickListener != null) {
            onAllowPermissionClickListener.onAllowClick(permissionDescriptionType, i);
        }
        permissionDescriptionAlertFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateView$lambda$2(PermissionDescriptionAlertFragment permissionDescriptionAlertFragment, View view) {
        z65.h(permissionDescriptionAlertFragment, "this$0");
        permissionDescriptionAlertFragment.dismiss();
    }

    private final void setBackground(int i, View view) {
        if (i != 0) {
            view.setBackground(iu1.e(view.getContext(), i));
        }
    }

    private final void setButtonStyle(Button button, PermissionDescriptionButtonStyle permissionDescriptionButtonStyle, View.OnClickListener onClickListener) {
        button.setOnClickListener(onClickListener);
        setText(permissionDescriptionButtonStyle.getTextResId(), button);
        setTextAppearance(permissionDescriptionButtonStyle.getTextAppearanceResId(), button);
        if (permissionDescriptionButtonStyle.getTextAppearanceResId() == 0) {
            setFont(permissionDescriptionButtonStyle.getFontPath(), button);
            setTextSize(permissionDescriptionButtonStyle.getTextSizeSpResId(), button);
            ColorsHelper.setTextColor(button, permissionDescriptionButtonStyle.getTextColorResId());
        }
        setViewMargins(permissionDescriptionButtonStyle.getMarginTopDpResId(), permissionDescriptionButtonStyle.getMarginBottomDpResId(), button);
        setBackground(permissionDescriptionButtonStyle.getBackgroundResId(), button);
        if (permissionDescriptionButtonStyle.getBackgroundResId() == 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            setCornerRadius(permissionDescriptionButtonStyle.getCornerRadiusDpResId(), gradientDrawable);
            gradientDrawable.setColor(iu1.c(button.getContext(), permissionDescriptionButtonStyle.getBackgroundColorResId()));
            setStroke(permissionDescriptionButtonStyle.getStrokeColorResId(), permissionDescriptionButtonStyle.getStrokeWidthDpResId(), gradientDrawable, button);
            button.setBackground(gradientDrawable);
        }
    }

    private final void setCornerRadius(int i, GradientDrawable gradientDrawable) {
        if (i != 0) {
            gradientDrawable.setCornerRadius(getResources().getDimension(i));
        }
    }

    private final void setDialogBackground(View view, PermissionDescriptionDialogBackgroundStyle permissionDescriptionDialogBackgroundStyle) {
        setBackground(permissionDescriptionDialogBackgroundStyle.getBackgroundResId(), view);
        if (permissionDescriptionDialogBackgroundStyle.getBackgroundResId() == 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            setCornerRadius(permissionDescriptionDialogBackgroundStyle.getCornerRadiusDpResId(), gradientDrawable);
            gradientDrawable.setColor(iu1.c(view.getContext(), permissionDescriptionDialogBackgroundStyle.getBackgroundColorResId()));
            setStroke(permissionDescriptionDialogBackgroundStyle.getStrokeColorResId(), permissionDescriptionDialogBackgroundStyle.getStrokeWidthDpResId(), gradientDrawable, view);
            view.setBackground(gradientDrawable);
        }
    }

    private final void setFont(String str, TextView textView) {
        if (str.length() > 0) {
            textView.setTypeface(Typeface.createFromAsset(textView.getContext().getAssets(), str));
        }
    }

    private final void setIllustration(View view, PermissionDescriptionImageStyle permissionDescriptionImageStyle) {
        View findViewById = view.findViewById(R.id.image);
        z65.g(findViewById, "dialogView.findViewById(R.id.image)");
        ImageView imageView = (ImageView) findViewById;
        if (permissionDescriptionImageStyle.getImageResId() == 0) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setImageResource(permissionDescriptionImageStyle.getImageResId());
        setImageViewLayoutParams(permissionDescriptionImageStyle, imageView);
    }

    private final void setImageViewLayoutParams(PermissionDescriptionImageStyle permissionDescriptionImageStyle, ImageView imageView) {
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        z65.f(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (permissionDescriptionImageStyle.getMarginTopDpResId() != 0) {
            layoutParams2.setMargins(0, getResources().getDimensionPixelSize(permissionDescriptionImageStyle.getMarginTopDpResId()), 0, 0);
        }
        layoutParams2.gravity = Companion.getGravity(permissionDescriptionImageStyle.getLayoutGravity());
        imageView.setLayoutParams(layoutParams2);
    }

    private final void setStroke(int i, int i2, GradientDrawable gradientDrawable, View view) {
        if (i != 0 && i2 != 0) {
            gradientDrawable.setStroke(view.getContext().getResources().getDimensionPixelSize(i2), iu1.c(view.getContext(), i));
        }
    }

    private final void setText(int i, Button button) {
        if (i != 0) {
            button.setText(button.getContext().getString(i));
        }
    }

    private final void setTextAppearance(int i, TextView textView) {
        if (i != 0) {
            edb.o(textView, i);
        }
    }

    private final void setTextSize(int i, TextView textView) {
        if (i != 0) {
            textView.setTextSize(0, getResources().getDimension(i));
        }
    }

    private final void setTextStyle(TextView textView, PermissionDescriptionTextStyle permissionDescriptionTextStyle) {
        if (permissionDescriptionTextStyle.getTextResId() == 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(textView.getContext().getString(permissionDescriptionTextStyle.getTextResId()));
        setTextAppearance(permissionDescriptionTextStyle.getTextAppearanceResId(), textView);
        if (permissionDescriptionTextStyle.getTextAppearanceResId() == 0) {
            setFont(permissionDescriptionTextStyle.getFontPath(), textView);
            setTextSize(permissionDescriptionTextStyle.getTextSizeSpResId(), textView);
            ColorsHelper.setTextColor(textView, permissionDescriptionTextStyle.getTextColorResId());
        }
        setViewMargins$default(this, permissionDescriptionTextStyle.getMarginTopDpResId(), 0, textView, 2, null);
        textView.setGravity(Companion.getGravity(permissionDescriptionTextStyle.getGravity()));
    }

    private final void setViewMargins(int i, int i2, View view) {
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        z65.f(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (i != 0) {
            i3 = getResources().getDimensionPixelSize(i);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = getResources().getDimensionPixelSize(i2);
        } else {
            i4 = 0;
        }
        layoutParams2.setMargins(0, i3, 0, i4);
        view.setLayoutParams(layoutParams2);
    }

    static /* synthetic */ void setViewMargins$default(PermissionDescriptionAlertFragment permissionDescriptionAlertFragment, int i, int i2, View view, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        permissionDescriptionAlertFragment.setViewMargins(i, i2, view);
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        super.onAttach(context);
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof OnAllowPermissionClickListener) {
            this.onAllowPermissionClickListener = (OnAllowPermissionClickListener) parentFragment;
        } else if (context instanceof OnAllowPermissionClickListener) {
            this.onAllowPermissionClickListener = (OnAllowPermissionClickListener) context;
        }
    }

    @Override // androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), getTheme());
        dialog.setCanceledOnTouchOutside(false);
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        z65.h(layoutInflater, "inflater");
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ecc_fragment_dialog_permission_description, viewGroup);
        Serializable serializable = requireArguments().getSerializable(KEY_PERMISSION_DESCRIPTION_TYPE);
        z65.f(serializable, "null cannot be cast to non-null type im.threads.ui.styles.permissions.PermissionDescriptionType");
        final PermissionDescriptionType permissionDescriptionType = (PermissionDescriptionType) serializable;
        final int i = requireArguments().getInt(KEY_REQUEST_CODE);
        PermissionDescriptionDialogStyle permissionDescriptionDialogStyle = getPermissionDescriptionDialogStyle(permissionDescriptionType);
        z65.g(inflate, "dialogView");
        setIllustration(inflate, permissionDescriptionDialogStyle.getImageStyle());
        View findViewById = inflate.findViewById(R.id.title);
        z65.g(findViewById, "dialogView.findViewById(R.id.title)");
        setTextStyle((TextView) findViewById, permissionDescriptionDialogStyle.getTitleStyle());
        View findViewById2 = inflate.findViewById(R.id.message);
        z65.g(findViewById2, "dialogView.findViewById(R.id.message)");
        setTextStyle((TextView) findViewById2, permissionDescriptionDialogStyle.getMessageStyle());
        View findViewById3 = inflate.findViewById(R.id.positive_button);
        z65.g(findViewById3, "dialogView.findViewById(R.id.positive_button)");
        setButtonStyle((Button) findViewById3, permissionDescriptionDialogStyle.getPositiveButtonStyle(), new View.OnClickListener() { // from class: iy7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionDescriptionAlertFragment.onCreateView$lambda$1(PermissionDescriptionAlertFragment.this, permissionDescriptionType, i, view);
            }
        });
        View findViewById4 = inflate.findViewById(R.id.negative_button);
        z65.g(findViewById4, "dialogView.findViewById(R.id.negative_button)");
        setButtonStyle((Button) findViewById4, permissionDescriptionDialogStyle.getNegativeButtonStyle(), new View.OnClickListener() { // from class: jy7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PermissionDescriptionAlertFragment.onCreateView$lambda$2(PermissionDescriptionAlertFragment.this, view);
            }
        });
        View findViewById5 = inflate.findViewById(R.id.dialog_layout);
        z65.g(findViewById5, "dialogView.findViewById(R.id.dialog_layout)");
        setDialogBackground(findViewById5, permissionDescriptionDialogStyle.getBackgroundStyle());
        return inflate;
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        OnAllowPermissionClickListener onAllowPermissionClickListener = this.onAllowPermissionClickListener;
        if (onAllowPermissionClickListener != null) {
            onAllowPermissionClickListener.onDialogDetached();
            this.onAllowPermissionClickListener = null;
        }
    }

    @Override // androidx.fragment.app.c, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -2);
            }
            Window window2 = dialog.getWindow();
            if (window2 != null) {
                window2.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
    }
}
