package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
/* renamed from: g20  reason: default package */
/* loaded from: classes2.dex */
final class g20 extends j12.e.d.AbstractC0388d {
    private final String a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Log.java */
    /* renamed from: g20$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.e.d.AbstractC0388d.a {
        private String a;

        @Override // defpackage.j12.e.d.AbstractC0388d.a
        public j12.e.d.AbstractC0388d a() {
            String str = "";
            if (this.a == null) {
                str = " content";
            }
            if (str.isEmpty()) {
                return new g20(this.a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.e.d.AbstractC0388d.a
        public j12.e.d.AbstractC0388d.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    @Override // defpackage.j12.e.d.AbstractC0388d
    @NonNull
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j12.e.d.AbstractC0388d) {
            return this.a.equals(((j12.e.d.AbstractC0388d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.a + "}";
    }

    private g20(String str) {
        this.a = str;
    }
}
