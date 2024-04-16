package defpackage;

import com.huawei.hms.actions.SearchIntents;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: DatabaseConnection.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH&J&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH&J \u0010\u0011\u001a\u00020\u0010\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH&J\u001a\u0010\u0012\u001a\u00020\u0010\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J@\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\u0014\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u0013H&J\b\u0010\u0017\u001a\u00020\u0016H&J\b\u0010\u0018\u001a\u00020\u0010H&J\b\u0010\u0019\u001a\u00020\u0010H&J\b\u0010\u001a\u001a\u00020\u0010H&¨\u0006\u001b"}, d2 = {"Lzl2;", "", "Lyi3;", "T", "Lcj3;", "entityInformation", "entity", "i", "(Lcj3;Lyi3;)Lyi3;", "", "entities", Image.TYPE_MEDIUM, "Lvu8;", SearchIntents.EXTRA_QUERY, "", "j", "", "l", "k", "Lkotlin/Function1;", "queryBuilder", "n", "", Image.TYPE_HIGH, "beginTransaction", "p", "o", "persistence_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: zl2  reason: default package */
/* loaded from: classes2.dex */
public interface zl2 {
    void beginTransaction();

    boolean h();

    <T extends yi3> T i(cj3 cj3Var, T t);

    <T extends yi3> List<T> j(vu8<T> vu8Var);

    <T extends yi3> void k(cj3 cj3Var);

    <T extends yi3> void l(vu8<T> vu8Var);

    <T extends yi3> Collection<T> m(cj3 cj3Var, Collection<? extends T> collection);

    <T extends yi3> vu8<T> n(cj3 cj3Var, Function1<? super vu8<T>, ? extends vu8<T>> function1);

    void o();

    void p();
}
