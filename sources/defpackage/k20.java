package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
/* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
/* renamed from: k20  reason: default package */
/* loaded from: classes2.dex */
final class k20 extends j12.e.AbstractC0390e {
    private final int a;
    private final String b;
    private final String c;
    private final boolean d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_OperatingSystem.java */
    /* renamed from: k20$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.e.AbstractC0390e.a {
        private Integer a;
        private String b;
        private String c;
        private Boolean d;

        @Override // defpackage.j12.e.AbstractC0390e.a
        public j12.e.AbstractC0390e a() {
            String str = "";
            if (this.a == null) {
                str = " platform";
            }
            if (this.b == null) {
                str = str + " version";
            }
            if (this.c == null) {
                str = str + " buildVersion";
            }
            if (this.d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new k20(this.a.intValue(), this.b, this.c, this.d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.e.AbstractC0390e.a
        public j12.e.AbstractC0390e.a b(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // defpackage.j12.e.AbstractC0390e.a
        public j12.e.AbstractC0390e.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.j12.e.AbstractC0390e.a
        public j12.e.AbstractC0390e.a d(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        @Override // defpackage.j12.e.AbstractC0390e.a
        public j12.e.AbstractC0390e.a e(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    @Override // defpackage.j12.e.AbstractC0390e
    @NonNull
    public String b() {
        return this.c;
    }

    @Override // defpackage.j12.e.AbstractC0390e
    public int c() {
        return this.a;
    }

    @Override // defpackage.j12.e.AbstractC0390e
    @NonNull
    public String d() {
        return this.b;
    }

    @Override // defpackage.j12.e.AbstractC0390e
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j12.e.AbstractC0390e)) {
            return false;
        }
        j12.e.AbstractC0390e abstractC0390e = (j12.e.AbstractC0390e) obj;
        if (this.a == abstractC0390e.c() && this.b.equals(abstractC0390e.d()) && this.c.equals(abstractC0390e.b()) && this.d == abstractC0390e.e()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.a + ", version=" + this.b + ", buildVersion=" + this.c + ", jailbroken=" + this.d + "}";
    }

    private k20(int i, String str, String str2, boolean z) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }
}
