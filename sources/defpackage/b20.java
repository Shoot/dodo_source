package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
/* renamed from: b20  reason: default package */
/* loaded from: classes2.dex */
final class b20 extends j12.e.d.a.b.AbstractC0381d {
    private final String a;
    private final String b;
    private final long c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Signal.java */
    /* renamed from: b20$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.e.d.a.b.AbstractC0381d.AbstractC0382a {
        private String a;
        private String b;
        private Long c;

        @Override // defpackage.j12.e.d.a.b.AbstractC0381d.AbstractC0382a
        public j12.e.d.a.b.AbstractC0381d a() {
            String str = "";
            if (this.a == null) {
                str = " name";
            }
            if (this.b == null) {
                str = str + " code";
            }
            if (this.c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new b20(this.a, this.b, this.c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.e.d.a.b.AbstractC0381d.AbstractC0382a
        public j12.e.d.a.b.AbstractC0381d.AbstractC0382a b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.j12.e.d.a.b.AbstractC0381d.AbstractC0382a
        public j12.e.d.a.b.AbstractC0381d.AbstractC0382a c(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        @Override // defpackage.j12.e.d.a.b.AbstractC0381d.AbstractC0382a
        public j12.e.d.a.b.AbstractC0381d.AbstractC0382a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    @Override // defpackage.j12.e.d.a.b.AbstractC0381d
    @NonNull
    public long b() {
        return this.c;
    }

    @Override // defpackage.j12.e.d.a.b.AbstractC0381d
    @NonNull
    public String c() {
        return this.b;
    }

    @Override // defpackage.j12.e.d.a.b.AbstractC0381d
    @NonNull
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j12.e.d.a.b.AbstractC0381d)) {
            return false;
        }
        j12.e.d.a.b.AbstractC0381d abstractC0381d = (j12.e.d.a.b.AbstractC0381d) obj;
        if (this.a.equals(abstractC0381d.d()) && this.b.equals(abstractC0381d.c()) && this.c == abstractC0381d.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.a + ", code=" + this.b + ", address=" + this.c + "}";
    }

    private b20(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }
}
