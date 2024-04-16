package com.inappstory.sdk.stories.ui.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import com.inappstory.sdk.AppearanceManager;
import com.inappstory.sdk.R;
import com.inappstory.sdk.network.JsonParser;
import com.inappstory.sdk.stories.api.models.dialogstructure.CenterStructure;
import com.inappstory.sdk.stories.api.models.dialogstructure.DialogStructure;
import com.inappstory.sdk.stories.api.models.dialogstructure.SizeStructure;
import com.inappstory.sdk.stories.api.models.dialogstructure.TextStructure;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import com.inappstory.sdk.stories.ui.widgets.TextMultiInput;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import com.inappstory.sdk.stories.utils.Sizes;
/* loaded from: classes3.dex */
public class ContactDialog {
    CancelListener cancelListener;
    public DialogStructure dialogStructure;
    String id;
    SendListener sendListener;
    int storyId;
    public double coeff = 1.0d;
    private int flags = 0;
    float factor = 1.0f;

    /* loaded from: classes3.dex */
    public interface CancelListener {
        void onCancel(String str);
    }

    /* loaded from: classes3.dex */
    public interface SendListener {
        void onSend(String str, String str2);
    }

    /* loaded from: classes3.dex */
    class a implements Runnable {
        final /* synthetic */ Activity a;

