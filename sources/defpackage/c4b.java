package defpackage;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
/* compiled from: SysUtil.java */
/* renamed from: c4b  reason: default package */
/* loaded from: classes2.dex */
public final class c4b {

    /* compiled from: SysUtil.java */
    @TargetApi(21)
    /* renamed from: c4b$a */
    /* loaded from: classes2.dex */
    private static final class a {
        public static String[] a() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            try {
                if (b()) {
                    treeSet.add(hj6.AARCH64.toString());
                    treeSet.add(hj6.X86_64.toString());
                } else {
                    treeSet.add(hj6.ARM.toString());
                    treeSet.add(hj6.X86.toString());
                }
                ArrayList arrayList = new ArrayList();
                for (String str : strArr) {
                    if (treeSet.contains(str)) {
                        arrayList.add(str);
                    }
                }
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            } catch (ErrnoException e) {
                Log.e("SysUtil", String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", Arrays.toString(strArr), Integer.valueOf(e.errno), e.getMessage()));
                return Build.SUPPORTED_ABIS;
            }
        }

        public static boolean b() throws ErrnoException {
            return Os.readlink("/proc/self/exe").contains("64");
        }
    }

    /* compiled from: SysUtil.java */
    @TargetApi(23)
    /* renamed from: c4b$b */
    /* loaded from: classes2.dex */
    private static final class b {
        public static String[] a() {
            String[] strArr = Build.SUPPORTED_ABIS;
            TreeSet treeSet = new TreeSet();
            if (b()) {
                treeSet.add(hj6.AARCH64.toString());
                treeSet.add(hj6.X86_64.toString());
            } else {
                treeSet.add(hj6.ARM.toString());
                treeSet.add(hj6.X86.toString());
            }
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (treeSet.contains(str)) {
                    arrayList.add(str);
                }
            }
            return (String[]) arrayList.toArray(new String[arrayList.size()]);
        }

        public static boolean b() {
            boolean is64Bit;
            is64Bit = Process.is64Bit();
            return is64Bit;
        }
    }

    public static String[] a() {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.a();
        }
        return a.a();
    }
}
