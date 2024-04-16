package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ShapePath.java */
/* renamed from: hha  reason: default package */
/* loaded from: classes2.dex */
public class hha {
    @Deprecated
    public float a;
    @Deprecated
    public float b;
    @Deprecated
    public float c;
    @Deprecated
    public float d;
    @Deprecated
    public float e;
    @Deprecated
    public float f;
    private final List<f> g = new ArrayList();
    private final List<g> h = new ArrayList();
    private boolean i;

    /* compiled from: ShapePath.java */
    /* renamed from: hha$a */
    /* loaded from: classes2.dex */
    class a extends g {
        final /* synthetic */ List b;
        final /* synthetic */ Matrix c;

        a(List list, Matrix matrix) {
            this.b = list;
            this.c = matrix;
        }

        @Override // defpackage.hha.g
        public void b(Matrix matrix, pga pgaVar, int i, Canvas canvas) {
            for (g gVar : this.b) {
                gVar.b(this.c, pgaVar, i, canvas);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapePath.java */
    /* renamed from: hha$b */
    /* loaded from: classes2.dex */
    public static class b extends g {
        private final d b;

        public b(d dVar) {
            this.b = dVar;
        }

        @Override // defpackage.hha.g
        public void b(Matrix matrix, @NonNull pga pgaVar, int i, @NonNull Canvas canvas) {
            pgaVar.a(canvas, matrix, new RectF(this.b.k(), this.b.o(), this.b.l(), this.b.j()), i, this.b.m(), this.b.n());
        }
    }

    /* compiled from: ShapePath.java */
    /* renamed from: hha$c */
    /* loaded from: classes2.dex */
    static class c extends g {
        private final e b;
        private final float c;
        private final float d;

        public c(e eVar, float f, float f2) {
            this.b = eVar;
            this.c = f;
            this.d = f2;
        }

        @Override // defpackage.hha.g
        public void b(Matrix matrix, @NonNull pga pgaVar, int i, @NonNull Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.b.c - this.d, this.b.b - this.c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.c, this.d);
            matrix2.preRotate(c());
            pgaVar.b(canvas, matrix2, rectF, i);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.b.c - this.d) / (this.b.b - this.c)));
        }
    }

    /* compiled from: ShapePath.java */
    /* renamed from: hha$d */
    /* loaded from: classes2.dex */
    public static class d extends f {
        private static final RectF h = new RectF();
        @Deprecated
        public float b;
        @Deprecated
        public float c;
        @Deprecated
        public float d;
        @Deprecated
        public float e;
        @Deprecated
        public float f;
        @Deprecated
        public float g;

        public d(float f, float f2, float f3, float f4) {
            q(f);
            u(f2);
            r(f3);
            p(f4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.c;
        }

        private void p(float f) {
            this.e = f;
        }

        private void q(float f) {
            this.b = f;
        }

        private void r(float f) {
            this.d = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f) {
            this.f = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f) {
            this.g = f;
        }

        private void u(float f) {
            this.c = f;
        }

        @Override // defpackage.hha.f
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* renamed from: hha$e */
    /* loaded from: classes2.dex */
    public static class e extends f {
        private float b;
        private float c;

        @Override // defpackage.hha.f
        public void a(@NonNull Matrix matrix, @NonNull Path path) {
            Matrix matrix2 = this.a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.b, this.c);
            path.transform(matrix);
        }
    }

    /* compiled from: ShapePath.java */
    /* renamed from: hha$f */
    /* loaded from: classes2.dex */
    public static abstract class f {
        protected final Matrix a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ShapePath.java */
    /* renamed from: hha$g */
    /* loaded from: classes2.dex */
    public static abstract class g {
        static final Matrix a = new Matrix();

        g() {
        }

        public final void a(pga pgaVar, int i, Canvas canvas) {
            b(a, pgaVar, i, canvas);
        }

        public abstract void b(Matrix matrix, pga pgaVar, int i, Canvas canvas);
    }

    public hha() {
        n(0.0f, 0.0f);
    }

    private void b(float f2) {
        if (g() == f2) {
            return;
        }
        float g2 = ((f2 - g()) + 360.0f) % 360.0f;
        if (g2 > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(g2);
        this.h.add(new b(dVar));
        p(f2);
    }

    private void c(g gVar, float f2, float f3) {
        b(f2);
        this.h.add(gVar);
        p(f3);
    }

    private float g() {
        return this.e;
    }

    private float h() {
        return this.f;
    }

    private void p(float f2) {
        this.e = f2;
    }

    private void q(float f2) {
        this.f = f2;
    }

    private void r(float f2) {
        this.c = f2;
    }

    private void s(float f2) {
        this.d = f2;
    }

    private void t(float f2) {
        this.a = f2;
    }

    private void u(float f2) {
        this.b = f2;
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        boolean z;
        float f8;
        d dVar = new d(f2, f3, f4, f5);
        dVar.s(f6);
        dVar.t(f7);
        this.g.add(dVar);
        b bVar = new b(dVar);
        float f9 = f6 + f7;
        if (f7 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        if (z) {
            f8 = (180.0f + f9) % 360.0f;
        } else {
            f8 = f9;
        }
        c(bVar, f6, f8);
        double d2 = f9;
        r(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        s(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.g.get(i).a(matrix, path);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.h), new Matrix(matrix));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float i() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float j() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float k() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float l() {
        return this.b;
    }

    public void m(float f2, float f3) {
        e eVar = new e();
        eVar.b = f2;
        eVar.c = f3;
        this.g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f2);
        s(f3);
    }

    public void n(float f2, float f3) {
        o(f2, f3, 270.0f, 0.0f);
    }

    public void o(float f2, float f3, float f4, float f5) {
        t(f2);
        u(f3);
        r(f2);
        s(f3);
        p(f4);
        q((f4 + f5) % 360.0f);
        this.g.clear();
        this.h.clear();
        this.i = false;
    }
}
