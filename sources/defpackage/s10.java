package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
import java.util.List;
/* compiled from: AutoValue_CrashlyticsReport_Session.java */
/* renamed from: s10  reason: default package */
/* loaded from: classes2.dex */
final class s10 extends j12.e {
    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final Long e;
    private final boolean f;
    private final j12.e.a g;
    private final j12.e.f h;
    private final j12.e.AbstractC0390e i;
    private final j12.e.c j;
    private final List<j12.e.d> k;
    private final int l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session.java */
    /* renamed from: s10$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.e.b {
        private String a;
        private String b;
        private String c;
        private Long d;
        private Long e;
        private Boolean f;
        private j12.e.a g;
        private j12.e.f h;
        private j12.e.AbstractC0390e i;
        private j12.e.c j;
        private List<j12.e.d> k;
        private Integer l;

        @Override // defpackage.j12.e.b
        public j12.e a() {
            String str = "";
            if (this.a == null) {
                str = " generator";
            }
            if (this.b == null) {
                str = str + " identifier";
            }
            if (this.d == null) {
                str = str + " startedAt";
            }
            if (this.f == null) {
                str = str + " crashed";
            }
            if (this.g == null) {
                str = str + " app";
            }
            if (this.l == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new s10(this.a, this.b, this.c, this.d.longValue(), this.e, this.f.booleanValue(), this.g, this.h, this.i, this.j, this.k, this.l.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.e.b
        public j12.e.b b(j12.e.a aVar) {
            if (aVar != null) {
                this.g = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // defpackage.j12.e.b
        public j12.e.b c(String str) {
            this.c = str;
            return this;
        }

        @Override // defpackage.j12.e.b
        public j12.e.b d(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.j12.e.b
        public j12.e.b e(j12.e.c cVar) {
            this.j = cVar;
            return this;
        }

        @Override // defpackage.j12.e.b
        public j12.e.b f(Long l) {
            this.e = l;
            return this;
        }

        @Override // defpackage.j12.e.b
        public j12.e.b g(List<j12.e.d> list) {
            this.k = list;
            return this;
        }

        @Override // defpackage.j12.e.b
        public j12.e.b h(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        @Override // defpackage.j12.e.b
        public j12.e.b i(int i) {
            this.l = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.j12.e.b
        public j12.e.b j(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // defpackage.j12.e.b
        public j12.e.b l(j12.e.AbstractC0390e abstractC0390e) {
            this.i = abstractC0390e;
            return this;
        }

        @Override // defpackage.j12.e.b
        public j12.e.b m(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.j12.e.b
        public j12.e.b n(j12.e.f fVar) {
            this.h = fVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(j12.e eVar) {
            this.a = eVar.g();
            this.b = eVar.i();
            this.c = eVar.c();
            this.d = Long.valueOf(eVar.l());
            this.e = eVar.e();
            this.f = Boolean.valueOf(eVar.n());
            this.g = eVar.b();
            this.h = eVar.m();
            this.i = eVar.k();
            this.j = eVar.d();
            this.k = eVar.f();
            this.l = Integer.valueOf(eVar.h());
        }
    }

    @Override // defpackage.j12.e
    @NonNull
    public j12.e.a b() {
        return this.g;
    }

    @Override // defpackage.j12.e
    public String c() {
        return this.c;
    }

    @Override // defpackage.j12.e
    public j12.e.c d() {
        return this.j;
    }

    @Override // defpackage.j12.e
    public Long e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l;
        j12.e.f fVar;
        j12.e.AbstractC0390e abstractC0390e;
        j12.e.c cVar;
        List<j12.e.d> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j12.e)) {
            return false;
        }
        j12.e eVar = (j12.e) obj;
        if (this.a.equals(eVar.g()) && this.b.equals(eVar.i()) && ((str = this.c) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.d == eVar.l() && ((l = this.e) != null ? l.equals(eVar.e()) : eVar.e() == null) && this.f == eVar.n() && this.g.equals(eVar.b()) && ((fVar = this.h) != null ? fVar.equals(eVar.m()) : eVar.m() == null) && ((abstractC0390e = this.i) != null ? abstractC0390e.equals(eVar.k()) : eVar.k() == null) && ((cVar = this.j) != null ? cVar.equals(eVar.d()) : eVar.d() == null) && ((list = this.k) != null ? list.equals(eVar.f()) : eVar.f() == null) && this.l == eVar.h()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.j12.e
    public List<j12.e.d> f() {
        return this.k;
    }

    @Override // defpackage.j12.e
    @NonNull
    public String g() {
        return this.a;
    }

    @Override // defpackage.j12.e
    public int h() {
        return this.l;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int i;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.d;
        int i3 = (((hashCode6 ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        Long l = this.e;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        if (this.f) {
            i = 1231;
        } else {
            i = 1237;
        }
        int hashCode7 = (((i4 ^ i) * 1000003) ^ this.g.hashCode()) * 1000003;
        j12.e.f fVar = this.h;
        if (fVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = fVar.hashCode();
        }
        int i5 = (hashCode7 ^ hashCode3) * 1000003;
        j12.e.AbstractC0390e abstractC0390e = this.i;
        if (abstractC0390e == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = abstractC0390e.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        j12.e.c cVar = this.j;
        if (cVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = cVar.hashCode();
        }
        int i7 = (i6 ^ hashCode5) * 1000003;
        List<j12.e.d> list = this.k;
        if (list != null) {
            i2 = list.hashCode();
        }
        return ((i7 ^ i2) * 1000003) ^ this.l;
    }

    @Override // defpackage.j12.e
    @NonNull
    public String i() {
        return this.b;
    }

    @Override // defpackage.j12.e
    public j12.e.AbstractC0390e k() {
        return this.i;
    }

    @Override // defpackage.j12.e
    public long l() {
        return this.d;
    }

    @Override // defpackage.j12.e
    public j12.e.f m() {
        return this.h;
    }

    @Override // defpackage.j12.e
    public boolean n() {
        return this.f;
    }

    @Override // defpackage.j12.e
    public j12.e.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.a + ", identifier=" + this.b + ", appQualitySessionId=" + this.c + ", startedAt=" + this.d + ", endedAt=" + this.e + ", crashed=" + this.f + ", app=" + this.g + ", user=" + this.h + ", os=" + this.i + ", device=" + this.j + ", events=" + this.k + ", generatorType=" + this.l + "}";
    }

    private s10(String str, String str2, String str3, long j, Long l, boolean z, j12.e.a aVar, j12.e.f fVar, j12.e.AbstractC0390e abstractC0390e, j12.e.c cVar, List<j12.e.d> list, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = l;
        this.f = z;
        this.g = aVar;
        this.h = fVar;
        this.i = abstractC0390e;
        this.j = cVar;
        this.k = list;
        this.l = i;
    }
}
