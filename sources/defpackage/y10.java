package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
import java.util.List;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
/* renamed from: y10  reason: default package */
/* loaded from: classes2.dex */
final class y10 extends j12.e.d.a.b {
    private final List<j12.e.d.a.b.AbstractC0383e> a;
    private final j12.e.d.a.b.c b;
    private final j12.a c;
    private final j12.e.d.a.b.AbstractC0381d d;
    private final List<j12.e.d.a.b.AbstractC0377a> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application_Execution.java */
    /* renamed from: y10$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.e.d.a.b.AbstractC0379b {
        private List<j12.e.d.a.b.AbstractC0383e> a;
        private j12.e.d.a.b.c b;
        private j12.a c;
        private j12.e.d.a.b.AbstractC0381d d;
        private List<j12.e.d.a.b.AbstractC0377a> e;

        @Override // defpackage.j12.e.d.a.b.AbstractC0379b
        public j12.e.d.a.b a() {
            String str = "";
            if (this.d == null) {
                str = " signal";
            }
            if (this.e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new y10(this.a, this.b, this.c, this.d, this.e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.e.d.a.b.AbstractC0379b
        public j12.e.d.a.b.AbstractC0379b b(j12.a aVar) {
            this.c = aVar;
            return this;
        }

        @Override // defpackage.j12.e.d.a.b.AbstractC0379b
        public j12.e.d.a.b.AbstractC0379b c(List<j12.e.d.a.b.AbstractC0377a> list) {
            if (list != null) {
                this.e = list;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        @Override // defpackage.j12.e.d.a.b.AbstractC0379b
        public j12.e.d.a.b.AbstractC0379b d(j12.e.d.a.b.c cVar) {
            this.b = cVar;
            return this;
        }

        @Override // defpackage.j12.e.d.a.b.AbstractC0379b
        public j12.e.d.a.b.AbstractC0379b e(j12.e.d.a.b.AbstractC0381d abstractC0381d) {
            if (abstractC0381d != null) {
                this.d = abstractC0381d;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        @Override // defpackage.j12.e.d.a.b.AbstractC0379b
        public j12.e.d.a.b.AbstractC0379b f(List<j12.e.d.a.b.AbstractC0383e> list) {
            this.a = list;
            return this;
        }
    }

    @Override // defpackage.j12.e.d.a.b
    public j12.a b() {
        return this.c;
    }

    @Override // defpackage.j12.e.d.a.b
    @NonNull
    public List<j12.e.d.a.b.AbstractC0377a> c() {
        return this.e;
    }

    @Override // defpackage.j12.e.d.a.b
    public j12.e.d.a.b.c d() {
        return this.b;
    }

    @Override // defpackage.j12.e.d.a.b
    @NonNull
    public j12.e.d.a.b.AbstractC0381d e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j12.e.d.a.b)) {
            return false;
        }
        j12.e.d.a.b bVar = (j12.e.d.a.b) obj;
        List<j12.e.d.a.b.AbstractC0383e> list = this.a;
        if (list != null ? list.equals(bVar.f()) : bVar.f() == null) {
            j12.e.d.a.b.c cVar = this.b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                j12.a aVar = this.c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    if (this.d.equals(bVar.e()) && this.e.equals(bVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.j12.e.d.a.b
    public List<j12.e.d.a.b.AbstractC0383e> f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        List<j12.e.d.a.b.AbstractC0383e> list = this.a;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        j12.e.d.a.b.c cVar = this.b;
        if (cVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = cVar.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        j12.a aVar = this.c;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return ((((i3 ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.a + ", exception=" + this.b + ", appExitInfo=" + this.c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }

    private y10(List<j12.e.d.a.b.AbstractC0383e> list, j12.e.d.a.b.c cVar, j12.a aVar, j12.e.d.a.b.AbstractC0381d abstractC0381d, List<j12.e.d.a.b.AbstractC0377a> list2) {
        this.a = list;
        this.b = cVar;
        this.c = aVar;
        this.d = abstractC0381d;
        this.e = list2;
    }
}
