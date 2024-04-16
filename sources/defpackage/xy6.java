package defpackage;

import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.nr7;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import kotlin.Metadata;
/* compiled from: NioSystemFileSystem.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0004J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016¨\u0006\u0015"}, d2 = {"Lxy6;", "Ljd5;", "Ljava/nio/file/attribute/FileTime;", "", "v", "(Ljava/nio/file/attribute/FileTime;)Ljava/lang/Long;", "Lnr7;", "path", "Lbu3;", Image.TYPE_MEDIUM, "Ljava/nio/file/Path;", "nioPath", "u", KustoStorage.KustoTable.COLUMN_SOURCE, "target", "", c.a, "", "toString", "<init>", "()V", "okio"}, k = 1, mv = {1, 9, 0})
/* renamed from: xy6  reason: default package */
/* loaded from: classes3.dex */
public class xy6 extends jd5 {
    private final Long v(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (valueOf.longValue() == 0) {
            return null;
        }
        return valueOf;
    }

    @Override // defpackage.jd5, defpackage.iu3
    public void c(nr7 nr7Var, nr7 nr7Var2) {
        String message;
        StandardCopyOption standardCopyOption;
        StandardCopyOption standardCopyOption2;
        z65.h(nr7Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(nr7Var2, "target");
        try {
            Path x = nr7Var.x();
            Path x2 = nr7Var2.x();
            standardCopyOption = StandardCopyOption.ATOMIC_MOVE;
            standardCopyOption2 = StandardCopyOption.REPLACE_EXISTING;
            Files.move(x, x2, standardCopyOption, standardCopyOption2);
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            message = e.getMessage();
            throw new FileNotFoundException(message);
        }
    }

    @Override // defpackage.jd5, defpackage.iu3
    public bu3 m(nr7 nr7Var) {
        z65.h(nr7Var, "path");
        return u(nr7Var.x());
    }

    @Override // defpackage.jd5
    public String toString() {
        return "NioSystemFileSystem";
    }

    protected final bu3 u(Path path) {
        LinkOption linkOption;
        BasicFileAttributes readAttributes;
        boolean isSymbolicLink;
        Path path2;
        boolean isRegularFile;
        boolean isDirectory;
        nr7 nr7Var;
        long size;
        FileTime creationTime;
        Long l;
        FileTime lastModifiedTime;
        Long l2;
        FileTime lastAccessTime;
        z65.h(path, "nioPath");
        Long l3 = null;
        try {
            Class a = hy6.a();
            linkOption = LinkOption.NOFOLLOW_LINKS;
            readAttributes = Files.readAttributes(path, a, linkOption);
            isSymbolicLink = readAttributes.isSymbolicLink();
            if (isSymbolicLink) {
                path2 = Files.readSymbolicLink(path);
            } else {
                path2 = null;
            }
            isRegularFile = readAttributes.isRegularFile();
            isDirectory = readAttributes.isDirectory();
            if (path2 != null) {
                nr7Var = nr7.a.f(nr7.b, path2, false, 1, null);
            } else {
                nr7Var = null;
            }
            size = readAttributes.size();
            Long valueOf = Long.valueOf(size);
            creationTime = readAttributes.creationTime();
            if (creationTime != null) {
                l = v(creationTime);
            } else {
                l = null;
            }
            lastModifiedTime = readAttributes.lastModifiedTime();
            if (lastModifiedTime != null) {
                l2 = v(lastModifiedTime);
            } else {
                l2 = null;
            }
            lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l3 = v(lastAccessTime);
            }
            return new bu3(isRegularFile, isDirectory, nr7Var, valueOf, l, l2, l3, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }
}
