package im.threads.ui.core;

import im.threads.ui.core.ThreadsLib;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ThreadsLib.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class ThreadsLib$Companion$init$2 extends m94 implements Function0<Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ThreadsLib$Companion$init$2(Object obj) {
        super(0, obj, ThreadsLib.Companion.class, "migratePreference", "migratePreference$threads_release()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ThreadsLib.Companion) this.receiver).migratePreference$threads_release();
    }
}
