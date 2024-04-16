package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.versionedparcelable.CustomVersionedParcelable;
import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;
    public int a;
    Object b;
    public byte[] c;
    public Parcelable d;
    public int e;
    public int f;
    public ColorStateList g;
    PorterDuff.Mode h;
    public String i;
    public String j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {
        static IconCompat a(@NonNull Object obj) {
            kh8.f(obj);
            int d = d(obj);
            if (d != 2) {
                if (d != 4) {
                    if (d != 6) {
                        IconCompat iconCompat = new IconCompat(-1);
                        iconCompat.b = obj;
                        return iconCompat;
                    }
                    return IconCompat.d(e(obj));
                }
                return IconCompat.g(e(obj));
            }
            return IconCompat.j(null, c(obj), b(obj));
        }

        static int b(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon resource", e);
                return 0;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon resource", e2);
                return 0;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon resource", e3);
                return 0;
            }
        }

        static String c(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon package", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon package", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon package", e3);
                return null;
            }
        }

        static int d(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e);
                return -1;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                return -1;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                return -1;
            }
        }

        static Uri e(@NonNull Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                Log.e("IconCompat", "Unable to get icon uri", e);
                return null;
            } catch (NoSuchMethodException e2) {
                Log.e("IconCompat", "Unable to get icon uri", e2);
                return null;
            } catch (InvocationTargetException e3) {
                Log.e("IconCompat", "Unable to get icon uri", e3);
                return null;
            }
        }

        static Drawable f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        static Icon g(IconCompat iconCompat, Context context) {
            Icon createWithBitmap;
            switch (iconCompat.a) {
                case -1:
                    return (Icon) iconCompat.b;
                case 0:
                default:
                    throw new IllegalArgumentException("Unknown type");
                case 1:
                    createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.b);
                    break;
                case 2:
                    createWithBitmap = Icon.createWithResource(iconCompat.m(), iconCompat.e);
                    break;
                case 3:
                    createWithBitmap = Icon.createWithData((byte[]) iconCompat.b, iconCompat.e, iconCompat.f);
                    break;
                case 4:
                    createWithBitmap = Icon.createWithContentUri((String) iconCompat.b);
                    break;
                case 5:
                    if (Build.VERSION.SDK_INT >= 26) {
                        createWithBitmap = b.b((Bitmap) iconCompat.b);
                        break;
                    } else {
                        createWithBitmap = Icon.createWithBitmap(IconCompat.c((Bitmap) iconCompat.b, false));
                        break;
                    }
                case 6:
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30) {
                        createWithBitmap = d.a(iconCompat.p());
                        break;
                    } else if (context != null) {
                        InputStream q = iconCompat.q(context);
                        if (q != null) {
                            if (i >= 26) {
                                createWithBitmap = b.b(BitmapFactory.decodeStream(q));
                                break;
                            } else {
                                createWithBitmap = Icon.createWithBitmap(IconCompat.c(BitmapFactory.decodeStream(q), false));
                                break;
                            }
                        } else {
                            throw new IllegalStateException("Cannot load adaptive icon from uri: " + iconCompat.p());
                        }
                    } else {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + iconCompat.p());
                    }
            }
            ColorStateList colorStateList = iconCompat.g;
            if (colorStateList != null) {
                createWithBitmap.setTintList(colorStateList);
            }
            PorterDuff.Mode mode = iconCompat.h;
            if (mode != IconCompat.k) {
                createWithBitmap.setTintMode(mode);
            }
            return createWithBitmap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.a = -1;
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = k;
        this.i = null;
    }

    public static IconCompat b(@NonNull Icon icon) {
        return a.a(icon);
    }

    static Bitmap c(Bitmap bitmap, boolean z) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    @NonNull
    public static IconCompat d(@NonNull Uri uri) {
        p57.c(uri);
        return e(uri.toString());
    }

    @NonNull
    public static IconCompat e(@NonNull String str) {
        p57.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.b = str;
        return iconCompat;
    }

    @NonNull
    public static IconCompat f(@NonNull Bitmap bitmap) {
        p57.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.b = bitmap;
        return iconCompat;
    }

    @NonNull
    public static IconCompat g(@NonNull Uri uri) {
        p57.c(uri);
        return h(uri.toString());
    }

    @NonNull
    public static IconCompat h(@NonNull String str) {
        p57.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.b = str;
        return iconCompat;
    }

    @NonNull
    public static IconCompat i(@NonNull Context context, int i) {
        p57.c(context);
        return j(context.getResources(), context.getPackageName(), i);
    }

    @NonNull
    public static IconCompat j(Resources resources, @NonNull String str, int i) {
        p57.c(str);
        if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.e = i;
            if (resources != null) {
                try {
                    iconCompat.b = resources.getResourceName(i);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.b = str;
            }
            iconCompat.j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    static Resources n(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo == null) {
                return null;
            }
            return packageManager.getResourcesForApplication(applicationInfo);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e);
            return null;
        }
    }

    private Drawable s(Context context) {
        switch (this.a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.b);
            case 2:
                String m = m();
                if (TextUtils.isEmpty(m)) {
                    m = context.getPackageName();
                }
                try {
                    return ek9.f(n(context, m), this.e, context.getTheme());
                } catch (RuntimeException e) {
                    Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.e), this.b), e);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.b, this.e, this.f));
            case 4:
                InputStream q = q(context);
                if (q != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(q));
                }
                break;
            case 5:
                return new BitmapDrawable(context.getResources(), c((Bitmap) this.b, false));
            case 6:
                InputStream q2 = q(context);
                if (q2 != null) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        return b.a(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(q2)));
                    }
                    return new BitmapDrawable(context.getResources(), c(BitmapFactory.decodeStream(q2), false));
                }
                break;
        }
        return null;
    }

    private static String x(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
    }

    public void a(@NonNull Context context) {
        Object obj;
        if (this.a == 2 && (obj = this.b) != null) {
            String str = (String) obj;
            if (!str.contains(":")) {
                return;
            }
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split("/", -1)[0];
            String str4 = str2.split("/", -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String m = m();
            int identifier = n(context, m).getIdentifier(str4, str3, str5);
            if (this.e != identifier) {
                Log.i("IconCompat", "Id has changed for " + m + " " + str);
                this.e = identifier;
            }
        }
    }

    public Bitmap k() {
        int i = this.a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        } else if (i == 1) {
            return (Bitmap) this.b;
        } else {
            if (i == 5) {
                return c((Bitmap) this.b, true);
            }
            throw new IllegalStateException("called getBitmap() on " + this);
        }
    }

    public int l() {
        int i = this.a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.b(this.b);
        }
        if (i == 2) {
            return this.e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    @NonNull
    public String m() {
        int i = this.a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.c(this.b);
        }
        if (i == 2) {
            String str = this.j;
            if (str != null && !TextUtils.isEmpty(str)) {
                return this.j;
            }
            return ((String) this.b).split(":", -1)[0];
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int o() {
        int i = this.a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.d(this.b);
        }
        return i;
    }

    @NonNull
    public Uri p() {
        int i = this.a;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.e(this.b);
        }
        if (i != 4 && i != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.b);
    }

    public InputStream q(@NonNull Context context) {
        Uri p = p();
        String scheme = p.getScheme();
        if (!RemoteMessageConst.Notification.CONTENT.equals(scheme) && !Action.FILE_ATTRIBUTE.equals(scheme)) {
            try {
                return new FileInputStream(new File((String) this.b));
            } catch (FileNotFoundException e) {
                Log.w("IconCompat", "Unable to load image from path: " + p, e);
                return null;
            }
        }
        try {
            return context.getContentResolver().openInputStream(p);
        } catch (Exception e2) {
            Log.w("IconCompat", "Unable to load image from URI: " + p, e2);
            return null;
        }
    }

    public Drawable r(@NonNull Context context) {
        a(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return a.f(w(context), context);
        }
        Drawable s = s(context);
        if (s != null && (this.g != null || this.h != k)) {
            s.mutate();
            f83.o(s, this.g);
            f83.p(s, this.h);
        }
        return s;
    }

    public void t() {
        this.h = PorterDuff.Mode.valueOf(this.i);
        switch (this.a) {
            case -1:
                Parcelable parcelable = this.d;
                if (parcelable != null) {
                    this.b = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.d;
                if (parcelable2 != null) {
                    this.b = parcelable2;
                    return;
                }
                byte[] bArr = this.c;
                this.b = bArr;
                this.a = 3;
                this.e = 0;
                this.f = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.c, Charset.forName("UTF-16"));
                this.b = str;
                if (this.a == 2 && this.j == null) {
                    this.j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.b = this.c;
                return;
        }
    }

    @NonNull
    public String toString() {
        if (this.a == -1) {
            return String.valueOf(this.b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(x(this.a));
        switch (this.a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(l())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.e);
                if (this.f != 0) {
                    sb.append(" off=");
                    sb.append(this.f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.b);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != k) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u(boolean z) {
        this.i = this.h.name();
        switch (this.a) {
            case -1:
                if (!z) {
                    this.d = (Parcelable) this.b;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ((Bitmap) this.b).compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.c = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.d = (Parcelable) this.b;
                return;
            case 2:
                this.c = ((String) this.b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.c = (byte[]) this.b;
                return;
            case 4:
            case 6:
                this.c = this.b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    @NonNull
    @Deprecated
    public Icon v() {
        return w(null);
    }

    @NonNull
    public Icon w(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.g(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    IconCompat(int i) {
        this.c = null;
        this.d = null;
        this.e = 0;
        this.f = 0;
        this.g = null;
        this.h = k;
        this.i = null;
        this.a = i;
    }
}
