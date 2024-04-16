package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.java */
/* renamed from: h20  reason: default package */
/* loaded from: classes2.dex */
final class h20 extends j12.e.d.AbstractC0389e {
    private final j12.e.d.AbstractC0389e.b a;
    private final String b;
    private final String c;
    private final long d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.java */
    /* renamed from: h20$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.e.d.AbstractC0389e.a {
        private j12.e.d.AbstractC0389e.b a;
        private String b;
        private String c;
        private Long d;

        @Override // defpackage.j12.e.d.AbstractC0389e.a
        public j12.e.d.AbstractC0389e a() {
            String str = "";
            if (this.a == null) {
                str = " rolloutVariant";
            }
            if (this.b == null) {
                str = str + " parameterKey";
            }
            if (this.c == null) {
                str = str + " parameterValue";
            }
            if (this.d == null) {
                str = str + " templateVersion";
            }
            if (str.isEmpty()) {
                return new h20(this.a, this.b, this.c, this.d.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.e.d.AbstractC0389e.a
        public j12.e.d.AbstractC0389e.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null parameterKey");
        }

        @Override // defpackage.j12.e.d.AbstractC0389e.a
        public j12.e.d.AbstractC0389e.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null parameterValue");
        }

        @Override // defpackage.j12.e.d.AbstractC0389e.a
        public j12.e.d.AbstractC0389e.a d(j12.e.d.AbstractC0389e.b bVar) {
            if (bVar != null) {
                this.a = bVar;
                return this;
            }
            throw new NullPointerException("Null rolloutVariant");
        }

        @Override // defpackage.j12.e.d.AbstractC0389e.a
        public j12.e.d.AbstractC0389e.a e(long j) {
            this.d = Long.valueOf(j);
            return this;
        }
    }

    @Override // defpackage.j12.e.d.AbstractC0389e
    @NonNull
    public String b() {
        return this.b;
    }

    @Override // defpackage.j12.e.d.AbstractC0389e
    @NonNull
    public String c() {
        return this.c;
    }

    @Override // defpackage.j12.e.d.AbstractC0389e
    @NonNull
    public j12.e.d.AbstractC0389e.b d() {
        return this.a;
    }

    @Override // defpackage.j12.e.d.AbstractC0389e
    @NonNull
    public long e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j12.e.d.AbstractC0389e)) {
            return false;
        }
        j12.e.d.AbstractC0389e abstractC0389e = (j12.e.d.AbstractC0389e) obj;
        if (this.a.equals(abstractC0389e.d()) && this.b.equals(abstractC0389e.b()) && this.c.equals(abstractC0389e.c()) && this.d == abstractC0389e.e()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.d;
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.a + ", parameterKey=" + this.b + ", parameterValue=" + this.c + ", templateVersion=" + this.d + "}";
    }

    private h20(j12.e.d.AbstractC0389e.b bVar, String str, String str2, long j) {
        this.a = bVar;
        this.b = str;
        this.c = str2;
        this.d = j;
    }
}
