package defpackage;

import androidx.annotation.NonNull;
import defpackage.in9;
/* compiled from: AutoValue_RolloutAssignment.java */
/* renamed from: b30  reason: default package */
/* loaded from: classes2.dex */
final class b30 extends in9 {
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final long f;

    /* compiled from: AutoValue_RolloutAssignment.java */
    /* renamed from: b30$b */
    /* loaded from: classes2.dex */
    static final class b extends in9.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private long e;
        private byte f;

        @Override // defpackage.in9.a
        public in9 a() {
            if (this.f == 1 && this.a != null && this.b != null && this.c != null && this.d != null) {
                return new b30(this.a, this.b, this.c, this.d, this.e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" rolloutId");
            }
            if (this.b == null) {
                sb.append(" variantId");
            }
            if (this.c == null) {
                sb.append(" parameterKey");
            }
            if (this.d == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // defpackage.in9.a
        public in9.a b(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null parameterKey");
        }

        @Override // defpackage.in9.a
        public in9.a c(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null parameterValue");
        }

        @Override // defpackage.in9.a
        public in9.a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null rolloutId");
        }

        @Override // defpackage.in9.a
        public in9.a e(long j) {
            this.e = j;
            this.f = (byte) (this.f | 1);
            return this;
        }

        @Override // defpackage.in9.a
        public in9.a f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null variantId");
        }
    }

    @Override // defpackage.in9
    @NonNull
    public String b() {
        return this.d;
    }

    @Override // defpackage.in9
    @NonNull
    public String c() {
        return this.e;
    }

    @Override // defpackage.in9
    @NonNull
    public String d() {
        return this.b;
    }

    @Override // defpackage.in9
    public long e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof in9)) {
            return false;
        }
        in9 in9Var = (in9) obj;
        if (this.b.equals(in9Var.d()) && this.c.equals(in9Var.f()) && this.d.equals(in9Var.b()) && this.e.equals(in9Var.c()) && this.f == in9Var.e()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.in9
    @NonNull
    public String f() {
        return this.c;
    }

    public int hashCode() {
        long j = this.f;
        return ((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.b + ", variantId=" + this.c + ", parameterKey=" + this.d + ", parameterValue=" + this.e + ", templateVersion=" + this.f + "}";
    }

    private b30(String str, String str2, String str3, String str4, long j) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j;
    }
}
