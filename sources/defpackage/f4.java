package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¨\u0006\u000b"}, d2 = {"Lf4;", "", "Landroid/view/accessibility/AccessibilityNodeInfo;", "node", "", "", "data", "", "a", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: f4  reason: default package */
/* loaded from: classes.dex */
public final class f4 {
    public static final f4 a = new f4();

    private f4() {
    }

    public final void a(AccessibilityNodeInfo accessibilityNodeInfo, List<String> list) {
        z65.h(accessibilityNodeInfo, "node");
        z65.h(list, "data");
        accessibilityNodeInfo.setAvailableExtraData(list);
    }
}
