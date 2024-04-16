package com.inappstory.sdk.stories.ui.widgets;

import android.text.Editable;
import android.text.TextWatcher;
import java.text.ParseException;
import java.util.regex.Pattern;
/* loaded from: classes3.dex */
public class MaskedWatcher implements TextWatcher {
    public String mMask;
    public String prefix;
    String mResult = "";
    public boolean active = true;
    String lastString = "";

    public MaskedWatcher(String str, String str2) {
        this.mMask = str;
        this.prefix = str2;
    }

    public static String removeCharAt(String str, int i) {
        StringBuffer stringBuffer = new StringBuffer(str.length() - 1);
        stringBuffer.append(str.substring(0, i));
        stringBuffer.append(str.substring(i + 1));
        return stringBuffer.toString();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        String str;
        String replaceAll;
        if (!this.active) {
            return;
        }
        String str2 = this.mMask;
        String obj = editable.toString();
        if (obj.equals(this.mResult)) {
            return;
        }
        try {
            MaskedFormatter maskedFormatter = new MaskedFormatter(str2);
            maskedFormatter.setValueContainsLiteralCharacters(false);
            maskedFormatter.setPlaceholderCharacter((char) 1);
            String valueToString = maskedFormatter.valueToString(obj);
            try {
                obj = valueToString.substring(0, valueToString.indexOf(1));
                if (obj.charAt(obj.length() - 1) == str2.charAt(obj.length() - 1)) {
                    obj = obj.substring(0, obj.length() - 1);
                }
            } catch (Exception unused) {
            }
            boolean z = false;
            for (int i = 0; i < obj.length(); i++) {
                char charAt = obj.charAt(i);
                char charAt2 = this.mMask.charAt(i);
                if (charAt2 == 8722 && !Character.isDigit(charAt)) {
                    z = true;
                }
                if (charAt2 != 8722 && charAt2 != charAt) {
                    z = true;
                }
            }
            this.mResult = obj;
            if (!this.prefix.isEmpty() && !obj.startsWith(this.prefix)) {
                String str3 = this.prefix;
                String substring = str3.substring(0, str3.length() - 1);
                if (obj.startsWith(substring)) {
                    replaceAll = obj.replaceAll(Pattern.quote(substring), "");
                } else {
                    replaceAll = obj.replaceAll(Pattern.quote(this.prefix), "");
                }
                obj = this.prefix + replaceAll;
            }
            int length = editable.length();
            if (z) {
                str = this.lastString;
            } else {
                str = obj;
            }
            editable.replace(0, length, str);
        } catch (ParseException e) {
            editable.replace(0, editable.length(), removeCharAt(obj, e.getErrorOffset()));
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.lastString = charSequence.toString();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
