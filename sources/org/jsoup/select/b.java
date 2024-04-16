package org.jsoup.select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
/* compiled from: CombiningEvaluator.java */
/* loaded from: classes3.dex */
public abstract class b extends c {
    final ArrayList<c> a;
    int b;

    /* compiled from: CombiningEvaluator.java */
    /* loaded from: classes3.dex */
    public static final class a extends b {
        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Collection<c> collection) {
            super(collection);
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!this.a.get(i).a(re3Var, re3Var2)) {
                    return false;
                }
            }
            return true;
        }

        public String toString() {
            return wza.k(this.a, "");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(c... cVarArr) {
            this(Arrays.asList(cVarArr));
        }
    }

    b() {
        this.b = 0;
        this.a = new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(c cVar) {
        this.a.set(this.b - 1, cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c c() {
        int i = this.b;
        if (i > 0) {
            return this.a.get(i - 1);
        }
        return null;
    }

    void d() {
        this.b = this.a.size();
    }

    b(Collection<c> collection) {
        this();
        this.a.addAll(collection);
        d();
    }

    /* compiled from: CombiningEvaluator.java */
    /* renamed from: org.jsoup.select.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0465b extends b {
        C0465b(Collection<c> collection) {
            if (this.b > 1) {
                this.a.add(new a(collection));
            } else {
                this.a.addAll(collection);
            }
            d();
        }

        @Override // org.jsoup.select.c
        public boolean a(re3 re3Var, re3 re3Var2) {
            for (int i = 0; i < this.b; i++) {
                if (this.a.get(i).a(re3Var, re3Var2)) {
                    return true;
                }
            }
            return false;
        }

        public void e(c cVar) {
            this.a.add(cVar);
            d();
        }

        public String toString() {
            return wza.k(this.a, ", ");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0465b(c... cVarArr) {
            this(Arrays.asList(cVarArr));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0465b() {
        }
    }
}
