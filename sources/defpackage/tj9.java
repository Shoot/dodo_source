package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.List;
/* compiled from: ResourceDrawableDecoder.java */
/* renamed from: tj9  reason: default package */
/* loaded from: classes.dex */
public class tj9 implements rj9<Uri, Drawable> {
    public static final mb7<Resources.Theme> b = mb7.e("com.bumptech.glide.load.resource.bitmap.Downsampler.Theme");
    private final Context a;

    public tj9(Context context) {
        this.a = context.getApplicationContext();
    }

    @NonNull
    private Context d(Uri uri, @NonNull String str) {
        if (str.equals(this.a.getPackageName())) {
            return this.a;
        }
        try {
            return this.a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.a.getPackageName())) {
                return this.a;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e);
        }
    }

    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri, e);
        }
    }

    private int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: " + uri);
    }

    private int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
    }

    @Override // defpackage.rj9
    /* renamed from: c */
    public nj9<Drawable> b(@NonNull Uri uri, int i, int i2, @NonNull ac7 ac7Var) {
        Resources.Theme theme;
        Drawable a;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            Context d = d(uri, authority);
            int g = g(d, uri);
            if (((String) eh8.d(authority)).equals(this.a.getPackageName())) {
                theme = (Resources.Theme) ac7Var.c(b);
            } else {
                theme = null;
            }
            if (theme == null) {
                a = j83.b(this.a, d, g);
            } else {
                a = j83.a(this.a, g, theme);
            }
            return c07.e(a);
        }
        throw new IllegalStateException("Package name for " + uri + " is null or empty");
    }

    @Override // defpackage.rj9
    /* renamed from: h */
    public boolean a(@NonNull Uri uri, @NonNull ac7 ac7Var) {
        String scheme = uri.getScheme();
        if (scheme != null && scheme.equals("android.resource")) {
            return true;
        }
        return false;
    }
}
