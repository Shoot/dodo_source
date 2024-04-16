package com.bumptech.glide.load;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public interface ImageHeaderParser {

    /* loaded from: classes.dex */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);
        
        private final boolean a;

        ImageType(boolean z) {
            this.a = z;
        }

        public boolean hasAlpha() {
            return this.a;
        }

        public boolean isWebp() {
            int i = a.a[ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ImageType.values().length];
            a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    int a(@NonNull InputStream inputStream, @NonNull mr mrVar) throws IOException;

    @NonNull
    ImageType b(@NonNull ByteBuffer byteBuffer) throws IOException;

    @NonNull
    ImageType c(@NonNull InputStream inputStream) throws IOException;

    int d(@NonNull ByteBuffer byteBuffer, @NonNull mr mrVar) throws IOException;
}
