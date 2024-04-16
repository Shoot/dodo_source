package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
/* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
/* renamed from: o10  reason: default package */
/* loaded from: classes2.dex */
final class o10 extends j12.a.AbstractC0373a {
    private final String a;
    private final String b;
    private final String c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch.java */
    /* renamed from: o10$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.a.AbstractC0373a.AbstractC0374a {
        private String a;
        private String b;
        private String c;

        @Override // defpackage.j12.a.AbstractC0373a.AbstractC0374a
        public j12.a.AbstractC0373a a() {
            String str = "";
            if (this.a == null) {
                str = " arch";
            }
            if (this.b == null) {
                str = str + " libraryName";
            }
            if (this.c == null) {
                str = str + " buildId";
            }
            if (str.isEmpty()) {
                return new o10(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.a.AbstractC0373a.AbstractC0374a
        public j12.a.AbstractC0373a.AbstractC0374a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null arch");
        }

        @Override // defpackage.j12.a.AbstractC0373a.AbstractC0374a
        public j12.a.AbstractC0373a.AbstractC0374a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null buildId");
        }

        @Override // defpackage.j12.a.AbstractC0373a.AbstractC0374a
        public j12.a.AbstractC0373a.AbstractC0374a d(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null libraryName");
        }
    }

    @Override // defpackage.j12.a.AbstractC0373a
    @NonNull
    public String b() {
        return this.a;
    }

    @Override // defpackage.j12.a.AbstractC0373a
    @NonNull
    public String c() {
        return this.c;
    }

    @Override // defpackage.j12.a.AbstractC0373a
    @NonNull
    public String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j12.a.AbstractC0373a)) {
            return false;
        }
        j12.a.AbstractC0373a abstractC0373a = (j12.a.AbstractC0373a) obj;
        if (this.a.equals(abstractC0373a.b()) && this.b.equals(abstractC0373a.d()) && this.c.equals(abstractC0373a.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.a + ", libraryName=" + this.b + ", buildId=" + this.c + "}";
    }

    private o10(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
