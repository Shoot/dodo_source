package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
/* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
/* renamed from: p10  reason: default package */
/* loaded from: classes2.dex */
final class p10 extends j12.c {
    private final String a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_CustomAttribute.java */
    /* renamed from: p10$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.c.a {
        private String a;
        private String b;

        @Override // defpackage.j12.c.a
        public j12.c a() {
            String str = "";
            if (this.a == null) {
                str = " key";
            }
            if (this.b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new p10(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.c.a
        public j12.c.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        @Override // defpackage.j12.c.a
        public j12.c.a c(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    @Override // defpackage.j12.c
    @NonNull
    public String b() {
        return this.a;
    }

    @Override // defpackage.j12.c
    @NonNull
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j12.c)) {
            return false;
        }
        j12.c cVar = (j12.c) obj;
        if (this.a.equals(cVar.b()) && this.b.equals(cVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.a + ", value=" + this.b + "}";
    }

    private p10(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
