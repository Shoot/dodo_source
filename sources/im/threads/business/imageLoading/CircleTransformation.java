package im.threads.business.imageLoading;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.kustoworker.KustoStorage;
import kotlin.Metadata;
import kotlin.ranges.i;
/* compiled from: CircleTransformation.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lim/threads/business/imageLoading/CircleTransformation;", "Lskb;", "Landroid/graphics/Bitmap;", KustoStorage.KustoTable.COLUMN_SOURCE, "transform", "", Action.KEY_ATTRIBUTE, "<init>", "()V", "threads_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class CircleTransformation implements skb {
    @Override // defpackage.skb
    public String key() {
        return "circle";
    }

    @Override // defpackage.skb
    public Bitmap transform(Bitmap bitmap) {
        int h;
        z65.h(bitmap, KustoStorage.KustoTable.COLUMN_SOURCE);
        h = i.h(bitmap.getWidth(), bitmap.getHeight());
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - h) / 2, (bitmap.getHeight() - h) / 2, h, h);
        z65.g(createBitmap, "createBitmap(source, x, y, size, size)");
        if (!z65.c(createBitmap, bitmap)) {
            bitmap.recycle();
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(h, h, bitmap.getConfig());
        z65.g(createBitmap2, "createBitmap(size, size, source.config)");
        Canvas canvas = new Canvas(createBitmap2);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        paint.setAntiAlias(true);
        float f = h / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        createBitmap.recycle();
        return createBitmap2;
    }
}
