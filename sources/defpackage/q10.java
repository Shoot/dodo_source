package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
import java.util.List;
/* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
/* renamed from: q10  reason: default package */
/* loaded from: classes2.dex */
final class q10 extends j12.d {
    private final List<j12.d.b> a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_FilesPayload.java */
    /* renamed from: q10$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.d.a {
        private List<j12.d.b> a;
        private String b;

        @Override // defpackage.j12.d.a
        public j12.d a() {
            String str = "";
            if (this.a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new q10(this.a, this.b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.d.a
        public j12.d.a b(List<j12.d.b> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        @Override // defpackage.j12.d.a
        public j12.d.a c(String str) {
            this.b = str;
            return this;
        }
    }

    @Override // defpackage.j12.d
    @NonNull
    public List<j12.d.b> b() {
        return this.a;
    }

    @Override // defpackage.j12.d
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j12.d)) {
            return false;
        }
        j12.d dVar = (j12.d) obj;
        if (this.a.equals(dVar.b())) {
            String str = this.b;
            if (str == null) {
                if (dVar.c() == null) {
                    return true;
                }
            } else if (str.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public String toString() {
        return "FilesPayload{files=" + this.a + ", orgId=" + this.b + "}";
    }

    private q10(List<j12.d.b> list, String str) {
        this.a = list;
        this.b = str;
    }
}
