package defpackage;

import com.dodopizza.loyalty.history.adapter.footer.TextFooterViewHolder;
import kotlin.Metadata;
/* compiled from: TextFooterBinder.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lzab;", "Loyb;", "Lcom/dodopizza/loyalty/history/adapter/footer/TextFooterViewHolder;", "Labb;", "view", "data", "", "position", "", "f", "", "a", "Ljava/lang/String;", "footerMessage", "<init>", "(Ljava/lang/String;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zab  reason: default package */
/* loaded from: classes2.dex */
public final class zab extends oyb<TextFooterViewHolder, abb> {
    private final String a;

    public zab(String str) {
        z65.h(str, "footerMessage");
        this.a = str;
    }

    @Override // defpackage.oyb
    /* renamed from: f */
    public void b(TextFooterViewHolder textFooterViewHolder, abb abbVar, int i) {
        z65.h(textFooterViewHolder, "view");
        z65.h(abbVar, "data");
        textFooterViewHolder.setFooterText(this.a);
    }
}
