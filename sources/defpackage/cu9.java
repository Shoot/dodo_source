package defpackage;

import android.content.pm.PackageManager;
import kotlin.Metadata;
/* compiled from: SberPaySupportChecker.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\n"}, d2 = {"Lcu9;", "", "", "a", "b", "Landroid/content/pm/PackageManager;", "Landroid/content/pm/PackageManager;", "packageManager", "<init>", "(Landroid/content/pm/PackageManager;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cu9  reason: default package */
/* loaded from: classes2.dex */
public final class cu9 {
    private final PackageManager a;

    public cu9(PackageManager packageManager) {
        z65.h(packageManager, "packageManager");
        this.a = packageManager;
    }

    private final boolean a() {
        try {
            return this.a.getApplicationInfo("ru.sberbankmobile", 0).enabled;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final boolean b() {
        return a();
    }
}
