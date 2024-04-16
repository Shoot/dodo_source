package defpackage;

import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: ExecutionModule.java */
/* renamed from: cm3  reason: default package */
/* loaded from: classes2.dex */
abstract class cm3 {
    /* JADX INFO: Access modifiers changed from: package-private */
    @SuppressLint({"ThreadPoolCreation"})
    public static Executor a() {
        return new xs9(Executors.newSingleThreadExecutor());
    }
}
