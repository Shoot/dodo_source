package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
/* renamed from: d20  reason: default package */
/* loaded from: classes2.dex */
final class d20 extends j12.e.d.a.b.AbstractC0383e.AbstractC0385b {
    private final long a;
    private final String b;
    private final String c;
    private final long d;
    private final int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame.java */
    /* renamed from: d20$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.e.d.a.b.AbstractC0383e.AbstractC0385b.AbstractC0386a {
        private Long a;
        private String b;
        private String c;
        private Long d;
        private Integer e;

        @Override // defpackage.j12.e.d.a.b.AbstractC0383e.AbstractC0385b.AbstractC0386a
        public j12.e.d.a.b.AbstractC0383e.AbstractC0385b a() {
            String str = "";
            if (this.a == null) {
                str = " pc";
            }
            if (this.b == null) {
                str = str + " symbol";
            }
            if (this.d == null) {
                str = str + " offset";
            }
            if (this.e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new d20(this.a.longValue(), this.b, this.c, this.d.longValue(), this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.e.d.a.b.AbstractC0383e.AbstractC0385b.AbstractC0386a
        public j12.e.d.a.b.AbstractC0383e.AbstractC0385b.AbstractC0386a b(String str) {
            this.c = str;
            return this;
        }

        @Override // defpackage.j12.e.d.a.b.AbstractC0383e.AbstractC0385b.AbstractC0386a
        public j12.e.d.a.b.AbstractC0383e.AbstractC0385b.AbstractC0386a c(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.j12.e.d.a.b.AbstractC0383e.AbstractC0385b.AbstractC0386a
        public j12.e.d.a.b.AbstractC0383e.AbstractC0385b.AbstractC0386a d(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.j12.e.d.a.b.AbstractC0383e.AbstractC0385b.AbstractC0386a
        public j12.e.d.a.b.AbstractC0383e.AbstractC0385b.AbstractC0386a e(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.j12.e.d.a.b.AbstractC0383e.AbstractC0385b.AbstractC0386a
        public j12.e.d.a.b.AbstractC0383e.AbstractC0385b.AbstractC0386a f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    @Override // defpackage.j12.e.d.a.b.AbstractC0383e.AbstractC0385b
    public String b() {
        return this.c;
    }

    @Override // defpackage.j12.e.d.a.b.AbstractC0383e.AbstractC0385b
    public int c() {
        return this.e;
    }

    @Override // defpackage.j12.e.d.a.b.AbstractC0383e.AbstractC0385b
    public long d() {
        return this.d;
    }

    @Override // defpackage.j12.e.d.a.b.AbstractC0383e.AbstractC0385b
    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j12.e.d.a.b.AbstractC0383e.AbstractC0385b)) {
            return false;
        }
        j12.e.d.a.b.AbstractC0383e.AbstractC0385b abstractC0385b = (j12.e.d.a.b.AbstractC0383e.AbstractC0385b) obj;
        if (this.a == abstractC0385b.e() && this.b.equals(abstractC0385b.f()) && ((str = this.c) != null ? str.equals(abstractC0385b.b()) : abstractC0385b.b() == null) && this.d == abstractC0385b.d() && this.e == abstractC0385b.c()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.j12.e.d.a.b.AbstractC0383e.AbstractC0385b
    @NonNull
    public String f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        long j = this.a;
        int hashCode2 = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j2 = this.d;
        return this.e ^ ((((hashCode2 ^ hashCode) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public String toString() {
        return "Frame{pc=" + this.a + ", symbol=" + this.b + ", file=" + this.c + ", offset=" + this.d + ", importance=" + this.e + "}";
    }

    private d20(long j, String str, String str2, long j2, int i) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }
}
