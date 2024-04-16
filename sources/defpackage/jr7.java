package defpackage;
/* compiled from: Parsing.java */
/* renamed from: jr7  reason: default package */
/* loaded from: classes3.dex */
public class jr7 {
    public static int a = 4;

    public static int a(int i) {
        return 4 - (i % 4);
    }

    public static int b(char c, CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt != '\n' && charAt != '\r') {
                i++;
            } else {
                return i;
            }
        }
        return -1;
    }

    private static int d(CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt != ' ') {
                switch (charAt) {
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                        break;
                    default:
                        return i;
                }
            }
            i++;
        }
        return -1;
    }

    public static boolean e(CharSequence charSequence) {
        int length = charSequence.length();
        if (k(' ', charSequence, 0, length) == length) {
            return false;
        }
        return true;
    }

    public static boolean f(CharSequence charSequence) {
        if (d(charSequence, 0) != -1) {
            return false;
        }
        return true;
    }

    public static boolean g(CharSequence charSequence, int i) {
        if (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            switch (charAt) {
                case '!':
                case '\"':
                case '#':
                case '$':
                case '%':
                case '&':
                case '\'':
                case '(':
                case ')':
                case '*':
                case '+':
                case ',':
                case '-':
                case '.':
                case '/':
                    return true;
                default:
                    switch (charAt) {
                        case ':':
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                        case '?':
                        case '@':
                            return true;
                        default:
                            switch (charAt) {
                                case '[':
                                case '\\':
                                case ']':
                                case '^':
                                case '_':
                                case '`':
                                    return true;
                                default:
                                    switch (charAt) {
                                        case '{':
                                        case '|':
                                        case '}':
                                        case '~':
                                            return true;
                                        default:
                                            return false;
                                    }
                            }
                    }
            }
        }
        return false;
    }

    public static boolean h(CharSequence charSequence, int i) {
        return Character.isLetter(Character.codePointAt(charSequence, i));
    }

    public static boolean i(CharSequence charSequence, int i) {
        if (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            if (charAt == '\t' || charAt == ' ') {
                return true;
            }
            return false;
        }
        return false;
    }

    public static CharSequence j(CharSequence charSequence) {
        int length = charSequence.length();
        StringBuilder sb = null;
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (charAt != 0) {
                if (sb != null) {
                    sb.append(charAt);
                }
            } else {
                if (sb == null) {
                    sb = new StringBuilder(length);
                    sb.append(charSequence, 0, i);
                }
                sb.append((char) 65533);
            }
        }
        if (sb != null) {
            return sb.toString();
        }
        return charSequence;
    }

    public static int k(char c, CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            if (charSequence.charAt(i) != c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int l(char c, CharSequence charSequence, int i, int i2) {
        while (i >= i2) {
            if (charSequence.charAt(i) != c) {
                return i;
            }
            i--;
        }
        return i2 - 1;
    }

    public static int m(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (charAt != '\t' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int n(CharSequence charSequence, int i, int i2) {
        while (i >= i2) {
            char charAt = charSequence.charAt(i);
            if (charAt != '\t' && charAt != ' ') {
                return i;
            }
            i--;
        }
        return i2 - 1;
    }
}
