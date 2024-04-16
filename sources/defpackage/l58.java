package defpackage;

import com.dodopizza.controlling.feature.photopickerbutton.presentation.PhotoPickerButtonPresenter;
/* compiled from: PhotoPickerButtonPresenter_Factory.java */
/* renamed from: l58  reason: default package */
/* loaded from: classes.dex */
public final class l58 implements no3<PhotoPickerButtonPresenter> {
    private final as8<f63> a;

    public l58(as8<f63> as8Var) {
        this.a = as8Var;
    }

    public static l58 a(as8<f63> as8Var) {
        return new l58(as8Var);
    }

    public static PhotoPickerButtonPresenter c(f63 f63Var) {
        return new PhotoPickerButtonPresenter(f63Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public PhotoPickerButtonPresenter get() {
        return c(this.a.get());
    }
}
