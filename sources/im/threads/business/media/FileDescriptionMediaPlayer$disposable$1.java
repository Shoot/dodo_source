package im.threads.business.media;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: FileDescriptionMediaPlayer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwgb;", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lwgb;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes3.dex */
final class FileDescriptionMediaPlayer$disposable$1 extends ej5 implements Function1<wgb<Long>, Unit> {
    final /* synthetic */ FileDescriptionMediaPlayer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileDescriptionMediaPlayer$disposable$1(FileDescriptionMediaPlayer fileDescriptionMediaPlayer) {
        super(1);
        this.this$0 = fileDescriptionMediaPlayer;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(wgb<Long> wgbVar) {
        invoke2(wgbVar);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(wgb<Long> wgbVar) {
        this.this$0.getUpdateProcessor().d(Boolean.TRUE);
    }
}
