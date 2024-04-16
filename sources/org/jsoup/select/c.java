package org.jsoup.select;

import java.util.Iterator;
import java.util.regex.Pattern;
import org.slf4j.Marker;
/* compiled from: Evaluator.java */
/* loaded from: classes3.dex */
public abstract class c {

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class a extends c {
        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            return true;
        }

        public String toString() {
            return Marker.ANY_MARKER;
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class a0 extends d0 {
        public a0() {
            super(0, 1);
        }

        @Override // org.jsoup.select.c.q
        public String toString() {
            return ":last-of-type";
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class b extends c {
        private final String a;

        public b(String str) {
            this.a = str;
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            return re3Var2.r(this.a);
        }

        public String toString() {
            return String.format("[%s]", this.a);
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class b0 extends q {
        public b0(int i, int i2) {
            super(i, i2);
        }

        @Override // org.jsoup.select.c.q
        protected int b(re3 re3Var, re3 re3Var2) {
            return re3Var2.p0() + 1;
        }

        @Override // org.jsoup.select.c.q
        protected String c() {
            return "nth-child";
        }
    }

    /* compiled from: Evaluator.java */
    /* renamed from: org.jsoup.select.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0466c extends c {
        String a;
        String b;

        public AbstractC0466c(String str, String str2) {
            this(str, str2, true);
        }

        public AbstractC0466c(String str, String str2, boolean z) {
            vvb.h(str);
            vvb.h(str2);
            this.a = h07.b(str);
            boolean z2 = (str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""));
            str2 = z2 ? str2.substring(1, str2.length() - 1) : str2;
            this.b = z ? h07.b(str2) : h07.c(str2, z2);
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class c0 extends q {
        public c0(int i, int i2) {
            super(i, i2);
        }

        @Override // org.jsoup.select.c.q
        protected int b(re3 re3Var, re3 re3Var2) {
            if (re3Var2.G() == null) {
                return 0;
            }
            return re3Var2.G().k0().size() - re3Var2.p0();
        }

        @Override // org.jsoup.select.c.q
        protected String c() {
            return "nth-last-child";
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class d extends c {
        private final String a;

        public d(String str) {
            vvb.h(str);
            this.a = h07.a(str);
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            for (az azVar : re3Var2.f().v()) {
                if (h07.a(azVar.getKey()).startsWith(this.a)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("[^%s]", this.a);
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static class d0 extends q {
        public d0(int i, int i2) {
            super(i, i2);
        }

        @Override // org.jsoup.select.c.q
        protected int b(re3 re3Var, re3 re3Var2) {
            int i = 0;
            if (re3Var2.G() == null) {
                return 0;
            }
            se3 k0 = re3Var2.G().k0();
            for (int p0 = re3Var2.p0(); p0 < k0.size(); p0++) {
                if (k0.get(p0).R0().equals(re3Var2.R0())) {
                    i++;
                }
            }
            return i;
        }

        @Override // org.jsoup.select.c.q
        protected String c() {
            return "nth-last-of-type";
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class e extends AbstractC0466c {
        public e(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            if (re3Var2.r(this.a) && this.b.equalsIgnoreCase(re3Var2.e(this.a).trim())) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format("[%s=%s]", this.a, this.b);
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static class e0 extends q {
        public e0(int i, int i2) {
            super(i, i2);
        }

        @Override // org.jsoup.select.c.q
        protected int b(re3 re3Var, re3 re3Var2) {
            int i = 0;
            if (re3Var2.G() == null) {
                return 0;
            }
            Iterator<re3> it = re3Var2.G().k0().iterator();
            while (it.hasNext()) {
                re3 next = it.next();
                if (next.R0().equals(re3Var2.R0())) {
                    i++;
                    continue;
                }
                if (next == re3Var2) {
                    break;
                }
            }
            return i;
        }

        @Override // org.jsoup.select.c.q
        protected String c() {
            return "nth-of-type";
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class f extends AbstractC0466c {
        public f(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            if (re3Var2.r(this.a) && h07.a(re3Var2.e(this.a)).contains(this.b)) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format("[%s*=%s]", this.a, this.b);
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class f0 extends c {
        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            re3 G = re3Var2.G();
            if (G != null && !(G instanceof h53) && re3Var2.Q0().isEmpty()) {
                return true;
            }
            return false;
        }

        public String toString() {
            return ":only-child";
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class g extends AbstractC0466c {
        public g(String str, String str2) {
            super(str, str2, false);
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            if (re3Var2.r(this.a) && h07.a(re3Var2.e(this.a)).endsWith(this.b)) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format("[%s$=%s]", this.a, this.b);
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class g0 extends c {
        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            re3 G = re3Var2.G();
            if (G == null || (G instanceof h53)) {
                return false;
            }
            Iterator<re3> it = G.k0().iterator();
            int i = 0;
            while (it.hasNext()) {
                if (it.next().R0().equals(re3Var2.R0())) {
                    i++;
                }
            }
            if (i != 1) {
                return false;
            }
            return true;
        }

        public String toString() {
            return ":only-of-type";
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class h extends c {
        String a;
        Pattern b;

        public h(String str, Pattern pattern) {
            this.a = h07.b(str);
            this.b = pattern;
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            if (re3Var2.r(this.a) && this.b.matcher(re3Var2.e(this.a)).find()) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format("[%s~=%s]", this.a, this.b.toString());
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class h0 extends c {
        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            if (re3Var instanceof h53) {
                re3Var = re3Var.i0(0);
            }
            if (re3Var2 != re3Var) {
                return false;
            }
            return true;
        }

        public String toString() {
            return ":root";
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class i extends AbstractC0466c {
        public i(String str, String str2) {
            super(str, str2);
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            return !this.b.equalsIgnoreCase(re3Var2.e(this.a));
        }

        public String toString() {
            return String.format("[%s!=%s]", this.a, this.b);
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class i0 extends c {
        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            if (re3Var2 instanceof gs8) {
                return true;
            }
            for (kz6 kz6Var : re3Var2.U0()) {
                gs8 gs8Var = new gs8(g6b.q(re3Var2.S0()), re3Var2.g(), re3Var2.f());
                kz6Var.O(gs8Var);
                gs8Var.Z(kz6Var);
            }
            return false;
        }

        public String toString() {
            return ":matchText";
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class j extends AbstractC0466c {
        public j(String str, String str2) {
            super(str, str2, false);
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            if (re3Var2.r(this.a) && h07.a(re3Var2.e(this.a)).startsWith(this.b)) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format("[%s^=%s]", this.a, this.b);
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class j0 extends c {
        private final Pattern a;

        public j0(Pattern pattern) {
            this.a = pattern;
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            return this.a.matcher(re3Var2.T0()).find();
        }

        public String toString() {
            return String.format(":matches(%s)", this.a);
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class k extends c {
        private final String a;

        public k(String str) {
            this.a = str;
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            return re3Var2.s0(this.a);
        }

        public String toString() {
            return String.format(".%s", this.a);
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class k0 extends c {
        private final Pattern a;

        public k0(Pattern pattern) {
            this.a = pattern;
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            return this.a.matcher(re3Var2.D0()).find();
        }

        public String toString() {
            return String.format(":matchesOwn(%s)", this.a);
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class l extends c {
        private final String a;

        public l(String str) {
            this.a = h07.a(str);
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            return h07.a(re3Var2.m0()).contains(this.a);
        }

        public String toString() {
            return String.format(":containsData(%s)", this.a);
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class l0 extends c {
        private final Pattern a;

        public l0(Pattern pattern) {
            this.a = pattern;
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            return this.a.matcher(re3Var2.V0()).find();
        }

        public String toString() {
            return String.format(":matchesWholeOwnText(%s)", this.a);
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class m extends c {
        private final String a;

        public m(String str) {
            this.a = h07.a(wza.m(str));
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            return h07.a(re3Var2.D0()).contains(this.a);
        }

        public String toString() {
            return String.format(":containsOwn(%s)", this.a);
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class m0 extends c {
        private final Pattern a;

        public m0(Pattern pattern) {
            this.a = pattern;
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            return this.a.matcher(re3Var2.W0()).find();
        }

        public String toString() {
            return String.format(":matchesWholeText(%s)", this.a);
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class n extends c {
        private final String a;

        public n(String str) {
            this.a = h07.a(wza.m(str));
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            return h07.a(re3Var2.T0()).contains(this.a);
        }

        public String toString() {
            return String.format(":contains(%s)", this.a);
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class n0 extends c {
        private final String a;

        public n0(String str) {
            this.a = str;
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            return re3Var2.C0().equals(this.a);
        }

        public String toString() {
            return String.format("%s", this.a);
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class o extends c {
        private final String a;

        public o(String str) {
            this.a = str;
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            return re3Var2.V0().contains(this.a);
        }

        public String toString() {
            return String.format(":containsWholeOwnText(%s)", this.a);
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class o0 extends c {
        private final String a;

        public o0(String str) {
            this.a = str;
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            return re3Var2.C0().endsWith(this.a);
        }

        public String toString() {
            return String.format("%s", this.a);
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class p extends c {
        private final String a;

        public p(String str) {
            this.a = str;
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            return re3Var2.W0().contains(this.a);
        }

        public String toString() {
            return String.format(":containsWholeText(%s)", this.a);
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static abstract class q extends c {
        protected final int a;
        protected final int b;

        public q(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            re3 G = re3Var2.G();
            if (G == null || (G instanceof h53)) {
                return false;
            }
            int b = b(re3Var, re3Var2);
            int i = this.a;
            if (i == 0) {
                if (b != this.b) {
                    return false;
                }
                return true;
            }
            int i2 = this.b;
            if ((b - i2) * i < 0 || (b - i2) % i != 0) {
                return false;
            }
            return true;
        }

        protected abstract int b(re3 re3Var, re3 re3Var2);

        protected abstract String c();

        public String toString() {
            if (this.a == 0) {
                return String.format(":%s(%d)", c(), Integer.valueOf(this.b));
            }
            if (this.b == 0) {
                return String.format(":%s(%dn)", c(), Integer.valueOf(this.a));
            }
            return String.format(":%s(%dn%+d)", c(), Integer.valueOf(this.a), Integer.valueOf(this.b));
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class r extends c {
        private final String a;

        public r(String str) {
            this.a = str;
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            return this.a.equals(re3Var2.v0());
        }

        public String toString() {
            return String.format("#%s", this.a);
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class s extends t {
        public s(int i) {
            super(i);
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            if (re3Var2.p0() == this.a) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format(":eq(%d)", Integer.valueOf(this.a));
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static abstract class t extends c {
        int a;

        public t(int i) {
            this.a = i;
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class u extends t {
        public u(int i) {
            super(i);
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            if (re3Var2.p0() > this.a) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format(":gt(%d)", Integer.valueOf(this.a));
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class v extends t {
        public v(int i) {
            super(i);
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            if (re3Var != re3Var2 && re3Var2.p0() < this.a) {
                return true;
            }
            return false;
        }

        public String toString() {
            return String.format(":lt(%d)", Integer.valueOf(this.a));
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class w extends c {
        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            for (kz6 kz6Var : re3Var2.l()) {
                if (!(kz6Var instanceof kj1) && !(kz6Var instanceof wbc) && !(kz6Var instanceof o53)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return ":empty";
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class x extends c {
        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            re3 G = re3Var2.G();
            if (G != null && !(G instanceof h53) && re3Var2.p0() == 0) {
                return true;
            }
            return false;
        }

        public String toString() {
            return ":first-child";
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class y extends e0 {
        public y() {
            super(0, 1);
        }

        @Override // org.jsoup.select.c.q
        public String toString() {
            return ":first-of-type";
        }
    }

    /* compiled from: Evaluator.java */
    /* loaded from: classes3.dex */
    public static final class z extends c {
        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            re3 G = re3Var2.G();
            if (G != null && !(G instanceof h53) && re3Var2.p0() == G.k0().size() - 1) {
                return true;
            }
            return false;
        }

        public String toString() {
            return ":last-child";
        }
    }

    public abstract boolean a(re3 re3Var, re3 re3Var2);
}
