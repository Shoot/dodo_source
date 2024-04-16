package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
/* compiled from: StorageUtils.java */
/* renamed from: uxa  reason: default package */
/* loaded from: classes3.dex */
public class uxa {

    /* compiled from: StorageUtils.java */
    /* renamed from: uxa$a */
    /* loaded from: classes3.dex */
    public static class a {
        public final String a;
        public final boolean b;
        public boolean c;
        public final int d;
        public long e;
        public String f;

        public a(String str, boolean z, boolean z2, int i) {
            this.e = 0L;
            this.a = str;
            this.b = z;
            this.d = i;
            this.e = new StatFs(str).getAvailableBytes();
            if (!z2) {
                this.c = !uxa.h(new File(str));
            }
            StringBuilder sb = new StringBuilder();
            if (z) {
                sb.append("Internal SD card");
            } else if (i > 1) {
                sb.append("SD card ");
                sb.append(i);
            } else {
                sb.append("SD card");
            }
            if (z2) {
                sb.append(" (Read only)");
            }
            this.f = sb.toString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.b != aVar.b || this.c != aVar.c || this.d != aVar.d || this.e != aVar.e) {
                return false;
            }
            String str = this.a;
            if (str == null ? aVar.a != null : !str.equals(aVar.a)) {
                return false;
            }
            String str2 = this.f;
            String str3 = aVar.f;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            String str = this.a;
            int i2 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            long j = this.e;
            int i3 = ((((((((i * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + this.d) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            String str2 = this.f;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return i3 + i2;
        }
    }

    private static Set<File> a() {
        HashSet hashSet = new HashSet();
        for (File file : k()) {
            if (h(file)) {
                hashSet.add(file);
            }
        }
        if (Environment.getExternalStorageDirectory() != null) {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (h(externalStorageDirectory)) {
                hashSet.add(externalStorageDirectory);
            }
        }
        for (File file2 : j().values()) {
            if (h(file2)) {
                hashSet.add(file2);
            }
        }
        return hashSet;
    }

    public static a b(Context context) {
        List<a> d = d(context);
        a aVar = null;
        for (int i = 0; i < d.size(); i++) {
            a aVar2 = d.get(i);
            if (!aVar2.c && h(new File(aVar2.a)) && (aVar == null || aVar.e < aVar2.e)) {
                aVar = aVar2;
            }
        }
        return aVar;
    }

    private static a c() {
        boolean z;
        String str = "";
        try {
            if (Environment.getExternalStorageDirectory() != null) {
                str = Environment.getExternalStorageDirectory().getPath();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        boolean z2 = false;
        boolean z3 = true;
        try {
            z = !Environment.isExternalStorageRemovable();
        } catch (Throwable th2) {
            th2.printStackTrace();
            z = false;
        }
        try {
            z2 = g();
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        try {
            z3 = Environment.getExternalStorageState().equals("mounted_ro");
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        if (z2) {
            return new a(str, z, z3, -1);
        }
        return null;
    }

    public static List<a> d(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (context != null) {
                return e(context);
            }
            return f();
        }
        List<a> f = f();
        if (context != null) {
            List<a> e = e(context);
            e.removeAll(f);
            f.addAll(e);
        }
        return f;
    }

    @SuppressLint({"NewApi"})
    private static List<a> e(Context context) {
        File[] externalFilesDirs;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a(context.getFilesDir().getAbsolutePath(), true, false, -1));
        ArrayList arrayList2 = new ArrayList();
        for (File file : context.getExternalFilesDirs(null)) {
            if (file != null && "mounted".equals(Environment.getStorageState(file))) {
                arrayList2.add(file);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(((File) it.next()).getAbsolutePath(), false, false, -1));
        }
        return arrayList;
    }

    private static List<a> f() {
        String str;
        ArrayList arrayList = new ArrayList();
        a c = c();
        if (c != null) {
            arrayList.add(c);
        }
        if (c != null) {
            str = c.a;
        } else {
            str = "";
        }
        arrayList.addAll(i(str));
        for (File file : a()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((a) it.next()).a.equals(file.getAbsolutePath())) {
                        break;
                    }
                } else {
                    arrayList.add(new a(file.getAbsolutePath(), false, false, -1));
                    break;
                }
            }
        }
        return arrayList;
    }

    private static boolean g() {
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
            return false;
        }
        return true;
    }

    public static boolean h(File file) {
        try {
            File file2 = new File(file.getAbsolutePath() + File.separator + UUID.randomUUID().toString());
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            fileOutputStream.write("hi".getBytes());
            fileOutputStream.close();
            file2.delete();
            Log.i("StorageUtils", file.getAbsolutePath() + " is writable");
            return true;
        } catch (Throwable unused) {
            Log.i("StorageUtils", file.getAbsolutePath() + " is NOT writable");
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e3, code lost:
        if (r3 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e5, code lost:
        r3.close();
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ec, code lost:
        if (r3 == null) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<defpackage.uxa.a> i(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uxa.i(java.lang.String):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r10 != null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
        if (r10 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
        r10 = new java.io.File("/system/etc/vold.fstab");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
        if (r10.exists() != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
        r11 = new java.util.Scanner(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0083, code lost:
        if (r11.hasNext() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
        r8 = r11.nextLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008f, code lost:
        if (r8.startsWith("dev_mount") != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0091, code lost:
        r8 = r8.split(" ")[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
        if (r8.contains(":") != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009e, code lost:
        r8 = r8.substring(0, r8.indexOf(":"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a8, code lost:
        r8 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ac, code lost:
        r8 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
        if (r8.equals("/mnt/sdcard") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b4, code lost:
        r5.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b8, code lost:
        r8 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ba, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00bd, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00bf, code lost:
        if (r8 != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c1, code lost:
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c7, code lost:
        r0.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ca, code lost:
        if (r8 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0189, code lost:
        if (r8 != null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x018b, code lost:
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x018e, code lost:
        throw r0;
     */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0054: MOVE  (r8 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:15:0x0054 */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0191 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.Map<java.lang.String, java.io.File> j() {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uxa.j():java.util.Map");
    }

    private static Set<File> k() {
        String[] split;
        HashSet hashSet = new HashSet();
        String str = System.getenv("EXTERNAL_STORAGE");
        if (str != null) {
            hashSet.add(new File(str + File.separator));
        }
        String str2 = System.getenv("SECONDARY_STORAGE");
        if (str2 != null) {
            for (String str3 : str2.split(File.pathSeparator)) {
                hashSet.add(new File(str3 + File.separator));
            }
        }
        return hashSet;
    }
}
