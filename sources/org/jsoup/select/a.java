package org.jsoup.select;

import org.jsoup.select.d;
/* compiled from: Collector.java */
/* loaded from: classes3.dex */
public class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Collector.java */
    /* loaded from: classes3.dex */
    public static class b implements d {
        private re3 a = null;
        private re3 b = null;
        private final c c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(c cVar) {
            this.c = cVar;
        }

        @Override // org.jsoup.select.d
        public d.a a(kz6 kz6Var, int i) {
            if (kz6Var instanceof re3) {
                re3 re3Var = (re3) kz6Var;
                if (this.c.a(this.a, re3Var)) {
                    this.b = re3Var;
                    return d.a.STOP;
                }
            }
            return d.a.CONTINUE;
        }

        @Override // org.jsoup.select.d
        public d.a b(kz6 kz6Var, int i) {
            return d.a.CONTINUE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public re3 c(re3 re3Var, re3 re3Var2) {
            this.a = re3Var;
            this.b = null;
            e.a(this, re3Var2);
            return this.b;
        }
    }

    public static se3 a(c cVar, re3 re3Var) {
        se3 se3Var = new se3();
        e.b(new C0464a(re3Var, se3Var, cVar), re3Var);
        return se3Var;
    }

    public static re3 b(c cVar, re3 re3Var) {
        return new b(cVar).c(re3Var, re3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Collector.java */
    /* renamed from: org.jsoup.select.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0464a implements wz6 {
        private final re3 a;
        private final se3 b;
        private final c c;

        C0464a(re3 re3Var, se3 se3Var, c cVar) {
            this.a = re3Var;
            this.b = se3Var;
            this.c = cVar;
        }

        @Override // defpackage.wz6
        public void a(kz6 kz6Var, int i) {
            if (kz6Var instanceof re3) {
                re3 re3Var = (re3) kz6Var;
                if (this.c.a(this.a, re3Var)) {
                    this.b.add(re3Var);
                }
            }
        }

        @Override // defpackage.wz6
        public void b(kz6 kz6Var, int i) {
        }
    }
}
