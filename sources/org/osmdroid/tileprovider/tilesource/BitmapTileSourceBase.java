package org.osmdroid.tileprovider.tilesource;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.io.File;
import java.io.InputStream;
import java.util.Random;
/* loaded from: classes3.dex */
public abstract class BitmapTileSourceBase implements a {
    private static int i;
    private final int a;
    private final int b;
    private final int c;
    protected String d;
    protected String e;
    protected final String f;
    protected final Random g = new Random();
    private final int h;

    /* loaded from: classes3.dex */
    public static final class LowMemoryException extends Exception {
        public LowMemoryException(Throwable th) {
            super(th);
        }
    }

    public BitmapTileSourceBase(String str, int i2, int i3, int i4, String str2, String str3) {
        int i5 = i;
        i = i5 + 1;
        this.c = i5;
        this.d = str;
        this.a = i2;
        this.b = i3;
        this.h = i4;
        this.f = str2;
        this.e = str3;
    }

    @Override // org.osmdroid.tileprovider.tilesource.a
    public Drawable a(InputStream inputStream) throws LowMemoryException {
        try {
            int i2 = this.h;
            if (inputStream.markSupported()) {
                inputStream.mark(1048576);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStream, null, options);
                i2 = options.outHeight;
                inputStream.reset();
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            fc0.d().b(options2, i2, i2);
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options2);
            if (decodeStream != null) {
                return new bm9(decodeStream);
            }
        } catch (Exception e) {
            Log.w("OsmDroid", "#547 Error loading bitmap" + i(), e);
        } catch (OutOfMemoryError e2) {
            Log.e("OsmDroid", "OutOfMemoryError loading bitmap");
            System.gc();
            throw new LowMemoryException(e2);
        }
        return null;
    }

    @Override // org.osmdroid.tileprovider.tilesource.a
    public Drawable b(String str) throws LowMemoryException {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i2 = options.outHeight;
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            fc0.d().b(options2, i2, i2);
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options2);
            if (decodeFile != null) {
                return new bm9(decodeFile);
            }
            if (new File(str).exists()) {
                Log.d("OsmDroid", str + " is an invalid image file, deleting...");
                try {
                    new File(str).delete();
                    return null;
                } catch (Throwable th) {
                    Log.e("OsmDroid", "Error deleting invalid file: " + str, th);
                    return null;
                }
            }
            Log.d("OsmDroid", "Request tile: " + str + " does not exist");
            return null;
        } catch (Exception e) {
            Log.e("OsmDroid", "Unexpected error loading bitmap: " + str, e);
            zx1.b = zx1.b + 1;
            System.gc();
            return null;
        } catch (OutOfMemoryError e2) {
            Log.e("OsmDroid", "OutOfMemoryError loading bitmap: " + str);
            System.gc();
            throw new LowMemoryException(e2);
        }
    }

    @Override // org.osmdroid.tileprovider.tilesource.a
    public int c() {
        return this.h;
    }

    @Override // org.osmdroid.tileprovider.tilesource.a
    public String d(long j) {
        return i() + '/' + k76.e(j) + '/' + k76.c(j) + '/' + k76.d(j) + h();
    }

    @Override // org.osmdroid.tileprovider.tilesource.a
    public int e() {
        return this.a;
    }

    @Override // org.osmdroid.tileprovider.tilesource.a
    public int f() {
        return this.b;
    }

    public String h() {
        return this.f;
    }

    public String i() {
        return this.d;
    }

    @Override // org.osmdroid.tileprovider.tilesource.a
    public String name() {
        return this.d;
    }

    public String toString() {
        return name();
    }
}
