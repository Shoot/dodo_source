package defpackage;
/* compiled from: Range.java */
/* renamed from: f49  reason: default package */
/* loaded from: classes3.dex */
public class f49 {
    private static final String c = hz.P("jsoup.sourceRange");
    private static final String d = hz.P("jsoup.endSourceRange");
    private static final a e;
    private static final f49 f;
    private final a a;
    private final a b;

    /* compiled from: Range.java */
    /* renamed from: f49$a */
    /* loaded from: classes3.dex */
    public static class a {
        private final int a;
        private final int b;
        private final int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b == aVar.b && this.c == aVar.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.c;
        }

        public String toString() {
            return this.b + "," + this.c + ":" + this.a;
        }
    }

    static {
        a aVar = new a(-1, -1, -1);
        e = aVar;
        f = new f49(aVar, aVar);
    }

    public f49(a aVar, a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public void a(kz6 kz6Var, boolean z) {
        String str;
        hz f2 = kz6Var.f();
        if (z) {
            str = c;
        } else {
            str = d;
        }
        f2.X(str, this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        f49 f49Var = (f49) obj;
        if (!this.a.equals(f49Var.a)) {
            return false;
        }
        return this.b.equals(f49Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return this.a + "-" + this.b;
    }
}
