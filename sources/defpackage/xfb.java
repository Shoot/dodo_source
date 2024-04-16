package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Map;
import org.osmdroid.tileprovider.modules.CantContinueException;
import org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase;
/* compiled from: TileDownloader.java */
/* renamed from: xfb  reason: default package */
/* loaded from: classes3.dex */
public class xfb {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v56 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r24v0, types: [ur4] */
    /* JADX WARN: Type inference failed for: r25v0, types: [org.osmdroid.tileprovider.tilesource.a, org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase, da7] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v33, types: [java.io.OutputStream, java.io.Closeable, java.io.BufferedOutputStream] */
    /* JADX WARN: Type inference failed for: r3v36, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.lang.StringBuilder] */
    public Drawable a(long j, int i, String str, ur4 ur4Var, da7 da7Var) throws CantContinueException {
        Throwable th;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayInputStream byteArrayInputStream;
        HttpURLConnection httpURLConnection;
        ByteArrayOutputStream byteArrayOutputStream2;
        BitmapTileSourceBase.LowMemoryException lowMemoryException;
        ByteArrayOutputStream byteArrayOutputStream3;
        Closeable closeable;
        ByteArrayInputStream byteArrayInputStream2;
        IOException iOException;
        InputStream inputStream2;
        ByteArrayOutputStream byteArrayOutputStream4;
        ByteArrayOutputStream byteArrayOutputStream5;
        UnknownHostException unknownHostException;
        InputStream inputStream3;
        ByteArrayOutputStream byteArrayOutputStream6;
        ByteArrayOutputStream byteArrayOutputStream7;
        FileNotFoundException fileNotFoundException;
        InputStream inputStream4;
        ByteArrayOutputStream byteArrayOutputStream8;
        ByteArrayOutputStream byteArrayOutputStream9;
        Throwable th2;
        Closeable closeable2;
        ByteArrayOutputStream byteArrayOutputStream10;
        ?? r1;
        InputStream inputStream5;
        ByteArrayOutputStream byteArrayOutputStream11;
        InputStream inputStream6;
        ByteArrayOutputStream byteArrayOutputStream12;
        InputStream inputStream7;
        ByteArrayOutputStream byteArrayOutputStream13;
        InputStream inputStream8;
        ByteArrayOutputStream byteArrayOutputStream14;
        ByteArrayOutputStream byteArrayOutputStream15;
        ByteArrayOutputStream byteArrayOutputStream16;
        ByteArrayOutputStream byteArrayOutputStream17;
        ByteArrayOutputStream byteArrayOutputStream18;
        ByteArrayOutputStream byteArrayOutputStream19;
        InputStream inputStream9;
        ByteArrayOutputStream byteArrayOutputStream20;
        InputStream inputStream10;
        ByteArrayOutputStream byteArrayOutputStream21;
        InputStream inputStream11;
        ByteArrayOutputStream byteArrayOutputStream22;
        InputStream inputStream12;
        InputStream inputStream13;
        ByteArrayOutputStream byteArrayOutputStream23;
        ?? r3;
        ?? r12 = i;
        ?? r2 = str;
        ?? r32 = "https://";
        Object obj = null;
        if (r12 > 3) {
            return null;
        }
        String m = da7Var.l().i() ? dq1.a().m() : null;
        if (m == null) {
            m = dq1.a().o();
        }
        if (!da7Var.l().c(m)) {
            Log.e("OsmDroid", "Please configure a relevant user agent; current value is: " + m);
            return null;
        }
        try {
            try {
                if (dq1.a().v()) {
                    Log.d("OsmDroid", "Downloading Maptile from url: " + r2);
                }
                if (!TextUtils.isEmpty(str)) {
                    if (dq1.a().r() != null) {
                        httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(r2).openConnection(dq1.a().r())));
                    } else {
                        httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(r2).openConnection()));
                    }
                    try {
                        httpURLConnection.setUseCaches(true);
                        httpURLConnection.setRequestProperty(dq1.a().l(), m);
                        for (Map.Entry<String, String> entry : dq1.a().i().entrySet()) {
                            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                        }
                        httpURLConnection.connect();
                        if (httpURLConnection.getResponseCode() != 200) {
                            int responseCode = httpURLConnection.getResponseCode();
                            if ((responseCode == 301 || responseCode == 302 || responseCode == 307 || responseCode == 308) && dq1.a().z()) {
                                String headerField = httpURLConnection.getHeaderField("Location");
                                if (headerField != null) {
                                    if (headerField.startsWith("/")) {
                                        URL url = new URL(r2);
                                        int port = url.getPort();
                                        boolean startsWith = str.toLowerCase().startsWith("https://");
                                        if (port == -1) {
                                            port = str.toLowerCase().startsWith("http://") ? 80 : 443;
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(startsWith ? r32 : "http");
                                        sb.append(url.getHost());
                                        sb.append(":");
                                        sb.append(port);
                                        sb.append(headerField);
                                        headerField = sb.toString();
                                    }
                                    Log.i("OsmDroid", "Http redirect for MapTile: " + k76.h(j) + " HTTP response: " + httpURLConnection.getResponseMessage() + " to url " + headerField);
                                    Drawable a = a(j, r12 + 1, headerField, ur4Var, da7Var);
                                    xya.a(null);
                                    xya.a(null);
                                    xya.a(null);
                                    xya.a(null);
                                    try {
                                        httpURLConnection.disconnect();
                                    } catch (Exception unused) {
                                    }
                                    return a;
                                }
                            } else {
                                Log.w("OsmDroid", "Problem downloading MapTile: " + k76.h(j) + " HTTP response: " + httpURLConnection.getResponseMessage());
                                if (dq1.a().H()) {
                                    Log.d("OsmDroid", r2);
                                }
                                zx1.b++;
                                xya.a(httpURLConnection.getErrorStream());
                                xya.a(null);
                                xya.a(null);
                                xya.a(null);
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Exception unused2) {
                                }
                                return null;
                            }
                        }
                        String headerField2 = httpURLConnection.getHeaderField("Content-Type");
                        if (dq1.a().H()) {
                            Log.d("OsmDroid", r2 + " success, mime is " + headerField2);
                        }
                        if (headerField2 != null && !headerField2.toLowerCase().contains(ElementGenerator.TYPE_IMAGE)) {
                            Log.w("OsmDroid", r2 + " success, however the mime type does not appear to be an image " + headerField2);
                        }
                        inputStream13 = httpURLConnection.getInputStream();
                    } catch (FileNotFoundException e) {
                        fileNotFoundException = e;
                        inputStream8 = null;
                        byteArrayOutputStream14 = null;
                    } catch (UnknownHostException e2) {
                        unknownHostException = e2;
                        inputStream7 = null;
                        byteArrayOutputStream13 = null;
                    } catch (IOException e3) {
                        iOException = e3;
                        inputStream6 = null;
                        byteArrayOutputStream12 = null;
                    } catch (BitmapTileSourceBase.LowMemoryException e4) {
                        lowMemoryException = e4;
                        byteArrayOutputStream3 = null;
                        closeable = null;
                        byteArrayInputStream2 = null;
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream5 = null;
                        byteArrayOutputStream11 = null;
                    }
                    try {
                        byteArrayOutputStream23 = new ByteArrayOutputStream();
                        try {
                            r3 = new BufferedOutputStream(byteArrayOutputStream23, 8192);
                            try {
                                long e5 = da7Var.l().e(httpURLConnection, System.currentTimeMillis());
                                xya.b(inputStream13, r3);
                                r3.flush();
                                byteArrayOutputStream2 = new ByteArrayInputStream(byteArrayOutputStream23.toByteArray());
                                if (ur4Var != 0) {
                                    try {
                                        byteArrayInputStream2 = byteArrayOutputStream2;
                                    } catch (FileNotFoundException e6) {
                                        e = e6;
                                        fileNotFoundException = e;
                                        inputStream4 = inputStream13;
                                        byteArrayOutputStream8 = byteArrayOutputStream23;
                                        byteArrayOutputStream9 = r3;
                                        zx1.b++;
                                        Log.w("OsmDroid", "Tile not found: " + k76.h(j) + " : " + fileNotFoundException);
                                        r12 = inputStream4;
                                        r2 = byteArrayOutputStream8;
                                        r32 = byteArrayOutputStream9;
                                        xya.a(r12);
                                        xya.a(r32);
                                        xya.a(byteArrayOutputStream2);
                                        xya.a(r2);
                                        try {
                                            httpURLConnection.disconnect();
                                        } catch (Exception unused3) {
                                        }
                                        return null;
                                    } catch (UnknownHostException e7) {
                                        e = e7;
                                        unknownHostException = e;
                                        inputStream3 = inputStream13;
                                        byteArrayOutputStream6 = byteArrayOutputStream23;
                                        byteArrayOutputStream7 = r3;
                                        Log.w("OsmDroid", "UnknownHostException downloading MapTile: " + k76.h(j) + " : " + unknownHostException);
                                        zx1.b = zx1.b + 1;
                                        r12 = inputStream3;
                                        r2 = byteArrayOutputStream6;
                                        r32 = byteArrayOutputStream7;
                                        xya.a(r12);
                                        xya.a(r32);
                                        xya.a(byteArrayOutputStream2);
                                        xya.a(r2);
                                        httpURLConnection.disconnect();
                                        return null;
                                    } catch (IOException e8) {
                                        e = e8;
                                        iOException = e;
                                        inputStream2 = inputStream13;
                                        byteArrayOutputStream4 = byteArrayOutputStream23;
                                        byteArrayOutputStream5 = r3;
                                        zx1.b++;
                                        Log.w("OsmDroid", "IOException downloading MapTile: " + k76.h(j) + " : " + iOException);
                                        r12 = inputStream2;
                                        r2 = byteArrayOutputStream4;
                                        r32 = byteArrayOutputStream5;
                                        xya.a(r12);
                                        xya.a(r32);
                                        xya.a(byteArrayOutputStream2);
                                        xya.a(r2);
                                        httpURLConnection.disconnect();
                                        return null;
                                    } catch (BitmapTileSourceBase.LowMemoryException e9) {
                                        e = e9;
                                        byteArrayInputStream2 = byteArrayOutputStream2;
                                        obj = inputStream13;
                                        lowMemoryException = e;
                                        byteArrayOutputStream3 = byteArrayOutputStream23;
                                        closeable = r3;
                                        try {
                                            zx1.a++;
                                            Log.w("OsmDroid", "LowMemoryException downloading MapTile: " + k76.h(j) + " : " + lowMemoryException);
                                            throw new CantContinueException(lowMemoryException);
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                            byteArrayOutputStream2 = byteArrayInputStream2;
                                            r1 = obj;
                                            byteArrayOutputStream10 = byteArrayOutputStream3;
                                            closeable2 = closeable;
                                            xya.a(r1);
                                            xya.a(closeable2);
                                            xya.a(byteArrayOutputStream2);
                                            xya.a(byteArrayOutputStream10);
                                            try {
                                                httpURLConnection.disconnect();
                                            } catch (Exception unused4) {
                                            }
                                            throw th2;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        inputStream = inputStream13;
                                        byteArrayOutputStream = byteArrayOutputStream23;
                                        byteArrayInputStream = r3;
                                        zx1.b++;
                                        Log.e("OsmDroid", "Error downloading MapTile: " + k76.h(j), th);
                                        r12 = inputStream;
                                        r2 = byteArrayOutputStream;
                                        r32 = byteArrayInputStream;
                                        xya.a(r12);
                                        xya.a(r32);
                                        xya.a(byteArrayOutputStream2);
                                        xya.a(r2);
                                        httpURLConnection.disconnect();
                                        return null;
                                    }
                                    try {
                                        ur4Var.a(da7Var, j, byteArrayInputStream2, Long.valueOf(e5));
                                        byteArrayInputStream2.reset();
                                    } catch (FileNotFoundException e10) {
                                        e = e10;
                                        byteArrayOutputStream2 = byteArrayInputStream2;
                                        fileNotFoundException = e;
                                        inputStream4 = inputStream13;
                                        byteArrayOutputStream8 = byteArrayOutputStream23;
                                        byteArrayOutputStream9 = r3;
                                        zx1.b++;
                                        Log.w("OsmDroid", "Tile not found: " + k76.h(j) + " : " + fileNotFoundException);
                                        r12 = inputStream4;
                                        r2 = byteArrayOutputStream8;
                                        r32 = byteArrayOutputStream9;
                                        xya.a(r12);
                                        xya.a(r32);
                                        xya.a(byteArrayOutputStream2);
                                        xya.a(r2);
                                        httpURLConnection.disconnect();
                                        return null;
                                    } catch (UnknownHostException e11) {
                                        e = e11;
                                        byteArrayOutputStream2 = byteArrayInputStream2;
                                        unknownHostException = e;
                                        inputStream3 = inputStream13;
                                        byteArrayOutputStream6 = byteArrayOutputStream23;
                                        byteArrayOutputStream7 = r3;
                                        Log.w("OsmDroid", "UnknownHostException downloading MapTile: " + k76.h(j) + " : " + unknownHostException);
                                        zx1.b = zx1.b + 1;
                                        r12 = inputStream3;
                                        r2 = byteArrayOutputStream6;
                                        r32 = byteArrayOutputStream7;
                                        xya.a(r12);
                                        xya.a(r32);
                                        xya.a(byteArrayOutputStream2);
                                        xya.a(r2);
                                        httpURLConnection.disconnect();
                                        return null;
                                    } catch (IOException e12) {
                                        e = e12;
                                        byteArrayOutputStream2 = byteArrayInputStream2;
                                        iOException = e;
                                        inputStream2 = inputStream13;
                                        byteArrayOutputStream4 = byteArrayOutputStream23;
                                        byteArrayOutputStream5 = r3;
                                        zx1.b++;
                                        Log.w("OsmDroid", "IOException downloading MapTile: " + k76.h(j) + " : " + iOException);
                                        r12 = inputStream2;
                                        r2 = byteArrayOutputStream4;
                                        r32 = byteArrayOutputStream5;
                                        xya.a(r12);
                                        xya.a(r32);
                                        xya.a(byteArrayOutputStream2);
                                        xya.a(r2);
                                        httpURLConnection.disconnect();
                                        return null;
                                    } catch (BitmapTileSourceBase.LowMemoryException e13) {
                                        e = e13;
                                        obj = inputStream13;
                                        lowMemoryException = e;
                                        byteArrayOutputStream3 = byteArrayOutputStream23;
                                        closeable = r3;
                                        zx1.a++;
                                        Log.w("OsmDroid", "LowMemoryException downloading MapTile: " + k76.h(j) + " : " + lowMemoryException);
                                        throw new CantContinueException(lowMemoryException);
                                    } catch (Throwable th6) {
                                        th = th6;
                                        byteArrayOutputStream2 = byteArrayInputStream2;
                                        inputStream = inputStream13;
                                        byteArrayOutputStream = byteArrayOutputStream23;
                                        byteArrayInputStream = r3;
                                        zx1.b++;
                                        Log.e("OsmDroid", "Error downloading MapTile: " + k76.h(j), th);
                                        r12 = inputStream;
                                        r2 = byteArrayOutputStream;
                                        r32 = byteArrayInputStream;
                                        xya.a(r12);
                                        xya.a(r32);
                                        xya.a(byteArrayOutputStream2);
                                        xya.a(r2);
                                        httpURLConnection.disconnect();
                                        return null;
                                    }
                                } else {
                                    byteArrayInputStream2 = byteArrayOutputStream2;
                                }
                                Drawable a2 = da7Var.a(byteArrayInputStream2);
                                xya.a(inputStream13);
                                xya.a(r3);
                                xya.a(byteArrayInputStream2);
                                xya.a(byteArrayOutputStream23);
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Exception unused5) {
                                }
                                return a2;
                            } catch (FileNotFoundException e14) {
                                fileNotFoundException = e14;
                                byteArrayOutputStream2 = null;
                                inputStream4 = inputStream13;
                                byteArrayOutputStream8 = byteArrayOutputStream23;
                                byteArrayOutputStream9 = r3;
                            } catch (UnknownHostException e15) {
                                unknownHostException = e15;
                                byteArrayOutputStream2 = null;
                                inputStream3 = inputStream13;
                                byteArrayOutputStream6 = byteArrayOutputStream23;
                                byteArrayOutputStream7 = r3;
                            } catch (IOException e16) {
                                iOException = e16;
                                byteArrayOutputStream2 = null;
                                inputStream2 = inputStream13;
                                byteArrayOutputStream4 = byteArrayOutputStream23;
                                byteArrayOutputStream5 = r3;
                            } catch (BitmapTileSourceBase.LowMemoryException e17) {
                                e = e17;
                                byteArrayInputStream2 = null;
                            } catch (Throwable th7) {
                                th = th7;
                                byteArrayOutputStream2 = null;
                                inputStream = inputStream13;
                                byteArrayOutputStream = byteArrayOutputStream23;
                                byteArrayInputStream = r3;
                            }
                        } catch (FileNotFoundException e18) {
                            fileNotFoundException = e18;
                            byteArrayOutputStream18 = null;
                            inputStream12 = inputStream13;
                            byteArrayOutputStream22 = byteArrayOutputStream23;
                            byteArrayOutputStream2 = byteArrayOutputStream18;
                            inputStream4 = inputStream12;
                            byteArrayOutputStream8 = byteArrayOutputStream22;
                            byteArrayOutputStream9 = byteArrayOutputStream18;
                            zx1.b++;
                            Log.w("OsmDroid", "Tile not found: " + k76.h(j) + " : " + fileNotFoundException);
                            r12 = inputStream4;
                            r2 = byteArrayOutputStream8;
                            r32 = byteArrayOutputStream9;
                            xya.a(r12);
                            xya.a(r32);
                            xya.a(byteArrayOutputStream2);
                            xya.a(r2);
                            httpURLConnection.disconnect();
                            return null;
                        } catch (UnknownHostException e19) {
                            unknownHostException = e19;
                            byteArrayOutputStream17 = null;
                            inputStream11 = inputStream13;
                            byteArrayOutputStream21 = byteArrayOutputStream23;
                            byteArrayOutputStream2 = byteArrayOutputStream17;
                            inputStream3 = inputStream11;
                            byteArrayOutputStream6 = byteArrayOutputStream21;
                            byteArrayOutputStream7 = byteArrayOutputStream17;
                            Log.w("OsmDroid", "UnknownHostException downloading MapTile: " + k76.h(j) + " : " + unknownHostException);
                            zx1.b = zx1.b + 1;
                            r12 = inputStream3;
                            r2 = byteArrayOutputStream6;
                            r32 = byteArrayOutputStream7;
                            xya.a(r12);
                            xya.a(r32);
                            xya.a(byteArrayOutputStream2);
                            xya.a(r2);
                            httpURLConnection.disconnect();
                            return null;
                        } catch (IOException e20) {
                            iOException = e20;
                            byteArrayOutputStream16 = null;
                            inputStream10 = inputStream13;
                            byteArrayOutputStream20 = byteArrayOutputStream23;
                            byteArrayOutputStream2 = byteArrayOutputStream16;
                            inputStream2 = inputStream10;
                            byteArrayOutputStream4 = byteArrayOutputStream20;
                            byteArrayOutputStream5 = byteArrayOutputStream16;
                            zx1.b++;
                            Log.w("OsmDroid", "IOException downloading MapTile: " + k76.h(j) + " : " + iOException);
                            r12 = inputStream2;
                            r2 = byteArrayOutputStream4;
                            r32 = byteArrayOutputStream5;
                            xya.a(r12);
                            xya.a(r32);
                            xya.a(byteArrayOutputStream2);
                            xya.a(r2);
                            httpURLConnection.disconnect();
                            return null;
                        } catch (BitmapTileSourceBase.LowMemoryException e21) {
                            e = e21;
                            r3 = 0;
                            byteArrayOutputStream23 = byteArrayOutputStream23;
                            byteArrayInputStream2 = r3;
                            obj = inputStream13;
                            lowMemoryException = e;
                            byteArrayOutputStream3 = byteArrayOutputStream23;
                            closeable = r3;
                            zx1.a++;
                            Log.w("OsmDroid", "LowMemoryException downloading MapTile: " + k76.h(j) + " : " + lowMemoryException);
                            throw new CantContinueException(lowMemoryException);
                        } catch (Throwable th8) {
                            th = th8;
                            byteArrayOutputStream15 = null;
                            inputStream9 = inputStream13;
                            byteArrayOutputStream19 = byteArrayOutputStream23;
                            byteArrayOutputStream2 = byteArrayOutputStream15;
                            inputStream = inputStream9;
                            byteArrayOutputStream = byteArrayOutputStream19;
                            byteArrayInputStream = byteArrayOutputStream15;
                            zx1.b++;
                            Log.e("OsmDroid", "Error downloading MapTile: " + k76.h(j), th);
                            r12 = inputStream;
                            r2 = byteArrayOutputStream;
                            r32 = byteArrayInputStream;
                            xya.a(r12);
                            xya.a(r32);
                            xya.a(byteArrayOutputStream2);
                            xya.a(r2);
                            httpURLConnection.disconnect();
                            return null;
                        }
                    } catch (FileNotFoundException e22) {
                        fileNotFoundException = e22;
                        byteArrayOutputStream14 = null;
                        inputStream8 = inputStream13;
                        byteArrayOutputStream18 = byteArrayOutputStream14;
                        inputStream12 = inputStream8;
                        byteArrayOutputStream22 = byteArrayOutputStream14;
                        byteArrayOutputStream2 = byteArrayOutputStream18;
                        inputStream4 = inputStream12;
                        byteArrayOutputStream8 = byteArrayOutputStream22;
                        byteArrayOutputStream9 = byteArrayOutputStream18;
                        zx1.b++;
                        Log.w("OsmDroid", "Tile not found: " + k76.h(j) + " : " + fileNotFoundException);
                        r12 = inputStream4;
                        r2 = byteArrayOutputStream8;
                        r32 = byteArrayOutputStream9;
                        xya.a(r12);
                        xya.a(r32);
                        xya.a(byteArrayOutputStream2);
                        xya.a(r2);
                        httpURLConnection.disconnect();
                        return null;
                    } catch (UnknownHostException e23) {
                        unknownHostException = e23;
                        byteArrayOutputStream13 = null;
                        inputStream7 = inputStream13;
                        byteArrayOutputStream17 = byteArrayOutputStream13;
                        inputStream11 = inputStream7;
                        byteArrayOutputStream21 = byteArrayOutputStream13;
                        byteArrayOutputStream2 = byteArrayOutputStream17;
                        inputStream3 = inputStream11;
                        byteArrayOutputStream6 = byteArrayOutputStream21;
                        byteArrayOutputStream7 = byteArrayOutputStream17;
                        Log.w("OsmDroid", "UnknownHostException downloading MapTile: " + k76.h(j) + " : " + unknownHostException);
                        zx1.b = zx1.b + 1;
                        r12 = inputStream3;
                        r2 = byteArrayOutputStream6;
                        r32 = byteArrayOutputStream7;
                        xya.a(r12);
                        xya.a(r32);
                        xya.a(byteArrayOutputStream2);
                        xya.a(r2);
                        httpURLConnection.disconnect();
                        return null;
                    } catch (IOException e24) {
                        iOException = e24;
                        byteArrayOutputStream12 = null;
                        inputStream6 = inputStream13;
                        byteArrayOutputStream16 = byteArrayOutputStream12;
                        inputStream10 = inputStream6;
                        byteArrayOutputStream20 = byteArrayOutputStream12;
                        byteArrayOutputStream2 = byteArrayOutputStream16;
                        inputStream2 = inputStream10;
                        byteArrayOutputStream4 = byteArrayOutputStream20;
                        byteArrayOutputStream5 = byteArrayOutputStream16;
                        zx1.b++;
                        Log.w("OsmDroid", "IOException downloading MapTile: " + k76.h(j) + " : " + iOException);
                        r12 = inputStream2;
                        r2 = byteArrayOutputStream4;
                        r32 = byteArrayOutputStream5;
                        xya.a(r12);
                        xya.a(r32);
                        xya.a(byteArrayOutputStream2);
                        xya.a(r2);
                        httpURLConnection.disconnect();
                        return null;
                    } catch (BitmapTileSourceBase.LowMemoryException e25) {
                        e = e25;
                        byteArrayOutputStream23 = null;
                        r3 = 0;
                    } catch (Throwable th9) {
                        th = th9;
                        byteArrayOutputStream11 = null;
                        inputStream5 = inputStream13;
                        byteArrayOutputStream15 = byteArrayOutputStream11;
                        inputStream9 = inputStream5;
                        byteArrayOutputStream19 = byteArrayOutputStream11;
                        byteArrayOutputStream2 = byteArrayOutputStream15;
                        inputStream = inputStream9;
                        byteArrayOutputStream = byteArrayOutputStream19;
                        byteArrayInputStream = byteArrayOutputStream15;
                        zx1.b++;
                        Log.e("OsmDroid", "Error downloading MapTile: " + k76.h(j), th);
                        r12 = inputStream;
                        r2 = byteArrayOutputStream;
                        r32 = byteArrayInputStream;
                        xya.a(r12);
                        xya.a(r32);
                        xya.a(byteArrayOutputStream2);
                        xya.a(r2);
                        httpURLConnection.disconnect();
                        return null;
                    }
                } else {
                    xya.a(null);
                    xya.a(null);
                    xya.a(null);
                    xya.a(null);
                    try {
                        throw null;
                    } catch (Exception unused6) {
                        return null;
                    }
                }
            } catch (Throwable th10) {
                th2 = th10;
                r1 = r12;
                byteArrayOutputStream10 = r2;
                closeable2 = r32;
                xya.a(r1);
                xya.a(closeable2);
                xya.a(byteArrayOutputStream2);
                xya.a(byteArrayOutputStream10);
                httpURLConnection.disconnect();
                throw th2;
            }
        } catch (FileNotFoundException e26) {
            fileNotFoundException = e26;
            inputStream4 = null;
            byteArrayOutputStream8 = null;
            byteArrayOutputStream9 = null;
            httpURLConnection = null;
            byteArrayOutputStream2 = null;
        } catch (UnknownHostException e27) {
            unknownHostException = e27;
            inputStream3 = null;
            byteArrayOutputStream6 = null;
            byteArrayOutputStream7 = null;
            httpURLConnection = null;
            byteArrayOutputStream2 = null;
        } catch (IOException e28) {
            iOException = e28;
            inputStream2 = null;
            byteArrayOutputStream4 = null;
            byteArrayOutputStream5 = null;
            httpURLConnection = null;
            byteArrayOutputStream2 = null;
        } catch (BitmapTileSourceBase.LowMemoryException e29) {
            lowMemoryException = e29;
            byteArrayOutputStream3 = null;
            closeable = null;
            byteArrayInputStream2 = null;
            httpURLConnection = null;
        } catch (Throwable th11) {
            th = th11;
            inputStream = null;
            byteArrayOutputStream = null;
            byteArrayInputStream = null;
            httpURLConnection = null;
            byteArrayOutputStream2 = null;
        }
    }
}
