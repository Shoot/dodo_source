package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: Escaping.java */
/* renamed from: mk3  reason: default package */
/* loaded from: classes3.dex */
public class mk3 {
    private static final Pattern a = Pattern.compile("[\\\\&]");
    private static final Pattern b = Pattern.compile("\\\\[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]|&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    private static final Pattern c = Pattern.compile("(%[a-fA-F0-9]{0,2}|[^:/?#@!$&'()*+,;=a-zA-Z0-9\\-._~])");
    private static final char[] d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final Pattern e = Pattern.compile("[ \t\r\n]+");
    private static final c f = new a();
    private static final c g = new b();

    /* compiled from: Escaping.java */
    /* renamed from: mk3$a */
    /* loaded from: classes3.dex */
    static class a implements c {
        a() {
        }

        @Override // defpackage.mk3.c
        public void a(String str, StringBuilder sb) {
            if (str.charAt(0) == '\\') {
                sb.append((CharSequence) str, 1, str.length());
            } else {
                sb.append(sp4.a(str));
            }
        }
    }

    /* compiled from: Escaping.java */
    /* renamed from: mk3$b */
    /* loaded from: classes3.dex */
    static class b implements c {
        b() {
        }

        @Override // defpackage.mk3.c
        public void a(String str, StringBuilder sb) {
            byte[] bytes;
            if (str.startsWith("%")) {
                if (str.length() == 3) {
                    sb.append(str);
                    return;
                }
                sb.append("%25");
                sb.append((CharSequence) str, 1, str.length());
                return;
            }
            for (byte b : str.getBytes(Charset.forName("UTF-8"))) {
                sb.append(CoreConstants.PERCENT_CHAR);
                sb.append(mk3.d[(b >> 4) & 15]);
                sb.append(mk3.d[b & 15]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Escaping.java */
    /* renamed from: mk3$c */
    /* loaded from: classes3.dex */
    public interface c {
        void a(String str, StringBuilder sb);
    }

    public static String b(String str) {
        return e.matcher(str.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
    }

    public static String c(String str) {
        return b(str.substring(1, str.length() - 1));
    }

    private static String d(Pattern pattern, String str, c cVar) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 16);
        int i = 0;
        do {
            sb.append((CharSequence) str, i, matcher.start());
            cVar.a(matcher.group(), sb);
            i = matcher.end();
        } while (matcher.find());
        if (i != str.length()) {
            sb.append((CharSequence) str, i, str.length());
        }
        return sb.toString();
    }

    public static String e(String str) {
        if (a.matcher(str).find()) {
            return d(b, str, f);
        }
        return str;
    }
}
