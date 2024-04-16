package com.inappstory.sdk.stories.ui.widgets;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatEditText;
import com.inappstory.sdk.stories.utils.PhoneFormats;
import com.inappstory.sdk.stories.utils.Sizes;
import org.slf4j.Marker;
/* loaded from: classes3.dex */
public class TextMultiInput extends LinearLayout {
    public static final int MAIL = 1;
    public static final int PHONE = 0;
    public static final String PHONE_CODE_MASK = "+−−−−";
    public static final int TEXT = 2;
    private String baseHint;
    AppCompatEditText countryCodeText;
    View divider;
    InputFilter filter;
    public int inputType;
    AppCompatEditText mainText;
    String mask;
    AppCompatEditText phoneNumberHint;
    MaskedWatcher watcher;

    /* loaded from: classes3.dex */
    public class CustomDigitsKeyListener extends DigitsKeyListener {
        public CustomDigitsKeyListener() {
            super(false, false);
        }

        @Override // android.text.method.DigitsKeyListener, android.text.method.KeyListener
        public int getInputType() {
            return 3;
        }

        public CustomDigitsKeyListener(boolean z, boolean z2) {
            super(z, z2);
        }
    }

    /* loaded from: classes3.dex */
    class a implements InputFilter {
        a() {
        }

        private boolean c(char c) {
            return Character.isDigit(c);
        }