        a(Activity activity) {
            this.a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            ContactDialog.this.showDialogInner(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c implements TextWatcher {
        int a;
        String b;
        final /* synthetic */ TextMultiInput c;
        final /* synthetic */ FrameLayout d;
        final /* synthetic */ GradientDrawable e;
        final /* synthetic */ FrameLayout f;

        c(TextMultiInput textMultiInput, FrameLayout frameLayout, GradientDrawable gradientDrawable, FrameLayout frameLayout2) {
            this.c = textMultiInput;
            this.d = frameLayout;
            this.e = gradientDrawable;
            this.f = frameLayout2;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            try {
                if (editable.toString().isEmpty()) {
                    this.f.setVisibility(8);
                } else {
                    this.f.setVisibility(0);
                }
            } catch (Exception unused) {
            }
            this.c.getMainText().removeTextChangedListener(this);
            if (this.c.getMainText().getLineCount() > 3) {
                this.c.getMainText().setText(this.b);
                this.c.getMainText().setSelection(this.a);
            } else {
                this.b = this.c.getMainText().getText().toString();
            }
            this.c.getMainText().addTextChangedListener(this);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.a = this.c.getMainText().getSelectionStart();
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.d.setBackground(this.e);
            this.c.setTextColor(ContactDialog.hex2color(ContactDialog.this.dialogStructure.configV2.main.input.text.color));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements DialogInterface.OnDismissListener {
        final /* synthetic */ Activity a;
        final /* synthetic */ TextMultiInput b;

        /* loaded from: classes3.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.b.clearFocus();
                ((InputMethodManager) d.this.a.getSystemService("input_method")).hideSoftInputFromWindow(d.this.b.getWindowToken(), 0);
                StatisticManager.getInstance().resumeStoryEvent(true);
            }
        }

        d(Activity activity, TextMultiInput textMultiInput) {
            this.a = activity;
            this.b = textMultiInput;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            View currentFocus = this.a.getCurrentFocus();
            if (currentFocus != null) {
                currentFocus.post(new a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements Runnable {
        final /* synthetic */ Activity a;

        e(Activity activity) {
            this.a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.getWindow().setFlags(1024, 1024);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements DialogInterface.OnCancelListener {
        f() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            ContactDialog contactDialog = ContactDialog.this;
            contactDialog.cancelListener.onCancel(contactDialog.id);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g implements View.OnClickListener {
        final /* synthetic */ int a;
        final /* synthetic */ TextMultiInput b;
        final /* synthetic */ Dialog c;
        final /* synthetic */ FrameLayout d;
        final /* synthetic */ GradientDrawable e;

        g(int i, TextMultiInput textMultiInput, Dialog dialog, FrameLayout frameLayout, GradientDrawable gradientDrawable) {
            this.a = i;
            this.b = textMultiInput;
            this.c = dialog;
            this.d = frameLayout;
            this.e = gradientDrawable;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ContactDialog.this.validate(this.a, this.b.getMainText().getText().toString(), this.b.getMaskLength())) {
                this.c.dismiss();
                String replaceAll = this.b.getText().replaceAll("\"", "\\\\\"");
                ContactDialog contactDialog = ContactDialog.this;
                contactDialog.sendListener.onSend(contactDialog.id, replaceAll);
                return;
            }
            this.d.setBackground(this.e);
            this.b.setTextColor(-65536);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class h implements Runnable {
        final /* synthetic */ Activity a;
        final /* synthetic */ AppCompatEditText b;

        h(Activity activity, AppCompatEditText appCompatEditText) {
            this.a = activity;
            this.b = appCompatEditText;
        }

        @Override // java.lang.Runnable
        public void run() {
            ContactDialog.this.keyboardFocus(this.a, this.b);
        }
    }

    public ContactDialog(int i, String str, String str2, SendListener sendListener, CancelListener cancelListener) {
        this.dialogStructure = (DialogStructure) JsonParser.fromJson(str2, DialogStructure.class);
        this.id = str;
        this.storyId = i;
        this.sendListener = sendListener;
        this.cancelListener = cancelListener;
    }

    private int getSize(float f2) {
        return (int) (this.factor * f2);
    }

    public static int hex2color(String str) {
        return Color.parseColor(str);
    }

    public static final boolean isValidEmail(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && Patterns.EMAIL_ADDRESS.matcher(charSequence).matches()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void keyboardFocus(Activity activity, AppCompatEditText appCompatEditText) {
        if (!Sizes.isTablet() && activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
            appCompatEditText.requestFocus();
            ((InputMethodManager) activity.getSystemService("input_method")).showSoftInput(appCompatEditText, 1);
        }
    }

    private void keyboardFocusCheck(Activity activity, AppCompatEditText appCompatEditText) {
        View currentFocus = activity.getCurrentFocus();
        h hVar = new h(activity, appCompatEditText);
        if (currentFocus != null) {
            currentFocus.postDelayed(hVar, 200L);
        } else {
            new Handler().postDelayed(hVar, 500L);
        }
    }

    private void setTypeface(AppCompatTextView appCompatTextView, boolean z, boolean z2, boolean z3) {
        Typeface font = AppearanceManager.getCommonInstance().getFont(z3, z, z2);
        int i = z2 ? 2 : 0;
        if (font == null) {
            font = appCompatTextView.getTypeface();
        }
        appCompatTextView.setTypeface(font, (z ? 1 : 0) + i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showDialogInner(Activity activity) {
        int i;
        int i2;
        Dialog dialog = new Dialog(activity, R.style.StoriesSDKAppTheme_DialogTheme);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.cs_dialog_layout);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (!Sizes.isTablet()) {
            dialog.getWindow().getDecorView().setBackgroundResource(17170445);
            dialog.getWindow().setDimAmount(0.05f);
        }
        FrameLayout frameLayout = (FrameLayout) dialog.findViewById(R.id.borderContainer);
        FrameLayout frameLayout2 = (FrameLayout) dialog.findViewById(R.id.editBorderContainer);
        FrameLayout frameLayout3 = (FrameLayout) dialog.findViewById(R.id.editContainer);
        frameLayout2.setElevation(0.0f);
        frameLayout3.setElevation(0.0f);
        frameLayout3.setElevation(0.0f);
        TextMultiInput textMultiInput = (TextMultiInput) dialog.findViewById(R.id.editText);
        String str = this.dialogStructure.configV2.main.input.type;
        int i3 = str.equals("tel") ? 0 : str.equals("email") ? 1 : 2;
        textMultiInput.init(i3);
        AppCompatTextView appCompatTextView = (AppCompatTextView) dialog.findViewById(R.id.text);
        FrameLayout frameLayout4 = (FrameLayout) dialog.findViewById(R.id.buttonBackground);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) dialog.findViewById(R.id.buttonText);
        if (Sizes.isTablet()) {
            i = activity.getResources().getDimensionPixelSize(R.dimen.cs_tablet_width);
            i2 = activity.getResources().getDimensionPixelSize(R.dimen.cs_tablet_height);
        } else {
            i = Sizes.getScreenSize(activity).x;
            i2 = Sizes.getScreenSize(activity).y;
        }
        DialogStructure dialogStructure = this.dialogStructure;
        if (dialogStructure.size == null) {
            dialogStructure.size = new SizeStructure();
            SizeStructure sizeStructure = this.dialogStructure.size;
            sizeStructure.width = 95.0f;
            sizeStructure.height = 40.0f;
        }
        DialogStructure dialogStructure2 = this.dialogStructure;
        SizeStructure sizeStructure2 = dialogStructure2.size;
        float f2 = i2;
        int i4 = (int) ((sizeStructure2.height / 100.0f) * f2);
        float f3 = i;
        int i5 = (int) ((sizeStructure2.width / 100.0f) * f3);
        this.factor = (1.0f * f3) / dialogStructure2.configV2.factor;
        LinearLayout linearLayout = (LinearLayout) dialog.findViewById(R.id.parentContainer);
        ((LinearLayout) dialog.findViewById(R.id.contentContainer)).setPaddingRelative(getSize(this.dialogStructure.configV2.main.padding.left), getSize(this.dialogStructure.configV2.main.padding.top), getSize(this.dialogStructure.configV2.main.padding.right), getSize(this.dialogStructure.configV2.main.padding.bottom));
        if (this.dialogStructure.configV2.main.question.text.value.isEmpty()) {
            appCompatTextView.setVisibility(8);
        } else {
            appCompatTextView.setText(this.dialogStructure.configV2.main.question.text.value);
            appCompatTextView.setTextColor(hex2color(this.dialogStructure.configV2.main.question.text.color));
            appCompatTextView.setTextSize(0, getSize(this.dialogStructure.configV2.main.question.text.size));
            appCompatTextView.setPaddingRelative(getSize(this.dialogStructure.configV2.main.question.padding.left), getSize(this.dialogStructure.configV2.main.question.padding.top), getSize(this.dialogStructure.configV2.main.question.padding.right), getSize(this.dialogStructure.configV2.main.question.padding.bottom));
            TextStructure textStructure = this.dialogStructure.configV2.main.question.text;
            appCompatTextView.setLineSpacing(0.0f, textStructure.lineHeight / textStructure.size);
        }
        setTypeface(appCompatTextView, this.dialogStructure.configV2.main.question.text.isBold(), this.dialogStructure.configV2.main.question.text.isItalic(), this.dialogStructure.configV2.main.question.text.isSecondary());
        String str2 = this.dialogStructure.configV2.main.question.text.align;
        str2.hashCode();
        if (str2.equals(ElementGenerator.TEXT_ALIGN_CENTER)) {
            ((LinearLayout.LayoutParams) appCompatTextView.getLayoutParams()).gravity = 1;
            appCompatTextView.setTextAlignment(4);
        } else if (!str2.equals(ElementGenerator.TEXT_ALIGN_RIGHT)) {
            appCompatTextView.setTextAlignment(5);
        } else {
            ((LinearLayout.LayoutParams) appCompatTextView.getLayoutParams()).gravity = 5;
            appCompatTextView.setTextAlignment(6);
        }
        textMultiInput.setHint(this.dialogStructure.configV2.main.input.text.placeholder);
        textMultiInput.setTextColor(hex2color(this.dialogStructure.configV2.main.input.text.color));
        textMultiInput.setHintTextColor(hex2color(this.dialogStructure.configV2.main.input.text.color));
        textMultiInput.setTextSize(0, getSize(this.dialogStructure.configV2.main.input.text.size));
        frameLayout2.setPaddingRelative(getSize(this.dialogStructure.configV2.main.input.padding.left), getSize(this.dialogStructure.configV2.main.input.padding.top), getSize(this.dialogStructure.configV2.main.input.padding.right), getSize(this.dialogStructure.configV2.main.input.padding.bottom));
        if (i3 != 0) {
            AppCompatEditText mainText = textMultiInput.getMainText();
            TextStructure textStructure2 = this.dialogStructure.configV2.main.input.text;
            mainText.setLineSpacing(0.0f, textStructure2.lineHeight / textStructure2.size);
            String str3 = this.dialogStructure.configV2.main.input.text.align;
            str3.hashCode();
            if (str3.equals(ElementGenerator.TEXT_ALIGN_CENTER)) {
                textMultiInput.getMainText().setTextAlignment(4);
            } else if (!str3.equals(ElementGenerator.TEXT_ALIGN_RIGHT)) {
                textMultiInput.getMainText().setTextAlignment(5);
            } else {
                textMultiInput.getMainText().setTextAlignment(6);
            }
        } else {
            textMultiInput.setLayoutDirection(0);
        }
        setTypeface(textMultiInput.getMainText(), this.dialogStructure.configV2.main.input.text.isBold(), this.dialogStructure.configV2.main.input.text.isItalic(), this.dialogStructure.configV2.main.input.text.isSecondary());
        if (i3 == 0) {
            setTypeface(textMultiInput.getCountryCodeText(), this.dialogStructure.configV2.main.input.text.isBold(), this.dialogStructure.configV2.main.input.text.isItalic(), this.dialogStructure.configV2.main.input.text.isSecondary());
            setTypeface(textMultiInput.getPhoneNumberHint(), this.dialogStructure.configV2.main.input.text.isBold(), this.dialogStructure.configV2.main.input.text.isItalic(), this.dialogStructure.configV2.main.input.text.isSecondary());
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout3.getLayoutParams();
        int size = getSize(this.dialogStructure.configV2.main.input.border.width);
        layoutParams.setMargins(size, size, size, size);
        frameLayout3.setLayoutParams(layoutParams);
        CenterStructure centerStructure = this.dialogStructure.size.center;
        if (centerStructure == null) {
            centerStructure = new CenterStructure(50.0f, 50.0f);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i5, -2);
        float f4 = centerStructure.y;
        float f5 = i4 / 2;
        float f6 = centerStructure.x;
        float f7 = i5 / 2;
        layoutParams2.setMargins((int) (((f3 * f6) / 100.0f) - f7), (int) (((f2 * f4) / 100.0f) - f5), (int) (((f3 * (100.0f - f6)) / 100.0f) - f7), (int) (((f2 * (100.0f - f4)) / 100.0f) - f5));
        appCompatTextView2.setPaddingRelative(getSize(this.dialogStructure.configV2.main.button.padding.left), getSize(this.dialogStructure.configV2.main.button.padding.top), getSize(this.dialogStructure.configV2.main.button.padding.right), getSize(this.dialogStructure.configV2.main.button.padding.bottom));
        appCompatTextView2.setText(this.dialogStructure.configV2.main.button.text.value);
        appCompatTextView2.setTextColor(hex2color(this.dialogStructure.configV2.main.button.text.color));
        appCompatTextView2.setTextSize(0, getSize(this.dialogStructure.configV2.main.button.text.size));
        TextStructure textStructure3 = this.dialogStructure.configV2.main.button.text;
        appCompatTextView2.setLineSpacing(0.0f, textStructure3.lineHeight / textStructure3.size);
        setTypeface(appCompatTextView2, this.dialogStructure.configV2.main.button.text.isBold(), this.dialogStructure.configV2.main.button.text.isItalic(), this.dialogStructure.configV2.main.button.text.isSecondary());
        String str4 = this.dialogStructure.configV2.main.button.text.align;
        str4.hashCode();
        if (str4.equals(ElementGenerator.TEXT_ALIGN_CENTER)) {
            appCompatTextView2.setTextAlignment(4);
        } else if (!str4.equals(ElementGenerator.TEXT_ALIGN_RIGHT)) {
            appCompatTextView2.setTextAlignment(5);
        } else {
            appCompatTextView2.setTextAlignment(6);
        }
        int size2 = getSize(this.dialogStructure.configV2.main.border.radius);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{hex2color(this.dialogStructure.configV2.main.button.background.color), hex2color(this.dialogStructure.configV2.main.button.background.color)});
        float f8 = size2;
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f8, f8, f8, f8});
        frameLayout4.setBackground(gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{hex2color(this.dialogStructure.configV2.main.input.border.color), hex2color(this.dialogStructure.configV2.main.input.border.color)});
        gradientDrawable2.setCornerRadius(getSize(this.dialogStructure.configV2.main.input.border.radius));
        GradientDrawable gradientDrawable3 = new GradientDrawable(orientation, new int[]{-65536, -65536});
        gradientDrawable3.setCornerRadius(getSize(this.dialogStructure.configV2.main.input.border.radius));
        GradientDrawable gradientDrawable4 = new GradientDrawable(orientation, new int[]{hex2color(this.dialogStructure.configV2.main.input.background.color), hex2color(this.dialogStructure.configV2.main.input.background.color)});
        gradientDrawable4.setCornerRadius(getSize(this.dialogStructure.configV2.main.input.border.radius));
        GradientDrawable gradientDrawable5 = new GradientDrawable(orientation, new int[]{hex2color(this.dialogStructure.configV2.main.border.color), hex2color(this.dialogStructure.configV2.main.border.color)});
        gradientDrawable5.setCornerRadius(getSize(this.dialogStructure.configV2.main.border.radius));
        GradientDrawable gradientDrawable6 = new GradientDrawable(orientation, new int[]{hex2color(this.dialogStructure.configV2.main.background.color), hex2color(this.dialogStructure.configV2.main.background.color)});
        gradientDrawable6.setCornerRadius(getSize(this.dialogStructure.configV2.main.border.radius));
        frameLayout2.setBackground(gradientDrawable2);
        frameLayout3.setBackground(gradientDrawable4);
        frameLayout.setBackground(gradientDrawable5);
        linearLayout.setBackground(gradientDrawable6);
        if (i3 == 0) {
            textMultiInput.getDivider().setBackgroundColor(hex2color(this.dialogStructure.configV2.main.background.color));
        }
        if (i3 == 0) {
            textMultiInput.getCountryCodeText().addTextChangedListener(new b(frameLayout2, gradientDrawable2, textMultiInput));
        }
        textMultiInput.getMainText().addTextChangedListener(new c(textMultiInput, frameLayout2, gradientDrawable2, frameLayout4));
        dialog.getWindow().setLayout(i5, -2);
        dialog.show();
        StatisticManager.getInstance().pauseStoryEvent(false);
        AppCompatEditText countryCodeText = i3 == 0 ? textMultiInput.getCountryCodeText() : textMultiInput.getMainText();
        dialog.setOnDismissListener(new d(activity, textMultiInput));
        new Handler(Looper.getMainLooper()).postDelayed(new e(activity), 100L);
        dialog.setOnCancelListener(new f());
        frameLayout4.setOnClickListener(new g(i3, textMultiInput, dialog, frameLayout2, gradientDrawable3));
        keyboardFocusCheck(activity, countryCodeText);
    }

    public void showDialog(Activity activity) {
        new Handler(Looper.getMainLooper()).post(new a(activity));
    }

    boolean validate(int i, String str, int i2) {
        if (i == 0) {
            if (i2 > 0) {
                if (str.length() == i2) {
                    return true;
                }
                return false;
            } else if (str != null && str.length() >= 5 && str.length() <= 30) {
                return true;
            } else {
                return false;
            }
        } else if (i != 1) {
            return true;
        } else {
            return isValidEmail(str);
        }
    }

    private void setTypeface(AppCompatEditText appCompatEditText, boolean z, boolean z2, boolean z3) {
        Typeface font = AppearanceManager.getCommonInstance().getFont(z3, z, z2);
        int i = z2 ? 2 : 0;
        if (font == null) {
            font = appCompatEditText.getTypeface();
        }
        appCompatEditText.setTypeface(font, (z ? 1 : 0) + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements TextWatcher {
        final /* synthetic */ FrameLayout a;
        final /* synthetic */ GradientDrawable b;
        final /* synthetic */ TextMultiInput c;

        b(FrameLayout frameLayout, GradientDrawable gradientDrawable, TextMultiInput textMultiInput) {
            this.a = frameLayout;
            this.b = gradientDrawable;
            this.c = textMultiInput;
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.a.setBackground(this.b);
            this.c.setTextColor(ContactDialog.hex2color(ContactDialog.this.dialogStructure.configV2.main.input.text.color));
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
