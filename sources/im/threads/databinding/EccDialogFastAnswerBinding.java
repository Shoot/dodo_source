package im.threads.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import im.threads.R;
import im.threads.ui.widget.CustomFontButton;
import im.threads.ui.widget.CustomFontEditText;
import im.threads.ui.widget.CustomFontTextView;
/* loaded from: classes3.dex */
public final class EccDialogFastAnswerBinding {
    @NonNull
    public final CustomFontEditText answer;
    @NonNull
    public final LinearLayout answerLayout;
    @NonNull
    public final CustomFontButton closeButton;
    @NonNull
    public final ImageView consultImage;
    @NonNull
    public final CustomFontTextView consultName;
    @NonNull
    public final LinearLayout header;
    @NonNull
    public final RelativeLayout layoutRoot;
    @NonNull
    public final CustomFontTextView question;
    @NonNull
    private final RelativeLayout rootView;
    @NonNull
    public final ImageButton send;

    private EccDialogFastAnswerBinding(@NonNull RelativeLayout relativeLayout, @NonNull CustomFontEditText customFontEditText, @NonNull LinearLayout linearLayout, @NonNull CustomFontButton customFontButton, @NonNull ImageView imageView, @NonNull CustomFontTextView customFontTextView, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout2, @NonNull CustomFontTextView customFontTextView2, @NonNull ImageButton imageButton) {
        this.rootView = relativeLayout;
        this.answer = customFontEditText;
        this.answerLayout = linearLayout;
        this.closeButton = customFontButton;
        this.consultImage = imageView;
        this.consultName = customFontTextView;
        this.header = linearLayout2;
        this.layoutRoot = relativeLayout2;
        this.question = customFontTextView2;
        this.send = imageButton;
    }

    @NonNull
    public static EccDialogFastAnswerBinding bind(@NonNull View view) {
        int i = R.id.answer;
        CustomFontEditText customFontEditText = (CustomFontEditText) pyb.a(view, i);
        if (customFontEditText != null) {
            i = R.id.answer_layout;
            LinearLayout linearLayout = (LinearLayout) pyb.a(view, i);
            if (linearLayout != null) {
                i = R.id.close_button;
                CustomFontButton customFontButton = (CustomFontButton) pyb.a(view, i);
                if (customFontButton != null) {
                    i = R.id.consult_image;
                    ImageView imageView = (ImageView) pyb.a(view, i);
                    if (imageView != null) {
                        i = R.id.consult_name;
                        CustomFontTextView customFontTextView = (CustomFontTextView) pyb.a(view, i);
                        if (customFontTextView != null) {
                            i = R.id.header;
                            LinearLayout linearLayout2 = (LinearLayout) pyb.a(view, i);
                            if (linearLayout2 != null) {
                                RelativeLayout relativeLayout = (RelativeLayout) view;
                                i = R.id.question;
                                CustomFontTextView customFontTextView2 = (CustomFontTextView) pyb.a(view, i);
                                if (customFontTextView2 != null) {
                                    i = R.id.send;
                                    ImageButton imageButton = (ImageButton) pyb.a(view, i);
                                    if (imageButton != null) {
                                        return new EccDialogFastAnswerBinding(relativeLayout, customFontEditText, linearLayout, customFontButton, imageView, customFontTextView, linearLayout2, relativeLayout, customFontTextView2, imageButton);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static EccDialogFastAnswerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static EccDialogFastAnswerBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.ecc_dialog_fast_answer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}
