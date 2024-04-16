package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: AndroidAccessibilityManager.android.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\u0003B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lce;", "Lv2;", "Landroid/view/accessibility/AccessibilityManager;", "a", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "b", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ce  reason: default package */
/* loaded from: classes.dex */
public final class ce implements v2 {
    private static final a b = new a(null);
    private final AccessibilityManager a;

    /* compiled from: AndroidAccessibilityManager.android.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lce$a;", "", "", "FlagContentControls", "I", "FlagContentIcons", "FlagContentText", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: ce$a */
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ce(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Object systemService = context.getSystemService("accessibility");
        z65.f(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.a = (AccessibilityManager) systemService;
    }
}
