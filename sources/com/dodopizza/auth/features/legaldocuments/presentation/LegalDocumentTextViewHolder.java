package com.dodopizza.auth.features.legaldocuments.presentation;

import androidx.appcompat.widget.AppCompatTextView;
import com.dodopizza.android.recyclerview.adapter.SelfInflatingViewHolder;
import kotlin.Metadata;
/* compiled from: LegalDocumentTextViewHolder.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/dodopizza/auth/features/legaldocuments/presentation/LegalDocumentTextViewHolder;", "Lcom/dodopizza/android/recyclerview/adapter/SelfInflatingViewHolder;", "Landroidx/appcompat/widget/AppCompatTextView;", "textView$delegate", "Lk79;", "getTextView", "()Landroidx/appcompat/widget/AppCompatTextView;", "textView", "Lkzb;", "viewInflater", "<init>", "(Lkzb;)V", "a", "auth_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LegalDocumentTextViewHolder extends SelfInflatingViewHolder {
    static final /* synthetic */ je5<Object>[] $$delegatedProperties = {bc9.f(new ar8(LegalDocumentTextViewHolder.class, "textView", "getTextView()Landroidx/appcompat/widget/AppCompatTextView;", 0))};
    private final k79 textView$delegate;

    /* compiled from: LegalDocumentTextViewHolder.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/dodopizza/auth/features/legaldocuments/presentation/LegalDocumentTextViewHolder$a;", "Loyb;", "Lcom/dodopizza/auth/features/legaldocuments/presentation/LegalDocumentTextViewHolder;", "Ldcb;", "view", "data", "", "position", "", "f", "<init>", "()V", "auth_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class a extends oyb<LegalDocumentTextViewHolder, dcb> {
        @Override // defpackage.oyb
        /* renamed from: f */
        public void b(LegalDocumentTextViewHolder legalDocumentTextViewHolder, dcb dcbVar, int i) {
            z65.h(legalDocumentTextViewHolder, "view");
            z65.h(dcbVar, "data");
            legalDocumentTextViewHolder.getTextView().setText(dcbVar.a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegalDocumentTextViewHolder(kzb kzbVar) {
        super(kzbVar, tz8.legal_document_text_viewholder);
        z65.h(kzbVar, "viewInflater");
        this.textView$delegate = kb0.g(this, wx8.legal_documents_text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCompatTextView getTextView() {
        return (AppCompatTextView) this.textView$delegate.a(this, $$delegatedProperties[0]);
    }
}
