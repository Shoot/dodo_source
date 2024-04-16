package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Token.java */
/* renamed from: kib  reason: default package */
/* loaded from: classes3.dex */
public abstract class kib {
    j a;
    private int b;
    private int c;

    /* compiled from: Token.java */
    /* renamed from: kib$b */
    /* loaded from: classes3.dex */
    static final class b extends c {
        /* JADX INFO: Access modifiers changed from: package-private */
        public b(String str) {
            t(str);
        }

        @Override // defpackage.kib.c
        public String toString() {
            return "<![CDATA[" + u() + "]]>";
        }
    }

    /* compiled from: Token.java */
    /* renamed from: kib$c */
    /* loaded from: classes3.dex */
    static class c extends kib {
        private String d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c() {
            super();
            this.a = j.Character;
        }

        @Override // defpackage.kib
        kib o() {
            super.o();
            this.d = null;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c t(String str) {
            this.d = str;
            return this;
        }

        public String toString() {
            return u();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String u() {
            return this.d;
        }
    }

    /* compiled from: Token.java */
    /* renamed from: kib$d */
    /* loaded from: classes3.dex */
    static final class d extends kib {
        private final StringBuilder d;
        private String e;
        boolean f;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d() {
            super();
            this.d = new StringBuilder();
            this.f = false;
            this.a = j.Comment;
        }

        private void v() {
            String str = this.e;
            if (str != null) {
                this.d.append(str);
                this.e = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.kib
        public kib o() {
            super.o();
            kib.p(this.d);
            this.e = null;
            this.f = false;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final d t(char c) {
            v();
            this.d.append(c);
            return this;
        }

        public String toString() {
            return "<!--" + w() + "-->";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final d u(String str) {
            v();
            if (this.d.length() == 0) {
                this.e = str;
            } else {
                this.d.append(str);
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String w() {
            String str = this.e;
            if (str == null) {
                return this.d.toString();
            }
            return str;
        }
    }

    /* compiled from: Token.java */
    /* renamed from: kib$e */
    /* loaded from: classes3.dex */
    static final class e extends kib {
        final StringBuilder d;
        String e;
        final StringBuilder f;
        final StringBuilder g;
        boolean h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public e() {
            super();
            this.d = new StringBuilder();
            this.e = null;
            this.f = new StringBuilder();
            this.g = new StringBuilder();
            this.h = false;
            this.a = j.Doctype;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.kib
        public kib o() {
            super.o();
            kib.p(this.d);
            this.e = null;
            kib.p(this.f);
            kib.p(this.g);
            this.h = false;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String t() {
            return this.d.toString();
        }

        public String toString() {
            return "<!doctype " + t() + ">";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String u() {
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public String v() {
            return this.f.toString();
        }

        public String w() {
            return this.g.toString();
        }

        public boolean x() {
            return this.h;
        }
    }

    /* compiled from: Token.java */
    /* renamed from: kib$f */
    /* loaded from: classes3.dex */
    static final class f extends kib {
        /* JADX INFO: Access modifiers changed from: package-private */
        public f() {
            super();
            this.a = j.EOF;
        }

        @Override // defpackage.kib
        kib o() {
            super.o();
            return this;
        }

        public String toString() {
            return "";
        }
    }

    /* compiled from: Token.java */
    /* renamed from: kib$g */
    /* loaded from: classes3.dex */
    static final class g extends i {
        /* JADX INFO: Access modifiers changed from: package-private */
        public g() {
            this.a = j.EndTag;
        }

        public String toString() {
            return "</" + M() + ">";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Token.java */
    /* renamed from: kib$h */
    /* loaded from: classes3.dex */
    public static final class h extends i {
        /* JADX INFO: Access modifiers changed from: package-private */
        public h() {
            this.a = j.StartTag;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.kib.i, defpackage.kib
        /* renamed from: K */
        public i o() {
            super.o();
            this.n = null;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public h N(String str, hz hzVar) {
            this.d = str;
            this.n = hzVar;
            this.e = br7.a(str);
            return this;
        }

        public String toString() {
            if (E() && this.n.size() > 0) {
                return "<" + M() + " " + this.n.toString() + ">";
            }
            return "<" + M() + ">";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Token.java */
    /* renamed from: kib$i */
    /* loaded from: classes3.dex */
    public static abstract class i extends kib {
        protected String d;
        protected String e;
        private final StringBuilder f;
        private String g;
        private boolean h;
        private final StringBuilder i;
        private String j;
        private boolean k;
        private boolean l;
        boolean m;
        hz n;

        i() {
            super();
            this.f = new StringBuilder();
            this.h = false;
            this.i = new StringBuilder();
            this.k = false;
            this.l = false;
            this.m = false;
        }

        private void A() {
            this.h = true;
            String str = this.g;
            if (str != null) {
                this.f.append(str);
                this.g = null;
            }
        }

        private void B() {
            this.k = true;
            String str = this.j;
            if (str != null) {
                this.i.append(str);
                this.j = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void C() {
            if (this.h) {
                I();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean D(String str) {
            hz hzVar = this.n;
            if (hzVar != null && hzVar.F(str)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean E() {
            if (this.n != null) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final boolean F() {
            return this.m;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final i G(String str) {
            this.d = str;
            this.e = br7.a(str);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final String H() {
            boolean z;
            String str = this.d;
            if (str != null && str.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            vvb.b(z);
            return this.d;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void I() {
            String str;
            String str2;
            if (this.n == null) {
                this.n = new hz();
            }
            if (this.h && this.n.size() < 512) {
                if (this.f.length() > 0) {
                    str = this.f.toString();
                } else {
                    str = this.g;
                }
                String trim = str.trim();
                if (trim.length() > 0) {
                    if (this.k) {
                        if (this.i.length() > 0) {
                            str2 = this.i.toString();
                        } else {
                            str2 = this.j;
                        }
                    } else if (this.l) {
                        str2 = "";
                    } else {
                        str2 = null;
                    }
                    this.n.h(trim, str2);
                }
            }
            kib.p(this.f);
            this.g = null;
            this.h = false;
            kib.p(this.i);
            this.j = null;
            this.k = false;
            this.l = false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final String J() {
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // defpackage.kib
        /* renamed from: K */
        public i o() {
            super.o();
            this.d = null;
            this.e = null;
            kib.p(this.f);
            this.g = null;
            this.h = false;
            kib.p(this.i);
            this.j = null;
            this.l = false;
            this.k = false;
            this.m = false;
            this.n = null;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void L() {
            this.l = true;
        }

        final String M() {
            String str = this.d;
            if (str == null) {
                return "[unset]";
            }
            return str;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void t(char c) {
            A();
            this.f.append(c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void u(String str) {
            String replace = str.replace((char) 0, (char) 65533);
            A();
            if (this.f.length() == 0) {
                this.g = replace;
            } else {
                this.f.append(replace);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void v(char c) {
            B();
            this.i.append(c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void w(String str) {
            B();
            if (this.i.length() == 0) {
                this.j = str;
            } else {
                this.i.append(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void x(int[] iArr) {
            B();
            for (int i : iArr) {
                this.i.appendCodePoint(i);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void y(char c) {
            z(String.valueOf(c));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void z(String str) {
            String replace = str.replace((char) 0, (char) 65533);
            String str2 = this.d;
            if (str2 != null) {
                replace = str2.concat(replace);
            }
            this.d = replace;
            this.e = br7.a(replace);
        }
    }

    /* compiled from: Token.java */
    /* renamed from: kib$j */
    /* loaded from: classes3.dex */
    public enum j {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void p(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final c a() {
        return (c) this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d b() {
        return (d) this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final e c() {
        return (e) this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final g d() {
        return (g) this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final h e() {
        return (h) this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(int i2) {
        this.c = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h() {
        return this instanceof b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i() {
        if (this.a == j.Character) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j() {
        if (this.a == j.Comment) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k() {
        if (this.a == j.Doctype) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l() {
        if (this.a == j.EOF) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        if (this.a == j.EndTag) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean n() {
        if (this.a == j.StartTag) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public kib o() {
        this.b = -1;
        this.c = -1;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int q() {
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(int i2) {
        this.b = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String s() {
        return getClass().getSimpleName();
    }

    private kib() {
        this.c = -1;
    }
}
