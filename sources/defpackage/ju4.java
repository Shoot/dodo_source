package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* compiled from: ImageDownload.java */
/* renamed from: ju4  reason: default package */
/* loaded from: classes2.dex */
public class ju4 implements Closeable {
    private final URL a;
    private volatile Future<?> b;
    private y6b<Bitmap> c;

    private ju4(URL url) {
        this.a = url;
    }

    private byte[] c() throws IOException {
        URLConnection openConnection = this.a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] d = jk0.d(jk0.b(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + d.length + " bytes from " + this.a);
                }
                if (d.length <= 1048576) {
                    return d;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    public static ju4 e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ju4(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(a7b a7bVar) {
        try {
            a7bVar.c(b());
        } catch (Exception e) {
            a7bVar.b(e);
        }
    }

    public Bitmap b() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.a);
        }
        byte[] c = c();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(c, 0, c.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.a);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b.cancel(true);
    }

    public y6b<Bitmap> i() {
        return (y6b) gh8.j(this.c);
    }

    public void k(ExecutorService executorService) {
        final a7b a7bVar = new a7b();
        this.b = executorService.submit(new Runnable() { // from class: iu4
            @Override // java.lang.Runnable
            public final void run() {
                ju4.this.j(a7bVar);
            }
        });
        this.c = a7bVar.a();
    }
}
