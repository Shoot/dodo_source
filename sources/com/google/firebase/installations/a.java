package com.google.firebase.installations;

import androidx.annotation.NonNull;
import com.google.firebase.installations.f;
/* compiled from: AutoValue_InstallationTokenResult.java */
/* loaded from: classes2.dex */
final class a extends f {
    private final String a;
    private final long b;
    private final long c;

    /* compiled from: AutoValue_InstallationTokenResult.java */
    /* loaded from: classes2.dex */
    static final class b extends f.a {
        private String a;
        private Long b;
        private Long c;

        @Override // com.google.firebase.installations.f.a
        public f a() {
            String str = "";
            if (this.a == null) {
                str = " token";
            }
            if (this.b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b.longValue(), this.c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.f.a
        public f.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }

        @Override // com.google.firebase.installations.f.a
        public f.a c(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.f.a
        public f.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.firebase.installations.f
    @NonNull
    public String b() {
        return this.a;
    }

    @Override // com.google.firebase.installations.f
    @NonNull
    public long c() {
        return this.c;
    }

    @Override // com.google.firebase.installations.f
    @NonNull
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.a.equals(fVar.b()) && this.b == fVar.d() && this.c == fVar.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.b;
        long j2 = this.c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", tokenCreationTimestamp=" + this.c + "}";
    }

    private a(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }
}
