package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
import java.util.List;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutsState.java */
/* renamed from: j20  reason: default package */
/* loaded from: classes2.dex */
final class j20 extends j12.e.d.f {
    private final List<j12.e.d.AbstractC0389e> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_RolloutsState.java */
    /* renamed from: j20$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.e.d.f.a {
        private List<j12.e.d.AbstractC0389e> a;

        @Override // defpackage.j12.e.d.f.a
        public j12.e.d.f a() {
            String str = "";
            if (this.a == null) {
                str = " rolloutAssignments";
            }
            if (str.isEmpty()) {
                return new j20(this.a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.e.d.f.a
        public j12.e.d.f.a b(List<j12.e.d.AbstractC0389e> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null rolloutAssignments");
        }
    }

    @Override // defpackage.j12.e.d.f
    @NonNull
    public List<j12.e.d.AbstractC0389e> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j12.e.d.f) {
            return this.a.equals(((j12.e.d.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.a + "}";
    }

    private j20(List<j12.e.d.AbstractC0389e> list) {
        this.a = list;
    }
}
