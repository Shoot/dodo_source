package defpackage;

import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: InlineParserImpl.java */
/* renamed from: i35  reason: default package */
/* loaded from: classes3.dex */
public class i35 implements e35 {
    private static final Pattern i = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    private static final Pattern j = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    private static final Pattern k = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    private static final Pattern l = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    private static final Pattern m = Pattern.compile("`+");
    private static final Pattern n = Pattern.compile("^`+");
    private static final Pattern o = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    private static final Pattern p = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    private static final Pattern q = Pattern.compile("^ *(?:\n *)?");
    private static final Pattern r = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    private static final Pattern s = Pattern.compile("\\s+");
    private static final Pattern t = Pattern.compile(" *$");
    private final BitSet a;
    private final BitSet b;
    private final Map<Character, mu2> c;
    private final f35 d;
    private String e;
    private int f;
    private lu2 g;
    private of0 h;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: InlineParserImpl.java */
    /* renamed from: i35$a */
    /* loaded from: classes3.dex */
    public static class a {
        final int a;
        final boolean b;
        final boolean c;

        a(int i, boolean z, boolean z2) {
            this.a = i;
            this.c = z;
            this.b = z2;
        }
    }

    public i35(f35 f35Var) {
        Map<Character, mu2> f = f(f35Var.b());
        this.c = f;
        BitSet e = e(f.keySet());
        this.b = e;
        this.a = g(e);
        this.d = f35Var;
    }

    private jz6 A() {
        int i2 = this.f;
        int length = this.e.length();
        while (true) {
            int i3 = this.f;
            if (i3 == length || this.a.get(this.e.charAt(i3))) {
                break;
            }
            this.f++;
        }
        int i4 = this.f;
        if (i2 != i4) {
            return M(this.e, i2, i4);
        }
        return null;
    }

    private char B() {
        if (this.f < this.e.length()) {
            return this.e.charAt(this.f);
        }
        return (char) 0;
    }

    private void C(lu2 lu2Var) {
        boolean z;
        HashMap hashMap = new HashMap();
        lu2 lu2Var2 = this.g;
        while (lu2Var2 != null) {
            lu2 lu2Var3 = lu2Var2.e;
            if (lu2Var3 == lu2Var) {
                break;
            }
            lu2Var2 = lu2Var3;
        }
        while (lu2Var2 != null) {
            char c = lu2Var2.b;
            mu2 mu2Var = this.c.get(Character.valueOf(c));
            if (lu2Var2.d && mu2Var != null) {
                char d = mu2Var.d();
                lu2 lu2Var4 = lu2Var2.e;
                int i2 = 0;
                boolean z2 = false;
                while (lu2Var4 != null && lu2Var4 != lu2Var && lu2Var4 != hashMap.get(Character.valueOf(c))) {
                    if (lu2Var4.c && lu2Var4.b == d) {
                        i2 = mu2Var.e(lu2Var4, lu2Var2);
                        z2 = true;
                        if (i2 > 0) {
                            z = true;
                            break;
                        }
                    }
                    lu2Var4 = lu2Var4.e;
                }
                z = z2;
                z2 = false;
                if (!z2) {
                    if (!z) {
                        hashMap.put(Character.valueOf(c), lu2Var2.e);
                        if (!lu2Var2.c) {
                            F(lu2Var2);
                        }
                    }
                    lu2Var2 = lu2Var2.f;
                } else {
                    g9b g9bVar = lu2Var4.a;
                    g9b g9bVar2 = lu2Var2.a;
                    lu2Var4.g -= i2;
                    lu2Var2.g -= i2;
                    g9bVar.n(g9bVar.m().substring(0, g9bVar.m().length() - i2));
                    g9bVar2.n(g9bVar2.m().substring(0, g9bVar2.m().length() - i2));
                    G(lu2Var4, lu2Var2);
                    k(g9bVar, g9bVar2);
                    mu2Var.a(g9bVar, g9bVar2, i2);
                    if (lu2Var4.g == 0) {
                        E(lu2Var4);
                    }
                    if (lu2Var2.g == 0) {
                        lu2 lu2Var5 = lu2Var2.f;
                        E(lu2Var2);
                        lu2Var2 = lu2Var5;
                    }
                }
            } else {
                lu2Var2 = lu2Var2.f;
            }
        }
        while (true) {
            lu2 lu2Var6 = this.g;
            if (lu2Var6 != null && lu2Var6 != lu2Var) {
                F(lu2Var6);
            } else {
                return;
            }
        }
    }

