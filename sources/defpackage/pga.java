package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.NonNull;
/* compiled from: ShadowRenderer.java */
/* renamed from: pga  reason: default package */
/* loaded from: classes2.dex */
public class pga {
    private static final int[] i = new int[3];
    private static final float[] j = {0.0f, 0.5f, 1.0f};
    private static final int[] k = new int[4];
    private static final float[] l = {0.0f, 0.0f, 0.5f, 1.0f};
    @NonNull
    private final Paint a;
    @NonNull
    private final Paint b;
    @NonNull
    private final Paint c;
    private int d;
    private int e;
    private int f;
    private final Path g;
    private Paint h;

    public pga() {
        this(-16777216);
    }

    public void a(@NonNull Canvas canvas, Matrix matrix, @NonNull RectF rectF, int i2, float f, float f2) {
        boolean z;
        if (f2 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Path path = this.g;
        if (z) {
            int[] iArr = k;
            iArr[0] = 0;
            iArr[1] = this.f;
            iArr[2] = this.e;
            iArr[3] = this.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i2;
            rectF.inset(f3, f3);
            int[] iArr2 = k;
            iArr2[0] = 0;
            iArr2[1] = this.d;
            iArr2[2] = this.e;
            iArr2[3] = this.f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i2 / width);
        float[] fArr = l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        this.b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.h);
        }
        canvas.drawArc(rectF, f, f2, true, this.b);
        canvas.restore();
    }

    public void b(@NonNull Canvas canvas, Matrix matrix, @NonNull RectF rectF, int i2) {
        rectF.bottom += i2;
        rectF.offset(0.0f, -i2);
        int[] iArr = i;
        iArr[0] = this.f;
        iArr[1] = this.e;
        iArr[2] = this.d;
        Paint paint = this.c;
        float f = rectF.left;
        paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.c);
        canvas.restore();
    }

    @NonNull
    public Paint c() {
        return this.a;
    }

    public void d(int i2) {
        this.d = qf1.p(i2, 68);
        this.e = qf1.p(i2, 20);
        this.f = qf1.p(i2, 0);
        this.a.setColor(this.d);
    }

    public pga(int i2) {
        this.g = new Path();
        this.h = new Paint();
        this.a = new Paint();
        d(i2);
        this.h.setColor(0);
        Paint paint = new Paint(4);
        this.b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.c = new Paint(paint);
    }
}
