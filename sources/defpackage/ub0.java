package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.IOException;
/* compiled from: BitmapDrawableDecoder.java */
/* renamed from: ub0  reason: default package */
/* loaded from: classes.dex */
public class ub0<DataType> implements rj9<DataType, BitmapDrawable> {
    private final rj9<DataType, Bitmap> a;
    private final Resources b;

    public ub0(@NonNull Resources resources, @NonNull rj9<DataType, Bitmap> rj9Var) {
        this.b = (Resources) eh8.d(resources);
        this.a = (rj9) eh8.d(rj9Var);
    }

    @Override // defpackage.rj9
    public boolean a(@NonNull DataType datatype, @NonNull ac7 ac7Var) throws IOException {
        return this.a.a(datatype, ac7Var);
    }

    @Override // defpackage.rj9
    public nj9<BitmapDrawable> b(@NonNull DataType datatype, int i, int i2, @NonNull ac7 ac7Var) throws IOException {
        return sn5.e(this.b, this.a.b(datatype, i, i2, ac7Var));
    }
}
