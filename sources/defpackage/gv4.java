package defpackage;

import com.dodopizza.feature.imagepicker.presentation.ImagePickerDialogPresenter;
/* compiled from: ImagePickerDialogPresenter_Factory.java */
/* renamed from: gv4  reason: default package */
/* loaded from: classes.dex */
public final class gv4 implements no3<ImagePickerDialogPresenter> {
    private final as8<dv4> a;
    private final as8<f63> b;
    private final as8<gc> c;
    private final as8<fy7> d;

    public gv4(as8<dv4> as8Var, as8<f63> as8Var2, as8<gc> as8Var3, as8<fy7> as8Var4) {
        this.a = as8Var;
        this.b = as8Var2;
        this.c = as8Var3;
        this.d = as8Var4;
    }

    public static gv4 a(as8<dv4> as8Var, as8<f63> as8Var2, as8<gc> as8Var3, as8<fy7> as8Var4) {
        return new gv4(as8Var, as8Var2, as8Var3, as8Var4);
    }

    public static ImagePickerDialogPresenter c(dv4 dv4Var, f63 f63Var, gc gcVar, fy7 fy7Var) {
        return new ImagePickerDialogPresenter(dv4Var, f63Var, gcVar, fy7Var);
    }

    @Override // defpackage.as8
    /* renamed from: b */
    public ImagePickerDialogPresenter get() {
        return c(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
