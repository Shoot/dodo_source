package defpackage;

import android.net.Uri;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import kotlin.Metadata;
/* compiled from: SberPayFinishDeepLinkBuilderImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lxt9;", "Lwt9;", "", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: xt9  reason: default package */
/* loaded from: classes3.dex */
public final class xt9 implements wt9 {
    @Override // defpackage.wt9
    public String a(String str) {
        z65.h(str, UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID);
        String builder = new Uri.Builder().scheme("dodo").authority("payment-success").appendQueryParameter("workflow", str).toString();
        z65.g(builder, "toString(...)");
        return builder;
    }
}
