package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.yi3;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: Dao.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H&J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH&J(\u0010\u0013\u001a\u00020\n2\u001e\u0010\u0012\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u0010H&J\b\u0010\u0014\u001a\u00020\nH&J\u0019\u0010\u0015\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H&J.\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00172\u001e\u0010\u0012\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u0010H&J1\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u001e\u0010\u0012\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u0010H&¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010!\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u001c2\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00028\u00010\u001dH&¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lgk2;", "Lyi3;", "T", "", "entity", Image.TYPE_HIGH, "(Lyi3;)Lyi3;", "", "entities", "save", "", "g", "(Lyi3;)V", "", "id", c.a, "Lkotlin/Function1;", "Lvu8;", "queryBuilder", "i", e.a, "a", "(Ljava/lang/String;)Lyi3;", "", "b", "j", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/jvm/functions/Function1;)Lyi3;", "E", "Lkotlin/Function2;", "Lzl2;", "Lcj3;", "action", "f", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "persistence_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: gk2  reason: default package */
/* loaded from: classes2.dex */
public interface gk2<T extends yi3> {
    T a(String str) throws Error;

    List<T> b() throws Error;

    void c(String str) throws Error;

    T d(Function1<? super vu8<T>, ? extends vu8<T>> function1) throws Error;

    void e() throws Error;

    <E> E f(Function2<? super zl2, ? super cj3, ? extends E> function2) throws Error;

    void g(T t) throws Error;

    T h(T t) throws Error;

    void i(Function1<? super vu8<T>, ? extends vu8<T>> function1) throws Error;

    List<T> j(Function1<? super vu8<T>, ? extends vu8<T>> function1) throws Error;

    Collection<T> save(Collection<? extends T> collection) throws Error;
}
