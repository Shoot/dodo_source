package defpackage;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
/* compiled from: FontAssetManager.java */
/* renamed from: t24  reason: default package */
/* loaded from: classes.dex */
public class t24 {
    private final AssetManager d;
    private final tq6<String> a = new tq6<>();
    private final Map<tq6<String>, Typeface> b = new HashMap();
    private final Map<String, Typeface> c = new HashMap();
    private String e = ".ttf";

    public t24(Drawable.Callback callback, s24 s24Var) {
        if (!(callback instanceof View)) {
            ox5.c("LottieDrawable must be inside of a view for images to work.");
            this.d = null;
            return;
        }
        this.d = ((View) callback).getContext().getAssets();
    }

    private Typeface a(String str) {
        Typeface typeface = this.c.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface createFromAsset = Typeface.createFromAsset(this.d, "fonts/" + str + this.e);
        this.c.put(str, createFromAsset);
        return createFromAsset;
    }

    private Typeface d(Typeface typeface, String str) {
        int i;
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        if (contains && contains2) {
            i = 3;
        } else if (contains) {
            i = 2;
        } else if (contains2) {
            i = 1;
        } else {
            i = 0;
        }
        if (typeface.getStyle() == i) {
            return typeface;
        }
        return Typeface.create(typeface, i);
    }

    public Typeface b(String str, String str2) {
        this.a.b(str, str2);
        Typeface typeface = this.b.get(this.a);
        if (typeface != null) {
            return typeface;
        }
        Typeface d = d(a(str), str2);
        this.b.put(this.a, d);
        return d;
    }

    public void c(s24 s24Var) {
    }
}
