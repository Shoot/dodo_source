package defpackage;

import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.presentation.profile.adapter.widgets.LoyaltyWidgetViewHolder;
/* compiled from: LoyaltyWidgetBinder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J.\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lb36;", "Loyb;", "Lru/dodopizza/app/presentation/profile/adapter/widgets/LoyaltyWidgetViewHolder;", "Lc36;", "view", "data", "", "position", "", Image.TYPE_HIGH, "", "", "changes", "g", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "onWidgetClickListener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: b36  reason: default package */
/* loaded from: classes4.dex */
public final class b36 extends oyb<LoyaltyWidgetViewHolder, c36> {
    private final Function1<c36, Unit> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyWidgetBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b36$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ c36 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c36 c36Var) {
            super(0);
            this.b = c36Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            b36.this.a.invoke(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b36(Function1<? super c36, Unit> function1) {
        z65.h(function1, "onWidgetClickListener");
        this.a = function1;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void a(LoyaltyWidgetViewHolder loyaltyWidgetViewHolder, c36 c36Var, int i, List<? extends Object> list) {
        z65.h(loyaltyWidgetViewHolder, "view");
        z65.h(c36Var, "data");
        z65.h(list, "changes");
        super.a(loyaltyWidgetViewHolder, c36Var, i, list);
        b(loyaltyWidgetViewHolder, c36Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    @Override // defpackage.oyb
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(ru.dodopizza.app.presentation.profile.adapter.widgets.LoyaltyWidgetViewHolder r1, defpackage.c36 r2, int r3) {
        /*
            r0 = this;
            java.lang.String r3 = "view"
            defpackage.z65.h(r1, r3)
            java.lang.String r3 = "data"
            defpackage.z65.h(r2, r3)
            boolean r3 = r2.g()
            if (r3 == 0) goto L14
            r1.showAttentionIcon()
            goto L17
        L14:
            r1.hideAttentionIcon()
        L17:
            java.lang.String r3 = r2.e()
            r1.setTitleText(r3)
            java.lang.String r3 = r2.b()
            boolean r3 = defpackage.c0b.y(r3)
            r3 = r3 ^ 1
            if (r3 == 0) goto L32
            java.lang.String r3 = r2.b()
            r1.showBalanceTitle(r3)
            goto L35
        L32:
            r1.hideBalanceTitle()
        L35:
            java.lang.String r3 = r2.d()
            if (r3 == 0) goto L4a
            boolean r3 = defpackage.c0b.y(r3)
            if (r3 == 0) goto L42
            goto L4a
        L42:
            java.lang.String r3 = r2.d()
            r1.showSubtitle(r3)
            goto L4d
        L4a:
            r1.hideSubtitle()
        L4d:
            java.util.List r3 = r2.c()
            if (r3 == 0) goto L5b
            java.util.List r3 = r2.c()
            r1.showParallaxIcon(r3)
            goto L5e
        L5b:
            r1.hideParallaxIcon()
        L5e:
            b36$a r3 = new b36$a
            r3.<init>(r2)
            r1.setCardClickListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b36.b(ru.dodopizza.app.presentation.profile.adapter.widgets.LoyaltyWidgetViewHolder, c36, int):void");
    }
}
