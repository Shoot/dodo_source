package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import cloud.mindbox.mobile_sdk.services.MindboxOneTimeEventWorker;
import kotlin.Metadata;
/* compiled from: MindboxWorkerFactory.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lhl6;", "La8c;", "Landroid/content/Context;", "appContext", "", "workerClassName", "Landroidx/work/WorkerParameters;", "workerParameters", "Landroidx/work/ListenableWorker;", "a", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: hl6  reason: default package */
/* loaded from: classes.dex */
public final class hl6 extends a8c {
    public static final hl6 b = new hl6();

    private hl6() {
    }

    @Override // defpackage.a8c
    public ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        z65.h(context, "appContext");
        z65.h(str, "workerClassName");
        z65.h(workerParameters, "workerParameters");
        if (!z65.c(str, MindboxOneTimeEventWorker.class.getName())) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        return new MindboxOneTimeEventWorker(context, workerParameters);
    }
}
