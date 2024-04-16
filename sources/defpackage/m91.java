package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ClientMetrics.java */
/* renamed from: m91  reason: default package */
/* loaded from: classes2.dex */
public final class m91 {
    private static final m91 e = new a().b();
    private final ugb a;
    private final List<ex5> b;
    private final ig4 c;
    private final String d;

    /* compiled from: ClientMetrics.java */
    /* renamed from: m91$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private ugb a = null;
        private List<ex5> b = new ArrayList();
        private ig4 c = null;
        private String d = "";

        a() {
        }

        public a a(ex5 ex5Var) {
            this.b.add(ex5Var);
            return this;
        }

        public m91 b() {
            return new m91(this.a, Collections.unmodifiableList(this.b), this.c, this.d);
        }

        public a c(String str) {
            this.d = str;
            return this;
        }

        public a d(ig4 ig4Var) {
            this.c = ig4Var;
            return this;
        }

        public a e(ugb ugbVar) {
            this.a = ugbVar;
            return this;
        }
    }

    m91(ugb ugbVar, List<ex5> list, ig4 ig4Var, String str) {
        this.a = ugbVar;
        this.b = list;
        this.c = ig4Var;
        this.d = str;
    }

    public static a e() {
        return new a();
    }

    @pr8(tag = 4)
    public String a() {
        return this.d;
    }

    @pr8(tag = 3)
    public ig4 b() {
        return this.c;
    }

    @pr8(tag = 2)
    public List<ex5> c() {
        return this.b;
    }

    @pr8(tag = 1)
    public ugb d() {
        return this.a;
    }

    public byte[] f() {
        return ir8.a(this);
    }
}
