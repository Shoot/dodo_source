package defpackage;

import com.dodopizza.feature.imagepicker.ImagePickerDialogFeatureDependencies;
import com.dodopizza.feature.imagepicker.presentation.ImagePickerDialogPresenter;
import defpackage.cv4;
/* compiled from: DaggerImagePickerDialogComponent.java */
/* renamed from: se2  reason: default package */
/* loaded from: classes.dex */
public final class se2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerImagePickerDialogComponent.java */
    /* renamed from: se2$a */
    /* loaded from: classes.dex */
    public static final class a implements cv4.b {
        private a() {
        }

        @Override // defpackage.cv4.b
        public cv4 a(dv4 dv4Var, ImagePickerDialogFeatureDependencies imagePickerDialogFeatureDependencies) {
            jh8.b(dv4Var);
            jh8.b(imagePickerDialogFeatureDependencies);
            return new b(imagePickerDialogFeatureDependencies, dv4Var);
        }
    }

    /* compiled from: DaggerImagePickerDialogComponent.java */
    /* renamed from: se2$b */
    /* loaded from: classes.dex */
    private static final class b implements cv4 {
        private final b b;
        private as8<dv4> c;
        private as8<f63> d;
        private as8<gc> e;
        private as8<fy7> f;
        private as8<ImagePickerDialogPresenter> g;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerImagePickerDialogComponent.java */
        /* renamed from: se2$b$a */
        /* loaded from: classes.dex */
        public static final class a implements as8<gc> {
            private final ImagePickerDialogFeatureDependencies a;

            a(ImagePickerDialogFeatureDependencies imagePickerDialogFeatureDependencies) {
                this.a = imagePickerDialogFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public gc get() {
                return (gc) jh8.d(this.a.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerImagePickerDialogComponent.java */
        /* renamed from: se2$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0664b implements as8<fy7> {
            private final ImagePickerDialogFeatureDependencies a;

            C0664b(ImagePickerDialogFeatureDependencies imagePickerDialogFeatureDependencies) {
                this.a = imagePickerDialogFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public fy7 get() {
                return (fy7) jh8.d(this.a.d0());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerImagePickerDialogComponent.java */
        /* renamed from: se2$b$c */
        /* loaded from: classes.dex */
        public static final class c implements as8<f63> {
            private final ImagePickerDialogFeatureDependencies a;

            c(ImagePickerDialogFeatureDependencies imagePickerDialogFeatureDependencies) {
                this.a = imagePickerDialogFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.b());
            }
        }

        private void b(ImagePickerDialogFeatureDependencies imagePickerDialogFeatureDependencies, dv4 dv4Var) {
            this.c = z45.a(dv4Var);
            this.d = new c(imagePickerDialogFeatureDependencies);
            this.e = new a(imagePickerDialogFeatureDependencies);
            C0664b c0664b = new C0664b(imagePickerDialogFeatureDependencies);
            this.f = c0664b;
            this.g = p63.a(gv4.a(this.c, this.d, this.e, c0664b));
        }

        private ev4 c(ev4 ev4Var) {
            fv4.a(ev4Var, this.g);
            return ev4Var;
        }

        @Override // defpackage.cv4
        public void a(ev4 ev4Var) {
            c(ev4Var);
        }

        private b(ImagePickerDialogFeatureDependencies imagePickerDialogFeatureDependencies, dv4 dv4Var) {
            this.b = this;
            b(imagePickerDialogFeatureDependencies, dv4Var);
        }
    }

    public static cv4.b a() {
        return new a();
    }
}
