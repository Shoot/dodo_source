package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
/* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
/* renamed from: l20  reason: default package */
/* loaded from: classes2.dex */
final class l20 extends j12.e.f {
    private final String a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_User.java */
    /* renamed from: l20$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.e.f.a {
        private String a;

        @Override // defpackage.j12.e.f.a
        public j12.e.f a() {
            String str = "";
            if (this.a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new l20(this.a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.e.f.a
        public j12.e.f.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    @Override // defpackage.j12.e.f
    @NonNull
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j12.e.f) {
            return this.a.equals(((j12.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.a + "}";
    }

    private l20(String str) {
        this.a = str;
    }
}
