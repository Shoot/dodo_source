package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
/* compiled from: DefaultOnHeaderDecodedListener.java */
/* renamed from: dr2  reason: default package */
/* loaded from: classes.dex */
public final class dr2 implements ImageDecoder.OnHeaderDecodedListener {
    private final xm4 a = xm4.b();
    private final int b;
    private final int c;
    private final qo2 d;
    private final a73 e;
    private final boolean f;
    private final mi8 g;

    /* compiled from: DefaultOnHeaderDecodedListener.java */
    /* renamed from: dr2$a */
    /* loaded from: classes.dex */
    class a implements ImageDecoder.OnPartialImageListener {
        a() {
        }

        @Override // android.graphics.ImageDecoder.OnPartialImageListener
        public boolean onPartialImage(@NonNull ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public dr2(int i, int i2, @NonNull ac7 ac7Var) {
        boolean z;
        this.b = i;
        this.c = i2;
        this.d = (qo2) ac7Var.c(g73.f);
        this.e = (a73) ac7Var.c(a73.h);
        mb7<Boolean> mb7Var = g73.j;
        if (ac7Var.c(mb7Var) != null && ((Boolean) ac7Var.c(mb7Var)).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        this.f = z;
        this.g = (mi8) ac7Var.c(g73.g);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public void onHeaderDecoded(@NonNull ImageDecoder imageDecoder, @NonNull ImageDecoder.ImageInfo imageInfo, @NonNull ImageDecoder.Source source) {
        Size size;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        if (this.a.f(this.b, this.c, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == qo2.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        size = imageInfo.getSize();
        int i = this.b;
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        int i2 = this.c;
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float b = this.e.b(size.getWidth(), size.getHeight(), i, i2);
        int round = Math.round(size.getWidth() * b);
        int round2 = Math.round(size.getHeight() * b);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b);
        }
        imageDecoder.setTargetSize(round, round2);
        mi8 mi8Var = this.g;
        if (mi8Var != null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                if (mi8Var == mi8.DISPLAY_P3) {
                    colorSpace3 = imageInfo.getColorSpace();
                    if (colorSpace3 != null) {
                        colorSpace4 = imageInfo.getColorSpace();
                        isWideGamut = colorSpace4.isWideGamut();
                        if (isWideGamut) {
                            named2 = ColorSpace.Named.DISPLAY_P3;
                            colorSpace2 = ColorSpace.get(named2);
                            imageDecoder.setTargetColorSpace(colorSpace2);
                        }
                    }
                }
                named2 = ColorSpace.Named.SRGB;
                colorSpace2 = ColorSpace.get(named2);
                imageDecoder.setTargetColorSpace(colorSpace2);
            } else if (i3 >= 26) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                imageDecoder.setTargetColorSpace(colorSpace);
            }
        }
    }
}
