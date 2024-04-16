package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;
/* compiled from: GifSupport.java */
/* renamed from: wf4  reason: default package */
/* loaded from: classes3.dex */
public abstract class wf4 {
    private static boolean a;

    static {
        boolean z;
        try {
            Class.forName("pl.droidsonroids.gif.GifDrawable");
            z = true;
        } catch (Throwable unused) {
            Log.w("MarkwonImagesPlugin", b());
            z = false;
        }
        a = z;
    }

    public static boolean a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static String b() {
        return "`pl.droidsonroids.gif:android-gif-drawable:*` dependency is missing, please add to your project explicitly if you wish to use GIF media-decoder";
    }
}