        @Override // android.text.InputFilter
        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            StringBuilder sb = new StringBuilder(i2 - i);
            boolean z = true;
            for (int i5 = i; i5 < i2; i5++) {
                char charAt = charSequence.charAt(i5);
                if (c(charAt)) {
                    sb.append(charAt);
                } else {
                    z = false;
                }
            }
            if (z) {
                return null;
            }
            if (charSequence instanceof Spanned) {
                SpannableString spannableString = new SpannableString(sb);
                TextUtils.copySpansFrom((Spanned) charSequence, i, sb.length(), null, spannableString, 0);
                return spannableString;
            }
            return sb;
        }
    }

    /* loaded from: classes3.dex */
    class c implements View.OnFocusChangeListener {

        /* loaded from: classes3.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                TextMultiInput.this.countryCodeText.setSelection(1);
            }
        }

        c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            if (z && TextMultiInput.this.countryCodeText.getText().toString().length() < 1) {
                TextMultiInput.this.countryCodeText.setText(Marker.ANY_NON_NULL_MARKER);
                TextMultiInput.this.countryCodeText.post(new a());
            }
        }
    }

    public TextMultiInput(Context context) {
        super(context);
        this.baseHint = "";
        this.filter = new a();
    }

    public AppCompatEditText getCountryCodeText() {
        return this.countryCodeText;
    }

    public View getDivider() {
        return this.divider;
    }

    public AppCompatEditText getMainText() {
        return this.mainText;
    }

    public int getMaskLength() {
        MaskedWatcher maskedWatcher = this.watcher;
        if (maskedWatcher != null) {
            return maskedWatcher.mMask.length();
        }
        return 0;
    }

    public AppCompatEditText getPhoneNumberHint() {
        return this.phoneNumberHint;
    }

    public String getText() {
        if (this.inputType == 0) {
            return getCountryCodeText().getEditableText().toString() + " " + getMainText().getEditableText().toString();
        }
        return getMainText().getEditableText().toString();
    }

    public void init(int i) {
        setOrientation(0);
        setGravity(16);
        this.inputType = i;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        layoutParams.setMargins(0, 0, 0, 0);
        AppCompatEditText appCompatEditText = new AppCompatEditText(getContext());
        this.mainText = appCompatEditText;
        appCompatEditText.setBackground(null);
        this.mainText.setPaddingRelative(0, 0, 0, 0);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.mainText.setInputType(655361);
                    this.mainText.setSingleLine(false);
                    this.mainText.setMaxLines(3);
                    this.mainText.setImeOptions(1073741824);
                    layoutParams.setMargins(0, 0, 0, 0);
                    this.mainText.setLayoutParams(layoutParams);
                    addView(this.mainText);
                    return;
                }
                return;
            }
            this.mainText.setInputType(33);
            this.mainText.setGravity(17);
            this.mainText.setSingleLine(true);
            this.mainText.setMaxLines(1);
            layoutParams.setMargins(0, 0, 0, 0);
            this.mainText.setLayoutParams(layoutParams);
            addView(this.mainText);
            return;
        }
        layoutParams.setMargins(Sizes.dpToPxExt(4, getContext()), 0, 0, 0);
        this.mainText.setLayoutParams(layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(Sizes.dpToPxExt(60, getContext()), -2);
        this.countryCodeText = new AppCompatEditText(getContext());
        this.phoneNumberHint = new AppCompatEditText(getContext());
        this.countryCodeText.setPaddingRelative(0, 0, 0, 0);
        this.phoneNumberHint.setPaddingRelative(0, 0, 0, 0);
        layoutParams2.setMargins(0, 0, 0, 0);
        View view = new View(getContext());
        this.divider = view;
        view.setLayoutParams(new ViewGroup.LayoutParams(Sizes.dpToPxExt(1, getContext()), Sizes.dpToPxExt(30, getContext())));
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setLayoutParams(layoutParams);
        this.countryCodeText.setLayoutParams(layoutParams2);
        this.countryCodeText.setBackground(null);
        this.countryCodeText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
        this.countryCodeText.setInputType(3);
        this.phoneNumberHint.setInputType(3);
        this.mainText.setInputType(3);
        this.countryCodeText.setGravity(17);
        this.countryCodeText.addTextChangedListener(new MaskedWatcher(PHONE_CODE_MASK, Marker.ANY_NON_NULL_MARKER));
        this.countryCodeText.addTextChangedListener(new b());
        this.countryCodeText.setOnFocusChangeListener(new c());
        this.mainText.addTextChangedListener(new d());
        this.phoneNumberHint.setBackground(null);
        this.phoneNumberHint.setClickable(false);
        this.phoneNumberHint.setFocusable(false);
        this.phoneNumberHint.setLayoutParams(layoutParams);
        this.mainText.setSingleLine(true);
        this.mainText.setMaxLines(1);
        this.phoneNumberHint.setSingleLine(true);
        this.phoneNumberHint.setMaxLines(1);
        relativeLayout.addView(this.phoneNumberHint);
        relativeLayout.addView(this.mainText);
        addView(this.countryCodeText);
        addView(this.divider);
        addView(relativeLayout);
    }

    public void setHint(String str) {
        if (this.inputType == 0) {
            this.phoneNumberHint.setHint(str);
        } else {
            getMainText().setHint(str);
        }
        this.baseHint = str;
    }

    public void setHintTextColor(int i) {
        getMainText().setHintTextColor(i);
        if (this.inputType == 0) {
            this.phoneNumberHint.setHintTextColor(i);
        }
    }

    public void setTextColor(int i) {
        getMainText().setTextColor(i);
        if (this.inputType == 0) {
            getCountryCodeText().setTextColor(i);
        }
    }

    public void setTextSize(int i, int i2) {
        if (this.inputType == 0) {
            float f = i2;
            getCountryCodeText().setTextSize(i, f);
            this.phoneNumberHint.setTextSize(i, f);
        }
        getMainText().setTextSize(i, i2);
    }

    public TextMultiInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.baseHint = "";
        this.filter = new a();
    }

    public void setTextSize(int i) {
        if (this.inputType == 0) {
            float f = i;
            getCountryCodeText().setTextSize(2, f);
            this.phoneNumberHint.setTextSize(2, f);
        }
        getMainText().setTextSize(2, i);
    }

    public TextMultiInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.baseHint = "";
        this.filter = new a();
    }

    /* loaded from: classes3.dex */
    class b implements TextWatcher {
        b() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            try {
                TextMultiInput textMultiInput = TextMultiInput.this;
                MaskedWatcher maskedWatcher = textMultiInput.watcher;
                maskedWatcher.active = false;
                textMultiInput.mainText.removeTextChangedListener(maskedWatcher);
                TextMultiInput.this.watcher = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
            TextMultiInput.this.mask = PhoneFormats.getMaskByCode(charSequence.toString());
            TextMultiInput textMultiInput2 = TextMultiInput.this;
            if (textMultiInput2.mask != null) {
                textMultiInput2.mainText.setFilters(new InputFilter[0]);
                TextMultiInput.this.mainText.setHint("");
                String obj = TextMultiInput.this.mainText.getText().toString();
                TextMultiInput.this.mainText.setText("");
                TextMultiInput textMultiInput3 = TextMultiInput.this;
                textMultiInput3.watcher = new MaskedWatcher(textMultiInput3.mask, "");
                TextMultiInput textMultiInput4 = TextMultiInput.this;
                textMultiInput4.mainText.addTextChangedListener(textMultiInput4.watcher);
                TextMultiInput textMultiInput5 = TextMultiInput.this;
                textMultiInput5.phoneNumberHint.setHint(textMultiInput5.mask);
                TextMultiInput.this.mainText.setText(obj.replaceAll(" ", ""));
                TextMultiInput textMultiInput6 = TextMultiInput.this;
                textMultiInput6.watcher.afterTextChanged(textMultiInput6.mainText.getEditableText());
                TextMultiInput.this.mainText.setInputType(3);
                return;
            }
            textMultiInput2.mainText.setFilters(new InputFilter[]{textMultiInput2.filter});
            TextMultiInput.this.mainText.setText(TextMultiInput.this.mainText.getText().toString().replaceAll(" ", ""));
            if (TextMultiInput.this.countryCodeText.getText().length() == 1) {
                TextMultiInput textMultiInput7 = TextMultiInput.this;
                textMultiInput7.mainText.setHint(textMultiInput7.baseHint);
            } else {
                TextMultiInput.this.mainText.setHint("");
            }
            TextMultiInput.this.mainText.setInputType(3);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes3.dex */
    class d implements TextWatcher {
        d() {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (TextMultiInput.this.mask != null) {
                if (charSequence.length() <= TextMultiInput.this.mask.length()) {
                    TextMultiInput.this.phoneNumberHint.setHint(((Object) charSequence) + TextMultiInput.this.mask.substring(charSequence.length()));
                }
            } else if (charSequence.length() < 20) {
                TextMultiInput.this.phoneNumberHint.setHint(charSequence);
            } else {
                TextMultiInput.this.phoneNumberHint.setHint("");
            }
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
