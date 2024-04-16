package com.dodopizza.profile.feature.profilelocalelist.presentation;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: LocaleVH.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0007R\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u001b¨\u0006!"}, d2 = {"Lcom/dodopizza/profile/feature/profilelocalelist/presentation/LocaleVH;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "text", "", "setName", "setNameCurrentLanguage", "", "show", "showNameCurrentLanguage", "Lkotlin/Function0;", "listener", "setOnClickListener", "isVisible", "setCheckMarkVisibility", "Landroid/widget/TextView;", "name$delegate", "Lk79;", "getName", "()Landroid/widget/TextView;", Action.NAME_ATTRIBUTE, "nameCurrentLanguage$delegate", "getNameCurrentLanguage", "nameCurrentLanguage", "Landroid/widget/ImageView;", "checkMark$delegate", "getCheckMark", "()Landroid/widget/ImageView;", "checkMark", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class LocaleVH extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(LocaleVH.class, Action.NAME_ATTRIBUTE, "getName()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LocaleVH.class, "nameCurrentLanguage", "getNameCurrentLanguage()Landroid/widget/TextView;", 0)), bc9.f(new ar8(LocaleVH.class, "checkMark", "getCheckMark()Landroid/widget/ImageView;", 0))};
    private final k79 checkMark$delegate;
    private final k79 name$delegate;
    private final k79 nameCurrentLanguage$delegate;

    /* compiled from: LocaleVH.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function1<View, Unit> {
        final /* synthetic */ Function0<Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0) {
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
    public LocaleVH(kzb kzbVar) {
        super(kzbVar, iz8.item_profile_locale_list);
        z65.h(kzbVar, "viewInflater");
        this.name$delegate = kb0.g(this, iy8.item_profile_locale_list_name);
        this.nameCurrentLanguage$delegate = kb0.g(this, iy8.item_profile_locale_list_name_current_language);
        this.checkMark$delegate = kb0.g(this, iy8.item_profile_locale_list_check_mark);
    }

    private final ImageView getCheckMark() {
        return (ImageView) this.checkMark$delegate.a(this, $$delegatedProperties[2]);
    }

    private final TextView getName() {
        return (TextView) this.name$delegate.a(this, $$delegatedProperties[0]);
    }

    private final TextView getNameCurrentLanguage() {
        return (TextView) this.nameCurrentLanguage$delegate.a(this, $$delegatedProperties[1]);
    }

    public final void setCheckMarkVisibility(boolean z) {
        int i;
        ImageView checkMark = getCheckMark();
        if (!z) {
            i = 8;
        } else {
            i = 0;
        }
        checkMark.setVisibility(i);
    }

    public final void setName(String str) {
        z65.h(str, "text");
        getName().setText(str);
    }

    public final void setNameCurrentLanguage(String str) {
        z65.h(str, "text");
        getNameCurrentLanguage().setText(str);
    }

    public final void setOnClickListener(Function0<Unit> function0) {
        z65.h(function0, "listener");
        View view = this.itemView;
        z65.g(view, "itemView");
        oma.a(view, new a(function0));
    }

    public final void showNameCurrentLanguage(boolean z) {
        un3.o(getNameCurrentLanguage(), z);
    }
}
