package defpackage;

import ch.qos.logback.core.CoreConstants;
/* compiled from: LinkScanner.java */
/* renamed from: oq5  reason: default package */
/* loaded from: classes3.dex */
public class oq5 {
    public static int a(CharSequence charSequence, int i) {
        char charAt;
        if (i >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i) == '<') {
            while (true) {
                i++;
                if (i >= charSequence.length() || (charAt = charSequence.charAt(i)) == '\n' || charAt == '<') {
                    break;
                } else if (charAt != '>') {
                    if (charAt == '\\') {
                        int i2 = i + 1;
                        if (jr7.g(charSequence, i2)) {
                            i = i2;
                        }
                    }
                } else {
                    return i + 1;
                }
            }
            return -1;
        }
        return b(charSequence, i);
    }

    private static int b(CharSequence charSequence, int i) {
        int i2 = 0;
        int i3 = i;
        while (i3 < charSequence.length()) {
            char charAt = charSequence.charAt(i3);
            if (charAt != 0 && charAt != ' ') {
                if (charAt != '\\') {
                    if (charAt != '(') {
                        if (charAt != ')') {
                            if (Character.isISOControl(charAt)) {
                                if (i3 == i) {
                                    return -1;
                                }
                                return i3;
                            }
                        } else if (i2 == 0) {
                            return i3;
                        } else {
                            i2--;
                        }
                    } else {
                        i2++;
                        if (i2 > 32) {
                            return -1;
                        }
                    }
                } else {
                    int i4 = i3 + 1;
                    if (jr7.g(charSequence, i4)) {
                        i3 = i4;
                    }
                }
                i3++;
            } else if (i3 == i) {
                return -1;
            } else {
                return i3;
            }
        }
        return charSequence.length();
    }

    public static int c(CharSequence charSequence, int i) {
        while (i < charSequence.length()) {
            switch (charSequence.charAt(i)) {
                case '[':
                    return -1;
                case '\\':
                    int i2 = i + 1;
                    if (!jr7.g(charSequence, i2)) {
                        break;
                    } else {
                        i = i2;
                        break;
                    }
                case ']':
                    return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static int d(CharSequence charSequence, int i) {
        if (i >= charSequence.length()) {
            return -1;
        }
        char charAt = charSequence.charAt(i);
        char c = CoreConstants.DOUBLE_QUOTE_CHAR;
        if (charAt != '\"') {
            c = CoreConstants.SINGLE_QUOTE_CHAR;
            if (charAt != '\'') {
                if (charAt != '(') {
                    return -1;
                }
                c = CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }
        int e = e(charSequence, i + 1, c);
        if (e == -1 || e >= charSequence.length() || charSequence.charAt(e) != c) {
            return -1;
        }
        return e + 1;
    }

    public static int e(CharSequence charSequence, int i, char c) {
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            if (charAt == '\\') {
                int i2 = i + 1;
                if (jr7.g(charSequence, i2)) {
                    i = i2;
                    i++;
                }
            }
            if (charAt == c) {
                return i;
            }
            if (c == ')' && charAt == '(') {
                return -1;
            }
            i++;
        }
        return charSequence.length();
    }
}
