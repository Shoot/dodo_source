package defpackage;

import com.dodopizza.controlling.feature.photopickerbutton.PhotoPickerButtonFeatureDependencies;
import com.dodopizza.controlling.feature.photopickerbutton.presentation.PhotoPickerButtonPresenter;
import defpackage.h58;
/* compiled from: DaggerPhotoPickerButtonComponent.java */
/* renamed from: fh2  reason: default package */
/* loaded from: classes.dex */
public final class fh2 {

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DaggerPhotoPickerButtonComponent.java */
    /* renamed from: fh2$a */
    /* loaded from: classes.dex */
    public static final class a implements h58.b {
        private a() {
        }

        @Override // defpackage.h58.b
        public h58 a(PhotoPickerButtonFeatureDependencies photoPickerButtonFeatureDependencies) {
            jh8.b(photoPickerButtonFeatureDependencies);
            return new b(photoPickerButtonFeatureDependencies);
        }
    }

    /* compiled from: DaggerPhotoPickerButtonComponent.java */
    /* renamed from: fh2$b */
    /* loaded from: classes.dex */
    private static final class b implements h58 {
        private final b b;
        private as8<f63> c;
        private as8<PhotoPickerButtonPresenter> d;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: DaggerPhotoPickerButtonComponent.java */
        /* renamed from: fh2$b$a */
        /* loaded from: classes.dex */
        public static final class a implements as8<f63> {
            private final PhotoPickerButtonFeatureDependencies a;

            a(PhotoPickerButtonFeatureDependencies photoPickerButtonFeatureDependencies) {
                this.a = photoPickerButtonFeatureDependencies;
            }

            @Override // defpackage.as8
            /* renamed from: a */
            public f63 get() {
                return (f63) jh8.d(this.a.b());
            }
        }

        private void b(PhotoPickerButtonFeatureDependencies photoPickerButtonFeatureDependencies) {
            a aVar = new a(photoPickerButtonFeatureDependencies);
            this.c = aVar;
            this.d = p63.a(l58.a(aVar));
        }

        private j58 c(j58 j58Var) {
            k58.a(j58Var, this.d);
            return j58Var;
        }

        @Override // defpackage.h58
        public void a(j58 j58Var) {
            c(j58Var);
        }

        private b(PhotoPickerButtonFeatureDependencies photoPickerButtonFeatureDependencies) {
            this.b = this;
            b(photoPickerButtonFeatureDependencies);
        }
    }

    public static h58.b a() {
        return new a();
    }
}
