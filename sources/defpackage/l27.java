package defpackage;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.huawei.hms.push.constant.RemoteMessageConst;
import defpackage.k17;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationCompatJellybean.java */
/* renamed from: l27  reason: default package */
/* loaded from: classes.dex */
public class l27 {
    private static final Object a = new Object();
    private static final Object b = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle a(k17.a aVar) {
        int i;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        IconCompat d = aVar.d();
        if (d != null) {
            i = d.l();
        } else {
            i = 0;
        }
        bundle2.putInt(RemoteMessageConst.Notification.ICON, i);
        bundle2.putCharSequence("title", aVar.h());
        bundle2.putParcelable("actionIntent", aVar.a());
        if (aVar.c() != null) {
            bundle = new Bundle(aVar.c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle2.putBoolean("showsUserInterface", aVar.g());
        bundle2.putInt("semanticAction", aVar.f());
        return bundle2;
    }

    private static Bundle b(nd9 nd9Var) {
        new Bundle();
        throw null;
    }

    private static Bundle[] c(nd9[] nd9VarArr) {
        if (nd9VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[nd9VarArr.length];
        for (int i = 0; i < nd9VarArr.length; i++) {
            nd9 nd9Var = nd9VarArr[i];
            bundleArr[i] = b(null);
        }
        return bundleArr;
    }
}
