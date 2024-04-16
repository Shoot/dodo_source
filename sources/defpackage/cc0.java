package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.NonNull;
import java.io.IOException;
/* compiled from: BitmapImageDecoderResourceDecoder.java */
/* renamed from: cc0  reason: default package */
/* loaded from: classes.dex */
public final class cc0 implements rj9<ImageDecoder.Source, Bitmap> {
    private final gc0 a = new hc0();

    @Override // defpackage.rj9
    public /* bridge */ /* synthetic */ boolean a(@NonNull ImageDecoder.Source source, @NonNull ac7 ac7Var) throws IOException {
        return d(ac0.a(source), ac7Var);
    }

    @Override // defpackage.rj9
    public /* bridge */ /* synthetic */ nj9<Bitmap> b(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull ac7 ac7Var) throws IOException {
        return c(ac0.a(source), i, i2, ac7Var);
    }

    public nj9<Bitmap> c(@NonNull ImageDecoder.Source source, int i, int i2, @NonNull ac7 ac7Var) throws IOException {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new dr2(i, i2, ac7Var));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]");
        }
        return new ic0(decodeBitmap, this.a);
    }

    public boolean d(@NonNull ImageDecoder.Source source, @NonNull ac7 ac7Var) throws IOException {
        return true;
    }
}
