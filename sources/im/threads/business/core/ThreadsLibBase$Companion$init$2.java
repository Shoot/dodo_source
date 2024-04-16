package im.threads.business.core;

import im.threads.business.core.ThreadsLibBase;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ThreadsLibBase.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class ThreadsLibBase$Companion$init$2 extends m94 implements Function0<Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ThreadsLibBase$Companion$init$2(Object obj) {
        super(0, obj, ThreadsLibBase.Companion.class, "migratePreference", "migratePreference()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((ThreadsLibBase.Companion) this.receiver).migratePreference();
    }
}
