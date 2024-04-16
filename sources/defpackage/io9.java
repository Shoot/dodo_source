package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
/* compiled from: RoundResizeTransform.java */
/* renamed from: io9  reason: default package */
/* loaded from: classes4.dex */
public class io9 extends jc0 {
    private static final byte[] c = "ru.dodopizza.app.infrastracture.utils.transformations.RoundResizeTransform".getBytes(se5.a);
    private final int b;

    public io9(int i) {
        this.b = i;
    }

    private Bitmap d(Bitmap bitmap, int i) {
        return Bitmap.createScaledBitmap(bitmap, (int) (((bitmap.getWidth() * i) * 1.0f) / (bitmap.getHeight() * 1.0f)), i, true);
    }

    @Override // defpackage.se5
    public void b(MessageDigest messageDigest) {
        messageDigest.update(c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.jc0
    protected Bitmap c(gc0 gc0Var, Bitmap bitmap, int i, int i2) {
        Bitmap d = d(bitmap, i2);
        int width = d.getWidth();
        int height = d.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int i3 = this.b;
        Rect rect = new Rect(0, i3, width, height - i3);
        int i4 = this.b;
        Rect rect2 = new Rect(i4, 0, width - i4, height);
        Paint paint = new Paint();
        canvas.drawRect(rect, paint);
        canvas.drawRect(rect2, paint);
        int i5 = this.b;
        canvas.drawCircle(i5, i5, i5, paint);
        int i6 = this.b;
        canvas.drawCircle(width - i6, i6, i6, paint);
        int i7 = this.b;
        canvas.drawCircle(width - i7, height - i7, i7, paint);
        int i8 = this.b;
        canvas.drawCircle(i8, height - i8, i8, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(d, 0.0f, 0.0f, paint);
        d.recycle();
        return createBitmap;
    }

    @Override // defpackage.se5
    public boolean equals(Object obj) {
        if ((obj instanceof io9) && ((io9) obj).b == this.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.se5
    public int hashCode() {
        return 451835822 + this.b;
    }
}
