package com.google.i18n.phonenumbers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: AsYouTypeFormatter.java */
/* loaded from: classes.dex */
public class a {
    private static final c w = c.N().b0("<ignored>").e0("NA").Q0();
    private static final Pattern x = Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*\\$1[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]*)*");
    private static final Pattern y = Pattern.compile("[- ]");
    private static final Pattern z = Pattern.compile("\u2008");
    private String k;
    private c l;
    private c m;
    private String a = "";
    private StringBuilder b = new StringBuilder();
    private String c = "";
    private StringBuilder d = new StringBuilder();
    private StringBuilder e = new StringBuilder();
    private boolean f = true;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private final b j = b.v();
    private int n = 0;
    private int o = 0;
    private int p = 0;
    private StringBuilder q = new StringBuilder();
    private boolean r = false;
    private String s = "";
    private StringBuilder t = new StringBuilder();
    private List<d58> u = new ArrayList();
    private gc9 v = new gc9(64);

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str) {
        this.k = str;
        c k = k(str);
        this.m = k;
        this.l = k;
    }

    private boolean a() {
        if (this.s.length() > 0) {
            this.t.insert(0, this.s);
            this.q.setLength(this.q.lastIndexOf(this.s));
        }
        return !this.s.equals(u());
    }

    private String b(String str) {
        int length = this.q.length();
        if (this.r && length > 0 && this.q.charAt(length - 1) != ' ') {
            return new String(this.q) + ' ' + str;
        }
        return ((Object) this.q) + str;
    }

    private String c() {
        if (this.t.length() >= 3) {
            i(this.t.toString());
            String g = g();
            if (g.length() > 0) {
                return g;
            }
            if (r()) {
                return l();
            }
            return this.d.toString();
        }
        return b(this.t.toString());
    }

    private String d() {
        this.f = true;
        this.i = false;
        this.u.clear();
        this.n = 0;
        this.b.setLength(0);
        this.c = "";
        return c();
    }

    private boolean e() {
        StringBuilder sb;
        int j;
        if (this.t.length() == 0 || (j = this.j.j(this.t, (sb = new StringBuilder()))) == 0) {
            return false;
        }
        this.t.setLength(0);
        this.t.append((CharSequence) sb);
        String D = this.j.D(j);
        if ("001".equals(D)) {
            this.m = this.j.w(j);
        } else if (!D.equals(this.k)) {
            this.m = k(D);
        }
        String num = Integer.toString(j);
        StringBuilder sb2 = this.q;
        sb2.append(num);
        sb2.append(' ');
        this.s = "";
        return true;
    }

    private boolean f() {
        gc9 gc9Var = this.v;
        Matcher matcher = gc9Var.a("\\+|" + this.m.d()).matcher(this.e);
        if (!matcher.lookingAt()) {
            return false;
        }
        this.h = true;
        int end = matcher.end();
        this.t.setLength(0);
        this.t.append(this.e.substring(end));
        this.q.setLength(0);
        this.q.append(this.e.substring(0, end));
        if (this.e.charAt(0) != '+') {
            this.q.append(' ');
        }
        return true;
    }

    private boolean h(d58 d58Var) {
        String f = d58Var.f();
        this.b.setLength(0);
        String j = j(f, d58Var.getFormat());
        if (j.length() <= 0) {
            return false;
        }
        this.b.append(j);
        return true;
    }

    private void i(String str) {
        List<d58> n;
        if (this.h && this.s.length() == 0 && this.m.e() > 0) {
            n = this.m.f();
        } else {
            n = this.m.n();
        }
        for (d58 d58Var : n) {
            if (this.s.length() <= 0 || !b.r(d58Var.d()) || d58Var.e() || d58Var.i()) {
                if (this.s.length() != 0 || this.h || b.r(d58Var.d()) || d58Var.e()) {
                    if (x.matcher(d58Var.getFormat()).matches()) {
                        this.u.add(d58Var);
                    }
                }
            }
        }
        s(str);
    }

    private String j(String str, String str2) {
        Matcher matcher = this.v.a(str).matcher("999999999999999");
        matcher.find();
        String group = matcher.group();
        if (group.length() < this.t.length()) {
            return "";
        }
        return group.replaceAll(str, str2).replaceAll("9", "\u2008");
    }

    private c k(String str) {
        c x2 = this.j.x(this.j.D(this.j.t(str)));
        if (x2 != null) {
            return x2;
        }
        return w;
    }

    private String l() {
        int length = this.t.length();
        if (length > 0) {
            String str = "";
            for (int i = 0; i < length; i++) {
                str = n(this.t.charAt(i));
            }
            if (this.f) {
                return b(str);
            }
            return this.d.toString();
        }
        return this.q.toString();
    }

    private String n(char c) {
        Matcher matcher = z.matcher(this.b);
        if (matcher.find(this.n)) {
            String replaceFirst = matcher.replaceFirst(Character.toString(c));
            this.b.replace(0, replaceFirst.length(), replaceFirst);
            int start = matcher.start();
            this.n = start;
            return this.b.substring(0, start + 1);
        }
        if (this.u.size() == 1) {
            this.f = false;
        }
        this.c = "";
        return this.d.toString();
    }

    private String o(char c, boolean z2) {
        this.d.append(c);
        if (z2) {
            this.o = this.d.length();
        }
        if (!p(c)) {
            this.f = false;
            this.g = true;
        } else {
            c = t(c, z2);
        }
        if (!this.f) {
            if (this.g) {
                return this.d.toString();
            }
            if (f()) {
                if (e()) {
                    return d();
                }
            } else if (a()) {
                this.q.append(' ');
                return d();
            }
            return this.d.toString();
        }
        int length = this.e.length();
        if (length != 0 && length != 1 && length != 2) {
            if (length == 3) {
                if (f()) {
                    this.i = true;
                } else {
                    this.s = u();
                    return c();
                }
            }
            if (this.i) {
                if (e()) {
                    this.i = false;
                }
                return ((Object) this.q) + this.t.toString();
            } else if (this.u.size() > 0) {
                String n = n(c);
                String g = g();
                if (g.length() > 0) {
                    return g;
                }
                s(this.t.toString());
                if (r()) {
                    return l();
                }
                if (this.f) {
                    return b(n);
                }
                return this.d.toString();
            } else {
                return c();
            }
        }
        return this.d.toString();
    }

    private boolean p(char c) {
        if (Character.isDigit(c)) {
            return true;
        }
        if (this.d.length() == 1 && b.r.matcher(Character.toString(c)).matches()) {
            return true;
        }
        return false;
    }

    private boolean q() {
        if (this.m.a() != 1 || this.t.charAt(0) != '1' || this.t.charAt(1) == '0' || this.t.charAt(1) == '1') {
            return false;
        }
        return true;
    }

    private boolean r() {
        Iterator<d58> it = this.u.iterator();
        while (it.hasNext()) {
            d58 next = it.next();
            String f = next.f();
            if (this.c.equals(f)) {
                return false;
            }
            if (h(next)) {
                this.c = f;
                this.r = y.matcher(next.d()).find();
                this.n = 0;
                return true;
            }
            it.remove();
        }
        this.f = false;
        return false;
    }

    private void s(String str) {
        int length = str.length() - 3;
        Iterator<d58> it = this.u.iterator();
        while (it.hasNext()) {
            d58 next = it.next();
            if (next.c() != 0) {
                if (!this.v.a(next.b(Math.min(length, next.c() - 1))).matcher(str).lookingAt()) {
                    it.remove();
                }
            }
        }
    }

    private char t(char c, boolean z2) {
        if (c == '+') {
            this.e.append(c);
        } else {
            c = Character.forDigit(Character.digit(c, 10), 10);
            this.e.append(c);
            this.t.append(c);
        }
        if (z2) {
            this.p = this.e.length();
        }
        return c;
    }

    private String u() {
        int i = 1;
        if (q()) {
            StringBuilder sb = this.q;
            sb.append('1');
            sb.append(' ');
            this.h = true;
        } else {
            if (this.m.K()) {
                Matcher matcher = this.v.a(this.m.k()).matcher(this.t);
                if (matcher.lookingAt() && matcher.end() > 0) {
                    this.h = true;
                    i = matcher.end();
                    this.q.append(this.t.substring(0, i));
                }
            }
            i = 0;
        }
        String substring = this.t.substring(0, i);
        this.t.delete(0, i);
        return substring;
    }

    String g() {
        for (d58 d58Var : this.u) {
            Matcher matcher = this.v.a(d58Var.f()).matcher(this.t);
            if (matcher.matches()) {
                this.r = y.matcher(d58Var.d()).find();
                String b = b(matcher.replaceAll(d58Var.getFormat()));
                if (b.U(b).contentEquals(this.e)) {
                    return b;
                }
            }
        }
        return "";
    }

    public String m(char c) {
        String o = o(c, false);
        this.a = o;
        return o;
    }
}
