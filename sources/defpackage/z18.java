package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.dodopizza.app.presentation.profile.adapter.widgets.PersonalWidgetViewHolder;
/* compiled from: PersonalWidgetBinder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lz18;", "Loyb;", "Lru/dodopizza/app/presentation/profile/adapter/widgets/PersonalWidgetViewHolder;", "La28;", "view", "data", "", "position", "", "g", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "onWidgetClickListener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: z18  reason: default package */
/* loaded from: classes4.dex */
public final class z18 extends oyb<PersonalWidgetViewHolder, a28> {
    private final Function1<a28, Unit> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PersonalWidgetBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: z18$a */
    /* loaded from: classes4.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ a28 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a28 a28Var) {
            super(0);
            this.b = a28Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            z18.this.a.invoke(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z18(Function1<? super a28, Unit> function1) {
        z65.h(function1, "onWidgetClickListener");
        this.a = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.oyb
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(ru.dodopizza.app.presentation.profile.adapter.widgets.PersonalWidgetViewHolder r1, defpackage.a28 r2, int r3) {
        /*
            r0 = this;
            java.lang.String r3 = "view"
            defpackage.z65.h(r1, r3)
            java.lang.String r3 = "data"
            defpackage.z65.h(r2, r3)
            java.lang.String r3 = r2.b()
            if (r3 == 0) goto L1f
            boolean r3 = defpackage.c0b.y(r3)
            if (r3 == 0) goto L17
            goto L1f
        L17:
            java.lang.String r3 = r2.b()
            r1.showBadgeTitle(r3)
            goto L22
        L1f:
            r1.hideBadgeTitle()
        L22:
            java.lang.String r3 = r2.d()
            r1.setTitleText(r3)
            java.lang.String r3 = r2.c()
            boolean r3 = defpackage.c0b.y(r3)
            r3 = r3 ^ 1
            if (r3 == 0) goto L3d
            java.lang.String r3 = r2.c()
            r1.showSubtitleText(r3)
            goto L40
        L3d:
            r1.hideSubtitleText()
        L40:
            z18$a r3 = new z18$a
            r3.<init>(r2)
            r1.setCardClickListener(r3)
            boolean r3 = r2.f()
            if (r3 == 0) goto L55
            r1.showAttractAttentionAction()
            r1 = 0
            r2.g(r1)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z18.b(ru.dodopizza.app.presentation.profile.adapter.widgets.PersonalWidgetViewHolder, a28, int):void");
    }
}
