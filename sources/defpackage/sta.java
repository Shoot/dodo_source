package defpackage;

import androidx.work.WorkerParameters;
/* compiled from: StartWorkRunnable.java */
/* renamed from: sta  reason: default package */
/* loaded from: classes.dex */
public class sta implements Runnable {
    private j7c a;
    private String b;
    private WorkerParameters.a c;

    public sta(j7c j7cVar, String str, WorkerParameters.a aVar) {
        this.a = j7cVar;
        this.b = str;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.r().k(this.b, this.c);
    }
}
