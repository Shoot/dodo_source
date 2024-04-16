package defpackage;

import androidx.annotation.NonNull;
import defpackage.yy7;
import defpackage.zy7;
/* compiled from: AutoValue_PersistedInstallationEntry.java */
/* renamed from: z20  reason: default package */
/* loaded from: classes2.dex */
final class z20 extends zy7 {
    private final String b;
    private final yy7.a c;
    private final String d;
    private final String e;
    private final long f;
    private final long g;
    private final String h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_PersistedInstallationEntry.java */
    /* renamed from: z20$b */
    /* loaded from: classes2.dex */
    public static final class b extends zy7.a {
        private String a;
        private yy7.a b;
        private String c;
        private String d;
        private Long e;
        private Long f;
        private String g;

        @Override // defpackage.zy7.a
        public zy7 a() {
            String str = "";
            if (this.b == null) {
                str = " registrationStatus";
            }
            if (this.e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new z20(this.a, this.b, this.c, this.d, this.e.longValue(), this.f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.zy7.a
        public zy7.a b(String str) {
            this.c = str;
            return this;
        }

        @Override // defpackage.zy7.a
        public zy7.a c(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.zy7.a
        public zy7.a d(String str) {
            this.a = str;
            return this;
        }

        @Override // defpackage.zy7.a
        public zy7.a e(String str) {
            this.g = str;
            return this;
        }

        @Override // defpackage.zy7.a
        public zy7.a f(String str) {
            this.d = str;
            return this;
        }

        @Override // defpackage.zy7.a
        public zy7.a g(yy7.a aVar) {
            if (aVar != null) {
                this.b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        @Override // defpackage.zy7.a
        public zy7.a h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(zy7 zy7Var) {
            this.a = zy7Var.d();
            this.b = zy7Var.g();
            this.c = zy7Var.b();
            this.d = zy7Var.f();
            this.e = Long.valueOf(zy7Var.c());
            this.f = Long.valueOf(zy7Var.h());
            this.g = zy7Var.e();
        }
    }

    @Override // defpackage.zy7
    public String b() {
        return this.d;
    }

    @Override // defpackage.zy7
    public long c() {
        return this.f;
    }

    @Override // defpackage.zy7
    public String d() {
        return this.b;
    }

    @Override // defpackage.zy7
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zy7)) {
            return false;
        }
        zy7 zy7Var = (zy7) obj;
        String str3 = this.b;
        if (str3 != null ? str3.equals(zy7Var.d()) : zy7Var.d() == null) {
            if (this.c.equals(zy7Var.g()) && ((str = this.d) != null ? str.equals(zy7Var.b()) : zy7Var.b() == null) && ((str2 = this.e) != null ? str2.equals(zy7Var.f()) : zy7Var.f() == null) && this.f == zy7Var.c() && this.g == zy7Var.h()) {
                String str4 = this.h;
                if (str4 == null) {
                    if (zy7Var.e() == null) {
                        return true;
                    }
                } else if (str4.equals(zy7Var.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.zy7
    public String f() {
        return this.e;
    }

    @Override // defpackage.zy7
    @NonNull
    public yy7.a g() {
        return this.c;
    }

    @Override // defpackage.zy7
    public long h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (hashCode4 ^ hashCode2) * 1000003;
        String str3 = this.e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j = this.f;
        long j2 = this.g;
        int i3 = (((((i2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i3 ^ i;
    }

    @Override // defpackage.zy7
    public zy7.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.b + ", registrationStatus=" + this.c + ", authToken=" + this.d + ", refreshToken=" + this.e + ", expiresInSecs=" + this.f + ", tokenCreationEpochInSecs=" + this.g + ", fisError=" + this.h + "}";
    }

    private z20(String str, yy7.a aVar, String str2, String str3, long j, long j2, String str4) {
        this.b = str;
        this.c = aVar;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = j2;
        this.h = str4;
    }
}
