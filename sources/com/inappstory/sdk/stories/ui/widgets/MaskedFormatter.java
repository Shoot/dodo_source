package com.inappstory.sdk.stories.ui.widgets;

import java.text.ParseException;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public class MaskedFormatter {
    private static final char ALPHA_NUMERIC_KEY = 'A';
    private static final char ANYTHING_KEY = '*';
    private static final char CHARACTER_KEY = '?';
    private static final char DIGIT_KEY = 8722;
    private static final h[] EmptyMaskChars = new h[0];
    private static final char HEX_KEY = 'H';
    private static final char LITERAL_KEY = '\'';
    private static final char LOWERCASE_KEY = 'L';
    private static final char UPPERCASE_KEY = 'U';
    private boolean allowsInvalid;
    private boolean containsLiteralChars;
    private String invalidCharacters;
    private String mask;
    private transient h[] maskChars;
    private char placeholder;
    private String placeholderString;
    private String validCharacters;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b extends h {
        private b() {
            super();
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.MaskedFormatter.h
        public boolean d(char c) {
            if (Character.isLetterOrDigit(c) && super.d(c)) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class c extends h {
        private c() {
            super();
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.MaskedFormatter.h
        public boolean d(char c) {
            if (Character.isLetter(c) && super.d(c)) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class d extends h {
        private d() {
            super();
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.MaskedFormatter.h
        public boolean d(char c) {
            if (Character.isDigit(c) && super.d(c)) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class e extends h {
        private e() {
            super();
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.MaskedFormatter.h
        public char b(char c) {
            if (Character.isDigit(c)) {
                return c;
            }
            return Character.toUpperCase(c);
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.MaskedFormatter.h
        public boolean d(char c) {
            if ("0123456789abcedfABCDEF".indexOf(c) != -1 && super.d(c)) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class f extends h {
        private char b;

        public f(char c) {
            super();
            this.b = c;
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.MaskedFormatter.h
        public char b(char c) {
            return this.b;
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.MaskedFormatter.h
        public boolean c() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class g extends h {
        private g() {
            super();
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.MaskedFormatter.h
        public char b(char c) {
            return Character.toLowerCase(c);
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.MaskedFormatter.h
        public boolean d(char c) {
            if (Character.isLetter(c) && super.d(c)) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class i extends h {
        private i() {
            super();
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.MaskedFormatter.h
        public char b(char c) {
            return Character.toUpperCase(c);
        }

        @Override // com.inappstory.sdk.stories.ui.widgets.MaskedFormatter.h
        public boolean d(char c) {
            if (Character.isLetter(c) && super.d(c)) {
                return true;
            }
            return false;
        }
    }

    public MaskedFormatter() {
        setAllowsInvalid(false);
        this.containsLiteralChars = true;
        this.maskChars = EmptyMaskChars;
        this.placeholder = ' ';
    }

    private void append(StringBuilder sb, String str, int[] iArr, String str2, h[] hVarArr) throws ParseException {
        for (h hVar : hVarArr) {
            hVar.a(sb, str, iArr, str2);
        }
    }

    private void updateInternalMask() throws ParseException {
        String mask = getMask();
        ArrayList arrayList = new ArrayList();
        if (mask != null) {
            int length = mask.length();
            int i2 = 0;
            while (i2 < length) {
                char charAt = mask.charAt(i2);
                if (charAt != '\'') {
                    if (charAt != '*') {
                        if (charAt != '?') {
                            if (charAt != 'A') {
                                if (charAt != 'H') {
                                    if (charAt != 'L') {
                                        if (charAt != 'U') {
                                            if (charAt != 8722) {
                                                arrayList.add(new f(charAt));
                                            } else {
                                                arrayList.add(new d());
                                            }
                                        } else {
                                            arrayList.add(new i());
                                        }
                                    } else {
                                        arrayList.add(new g());
                                    }
                                } else {
                                    arrayList.add(new e());
                                }
                            } else {
                                arrayList.add(new b());
                            }
                        } else {
                            arrayList.add(new c());
                        }
                    } else {
                        arrayList.add(new h());
                    }
                } else {
                    i2++;
                    if (i2 < length) {
                        arrayList.add(new f(mask.charAt(i2)));
                    }
                }
                i2++;
            }
        }
        if (arrayList.size() == 0) {
            this.maskChars = EmptyMaskChars;
            return;
        }
        h[] hVarArr = new h[arrayList.size()];
        this.maskChars = hVarArr;
        arrayList.toArray(hVarArr);
    }

    public String getInvalidCharacters() {
        return this.invalidCharacters;
    }

    public String getMask() {
        return this.mask;
    }

    public String getPlaceholder() {
        return this.placeholderString;
    }

    public char getPlaceholderCharacter() {
        return this.placeholder;
    }

    public String getValidCharacters() {
        return this.validCharacters;
    }

    public boolean getValueContainsLiteralCharacters() {
        return this.containsLiteralChars;
    }

    public void setAllowsInvalid(boolean z) {
        this.allowsInvalid = z;
    }

    public void setInvalidCharacters(String str) {
        this.invalidCharacters = str;
    }

    public void setMask(String str) throws ParseException {
        this.mask = str;
        updateInternalMask();
    }

    public void setPlaceholder(String str) {
        this.placeholderString = str;
    }

    public void setPlaceholderCharacter(char c2) {
        this.placeholder = c2;
    }

    public void setValidCharacters(String str) {
        this.validCharacters = str;
    }

    public void setValueContainsLiteralCharacters(boolean z) {
        this.containsLiteralChars = z;
    }

    public String valueToString(Object obj) throws ParseException {
        String obj2;
        if (obj == null) {
            obj2 = "";
        } else {
            obj2 = obj.toString();
        }
        String str = obj2;
        StringBuilder sb = new StringBuilder();
        append(sb, str, new int[]{0}, getPlaceholder(), this.maskChars);
        return sb.toString();
    }

    public MaskedFormatter(String str) throws ParseException {
        this();
        setMask(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class h {
        private h() {
        }

        public boolean a(StringBuilder sb, String str, int[] iArr, String str2) {
            boolean z;
            char c;
            if (iArr[0] < str.length()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c = str.charAt(iArr[0]);
            } else {
                c = 0;
            }
            if (!z) {
                return false;
            }
            if (c()) {
                sb.append(b(c));
                if (z && c == b(c)) {
                    iArr[0] = iArr[0] + 1;
                }
            } else if (iArr[0] >= str.length()) {
                if (str2 != null && iArr[0] < str2.length()) {
                    sb.append(str2.charAt(iArr[0]));
                } else {
                    sb.append(MaskedFormatter.this.getPlaceholderCharacter());
                }
                iArr[0] = iArr[0] + 1;
            } else if (!d(c)) {
                return false;
            } else {
                sb.append(b(c));
                iArr[0] = iArr[0] + 1;
            }
            return true;
        }

        public boolean c() {
            return false;
        }

        public boolean d(char c) {
            if (c()) {
                if (b(c) == c) {
                    return true;
                }
                return false;
            }
            char b = b(c);
            String validCharacters = MaskedFormatter.this.getValidCharacters();
            if (validCharacters != null && validCharacters.indexOf(b) == -1) {
                return false;
            }
            String invalidCharacters = MaskedFormatter.this.getInvalidCharacters();
            if (invalidCharacters == null || invalidCharacters.indexOf(b) == -1) {
                return true;
            }
            return false;
        }

        public char b(char c) {
            return c;
        }
    }
}
