package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.profileinstaller.b;
import androidx.profileinstaller.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
/* compiled from: DeviceProfileWriter.java */
/* loaded from: classes.dex */
public class b {
    @NonNull
    private final AssetManager a;
    @NonNull
    private final Executor b;
    @NonNull
    private final f.c c;
    @NonNull
    private final File e;
    @NonNull
    private final String f;
    @NonNull
    private final String g;
    @NonNull
    private final String h;
    private c[] j;
    private byte[] k;
    private boolean i = false;
    private final byte[] d = d();

    public b(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull f.c cVar, @NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull File file) {
        this.a = assetManager;
        this.b = executor;
        this.c = cVar;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.e = file;
    }

    private b b(c[] cVarArr, byte[] bArr) {
        InputStream h;
        try {
            h = h(this.a, this.h);
        } catch (FileNotFoundException e) {
            this.c.a(9, e);
        } catch (IOException e2) {
            this.c.a(7, e2);
        } catch (IllegalStateException e3) {
            this.j = null;
            this.c.a(8, e3);
        }
        if (h != null) {
            try {
                this.j = h.q(h, h.o(h, h.b), bArr, cVarArr);
                h.close();
                return this;
            } catch (Throwable th) {
                try {
                    h.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (h != null) {
            h.close();
        }
        return null;
    }

    private void c() {
        if (this.i) {
            return;
        }
        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
    }

    private static byte[] d() {
        int i = Build.VERSION.SDK_INT;
        if (i < 24 || i > 33) {
            return null;
        }
        switch (i) {
            case 24:
            case 25:
                return j.e;
            case 26:
                return j.d;
            case 27:
                return j.c;
            case 28:
            case 29:
            case 30:
                return j.b;
            case 31:
            case 32:
            case 33:
                return j.a;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return h(assetManager, this.g);
        } catch (FileNotFoundException e) {
            this.c.a(6, e);
            return null;
        } catch (IOException e2) {
            this.c.a(7, e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(int i, Object obj) {
        this.c.a(i, obj);
    }

    private InputStream h(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.c.b(5, null);
            }
            return null;
        }
    }

    private c[] j(InputStream inputStream) {
        try {
            try {
                try {
                    try {
                        c[] w = h.w(inputStream, h.o(inputStream, h.a), this.f);
                        try {
                            inputStream.close();
                            return w;
                        } catch (IOException e) {
                            this.c.a(7, e);
                            return w;
                        }
                    } catch (IOException e2) {
                        this.c.a(7, e2);
                        return null;
                    }
                } catch (IllegalStateException e3) {
                    this.c.a(8, e3);
                    inputStream.close();
                    return null;
                }
            } catch (IOException e4) {
                this.c.a(7, e4);
                inputStream.close();
                return null;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                this.c.a(7, e5);
            }
            throw th;
        }
    }

    private static boolean k() {
        int i = Build.VERSION.SDK_INT;
        if (i < 24 || i > 33) {
            return false;
        }
        if (i != 24 && i != 25) {
            switch (i) {
                case 31:
                case 32:
                case 33:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    private void l(final int i, final Object obj) {
        this.b.execute(new Runnable() { // from class: y13
            @Override // java.lang.Runnable
            public final void run() {
                b.this.g(i, obj);
            }
        });
    }

    public boolean e() {
        if (this.d == null) {
            l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        } else if (!this.e.canWrite()) {
            l(4, null);
            return false;
        } else {
            this.i = true;
            return true;
        }
    }

    @NonNull
    public b i() {
        b b;
        c();
        if (this.d == null) {
            return this;
        }
        InputStream f = f(this.a);
        if (f != null) {
            this.j = j(f);
        }
        c[] cVarArr = this.j;
        if (cVarArr != null && k() && (b = b(cVarArr, this.d)) != null) {
            return b;
        }
        return this;
    }

    @NonNull
    public b m() {
        ByteArrayOutputStream byteArrayOutputStream;
        c[] cVarArr = this.j;
        byte[] bArr = this.d;
        if (cVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    h.E(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                this.c.a(7, e);
            } catch (IllegalStateException e2) {
                this.c.a(8, e2);
            }
            if (!h.B(byteArrayOutputStream, bArr, cVarArr)) {
                this.c.a(5, null);
                this.j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.j = null;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.profileinstaller.c[], byte[]] */
    public boolean n() {
        byte[] bArr = this.k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.e);
                    d.l(byteArrayInputStream, fileOutputStream);
                    l(1, null);
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return true;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                this.k = null;
                this.j = null;
            }
        } catch (FileNotFoundException e) {
            l(6, e);
            return false;
        } catch (IOException e2) {
            l(7, e2);
            return false;
        }
    }
}
