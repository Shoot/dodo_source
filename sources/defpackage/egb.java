package defpackage;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
/* compiled from: TileWriter.java */
/* renamed from: egb  reason: default package */
/* loaded from: classes3.dex */
public class egb implements ur4 {
    private static long c = 0;
    static boolean d = false;
    Thread a;
    private long b;

    /* compiled from: TileWriter.java */
    /* renamed from: egb$a */
    /* loaded from: classes3.dex */
    class a extends Thread {
        a() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long unused = egb.c = 0L;
            egb.this.g(dq1.a().d());
            if (egb.c > dq1.a().f()) {
                egb.this.i();
            }
            if (dq1.a().v()) {
                Log.d("OsmDroid", "Finished init thread");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TileWriter.java */
    /* renamed from: egb$b */
    /* loaded from: classes3.dex */
    public class b implements Comparator<File> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(File file, File file2) {
            return Long.valueOf(file.lastModified()).compareTo(Long.valueOf(file2.lastModified()));
        }
    }

    public egb() {
        this.a = null;
        if (!d) {
            d = true;
            a aVar = new a();
            this.a = aVar;
            aVar.setName("TileWriter#init");
            this.a.setPriority(1);
            this.a.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    c += file2.length();
                }
                if (file2.isDirectory() && !l(file, file2)) {
                    g(file2);
                }
            }
        }
    }

    private boolean h(File file) {
        if (file.mkdirs()) {
            return true;
        }
        if (dq1.a().v()) {
            Log.d("OsmDroid", "Failed to create " + file + " - wait and check again");
        }
        try {
            Thread.sleep(500L);
        } catch (InterruptedException unused) {
        }
        if (file.exists()) {
            if (dq1.a().v()) {
                Log.d("OsmDroid", "Seems like another thread created " + file);
            }
            return true;
        } else if (dq1.a().v()) {
            Log.d("OsmDroid", "File still doesn't exist: " + file);
            return false;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        synchronized (dq1.a().d()) {
            try {
                if (c > dq1.a().t()) {
                    Log.d("OsmDroid", "Trimming tile cache from " + c + " to " + dq1.a().t());
                    File[] fileArr = (File[]) j(dq1.a().d()).toArray(new File[0]);
                    Arrays.sort(fileArr, new b());
                    for (File file : fileArr) {
                        if (c <= dq1.a().t()) {
                            break;
                        }
                        long length = file.length();
                        if (file.delete()) {
                            if (dq1.a().h()) {
                                Log.d("OsmDroid", "Cache trim deleting " + file.getAbsolutePath());
                            }
                            c -= length;
                        }
                    }
                    Log.d("OsmDroid", "Finished trimming tile cache");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private List<File> j(File file) {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    arrayList.add(file2);
                }
                if (file2.isDirectory()) {
                    arrayList.addAll(j(file2));
                }
            }
        }
        return arrayList;
    }

    private boolean l(File file, File file2) {
        try {
            return !file.getCanonicalPath().equals(file2.getCanonicalFile().getParent());
        } catch (IOException | NoSuchElementException unused) {
            return true;
        }
    }

    @Override // defpackage.ur4
    public boolean a(org.osmdroid.tileprovider.tilesource.a aVar, long j, InputStream inputStream, Long l) {
        BufferedOutputStream bufferedOutputStream;
        File k = k(aVar, j);
        if (dq1.a().h()) {
            Log.d("OsmDroid", "TileWrite " + k.getAbsolutePath());
        }
        File parentFile = k.getParentFile();
        if (!parentFile.exists() && !h(parentFile)) {
            return false;
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(k.getPath()), 8192);
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            long b2 = c + xya.b(inputStream, bufferedOutputStream);
            c = b2;
            if (b2 > dq1.a().f()) {
                i();
            }
            xya.a(bufferedOutputStream);
            return true;
        } catch (IOException unused2) {
            bufferedOutputStream2 = bufferedOutputStream;
            zx1.c++;
            if (bufferedOutputStream2 != null) {
                xya.a(bufferedOutputStream2);
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                xya.a(bufferedOutputStream2);
            }
            throw th;
        }
    }

    @Override // defpackage.ur4
    public void b() {
        Thread thread = this.a;
        if (thread != null) {
            try {
                thread.interrupt();
            } catch (Throwable unused) {
            }
        }
    }

    public File k(org.osmdroid.tileprovider.tilesource.a aVar, long j) {
        File d2 = dq1.a().d();
        return new File(d2, aVar.d(j) + ".tile");
    }

    public Drawable m(org.osmdroid.tileprovider.tilesource.a aVar, long j) throws Exception {
        File k = k(aVar, j);
        if (!k.exists()) {
            return null;
        }
        Drawable b2 = aVar.b(k.getPath());
        if (k.lastModified() < System.currentTimeMillis() - this.b && b2 != null) {
            if (dq1.a().v()) {
                Log.d("OsmDroid", "Tile expired: " + k76.h(j));
            }
            jn3.b(b2, -2);
        }
        return b2;
    }

    public void n(long j) {
        this.b = j;
    }
}
