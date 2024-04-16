package defpackage;

import android.os.Environment;
import android.os.StatFs;
import ch.qos.logback.core.util.FileSize;
import com.huawei.hms.opendevice.c;
import io.realm.j0;
import java.io.File;
import kotlin.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: DiskUtil.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004R\u001c\u0010\r\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lk33;", "", "Lio/realm/j0;", "realmConfiguration", "", c.a, "b", "size", "", "a", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "<init>", "()V", "persistence_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: k33  reason: default package */
/* loaded from: classes2.dex */
public final class k33 {
    public static final k33 a = new k33();
    private static final Logger b = LoggerFactory.getLogger("DiskUtil");

    private k33() {
    }

    public final String a(long j) {
        String str;
        if (j >= FileSize.KB_COEFFICIENT) {
            long j2 = 1024;
            j /= j2;
            if (j >= FileSize.KB_COEFFICIENT) {
                j /= j2;
                str = "MB";
            } else {
                str = "KB";
            }
        } else {
            str = null;
        }
        return z65.q(String.format("%,d", Long.valueOf(j)), str);
    }

    public final long b() {
        File dataDirectory = Environment.getDataDirectory();
        z65.g(dataDirectory, "getDataDirectory()");
        StatFs statFs = new StatFs(dataDirectory.getPath());
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    public final long c(j0 j0Var) {
        z65.h(j0Var, "realmConfiguration");
        File file = new File(j0Var.l(), j0Var.m());
        Logger logger = b;
        logger.info("RealmDB [db file = " + ((Object) file.getAbsolutePath()) + ' ' + ((Object) file.getName()) + ']');
        if (!file.exists()) {
            file = null;
        }
        if (file == null) {
            return 0L;
        }
        return file.length();
    }
}
