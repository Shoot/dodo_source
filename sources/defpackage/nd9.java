package defpackage;

import android.app.RemoteInput;
import android.content.Intent;
import android.os.Bundle;
/* compiled from: RemoteInput.java */
/* renamed from: nd9  reason: default package */
/* loaded from: classes.dex */
public final class nd9 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RemoteInput.java */
    /* renamed from: nd9$a */
    /* loaded from: classes.dex */
    public static class a {
        static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(nd9 nd9Var) {
            throw null;
        }

        static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    static RemoteInput a(nd9 nd9Var) {
        return a.b(nd9Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RemoteInput[] b(nd9[] nd9VarArr) {
        if (nd9VarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[nd9VarArr.length];
        for (int i = 0; i < nd9VarArr.length; i++) {
            nd9 nd9Var = nd9VarArr[i];
            remoteInputArr[i] = a(null);
        }
        return remoteInputArr;
    }
}
