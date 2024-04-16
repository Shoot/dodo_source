package defpackage;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: ExifInterfaceImageHeaderParser.java */
/* renamed from: vm3  reason: default package */
/* loaded from: classes.dex */
public final class vm3 implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int a(@NonNull InputStream inputStream, @NonNull mr mrVar) throws IOException {
        int c = new um3(inputStream).c("Orientation", 1);
        if (c == 0) {
            return -1;
        }
        return c;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType b(@NonNull ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType c(@NonNull InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(@NonNull ByteBuffer byteBuffer, @NonNull mr mrVar) throws IOException {
        return a(ck0.g(byteBuffer), mrVar);
    }
}
