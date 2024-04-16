package defpackage;

import androidx.annotation.NonNull;
import defpackage.j12;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: CrashlyticsReportPersistence.java */
/* renamed from: z12  reason: default package */
/* loaded from: classes2.dex */
public class z12 {
    private static final Charset e = Charset.forName("UTF-8");
    private static final int f = 15;
    private static final u12 g = new u12();
    private static final Comparator<? super File> h = new Comparator() { // from class: x12
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int u;
            u = z12.u((File) obj, (File) obj2);
            return u;
        }
    };
    private static final FilenameFilter i = new FilenameFilter() { // from class: y12
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean v;
            v = z12.v(file, str);
            return v;
        }
    };
    private final AtomicInteger a = new AtomicInteger(0);
    private final hu3 b;
    private final gga c;
    private final v02 d;

    public z12(hu3 hu3Var, gga ggaVar, v02 v02Var) {
        this.b = hu3Var;
        this.c = ggaVar;
        this.d = v02Var;
    }

    @NonNull
    private static String A(@NonNull File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    private void B(@NonNull File file, @NonNull j12.d dVar, @NonNull String str, j12.a aVar) {
        String d = this.d.d(str);
        try {
            u12 u12Var = g;
            F(this.b.g(str), u12Var.M(u12Var.L(A(file)).s(dVar).p(aVar).o(d)));
        } catch (IOException e2) {
            rx5 f2 = rx5.f();
            f2.l("Could not synthesize final native report file for " + file, e2);
        }
    }

    private void C(String str, long j) {
        boolean z;
        List<File> p = this.b.p(str, i);
        if (p.isEmpty()) {
            rx5 f2 = rx5.f();
            f2.i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(p);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            z = false;
            for (File file : p) {
                try {
                    arrayList.add(g.j(A(file)));
                } catch (IOException e2) {
                    rx5 f3 = rx5.f();
                    f3.l("Could not add event to report for " + file, e2);
                }
                if (z || s(file.getName())) {
                    z = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            rx5 f4 = rx5.f();
            f4.k("Could not parse event files for session " + str);
            return;
        }
        D(this.b.o(str, "report"), arrayList, j, z, mub.k(str, this.b), this.d.d(str));
    }

    private void D(@NonNull File file, @NonNull List<j12.e.d> list, long j, boolean z, String str, String str2) {
        File l;
        try {
            u12 u12Var = g;
            j12 q = u12Var.L(A(file)).t(j, z, str).o(str2).q(list);
            j12.e m = q.m();
            if (m == null) {
                return;
            }
            rx5 f2 = rx5.f();
            f2.b("appQualitySessionId: " + str2);
            if (z) {
                l = this.b.j(m.i());
            } else {
                l = this.b.l(m.i());
            }
            F(l, u12Var.M(q));
        } catch (IOException e2) {
            rx5 f3 = rx5.f();
            f3.l("Could not synthesize final report file for " + file, e2);
        }
    }

    private int E(String str, int i2) {
        List<File> p = this.b.p(str, new FilenameFilter() { // from class: v12
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                boolean t;
                t = z12.t(file, str2);
                return t;
            }
        });
        Collections.sort(p, new Comparator() { // from class: w12
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int x;
                x = z12.x((File) obj, (File) obj2);
                return x;
            }
        });
        return f(p, i2);
    }

    private static void F(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private static void G(File file, String str, long j) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(h(j));
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private SortedSet<String> e(String str) {
        this.b.b();
        SortedSet<String> p = p();
        if (str != null) {
            p.remove(str);
        }
        if (p.size() <= 8) {
            return p;
        }
        while (p.size() > 8) {
            String last = p.last();
            rx5 f2 = rx5.f();
            f2.b("Removing session over cap: " + last);
            this.b.c(last);
            p.remove(last);
        }
        return p;
    }

    private static int f(List<File> list, int i2) {
        int size = list.size();
        for (File file : list) {
            if (size <= i2) {
                return size;
            }
            hu3.s(file);
            size--;
        }
        return size;
    }

    private void g() {
        int i2 = this.c.b().a.b;
        List<File> n = n();
        int size = n.size();
        if (size <= i2) {
            return;
        }
        for (File file : n.subList(i2, size)) {
            file.delete();
        }
    }

    private static long h(long j) {
        return j * 1000;
    }

    private void j(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    @NonNull
    private static String m(int i2, boolean z) {
        String str;
        String format = String.format(Locale.US, "%010d", Integer.valueOf(i2));
        if (z) {
            str = "_";
        } else {
            str = "";
        }
        return "event" + format + str;
    }

    private List<File> n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b.k());
        arrayList.addAll(this.b.h());
        Comparator<? super File> comparator = h;
        Collections.sort(arrayList, comparator);
        List<File> m = this.b.m();
        Collections.sort(m, comparator);
        arrayList.addAll(m);
        return arrayList;
    }

    @NonNull
    private static String o(@NonNull String str) {
        return str.substring(0, f);
    }

    private static boolean s(@NonNull String str) {
        if (str.startsWith("event") && str.endsWith("_")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean t(@NonNull File file, @NonNull String str) {
        if (str.startsWith("event") && !str.endsWith("_")) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int u(File file, File file2) {
        return file2.getName().compareTo(file.getName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean v(File file, String str) {
        return str.startsWith("event");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int x(@NonNull File file, @NonNull File file2) {
        return o(file.getName()).compareTo(o(file2.getName()));
    }

    public void i() {
        j(this.b.m());
        j(this.b.k());
        j(this.b.h());
    }

    public void k(String str, long j) {
        for (String str2 : e(str)) {
            rx5 f2 = rx5.f();
            f2.i("Finalizing report for session " + str2);
            C(str2, j);
            this.b.c(str2);
        }
        g();
    }

    public void l(String str, j12.d dVar, j12.a aVar) {
        File o = this.b.o(str, "report");
        rx5 f2 = rx5.f();
        f2.b("Writing native session report for " + str + " to file: " + o);
        B(o, dVar, str, aVar);
    }

    public SortedSet<String> p() {
        return new TreeSet(this.b.d()).descendingSet();
    }

    public long q(String str) {
        return this.b.o(str, "start-time").lastModified();
    }

    public boolean r() {
        if (this.b.m().isEmpty() && this.b.k().isEmpty() && this.b.h().isEmpty()) {
            return false;
        }
        return true;
    }

    @NonNull
    public List<a22> w() {
        List<File> n = n();
        ArrayList arrayList = new ArrayList();
        for (File file : n) {
            try {
                arrayList.add(a22.a(g.L(A(file)), file.getName(), file));
            } catch (IOException e2) {
                rx5 f2 = rx5.f();
                f2.l("Could not load report file " + file + "; deleting", e2);
                file.delete();
            }
        }
        return arrayList;
    }

    public void y(@NonNull j12.e.d dVar, @NonNull String str, boolean z) {
        int i2 = this.c.b().a.a;
        try {
            F(this.b.o(str, m(this.a.getAndIncrement(), z)), g.k(dVar));
        } catch (IOException e2) {
            rx5 f2 = rx5.f();
            f2.l("Could not persist event for session " + str, e2);
        }
        E(str, i2);
    }

    public void z(@NonNull j12 j12Var) {
        j12.e m = j12Var.m();
        if (m == null) {
            rx5.f().b("Could not get session for report");
            return;
        }
        String i2 = m.i();
        try {
            F(this.b.o(i2, "report"), g.M(j12Var));
            G(this.b.o(i2, "start-time"), "", m.l());
        } catch (IOException e2) {
            rx5 f2 = rx5.f();
            f2.c("Could not persist report for session " + i2, e2);
        }
    }
}
