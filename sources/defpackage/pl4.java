package defpackage;

import android.graphics.drawable.Drawable;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.android.view.custom.doubleimageview.DoubleImageView;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: HalvesProductCardGlideTarget.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00022\u0010\u0010\f\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\u000bH\u0016J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0010\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016¨\u0006\u001a"}, d2 = {"Lpl4;", "Lk42;", "Landroid/graphics/drawable/Drawable;", "", e.a, "first", "second", "f", "placeholder", "a", "resource", "Ldlb;", "transition", "k", "errorDrawable", "b", "i", "Lbl4;", DateTokenConverter.CONVERTER_KEY, "Lbl4;", "halvesDrawableHolder", "Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", "Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;", "targetView", "<init>", "(Lbl4;Lcom/dodopizza/android/view/custom/doubleimageview/DoubleImageView;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: pl4  reason: default package */
/* loaded from: classes4.dex */
public final class pl4 extends k42<Drawable> {
    private final bl4 d;
    private final DoubleImageView e;

    public pl4(bl4 bl4Var, DoubleImageView doubleImageView) {
        z65.h(bl4Var, "halvesDrawableHolder");
        z65.h(doubleImageView, "targetView");
        this.d = bl4Var;
        this.e = doubleImageView;
    }

    private final void e() {
        Drawable drawable = this.d.a().get();
        Drawable drawable2 = this.d.b().get();
        if (drawable != null && drawable2 != null) {
            f(drawable, drawable2);
        }
    }

    private final void f(Drawable drawable, Drawable drawable2) {
        this.e.f(drawable);
        this.e.h(drawable2);
    }

    @Override // defpackage.k42, defpackage.n6b
    public void a(Drawable drawable) {
        if (drawable != null) {
            this.e.f(drawable);
            this.e.h(drawable);
        }
    }

    @Override // defpackage.k42, defpackage.n6b
    public void b(Drawable drawable) {
        if (drawable != null) {
            this.e.i(drawable);
        }
    }

    @Override // defpackage.n6b
    /* renamed from: k */
    public void d(Drawable drawable, dlb<? super Drawable> dlbVar) {
        z65.h(drawable, "resource");
        e();
    }

    @Override // defpackage.n6b
    public void i(Drawable drawable) {
    }
}
