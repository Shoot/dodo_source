package defpackage;

import com.dodopizza.profile.feature.profilelocalelist.presentation.LocaleVH;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LocaleBinder.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u001b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J.\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Ljs5;", "Loyb;", "Lcom/dodopizza/profile/feature/profilelocalelist/presentation/LocaleVH;", "Lct5;", "view", "data", "", "position", "", Image.TYPE_HIGH, "", "", "changes", "g", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "onClick", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "b", "profile_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: js5  reason: default package */
/* loaded from: classes2.dex */
public final class js5 extends oyb<LocaleVH, ct5> {
    public static final a b = new a(null);
    private final Function1<ct5, Unit> a;

    /* compiled from: LocaleBinder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ljs5$a;", "", "", "CHECKED_CHANGED", "Ljava/lang/String;", "<init>", "()V", "profile_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: js5$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocaleBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: js5$b */
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function0<Unit> {
        final /* synthetic */ ct5 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ct5 ct5Var) {
            super(0);
            this.b = ct5Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            js5.this.a.invoke(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public js5(Function1<? super ct5, Unit> function1) {
        z65.h(function1, "onClick");
        this.a = function1;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void a(LocaleVH localeVH, ct5 ct5Var, int i, List<? extends Object> list) {
        z65.h(localeVH, "view");
        z65.h(ct5Var, "data");
        z65.h(list, "changes");
        super.a(localeVH, ct5Var, i, list);
        b(localeVH, ct5Var, i);
    }

    @Override // defpackage.oyb
    /* renamed from: h */
    public void b(LocaleVH localeVH, ct5 ct5Var, int i) {
        z65.h(localeVH, "view");
        z65.h(ct5Var, "data");
        localeVH.setName(ct5Var.b());
        localeVH.setNameCurrentLanguage(ct5Var.c());
        localeVH.showNameCurrentLanguage(ct5Var.d());
        localeVH.setCheckMarkVisibility(ct5Var.e());
        localeVH.setOnClickListener(new b(ct5Var));
    }
}
