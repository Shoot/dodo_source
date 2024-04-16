package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import defpackage.s58;
import defpackage.si9;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AssetRequestHandler.java */
/* renamed from: ks  reason: default package */
/* loaded from: classes3.dex */
public class ks extends si9 {
    private static final int d = 22;
    private final Context a;
    private final Object b = new Object();
    private AssetManager c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ks(Context context) {
        this.a = context;
    }

    static String j(gi9 gi9Var) {
        return gi9Var.d.toString().substring(d);
    }

    @Override // defpackage.si9
    public boolean c(gi9 gi9Var) {
        Uri uri = gi9Var.d;
        if (!Action.FILE_ATTRIBUTE.equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    @Override // defpackage.si9
    public si9.a f(gi9 gi9Var, int i) throws IOException {
        if (this.c == null) {
            synchronized (this.b) {
                try {
                    if (this.c == null) {
                        this.c = this.a.getAssets();
                    }
                } finally {
                }
            }
        }
        return new si9.a(c77.j(this.c.open(j(gi9Var))), s58.e.DISK);
    }
}
