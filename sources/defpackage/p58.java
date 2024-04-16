package defpackage;

import com.dodopizza.controlling.feature.feedbackphotos.presentation.PhotoPreviewViewHolder;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
/* compiled from: PhotoPreviewBinder.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J.\u0010\r\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016R&\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lp58;", "Loyb;", "Lcom/dodopizza/controlling/feature/feedbackphotos/presentation/PhotoPreviewViewHolder;", "Lq58;", "view", "data", "", "position", "", Image.TYPE_HIGH, "", "", "changes", "g", "Lkotlin/Function2;", "", "", "a", "Lkotlin/jvm/functions/Function2;", "listener", "<init>", "(Lkotlin/jvm/functions/Function2;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: p58  reason: default package */
/* loaded from: classes.dex */
public final class p58 extends oyb<PhotoPreviewViewHolder, q58> {
    private final Function2<String, Boolean, Unit> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PhotoPreviewBinder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: p58$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function0<Unit> {
        final /* synthetic */ q58 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q58 q58Var) {
            super(0);
            this.b = q58Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            p58.this.a.invoke(this.b.b(), Boolean.valueOf(this.b.a()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p58(Function2<? super String, ? super Boolean, Unit> function2) {
        z65.h(function2, "listener");
        this.a = function2;
    }

    @Override // defpackage.oyb
    /* renamed from: g */
    public void a(PhotoPreviewViewHolder photoPreviewViewHolder, q58 q58Var, int i, List<? extends Object> list) {
        z65.h(photoPreviewViewHolder, "view");
        z65.h(q58Var, "data");
        z65.h(list, "changes");
        if (list.contains("change_count")) {
            photoPreviewViewHolder.changeLoadingProgress(q58Var.d());
        }
        if (list.contains("change_upload_failure")) {
            if (q58Var.a()) {
                photoPreviewViewHolder.showError();
            } else {
                photoPreviewViewHolder.hideError();
            }
        }
    }

    @Override // defpackage.oyb
    /* renamed from: h */
    public void b(PhotoPreviewViewHolder photoPreviewViewHolder, q58 q58Var, int i) {
        z65.h(photoPreviewViewHolder, "view");
        z65.h(q58Var, "data");
        photoPreviewViewHolder.showImage(q58Var.b());
        photoPreviewViewHolder.changeLoadingProgress(q58Var.d());
        photoPreviewViewHolder.setOnClickListener(new a(q58Var));
        if (q58Var.a()) {
            photoPreviewViewHolder.showError();
        } else {
            photoPreviewViewHolder.hideError();
        }
    }
}