    private void D(lu2 lu2Var) {
        lu2 lu2Var2 = lu2Var.e;
        if (lu2Var2 != null) {
            lu2Var2.f = lu2Var.f;
        }
        lu2 lu2Var3 = lu2Var.f;
        if (lu2Var3 == null) {
            this.g = lu2Var2;
        } else {
            lu2Var3.e = lu2Var2;
        }
    }

    private void E(lu2 lu2Var) {
        lu2Var.a.l();
        D(lu2Var);
    }

    private void F(lu2 lu2Var) {
        D(lu2Var);
    }

    private void G(lu2 lu2Var, lu2 lu2Var2) {
        lu2 lu2Var3 = lu2Var2.e;
        while (lu2Var3 != null && lu2Var3 != lu2Var) {
            lu2 lu2Var4 = lu2Var3.e;
            F(lu2Var3);
            lu2Var3 = lu2Var4;
        }
    }

    private void H() {
        this.h = this.h.d;
    }

    private a J(mu2 mu2Var, char c) {
        String substring;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2 = this.f;
        boolean z5 = false;
        int i3 = 0;
        while (B() == c) {
            i3++;
            this.f++;
        }
        if (i3 < mu2Var.c()) {
            this.f = i2;
            return null;
        }
        String str = "\n";
        if (i2 == 0) {
            substring = "\n";
        } else {
            substring = this.e.substring(i2 - 1, i2);
        }
        char B = B();
        if (B != 0) {
            str = String.valueOf(B);
        }
        Pattern pattern = i;
        boolean matches = pattern.matcher(substring).matches();
        Pattern pattern2 = r;
        boolean matches2 = pattern2.matcher(substring).matches();
        boolean matches3 = pattern.matcher(str).matches();
        boolean matches4 = pattern2.matcher(str).matches();
        if (!matches4 && (!matches3 || matches2 || matches)) {
            z = true;
        } else {
            z = false;
        }
        if (!matches2 && (!matches || matches4 || matches3)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c == '_') {
            if (z && (!z2 || matches)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z2 && (!z || matches3)) {
                z5 = true;
            }
        } else {
            if (z && c == mu2Var.d()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && c == mu2Var.b()) {
                z5 = true;
            }
            z4 = z3;
        }
        this.f = i2;
        return new a(i3, z4, z5);
    }

    private void K() {
        h(q);
    }

    private g9b L(String str) {
        return new g9b(str);
    }

    private g9b M(String str, int i2, int i3) {
        return new g9b(str.substring(i2, i3));
    }

    private void b(of0 of0Var) {
        of0 of0Var2 = this.h;
        if (of0Var2 != null) {
            of0Var2.g = true;
        }
        this.h = of0Var;
    }

