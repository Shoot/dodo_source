package im.threads.ui.activities;

import im.threads.databinding.EccActivityConsultPageBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: ConsultActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lim/threads/databinding/EccActivityConsultPageBinding;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ConsultActivity$binding$2 extends ej5 implements Function0<EccActivityConsultPageBinding> {
    final /* synthetic */ ConsultActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConsultActivity$binding$2(ConsultActivity consultActivity) {
        super(0);
        this.this$0 = consultActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final EccActivityConsultPageBinding invoke() {
        EccActivityConsultPageBinding inflate = EccActivityConsultPageBinding.inflate(this.this$0.getLayoutInflater());
        z65.g(inflate, "inflate(layoutInflater)");
        return inflate;
    }
}
