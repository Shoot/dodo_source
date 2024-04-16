package defpackage;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
/* compiled from: CrashlyticsAppQualitySessionsStore.java */
/* renamed from: u02  reason: default package */
/* loaded from: classes2.dex */
class u02 {
    private static final FilenameFilter d = new FilenameFilter() { // from class: s02
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean d2;
            d2 = u02.d(file, str);
            return d2;
        }
    };
    private static final Comparator<File> e = new Comparator() { // from class: t02
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int e2;
            e2 = u02.e((File) obj, (File) obj2);
            return e2;
        }
    };
    private final hu3 a;
    private String b = null;
    private String c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u02(hu3 hu3Var) {
        this.a = hu3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean d(File file, String str) {
        return str.startsWith("aqs.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int e(File file, File file2) {
        return Long.compare(file2.lastModified(), file.lastModified());
    }

    private static void f(hu3 hu3Var, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                hu3Var.o(str, "aqs." + str2).createNewFile();
            } catch (IOException e2) {
                rx5.f().l("Failed to persist App Quality Sessions session id.", e2);
            }
        }
    }

    static String g(hu3 hu3Var, @NonNull String str) {
        List<File> p = hu3Var.p(str, d);
        if (p.isEmpty()) {
            rx5.f().k("Unable to read App Quality Sessions session id.");
            return null;
        }
        return ((File) Collections.min(p, e)).getName().substring(4);
    }

    public synchronized String c(@NonNull String str) {
        if (Objects.equals(this.b, str)) {
            return this.c;
        }
        return g(this.a, str);
    }

    public synchronized void h(@NonNull String str) {
        if (!Objects.equals(this.c, str)) {
            f(this.a, this.b, str);
            this.c = str;
        }
    }

    public synchronized void i(String str) {
        if (!Objects.equals(this.b, str)) {
            f(this.a, str, this.c);
            this.b = str;
        }
    }
}
