package defpackage;

import com.dodopizza.core.feature.debugtools.toggles.presentation.adapter.ToggleViewHolder;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.bib;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ToggleBinder.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B!\u0012\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\n\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J \u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016J.\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016R&\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lxhb;", "Loyb;", "Lcom/dodopizza/core/feature/debugtools/toggles/presentation/adapter/ToggleViewHolder;", "Lbib$a;", "", "", "changesKey", "Lkotlin/Function0;", "", "action", "i", "view", "data", "", "position", Image.TYPE_HIGH, "changes", "g", "Lkotlin/Function2;", "Lbq3;", "", "a", "Lkotlin/jvm/functions/Function2;", "onToggleChangedListener", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "b", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: xhb  reason: default package */
/* loaded from: classes.dex */
public final class xhb extends oyb<ToggleViewHolder, bib.a> {
    public static final a b = new a(null);
    private final Function2<bq3, Boolean, Unit> a;

    /* compiled from: ToggleBinder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lxhb$a;", "", "", "UPDATE_IS_ENABLED", "Ljava/lang/String;", "UPDATE_IS_SET_LOCALLY", "<init>", "()V", "core_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xhb$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToggleBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xhb$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ ToggleViewHolder a;
        final /* synthetic */ bib.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ToggleViewHolder toggleViewHolder, bib.a aVar) {
            super(0);
            this.a = toggleViewHolder;
            this.b = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setHighlighted(this.b.d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToggleBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xhb$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function0<Unit> {
        final /* synthetic */ ToggleViewHolder a;
        final /* synthetic */ bib.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ToggleViewHolder toggleViewHolder, bib.a aVar) {
            super(0);
            this.a = toggleViewHolder;
            this.b = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.a.setIsChecked(this.b.c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToggleBinder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isChecked", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: xhb$d */
    /* loaded from: classes.dex */
    public static final class d extends ej5 implements Function1<Boolean, Unit> {
        final /* synthetic */ bib.a b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(bib.a aVar) {
            super(1);
            this.b = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.a;
        }

        public final void invoke(boolean z) {
            xhb.this.a.invoke(this.b.a(), Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xhb(Function2<? super bq3, ? super Boolean, Unit> function2) {
        z65.h(function2, "onToggleChangedListener");
        this.a = function2;
    }

    private final void i(List<? extends Object> list, Object obj, Function0<Unit> function0) {
        if (list.contains(obj)) {
            function0.invoke();
        }
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void a(ToggleViewHolder toggleViewHolder, bib.a aVar, int i, List<? extends Object> list) {
        z65.h(toggleViewHolder, "view");
        z65.h(aVar, "data");
        z65.h(list, "changes");
        i(list, "update_is_set_locally", new b(toggleViewHolder, aVar));
        i(list, "update_is_enabled", new c(toggleViewHolder, aVar));
    }

    @Override // defpackage.oyb
    /* renamed from: h */
    public void b(ToggleViewHolder toggleViewHolder, bib.a aVar, int i) {
        z65.h(toggleViewHolder, "view");
        z65.h(aVar, "data");
        toggleViewHolder.setTitle(aVar.b());
        toggleViewHolder.setIsChecked(aVar.c());
        toggleViewHolder.setOnCheckedChangedListener(new d(aVar));
        toggleViewHolder.setHighlighted(aVar.d());
    }
}
