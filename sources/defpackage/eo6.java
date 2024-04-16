package defpackage;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* compiled from: MonitoringKeysetInfo.java */
/* renamed from: eo6  reason: default package */
/* loaded from: classes2.dex */
public final class eo6 {
    private final xn6 a;
    private final List<c> b;
    private final Integer c;

    /* compiled from: MonitoringKeysetInfo.java */
    /* renamed from: eo6$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private ArrayList<c> a = new ArrayList<>();
        private xn6 b = xn6.b;
        private Integer c = null;

        private boolean c(int i) {
            Iterator<c> it = this.a.iterator();
            while (it.hasNext()) {
                if (it.next().a() == i) {
                    return true;
                }
            }
            return false;
        }

        public b a(sf5 sf5Var, int i, lq7 lq7Var) {
            ArrayList<c> arrayList = this.a;
            if (arrayList != null) {
                arrayList.add(new c(sf5Var, i, lq7Var));
                return this;
            }
            throw new IllegalStateException("addEntry cannot be called after build()");
        }

        public eo6 b() throws GeneralSecurityException {
            if (this.a != null) {
                Integer num = this.c;
                if (num != null && !c(num.intValue())) {
                    throw new GeneralSecurityException("primary key ID is not present in entries");
                }
                eo6 eo6Var = new eo6(this.b, Collections.unmodifiableList(this.a), this.c);
                this.a = null;
                return eo6Var;
            }
            throw new IllegalStateException("cannot call build() twice");
        }

        public b d(xn6 xn6Var) {
            if (this.a != null) {
                this.b = xn6Var;
                return this;
            }
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }

        public b e(int i) {
            if (this.a != null) {
                this.c = Integer.valueOf(i);
                return this;
            }
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
    }

    /* compiled from: MonitoringKeysetInfo.java */
    /* renamed from: eo6$c */
    /* loaded from: classes2.dex */
    public static final class c {
        private final sf5 a;
        private final int b;
        private final lq7 c;

        public int a() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.a != cVar.a || this.b != cVar.b || !this.c.equals(cVar.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hash(this.a, Integer.valueOf(this.b), Integer.valueOf(this.c.hashCode()));
        }

        public String toString() {
            return String.format("(status=%s, keyId=%s, parameters='%s')", this.a, Integer.valueOf(this.b), this.c);
        }

        private c(sf5 sf5Var, int i, lq7 lq7Var) {
            this.a = sf5Var;
            this.b = i;
            this.c = lq7Var;
        }
    }

    public static b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof eo6)) {
            return false;
        }
        eo6 eo6Var = (eo6) obj;
        if (!this.a.equals(eo6Var.a) || !this.b.equals(eo6Var.b) || !Objects.equals(this.c, eo6Var.c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.a, this.b, this.c);
    }

    private eo6(xn6 xn6Var, List<c> list, Integer num) {
        this.a = xn6Var;
        this.b = list;
        this.c = num;
    }
}
