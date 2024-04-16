package com.dodopizza.activeorder.feature.ordersummary.presentation;

import com.dodopizza.activeorder.feature.ordersummary.presentation.b;
import kotlin.Metadata;
/* compiled from: OrderTrackingPhoneConverter.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/dodopizza/activeorder/feature/ordersummary/presentation/a;", "Lhk7;", "", "managerPhone", "feedbackPhone", "Lcom/dodopizza/activeorder/feature/ordersummary/presentation/b;", "a", "<init>", "()V", "activeorder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a implements hk7 {
    @Override // defpackage.hk7
    public b a(String str, String str2) {
        z65.h(str, "managerPhone");
        z65.h(str2, "feedbackPhone");
        if (str2.length() > 0) {
            return new b(str2, b.a.b);
        }
        if (str.length() > 0) {
            return new b(str, b.a.a);
        }
        return null;
    }
}
