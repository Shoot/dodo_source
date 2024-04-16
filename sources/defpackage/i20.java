package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.java */
/* renamed from: i20  reason: default package */
/* loaded from: classes2.dex */
final class i20 extends j12.e.d.AbstractC0389e.b {
    private final String a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment_RolloutVariant.java */
    /* renamed from: i20$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.e.d.AbstractC0389e.b.a {
        private String a;
        private String b;

        @Override // defpackage.j12.e.d.AbstractC0389e.b.a
        public j12.e.d.AbstractC0389e.b a() {
            String str = "";
            if (this.a == null) {
                str = " rolloutId";
            }
            if (this.b == null) {
                str = str + " variantId";
            }
            if (str.isEmpty()) {
                return new i20(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.e.d.AbstractC0389e.b.a
        public j12.e.d.AbstractC0389e.b.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null rolloutId");
        }

        @Override // defpackage.j12.e.d.AbstractC0389e.b.a
        public j12.e.d.AbstractC0389e.b.a c(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null variantId");
        }
    }

    @Override // defpackage.j12.e.d.AbstractC0389e.b
    @NonNull
    public String b() {
        return this.a;
    }

    @Override // defpackage.j12.e.d.AbstractC0389e.b
    @NonNull
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j12.e.d.AbstractC0389e.b)) {
            return false;
        }
        j12.e.d.AbstractC0389e.b bVar = (j12.e.d.AbstractC0389e.b) obj;
        if (this.a.equals(bVar.b()) && this.b.equals(bVar.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.a + ", variantId=" + this.b + "}";
    }

    private i20(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
