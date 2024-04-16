package org.jsoup.select;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.select.Selector;
import org.jsoup.select.b;
import org.jsoup.select.c;
import org.jsoup.select.g;
import org.slf4j.Marker;
/* compiled from: QueryParser.java */
/* loaded from: classes3.dex */
public class f {
    private static final String[] d = {",", ">", Marker.ANY_NON_NULL_MARKER, "~", " "};
    private static final String[] e = {ContainerUtils.KEY_VALUE_DELIMITER, "!=", "^=", "$=", "*=", "~="};
    private static final Pattern f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    private static final Pattern g = Pattern.compile("([+-])?(\\d+)");
    private final qib a;
    private final String b;
    private final List<c> c = new ArrayList();

    private f(String str) {
        vvb.h(str);
        String trim = str.trim();
        this.b = trim;
        this.a = new qib(trim);
    }

    private void a() {
        this.c.add(new c.a());
    }

    private void b() {
        qib qibVar = new qib(this.a.a('[', ']'));
        String h = qibVar.h(e);
        vvb.h(h);
        qibVar.i();
        if (qibVar.j()) {
            if (h.startsWith("^")) {
                this.c.add(new c.d(h.substring(1)));
            } else {
                this.c.add(new c.b(h));
            }
        } else if (qibVar.k(ContainerUtils.KEY_VALUE_DELIMITER)) {
            this.c.add(new c.e(h, qibVar.q()));
        } else if (qibVar.k("!=")) {
            this.c.add(new c.i(h, qibVar.q()));
        } else if (qibVar.k("^=")) {
            this.c.add(new c.j(h, qibVar.q()));
        } else if (qibVar.k("$=")) {
            this.c.add(new c.g(h, qibVar.q()));
        } else if (qibVar.k("*=")) {
            this.c.add(new c.f(h, qibVar.q()));
        } else if (qibVar.k("~=")) {
            this.c.add(new c.h(h, Pattern.compile(qibVar.q())));
        } else {
            throw new Selector.SelectorParseException("Could not parse attribute query '%s': unexpected token at '%s'", this.b, qibVar.q());
        }
    }

    private void c() {
        String e2 = this.a.e();
        vvb.h(e2);
        this.c.add(new c.k(e2.trim()));
    }

    private void d() {
        String e2 = this.a.e();
        vvb.h(e2);
        this.c.add(new c.r(e2));
    }

    private void e() {
        String b = h07.b(this.a.f());
        vvb.h(b);
        if (b.startsWith("*|")) {
            this.c.add(new b.C0465b(new c.n0(b.substring(2)), new c.o0(b.replace("*|", ":"))));
            return;
        }
        if (b.contains(HiAnalyticsConstant.REPORT_VAL_SEPARATOR)) {
            b = b.replace(HiAnalyticsConstant.REPORT_VAL_SEPARATOR, ":");
        }
        this.c.add(new c.n0(b));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void f(char r11) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.select.f.f(char):void");
    }

    private int g() {
        String trim = this.a.b(")").trim();
        vvb.e(wza.i(trim), "Index must be numeric");
        return Integer.parseInt(trim);
    }

    private String h() {
        StringBuilder b = wza.b();
        while (!this.a.j()) {
            if (this.a.l("(")) {
                b.append("(");
                b.append(this.a.a(CoreConstants.LEFT_PARENTHESIS_CHAR, CoreConstants.RIGHT_PARENTHESIS_CHAR));
                b.append(")");
            } else if (this.a.l("[")) {
                b.append("[");
                b.append(this.a.a('[', ']'));
                b.append("]");
            } else if (this.a.n(d)) {
                if (b.length() > 0) {
                    break;
                }
                this.a.c();
            } else {
                b.append(this.a.c());
            }
        }
        return wza.o(b);
    }

    private void i(boolean z) {
        String str;
        c nVar;
        if (z) {
            str = ":containsOwn";
        } else {
            str = ":contains";
        }
        this.a.d(str);
        String s = qib.s(this.a.a(CoreConstants.LEFT_PARENTHESIS_CHAR, CoreConstants.RIGHT_PARENTHESIS_CHAR));
        vvb.i(s, str + "(text) query must not be empty");
        List<c> list = this.c;
        if (z) {
            nVar = new c.m(s);
        } else {
            nVar = new c.n(s);
        }
        list.add(nVar);
    }

    private void j() {
        this.a.d(":containsData");
        String s = qib.s(this.a.a(CoreConstants.LEFT_PARENTHESIS_CHAR, CoreConstants.RIGHT_PARENTHESIS_CHAR));
        vvb.i(s, ":containsData(text) query must not be empty");
        this.c.add(new c.l(s));
    }

    private void k(boolean z) {
        String str;
        c pVar;
        if (z) {
            str = ":containsWholeOwnText";
        } else {
            str = ":containsWholeText";
        }
        this.a.d(str);
        String s = qib.s(this.a.a(CoreConstants.LEFT_PARENTHESIS_CHAR, CoreConstants.RIGHT_PARENTHESIS_CHAR));
        vvb.i(s, str + "(text) query must not be empty");
        List<c> list = this.c;
        if (z) {
            pVar = new c.o(s);
        } else {
            pVar = new c.p(s);
        }
        list.add(pVar);
    }

