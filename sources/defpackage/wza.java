package defpackage;

import ch.qos.logback.classic.spi.CallerData;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;
/* compiled from: StringUtil.java */
/* renamed from: wza  reason: default package */
/* loaded from: classes3.dex */
public final class wza {
    static final String[] a = {"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};
    private static final Pattern b = Pattern.compile("^/((\\.{1,2}/)+)");
    private static final Pattern c = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");
    private static final ThreadLocal<Stack<StringBuilder>> d = new a();

    /* compiled from: StringUtil.java */
    /* renamed from: wza$a */
    /* loaded from: classes3.dex */
    class a extends ThreadLocal<Stack<StringBuilder>> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Stack<StringBuilder> initialValue() {
            return new Stack<>();
        }
    }

    /* compiled from: StringUtil.java */
    /* renamed from: wza$b */
    /* loaded from: classes3.dex */
    public static class b {
        final String b;
        StringBuilder a = wza.b();
        boolean c = true;

        public b(String str) {
            this.b = str;
        }

        public b a(Object obj) {
            vvb.j(this.a);
            if (!this.c) {
                this.a.append(this.b);
            }
            this.a.append(obj);
            this.c = false;
            return this;
        }

        public String b() {
            String o = wza.o(this.a);
            this.a = null;
            return o;
        }
    }

    public static void a(StringBuilder sb, String str, boolean z) {
        int length = str.length();
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (e(codePointAt)) {
                if ((!z || z2) && !z3) {
                    sb.append(' ');
                    z3 = true;
                }
            } else if (!h(codePointAt)) {
                sb.appendCodePoint(codePointAt);
                z2 = true;
                z3 = false;
            }
            i += Character.charCount(codePointAt);
        }
    }

    public static StringBuilder b() {
        Stack<StringBuilder> stack = d.get();
        if (stack.empty()) {
            return new StringBuilder(8192);
        }
        return stack.pop();
    }

    public static boolean c(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(String str, String[] strArr) {
        if (Arrays.binarySearch(strArr, str) >= 0) {
            return true;
        }
        return false;
    }

    public static boolean e(int i) {
        if (i != 32 && i != 9 && i != 10 && i != 12 && i != 13 && i != 160) {
            return false;
        }
        return true;
    }

    public static boolean f(String str) {
        vvb.j(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 127) {
                return false;
            }
        }
        return true;
    }

    public static boolean g(String str) {
        if (str != null && str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!j(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean h(int i) {
        if (i != 8203 && i != 173) {
            return false;
        }
        return true;
    }

    public static boolean i(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str.codePointAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean j(int i) {
        if (i != 32 && i != 9 && i != 10 && i != 12 && i != 13) {
            return false;
        }
        return true;
    }

    public static String k(Collection<?> collection, String str) {
        return l(collection.iterator(), str);
    }

    public static String l(Iterator<?> it, String str) {
        if (!it.hasNext()) {
            return "";
        }
        String obj = it.next().toString();
        if (!it.hasNext()) {
            return obj;
        }
        b bVar = new b(str);
        bVar.a(obj);
        while (it.hasNext()) {
            bVar.a(it.next());
        }
        return bVar.b();
    }

    public static String m(String str) {
        StringBuilder b2 = b();
        a(b2, str, false);
        return o(b2);
    }

    public static String n(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        vvb.e(z, "width must be >= 0");
        if (i2 < -1) {
            z2 = false;
        }
        vvb.d(z2);
        if (i2 != -1) {
            i = Math.min(i, i2);
        }
        String[] strArr = a;
        if (i < strArr.length) {
            return strArr[i];
        }
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = ' ';
        }
        return String.valueOf(cArr);
    }

    public static String o(StringBuilder sb) {
        vvb.j(sb);
        String sb2 = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(8192);
        } else {
            sb.delete(0, sb.length());
        }
        Stack<StringBuilder> stack = d.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return sb2;
    }

    public static String p(String str, String str2) {
        try {
            try {
                return q(new URL(str), str2).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(str2).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            if (!c.matcher(str2).find()) {
                return "";
            }
            return str2;
        }
    }

    public static URL q(URL url, String str) throws MalformedURLException {
        if (str.startsWith(CallerData.NA)) {
            str = url.getPath() + str;
        }
        URL url2 = new URL(url, str);
        String replaceFirst = b.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            replaceFirst = replaceFirst + "#" + url2.getRef();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), replaceFirst);
    }
}
