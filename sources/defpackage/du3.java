package defpackage;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import defpackage.s58;
import defpackage.si9;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FileRequestHandler.java */
/* renamed from: du3  reason: default package */
/* loaded from: classes3.dex */
public class du3 extends cu1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public du3(Context context) {
        super(context);
    }

    static int k(Uri uri) throws IOException {
        return new um3(uri.getPath()).c("Orientation", 1);
    }

    @Override // defpackage.cu1, defpackage.si9
    public boolean c(gi9 gi9Var) {
        return Action.FILE_ATTRIBUTE.equals(gi9Var.d.getScheme());
    }

    @Override // defpackage.cu1, defpackage.si9
    public si9.a f(gi9 gi9Var, int i) throws IOException {
        return new si9.a(null, c77.j(j(gi9Var)), s58.e.DISK, k(gi9Var.d));
    }
}
