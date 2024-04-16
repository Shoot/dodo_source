package defpackage;

import android.os.Looper;
import kotlin.Metadata;
/* compiled from: AndroidUiDispatcher.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\u0002"}, d2 = {"", "b", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: cj  reason: default package */
/* loaded from: classes.dex */
public final class cj {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }
}
