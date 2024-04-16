package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
/* renamed from: z10  reason: default package */
/* loaded from: classes2.dex */
final class z10 extends j12.e.d.a.b.AbstractC0377a {
    private final long a;
    private final long b;
    private final String c;
    private final String d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage.java */
    /* renamed from: z10$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.e.d.a.b.AbstractC0377a.AbstractC0378a {
        private Long a;
        private Long b;
        private String c;
        private String d;

        @Override // defpackage.j12.e.d.a.b.AbstractC0377a.AbstractC0378a
        public j12.e.d.a.b.AbstractC0377a a() {
            String str = "";
            if (this.a == null) {
                str = " baseAddress";
            }
            if (this.b == null) {
                str = str + " size";
            }
            if (this.c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new z10(this.a.longValue(), this.b.longValue(), this.c, this.d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.e.d.a.b.AbstractC0377a.AbstractC0378a
        public j12.e.d.a.b.AbstractC0377a.AbstractC0378a b(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.j12.e.d.a.b.AbstractC0377a.AbstractC0378a
        public j12.e.d.a.b.AbstractC0377a.AbstractC0378a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // defpackage.j12.e.d.a.b.AbstractC0377a.AbstractC0378a
        public j12.e.d.a.b.AbstractC0377a.AbstractC0378a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.j12.e.d.a.b.AbstractC0377a.AbstractC0378a
        public j12.e.d.a.b.AbstractC0377a.AbstractC0378a e(String str) {
            this.d = str;
            return this;
        }
    }

    @Override // defpackage.j12.e.d.a.b.AbstractC0377a
    @NonNull
    public long b() {
        return this.a;
    }

    @Override // defpackage.j12.e.d.a.b.AbstractC0377a
    @NonNull
    public String c() {
        return this.c;
    }

    @Override // defpackage.j12.e.d.a.b.AbstractC0377a
    public long d() {
        return this.b;
    }

    @Override // defpackage.j12.e.d.a.b.AbstractC0377a
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j12.e.d.a.b.AbstractC0377a)) {
            return false;
        }
        j12.e.d.a.b.AbstractC0377a abstractC0377a = (j12.e.d.a.b.AbstractC0377a) obj;
        if (this.a == abstractC0377a.b() && this.b == abstractC0377a.d() && this.c.equals(abstractC0377a.c())) {
            String str = this.d;
            if (str == null) {
                if (abstractC0377a.e() == null) {
                    return true;
                }
            } else if (str.equals(abstractC0377a.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        long j = this.a;
        long j2 = this.b;
        int hashCode2 = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.a + ", size=" + this.b + ", name=" + this.c + ", uuid=" + this.d + "}";
    }

    private z10(long j, long j2, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }
}
