package im.threads.ui.fragments;

import im.threads.business.logger.LoggerEdna;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: ChatFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "onError", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ChatFragment$onPhotosResult$3 extends ej5 implements Function1<Throwable, Unit> {
    public static final ChatFragment$onPhotosResult$3 INSTANCE = new ChatFragment$onPhotosResult$3();

    ChatFragment$onPhotosResult$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        LoggerEdna.error("onPhotosResult ", th);
    }
}
