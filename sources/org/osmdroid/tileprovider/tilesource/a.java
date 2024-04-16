package org.osmdroid.tileprovider.tilesource;

import android.graphics.drawable.Drawable;
import java.io.InputStream;
import org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase;
/* compiled from: ITileSource.java */
/* loaded from: classes3.dex */
public interface a {
    Drawable a(InputStream inputStream) throws BitmapTileSourceBase.LowMemoryException;

    Drawable b(String str) throws BitmapTileSourceBase.LowMemoryException;

    int c();

    String d(long j);

    int e();

    int f();

    String name();
}
