package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.persistence.entity.CacheTimestampEntity;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: CacheTimestampRepositoryImpl.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"Lwl0;", "Lul0;", "Lbk1;", "Ltl0;", "Lcom/dodopizza/persistence/entity/CacheTimestampEntity;", "", Action.KEY_ATTRIBUTE, Image.TYPE_MEDIUM, "", "l", "Ljk2;", "daoFactory", "<init>", "(Ljk2;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wl0  reason: default package */
/* loaded from: classes4.dex */
public final class wl0 extends bk1<tl0, CacheTimestampEntity> implements ul0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl0(jk2 jk2Var) {
        super(jk2Var, bc9.b(CacheTimestampEntity.class), vl0.a);
        z65.h(jk2Var, "daoFactory");
    }

    @Override // defpackage.ul0
    public void l(String str) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        B(str);
    }

    @Override // defpackage.ul0
    public tl0 m(String str) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        return w(str);
    }

    @Override // defpackage.ul0
    public /* bridge */ /* synthetic */ tl0 o(tl0 tl0Var) {
        return C(tl0Var);
    }
}
