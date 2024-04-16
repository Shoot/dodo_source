package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.caverock.androidsvg.SVG;
import com.caverock.androidsvg.SVGParseException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
/* compiled from: SvgMediaDecoder.java */
/* renamed from: m3b  reason: default package */
/* loaded from: classes3.dex */
public class m3b extends kc6 {
    private final Resources a;

    m3b(Resources resources) {
        this.a = resources;
        e();
    }

    @NonNull
    public static m3b c() {
        return d(Resources.getSystem());
    }

    @NonNull
    public static m3b d(@NonNull Resources resources) {
        return new m3b(resources);
    }

    private static void e() {
        if (n3b.a()) {
            return;
        }
        throw new IllegalStateException(n3b.b());
    }

    @Override // defpackage.kc6
    @NonNull
    public Drawable a(String str, @NonNull InputStream inputStream) {
        try {
            SVG fromInputStream = SVG.getFromInputStream(inputStream);
            float documentWidth = fromInputStream.getDocumentWidth();
            float documentHeight = fromInputStream.getDocumentHeight();
            float f = this.a.getDisplayMetrics().density;
            Bitmap createBitmap = Bitmap.createBitmap((int) ((documentWidth * f) + 0.5f), (int) ((documentHeight * f) + 0.5f), Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(f, f);
            fromInputStream.renderToCanvas(canvas);
            return new BitmapDrawable(this.a, createBitmap);
        } catch (SVGParseException e) {
            throw new IllegalStateException("Exception decoding SVG", e);
        }
    }

    @Override // defpackage.kc6
    @NonNull
    public Collection<String> b() {
        return Collections.singleton("image/svg+xml");
    }
}
