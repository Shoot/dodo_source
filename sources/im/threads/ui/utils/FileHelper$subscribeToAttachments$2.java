package im.threads.ui.utils;

import im.threads.business.logger.LoggerEdna;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FileHelper.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class FileHelper$subscribeToAttachments$2 extends m94 implements Function1<Throwable, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public FileHelper$subscribeToAttachments$2(Object obj) {
        super(1, obj, LoggerEdna.class, "error", "error(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        LoggerEdna.error(th);
    }
}
