package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
import java.util.List;
/* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
/* renamed from: x10  reason: default package */
/* loaded from: classes2.dex */
final class x10 extends j12.e.d.a {
    private final j12.e.d.a.b a;
    private final List<j12.c> b;
    private final List<j12.c> c;
    private final Boolean d;
    private final j12.e.d.a.c e;
    private final List<j12.e.d.a.c> f;
    private final int g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_CrashlyticsReport_Session_Event_Application.java */
    /* renamed from: x10$b */
    /* loaded from: classes2.dex */
    public static final class b extends j12.e.d.a.AbstractC0376a {
        private j12.e.d.a.b a;
        private List<j12.c> b;
        private List<j12.c> c;
        private Boolean d;
        private j12.e.d.a.c e;
        private List<j12.e.d.a.c> f;
        private Integer g;

        @Override // defpackage.j12.e.d.a.AbstractC0376a
        public j12.e.d.a a() {
            String str = "";
            if (this.a == null) {
                str = " execution";
            }
            if (this.g == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new x10(this.a, this.b, this.c, this.d, this.e, this.f, this.g.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // defpackage.j12.e.d.a.AbstractC0376a
        public j12.e.d.a.AbstractC0376a b(List<j12.e.d.a.c> list) {
            this.f = list;
            return this;
        }

        @Override // defpackage.j12.e.d.a.AbstractC0376a
        public j12.e.d.a.AbstractC0376a c(Boolean bool) {
            this.d = bool;
            return this;
        }

        @Override // defpackage.j12.e.d.a.AbstractC0376a
        public j12.e.d.a.AbstractC0376a d(j12.e.d.a.c cVar) {
            this.e = cVar;
            return this;
        }

        @Override // defpackage.j12.e.d.a.AbstractC0376a
        public j12.e.d.a.AbstractC0376a e(List<j12.c> list) {
            this.b = list;
            return this;
        }

        @Override // defpackage.j12.e.d.a.AbstractC0376a
        public j12.e.d.a.AbstractC0376a f(j12.e.d.a.b bVar) {
            if (bVar != null) {
                this.a = bVar;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        @Override // defpackage.j12.e.d.a.AbstractC0376a
        public j12.e.d.a.AbstractC0376a g(List<j12.c> list) {
            this.c = list;
            return this;
        }

        @Override // defpackage.j12.e.d.a.AbstractC0376a
        public j12.e.d.a.AbstractC0376a h(int i) {
            this.g = Integer.valueOf(i);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(j12.e.d.a aVar) {
            this.a = aVar.f();
            this.b = aVar.e();
            this.c = aVar.g();
            this.d = aVar.c();
            this.e = aVar.d();
            this.f = aVar.b();
            this.g = Integer.valueOf(aVar.h());
        }
    }

    @Override // defpackage.j12.e.d.a
    public List<j12.e.d.a.c> b() {
        return this.f;
    }

    @Override // defpackage.j12.e.d.a
    public Boolean c() {
        return this.d;
    }

    @Override // defpackage.j12.e.d.a
    public j12.e.d.a.c d() {
        return this.e;
    }

    @Override // defpackage.j12.e.d.a
    public List<j12.c> e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        List<j12.c> list;
        List<j12.c> list2;
        Boolean bool;
        j12.e.d.a.c cVar;
        List<j12.e.d.a.c> list3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j12.e.d.a)) {
            return false;
        }
        j12.e.d.a aVar = (j12.e.d.a) obj;
        if (this.a.equals(aVar.f()) && ((list = this.b) != null ? list.equals(aVar.e()) : aVar.e() == null) && ((list2 = this.c) != null ? list2.equals(aVar.g()) : aVar.g() == null) && ((bool = this.d) != null ? bool.equals(aVar.c()) : aVar.c() == null) && ((cVar = this.e) != null ? cVar.equals(aVar.d()) : aVar.d() == null) && ((list3 = this.f) != null ? list3.equals(aVar.b()) : aVar.b() == null) && this.g == aVar.h()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.j12.e.d.a
    @NonNull
    public j12.e.d.a.b f() {
        return this.a;
    }

    @Override // defpackage.j12.e.d.a
    public List<j12.c> g() {
        return this.c;
    }

    @Override // defpackage.j12.e.d.a
    public int h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.a.hashCode() ^ 1000003) * 1000003;
        List<j12.c> list = this.b;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (hashCode5 ^ hashCode) * 1000003;
        List<j12.c> list2 = this.c;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        Boolean bool = this.d;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        j12.e.d.a.c cVar = this.e;
        if (cVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = cVar.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        List<j12.e.d.a.c> list3 = this.f;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return ((i5 ^ i) * 1000003) ^ this.g;
    }

    @Override // defpackage.j12.e.d.a
    public j12.e.d.a.AbstractC0376a i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.a + ", customAttributes=" + this.b + ", internalKeys=" + this.c + ", background=" + this.d + ", currentProcessDetails=" + this.e + ", appProcessDetails=" + this.f + ", uiOrientation=" + this.g + "}";
    }

    private x10(j12.e.d.a.b bVar, List<j12.c> list, List<j12.c> list2, Boolean bool, j12.e.d.a.c cVar, List<j12.e.d.a.c> list3, int i) {
        this.a = bVar;
        this.b = list;
        this.c = list2;
        this.d = bool;
        this.e = cVar;
        this.f = list3;
        this.g = i;
    }
}
