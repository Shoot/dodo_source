package defpackage;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
/* compiled from: DBUtil.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a(\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u001a\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\n\u001a\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r\u001a\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006¨\u0006\u0012"}, d2 = {"Lun9;", "db", "Lb3b;", "sqLiteQuery", "", "maybeCopy", "Landroid/os/CancellationSignal;", "signal", "Landroid/database/Cursor;", c.a, "Ly2b;", "", "b", "Ljava/io/File;", "databaseFile", "", DateTokenConverter.CONVERTER_KEY, "a", "room-runtime_release"}, k = 2, mv = {1, 7, 1})
/* renamed from: k62  reason: default package */
/* loaded from: classes.dex */
public final class k62 {
    public static final CancellationSignal a() {
        return t2b.b();
    }

    public static final void b(y2b y2bVar) {
        List c;
        List<String> a;
        boolean J;
        z65.h(y2bVar, "db");
        c = jc1.c();
        Cursor m1 = y2bVar.m1("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (m1.moveToNext()) {
            try {
                c.add(m1.getString(0));
            } finally {
            }
        }
        Unit unit = Unit.a;
        aa1.a(m1, null);
        a = jc1.a(c);
        for (String str : a) {
            z65.g(str, "triggerName");
            J = l0b.J(str, "room_fts_content_sync_", false, 2, null);
            if (J) {
                y2bVar.C("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static final Cursor c(un9 un9Var, b3b b3bVar, boolean z, CancellationSignal cancellationSignal) {
        int i;
        z65.h(un9Var, "db");
        z65.h(b3bVar, "sqLiteQuery");
        Cursor z2 = un9Var.z(b3bVar, cancellationSignal);
        if (z && (z2 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) z2;
            int count = abstractWindowedCursor.getCount();
            if (abstractWindowedCursor.hasWindow()) {
                i = abstractWindowedCursor.getWindow().getNumRows();
            } else {
                i = count;
            }
            if (Build.VERSION.SDK_INT < 23 || i < count) {
                return n32.a(z2);
            }
            return z2;
        }
        return z2;
    }

    public static final int d(File file) throws IOException {
        z65.h(file, "databaseFile");
        FileChannel channel = new FileInputStream(file).getChannel();
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i = allocate.getInt();
                aa1.a(channel, null);
                return i;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                aa1.a(channel, th);
                throw th2;
            }
        }
    }
}
