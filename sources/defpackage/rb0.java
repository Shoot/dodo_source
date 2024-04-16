package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import defpackage.zo1;
import java.io.File;
import java.io.OutputStream;
import kotlin.Metadata;
/* compiled from: BitmapCompressEngine.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lrb0;", "Lvo1;", "Lzo1$a;", "params", "Ljava/io/OutputStream;", "outputStream", "", "a", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: rb0  reason: default package */
/* loaded from: classes4.dex */
public final class rb0 implements vo1 {
    @Override // defpackage.vo1
    public void a(zo1.a aVar, OutputStream outputStream) {
        z65.h(aVar, "params");
        z65.h(outputStream, "outputStream");
        File a = aVar.a();
        int b = aVar.b();
        int c = aVar.c();
        Bitmap.CompressFormat d = aVar.d();
        int e = aVar.e();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(a.getAbsolutePath(), options);
        bp1.a(options, b, c);
        options.inJustDecodeBounds = false;
        Bitmap decodeFile = BitmapFactory.decodeFile(a.getAbsolutePath(), options);
        Matrix matrix = new Matrix();
        bp1.b(matrix, new ExifInterface(a.getAbsolutePath()));
        Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true).compress(d, e, outputStream);
    }
}
