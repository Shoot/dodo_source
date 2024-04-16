package defpackage;

import android.content.ClipDescription;
import android.content.ClipboardManager;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: AndroidClipboardManager.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\f"}, d2 = {"Lxf;", "Lr91;", "", "a", "Landroid/content/ClipboardManager;", "Landroid/content/ClipboardManager;", "clipboardManager", "<init>", "(Landroid/content/ClipboardManager;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: xf  reason: default package */
/* loaded from: classes.dex */
public final class xf implements r91 {
    private final ClipboardManager a;

    public xf(ClipboardManager clipboardManager) {
        z65.h(clipboardManager, "clipboardManager");
        this.a = clipboardManager;
    }

    public boolean a() {
        ClipDescription primaryClipDescription = this.a.getPrimaryClipDescription();
        if (primaryClipDescription != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xf(android.content.Context r2) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            defpackage.z65.h(r2, r0)
            java.lang.String r0 = "clipboard"
            java.lang.Object r2 = r2.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.content.ClipboardManager"
            defpackage.z65.f(r2, r0)
            android.content.ClipboardManager r2 = (android.content.ClipboardManager) r2
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf.<init>(android.content.Context):void");
    }
}
