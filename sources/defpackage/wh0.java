package defpackage;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
/* compiled from: Bundle.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\"\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000e"}, d2 = {"Lwh0;", "", "Landroid/os/Bundle;", "bundle", "", Action.KEY_ATTRIBUTE, "Landroid/util/Size;", "value", "", "a", "Landroid/util/SizeF;", "b", "<init>", "()V", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
/* renamed from: wh0  reason: default package */
/* loaded from: classes.dex */
final class wh0 {
    public static final wh0 a = new wh0();

    private wh0() {
    }

    public static final void a(Bundle bundle, String str, Size size) {
        z65.h(bundle, "bundle");
        z65.h(str, Action.KEY_ATTRIBUTE);
        bundle.putSize(str, size);
    }

    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        z65.h(bundle, "bundle");
        z65.h(str, Action.KEY_ATTRIBUTE);
        bundle.putSizeF(str, sizeF);
    }
}
