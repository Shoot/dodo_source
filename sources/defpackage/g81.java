package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;
/* compiled from: CircularRevealWidget.java */
/* renamed from: g81  reason: default package */
/* loaded from: classes2.dex */
public interface g81 {

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: g81$b */
    /* loaded from: classes2.dex */
    public static class b implements TypeEvaluator<e> {
        public static final TypeEvaluator<e> b = new b();
        private final e a = new e();

        @Override // android.animation.TypeEvaluator
        @NonNull
        /* renamed from: a */
        public e evaluate(float f, @NonNull e eVar, @NonNull e eVar2) {
            this.a.a(ma6.c(eVar.a, eVar2.a, f), ma6.c(eVar.b, eVar2.b, f), ma6.c(eVar.c, eVar2.c, f));
            return this.a;
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: g81$c */
    /* loaded from: classes2.dex */
    public static class c extends Property<g81, e> {
        public static final Property<g81, e> a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public e get(@NonNull g81 g81Var) {
            return g81Var.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(@NonNull g81 g81Var, e eVar) {
            g81Var.setRevealInfo(eVar);
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: g81$d */
    /* loaded from: classes2.dex */
    public static class d extends Property<g81, Integer> {
        public static final Property<g81, Integer> a = new d("circularRevealScrimColor");

        private d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        @NonNull
        /* renamed from: a */
        public Integer get(@NonNull g81 g81Var) {
            return Integer.valueOf(g81Var.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(@NonNull g81 g81Var, @NonNull Integer num) {
            g81Var.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: g81$e */
    /* loaded from: classes2.dex */
    public static class e {
        public float a;
        public float b;
        public float c;

        private e() {
        }

        public void a(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }

        public e(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);
}