    private static void c(char c, mu2 mu2Var, Map<Character, mu2> map) {
        if (map.put(Character.valueOf(c), mu2Var) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    private static void d(Iterable<mu2> iterable, Map<Character, mu2> map) {
        ita itaVar;
        for (mu2 mu2Var : iterable) {
            char d = mu2Var.d();
            char b = mu2Var.b();
            if (d == b) {
                mu2 mu2Var2 = map.get(Character.valueOf(d));
                if (mu2Var2 != null && mu2Var2.d() == mu2Var2.b()) {
                    if (mu2Var2 instanceof ita) {
                        itaVar = (ita) mu2Var2;
                    } else {
                        ita itaVar2 = new ita(d);
                        itaVar2.f(mu2Var2);
                        itaVar = itaVar2;
                    }
                    itaVar.f(mu2Var);
                    map.put(Character.valueOf(d), itaVar);
                } else {
                    c(d, mu2Var, map);
                }
            } else {
                c(d, mu2Var, map);
                c(b, mu2Var, map);
            }
        }
    }

    public static BitSet e(Set<Character> set) {
        BitSet bitSet = new BitSet();
        for (Character ch2 : set) {
            bitSet.set(ch2.charValue());
        }
        return bitSet;
    }

    public static Map<Character, mu2> f(List<mu2> list) {
        HashMap hashMap = new HashMap();
        d(Arrays.asList(new qx(), new hqb()), hashMap);
        d(list, hashMap);
        return hashMap;
    }

    public static BitSet g(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        return bitSet2;
    }

    private String h(Pattern pattern) {
        if (this.f >= this.e.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.e);
        matcher.region(this.f, this.e.length());
        if (!matcher.find()) {
            return null;
        }
        this.f = matcher.end();
        return matcher.group();
    }

    private void i(jz6 jz6Var) {
        if (jz6Var.c() == jz6Var.d()) {
            return;
        }
        l(jz6Var.c(), jz6Var.d());
    }

    private void j(g9b g9bVar, g9b g9bVar2, int i2) {
        if (g9bVar != null && g9bVar2 != null && g9bVar != g9bVar2) {
            StringBuilder sb = new StringBuilder(i2);
            sb.append(g9bVar.m());
            jz6 e = g9bVar.e();
            jz6 e2 = g9bVar2.e();
            while (e != e2) {
                sb.append(((g9b) e).m());
                jz6 e3 = e.e();
                e.l();
                e = e3;
            }
            g9bVar.n(sb.toString());
        }
    }

    private void k(jz6 jz6Var, jz6 jz6Var2) {
        if (jz6Var != jz6Var2 && jz6Var.e() != jz6Var2) {
            l(jz6Var.e(), jz6Var2.g());
        }
    }

    private void l(jz6 jz6Var, jz6 jz6Var2) {
        g9b g9bVar = null;
        g9b g9bVar2 = null;
        int i2 = 0;
        while (jz6Var != null) {
            if (jz6Var instanceof g9b) {
                g9bVar2 = (g9b) jz6Var;
                if (g9bVar == null) {
                    g9bVar = g9bVar2;
                }
                i2 += g9bVar2.m().length();
            } else {
                j(g9bVar, g9bVar2, i2);
                g9bVar = null;
                g9bVar2 = null;
                i2 = 0;
            }
            if (jz6Var == jz6Var2) {
                break;
            }
            jz6Var = jz6Var.e();
        }
        j(g9bVar, g9bVar2, i2);
    }

    private jz6 m() {
        String h = h(o);
        if (h != null) {
            String substring = h.substring(1, h.length() - 1);
            iq5 iq5Var = new iq5("mailto:" + substring, null);
            iq5Var.b(new g9b(substring));
            return iq5Var;
        }
        String h2 = h(p);
        if (h2 == null) {
            return null;
        }
        String substring2 = h2.substring(1, h2.length() - 1);
        iq5 iq5Var2 = new iq5(substring2, null);
        iq5Var2.b(new g9b(substring2));
        return iq5Var2;
    }

    private jz6 n() {
        this.f++;
        if (B() == '\n') {
            wm4 wm4Var = new wm4();
            this.f++;
            return wm4Var;
        }
        if (this.f < this.e.length()) {
            Pattern pattern = k;
            String str = this.e;
            int i2 = this.f;
            if (pattern.matcher(str.substring(i2, i2 + 1)).matches()) {
                String str2 = this.e;
                int i3 = this.f;
                g9b M = M(str2, i3, i3 + 1);
                this.f++;
                return M;
            }
        }
        return L("\\");
    }

    private jz6 o() {
        String h;
        String h2 = h(n);
        if (h2 == null) {
            return null;
        }
        int i2 = this.f;
        do {
            h = h(m);
            if (h == null) {
                this.f = i2;
                return L(h2);
            }
        } while (!h.equals(h2));
        ma1 ma1Var = new ma1();
        String replace = this.e.substring(i2, this.f - h2.length()).replace('\n', ' ');
        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ' && jr7.e(replace)) {
            replace = replace.substring(1, replace.length() - 1);
        }
        ma1Var.n(replace);
        return ma1Var;
    }

    private jz6 p() {
        int i2 = this.f;
        this.f = i2 + 1;
        if (B() == '[') {
            this.f++;
            g9b L = L("![");
            b(of0.a(L, i2 + 1, this.h, this.g));
            return L;
        }
        return L("!");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private defpackage.jz6 q() {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i35.q():jz6");
    }

    private jz6 r(mu2 mu2Var, char c) {
        a J = J(mu2Var, c);
        if (J == null) {
            return null;
        }
        int i2 = J.a;
        int i3 = this.f;
        int i4 = i3 + i2;
        this.f = i4;
        g9b M = M(this.e, i3, i4);
        lu2 lu2Var = new lu2(M, c, J.c, J.b, this.g);
        this.g = lu2Var;
        lu2Var.g = i2;
        lu2Var.h = i2;
        lu2 lu2Var2 = lu2Var.e;
        if (lu2Var2 != null) {
            lu2Var2.f = lu2Var;
        }
        return M;
    }

    private jz6 s() {
        String h = h(l);
        if (h != null) {
            return L(sp4.a(h));
        }
        return null;
    }

    private jz6 t() {
        String h = h(j);
        if (h != null) {
            wp4 wp4Var = new wp4();
            wp4Var.m(h);
            return wp4Var;
        }
        return null;
    }

    private jz6 u(jz6 jz6Var) {
        jz6 y;
        char B = B();
        if (B == 0) {
            return null;
        }
        if (B != '\n') {
            if (B != '!') {
                if (B != '&') {
                    if (B != '<') {
                        if (B != '`') {
                            switch (B) {
                                case '[':
                                    y = z();
                                    break;
                                case '\\':
                                    y = n();
                                    break;
                                case ']':
                                    y = q();
                                    break;
                                default:
                                    if (this.b.get(B)) {
                                        y = r(this.c.get(Character.valueOf(B)), B);
                                        break;
                                    } else {
                                        y = A();
                                        break;
                                    }
                            }
                        } else {
                            y = o();
                        }
                    } else {
                        y = m();
                        if (y == null) {
                            y = t();
                        }
                    }
                } else {
                    y = s();
                }
            } else {
                y = p();
            }
        } else {
            y = y(jz6Var);
        }
        if (y != null) {
            return y;
        }
        this.f++;
        return L(String.valueOf(B));
    }

    private String v() {
        String substring;
        int a2 = oq5.a(this.e, this.f);
        if (a2 == -1) {
            return null;
        }
        if (B() == '<') {
            substring = this.e.substring(this.f + 1, a2 - 1);
        } else {
            substring = this.e.substring(this.f, a2);
        }
        this.f = a2;
        return mk3.e(substring);
    }

    private String x() {
        int d = oq5.d(this.e, this.f);
        if (d == -1) {
            return null;
        }
        String substring = this.e.substring(this.f + 1, d - 1);
        this.f = d;
        return mk3.e(substring);
    }

    private jz6 y(jz6 jz6Var) {
        int i2;
        this.f++;
        if (jz6Var instanceof g9b) {
            g9b g9bVar = (g9b) jz6Var;
            if (g9bVar.m().endsWith(" ")) {
                String m2 = g9bVar.m();
                Matcher matcher = t.matcher(m2);
                if (matcher.find()) {
                    i2 = matcher.end() - matcher.start();
                } else {
                    i2 = 0;
                }
                if (i2 > 0) {
                    g9bVar.n(m2.substring(0, m2.length() - i2));
                }
                if (i2 >= 2) {
                    return new wm4();
                }
                return new hqa();
            }
        }
        return new hqa();
    }

    private jz6 z() {
        int i2 = this.f;
        this.f = i2 + 1;
        g9b L = L("[");
        b(of0.b(L, i2, this.h, this.g));
        return L;
    }

    void I(String str) {
        this.e = str;
        this.f = 0;
        this.g = null;
        this.h = null;
    }

    @Override // defpackage.e35
    public void a(String str, jz6 jz6Var) {
        I(str.trim());
        jz6 jz6Var2 = null;
        while (true) {
            jz6Var2 = u(jz6Var2);
            if (jz6Var2 != null) {
                jz6Var.b(jz6Var2);
            } else {
                C(null);
                i(jz6Var);
                return;
            }
        }
    }

    int w() {
        if (this.f < this.e.length() && this.e.charAt(this.f) == '[') {
            int i2 = this.f + 1;
            int c = oq5.c(this.e, i2);
            int i3 = c - i2;
            if (c != -1 && i3 <= 999 && c < this.e.length() && this.e.charAt(c) == ']') {
                this.f = c + 1;
                return i3 + 2;
            }
        }
        return 0;
    }
}
