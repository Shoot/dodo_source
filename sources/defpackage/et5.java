package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: LocalityBinder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J.\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Let5;", "Loyb;", "Llv5;", "Lmv5;", "view", "data", "", "position", "", Image.TYPE_HIGH, "", "", "changes", "g", "Lgt5;", "a", "Lgt5;", "localityClickListener", "<init>", "(Lgt5;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: et5  reason: default package */
/* loaded from: classes4.dex */
public final class et5 extends oyb<lv5, mv5> {
    private final gt5 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalityBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: et5$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ mv5 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(mv5 mv5Var) {
            super(0);
            this.b = mv5Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            et5.this.a.a(this.b);
        }
    }

    public et5(gt5 gt5Var) {
        z65.h(gt5Var, "localityClickListener");
        this.a = gt5Var;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void a(lv5 lv5Var, mv5 mv5Var, int i, List<? extends Object> list) {
        z65.h(lv5Var, "view");
        z65.h(mv5Var, "data");
        z65.h(list, "changes");
        if (list.contains("selection_changed")) {
            lv5Var.setSelected(mv5Var.i());
        }
    }

    @Override // defpackage.oyb
    /* renamed from: h */
    public void b(lv5 lv5Var, mv5 mv5Var, int i) {
        z65.h(lv5Var, "view");
        z65.h(mv5Var, "data");
        lv5Var.setOnClickListener(new a(mv5Var));
        lv5Var.setLocalityName(mv5Var.e());
        lv5Var.setSelected(mv5Var.i());
        lv5Var.setChecked(mv5Var.g());
        lv5Var.setLastTop(mv5Var.h());
    }
}
