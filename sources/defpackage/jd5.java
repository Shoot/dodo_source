package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: JvmSystemFileSystem.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J \u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\f\u0010\t\u001a\u00020\b*\u00020\u0002H\u0002J\f\u0010\n\u001a\u00020\b*\u00020\u0002H\u0002J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0004H\u0016J\u0018\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0004H\u0016J\u0018\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0004H\u0016J\b\u0010\u001f\u001a\u00020\u001eH\u0016¨\u0006\""}, d2 = {"Ljd5;", "Liu3;", "Lnr7;", "dir", "", "throwOnFailure", "", "r", "", "t", Image.TYPE_SMALL, "path", "Lbu3;", Image.TYPE_MEDIUM, "k", Action.FILE_ATTRIBUTE, "Lwt3;", "n", "Lpqa;", "q", "mustCreate", "Lzma;", "p", "mustExist", "b", "g", KustoStorage.KustoTable.COLUMN_SOURCE, "target", c.a, "i", "", "toString", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: jd5  reason: default package */
/* loaded from: classes3.dex */
public class jd5 extends iu3 {
    private final List<nr7> r(nr7 nr7Var, boolean z) {
        File w = nr7Var.w();
        String[] list = w.list();
        if (list == null) {
            if (z) {
                if (!w.exists()) {
                    throw new FileNotFoundException("no such file: " + nr7Var);
                }
                throw new IOException("failed to list " + nr7Var);
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            z65.e(str);
            arrayList.add(nr7Var.u(str));
        }
        oc1.A(arrayList);
        return arrayList;
    }

    private final void s(nr7 nr7Var) {
        if (!j(nr7Var)) {
            return;
        }
        throw new IOException(nr7Var + " already exists.");
    }

    private final void t(nr7 nr7Var) {
        if (j(nr7Var)) {
            return;
        }
        throw new IOException(nr7Var + " doesn't exist.");
    }

    @Override // defpackage.iu3
    public zma b(nr7 nr7Var, boolean z) {
        z65.h(nr7Var, Action.FILE_ATTRIBUTE);
        if (z) {
            t(nr7Var);
        }
        return c77.e(nr7Var.w(), true);
    }

    @Override // defpackage.iu3
    public void c(nr7 nr7Var, nr7 nr7Var2) {
        z65.h(nr7Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(nr7Var2, "target");
        if (nr7Var.w().renameTo(nr7Var2.w())) {
            return;
        }
        throw new IOException("failed to move " + nr7Var + " to " + nr7Var2);
    }

    @Override // defpackage.iu3
    public void g(nr7 nr7Var, boolean z) {
        z65.h(nr7Var, "dir");
        if (!nr7Var.w().mkdir()) {
            bu3 m = m(nr7Var);
            if (m != null && m.f()) {
                if (!z) {
                    return;
                }
                throw new IOException(nr7Var + " already exists.");
            }
            throw new IOException("failed to create directory: " + nr7Var);
        }
    }

    @Override // defpackage.iu3
    public void i(nr7 nr7Var, boolean z) {
        z65.h(nr7Var, "path");
        if (!Thread.interrupted()) {
            File w = nr7Var.w();
            if (!w.delete()) {
                if (!w.exists()) {
                    if (z) {
                        throw new FileNotFoundException("no such file: " + nr7Var);
                    }
                    return;
                }
                throw new IOException("failed to delete " + nr7Var);
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    @Override // defpackage.iu3
    public List<nr7> k(nr7 nr7Var) {
        z65.h(nr7Var, "dir");
        List<nr7> r = r(nr7Var, true);
        z65.e(r);
        return r;
    }

    @Override // defpackage.iu3
    public bu3 m(nr7 nr7Var) {
        z65.h(nr7Var, "path");
        File w = nr7Var.w();
        boolean isFile = w.isFile();
        boolean isDirectory = w.isDirectory();
        long lastModified = w.lastModified();
        long length = w.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !w.exists()) {
            return null;
        }
        return new bu3(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null, null, 128, null);
    }

    @Override // defpackage.iu3
    public wt3 n(nr7 nr7Var) {
        z65.h(nr7Var, Action.FILE_ATTRIBUTE);
        return new hd5(false, new RandomAccessFile(nr7Var.w(), "r"));
    }

    @Override // defpackage.iu3
    public zma p(nr7 nr7Var, boolean z) {
        zma f;
        z65.h(nr7Var, Action.FILE_ATTRIBUTE);
        if (z) {
            s(nr7Var);
        }
        f = d77.f(nr7Var.w(), false, 1, null);
        return f;
    }

    @Override // defpackage.iu3
    public pqa q(nr7 nr7Var) {
        z65.h(nr7Var, Action.FILE_ATTRIBUTE);
        return c77.i(nr7Var.w());
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
