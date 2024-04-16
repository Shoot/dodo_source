package im.threads.business.imageLoading;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.kustoworker.KustoStorage;
import kotlin.Metadata;
/* compiled from: MaskedTransformation.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lim/threads/business/imageLoading/MaskedTransformation;", "Lskb;", "", Action.KEY_ATTRIBUTE, "Landroid/graphics/Bitmap;", KustoStorage.KustoTable.COLUMN_SOURCE, "transform", "Landroid/graphics/drawable/Drawable;", "maskDrawable", "Landroid/graphics/drawable/Drawable;", "<init>", "(Landroid/graphics/drawable/Drawable;)V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class MaskedTransformation implements skb {
    private final Drawable maskDrawable;

    public MaskedTransformation(Drawable drawable) {
        z65.h(drawable, "maskDrawable");
        this.maskDrawable = drawable;
    }

    @Override // defpackage.skb
    public String key() {
        return String.valueOf(e49.a(999999999).f());
    }

    @Override // defpackage.skb
    public Bitmap transform(Bitmap bitmap) {
        NinePatchDrawable ninePatchDrawable;
        z65.h(bitmap, KustoStorage.KustoTable.COLUMN_SOURCE);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
        z65.g(createBitmap, "createBitmap(source.widt… Bitmap.Config.ARGB_8888)");
        Canvas canvas = new Canvas(createBitmap);
        new BitmapFactory.Options().inSampleSize = 2;
        Bitmap createBitmap2 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), config);
        z65.g(createBitmap2, "createBitmap(source.widt… Bitmap.Config.ARGB_8888)");
        Canvas canvas2 = new Canvas(createBitmap2);
        Drawable drawable = this.maskDrawable;
        if (drawable instanceof NinePatchDrawable) {
            ninePatchDrawable = (NinePatchDrawable) drawable;
        } else {
            ninePatchDrawable = null;
        }
        if (ninePatchDrawable != null) {
            ninePatchDrawable.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
        }
        if (ninePatchDrawable != null) {
            ninePatchDrawable.draw(canvas2);
        }
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, paint);
        paint.setXfermode(null);
        bitmap.recycle();
        return createBitmap;
    }
}
