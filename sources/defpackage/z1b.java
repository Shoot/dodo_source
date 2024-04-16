package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: SuggestionBinder.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u001a\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0002J \u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lz1b;", "Loyb;", "Loz2;", "Le2b;", "view", "", "subTitle", "", "i", "distance", Image.TYPE_HIGH, "data", "", "position", "g", "", "a", "Z", "hasDistance", "Lf2b;", "b", "Lf2b;", "suggestionsClickListener", "<init>", "(ZLf2b;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: z1b  reason: default package */
/* loaded from: classes2.dex */
public final class z1b extends oyb<oz2, e2b> {
    private final boolean a;
    private final f2b b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SuggestionBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z1b$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ e2b b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e2b e2bVar, int i) {
            super(0);
            this.b = e2bVar;
            this.c = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            z1b.this.b.a(this.b, this.c);
        }
    }

    public z1b(boolean z, f2b f2bVar) {
        z65.h(f2bVar, "suggestionsClickListener");
        this.a = z;
        this.b = f2bVar;
    }

    private final void h(oz2 oz2Var, String str) {
        if (this.a && str != null) {
            oz2Var.setDistanceToUser(str);
            oz2Var.setDistanceToUserVisibility(true);
            return;
        }
        oz2Var.setDistanceToUserVisibility(false);
    }

    private final void i(oz2 oz2Var, String str) {
        if (str == null) {
            oz2Var.hideSubtitle();
            return;
        }
        oz2Var.setSubtitle(str);
        oz2Var.showSubtitle();
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void b(oz2 oz2Var, e2b e2bVar, int i) {
        z65.h(oz2Var, "view");
        z65.h(e2bVar, "data");
        oz2Var.setOnClickListener(new a(e2bVar, i));
        oz2Var.setAddress(e2bVar.c());
        i(oz2Var, e2bVar.d());
        h(oz2Var, e2bVar.b());
    }
}
