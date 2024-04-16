package com.dodopizza.order.feature.assistant.result.presentation;

import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.joran.action.Action;
import com.bumptech.glide.b;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AssistantGeneratorBaseIngredientViewHolder.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0014\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0018\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/dodopizza/order/feature/assistant/result/presentation/AssistantGeneratorBaseIngredientViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", RemoteMessageConst.Notification.URL, "", "loadImage", Action.NAME_ATTRIBUTE, "setName", "", "ingredientNames", "setupBaseIngredients", "Landroid/widget/ImageView;", "image$delegate", "Lk79;", "getImage", "()Landroid/widget/ImageView;", ElementGenerator.TYPE_IMAGE, "Landroid/widget/TextView;", "nameView$delegate", "getNameView", "()Landroid/widget/TextView;", "nameView", "baseIngredients$delegate", "getBaseIngredients", "baseIngredients", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AssistantGeneratorBaseIngredientViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(AssistantGeneratorBaseIngredientViewHolder.class, ElementGenerator.TYPE_IMAGE, "getImage()Landroid/widget/ImageView;", 0)), bc9.f(new ar8(AssistantGeneratorBaseIngredientViewHolder.class, "nameView", "getNameView()Landroid/widget/TextView;", 0)), bc9.f(new ar8(AssistantGeneratorBaseIngredientViewHolder.class, "baseIngredients", "getBaseIngredients()Landroid/widget/TextView;", 0))};
    public static final int $stable = 8;
    private final k79 baseIngredients$delegate;
    private final k79 image$delegate;
    private final k79 nameView$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistantGeneratorBaseIngredientViewHolder(kzb kzbVar) {
        super(kzbVar, gz8.item_assistant_base_ingredient);
        z65.h(kzbVar, "viewInflater");
        this.image$delegate = kb0.g(this, gy8.T0);
        this.nameView$delegate = kb0.g(this, gy8.x1);
        this.baseIngredients$delegate = kb0.g(this, gy8.base_ingredients);
        getImage().setClipToOutline(true);
    }

    private final TextView getBaseIngredients() {
        return (TextView) this.baseIngredients$delegate.a(this, $$delegatedProperties[2]);
    }

    private final ImageView getImage() {
        return (ImageView) this.image$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getNameView() {
        return (TextView) this.nameView$delegate.a(this, $$delegatedProperties[1]);
    }

    public final void loadImage(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        b.u(getImage()).t(str).a0(bx8.b).G0(getImage());
    }

    public final void setName(String str) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        getNameView().setText(str);
    }

    public final void setupBaseIngredients(List<String> list) {
        String i0;
        z65.h(list, "ingredientNames");
        un3.k(getBaseIngredients());
        TextView baseIngredients = getBaseIngredients();
        i0 = sc1.i0(list, "\n+ ", "+ ", null, 0, null, null, 60, null);
        baseIngredients.setText(i0);
    }
}