    private void l(boolean z, boolean z2) {
        int i;
        String b = h07.b(this.a.b(")"));
        Matcher matcher = f.matcher(b);
        Matcher matcher2 = g.matcher(b);
        int i2 = 2;
        int i3 = 1;
        if (!"odd".equals(b)) {
            if ("even".equals(b)) {
                i3 = 0;
            } else if (matcher.matches()) {
                if (matcher.group(3) != null) {
                    i = Integer.parseInt(matcher.group(1).replaceFirst("^\\+", ""));
                } else {
                    i = 1;
                }
                if (matcher.group(4) != null) {
                    i3 = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", ""));
                } else {
                    i3 = 0;
                }
                i2 = i;
            } else if (matcher2.matches()) {
                i3 = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i2 = 0;
            } else {
                throw new Selector.SelectorParseException("Could not parse nth-index '%s': unexpected format", b);
            }
        }
        if (z2) {
            if (z) {
                this.c.add(new c.d0(i2, i3));
            } else {
                this.c.add(new c.e0(i2, i3));
            }
        } else if (z) {
            this.c.add(new c.c0(i2, i3));
        } else {
            this.c.add(new c.b0(i2, i3));
        }
    }

    private void m() {
        if (this.a.k("#")) {
            d();
        } else if (this.a.k(".")) {
            c();
        } else if (!this.a.p() && !this.a.l("*|")) {
            if (this.a.l("[")) {
                b();
            } else if (this.a.k(Marker.ANY_MARKER)) {
                a();
            } else if (this.a.k(":lt(")) {
                q();
            } else if (this.a.k(":gt(")) {
                p();
            } else if (this.a.k(":eq(")) {
                o();
            } else if (this.a.l(":has(")) {
                n();
            } else if (this.a.l(":contains(")) {
                i(false);
            } else if (this.a.l(":containsOwn(")) {
                i(true);
            } else if (this.a.l(":containsWholeText(")) {
                k(false);
            } else if (this.a.l(":containsWholeOwnText(")) {
                k(true);
            } else if (this.a.l(":containsData(")) {
                j();
            } else if (this.a.l(":matches(")) {
                r(false);
            } else if (this.a.l(":matchesOwn(")) {
                r(true);
            } else if (this.a.l(":matchesWholeText(")) {
                s(false);
            } else if (this.a.l(":matchesWholeOwnText(")) {
                s(true);
            } else if (this.a.l(":not(")) {
                t();
            } else if (this.a.k(":nth-child(")) {
                l(false, false);
            } else if (this.a.k(":nth-last-child(")) {
                l(true, false);
            } else if (this.a.k(":nth-of-type(")) {
                l(false, true);
            } else if (this.a.k(":nth-last-of-type(")) {
                l(true, true);
            } else if (this.a.k(":first-child")) {
                this.c.add(new c.x());
            } else if (this.a.k(":last-child")) {
                this.c.add(new c.z());
            } else if (this.a.k(":first-of-type")) {
                this.c.add(new c.y());
            } else if (this.a.k(":last-of-type")) {
                this.c.add(new c.a0());
            } else if (this.a.k(":only-child")) {
                this.c.add(new c.f0());
            } else if (this.a.k(":only-of-type")) {
                this.c.add(new c.g0());
            } else if (this.a.k(":empty")) {
                this.c.add(new c.w());
            } else if (this.a.k(":root")) {
                this.c.add(new c.h0());
            } else if (this.a.k(":matchText")) {
                this.c.add(new c.i0());
            } else {
                throw new Selector.SelectorParseException("Could not parse query '%s': unexpected token at '%s'", this.b, this.a.q());
            }
        } else {
            e();
        }
    }

    private void n() {
        this.a.d(":has");
        String a = this.a.a(CoreConstants.LEFT_PARENTHESIS_CHAR, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        vvb.i(a, ":has(selector) subselect must not be empty");
        this.c.add(new g.a(v(a)));
    }

    private void o() {
        this.c.add(new c.s(g()));
    }

    private void p() {
        this.c.add(new c.u(g()));
    }

    private void q() {
        this.c.add(new c.v(g()));
    }

    private void r(boolean z) {
        String str;
        c j0Var;
        if (z) {
            str = ":matchesOwn";
        } else {
            str = ":matches";
        }
        this.a.d(str);
        String a = this.a.a(CoreConstants.LEFT_PARENTHESIS_CHAR, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        vvb.i(a, str + "(regex) query must not be empty");
        List<c> list = this.c;
        if (z) {
            j0Var = new c.k0(Pattern.compile(a));
        } else {
            j0Var = new c.j0(Pattern.compile(a));
        }
        list.add(j0Var);
    }

    private void s(boolean z) {
        String str;
        c m0Var;
        if (z) {
            str = ":matchesWholeOwnText";
        } else {
            str = ":matchesWholeText";
        }
        this.a.d(str);
        String a = this.a.a(CoreConstants.LEFT_PARENTHESIS_CHAR, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        vvb.i(a, str + "(regex) query must not be empty");
        List<c> list = this.c;
        if (z) {
            m0Var = new c.l0(Pattern.compile(a));
        } else {
            m0Var = new c.m0(Pattern.compile(a));
        }
        list.add(m0Var);
    }

    private void t() {
        this.a.d(":not");
        String a = this.a.a(CoreConstants.LEFT_PARENTHESIS_CHAR, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        vvb.i(a, ":not(selector) subselect must not be empty");
        this.c.add(new g.d(v(a)));
    }

    public static c v(String str) {
        try {
            return new f(str).u();
        } catch (IllegalArgumentException e2) {
            throw new Selector.SelectorParseException(e2.getMessage());
        }
    }

    public String toString() {
        return this.b;
    }

    c u() {
        this.a.i();
        if (this.a.n(d)) {
            this.c.add(new g.C0467g());
            f(this.a.c());
        } else {
            m();
        }
        while (!this.a.j()) {
            boolean i = this.a.i();
            if (this.a.n(d)) {
                f(this.a.c());
            } else if (i) {
                f(' ');
            } else {
                m();
            }
        }
        if (this.c.size() == 1) {
            return this.c.get(0);
        }
        return new b.a(this.c);
    }
}
