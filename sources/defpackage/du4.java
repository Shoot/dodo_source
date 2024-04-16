package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import ch.qos.logback.core.net.SyslogConstants;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ImageAssetManager.java */
/* renamed from: du4  reason: default package */
/* loaded from: classes.dex */
public class du4 {
    private static final Object d = new Object();
    private final Context a;
    private final String b;
    private final Map<String, rz5> c;

    public du4(Drawable.Callback callback, String str, cu4 cu4Var, Map<String, rz5> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.b = str + '/';
        } else {
            this.b = str;
        }
        if (!(callback instanceof View)) {
            ox5.c("LottieDrawable must be inside of a view for images to work.");
            this.c = new HashMap();
            this.a = null;
            return;
        }
        this.a = ((View) callback).getContext();
        this.c = map;
        d(cu4Var);
    }

    private Bitmap c(String str, Bitmap bitmap) {
        synchronized (d) {
            this.c.get(str).f(bitmap);
        }
        return bitmap;
    }

    public Bitmap a(String str) {
        rz5 rz5Var = this.c.get(str);
        if (rz5Var == null) {
            return null;
        }
        Bitmap a = rz5Var.a();
        if (a != null) {
            return a;
        }
        String b = rz5Var.b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = SyslogConstants.LOG_LOCAL4;
        if (b.startsWith("data:") && b.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(b.substring(b.indexOf(44) + 1), 0);
                return c(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e) {
                ox5.d("data URL did not have correct base64 format.", e);
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.b)) {
                AssetManager assets = this.a.getAssets();
                try {
                    return c(str, fvb.l(BitmapFactory.decodeStream(assets.open(this.b + b), null, options), rz5Var.e(), rz5Var.c()));
                } catch (IllegalArgumentException e2) {
                    ox5.d("Unable to decode image.", e2);
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException e3) {
            ox5.d("Unable to open asset.", e3);
            return null;
        }
    }

    public boolean b(Context context) {
        if ((context == null && this.a == null) || this.a.equals(context)) {
            return true;
        }
        return false;
    }

    public void d(cu4 cu4Var) {
    }
}
