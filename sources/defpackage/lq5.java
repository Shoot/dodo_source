package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
/* compiled from: LinkReferenceDefinitionParser.java */
/* renamed from: lq5  reason: default package */
/* loaded from: classes3.dex */
public class lq5 {
    private StringBuilder d;
    private String e;
    private String f;
    private char g;
    private StringBuilder h;
    private b a = b.START_DEFINITION;
    private final StringBuilder b = new StringBuilder();
    private final List<kq5> c = new ArrayList();
    private boolean i = false;

    /* compiled from: LinkReferenceDefinitionParser.java */
    /* renamed from: lq5$a */
    /* loaded from: classes3.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.PARAGRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.START_DEFINITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.LABEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.DESTINATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.START_TITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.TITLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LinkReferenceDefinitionParser.java */
    /* renamed from: lq5$b */
    /* loaded from: classes3.dex */
    public enum b {
        START_DEFINITION,
        LABEL,
        DESTINATION,
        START_TITLE,
        TITLE,
        PARAGRAPH
    }

    private int a(CharSequence charSequence, int i) {
        String charSequence2;
        int m = jr7.m(charSequence, i, charSequence.length());
        int a2 = oq5.a(charSequence, m);
        if (a2 == -1) {
            return -1;
        }
        if (charSequence.charAt(m) == '<') {
            charSequence2 = charSequence.subSequence(m + 1, a2 - 1).toString();
        } else {
            charSequence2 = charSequence.subSequence(m, a2).toString();
        }
        this.f = charSequence2;
        int m2 = jr7.m(charSequence, a2, charSequence.length());
        if (m2 >= charSequence.length()) {
            this.i = true;
            this.b.setLength(0);
        } else if (m2 == a2) {
            return -1;
        }
        this.a = b.START_TITLE;
        return m2;
    }

    private void b() {
        String str;
        if (!this.i) {
            return;
        }
        String e = mk3.e(this.f);
        StringBuilder sb = this.h;
        if (sb != null) {
            str = mk3.e(sb.toString());
        } else {
            str = null;
        }
        this.c.add(new kq5(this.e, e, str));
        this.d = null;
        this.i = false;
        this.e = null;
        this.f = null;
        this.h = null;
    }

    private int e(CharSequence charSequence, int i) {
        int i2;
        int c = oq5.c(charSequence, i);
        if (c == -1) {
            return -1;
        }
        this.d.append(charSequence, i, c);
        if (c >= charSequence.length()) {
            this.d.append('\n');
            return c;
        } else if (charSequence.charAt(c) != ']' || (i2 = c + 1) >= charSequence.length() || charSequence.charAt(i2) != ':' || this.d.length() > 999) {
            return -1;
        } else {
            String b2 = mk3.b(this.d.toString());
            if (b2.isEmpty()) {
                return -1;
            }
            this.e = b2;
            this.a = b.DESTINATION;
            return jr7.m(charSequence, c + 2, charSequence.length());
        }
    }

    private int g(CharSequence charSequence, int i) {
        int m = jr7.m(charSequence, i, charSequence.length());
        if (m < charSequence.length() && charSequence.charAt(m) == '[') {
            this.a = b.LABEL;
            this.d = new StringBuilder();
            int i2 = m + 1;
            if (i2 >= charSequence.length()) {
                this.d.append('\n');
            }
            return i2;
        }
        return -1;
    }

    private int h(CharSequence charSequence, int i) {
        int m = jr7.m(charSequence, i, charSequence.length());
        if (m >= charSequence.length()) {
            this.a = b.START_DEFINITION;
            return m;
        }
        this.g = (char) 0;
        char charAt = charSequence.charAt(m);
        if (charAt != '\"' && charAt != '\'') {
            if (charAt == '(') {
                this.g = CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        } else {
            this.g = charAt;
        }
        if (this.g != 0) {
            this.a = b.TITLE;
            this.h = new StringBuilder();
            m++;
            if (m == charSequence.length()) {
                this.h.append('\n');
            }
        } else {
            b();
            this.a = b.START_DEFINITION;
        }
        return m;
    }

    private int i(CharSequence charSequence, int i) {
        int e = oq5.e(charSequence, i, this.g);
        if (e == -1) {
            return -1;
        }
        this.h.append(charSequence.subSequence(i, e));
        if (e >= charSequence.length()) {
            this.h.append('\n');
            return e;
        }
        int m = jr7.m(charSequence, e + 1, charSequence.length());
        if (m != charSequence.length()) {
            return -1;
        }
        this.i = true;
        b();
        this.b.setLength(0);
        this.a = b.START_DEFINITION;
        return m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<kq5> c() {
        b();
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence d() {
        return this.b;
    }

    public void f(CharSequence charSequence) {
        if (this.b.length() != 0) {
            this.b.append('\n');
        }
        this.b.append(charSequence);
        int i = 0;
        while (i < charSequence.length()) {
            switch (a.a[this.a.ordinal()]) {
                case 1:
                    return;
                case 2:
                    i = g(charSequence, i);
                    break;
                case 3:
                    i = e(charSequence, i);
                    break;
                case 4:
                    i = a(charSequence, i);
                    break;
                case 5:
                    i = h(charSequence, i);
                    break;
                case 6:
                    i = i(charSequence, i);
                    break;
            }
            if (i == -1) {
                this.a = b.PARAGRAPH;
                return;
            }
        }
    }
}
