package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import defpackage.jf4;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
/* compiled from: ByteBufferGifDecoder.java */
/* renamed from: xj0  reason: default package */
/* loaded from: classes.dex */
public class xj0 implements rj9<ByteBuffer, kf4> {
    private static final a f = new a();
    private static final b g = new b();
    private final Context a;
    private final List<ImageHeaderParser> b;
    private final b c;
    private final a d;
    private final if4 e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ByteBufferGifDecoder.java */
    /* renamed from: xj0$a */
    /* loaded from: classes.dex */
    public static class a {
        a() {
        }

        jf4 a(jf4.a aVar, sf4 sf4Var, ByteBuffer byteBuffer, int i) {
            return new nta(aVar, sf4Var, byteBuffer, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ByteBufferGifDecoder.java */
    /* renamed from: xj0$b */
    /* loaded from: classes.dex */
    public static class b {
        private final Queue<tf4> a = vub.g(0);

        b() {
        }

        synchronized tf4 a(ByteBuffer byteBuffer) {
            tf4 poll;
            try {
                poll = this.a.poll();
                if (poll == null) {
                    poll = new tf4();
                }
            } catch (Throwable th) {
                throw th;
            }
            return poll.p(byteBuffer);
        }

        synchronized void b(tf4 tf4Var) {
            tf4Var.a();
            this.a.offer(tf4Var);
        }
    }

    public xj0(Context context, List<ImageHeaderParser> list, gc0 gc0Var, mr mrVar) {
        this(context, list, gc0Var, mrVar, g, f);
    }

    private nf4 c(ByteBuffer byteBuffer, int i, int i2, tf4 tf4Var, ac7 ac7Var) {
        Bitmap.Config config;
        long b2 = hx5.b();
        try {
            sf4 c = tf4Var.c();
            if (c.b() > 0 && c.c() == 0) {
                if (ac7Var.c(vf4.a) == qo2.PREFER_RGB_565) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                jf4 a2 = this.d.a(this.e, c, byteBuffer, e(c, i, i2));
                a2.d(config);
                a2.b();
                Bitmap a3 = a2.a();
                if (a3 == null) {
                    if (Log.isLoggable("BufferGifDecoder", 2)) {
                        Log.v("BufferGifDecoder", "Decoded GIF from stream in " + hx5.a(b2));
                    }
                    return null;
                }
                nf4 nf4Var = new nf4(new kf4(this.a, a2, uqb.c(), i, i2, a3));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + hx5.a(b2));
                }
                return nf4Var;
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + hx5.a(b2));
            }
        }
    }

    private static int e(sf4 sf4Var, int i, int i2) {
        int highestOneBit;
        int min = Math.min(sf4Var.a() / i2, sf4Var.d() / i);
        if (min == 0) {
            highestOneBit = 0;
        } else {
            highestOneBit = Integer.highestOneBit(min);
        }
        int max = Math.max(1, highestOneBit);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + sf4Var.d() + "x" + sf4Var.a() + "]");
        }
        return max;
    }

    @Override // defpackage.rj9
    /* renamed from: d */
    public nf4 b(@NonNull ByteBuffer byteBuffer, int i, int i2, @NonNull ac7 ac7Var) {
        tf4 a2 = this.c.a(byteBuffer);
        try {
            return c(byteBuffer, i, i2, a2, ac7Var);
        } finally {
            this.c.b(a2);
        }
    }

    @Override // defpackage.rj9
    /* renamed from: f */
    public boolean a(@NonNull ByteBuffer byteBuffer, @NonNull ac7 ac7Var) throws IOException {
        if (!((Boolean) ac7Var.c(vf4.b)).booleanValue() && com.bumptech.glide.load.a.g(this.b, byteBuffer) == ImageHeaderParser.ImageType.GIF) {
            return true;
        }
        return false;
    }

    xj0(Context context, List<ImageHeaderParser> list, gc0 gc0Var, mr mrVar, b bVar, a aVar) {
        this.a = context.getApplicationContext();
        this.b = list;
        this.d = aVar;
        this.e = new if4(gc0Var, mrVar);
        this.c = bVar;
    }
}
