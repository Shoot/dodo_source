package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
/* compiled from: DrawableImageViewTarget.java */
/* renamed from: k83  reason: default package */
/* loaded from: classes.dex */
public class k83 extends dw4<Drawable> {
    public k83(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dw4
    /* renamed from: s */
    public void q(Drawable drawable) {
        ((ImageView) this.b).setImageDrawable(drawable);
    }
}
