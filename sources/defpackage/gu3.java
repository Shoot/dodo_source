package defpackage;

import java.io.File;
/* compiled from: FileService.java */
/* renamed from: gu3  reason: default package */
/* loaded from: classes.dex */
class gu3 {
    public boolean a(File file) {
        return file.exists();
    }

    public File b(String str) {
        return new File(str);
    }

    public long c(File file) {
        return file.length();
    }
}
