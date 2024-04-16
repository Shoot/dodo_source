package defpackage;

import android.os.Looper;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
/* compiled from: AndroidCapabilities.java */
/* renamed from: uf  reason: default package */
/* loaded from: classes3.dex */
public class uf implements ao0 {
    @SuppressFBWarnings({"MS_SHOULD_BE_FINAL", "MS_CANNOT_BE_FINAL"})
    public static boolean c = false;
    private final Looper a = Looper.myLooper();
    private final boolean b = e();

    private boolean d() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    private static boolean e() {
        String name = Thread.currentThread().getName();
        if (name != null && name.startsWith("IntentService[")) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ao0
    public boolean a() {
        Looper looper = this.a;
        if (looper != null && (c || looper == Looper.getMainLooper())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ao0
    public void b(String str) {
        String str2 = "";
        if (!d()) {
            if (str != null) {
                str2 = str + " Realm cannot be automatically updated on a thread without a looper.";
            }
            throw new IllegalStateException(str2);
        } else if (this.b) {
            if (str != null) {
                str2 = str + " Realm cannot be automatically updated on an IntentService thread.";
            }
            throw new IllegalStateException(str2);
        }
    }

    @Override // defpackage.ao0
    public boolean c() {
        if (d() && !this.b) {
            return true;
        }
        return false;
    }
}
