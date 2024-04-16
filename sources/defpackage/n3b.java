package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;
/* compiled from: SvgSupport.java */
/* renamed from: n3b  reason: default package */
/* loaded from: classes3.dex */
public abstract class n3b {
    private static final boolean a;

    static {
        boolean z;
        try {
            Class.forName("com.caverock.androidsvg.SVG");
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
        return "`com.caverock:androidsvg:*` dependency is missing, please add to your project explicitly if you wish to use SVG media-decoder";
    }
}
