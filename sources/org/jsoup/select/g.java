package org.jsoup.select;

import org.jsoup.select.a;
/* compiled from: StructuralEvaluator.java */
/* loaded from: classes3.dex */
abstract class g extends org.jsoup.select.c {
    org.jsoup.select.c a;

    /* compiled from: StructuralEvaluator.java */
    /* loaded from: classes3.dex */
    static class a extends g {
        final a.b b;

        public a(org.jsoup.select.c cVar) {
            this.a = cVar;
            this.b = new a.b(cVar);
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            for (int i = 0; i < re3Var2.j(); i++) {
                kz6 i2 = re3Var2.i(i);
                if ((i2 instanceof re3) && this.b.c(re3Var2, (re3) i2) != null) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format(":has(%s)", this.a);
        }
    }

    /* compiled from: StructuralEvaluator.java */
    /* loaded from: classes3.dex */
    static class b extends g {
        public b(org.jsoup.select.c cVar) {
            this.a = cVar;
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            re3 G;
            if (re3Var == re3Var2 || (G = re3Var2.G()) == null || !this.a.a(re3Var, G)) {
                return false;
            }
            return true;
        }

        public String toString() {
            return String.format("%s > ", this.a);
        }
    }

    /* compiled from: StructuralEvaluator.java */
    /* loaded from: classes3.dex */
    static class c extends g {
        public c(org.jsoup.select.c cVar) {
            this.a = cVar;
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            re3 K0;
            if (re3Var == re3Var2 || (K0 = re3Var2.K0()) == null || !this.a.a(re3Var, K0)) {
                return false;
            }
            return true;
        }

        public String toString() {
            return String.format("%s + ", this.a);
        }
    }

    /* compiled from: StructuralEvaluator.java */
    /* loaded from: classes3.dex */
    static class d extends g {
        public d(org.jsoup.select.c cVar) {
            this.a = cVar;
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            return !this.a.a(re3Var, re3Var2);
        }

        public String toString() {
            return String.format(":not(%s)", this.a);
        }
    }

    /* compiled from: StructuralEvaluator.java */
    /* loaded from: classes3.dex */
    static class e extends g {
        public e(org.jsoup.select.c cVar) {
            this.a = cVar;
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            if (re3Var == re3Var2) {
                return false;
            }
            for (re3 G = re3Var2.G(); G != null; G = G.G()) {
                if (this.a.a(re3Var, G)) {
                    return true;
                }
                if (G == re3Var) {
                    break;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("%s ", this.a);
        }
    }

    /* compiled from: StructuralEvaluator.java */
    /* loaded from: classes3.dex */
    static class f extends g {
        public f(org.jsoup.select.c cVar) {
            this.a = cVar;
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            if (re3Var == re3Var2) {
                return false;
            }
            for (re3 K0 = re3Var2.K0(); K0 != null; K0 = K0.K0()) {
                if (this.a.a(re3Var, K0)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format("%s ~ ", this.a);
        }
    }

    /* compiled from: StructuralEvaluator.java */
    /* renamed from: org.jsoup.select.g$g  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0467g extends org.jsoup.select.c {
        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            if (re3Var == re3Var2) {
                return true;
            }
            return false;
        }
    }

    g() {
    }
}
