package defpackage;

import com.dodopizza.order.feature.assistant.mood.presentation.AssistantMoodViewHolder;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: AssistantMoodBinder.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0010B\u001b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J.\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lku;", "Loyb;", "Lcom/dodopizza/order/feature/assistant/mood/presentation/AssistantMoodViewHolder;", "Lsu;", "view", "data", "", "position", "", Image.TYPE_HIGH, "", "", "changes", "g", "Lkotlin/Function1;", "Lju;", "a", "Lkotlin/jvm/functions/Function1;", "onMoodSelected", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ku  reason: default package */
/* loaded from: classes2.dex */
public final class ku extends oyb<AssistantMoodViewHolder, su> {
    private final Function1<ju, Unit> a;

    /* compiled from: AssistantMoodBinder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lku$a;", "", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ku$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public static final a a = new a();

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AssistantMoodBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ku$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ su b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(su suVar) {
            super(0);
            this.b = suVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ku.this.a.invoke(this.b.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ku(Function1<? super ju, Unit> function1) {
        z65.h(function1, "onMoodSelected");
        this.a = function1;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void a(AssistantMoodViewHolder assistantMoodViewHolder, su suVar, int i, List<? extends Object> list) {
        z65.h(assistantMoodViewHolder, "view");
        z65.h(suVar, "data");
        z65.h(list, "changes");
        if (list.contains(a.a)) {
            assistantMoodViewHolder.setSelected(suVar.b());
        }
    }

    @Override // defpackage.oyb
    /* renamed from: h */
    public void b(AssistantMoodViewHolder assistantMoodViewHolder, su suVar, int i) {
        z65.h(assistantMoodViewHolder, "view");
        z65.h(suVar, "data");
        assistantMoodViewHolder.setName(suVar.a().getName());
        assistantMoodViewHolder.setSelected(suVar.b());
        assistantMoodViewHolder.setOnSelectedListener(new b(suVar));
    }
}
