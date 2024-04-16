package com.dodopizza.order.feature.shoppingcart.adapter.appliedbonusaction;

import android.widget.TextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
/* compiled from: AppliedBonusActionViewHolder.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0010\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/dodopizza/order/feature/shoppingcart/adapter/appliedbonusaction/AppliedBonusActionViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "", "bonusActionTitle", "", "setTitle", "bonusActionDescription", "setDescription", "Landroid/widget/TextView;", "title$delegate", "Lk79;", "getTitle", "()Landroid/widget/TextView;", "title", "description$delegate", "getDescription", "description", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class AppliedBonusActionViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(AppliedBonusActionViewHolder.class, "title", "getTitle()Landroid/widget/TextView;", 0)), bc9.f(new ar8(AppliedBonusActionViewHolder.class, "description", "getDescription()Landroid/widget/TextView;", 0))};
    public static final int $stable = 8;
    private final k79 description$delegate;
    private final k79 title$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppliedBonusActionViewHolder(kzb kzbVar) {
        super(kzbVar, gz8.applied_bonus_action_in_cart_item);
        z65.h(kzbVar, "viewInflater");
        this.title$delegate = kb0.g(this, gy8.S5);
        this.description$delegate = kb0.g(this, gy8.a0);
    }

    private final TextView getDescription() {
        return (TextView) this.description$delegate.a(this, $$delegatedProperties[1]);
    }

    private final TextView getTitle() {
        return (TextView) this.title$delegate.a(this, $$delegatedProperties[0]);
    }

    public final void setDescription(String str) {
        int i;
        boolean z;
        z65.h(str, "bonusActionDescription");
        TextView description = getDescription();
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (z65.j(str.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        description.setText(str.subSequence(i2, length + 1).toString());
    }

    public final void setTitle(String str) {
        int i;
        boolean z;
        z65.h(str, "bonusActionTitle");
        TextView title = getTitle();
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (z65.j(str.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        title.setText(str.subSequence(i2, length + 1).toString());
    }
}
