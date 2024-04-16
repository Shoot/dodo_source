package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
/* renamed from: w10  reason: default package */
/* loaded from: classes2.dex */
final class w10 extends j12.e.d {
    private final long a;
    private final String b;
    private final j12.e.d.a c;
    private final j12.e.d.c d;
    private final j12.e.d.AbstractC0388d e;
    private final j12.e.d.f f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event.java */
    /* renamed from: w10$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.e.d.b {
        private Long a;
        private String b;
        private j12.e.d.a c;
        private j12.e.d.c d;
        private j12.e.d.AbstractC0388d e;
        private j12.e.d.f f;

        @Override // defpackage.j12.e.d.b
        public j12.e.d a() {
            String str = "";
            if (this.a == null) {
                str = " timestamp";
            }
            if (this.b == null) {
                str = str + " type";
            }
            if (this.c == null) {
                str = str + " app";
            }
            if (this.d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new w10(this.a.longValue(), this.b, this.c, this.d, this.e, this.f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.e.d.b
        public j12.e.d.b b(j12.e.d.a aVar) {
            if (aVar != null) {
                this.c = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        @Override // defpackage.j12.e.d.b
        public j12.e.d.b c(j12.e.d.c cVar) {
            if (cVar != null) {
                this.d = cVar;
                return this;
            }
            throw new NullPointerException("Null device");
        }

        @Override // defpackage.j12.e.d.b
        public j12.e.d.b d(j12.e.d.AbstractC0388d abstractC0388d) {
            this.e = abstractC0388d;
            return this;
        }

        @Override // defpackage.j12.e.d.b
        public j12.e.d.b e(j12.e.d.f fVar) {
            this.f = fVar;
            return this;
        }

        @Override // defpackage.j12.e.d.b
        public j12.e.d.b f(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.j12.e.d.b
        public j12.e.d.b g(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(j12.e.d dVar) {
            this.a = Long.valueOf(dVar.f());
            this.b = dVar.g();
            this.c = dVar.b();
            this.d = dVar.c();
            this.e = dVar.d();
            this.f = dVar.e();
        }
    }

    @Override // defpackage.j12.e.d
    @NonNull
    public j12.e.d.a b() {
        return this.c;
    }

    @Override // defpackage.j12.e.d
    @NonNull
    public j12.e.d.c c() {
        return this.d;
    }

    @Override // defpackage.j12.e.d
    public j12.e.d.AbstractC0388d d() {
        return this.e;
    }

    @Override // defpackage.j12.e.d
    public j12.e.d.f e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        j12.e.d.AbstractC0388d abstractC0388d;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j12.e.d)) {
            return false;
        }
        j12.e.d dVar = (j12.e.d) obj;
        if (this.a == dVar.f() && this.b.equals(dVar.g()) && this.c.equals(dVar.b()) && this.d.equals(dVar.c()) && ((abstractC0388d = this.e) != null ? abstractC0388d.equals(dVar.d()) : dVar.d() == null)) {
            j12.e.d.f fVar = this.f;
            if (fVar == null) {
                if (dVar.e() == null) {
                    return true;
                }
            } else if (fVar.equals(dVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.j12.e.d
    public long f() {
        return this.a;
    }

    @Override // defpackage.j12.e.d
    @NonNull
    public String g() {
        return this.b;
    }

    @Override // defpackage.j12.e.d
    public j12.e.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode;
        long j = this.a;
        int hashCode2 = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        j12.e.d.AbstractC0388d abstractC0388d = this.e;
        int i = 0;
        if (abstractC0388d == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC0388d.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        j12.e.d.f fVar = this.f;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "Event{timestamp=" + this.a + ", type=" + this.b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + ", rollouts=" + this.f + "}";
    }

    private w10(long j, String str, j12.e.d.a aVar, j12.e.d.c cVar, j12.e.d.AbstractC0388d abstractC0388d, j12.e.d.f fVar) {
        this.a = j;
        this.b = str;
        this.c = aVar;
        this.d = cVar;
        this.e = abstractC0388d;
        this.f = fVar;
    }
}
