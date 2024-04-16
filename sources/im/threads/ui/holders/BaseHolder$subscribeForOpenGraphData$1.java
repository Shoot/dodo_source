package im.threads.ui.holders;

import im.threads.business.ogParser.OGData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseHolder.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lim/threads/business/ogParser/OGData;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BaseHolder$subscribeForOpenGraphData$1 extends ej5 implements Function1<OGData, Unit> {
    final /* synthetic */ BaseHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseHolder$subscribeForOpenGraphData$1(BaseHolder baseHolder) {
        super(1);
        this.this$0 = baseHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OGData oGData) {
        invoke2(oGData);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(OGData oGData) {
        BaseHolder baseHolder = this.this$0;
        z65.g(oGData, "it");
        baseHolder.onOgDataReceived(oGData);
    }
}
