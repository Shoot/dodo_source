package defpackage;

import ch.qos.logback.core.CoreConstants;
import defpackage.h53;
import java.io.IOException;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: Entities.java */
/* renamed from: wi3  reason: default package */
/* loaded from: classes3.dex */
public class wi3 {
    private static final char[] a = {CoreConstants.COMMA_CHAR, ';'};
    private static final HashMap<String, String> b = new HashMap<>();
    private static final h53.a c = new h53.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Entities.java */
    /* renamed from: wi3$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.ascii.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.utf.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Entities.java */
    /* renamed from: wi3$b */
    /* loaded from: classes3.dex */
    public enum b {
        ascii,
        utf,
        fallback;

        /* JADX INFO: Access modifiers changed from: package-private */
        public static b i(String str) {
            if (str.equals("US-ASCII")) {
                return ascii;
            }
            if (str.startsWith("UTF-")) {
                return utf;
            }
            return fallback;
        }
    }

    /* compiled from: Entities.java */
    /* renamed from: wi3$c */
    /* loaded from: classes3.dex */
    public enum c {
        xhtml(xi3.a, 4),
        base(xi3.b, 106),
        extended(xi3.c, 2125);
        
        private String[] a;
        private int[] b;
        private int[] c;
        private String[] d;

        c(String str, int i) {
            wi3.h(this, str, i);
        }

        int E(String str) {
            int binarySearch = Arrays.binarySearch(this.a, str);
            if (binarySearch >= 0) {
                return this.b[binarySearch];
            }
            return -1;
        }

        String G(int i) {
            int binarySearch = Arrays.binarySearch(this.c, i);
            if (binarySearch >= 0) {
                String[] strArr = this.d;
                if (binarySearch < strArr.length - 1) {
                    int i2 = binarySearch + 1;
                    if (this.c[i2] == i) {
                        return strArr[i2];
                    }
                }
                return strArr[binarySearch];
            }
            return "";
        }
    }

    private static void b(Appendable appendable, c cVar, int i) throws IOException {
        String G = cVar.G(i);
        if (!"".equals(G)) {
            appendable.append('&').append(G).append(';');
        } else {
            appendable.append("&#x").append(Integer.toHexString(i)).append(';');
        }
    }

    private static boolean c(b bVar, char c2, CharsetEncoder charsetEncoder) {
        int i = a.a[bVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return true;
            }
            return charsetEncoder.canEncode(c2);
        } else if (c2 < 128) {
            return true;
        } else {
            return false;
        }
    }

    public static int d(String str, int[] iArr) {
        String str2 = b.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int E = c.extended.E(str);
        if (E == -1) {
            return 0;
        }
        iArr[0] = E;
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(Appendable appendable, String str, h53.a aVar, boolean z, boolean z2, boolean z3, boolean z4) throws IOException {
        c h = aVar.h();
        CharsetEncoder f = aVar.f();
        b bVar = aVar.d;
        int length = str.length();
        int i = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (z2) {
                if (wza.j(codePointAt)) {
                    if ((!z3 || z6) && !z7) {
                        if (z4) {
                            z5 = true;
                        } else {
                            appendable.append(' ');
                            z7 = true;
                        }
                    }
                    i += Character.charCount(codePointAt);
                } else {
                    if (z5) {
                        appendable.append(' ');
                        z5 = false;
                    }
                    z6 = true;
                    z7 = false;
                }
            }
            if (codePointAt < 65536) {
                char c2 = (char) codePointAt;
                if (c2 != '\t' && c2 != '\n' && c2 != '\r') {
                    if (c2 != '\"') {
                        if (c2 != '&') {
                            if (c2 != '<') {
                                if (c2 != '>') {
                                    if (c2 != 160) {
                                        if (c2 >= ' ' && c(bVar, c2, f)) {
                                            appendable.append(c2);
                                        } else {
                                            b(appendable, h, codePointAt);
                                        }
                                    } else if (h != c.xhtml) {
                                        appendable.append("&nbsp;");
                                    } else {
                                        appendable.append("&#xa0;");
                                    }
                                } else if (!z) {
                                    appendable.append("&gt;");
                                } else {
                                    appendable.append(c2);
                                }
                            } else if (z && h != c.xhtml && aVar.p() != h53.a.EnumC0345a.xml) {
                                appendable.append(c2);
                            } else {
                                appendable.append("&lt;");
                            }
                        } else {
                            appendable.append("&amp;");
                        }
                    } else if (z) {
                        appendable.append("&quot;");
                    } else {
                        appendable.append(c2);
                    }
                } else {
                    appendable.append(c2);
                }
            } else {
                String str2 = new String(Character.toChars(codePointAt));
                if (f.canEncode(str2)) {
                    appendable.append(str2);
                } else {
                    b(appendable, h, codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    public static boolean f(String str) {
        if (c.base.E(str) != -1) {
            return true;
        }
        return false;
    }

    public static boolean g(String str) {
        if (c.extended.E(str) != -1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(c cVar, String str, int i) {
        int i2;
        cVar.a = new String[i];
        cVar.b = new int[i];
        cVar.c = new int[i];
        cVar.d = new String[i];
        lw0 lw0Var = new lw0(str);
        boolean z = false;
        int i3 = 0;
        while (!lw0Var.x()) {
            try {
                String p = lw0Var.p('=');
                lw0Var.a();
                int parseInt = Integer.parseInt(lw0Var.r(a), 36);
                char v = lw0Var.v();
                lw0Var.a();
                if (v == ',') {
                    i2 = Integer.parseInt(lw0Var.p(';'), 36);
                    lw0Var.a();
                } else {
                    i2 = -1;
                }
                int parseInt2 = Integer.parseInt(lw0Var.p('&'), 36);
                lw0Var.a();
                cVar.a[i3] = p;
                cVar.b[i3] = parseInt;
                cVar.c[parseInt2] = parseInt;
                cVar.d[parseInt2] = p;
                if (i2 != -1) {
                    b.put(p, new String(new int[]{parseInt, i2}, 0, 2));
                }
                i3++;
            } catch (Throwable th) {
                lw0Var.d();
                throw th;
            }
        }
        if (i3 == i) {
            z = true;
        }
        vvb.e(z, "Unexpected count of entities loaded");
        lw0Var.d();
    }
}
