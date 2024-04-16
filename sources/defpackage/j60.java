package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: ModifierLocalModifierNode.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\n¢\u0006\u0004\b\u0011\u0010\u000fJ&\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0090\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0090\u0002¢\u0006\u0004\b\b\u0010\tR&\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lj60;", "Lym6;", "T", "Lum6;", Action.KEY_ATTRIBUTE, "b", "(Lum6;)Ljava/lang/Object;", "", "a", "(Lum6;)Z", "Lcn6;", "Lcn6;", "getElement", "()Lcn6;", c.a, "(Lcn6;)V", "element", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: j60  reason: default package */
/* loaded from: classes.dex */
public final class j60 extends ym6 {
    private cn6<?> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j60(cn6<?> cn6Var) {
        super(null);
        z65.h(cn6Var, "element");
        this.a = cn6Var;
    }

    @Override // defpackage.ym6
    public boolean a(um6<?> um6Var) {
        z65.h(um6Var, Action.KEY_ATTRIBUTE);
        if (um6Var == this.a.getKey()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ym6
    public <T> T b(um6<T> um6Var) {
        z65.h(um6Var, Action.KEY_ATTRIBUTE);
        if (um6Var == this.a.getKey()) {
            return (T) this.a.getValue();
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void c(cn6<?> cn6Var) {
        z65.h(cn6Var, "<set-?>");
        this.a = cn6Var;
    }
}
