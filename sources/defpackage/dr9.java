package defpackage;

import android.content.Context;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.Metadata;
/* compiled from: SQLiteCopyOpenHelper.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020\u0001¢\u0006\u0004\b3\u00104J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0003H\u0017J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fR\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R\u001a\u0010&\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010.\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"Ldr9;", "Lz2b;", "Lgu2;", "", "writable", "", e.a, "Ljava/io/File;", "destinationFile", "a", "databaseFile", "b", "enabled", "setWriteAheadLoggingEnabled", "close", "Lyl2;", "databaseConfiguration", c.a, "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "Ljava/lang/String;", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/concurrent/Callable;", "copyFromInputStream", "", "I", "databaseVersion", "f", "Lz2b;", "Z0", "()Lz2b;", "delegate", "g", "Lyl2;", Image.TYPE_HIGH, "Z", "verified", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Ly2b;", "l1", "()Ly2b;", "writableDatabase", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILz2b;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: dr9  reason: default package */
/* loaded from: classes.dex */
public final class dr9 implements z2b, gu2 {
    private final Context a;
    private final String b;
    private final File c;
    private final Callable<InputStream> d;
    private final int e;
    private final z2b f;
    private yl2 g;
    private boolean h;

    public dr9(Context context, String str, File file, Callable<InputStream> callable, int i, z2b z2bVar) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        z65.h(z2bVar, "delegate");
        this.a = context;
        this.b = str;
        this.c = file;
        this.d = callable;
        this.e = i;
        this.f = z2bVar;
    }

    private final void a(File file, boolean z) throws IOException {
        ReadableByteChannel newChannel;
        if (this.b != null) {
            newChannel = Channels.newChannel(this.a.getAssets().open(this.b));
            z65.g(newChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.c != null) {
            newChannel = new FileInputStream(this.c).getChannel();
            z65.g(newChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable<InputStream> callable = this.d;
            if (callable != null) {
                try {
                    newChannel = Channels.newChannel(callable.call());
                    z65.g(newChannel, "newChannel(inputStream)");
                } catch (Exception e) {
                    throw new IOException("inputStreamCallable exception on call", e);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.a.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        z65.g(channel, "output");
        mu3.a(newChannel, channel);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        z65.g(createTempFile, "intermediateFile");
        b(createTempFile, z);
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final void b(File file, boolean z) {
        yl2 yl2Var = this.g;
        if (yl2Var == null) {
            z65.z("databaseConfiguration");
            yl2Var = null;
        }
        yl2Var.getClass();
    }

    private final void e(boolean z) {
        String databaseName = getDatabaseName();
        if (databaseName != null) {
            File databasePath = this.a.getDatabasePath(databaseName);
            yl2 yl2Var = this.g;
            yl2 yl2Var2 = null;
            if (yl2Var == null) {
                z65.z("databaseConfiguration");
                yl2Var = null;
            }
            uk8 uk8Var = new uk8(databaseName, this.a.getFilesDir(), yl2Var.s);
            try {
                uk8.c(uk8Var, false, 1, null);
                if (!databasePath.exists()) {
                    try {
                        z65.g(databasePath, "databaseFile");
                        a(databasePath, z);
                        uk8Var.d();
                        return;
                    } catch (IOException e) {
                        throw new RuntimeException("Unable to copy database file.", e);
                    }
                }
                try {
                    z65.g(databasePath, "databaseFile");
                    int d = k62.d(databasePath);
                    if (d == this.e) {
                        uk8Var.d();
                        return;
                    }
                    yl2 yl2Var3 = this.g;
                    if (yl2Var3 == null) {
                        z65.z("databaseConfiguration");
                    } else {
                        yl2Var2 = yl2Var3;
                    }
                    if (yl2Var2.a(d, this.e)) {
                        uk8Var.d();
                        return;
                    }
                    if (this.a.deleteDatabase(databaseName)) {
                        try {
                            a(databasePath, z);
                        } catch (IOException e2) {
                            Log.w("ROOM", "Unable to copy database file.", e2);
                        }
                    } else {
                        Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                    }
                    uk8Var.d();
                    return;
                } catch (IOException e3) {
                    Log.w("ROOM", "Unable to read database version.", e3);
                    uk8Var.d();
                    return;
                }
            } catch (Throwable th) {
                uk8Var.d();
                throw th;
            }
            uk8Var.d();
            throw th;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // defpackage.gu2
    public z2b Z0() {
        return this.f;
    }

    public final void c(yl2 yl2Var) {
        z65.h(yl2Var, "databaseConfiguration");
        this.g = yl2Var;
    }

    @Override // defpackage.z2b, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        Z0().close();
        this.h = false;
    }

    @Override // defpackage.z2b
    public String getDatabaseName() {
        return Z0().getDatabaseName();
    }

    @Override // defpackage.z2b
    public y2b l1() {
        if (!this.h) {
            e(true);
            this.h = true;
        }
        return Z0().l1();
    }

    @Override // defpackage.z2b
    public void setWriteAheadLoggingEnabled(boolean z) {
        Z0().setWriteAheadLoggingEnabled(z);
    }
}
