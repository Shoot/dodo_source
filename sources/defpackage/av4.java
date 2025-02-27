package defpackage;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;
import androidx.annotation.NonNull;
/* compiled from: ImageMatrixProperty.java */
/* renamed from: av4  reason: default package */
/* loaded from: classes2.dex */
public class av4 extends Property<ImageView, Matrix> {
    private final Matrix a;

    public av4() {
        super(Matrix.class, "imageMatrixProperty");
        this.a = new Matrix();
    }

    @Override // android.util.Property
    @NonNull
    /* renamed from: a */
    public Matrix get(@NonNull ImageView imageView) {
        this.a.set(imageView.getImageMatrix());
        return this.a;
    }

    @Override // android.util.Property
    /* renamed from: b */
    public void set(@NonNull ImageView imageView, @NonNull Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
