package com.dodopizza.auth.features.legaldocuments.presentation;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import com.dodopizza.auth.features.legaldocuments.presentation.LegalDocumentLinkViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: LegalDocumentLinkViewHolder.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/dodopizza/auth/features/legaldocuments/presentation/LegalDocumentLinkViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "Landroidx/appcompat/widget/AppCompatTextView;", "textView$delegate", "Lk79;", "getTextView", "()Landroidx/appcompat/widget/AppCompatTextView;", "textView", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "a", "auth_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LegalDocumentLinkViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(LegalDocumentLinkViewHolder.class, "textView", "getTextView()Landroidx/appcompat/widget/AppCompatTextView;", 0))};
    private final k79 textView$delegate;

    /* compiled from: LegalDocumentLinkViewHolder.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/dodopizza/auth/features/legaldocuments/presentation/LegalDocumentLinkViewHolder$a;", "Loyb;", "Lcom/dodopizza/auth/features/legaldocuments/presentation/LegalDocumentLinkViewHolder;", "Ljq5;", "view", "data", "", "position", "", "g", "Lkotlin/Function1;", "a", "Lkotlin/jvm/functions/Function1;", "getListener", "()Lkotlin/jvm/functions/Function1;", "listener", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "auth_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class a extends oyb<LegalDocumentLinkViewHolder, jq5> {
        private final Function1<jq5, Unit> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super jq5, Unit> function1) {
            z65.h(function1, "listener");
            this.a = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h(a aVar, jq5 jq5Var, View view) {
            z65.h(aVar, "this$0");
            z65.h(jq5Var, "$data");
            aVar.a.invoke(jq5Var);
        }

        @Override // defpackage.oyb
        /* renamed from: g */
        public void b(LegalDocumentLinkViewHolder legalDocumentLinkViewHolder, final jq5 jq5Var, int i) {
            String a;
            z65.h(legalDocumentLinkViewHolder, "view");
            z65.h(jq5Var, "data");
            AppCompatTextView textView = legalDocumentLinkViewHolder.getTextView();
            if (z65.c(jq5Var.a(), "personal_data_title")) {
                a = legalDocumentLinkViewHolder.getTextView().getContext().getString(e19.personal_data_policy);
            } else {
                a = jq5Var.a();
            }
            textView.setText(a);
            legalDocumentLinkViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: no5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LegalDocumentLinkViewHolder.a.h(LegalDocumentLinkViewHolder.a.this, jq5Var, view);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegalDocumentLinkViewHolder(kzb kzbVar) {
        super(kzbVar, tz8.legal_document_viewholder);
        z65.h(kzbVar, "viewInflater");
        this.textView$delegate = kb0.g(this, wx8.legal_documents_link_text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatTextView getTextView() {
        return (AppCompatTextView) this.textView$delegate.a(this, $$delegatedProperties[0]);
    }
}
