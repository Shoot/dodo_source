package im.threads.ui.holders;

import android.widget.TextView;
import im.threads.business.models.FileDescription;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "fileName", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BaseHolder$showQuote$1 extends ej5 implements Function1<String, Unit> {
    final /* synthetic */ FileDescription $quoteFileDescription;
    final /* synthetic */ TextView $quoteTextDescription;
    final /* synthetic */ BaseHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseHolder$showQuote$1(TextView textView, BaseHolder baseHolder, FileDescription fileDescription) {
        super(1);
        this.$quoteTextDescription = textView;
        this.this$0 = baseHolder;
        this.$quoteFileDescription = fileDescription;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        this.$quoteTextDescription.setText(this.this$0.getFileDescriptionText(str, this.$quoteFileDescription));
    }
}
