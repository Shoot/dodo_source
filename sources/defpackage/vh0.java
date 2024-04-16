package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
/* compiled from: Bundle.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\f"}, d2 = {"Lvh0;", "", "Landroid/os/Bundle;", "bundle", "", Action.KEY_ATTRIBUTE, "Landroid/os/IBinder;", "value", "", "a", "<init>", "()V", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
/* renamed from: vh0  reason: default package */
/* loaded from: classes.dex */
final class vh0 {
    public static final vh0 a = new vh0();

    private vh0() {
    }

    public static final void a(Bundle bundle, String str, IBinder iBinder) {
        z65.h(bundle, "bundle");
        z65.h(str, Action.KEY_ATTRIBUTE);
        bundle.putBinder(str, iBinder);
    }
}
