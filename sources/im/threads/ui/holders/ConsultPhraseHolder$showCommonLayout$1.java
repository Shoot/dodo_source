package im.threads.ui.holders;

import android.widget.TextView;
import im.threads.business.models.FileDescription;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ConsultPhraseHolder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "fileName", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConsultPhraseHolder$showCommonLayout$1 extends ej5 implements Function1<String, Unit> {
    final /* synthetic */ FileDescription $fileDescription;
    final /* synthetic */ ConsultPhraseHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsultPhraseHolder$showCommonLayout$1(ConsultPhraseHolder consultPhraseHolder, FileDescription fileDescription) {
        super(1);
        this.this$0 = consultPhraseHolder;
        this.$fileDescription = fileDescription;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        TextView textView;
        textView = this.this$0.rightTextDescription;
        textView.setText(this.this$0.getFileDescriptionText(str, this.$fileDescription));
    }
}
