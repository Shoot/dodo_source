package defpackage;

import com.dodopizza.order.feature.assistant.result.presentation.AssistantGeneratorBaseIngredientViewHolder;
import defpackage.nt;
import kotlin.Metadata;
/* compiled from: AssistantGeneratorBaseIngredientBinder.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lct;", "Loyb;", "Lcom/dodopizza/order/feature/assistant/result/presentation/AssistantGeneratorBaseIngredientViewHolder;", "Lnt$b;", "view", "data", "", "position", "", "f", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ct  reason: default package */
/* loaded from: classes2.dex */
public final class ct extends oyb<AssistantGeneratorBaseIngredientViewHolder, nt.b> {
    @Override // defpackage.oyb
    /* renamed from: f */
    public void b(AssistantGeneratorBaseIngredientViewHolder assistantGeneratorBaseIngredientViewHolder, nt.b bVar, int i) {
        z65.h(assistantGeneratorBaseIngredientViewHolder, "view");
        z65.h(bVar, "data");
        assistantGeneratorBaseIngredientViewHolder.setName(bVar.getName());
        assistantGeneratorBaseIngredientViewHolder.setupBaseIngredients(bVar.b());
        assistantGeneratorBaseIngredientViewHolder.loadImage(bVar.a());
    }
}
