package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;
/* compiled from: BitmapImageViewTarget.java */
/* renamed from: dc0  reason: default package */
/* loaded from: classes.dex */
public class dc0 extends dw4<Bitmap> {
    public dc0(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dw4
    /* renamed from: s */
    public void q(Bitmap bitmap) {
        ((ImageView) this.b).setImageBitmap(bitmap);
    }
}
