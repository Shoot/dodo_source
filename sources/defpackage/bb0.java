package defpackage;

import android.text.SpannableStringBuilder;
import java.util.Locale;
/* compiled from: BidiFormatter.java */
/* renamed from: bb0  reason: default package */
/* loaded from: classes.dex */
public final class bb0 {
    static final pab d;
    private static final String e;
    private static final String f;
    static final bb0 g;
    static final bb0 h;
    private final boolean a;
    private final int b;
    private final pab c;

    /* compiled from: BidiFormatter.java */
    /* renamed from: bb0$a */
    /* loaded from: classes.dex */
    public static final class a {
        private boolean a;
        private int b;
        private pab c;

        public a() {
            c(bb0.e(Locale.getDefault()));
        }

        private static bb0 b(boolean z) {
            if (z) {
                return bb0.h;
            }
            return bb0.g;
        }

        private void c(boolean z) {
            this.a = z;
            this.c = bb0.d;
            this.b = 2;
        }

        public bb0 a() {
            if (this.b == 2 && this.c == bb0.d) {
                return b(this.a);
            }
            return new bb0(this.a, this.b, this.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BidiFormatter.java */
    /* renamed from: bb0$b */
    /* loaded from: classes.dex */
    public static class b {
        private static final byte[] f = new byte[1792];
        private final CharSequence a;
        private final boolean b;
        private final int c;
        private int d;
        private char e;

        static {
            for (int i = 0; i < 1792; i++) {
                f[i] = Character.getDirectionality(i);
            }
        }

        b(CharSequence charSequence, boolean z) {
            this.a = charSequence;
            this.b = z;
            this.c = charSequence.length();
        }

        private static byte c(char c) {
            if (c < 1792) {
                return f[c];
            }
            return Character.getDirectionality(c);
        }

        private byte f() {
            char charAt;
            int i = this.d;
            do {
                int i2 = this.d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.a;
                int i3 = i2 - 1;
                this.d = i3;
                charAt = charSequence.charAt(i3);
                this.e = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.d = i;
            this.e = ';';
            return (byte) 13;
        }

        private byte g() {
            char charAt;
            do {
                int i = this.d;
                if (i < this.c) {
                    CharSequence charSequence = this.a;
                    this.d = i + 1;
                    charAt = charSequence.charAt(i);
                    this.e = charAt;
                } else {
                    return (byte) 12;
                }
            } while (charAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char charAt;
            int i = this.d;
            while (true) {
                int i2 = this.d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.a;
                int i3 = i2 - 1;
                this.d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.e = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i4 = this.d;
                        if (i4 > 0) {
                            CharSequence charSequence2 = this.a;
                            int i5 = i4 - 1;
                            this.d = i5;
                            charAt = charSequence2.charAt(i5);
                            this.e = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.d = i;
            this.e = '>';
            return (byte) 13;
        }

        private byte i() {
            char charAt;
            int i = this.d;
            while (true) {
                int i2 = this.d;
                if (i2 < this.c) {
                    CharSequence charSequence = this.a;
                    this.d = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.e = charAt2;
                    if (charAt2 == '>') {
                        return (byte) 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i3 = this.d;
                            if (i3 < this.c) {
                                CharSequence charSequence2 = this.a;
                                this.d = i3 + 1;
                                charAt = charSequence2.charAt(i3);
                                this.e = charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    this.d = i;
                    this.e = '<';
                    return (byte) 13;
                }
            }
        }

        byte a() {
            char charAt = this.a.charAt(this.d - 1);
            this.e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.a, this.d);
                this.d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.d--;
            byte c = c(this.e);
            if (this.b) {
                char c2 = this.e;
                if (c2 == '>') {
                    return h();
                }
                if (c2 == ';') {
                    return f();
                }
                return c;
            }
            return c;
        }

        byte b() {
            char charAt = this.a.charAt(this.d);
            this.e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.a, this.d);
                this.d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.d++;
            byte c = c(this.e);
            if (this.b) {
                char c2 = this.e;
                if (c2 == '<') {
                    return i();
                }
                if (c2 == '&') {
                    return g();
                }
                return c;
            }
            return c;
        }

        int d() {
            this.d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.d < this.c && i == 0) {
                byte b = b();
                if (b != 0) {
                    if (b != 1 && b != 2) {
                        if (b != 9) {
                            switch (b) {
                                case 14:
                                case 15:
                                    i3++;
                                    i2 = -1;
                                    break;
                                case 16:
                                case 17:
                                    i3++;
                                    i2 = 1;
                                    break;
                                case 18:
                                    i3--;
                                    i2 = 0;
                                    break;
                            }
                        }
                    } else if (i3 == 0) {
                        return 1;
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        int e() {
            this.d = this.c;
            int i = 0;
            int i2 = 0;
            while (this.d > 0) {
                byte a = a();
                if (a != 0) {
                    if (a != 1 && a != 2) {
                        if (a != 9) {
                            switch (a) {
                                case 14:
                                case 15:
                                    if (i2 == i) {
                                        return -1;
                                    }
                                    i--;
                                    break;
                                case 16:
                                case 17:
                                    if (i2 == i) {
                                        return 1;
                                    }
                                    i--;
                                    break;
                                case 18:
                                    i++;
                                    break;
                                default:
                                    if (i2 != 0) {
                                        break;
                                    } else {
                                        i2 = i;
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else if (i == 0) {
                        return 1;
                    } else {
                        if (i2 == 0) {
                            i2 = i;
                        }
                    }
                } else if (i == 0) {
                    return -1;
                } else {
                    if (i2 == 0) {
                        i2 = i;
                    }
                }
            }
            return 0;
        }
    }

    static {
        pab pabVar = qab.c;
        d = pabVar;
        e = Character.toString((char) 8206);
        f = Character.toString((char) 8207);
        g = new bb0(false, 2, pabVar);
        h = new bb0(true, 2, pabVar);
    }

    bb0(boolean z, int i, pab pabVar) {
        this.a = z;
        this.b = i;
        this.c = pabVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static bb0 c() {
        return new a().a();
    }

    static boolean e(Locale locale) {
        if (adb.a(locale) == 1) {
            return true;
        }
        return false;
    }

    private String f(CharSequence charSequence, pab pabVar) {
        boolean a2 = pabVar.a(charSequence, 0, charSequence.length());
        if (!this.a && (a2 || b(charSequence) == 1)) {
            return e;
        }
        if (this.a) {
            if (!a2 || b(charSequence) == -1) {
                return f;
            }
            return "";
        }
        return "";
    }

    private String g(CharSequence charSequence, pab pabVar) {
        boolean a2 = pabVar.a(charSequence, 0, charSequence.length());
        if (!this.a && (a2 || a(charSequence) == 1)) {
            return e;
        }
        if (this.a) {
            if (!a2 || a(charSequence) == -1) {
                return f;
            }
            return "";
        }
        return "";
    }

    public boolean d() {
        if ((this.b & 2) != 0) {
            return true;
        }
        return false;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.c, true);
    }

    public CharSequence i(CharSequence charSequence, pab pabVar, boolean z) {
        pab pabVar2;
        char c;
        pab pabVar3;
        if (charSequence == null) {
            return null;
        }
        boolean a2 = pabVar.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z) {
            if (a2) {
                pabVar3 = qab.b;
            } else {
                pabVar3 = qab.a;
            }
            spannableStringBuilder.append((CharSequence) g(charSequence, pabVar3));
        }
        if (a2 != this.a) {
            if (a2) {
                c = 8235;
            } else {
                c = 8234;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            if (a2) {
                pabVar2 = qab.b;
            } else {
                pabVar2 = qab.a;
            }
            spannableStringBuilder.append((CharSequence) f(charSequence, pabVar2));
        }
        return spannableStringBuilder;
    }

    public String j(String str) {
        return k(str, this.c, true);
    }

    public String k(String str, pab pabVar, boolean z) {
        if (str == null) {
            return null;
        }
        return i(str, pabVar, z).toString();
    }
}
