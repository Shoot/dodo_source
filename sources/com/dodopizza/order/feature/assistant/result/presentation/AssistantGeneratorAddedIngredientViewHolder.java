package com.dodopizza.order.feature.assistant.result.presentation;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: AssistantGeneratorAddedIngredientViewHolder.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/dodopizza/order/feature/assistant/result/presentation/AssistantGeneratorAddedIngredientViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", RemoteMessageConst.Notification.URL, "", "loadImage", Action.NAME_ATTRIBUTE, "setName", "Lkotlin/Function0;", "onClick", "setRemoveButtonClickListener", "Landroid/widget/ImageView;", "image$delegate", "Lk79;", "getImage", "()Landroid/widget/ImageView;", ElementGenerator.TYPE_IMAGE, "Landroid/widget/TextView;", "nameView$delegate", "getNameView", "()Landroid/widget/TextView;", "nameView", "removeButton$delegate", "getRemoveButton", "removeButton", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AssistantGeneratorAddedIngredientViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(AssistantGeneratorAddedIngredientViewHolder.class, ElementGenerator.TYPE_IMAGE, "getImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(AssistantGeneratorAddedIngredientViewHolder.class, "nameView", "getNameView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(AssistantGeneratorAddedIngredientViewHolder.class, "removeButton", "getRemoveButton()Landroid/widget/ImageView;", 0))};
    public static final int $stable = 8;
    private final k79 image$delegate;
    private final k79 nameView$delegate;
    private final k79 removeButton$delegate;

    /* compiled from: AssistantGeneratorAddedIngredientViewHolder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function0<Unit> {
        public static final a a = new a();

        a() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AssistantGeneratorAddedIngredientViewHolder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class b extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function0<Unit> function0) {
            super(1);
            this.a = function0;
        }

        public final void a(View view) {
            z65.h(view, "it");
            this.a.invoke();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            a(view);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantGeneratorAddedIngredientViewHolder(kzb kzbVar) {
        super(kzbVar, gz8.item_assistant_added_ingredient);
        z65.h(kzbVar, "viewInflater");
        this.image$delegate = kb0.g(this, gy8.T0);
        this.nameView$delegate = kb0.g(this, gy8.x1);
        this.removeButton$delegate = kb0.g(this, gy8.B3);
        getImage().setClipToOutline(true);
    }

    private final ImageView getImage() {
        return (ImageView) this.image$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getNameView() {
        return (TextView) this.nameView$delegate.a(this, $$delegatedProperties[1]);
    }

    private final ImageView getRemoveButton() {
        return (ImageView) this.removeButton$delegate.a(this, $$delegatedProperties[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setRemoveButtonClickListener$default(AssistantGeneratorAddedIngredientViewHolder assistantGeneratorAddedIngredientViewHolder, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = a.a;
        }
        assistantGeneratorAddedIngredientViewHolder.setRemoveButtonClickListener(function0);
    }

    public final void loadImage(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        com.bumptech.glide.b.u(getImage()).t(str).a0(bx8.b).G0(getImage());
    }

    public final void setName(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        getNameView().setText(str);
    }

    public final void setRemoveButtonClickListener(Function0<Unit> function0) {
        z65.h(function0, "onClick");
        oma.a(getRemoveButton(), new b(function0));
    }
}
